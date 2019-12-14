package net.pandorica;

import net.pandorica.entities.liquefied_skeleton.LiquefiedSkeletonEntity;
import net.pandorica.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Pandorica implements ModInitializer {

    public static final String MOD_ID = "pandorica";
    public static final ItemGroup PANDORICA_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "pandorica_group"), () -> new ItemStack(PandoricaBlocks.ERUPTION_BLOCK));

    public static final EntityType<LiquefiedSkeletonEntity> LIQUEFIED_SKELETON = Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "liquefied_skeleton"), FabricEntityTypeBuilder.create(EntityCategory.MONSTER, LiquefiedSkeletonEntity::new).setImmuneToFire().size(EntityDimensions.fixed(.7F, 2.4F)).build());

    @Override
    public void onInitialize() {
        // register items and blocks
        PandoricaBiomes.registerAll();
        PandoricaBlocks.registerAll();
        PandoricaItems.registerAll();
        
        // world gen
        // PandoricaWorldGen.addNetherOres();
        // PandoricaWorldGen.addNetherMineables();
    }
}
