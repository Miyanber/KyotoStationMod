package com.miyanbers.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFloorBlackTile extends Block {
    public BlockFloorBlackTile(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod","floor_black_tile");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setTranslationKey("floor_black_tile");
    }
}
