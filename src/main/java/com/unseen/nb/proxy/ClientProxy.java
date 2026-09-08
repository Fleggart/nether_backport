package com.unseen.nb.proxy;

import com.unseen.nb.client.particles.ParticleSoulFlame;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id)
    { registerItemRenderer(item, meta, id, item.getRegistryName()); }

    @Override
    public void registerItemRenderer(Item item, int meta, String id, ResourceLocation resourceOverride)
    { ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(resourceOverride, id)); }

    @Override
    public void spawnParticle(int particle, double posX, double posY, double posZ, 
                              double speedX, double speedY, double speedZ, int... parameters)
    {
        Minecraft minecraft = Minecraft.getMinecraft();
        World world = minecraft.world;
        minecraft.effectRenderer.addEffect(getFactory(particle).createParticle(0, world, posX, posY, posZ, speedX, speedY, speedZ, parameters));
    }

    @SideOnly(Side.CLIENT)
    public static IParticleFactory getFactory(int particleId)
    {
        // 所有粒子都使用 SoulFlame
        return new ParticleSoulFlame.Factory();
    }

    // 删除以下方法：
    // public IParticleFactory getParticleFactory() { ... }
    // public void spawnSoulParticle(World worldIn, double x, double y, double z, ...) { ... }
}
