package com.unseen.nb.init;

import com.unseen.nb.common.items.*;
// 删除 import com.unseen.nb.common.items.netherite.*;
import com.unseen.nb.util.ModReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // 删除这行
    // public static final HorseArmorType NETHERITE_HORSE_ARMOR = EnumHelper.addHorseArmor(...);

    public static final Item LODE_STONE_COMPASS = new ItemLodeStoneCompass("lode_stone_compass");

    // 删除这行
    // public static final Item NETHERITE_HORSE_ARMOR_ITEM = new ItemNBHorseArmor(...);

    public static final Item PIGSTEP_MUSIC_DISC = new ItemPigStepDisc("pig_step_disc", ModSoundHandler.PIG_STEP_DISC);
}
