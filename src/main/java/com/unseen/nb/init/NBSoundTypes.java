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

    // ===== 灵魂灯笼音效类型 =====
    public static final SoundType LANTERN = new SoundType(1, 1, 
            ModSoundHandler.SOUL_LANTERN_BREAK, 
            ModSoundHandler.SOUL_LANTERN_PLACE,
            ModSoundHandler.SOUL_LANTERN_PLACE, 
            ModSoundHandler.SOUL_LANTERN_BREAK, 
            ModSoundHandler.SOUL_LANTERN_PLACE);
}
