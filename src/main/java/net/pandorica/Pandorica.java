package net.pandorica;

import net.pandorica.items.*;
import net.pandorica.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.GenerationStep;

public class Pandorica implements ModInitializer {

    public static final Item EXAMPLE_ITEM = new ExampleItem(new Item.Settings().group(ItemGroup.MISC));

    private void handleBiome(Biome biome) {
        if (biome.getCategory() == Biome.Category.NETHER) {
            biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES,
                    Biome.configureFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK,
                            ModBlocks.NETHER_GOLD_ORE.getDefaultState(), 8 // Ore vein size
                    ), Decorator.COUNT_RANGE, new RangeDecoratorConfig(8, // Number of veins per chunk
                            0, // Bottom Offset
                            0, // Min y level
                            64 // Max y level
                    )));
        }
    }

    @Override
    public void onInitialize() {

        ModBlocks.registerAll();

        Registry.register(Registry.ITEM, new Identifier("pandorica", "example_item"), EXAMPLE_ITEM);

        // Loop over existing biomes
        Registry.BIOME.forEach(this::handleBiome);
        // Listen for other biomes being registered
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleBiome(biome));
    }
    
}
