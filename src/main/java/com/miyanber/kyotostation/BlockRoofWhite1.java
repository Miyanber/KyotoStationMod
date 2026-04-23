package com.miyanber.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRoofWhite1 extends Block {
    public BlockRoofWhite1(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod","roof_white_block1");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setUnlocalizedName("roof_white_block1");
    }
}
