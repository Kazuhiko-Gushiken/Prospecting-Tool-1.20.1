package net.inno.prospectingtool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags;
import net.inno.prospectingtool.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.ORE_PROSPECTING_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(ConventionalBlockTags.ORES);

        getOrCreateTagBuilder(ModTags.Blocks.STONE_PROSPECTING_STONES)
                .add(Blocks.ANDESITE)
                .add(Blocks.GRANITE)
                .add(Blocks.DIORITE);

        getOrCreateTagBuilder(ModTags.Blocks.MOSS_PROSPECTING)
                .add(Blocks.MOSS_BLOCK)
                .add(Blocks.MOSS_CARPET)
                .add(Blocks.AZALEA)
                .add(Blocks.FLOWERING_AZALEA)
                .add(Blocks.CLAY);

    }
}
