package com.miyanbers.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWallGreen extends Block{
    public BlockWallGreen(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod","wall_green_block");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setTranslationKey("wall_green_block");
    }
}
