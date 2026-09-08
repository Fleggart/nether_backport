package com.unseen.nb.proxy;

// 删除：import com.unseen.nb.common.network.ParticleMessage;
// 删除：import com.unseen.nb.init.ModNetworkPackets;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

    public void init() {
        // 移除事件注册
        // MinecraftForge.EVENT_BUS.register(new EventOnSoulFire());
    }

    public void registerItemRenderer(Item item, int meta, String id) {}

    public void registerItemRenderer(Item item, int meta, String id, ResourceLocation resourceOverride) {}

    public void handleAnimationPacket(int entityId, int index) {

    }

    /** 处理粒子生成 - 仅客户端 */
    public void spawnParticle(int particleId, World world, double posX, double posY, double posZ, 
                              double speedX, double speedY, double speedZ, int... parameters)
    {
        // 只允许客户端生成粒子
        if (world.isRemote)
        {
            spawnParticle(particleId, posX, posY, posZ, speedX, speedY, speedZ, parameters);
        }
        // 删除服务端的网络发送逻辑
    }

    /** 此方法在 ClientProxy 中重写 */
    public void spawnParticle(int particleId, double posX, double posY, double posZ, 
                              double speedX, double speedY, double speedZ, int... parameters) {}

    public void spawnSoulParticle(World worldIn, double x, double y, double z, 
                                  double motX, double motY, double motZ) {
    }
}
