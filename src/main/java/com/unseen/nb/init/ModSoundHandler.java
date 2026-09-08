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
    public static SoundEvent SOUL_LANTERN_PlACE;

    // ===== 下界合金音效 =====
    public static SoundEvent NETHERITE_BREAK;
    public static SoundEvent NETHERITE_STEP;
    public static SoundEvent NETHERITE_PLACE;
    public static SoundEvent NETHERITE_BLOCK_HIT;

    // ===== 远古残骸音效 =====
    public static SoundEvent ANCIENT_DEBRIS_BREAK;

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
    public static SoundEvent NETHERITE_EQUIP;

    public static void registerSounds() {
        // ===== 锁链音效 =====
        CHAIN_BREAK = registerSound("chain.break", "block");
        CHAIN_STEP = registerSound("chain.step", "block");

        // ===== 灵魂灯笼音效 =====
        SOUL_LANTERN_BREAK = registerSound("soul_lantern.break", "block");
        SOUL_LANTERN_PlACE = registerSound("soul_lantern.place", "block");

        // ===== 下界合金音效 =====
        NETHERITE_BREAK = registerSound("netherite.break", "block");
        NETHERITE_STEP = registerSound("netherite.step", "block");
        NETHERITE_PLACE = registerSound("netherite.place", "block");
        NETHERITE_BLOCK_HIT = registerSound("netherite.hit", "block");

        // ===== 远古残骸音效 =====
        ANCIENT_DEBRIS_BREAK = registerSound("debris.break", "block");
        
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
