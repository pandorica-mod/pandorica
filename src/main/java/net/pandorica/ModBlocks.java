package net.pandorica;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pandorica.blocks.EruptionBlockBlock;

public class ModBlocks {
    public static final Block NETHER_GOLD_ORE = new Block(FabricBlockSettings.copy(Blocks.GOLD_ORE).build());
    public static final Block BASALT = new Block(FabricBlockSettings.copy(Blocks.SAND).build());
    public static final Block ERUPTION_BLOCK = new EruptionBlockBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).build());

    public static void registerAll() {
        Registry.register(Registry.BLOCK, new Identifier("pandorica", "nether_gold_ore"), NETHER_GOLD_ORE);
        Registry.register(Registry.ITEM, new Identifier("pandorica", "nether_gold_ore"), new BlockItem(NETHER_GOLD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("pandorica", "basalt"), BASALT);
        Registry.register(Registry.ITEM, new Identifier("pandorica", "basalt"), new BlockItem(BASALT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("pandorica", "eruption_block"), ERUPTION_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("pandorica", "eruption_block"), new BlockItem(ERUPTION_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
