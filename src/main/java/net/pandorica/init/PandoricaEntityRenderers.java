package net.pandorica.init;

import net.fabricmc.fabric.api.client.render.EntityRendererRegistry;
import net.pandorica.entities.liquefied_skeleton.*;

public class PandoricaEntityRenderers {
    public static void registerAll() {
        EntityRendererRegistry.INSTANCE.register(LiquefiedSkeletonEntity.class, (entityRenderDispatcher, context) -> new LiquefiedSkeletonEntityRenderer(entityRenderDispatcher));
    }
}
