package net.chewy.firstmmod.util;

import net.chewy.firstmmod.FirstMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModTag {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_EXBLADE = createTag("needs_exblade");
        public static final TagKey<Block> INCORRECT_FOR_EXBLADE = createTag("incorrect_for_exblade");
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(FirstMod.MOD_ID, name));
        };
    }
    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(FirstMod.MOD_ID, name));
        }
    }
}
