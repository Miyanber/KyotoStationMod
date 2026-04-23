package com.miyanber.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWallBlue extends Block{
    public BlockWallBlue(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod","wall_blue_block");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setUnlocalizedName("wall_blue_block");
    }
}
