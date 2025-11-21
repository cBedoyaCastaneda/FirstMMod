package net.chewy.firstmmod.item;

import net.chewy.firstmmod.util.ModTag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier EXBLADE = new SimpleTier(
            ModTag.Blocks.INCORRECT_FOR_EXBLADE,
            2000,
            10f,
            3f,
            15,
            () -> Ingredient.of(ModItems.EXBLADE));
}
