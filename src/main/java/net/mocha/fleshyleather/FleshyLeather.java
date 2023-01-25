package net.mocha.fleshyleather;

import net.fabricmc.api.ModInitializer;

import net.mocha.fleshyleather.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FleshyLeather implements ModInitializer {


	public static final String MOD_ID = "fleshyleather";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}