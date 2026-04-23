package com.miyanbers.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
//fﻏﻟ۳ﮌﭨ
public class MakeBlock extends Block {
    public MakeBlock(String blockName){
        super(Material.IRON);
        this.setRegistryName("kyotostationmod",blockName);
        this.setCreativeTab(CreativeTabKS.KYOTO_STATION);
        this.setTranslationKey(blockName);
    }
}
