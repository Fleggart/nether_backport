package com.unseen.nb.init;

import com.unseen.nb.common.blocks.BlockChainNew;
import com.unseen.nb.common.blocks.BlockSoulLantern;
import com.unseen.nb.common.blocks.BlockSoulTorch;
import com.unseen.nb.common.blocks.base.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks
{
    public static final float STONE_HARDNESS = 1.7f;
    public static final float STONE_RESISTANCE = 10f;
    public static final float OBSIDIAN_HARDNESS = 50;
    public static final float OBSIDIAN_RESISTANCE = 2000;

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    // ===== 保留的方块 =====
    
    /** 锁链 - 可水平或垂直放置的装饰性链条 */
    public static final Block CHAINS = new BlockChainNew("chain_block", Material.ROCK, STONE_HARDNESS, STONE_RESISTANCE, NBSoundTypes.CHAIN).setCreativeTab(CreativeTabs.DECORATIONS);

    /** 灵魂灯笼 - 悬挂式或放置式的蓝色光源 */
    public static final Block SOUL_LANTERN = new BlockSoulLantern("soul_lantern", Material.ROCK, 3.5F, 3.5F, NBSoundTypes.LANTERN).setCreativeTab(CreativeTabs.DECORATIONS).setLightLevel(0.7F);

    /** 灵魂火把 - 手持或放置的蓝色光源 */
    public static final Block SOUL_TORCH = new BlockSoulTorch("soul_torch").setLightLevel(0.7F);

}
