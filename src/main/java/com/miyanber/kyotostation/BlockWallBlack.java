package com.miyanber.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWallBlack extends Block {
    public BlockWallBlack(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod","wall_black_block");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setUnlocalizedName("wall_black_block");
    }
}
