package net.inno.prospectingtool.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.inno.prospectingtool.ProspectingTool;
import net.inno.prospectingtool.item.custom.MossProspectorItem;
import net.inno.prospectingtool.item.custom.OreProspectorItem;
import net.inno.prospectingtool.item.custom.StoneProspectorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ORE_PROSPECTOR = regiterItem("ore_prospector", new OreProspectorItem(new FabricItemSettings().maxDamage(250)));
    public static final Item PULSATING_CONDUCTOR = regiterItem("pulsating_conductor", new Item(new FabricItemSettings()));
    public static final Item STONE_PROSPECTOR = regiterItem("stone_prospector", new StoneProspectorItem(new FabricItemSettings().maxDamage(500)));
    public static final Item MOSS_PROSPECTOR = regiterItem("moss_prospector", new MossProspectorItem(new FabricItemSettings().maxDamage(200)));


    private static Item regiterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ProspectingTool.MOD_ID, name), item);
    }

    private static void addItemstoToolsTab(FabricItemGroupEntries entries) {
        entries.add(ORE_PROSPECTOR);
        entries.add(STONE_PROSPECTOR);
        entries.add(MOSS_PROSPECTOR);
    }

    private static void addItemstoIngredientsTab(FabricItemGroupEntries entries) {
        entries.add(PULSATING_CONDUCTOR);
    }

    public static void registerModItems() {
        ProspectingTool.LOGGER.info("Registering Mod Items for " +ProspectingTool.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemstoToolsTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemstoIngredientsTab);
    }
}
