package com.unseen.nb.common.world.bastion;

import com.google.common.collect.Lists;
import com.unseen.nb.config.ModConfig;
import com.unseen.nb.config.NBWorldConfig;
import com.unseen.nb.util.NBLogger;
import com.unseen.nb.util.integration.ModIntegration;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureStart;
import net.minecraftforge.common.BiomeDictionary;

import java.util.List;
import java.util.Random;

public class WorldGenBastion extends WorldGenerator {
    private int spacing;
    private int separation;

    public WorldGenBastion() {
    this.spacing = NBWorldConfig.bastionFrequency;
    this.separation = 16;
    }



    @Override
    public boolean generate(World world, Random random, BlockPos pos) {
        /**
         * MAKE THIS CONFIGURABLE, SPACING IS THE AMOUNT OF EACH TIME IT IS CAPAPABLE OF GENERATING
         */

        if(canSpawnStructureAtPos(world, pos.getX() >> 4, pos.getZ() >> 4)) {
            getStructureStart(world, pos.getX() >> 4, pos.getZ() >> 4, random)
                    .generateStructure(world, random, new StructureBoundingBox(pos.getX() - 150, pos.getZ() - 150, pos.getX() + 150, pos.getZ() + 150));
            return true;
        }

        return false;
    }

    protected boolean canSpawnStructureAtPos(World world, int chunkX, int chunkZ) {
        int i = chunkX;
        int j = chunkZ;

        if (chunkX < 0)
        {
            chunkX -= this.spacing - 1;
        }

        if (chunkZ < 0)
        {
            chunkZ -= this.spacing - 1;
        }

        int k = chunkX / this.spacing;
        int l = chunkZ / this.spacing;
        Random random =  world.setRandomSeed(k, l, 10394726);
        k = k * this.spacing;
        l = l * this.spacing;
        k = k + (random.nextInt(this.spacing - this.separation) + random.nextInt(this.spacing - this.separation)) / 2;
        l = l + (random.nextInt(this.spacing - this.separation) + random.nextInt(this.spacing - this.separation)) / 2;

        if (i == k && j == l)
        {
            BlockPos pos = new BlockPos(i << 4, 0, j << 4);
            return isAbleToSpawnHere(pos, world);
        } else {

            return false;
        }

    }

    public static boolean isAbleToSpawnHere(BlockPos pos, World world) {
        for(BiomeDictionary.Type types : getSpawnBiomeTypes()) {
            Biome biomeCurrently = world.provider.getBiomeForCoords(pos);
            if(BiomeDictionary.hasType(biomeCurrently, types)) {
                return false;
            }
        }
        return true;
    }

    private static List<BiomeDictionary.Type> bastionBiomeTypes;

    public static List<BiomeDictionary.Type> getSpawnBiomeTypes() {
        if(bastionBiomeTypes == null) {
            bastionBiomeTypes = Lists.newArrayList();

            for(String str : NBWorldConfig.biome_types_blacklist_bastion) {
                try {
                    BiomeDictionary.Type type = BiomeDictionary.Type.getType(str);

                    if (type != null) bastionBiomeTypes.add(type);
                    else NBLogger.logError("Biome Type" + str + " is not correct", new NullPointerException());
                } catch (Exception e) {
                    NBLogger.logError(str + " is not a valid type name", e);
                }
            }
        }

        return bastionBiomeTypes;
    }


    protected StructureStart getStructureStart(World world, int chunkX, int chunkZ, Random rand) {
        return new WorldGenBastion.Start(world, rand , chunkX, chunkZ);
    }


    public static class Start extends StructureStart {

        public Start() {

        }

        public Start(World worldIn, Random rand, int chunkX, int chunkZ) {
            super(chunkX, chunkZ);
            this.createChambers(worldIn, rand, chunkX, chunkZ);
        }


        protected void createChambers(World world, Random rand, int chunkX, int chunkZ) {
            Random random = new Random(chunkX + chunkZ * 10394726L);
            int rand2 = random.nextInt(Rotation.values().length);
            BlockPos posI = new BlockPos(chunkX * 16 + 8, 0, chunkZ * 16 + 8);

            //You can add more additional parameters or second checks to things before it starts the physical structure
            for(int i = 0; i < 4; i++) {
                Rotation rotation = Rotation.values()[(rand2 + i) % Rotation.values().length];
                components.clear();
                //Set IAW with the best Position to spawn the first layer of the chambers at
                BlockPos blockpos = posI.add(0, NBWorldConfig.bastionYLevel, 0);
                if(ModIntegration.FUTURE_MC_LOADED) {
                    BastionRemnantsFMC bastion = new BastionRemnantsFMC(world, world.getSaveHandler().getStructureTemplateManager(), components);
                    //Starts the first room within the Trial Chambers
                    bastion.startBastion(blockpos, rotation);
                } else {
                    BastionRemnants bastion = new BastionRemnants(world, world.getSaveHandler().getStructureTemplateManager(), components);
                    //Starts the first room within the Trial Chambers
                    bastion.startBastion(blockpos, rotation);
                }
                this.updateBoundingBox();

                if (this.isSizeableStructure()) {

                    break;
                }
            }
        }


        @Override
        public void generateStructure(World worldIn, Random rand, StructureBoundingBox structurebb)
        {
            super.generateStructure(worldIn, rand, structurebb);
        }

        //Here is where you specify the size of the structure in terms of rooms, I guess you could make this configurable if you want
        @Override
        public boolean isSizeableStructure() {
            return components.size() > 2;
        }
    }
}
