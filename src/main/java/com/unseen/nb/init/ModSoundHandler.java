package com.unseen.nb.init;

import com.unseen.nb.util.ModReference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModSoundHandler {

    // ===== 锁链音效 =====
    public static SoundEvent CHAIN_BREAK;
    public static SoundEvent CHAIN_STEP;

    // ===== 下界金矿石音效 =====
    public static SoundEvent NETHER_ORE_BREAK;
    public static SoundEvent NETHER_ORE_STEP;
    public static SoundEvent NETHER_ORE_PLACE;
    public static SoundEvent NETHER_ORE_BLOCK_HIT;

    // ===== 菌光体音效 =====
    public static SoundEvent SHROOM_LIGHT_BREAK;
    public static SoundEvent SHROOM_LIGHT_STEP;
    public static SoundEvent SHROOM_LIGHT_PlACE;
    public static SoundEvent SHROOM_LIGHT_HIT;

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

    // ===== 其他音效 =====
    // 删除：public static SoundEvent SOUL_FIRE_AMBIENT;

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

        // ===== 下界金矿石音效 =====
        NETHER_ORE_BREAK = registerSound("nether_ore.break", "block");
        NETHER_ORE_STEP = registerSound("nether_ore.step", "block");
        NETHER_ORE_PLACE = registerSound("nether_ore.place", "block");
        NETHER_ORE_BLOCK_HIT = registerSound("nether_ore.hit", "block");

        // ===== 菌光体音效 =====
        SHROOM_LIGHT_BREAK = registerSound("shroom_light.break", "block");
        SHROOM_LIGHT_STEP = registerSound("shroom_light.step", "block");
        SHROOM_LIGHT_PlACE = registerSound("shroom_light.place", "block");
        SHROOM_LIGHT_HIT = registerSound("shroom_light.hit", "block");

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

        // ===== 其他音效 =====
        // 删除：SOUL_FIRE_AMBIENT = registerSound("soul_fire.ambient", "block");
        
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
