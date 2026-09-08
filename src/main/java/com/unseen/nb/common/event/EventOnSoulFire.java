package com.unseen.nb.common.event;

import com.unseen.nb.init.ModBlocks;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventOnSoulFire {

    @SubscribeEvent
    public void onStandOnSoulFire(LivingEvent.LivingUpdateEvent event) {
        EntityLivingBase base = event.getEntityLiving();
        
        // 仅在服务端执行（避免重复触发）
        if (base.world.isRemote) {
            return;
        }
        
        // 检查实体是否站在灵魂火上
        if (base.world.getBlockState(base.getPosition()).getBlock() == ModBlocks.SOUL_FIRE) {
            // 如果实体免疫火焰，跳过
            if (base.isImmuneToFire()) {
                return;
            }
            
            // 玩家检查：创造模式或观察者模式不受伤
            if (base instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) base;
                if (player.isCreative() || player.isSpectator()) {
                    return;
                }
            }
            
            // 点燃实体（10秒火焰伤害）
            base.setFire(10);
        }
    }
}
