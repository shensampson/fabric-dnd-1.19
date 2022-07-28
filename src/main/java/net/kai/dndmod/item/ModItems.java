package net.kai.dndmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kai.dndmod.DnDMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_MITHRIL = registerItem("raw_mithril",
            new Item(new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL = registerItem("mithril",
            new Item(new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    //new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

            //new Item((new Item.Settings()).group(ItemGroup.MATERIALS)));

    //     RAW_IRON = register("raw_iron",


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DnDMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DnDMod.LOGGER.debug("Registering Mod Items for " + DnDMod.MOD_ID);
    }
}
