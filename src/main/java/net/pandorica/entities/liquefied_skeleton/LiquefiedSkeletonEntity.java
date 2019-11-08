package net.pandorica.entities.liquefied_skeleton;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;

public class LiquefiedSkeletonEntity extends WitherSkeletonEntity {
    public LiquefiedSkeletonEntity(EntityType<? extends WitherSkeletonEntity> entityType_1, World world_1) {
        super(entityType_1, world_1);
        this.setPathNodeTypeWeight(PathNodeType.LAVA, 8F);
    }

    protected void initEquipment(LocalDifficulty localDifficulty_1) {
        return;
    }

    public void tickMovement() {
        if (this.isAlive() && !this.isInLava() == true) {
            this.damage(DamageSource.DROWN, 1);
        }

        super.tickMovement();
    }
}
