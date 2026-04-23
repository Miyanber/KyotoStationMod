package com.miyanbers.kyotostation;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = KyotoStationMod.MODID, version = KyotoStationMod.VERSION, name = KyotoStationMod.MODNAME)
public class KyotoStationMod {
    public static final String MODID = "kyotostationmod";
    public static final String VERSION = "1.3";
    public static final String MODNAME = "KyotoStationMod";
    public static final Item EXAMPLE_ITEM = new ItemExampleItem();
    public static final Block WALL_GLAY_BLOCK = new BlockWallGlay();
    public static final Block WALL_BLACK_BLOCK = new BlockWallBlack();
    public static final Block WALL_GREEN_BLOCK = new BlockWallGreen();
    public static final Block WALL_WHITE_BLOCK = new BlockWallWhite();
    public static final Block WALL_BLUE_BLOCK = new BlockWallBlue();
    public static final Block FLOOR_BLACK_BLOCK1 = new BlockFloorBlack1();
    public static final Block FLOOR_BLACK_BLOCK2 = new BlockFloorBlack2();
    public static final Block FLOOR_BLACK_TILE = new BlockFloorBlackTile();
    public static final Block ROOF_WHITE_BLOCK1 = new BlockRoofWhite1();
    public static final Block ROOF_WHITE_BLOCK2 = new BlockRoofWhite2();
    public static final Block CONCRETE_G = new BlockConcreteG();
    public static final Block ROOF_BLIND_BLOCK1 = new BlockRoofBlind1();
    public static final Block ROOF_BLIND_BLOCK2 = new BlockRoofBlind2();
    public static final Block STATION_STAIRS = new BlockStationStairs();
    public static final Block ROOF_BLIND2_BLOCK = new MakeBlock("roof_blind2_block");
    public static final Block ROOF_BLIND2_BLOCK2 = new MakeBlock("roof_blind2_block2");
    public static final Block WALL_BLIND_BLOCK = new MakeBlock("wall_blind_block");
    public static final Block ROOF_BLIND3_BLOCK = new MakeBlock("roof_blind3_block");
    public static final Block ROOF_BLIND3_BLOCK2 = new MakeBlock("roof_blind3_block2");
    public static final Block FLOOR_BLACK2_BLOCK = new MakeBlock("floor_black2_block");
    public static final Block CONCRETE_WHITE = new MakeBlock("concrete_white");

