package net.pandorica.entities.liquefied_skeleton;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.WitherSkeletonEntityRenderer;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.util.Identifier;

public class LiquefiedSkeletonEntityRenderer extends WitherSkeletonEntityRenderer {

    public LiquefiedSkeletonEntityRenderer(EntityRenderDispatcher entityRenderDispatcher_1) {
        super(entityRenderDispatcher_1);
    }
    
    @Override
	public Identifier getTexture(AbstractSkeletonEntity abstractSkeletonEntity_1) {
        return new Identifier("pandorica:textures/entity/skeleton/liquefied_skeleton.png");
    }
}
