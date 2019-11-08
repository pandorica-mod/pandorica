package net.pandorica.init;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pandorica.blocks.EruptionBlockBlock;
// import net.pandorica.blocks.NetherChestBlock;
import net.pandorica.blocks.WeepingLogBlock;
import net.pandorica.blocks.WeepingWoodBlock;
import net.pandorica.Pandorica;

public class PandoricaBlocks {
    // define blocks
    public static final Block WEEPING_LOG = new WeepingLogBlock(null, FabricBlockSettings.copy(Blocks.OAK_LOG).build());
    public static final Block WEEPING_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).build());
    public static final Block WEEPING_WOOD = new WeepingWoodBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).build());
    public static final Block ERUPTION_BLOCK = new EruptionBlockBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).build());
    public static final Block BASALT = new Block(FabricBlockSettings.copy(Blocks.SAND).breakByTool(FabricToolTags.SHOVELS).build());
    public static final Block NETHER_GOLD_ORE = new Block(FabricBlockSettings.copy(Blocks.GOLD_ORE).build());
    // public static final Block NETHER_BRICK_CHEST = new NetherChestBlock(FabricBlockSettings.copy(Blocks.NETHER_BRICKS).build());

    public static void registerAll() {
        // register blocks and block items

        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_log"), WEEPING_LOG);
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_log"), new BlockItem(WEEPING_LOG, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_planks"), WEEPING_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_planks"), new BlockItem(WEEPING_PLANKS, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_wood"), WEEPING_WOOD);
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_wood"), new BlockItem(WEEPING_WOOD, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "eruption_block"), ERUPTION_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "eruption_block"), new BlockItem(ERUPTION_BLOCK, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "basalt"), BASALT);
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "basalt"), new BlockItem(BASALT, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "nether_gold_ore"), NETHER_GOLD_ORE);
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "nether_gold_ore"), new BlockItem(NETHER_GOLD_ORE, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));

        // Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "nether_brick_chest"), NETHER_BRICK_CHEST);
        // Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "nether_brick_chest"), new BlockItem(NETHER_BRICK_CHEST, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
    }
}
