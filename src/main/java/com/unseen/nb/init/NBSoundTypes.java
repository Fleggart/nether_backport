package com.unseen.nb.init;

import net.minecraft.block.SoundType;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.Mod;

public class NBSoundTypes {

    // ===== 保留所有方块使用的音效类型 =====
    
    public static final SoundType NETHER_ORE = new SoundType(1, 1, ModSoundHandler.NETHER_ORE_BREAK, ModSoundHandler.NETHER_ORE_STEP,
            ModSoundHandler.NETHER_ORE_PLACE, ModSoundHandler.NETHER_ORE_BLOCK_HIT, ModSoundHandler.NETHER_ORE_PLACE);

    public static final SoundType SHROOM_LIGHT = new SoundType(1, 1, ModSoundHandler.SHROOM_LIGHT_BREAK, ModSoundHandler.SHROOM_LIGHT_STEP,
            ModSoundHandler.SHROOM_LIGHT_BREAK, ModSoundHandler.SHROOM_LIGHT_HIT, ModSoundHandler.SHROOM_LIGHT_PlACE);

    public static final SoundType LANTERN = new SoundType(1, 1, ModSoundHandler.SOUL_LANTERN_BREAK, ModSoundHandler.SOUL_LANTERN_PlACE,
            ModSoundHandler.SOUL_LANTERN_PlACE, ModSoundHandler.SOUL_LANTERN_BREAK, ModSoundHandler.SOUL_LANTERN_PlACE);

    public static final SoundType NETHERITE = new SoundType(1, 1, ModSoundHandler.NETHERITE_BREAK, ModSoundHandler.NETHERITE_STEP,
            ModSoundHandler.NETHERITE_PLACE, ModSoundHandler.NETHERITE_BLOCK_HIT, ModSoundHandler.NETHERITE_PLACE);

    public static final SoundType ANCIENT_DEBRIS = new SoundType(1, 1, ModSoundHandler.ANCIENT_DEBRIS_BREAK, ModSoundHandler.ANCIENT_DEBRIS_BREAK,
            ModSoundHandler.ANCIENT_DEBRIS_BREAK, ModSoundHandler.ANCIENT_DEBRIS_BREAK, ModSoundHandler.ANCIENT_DEBRIS_BREAK);

    // ===== 以下是被删除的方块使用的音效类型（已删除） =====
    // public static final SoundType NYLIUM = ...;
    // public static final SoundType HYPHAE = ...;
    // public static final SoundType CHAIN = ...;
    // public static final SoundType STEM_TYPE = ...;
    // public static final SoundType WART = ...;
    // public static final SoundType SOUL_SOIL = ...;
    // public static final SoundType BASALT = ...;
}
