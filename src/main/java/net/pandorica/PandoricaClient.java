package net.pandorica;

import net.fabricmc.api.ClientModInitializer;
import net.pandorica.init.*;

public class PandoricaClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //register entity renderers
        PandoricaEntityRenderers.registerAll();
    }

}
