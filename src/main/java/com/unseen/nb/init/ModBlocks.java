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

    // ===== 锁链 =====
    public static Block CHAINS = new BlockChainNew("chain_block", Material.ROCK, STONE_HARDNESS, STONE_RESISTANCE, NBSoundTypes.CHAIN).setCreativeTab(CreativeTabs.DECORATIONS);

    // ===== 保留的方块 =====
    public static Block SOUL_LANTERN = new BlockSoulLantern("soul_lantern", Material.ROCK, 3.5F, 3.5F, NBSoundTypes.LANTERN).setCreativeTab(CreativeTabs.DECORATIONS).setLightLevel(0.7F);
    public static Block SOUL_TORCH = new BlockSoulTorch("soul_torch").setLightLevel(0.7F);
}
