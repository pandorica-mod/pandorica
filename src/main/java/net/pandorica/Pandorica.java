package net.pandorica;

import net.pandorica.ModBlocks;
import net.pandorica.world.NetherOres;
import net.fabricmc.api.ModInitializer;

public class Pandorica implements ModInitializer {

    @Override
    public void onInitialize() {
        ModBlocks.registerAll();
        ModItems.registerAll();
        NetherOres.addNetherOres();
        NetherOres.addNetherMineables();
    }

}
