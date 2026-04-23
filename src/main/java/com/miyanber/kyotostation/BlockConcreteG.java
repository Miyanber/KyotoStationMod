package com.miyanber.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockConcreteG extends Block {
    public BlockConcreteG(){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod","concrete_g");
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setUnlocalizedName("concrete_g");
    }
}
