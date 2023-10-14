package net.inno.prospectingtool;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.inno.prospectingtool.datagen.ModBlockTagProvider;
import net.inno.prospectingtool.datagen.ModModelProvider;
import net.inno.prospectingtool.datagen.ModRecipeProvider;

public class ProspectingToolDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModRecipeProvider::new);

	}
}
