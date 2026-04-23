package com.miyanber.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFloorBlack1 extends Block{
    public BlockFloorBlack1(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod","floor_black_block1");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setUnlocalizedName("floor_black_block1");
    }
}
