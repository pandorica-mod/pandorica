package net.pandorica;

import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pandorica.entities.EntityRegistryBuilder;
import net.pandorica.entities.MobEntity.Magmator.MagmatorEntity;

public class ModEntities {

    public static final EntityType<MagmatorEntity> MAGMATOR = EntityRegistryBuilder.<MagmatorEntity>createBuilder(new Identifier("pandorica", "magmator"))
                .entity(MagmatorEntity::new)
                .category(EntityCategory.MONSTER)
                .egg(0x9b744d, 0x353837)
                .hasEgg(true)
                .dimensions(EntityDimensions.fixed(2.0F, 2.0F))
                .build();

}
