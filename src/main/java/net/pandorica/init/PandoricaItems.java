package net.pandorica.init;

import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pandorica.Pandorica;
import net.pandorica.init.PandoricaBlocks;

public class PandoricaItems {

    // define items
    public static final Item BASALT_DUST = new Item(new Item.Settings().group(Pandorica.PANDORICA_GROUP));
    public static final Item CRUSTED_MAGMA = new Item(new Item.Settings().group(Pandorica.PANDORICA_GROUP));
    public static final Item LIQUEFIED_BONE = new Item(new Item.Settings().group(Pandorica.PANDORICA_GROUP));

    public static void registerAll() {
        // register items
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "basalt_dust"), BASALT_DUST);
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "crusted_magma"), CRUSTED_MAGMA);
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "liquefied_bone"), LIQUEFIED_BONE);

        //register block items
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "azure_moss_infested_netherrack"), new BlockItem(PandoricaBlocks.AZURE_MOSS_INFESTED_NETHERRACK, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "eruption_block"), new BlockItem(PandoricaBlocks.ERUPTION_BLOCK, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "magmatic_netherrack"), new BlockItem(PandoricaBlocks.MAGMATIC_NETHERRACK, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "basalt"), new BlockItem(PandoricaBlocks.BASALT, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "nether_gold_ore"), new BlockItem(PandoricaBlocks.NETHER_GOLD_ORE, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_button"), new BlockItem(PandoricaBlocks.WEEPING_BUTTON, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_door"), new BlockItem(PandoricaBlocks.WEEPING_DOOR, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_fence"), new BlockItem(PandoricaBlocks.WEEPING_FENCE, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_fence_gate"), new BlockItem(PandoricaBlocks.WEEPING_FENCE_GATE, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_log"), new BlockItem(PandoricaBlocks.WEEPING_LOG, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "stripped_weeping_log"), new BlockItem(PandoricaBlocks.STRIPPED_WEEPING_LOG, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_pressure_plate"), new BlockItem(PandoricaBlocks.WEEPING_PRESSURE_PLATE, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_planks"), new BlockItem(PandoricaBlocks.WEEPING_PLANKS, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_sign"), new BlockItem(PandoricaBlocks.WEEPING_SIGN, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_stairs"), new BlockItem(PandoricaBlocks.WEEPING_STAIRS, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_slab"), new BlockItem(PandoricaBlocks.WEEPING_SLAB, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_trapdoor"), new BlockItem(PandoricaBlocks.WEEPING_TRAPDOOR, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "weeping_wood"), new BlockItem(PandoricaBlocks.WEEPING_WOOD, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(Pandorica.MOD_ID, "stripped_weeping_wood"), new BlockItem(PandoricaBlocks.STRIPPED_WEEPING_WOOD, new Item.Settings().group(Pandorica.PANDORICA_GROUP)));
    }
}
