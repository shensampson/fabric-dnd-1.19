package net.kai.dndmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kai.dndmod.DnDMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_MITHRIL = registerItem("raw_mithril",
            new Item((new Item.Settings()).group(ItemGroup.MATERIALS)));
            //new Item(new FabricItemSettings().group(ModItemGroup.MITHRIL)));
    //note there are two options for including a mod item in a vanilla item group; here and the code in the mithril item below

    public static final Item MITHRIL = registerItem("mithril",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

            //new Item(new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_SWORD = registerItem("mithril_sword",
            new SwordItem(ModToolMaterials.MITHRIL, 4, 1.6f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            new SwordItem(ToolMaterials.IRON, 2, 1.8f, (new Item.Settings()).group(ItemGroup.COMBAT)));

    public static final Item MITHRIL_HELMET = registerItem("mithril_helmet",
            new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_chestplate",
            new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_leggings",
            new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item MITHRIL_BOOTS = registerItem("mithril_boots",
            new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DnDMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DnDMod.LOGGER.debug("Registering Mod Items for " + DnDMod.MOD_ID);
    }
}
