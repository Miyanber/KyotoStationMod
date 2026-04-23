package com.miyanber.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWallWhite extends Block{
    public BlockWallWhite(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod", "wall_white_block");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setUnlocalizedName("wall_white_block");
    }
}
