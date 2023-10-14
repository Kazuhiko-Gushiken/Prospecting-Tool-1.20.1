package net.inno.prospectingtool.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.inno.prospectingtool.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ORE_PROSPECTOR, 1)
                .pattern("DCD")
                .pattern("IWI")
                .pattern(" W ")
                .input('D', Items.DIAMOND)
                .input('I', Items.IRON_INGOT)
                .input('W', ItemTags.LOGS)
                .input('C', ModItems.PULSATING_CONDUCTOR)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ORE_PROSPECTOR)));

        offerBlasting(exporter, List.of(Items.COPPER_BLOCK), RecipeCategory.MISC, ModItems.PULSATING_CONDUCTOR, 10,600, String.valueOf(1));
    }
}
