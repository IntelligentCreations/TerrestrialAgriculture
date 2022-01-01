package dev.intelligentcreations.teragr;

import dev.intelligentcreations.teragr.registries.TAItemRegistry;
import net.fabricmc.api.ModInitializer;

public class TerAgr implements ModInitializer {

	@Override
	public void onInitialize() {
		TAItemRegistry.register();
	}
}