    @Mod.EventHandler
    //ﺎﮊﻅﺧMODt@C۸ﮊﻭCxgﮊ­ﺳﮔﺭﺓﻠB
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    //ACeﻭo^ﺓﻠCxgB preinitﮊ^C~Oﺧ­ﺳﺓﻠB
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(EXAMPLE_ITEM);
        event.getRegistry().register(new ItemBlock(WALL_GLAY_BLOCK).setRegistryName("kyotostationmod", "wall_glay_block"));
        event.getRegistry().register(new ItemBlock(WALL_BLACK_BLOCK).setRegistryName("kyotostationmod","wall_black_block"));
        event.getRegistry().register(new ItemBlock(WALL_GREEN_BLOCK).setRegistryName("kyotostationmod","wall_green_block"));
        event.getRegistry().register(new ItemBlock(WALL_WHITE_BLOCK).setRegistryName("kyotostationmod", "wall_white_block"));
        event.getRegistry().register(new ItemBlock(WALL_BLUE_BLOCK).setRegistryName("kyotostationmod","wall_blue_block"));
        event.getRegistry().register(new ItemBlock(FLOOR_BLACK_BLOCK1).setRegistryName("kyotostationmod", "floor_black_block1"));
        event.getRegistry().register(new ItemBlock(FLOOR_BLACK_BLOCK2).setRegistryName("kyotostationmod", "floor_black_block2"));
        event.getRegistry().register(new ItemBlock(FLOOR_BLACK_TILE).setRegistryName("kyotostationmod", "floor_black_tile"));
        event.getRegistry().register(new ItemBlock(ROOF_WHITE_BLOCK1).setRegistryName("kyotostationmod", "roof_white_block1"));
        event.getRegistry().register(new ItemBlock(ROOF_WHITE_BLOCK2).setRegistryName("kyotostationmod", "roof_white_block2"));
        event.getRegistry().register(new ItemBlock(ROOF_BLIND_BLOCK1).setRegistryName("kyotostationmod","roof_blind_block1"));
        event.getRegistry().register(new ItemBlock(ROOF_BLIND_BLOCK2).setRegistryName("kyotostationmod","roof_blind_block2"));
        event.getRegistry().register(new ItemBlock(CONCRETE_G).setRegistryName("kyotostationmod","concrete_g"));
        event.getRegistry().register(new ItemBlock(STATION_STAIRS).setRegistryName("kyotostationmod", "station_stairs"));
        event.getRegistry().register(new ItemBlock(ROOF_BLIND2_BLOCK).setRegistryName("kyotostationmod", "roof_blind2_block"));
        event.getRegistry().register(new ItemBlock(ROOF_BLIND2_BLOCK2).setRegistryName("kyotostationmod", "roof_blind2_block2"));
        event.getRegistry().register(new ItemBlock(WALL_BLIND_BLOCK).setRegistryName("kyotostationmod", "wall_blind_block"));
        event.getRegistry().register(new ItemBlock(ROOF_BLIND3_BLOCK).setRegistryName("kyotostationmod","roof_blind3_block"));
        event.getRegistry().register(new ItemBlock(ROOF_BLIND3_BLOCK2).setRegistryName("kyotostationmod","roof_blind3_block2"));
        event.getRegistry().register(new ItemBlock(FLOOR_BLACK2_BLOCK).setRegistryName("kyotostationmod","floor_black2_block"));
        event.getRegistry().register(new ItemBlock(CONCRETE_WHITE).setRegistryName("kyotostationmod","concrete_white"));
    }

    //ubNﻭo^ﺓﻠCxgB preinitﮊ^C~Oﺧ­ﺳﺓﻠB
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(WALL_GLAY_BLOCK);
        event.getRegistry().register(WALL_BLACK_BLOCK);
        event.getRegistry().register(WALL_GREEN_BLOCK);
        event.getRegistry().register(WALL_WHITE_BLOCK);
        event.getRegistry().register(WALL_BLUE_BLOCK);
        event.getRegistry().register(FLOOR_BLACK_BLOCK1);
        event.getRegistry().register(FLOOR_BLACK_BLOCK2);
        event.getRegistry().register(FLOOR_BLACK_TILE);
        event.getRegistry().register(ROOF_WHITE_BLOCK1);
        event.getRegistry().register(ROOF_WHITE_BLOCK2);
        event.getRegistry().register(CONCRETE_G);
        event.getRegistry().register(ROOF_BLIND_BLOCK1);
        event.getRegistry().register(ROOF_BLIND_BLOCK2);
        event.getRegistry().register(STATION_STAIRS);
        event.getRegistry().register(ROOF_BLIND2_BLOCK);
        event.getRegistry().register(ROOF_BLIND2_BLOCK2);
        event.getRegistry().register(WALL_BLIND_BLOCK);
        event.getRegistry().register(ROOF_BLIND3_BLOCK);
        event.getRegistry().register(ROOF_BLIND3_BLOCK2);
        event.getRegistry().register(FLOOR_BLACK2_BLOCK);
        event.getRegistry().register(CONCRETE_WHITE);
    }

    //fﻭo^ﺓﻠCxgBSideOnlyﺭﮔﭼﺥNCAg۳ﮊﻏﺥﺳﻡﻠBpreinitﮊ^C~Oﺧ­ﺳﺓﻠB
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(EXAMPLE_ITEM, 0, new ModelResourceLocation(new ResourceLocation("kyotostationmod", "example_item"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_GLAY_BLOCK), 0, new ModelResourceLocation(new ResourceLocation("kyotostationmod", "wall_glay_block"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_BLACK_BLOCK1), 0, new ModelResourceLocation(new ResourceLocation("kyotostationmod", "floor_black_block1"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_BLACK_BLOCK2), 0, new ModelResourceLocation(new ResourceLocation("kyotostationmod","floor_black_block2"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_BLACK_TILE), 0, new ModelResourceLocation(new ResourceLocation("kyotostationmod","floor_black_tile"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_BLACK_BLOCK),0, new ModelResourceLocation(new ResourceLocation("kyotostationmod","wall_black_block"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_GREEN_BLOCK),0, new ModelResourceLocation(new ResourceLocation("kyotostationmod","wall_green_block"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_WHITE_BLOCK), 0, new ModelResourceLocation(new ResourceLocation("kyotostationmod","wall_white_block"),"incentory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_BLUE_BLOCK),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","wall_blue_block"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ROOF_WHITE_BLOCK1),0, new ModelResourceLocation(new ResourceLocation("kyotostationmod","roof_white_block1"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ROOF_WHITE_BLOCK2),0, new ModelResourceLocation(new ResourceLocation("kyotostationmod","roof_white_block2"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ROOF_BLIND_BLOCK1),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","roof_blind_block1"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ROOF_BLIND_BLOCK2),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","roof_blind_block2"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_G),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","concrete_g"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(STATION_STAIRS),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","station_stairs"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ROOF_BLIND2_BLOCK),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","roof_blind2_block"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ROOF_BLIND2_BLOCK2),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","roof_blind2_block2"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(WALL_BLIND_BLOCK),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","wall_blind_block"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ROOF_BLIND3_BLOCK),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","roof_blind3_block"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ROOF_BLIND3_BLOCK2),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","roof_blind3_block2"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(FLOOR_BLACK2_BLOCK),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","floor_black2_block"),"inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CONCRETE_WHITE),0,new ModelResourceLocation(new ResourceLocation("kyotostationmod","concrete_white"),"inventory"));
    }
}