package com.unseen.nb.init;

import com.unseen.nb.util.ModReference;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class ModNetworkPackets
{
    public static SimpleNetworkWrapper network;

    public static void registerNetworkPackets()
    {
        // 网络注册暂时留空，为未来可能的网络包预留
        network = NetworkRegistry.INSTANCE.newSimpleChannel(ModReference.MOD_ID);
        // 删除：network.registerMessage(ParticleMessage.Handler.class, ParticleMessage.class, packetId++, Side.CLIENT);
    }
}
