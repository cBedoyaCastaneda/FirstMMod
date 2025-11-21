package net.chewy.firstmmod.item;

import net.chewy.firstmmod.FirstMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;   // ← ESTE IMPORT ES CLAVE
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FirstMod.MOD_ID);
    public static final DeferredItem<SwordItem> EXBLADE = ITEMS.register("exblade", () ->
            new SwordItem(ModToolTiers.EXBLADE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.EXBLADE, 8, -2F))));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}