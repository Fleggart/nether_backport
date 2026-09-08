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

    // ===== 锁链（保留） =====
    public static Block CHAINS = new BlockChainNew("chain_block", Material.ROCK, STONE_HARDNESS, STONE_RESISTANCE, NBSoundTypes.CHAIN).setCreativeTab(CreativeTabs.DECORATIONS);

    // ===== 保留的方块 =====
    public static final Block CRYING_OBSIDIAN = new BlockCryingObsidian("cry_obi", Material.ROCK, OBSIDIAN_HARDNESS, OBSIDIAN_RESISTANCE, SoundType.STONE).setHarvestInfo("pickaxe", 3).setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setLightLevel(0.7F);
    public static Block NETHER_GOLD_ORE = new BlockNetherOre("nether_gold_ore", Material.ROCK, 3.0F, 5.0F, NBSoundTypes.NETHER_ORE).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static Block QUARTZ_BRICKS = new BlockBase("quartz_bricks", Material.ROCK, STONE_HARDNESS, STONE_RESISTANCE, SoundType.STONE).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    public static Block SHROOMLIGHT = new BlockBase("shroom_light", Material.GRASS, 1.0F, 1.0F, NBSoundTypes.SHROOM_LIGHT).setCreativeTab(CreativeTabs.DECORATIONS).setLightLevel(1.0F);
    // 删除：public static Block SOUL_FIRE = new BlockSoulFire(CreativeTabs.DECORATIONS, "soul_fire").setLightLevel(0.7F);
    public static Block SOUL_LANTERN = new BlockSoulLantern("soul_lantern", Material.ROCK, 3.5F, 3.5F, NBSoundTypes.LANTERN).setCreativeTab(CreativeTabs.DECORATIONS).setLightLevel(0.7F);
    public static Block SOUL_TORCH = new BlockSoulTorch("soul_torch").setLightLevel(0.7F);
}
