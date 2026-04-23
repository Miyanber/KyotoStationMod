package com.miyanbers.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class BlockStationStairs extends Block {
    public BlockStationStairs(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod", "station_stairs");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setTranslationKey("station_stairs");
    }
}
