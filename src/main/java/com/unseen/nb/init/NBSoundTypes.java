package com.unseen.nb.init;

import net.minecraft.block.SoundType;

public class NBSoundTypes {

    // ===== 锁链音效类型 =====
    public static final SoundType CHAIN = new SoundType(1, 1, 
            ModSoundHandler.CHAIN_BREAK, 
            ModSoundHandler.CHAIN_STEP,
            ModSoundHandler.CHAIN_STEP, 
            ModSoundHandler.CHAIN_BREAK, 
            ModSoundHandler.CHAIN_STEP);

    // ===== 删除下界金矿石音效类型 =====
    // public static final SoundType NETHER_ORE = new SoundType(1, 1, 
    //         ModSoundHandler.NETHER_ORE_BREAK, 
    //         ModSoundHandler.NETHER_ORE_STEP,
    //         ModSoundHandler.NETHER_ORE_PLACE, 
    //         ModSoundHandler.NETHER_ORE_BLOCK_HIT, 
    //         ModSoundHandler.NETHER_ORE_PLACE);

    // ===== 菌光体音效类型 =====
    public static final SoundType SHROOM_LIGHT = new SoundType(1, 1, 
            ModSoundHandler.SHROOM_LIGHT_BREAK, 
            ModSoundHandler.SHROOM_LIGHT_STEP,
            ModSoundHandler.SHROOM_LIGHT_BREAK, 
            ModSoundHandler.SHROOM_LIGHT_HIT, 
            ModSoundHandler.SHROOM_LIGHT_PlACE);

    // ===== 灵魂灯笼音效类型 =====
    public static final SoundType LANTERN = new SoundType(1, 1, 
            ModSoundHandler.SOUL_LANTERN_BREAK, 
            ModSoundHandler.SOUL_LANTERN_PlACE,
            ModSoundHandler.SOUL_LANTERN_PlACE, 
            ModSoundHandler.SOUL_LANTERN_BREAK, 
            ModSoundHandler.SOUL_LANTERN_PlACE);

    // ===== 下界合金音效类型 =====
    public static final SoundType NETHERITE = new SoundType(1, 1, 
            ModSoundHandler.NETHERITE_BREAK, 
            ModSoundHandler.NETHERITE_STEP,
            ModSoundHandler.NETHERITE_PLACE, 
            ModSoundHandler.NETHERITE_BLOCK_HIT, 
            ModSoundHandler.NETHERITE_PLACE);

    // ===== 远古残骸音效类型 =====
    public static final SoundType ANCIENT_DEBRIS = new SoundType(1, 1, 
            ModSoundHandler.ANCIENT_DEBRIS_BREAK, 
            ModSoundHandler.ANCIENT_DEBRIS_BREAK,
            ModSoundHandler.ANCIENT_DEBRIS_BREAK, 
            ModSoundHandler.ANCIENT_DEBRIS_BREAK, 
            ModSoundHandler.ANCIENT_DEBRIS_BREAK);
}
