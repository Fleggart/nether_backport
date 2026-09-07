package com.unseen.nb.init;

import com.unseen.nb.common.items.ItemBaseCompat;
// 删除以下 import
// import com.unseen.nb.common.items.netherite.*;
import com.unseen.nb.config.ModConfig;
import com.unseen.nb.util.ModReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItemsCompat {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // 删除以下工具材料定义
    // private static final Item.ToolMaterial NETHERITE_SET = EnumHelper.addToolMaterial(...);
    // private static final ItemArmor.ArmorMaterial NETHERITE_ARMOR = EnumHelper.addArmorMaterial(...);

    // 删除以下物品声明
    // public static final Item NETHERITE_SCRAP = ...;
    // public static final Item NETHERITE_INGOT = ...;
    // public static final Item NETHERITE_HELMET = ...;
    // public static final Item NETHERITE_CHESTPLATE = ...;
    // public static final Item NETHERITE_LEGGINGS = ...;
    // public static final Item NETHERITE_BOOTS = ...;
    // public static final Item NETHERITE_SWORD = ...;
    // public static final Item NETHERITE_SHOVEL = ...;
    // public static final Item NETHERITE_AXE = ...;
    // public static final Item NETHERITE_PICKAXE = ...;
    // public static final Item NETHERITE_HOE = ...;
}
