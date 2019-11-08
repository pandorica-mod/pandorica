package net.pandorica.init;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pandorica.Pandorica;

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
    }
}
