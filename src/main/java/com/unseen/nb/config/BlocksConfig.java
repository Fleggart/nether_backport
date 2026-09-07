package com.unseen.nb.config;


import com.unseen.nb.util.ModReference;
import net.minecraftforge.common.config.Config;

@Config(modid = ModReference.MOD_ID, name = "Unseens Nether Backport/blocks_items_config")
public class BlocksConfig {

    @Config.RequiresMcRestart
    @Config.Comment(value = "Which blocks soul fire will work on. Works with 'modID:blockName'.")
    public static String[] soulBlocks = new String[] {
            "minecraft:soul_sand",
            ModReference.MOD_ID + ":soul_soil"
    };

    @Config.RequiresMcRestart
    @Config.Comment(value = "Which blocks soul speed works on. Add new blocks with 'modID:blockName'.")
    public static String[] blocksForEnchant = new String[] {
            "minecraft:soul_sand",
            ModReference.MOD_ID + ":soul_soil"
    };

    @Config.RequiresMcRestart
    @Config.Comment(value = "Which blocks can be harvested with a hoe. Works with 'modID:blockName'. Every leaf block in the game is already in the list, and cannot be removed.")
    public static String[] hoeWhitelistedBlocks = new String[] {
            "minecraft:hay_block",
            "minecraft:nether_wart_block",
            "minecraft:sponge",
            ModReference.MOD_ID + ":crimson_wart",
            ModReference.MOD_ID + ":warped_wart",
            ModReference.MOD_ID + ":shroom_light"
    };


    @Config.RequiresMcRestart
    @Config.Comment(value = "Which items will be affected by fire resistance. To add your own do 'modID:itemName', currently not supporting metaData")
    public static String[] fireproofItemList = new String[] {
            
    };

    @Config.RequiresMcRestart
    @Config.Comment(value = "Which blocks to check for when Lava flows over Soul Soil, to generate Basalt. To add your own do 'modID:itemName', currently not supporting metaData")
    public static String[] basaltGeneratorBlock = new String[] {
            "oe:blue_ice",
            "futuremc:blue_ice"
    };

    @Config.RequiresMcRestart
    @Config.Comment(value = "Enable this to turn the whitelist for fire resistant items into the opposite. Meaning when set to true, items in the list will act without fire resistance")
    public static boolean fireproofItemBlacklist = false;


}
