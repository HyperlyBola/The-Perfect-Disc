package net.hyperly.theperfectdisc;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThePerfectDisc implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("theperfectdisc");

	@Override
	public void onInitialize() {
		// Testing
		LOGGER.info("Hello Fabric world!");
	}
}
