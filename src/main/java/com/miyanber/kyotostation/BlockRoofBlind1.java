package com.miyanber.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRoofBlind1 extends Block {
    public BlockRoofBlind1(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod", "roof_blind_block1");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setUnlocalizedName("roof_blind_block1");
    }
}
