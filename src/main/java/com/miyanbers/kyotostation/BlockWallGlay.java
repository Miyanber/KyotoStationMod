package com.miyanbers.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWallGlay extends Block{
    public BlockWallGlay(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod","wall_glay_block");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setTranslationKey("wall_glay_block");
    }
}
