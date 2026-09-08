package com.unseen.nb.proxy;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class CommonProxy {

    public void init() {
        // 移除事件注册
    }

    public void registerItemRenderer(Item item, int meta, String id) {}

    public void registerItemRenderer(Item item, int meta, String id, ResourceLocation resourceOverride) {}

    public void handleAnimationPacket(int entityId, int index) {

    }

    /** 处理粒子生成 - 仅客户端，服务端空实现 */
    public void spawnParticle(int particleId, double posX, double posY, double posZ, 
                              double speedX, double speedY, double speedZ, int... parameters) {
        // 服务端不做任何事情
    }

    /** 处理粒子生成 - 带World参数，用于客户端检查 */
    public void spawnParticle(int particleId, World world, double posX, double posY, double posZ, 
                              double speedX, double speedY, double speedZ, int... parameters) {
        // 如果是在客户端，调用客户端的方法
        if (world.isRemote) {
            spawnParticle(particleId, posX, posY, posZ, speedX, speedY, speedZ, parameters);
        }
        // 服务端不做任何事情
    }
}
