package net.pandorica.init;

import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.pandorica.Pandorica;
import net.pandorica.world.NetherBiomeLayer;
import net.pandorica.world.biome.SoulValleyBiome;

public class PandoricaBiomes {

    public static final Biome SOUL_VALLEY = Registry.register(Registry.BIOME,
            new Identifier(Pandorica.MOD_ID, "soul_valley"), new SoulValleyBiome());

    public static void registerAll() {
        addBiome(SOUL_VALLEY, 100);

        FabricBiomes.addSpawnBiome(PandoricaBiomes.SOUL_VALLEY);
    }

    /**
     * @param biome  the biome to be added to the nether
     * @param weight the chance of this biome being picked over other biomes.
     *               Average weight is 10.
     */
    public static void addBiome(Biome biome, int weight) {
        NetherBiomeLayer.INSTANCE.addBiome(biome, weight);
    }
}
