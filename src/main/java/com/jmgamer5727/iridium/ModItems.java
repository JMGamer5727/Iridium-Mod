package com.jmgamer5727.iridium;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public final class ModItems {
    public static final ResourceKey<Item> RAW_IRIDIUM_KEY = itemKey("raw_iridium");
    public static final ResourceKey<Item> IRIDIUM_INGOT_KEY = itemKey("iridium_ingot");

    public static final Item RAW_IRIDIUM = register(
            RAW_IRIDIUM_KEY, Item::new, new Item.Properties()
    );

    public static final Item IRIDIUM_INGOT = register(
            IRIDIUM_INGOT_KEY, Item::new, new Item.Properties()
    );

    private static ResourceKey<Item> itemKey(String name) {
        return ResourceKey.create(
                Registries.ITEM,
                Identifier.fromNamespaceAndPath(IridiumMod.MOD_ID, name)
        );
    }

    private static Item register(
            ResourceKey<Item> itemKey,
            Function<Item.Properties, Item> factory,
            Item.Properties properties
    ) {
        Item item = factory.apply(properties.setId(itemKey));
        return Registry.register(BuiltInRegistries.ITEM, itemKey, item);
    }

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
                .register(tab -> {
                    tab.accept(RAW_IRIDIUM);
                    tab.accept(IRIDIUM_INGOT);
                });
    }

    private ModItems() {
    }
}
