package johnseagull.eateverything.client;

import johnseagull.eateverything.Figs;
import johnseagull.figManagerClient.FigManagerClient;
import net.fabricmc.api.ClientModInitializer;

public class EateverythingClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        FigManagerClient figManagerClient = new FigManagerClient();
        figManagerClient.init(Figs.instance, 100);
    }
}
