package net.pandorica.world.biome;

// import net.minecraft.entity.EntityCategory;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.carver.Carver;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
// import net.pandorica.Pandorica;
import net.minecraft.world.gen.GenerationStep;

public class SoulValleyBiome extends Biome {
    public SoulValleyBiome() {
        super((new Biome.Settings()).configureSurfaceBuilder(SurfaceBuilder.NETHER, SurfaceBuilder.NETHER_CONFIG)
                .precipitation(Biome.Precipitation.NONE).category(Biome.Category.NETHER).depth(0.1F).scale(0.2F)
                .temperature(2.0F).downfall(0.0F).waterColor(4159204).waterFogColor(329011).parent((String) null));
        this.addCarver(GenerationStep.Carver.AIR, configureCarver(Carver.HELL_CAVE, new ProbabilityConfig(0.2F)));
        // this.addSpawn(EntityCategory.MONSTER, new Biome.SpawnEntry(Pandorica.LIQUEFIED_SKELETON, 1, 4, 4));
    }
}
