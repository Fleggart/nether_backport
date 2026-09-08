package com.unseen.nb.init;

import com.unseen.nb.util.ModReference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSoundHandler {

    // ===== 锁链音效 =====
    public static SoundEvent CHAIN_BREAK;
    public static SoundEvent CHAIN_STEP;

    // ===== 灵魂灯笼音效 =====
    public static SoundEvent SOUL_LANTERN_BREAK;
    public static SoundEvent SOUL_LANTERN_PLACE;

    // Biome Ambience
    public static SoundEvent CRIMSON_FOREST_AMBIENT;
    public static SoundEvent CRIMSON_FOREST_AMBIENT_CONSTANT;
    public static SoundEvent WARPED_FOREST_AMBIENT;
    public static SoundEvent WARPED_FOREST_AMBIENT_CONSTANT;
    public static SoundEvent SOUL_SAND_VALLEY_AMBIENT;
    public static SoundEvent SOUL_SAND_VALLEY_AMBIENT_CONSTANT;
    public static SoundEvent BASALT_DELTAS_AMBIENT;
    public static SoundEvent BASALT_DELTAS_AMBIENT_CONSTANT;

    // MISC
    public static SoundEvent SOUL_SAND_SCREAM;

    public static void registerSounds() {
        // ===== 锁链音效 =====
        CHAIN_BREAK = registerSound("chain.break", "block");
        CHAIN_STEP = registerSound("chain.step", "block");

        // ===== 灵魂灯笼音效 =====
        SOUL_LANTERN_BREAK = registerSound("soul_lantern.break", "block");
        SOUL_LANTERN_PLACE = registerSound("soul_lantern.place", "block");
        
        // Biome Ambience
        CRIMSON_FOREST_AMBIENT = registerSound("crimson_forest.ambience", "ambient");
        CRIMSON_FOREST_AMBIENT_CONSTANT = registerSound("crimson_forest.constant", "ambient");
        WARPED_FOREST_AMBIENT = registerSound("warped_forest.ambience", "ambient");
        WARPED_FOREST_AMBIENT_CONSTANT = registerSound("warped_forest.constant", "ambient");
        SOUL_SAND_VALLEY_AMBIENT = registerSound("soulsand_valley.ambience", "ambient");
        SOUL_SAND_VALLEY_AMBIENT_CONSTANT = registerSound("soulsand_valley.constant", "ambient");
        BASALT_DELTAS_AMBIENT = registerSound("basalt_deltas.ambience", "ambient");
        BASALT_DELTAS_AMBIENT_CONSTANT = registerSound("basalt_deltas.constant", "ambient");

        // MISC
        SOUL_SAND_SCREAM = registerSound("soul.scream", "particle");
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
