package com.unseen.nb;

import com.unseen.nb.init.ModSoundHandler;
import com.unseen.nb.proxy.CommonProxy;
import com.unseen.nb.util.ModReference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModReference.MOD_ID, name = ModReference.NAME, version = ModReference.VERSION, dependencies = "required-before:nether_api")
public class Main {

    @SidedProxy(clientSide = ModReference.CLIENT_PROXY_CLASS, serverSide = ModReference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    public static Logger LOGGER = LogManager.getLogger(ModReference.MOD_ID);

    @Mod.Instance
    public static Main instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.init();
        ModSoundHandler.registerSounds();
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        // 网络功能已移除
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        // 留空
    }
}
