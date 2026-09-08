package com.unseen.nb.init;

import com.unseen.nb.util.ModReference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSoundHandler {

    public static SoundEvent NYLIUM_BREAK;
    public static SoundEvent NYLIUM_STEP;
    public static SoundEvent NYLIUM_PLACE;
    public static SoundEvent NYLIUM_BLOCK_HIT;
    public static SoundEvent NYLIUM_FALL;

    public static SoundEvent CHAIN_BREAK;
    public static SoundEvent CHAIN_STEP;

    public static SoundEvent SOUL_LANTERN_BREAK;
    public static SoundEvent SOUL_LANTERN_PlACE;

    public static SoundEvent HYPHAE_BREAK;

    public static SoundEvent WART_BREAK;
    public static SoundEvent WART_STEP;
    public static SoundEvent WART_PLACE;
    public static SoundEvent WART_BLOCK_HIT;

    public static SoundEvent SOUL_FIRE_AMBIENT;

    public static SoundEvent SOUL_SOIL_BREAK;
    public static SoundEvent SOUL_SOIL_STEP;
    public static SoundEvent SOUL_SOIL_PLACE;
    public static SoundEvent SOUL_SOIL_BLOCK_HIT;

    public static SoundEvent BASALT_BREAK;
    public static SoundEvent BASALT_STEP;
    public static SoundEvent BASALT_PlACE;
    public static SoundEvent BASALT_BLOCK_HIT;

    public static SoundEvent NETHER_ORE_BREAK;
    public static SoundEvent NETHER_ORE_STEP;
    public static SoundEvent NETHER_ORE_PLACE;
    public static SoundEvent NETHER_ORE_BLOCK_HIT;

    public static SoundEvent NETHERITE_BREAK;
    public static SoundEvent NETHERITE_STEP;
    public static SoundEvent NETHERITE_PLACE;
    public static SoundEvent NETHERITE_BLOCK_HIT;

    public static SoundEvent ANCIENT_DEBRIS_BREAK;

    

    



    public static SoundEvent SHROOM_LIGHT_BREAK;
    public static SoundEvent SHROOM_LIGHT_HIT;
    public static SoundEvent SHROOM_LIGHT_STEP;
    public static SoundEvent SHROOM_LIGHT_PlACE;



    


    public static SoundEvent STEM_BREAK;
    public static SoundEvent STEM_STEP;

  
    //Biome Ambience
    public static SoundEvent CRIMSON_FOREST_AMBIENT;
    public static SoundEvent CRIMSON_FOREST_AMBIENT_CONSTANT;
    public static SoundEvent WARPED_FOREST_AMBIENT;
    public static SoundEvent WARPED_FOREST_AMBIENT_CONSTANT;
    public static SoundEvent SOUL_SAND_VALLEY_AMBIENT;
    public static SoundEvent SOUL_SAND_VALLEY_AMBIENT_CONSTANT;

    public static SoundEvent BASALT_DELTAS_AMBIENT;
    public static SoundEvent BASALT_DELTAS_AMBIENT_CONSTANT;

    //MISC
    public static SoundEvent SOUL_SAND_SCREAM;
    public static SoundEvent NETHERITE_EQUIP;
    

    public static void registerSounds() {
    NYLIUM_BREAK = registerSound("nether_grass.break", "block");
    NYLIUM_BLOCK_HIT = registerSound("nether_grass.block_hit", "block");
    NYLIUM_STEP = registerSound("nether_grass.step", "block");
    NYLIUM_PLACE = registerSound("nether_grass.place", "block");
    NYLIUM_FALL = registerSound("nether_grass.fall", "block");
    CHAIN_BREAK = registerSound("chain.break", "block");
    CHAIN_STEP = registerSound("chain.step", "block");

    HYPHAE_BREAK = registerSound("hyphae.break", "block");

    WART_BREAK = registerSound("wart.break", "block");
    WART_STEP = registerSound("wart.step", "block");
    WART_PLACE = registerSound("wart.place", "block");
    WART_BLOCK_HIT = registerSound("wart.hit", "block");

    SOUL_FIRE_AMBIENT = registerSound("soul_fire.ambient", "block");

    SOUL_SOIL_BREAK = registerSound("soul_soil.break", "block");
    SOUL_SOIL_STEP = registerSound("soul_soil.step", "block");
    SOUL_SOIL_PLACE = registerSound("soul_soil.place", "block");
    SOUL_SOIL_BLOCK_HIT = registerSound("soul_soil.hit", "block");

    BASALT_BREAK = registerSound("basalt.break", "block");
    BASALT_STEP = registerSound("basalt.step", "block");
    BASALT_PlACE = registerSound("basalt.place", "block");
    BASALT_BLOCK_HIT = registerSound("basalt.hit", "block");

    NETHER_ORE_BREAK = registerSound("nether_ore.break", "block");
    NETHER_ORE_STEP = registerSound("nether_ore.step", "block");
    NETHER_ORE_PLACE = registerSound("nether_ore.place", "block");
    NETHER_ORE_BLOCK_HIT = registerSound("nether_ore.hit", "block");

    NETHERITE_BREAK = registerSound("netherite.break", "block");
    NETHERITE_STEP = registerSound("netherite.step", "block");
    NETHERITE_PLACE = registerSound("netherite.place", "block");
    NETHERITE_BLOCK_HIT = registerSound("netherite.hit", "block");

    ANCIENT_DEBRIS_BREAK = registerSound("debris.break", "block");

    SHROOM_LIGHT_BREAK = registerSound("shroom_light.break", "block");
    SHROOM_LIGHT_STEP = registerSound("shroom_light.step", "block");
    SHROOM_LIGHT_PlACE = registerSound("shroom_light.place", "block");
    SHROOM_LIGHT_HIT = registerSound("shroom_light.hit", "block");

    
    
    
    

    

    SOUL_LANTERN_BREAK = registerSound("soul_lantern.break", "block");
    SOUL_LANTERN_PlACE = registerSound("soul_lantern.place", "block");

    STEM_BREAK = registerSound("stem.break", "block");
    STEM_STEP = registerSound("stem.step", "block");



l
        
        //Biome Ambience
        CRIMSON_FOREST_AMBIENT = registerSound("crimson_forest.ambience", "ambient");
        CRIMSON_FOREST_AMBIENT_CONSTANT = registerSound("crimson_forest.constant", "ambient");
        WARPED_FOREST_AMBIENT = registerSound("warped_forest.ambience", "ambient");
        WARPED_FOREST_AMBIENT_CONSTANT = registerSound("warped_forest.constant", "ambient");
        SOUL_SAND_VALLEY_AMBIENT = registerSound("soulsand_valley.ambience", "ambient");
        SOUL_SAND_VALLEY_AMBIENT_CONSTANT = registerSound("soulsand_valley.constant", "ambient");
        BASALT_DELTAS_AMBIENT = registerSound("basalt_deltas.ambience", "ambient");
        BASALT_DELTAS_AMBIENT_CONSTANT = registerSound("basalt_deltas.constant", "ambient");

        //MISC
        SOUL_SAND_SCREAM = registerSound("soul.scream", "particle");
        NETHERITE_EQUIP = registerSound("netherite.equip", "entity");
        

    }


    private static SoundEvent registerSound(String name, String category) {
        String fullName = category + "." + name;
        ResourceLocation location = new ResourceLocation(ModReference.MOD_ID, fullName);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(fullName);
        ForgeRegistries.SOUND_EVENTS.register(event);

        return event;
    }
}
