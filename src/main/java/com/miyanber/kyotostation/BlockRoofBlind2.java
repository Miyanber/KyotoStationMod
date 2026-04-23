package com.miyanber.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRoofBlind2 extends Block {
    public BlockRoofBlind2(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod", "roof_blind_block2");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setUnlocalizedName("roof_blind_block2");
    }
}
