package com.unseen.nb.common.event;

import com.unseen.nb.config.ModConfig;
import com.unseen.nb.init.ModItems;
import com.unseen.nb.init.ModItemsCompat;
import com.unseen.nb.util.ModReference;
import com.unseen.nb.util.ModUtils;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;
import thedarkcolour.futuremc.registry.FItems;

@Mod.EventBusSubscriber(modid = ModReference.MOD_ID)
public class AnvilNetherite {

    @SubscribeEvent
    public static void addNetheriteAnvilRecipes(AnvilUpdateEvent event) {

        if(!ModConfig.disableAnvilRecipes) {
        ItemStack leftInput = event.getLeft();
        ItemStack rightInput = event.getRight();
        ItemStack output = event.getOutput();

        if (isOreMatching(rightInput, "ingotNetherite")) {
      else {
                Item[] diamondTools = new Item[]{Items.DIAMOND_HORSE_ARMOR};

                for (int i = 0; i < diamondTools.length; i++) {
                    if (leftInput.getItem() == diamondTools[i]) {
                        Item[] netheriteTools = new Item[]{ModItems.NETHERITE_HORSE_ARMOR_ITEM};
                        output = new ItemStack(netheriteTools[i]);
                        NBTTagCompound tags = leftInput.getTagCompound();
                        output.setTagCompound(tags);
                        int itemDamage = (int) ModUtils.getPercentageOf(leftInput.getMaxDamage(), leftInput.getItemDamage());
                        int calculatedDamage = (int) ModUtils.calculateValueWithPrecentage(output.getMaxDamage(), itemDamage);
                        output.setItemDamage(calculatedDamage);
                        event.setOutput(output);
                        event.setMaterialCost(1);
                        event.setCost(8);
                    }
                }
            }

        }
        }
    }

    public static boolean isOreMatching(ItemStack stack, String target) {
        for (ItemStack ore : OreDictionary.getOres(target, false)) {
            if (ItemStack.areItemsEqual(ore, stack)) {
                return true;
            }
        }
        return false;
    }
}
