package com.unseen.nb.init;

import com.unseen.nb.util.integration.ModIntegration;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModRecipes {

        public static void init() {
                //Smelting Recipes

                GameRegistry.addSmelting(ModBlocksCompat.NETHERITE_ORE, new ItemStack(ModItemsCompat.NETHERITE_SCRAP, 1), 2);
                GameRegistry.addSmelting(ModBlocks.NETHER_GOLD_ORE, new ItemStack(Items.GOLD_INGOT), 1);
                GameRegistry.addSmelting(ModBlocks.BLACK_STONE_BRICKS, new ItemStack(ModBlocks.CRACKED_STONE_BRICKS), 1);
                GameRegistry.addSmelting(ModBlocks.BASALT, new ItemStack(ModBlocks.SMOOTH_BASALT), 1);
                //OreRegistry
                //Stone
                OreDictionary.registerOre("cobblestone", ModBlocks.BLACK_STONE);
                //Wood
                OreDictionary.registerOre("logWood", ModBlocks.CRIMSON_STEM);
                OreDictionary.registerOre("logWood", ModBlocks.WARPED_STEM);
                OreDictionary.registerOre("plankWood",ModBlocks.CRIMSON_PLANKS);
                OreDictionary.registerOre("plankWood",ModBlocks.WARPED_PLANKS);
                OreDictionary.registerOre("stairWood", ModBlocks.CRIMSON_STAIRS);
                OreDictionary.registerOre("stairWood", ModBlocks.WARPED_STAIRS);

              //  OreDictionary.registerOre("trapDoor", ModBlocks.CRIMSON_TRAPDOOR);
              //  OreDictionary.registerOre("trapDoor", ModBlocks.WARPED_TRAPDOOR);

                //Material
                if(!ModIntegration.FUTURE_MC_LOADED) {
                        OreDictionary.registerOre("ingotNetherite", ModItemsCompat.NETHERITE_INGOT);
                        OreDictionary.registerOre("blockNetherite", ModBlocksCompat.NETHERITE_BLOCK);
                }

        }

}
