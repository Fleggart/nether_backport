package com.unseen.nb;

import com.sun.jna.Structure;
// 删除：import com.unseen.nb.common.blocks.tileentity.TilePiglinHead;

// 删除 import com.unseen.nb.common.commands.CommandLocateBastion;

import com.unseen.nb.init.*;
import com.unseen.nb.proxy.CommonProxy;
import com.unseen.nb.util.LootTableExtendedFunc;
import com.unseen.nb.util.ModReference;


import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.functions.LootFunctionManager;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModReference.MOD_ID, name = ModReference.NAME, version = ModReference.VERSION, dependencies = "required-before:nether_api")
public class Main {

    @SidedProxy(clientSide = ModReference.CLIENT_PROXY_CLASS, serverSide = ModReference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    public static SimpleNetworkWrapper network;
    public static Logger LOGGER = LogManager.getLogger(ModReference.MOD_ID);

    @Mod.Instance
    public static Main instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.init();
        ModSoundHandler.registerSounds();
        // 删除：GameRegistry.registerTileEntity(TilePiglinHead.class, new ResourceLocation(ModReference.MOD_ID, "piglin_skull"));
        LootFunctionManager.registerFunction(new LootTableExtendedFunc.Serializer());
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        ModNetworkPackets.registerNetworkPackets();
        
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        // 留空
    }

    public static <MSG extends IMessage> void sendMSGToAll(MSG message) {
        // 留空
    }

    public static <MSG extends IMessage> void sendNonLocal(MSG message, EntityPlayerMP playerMP) {
        network.sendTo(message, playerMP);
    }
}
