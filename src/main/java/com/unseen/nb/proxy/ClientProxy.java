package com.unseen.nb.proxy;

import com.unseen.nb.client.particles.ParticleInversePortal;
import com.unseen.nb.client.particles.ParticleObsidianTear;
import com.unseen.nb.client.particles.ParticleSoul;
import com.unseen.nb.client.particles.ParticleSoulFlame;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
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
    public void spawnParticle(int particle, double posX, double posY, double posZ, double speedX, double speedY, double speedZ, int... parameters)
    {
        Minecraft minecraft = Minecraft.getMinecraft();
        World world = minecraft.world;
        minecraft.effectRenderer.addEffect(getFactory(particle).createParticle(0, world, posX, posY, posZ, speedX, speedY, speedZ, parameters));
    }

    @SideOnly(Side.CLIENT)
    public static IParticleFactory getFactory(int particleId)
    {
        switch(particleId)
        {
            default:
            case 0:
                return new ParticleObsidianTear.Factory();
            case 1:
                return new ParticleSoulFlame.Factory();
            case 2:
                return new ParticleInversePortal.Factory();
        }
    }

    public IParticleFactory getParticleFactory() {
        return new ParticleSoul.Factory();
    }

    @Override
    public void spawnSoulParticle(World worldIn, double x, double y, double z, double motX, double motY, double motZ) {
        if (worldIn == null) worldIn = Minecraft.getMinecraft().world;
        Minecraft.getMinecraft().effectRenderer.addEffect(getParticleFactory().createParticle(0, worldIn, x, y, z, motX, motY, motZ));
    }
}
