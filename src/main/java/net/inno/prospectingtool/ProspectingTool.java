package net.inno.prospectingtool;

import net.fabricmc.api.ModInitializer;

import net.inno.prospectingtool.datagen.ModModelProvider;
import net.inno.prospectingtool.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProspectingTool implements ModInitializer {
	public static final String MOD_ID = "prospectingtool";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
	}
}