package net.pandorica.init;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.MyceliumBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SignBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pandorica.blocks.*;
import net.pandorica.Pandorica;

public class PandoricaBlocks {

    // define blocks
    public static final Block MOSS_INFESTED_NETHERRACK = new MyceliumBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK).build());
    public static final Block AZURE_MOSS_INFESTED_NETHERRACK = new MyceliumBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).build());
    public static final Block WEEPING_BUTTON = new CustomWoodButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON).build());
    public static final Block WEEPING_DOOR = new CustomDoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR).build());
    public static final Block WEEPING_FENCE = new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).build());
    public static final Block WEEPING_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).build());
    public static final Block WEEPING_LOG = new LogBlock(null, FabricBlockSettings.copy(Blocks.OAK_LOG).build());
    public static final Block STRIPPED_WEEPING_LOG = new LogBlock(null, FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).build());
    public static final Block WEEPING_PLANKS = new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).build());
    public static final Block WEEPING_PRESSURE_PLATE = new CustomPressurePlateBlock(null, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE).build());
    public static final Block WEEPING_SIGN = new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN).build());
    public static final Block WEEPING_WALL_SIGN = new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN).build());
    public static final Block WEEPING_STAIRS = new CustomStairsBlock(WEEPING_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS).build());
    public static final Block WEEPING_SLAB = new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).build());
    public static final Block WEEPING_TRAPDOOR = new CustomTrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR).build());
    public static final Block WEEPING_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).build());
    public static final Block STRIPPED_WEEPING_WOOD = new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).build());
    public static final Block ERUPTION_BLOCK = new EruptionBlockBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).build());
    public static final Block MAGMATIC_NETHERRACK = new MagmaticNetherrackBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).build());
    public static final Block BASALT = new Block(FabricBlockSettings.copy(Blocks.SAND).breakByTool(FabricToolTags.SHOVELS).build());
    public static final Block NETHER_GOLD_ORE = new Block(FabricBlockSettings.copy(Blocks.GOLD_ORE).build());

    public static void registerAll() {

        // register blocks
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "moss_infested_netherrack"), MOSS_INFESTED_NETHERRACK);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "azure_moss_infested_netherrack"), AZURE_MOSS_INFESTED_NETHERRACK);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_button"), WEEPING_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_door"), WEEPING_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_fence"), WEEPING_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_fence_gate"), WEEPING_FENCE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_log"), WEEPING_LOG);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "stripped_weeping_log"), STRIPPED_WEEPING_LOG);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_planks"), WEEPING_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_pressure_plate"), WEEPING_PRESSURE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_sign"), WEEPING_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_wall_sign"), WEEPING_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_stairs"), WEEPING_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_slab"), WEEPING_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_trapdoor"), WEEPING_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "weeping_wood"), WEEPING_WOOD);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "stripped_weeping_wood"), STRIPPED_WEEPING_WOOD);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "eruption_block"), ERUPTION_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "magmatic_netherrack"), MAGMATIC_NETHERRACK);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "basalt"), BASALT);
        Registry.register(Registry.BLOCK, new Identifier(Pandorica.MOD_ID, "nether_gold_ore"), NETHER_GOLD_ORE);
    }
}
