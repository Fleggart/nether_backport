package com.unseen.nb.common.event;

import com.unseen.nb.Main;
import com.unseen.nb.common.enchantments.NBEnchantmentSoulSpeed;
// 删除 import com.unseen.nb.common.items.netherite.ItemNBHorseArmor;
import com.unseen.nb.init.ModEnchantments;
import com.unseen.nb.init.ModItems;
import com.unseen.nb.init.ModSoundHandler;
import com.unseen.nb.util.ModReference;
import com.unseen.nb.util.ModUtils;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ModReference.MOD_ID)
public class EventOnSoulSpeed {

    @SubscribeEvent
    public static void addSoulSpeed(LivingEvent.LivingUpdateEvent event) {
        // ... 保持不变 ...
    }

    @SubscribeEvent
    public static void adjustSoulSpeedUponBootChange(LivingEquipmentChangeEvent event) {
        // ... 保持不变 ...
    }

    // 删除整个方法
    /*
    @SubscribeEvent
    public static void removeNetheriteHorseArmorBuffs(LivingEvent.LivingUpdateEvent event) {
        EntityLivingBase entityIn = event.getEntityLiving();

        if(entityIn instanceof EntityHorse) {
            EntityHorse horse = (EntityHorse)entityIn;
            if(horse.getHorseArmorType() != ModItems.NETHERITE_HORSE_ARMOR) {
                IAttributeInstance attribute = horse.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
                if(attribute.getModifier(ItemNBHorseArmor.KNOCKBACK_RESISTANCE_MODIFIER) != null) {
                    attribute.removeModifier(ItemNBHorseArmor.KNOCKBACK_RESISTANCE_MODIFIER);
                }
            }
        }
    }
    */
}
