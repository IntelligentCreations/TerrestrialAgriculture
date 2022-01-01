package dev.intelligentcreations.teragr.items.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static dev.intelligentcreations.teragr.itemgroups.TAItemGroups.TA_MAIN;

public class TAGeneralItems {
    public static final Item SILVER_INGOT = new Item(new FabricItemSettings().group(TA_MAIN));
    public static final Item SILVER_PLATE = new Item(new FabricItemSettings().group(TA_MAIN));
    public static final Item SILVER_NUGGET = new Item(new FabricItemSettings().group(TA_MAIN));
    public static final Item SILVER_DUST = new Item(new FabricItemSettings().group(TA_MAIN));
    public static final Item SILVER_RAW_ORE = new Item(new FabricItemSettings().group(TA_MAIN));
    public static final Item SILVER_ROD = new Item(new FabricItemSettings().group(TA_MAIN));
    public static final Item SILVER_LARGE_PLATE = new Item(new FabricItemSettings().group(TA_MAIN));
    public static final Item SILVER_GEAR = new Item(new FabricItemSettings().group(TA_MAIN));
}
