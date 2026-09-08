package com.unseen.nb.handler;

import com.unseen.nb.init.ModBlocks;
// 删除 import com.unseen.nb.init.ModItems;
import com.unseen.nb.util.ModReference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler {

    private static IForgeRegistry<Item> itemRegistry;

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        itemRegistry = event.getRegistry();
        // 删除这行：event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
        // 现在物品需要单独注册
    }

    public static <T extends Item> T registerItem(T item, String name) {
        registerItem(item, new ResourceLocation(ModReference.MOD_ID, name));
        return item;
    }

    public static <T extends Item> T registerItem(T item, ResourceLocation name) {
        itemRegistry.register(item.setRegistryName(name).setTranslationKey(name.toString().replace(":", ".")));
        return item;
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegister(ModelRegistryEvent event) {
        // 删除对 ModItems.ITEMS 的遍历
        // 现在需要单独为每个物品注册模型
        // 或者遍历 ModBlocks 中的方块来注册模型
        
        // 只处理方块
        for (Block block : ModBlocks.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerModels();
            }
        }
    }
}
