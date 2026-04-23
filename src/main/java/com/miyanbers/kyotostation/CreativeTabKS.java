package com.miyanbers.kyotostation;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabKS extends CreativeTabs {
    public static final CreativeTabs KYOTO_STATION = new CreativeTabKS("kyotostation_tab");
    public CreativeTabKS(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Item.getItemFromBlock(KyotoStationMod.WALL_GREEN_BLOCK));
    }
}