package net.inno.prospectingtool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.inno.prospectingtool.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ORE_PROSPECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PULSATING_CONDUCTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_PROSPECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOSS_PROSPECTOR, Models.GENERATED);
    }
}
