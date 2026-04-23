package com.miyanbers.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRoofWhite2 extends Block {
    public BlockRoofWhite2(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod","roof_white_block2");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setTranslationKey("roof_white_block2");
    }
}
