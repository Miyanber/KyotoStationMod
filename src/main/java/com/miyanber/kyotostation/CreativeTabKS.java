package com.miyanber.kyotostation;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabKS extends CreativeTabs {
    public static final CreativeTabs KYOTO_STATION = new CreativeTabKS("kyotostation_tab");
    public CreativeTabKS(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(KyotoStationMod.WALL_GREEN_BLOCK));
    }
}