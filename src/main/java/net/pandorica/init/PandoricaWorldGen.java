package net.pandorica.init;

import net.pandorica.init.PandoricaBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class PandoricaWorldGen {
    public static void addNetherOres() {
        for (Biome biome : Registry.BIOME) {
            if (biome.getCategory() == Biome.Category.NETHER) {
                biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES,
                        Biome.configureFeature(Feature.ORE,
                                new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK,
                                        PandoricaBlocks.NETHER_GOLD_ORE.getDefaultState(), 9),
                                Decorator.COUNT_RANGE, new RangeDecoratorConfig(16, 0, 0, 128)));
            }
        }
    }

    public static void addNetherMineables() {
        for (Biome biome : Registry.BIOME) {
            if (biome.getCategory() == Biome.Category.NETHER) {
                biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES,
                        Biome.configureFeature(Feature.ORE,
                                new OreFeatureConfig(OreFeatureConfig.Target.NETHERRACK,
                                        PandoricaBlocks.BASALT.getDefaultState(), 35),
                                Decorator.MAGMA, new CountDecoratorConfig(15)));
            }
        }
    }
}
