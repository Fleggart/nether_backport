package com.unseen.nb.init;

import com.unseen.nb.common.blocks.*;
import com.unseen.nb.common.blocks.base.*;
import net.minecraft.block.*;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks
{
    public static final float BASALT_HARDNESS = 1.25f;
    public static final float BASALT_RESISTANCE = 7.0F;

    public static final float STONE_HARDNESS = 1.7f;
    public static final float STONE_RESISTANCE = 10f;

    public static final float WOOD_HARDNESS = 1.5f;
    public static final float WOOD_RESISTANCE = 5.0f;

    public static final float OBSIDIAN_HARDNESS = 50;
    public static final float OBSIDIAN_RESISTANCE = 2000;
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    // ===== 玄武岩系列 =====
    public static final Block BASALT = new BlockPillarBase("basalt", Material.ROCK, BASALT_HARDNESS, BASALT_RESISTANCE, NBSoundTypes.BASALT).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static final Block POLISHED_BASALT = new BlockPillarBase("polished_basalt", Material.ROCK, BASALT_HARDNESS, BASALT_RESISTANCE, NBSoundTypes.BASALT).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static final Block SMOOTH_BASALT = new BlockBase("smooth_basalt", Material.ROCK, BASALT_HARDNESS, BASALT_RESISTANCE, NBSoundTypes.BASALT).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    
    public static Block CHAINS = new BlockChainNew("chain_block", Material.ROCK, STONE_HARDNESS, STONE_RESISTANCE, NBSoundTypes.CHAIN).setCreativeTab(CreativeTabs.DECORATIONS);

    // ===== 绯红系列 =====
    public static final Block CRIMSON_STEM = new BlockLogBase("crimson_stem", WOOD_HARDNESS, WOOD_RESISTANCE, NBSoundTypes.STEM_TYPE).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static final Block CRIMSON_HYPHAE = new BlockLogBase("crimson_hyphae", WOOD_HARDNESS, WOOD_RESISTANCE, NBSoundTypes.HYPHAE).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static final Block CRIMSON_PLANKS = new BlockBase("crimson_planks", Material.GROUND, WOOD_HARDNESS, WOOD_RESISTANCE, SoundType.WOOD).setHarvestInfo("axe", 0).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static final Block CRIMSON_DOOR = new BlockNetherDoor("crimson_door", WOOD_HARDNESS, WOOD_RESISTANCE, CreativeTabs.REDSTONE, SoundType.WOOD);
    public static final Block CRIMSON_FENCE = new BlockFenceBase("crimson_fence", Material.GROUND, MapColor.RED_STAINED_HARDENED_CLAY, WOOD_HARDNESS, WOOD_RESISTANCE);
    public static final Block CRIMSON_GATE = new BlockFenceGateBase("crimson_gate", BlockPlanks.EnumType.OAK, WOOD_HARDNESS, WOOD_RESISTANCE);
    public static final Block CRIMSON_STAIRS = new BlockStairBase("crimson_stairs", CRIMSON_PLANKS.getDefaultState(), WOOD_HARDNESS, WOOD_RESISTANCE, SoundType.WOOD).setHarvestInfo("axe", 0).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static final Block CRIMSON_TRAPDOOR = new BlockNetherTrapDoor("crimson_trapdoor", WOOD_RESISTANCE, WOOD_HARDNESS, CreativeTabs.REDSTONE, SoundType.WOOD);

    public static final Block CRIMSON_WART = new BlockBase("crimson_wart", Material.GRASS, 1.0F, 1.0F, NBSoundTypes.WART).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static final Block CRYING_OBSIDIAN = new BlockCryingObsidian("cry_obi", Material.ROCK, OBSIDIAN_HARDNESS, OBSIDIAN_RESISTANCE, SoundType.STONE).setHarvestInfo("pickaxe", 3).setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setLightLevel(0.7F);

    public static final Block GILDED_BLACKSTONE = new BlockGildedBlackstone("gilded_blackstone", Material.ROCK, STONE_HARDNESS, STONE_RESISTANCE, NBSoundTypes.NETHER_ORE).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static Block NETHER_GOLD_ORE = new BlockNetherOre("nether_gold_ore", Material.ROCK, 3.0F, 5.0F, NBSoundTypes.NETHER_ORE).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static Block PIGLIN_HEAD = new BlockPiglinHead("piglin_head").setCreativeTab(CreativeTabs.DECORATIONS);

    public static Block QUARTZ_BRICKS = new BlockBase("quartz_bricks", Material.ROCK, STONE_HARDNESS, STONE_RESISTANCE, SoundType.STONE).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    public static Block SHROOMLIGHT = new BlockBase("shroom_light", Material.GRASS, 1.0F, 1.0F, NBSoundTypes.SHROOM_LIGHT).setCreativeTab(CreativeTabs.DECORATIONS).setLightLevel(1.0F);
    public static Block SOUL_FIRE = new BlockSoulFire(CreativeTabs.DECORATIONS, "soul_fire").setLightLevel(0.7F);
    public static Block SOUL_LANTERN = new BlockSoulLantern("soul_lantern", Material.ROCK, 3.5F, 3.5F, NBSoundTypes.LANTERN).setCreativeTab(CreativeTabs.DECORATIONS).setLightLevel(0.7F);
    public static Block SOUL_TORCH = new BlockSoulTorch("soul_torch").setLightLevel(0.7F);
    public static final Block SOUL_SOIL = new BlockSoulSoil("soul_soil", Material.SAND, 0.5F, 0.5F, NBSoundTypes.SOUL_SOIL).setHarvestInfo("shovel", 0).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    // ===== 诡异系列 =====
    public static final Block WARPED_STEM = new BlockLogBase("warped_stem",  WOOD_HARDNESS, WOOD_RESISTANCE, NBSoundTypes.STEM_TYPE).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static final Block WARPED_HYPHAE = new BlockLogBase("warped_hyphae", WOOD_HARDNESS, WOOD_RESISTANCE, NBSoundTypes.HYPHAE).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static final Block WARPED_PLANKS = new BlockBase("warped_planks", Material.GROUND, WOOD_HARDNESS, WOOD_RESISTANCE, SoundType.WOOD).setHarvestInfo("axe", 0).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static final Block WARPED_DOOR = new BlockNetherDoor("warped_door", WOOD_HARDNESS, WOOD_RESISTANCE, CreativeTabs.REDSTONE, SoundType.WOOD);
    public static final Block WARPED_FENCE = new BlockFenceBase("warped_fence", Material.GROUND, MapColor.CYAN_STAINED_HARDENED_CLAY, WOOD_HARDNESS, WOOD_RESISTANCE);
    public static final Block WARPED_GATE = new BlockFenceGateBase("warped_gate", BlockPlanks.EnumType.OAK, WOOD_HARDNESS, WOOD_RESISTANCE);
    public static final Block WARPED_STAIRS = new BlockStairBase("warped_stairs", WARPED_PLANKS.getDefaultState(), WOOD_HARDNESS, WOOD_RESISTANCE, SoundType.WOOD).setHarvestInfo("axe", 0).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static final Block WARPED_TRAPDOOR = new BlockNetherTrapDoor("warped_trapdoor", WOOD_RESISTANCE, WOOD_HARDNESS, CreativeTabs.REDSTONE, SoundType.WOOD);

    public static final Block WARPED_WART = new BlockBase("warped_wart", Material.GRASS, 1.0F, 1.0F, NBSoundTypes.WART).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
}
