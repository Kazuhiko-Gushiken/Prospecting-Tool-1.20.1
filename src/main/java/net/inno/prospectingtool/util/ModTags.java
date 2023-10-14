package net.inno.prospectingtool.util;

import net.inno.prospectingtool.ProspectingTool;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ORE_PROSPECTING_ORES =
                createTag("ore_prospecting_ores");

        public static final TagKey<Block> STONE_PROSPECTING_STONES =
                createTag("stones_prospecting_stones");

        public static final TagKey<Block> MOSS_PROSPECTING =
                createTag("moss_prospecting");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(ProspectingTool.MOD_ID, name));
        }
    }
}
