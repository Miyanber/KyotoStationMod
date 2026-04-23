package com.miyanbers.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFloorBlack2 extends Block {
    public BlockFloorBlack2(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod","floor_black_block2");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setTranslationKey("floor_black_block2");
    }
}
