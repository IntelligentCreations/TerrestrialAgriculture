package dev.intelligentcreations.teragr.registries;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.intelligentcreations.teragr.items.init.TAGeneralItems.*;

public class TAItemRegistry {
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("terrestrial_agriculture", "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier("terrestrial_agriculture", "silver_plate"), SILVER_PLATE);
        Registry.register(Registry.ITEM, new Identifier("terrestrial_agriculture", "silver_nugget"), SILVER_NUGGET);
        Registry.register(Registry.ITEM, new Identifier("terrestrial_agriculture", "silver_dust"), SILVER_DUST);
        Registry.register(Registry.ITEM, new Identifier("terrestrial_agriculture", "silver_raw_ore"), SILVER_RAW_ORE);
        Registry.register(Registry.ITEM, new Identifier("terrestrial_agriculture", "silver_rod"), SILVER_ROD);
        Registry.register(Registry.ITEM, new Identifier("terrestrial_agriculture", "silver_large_plate"), SILVER_LARGE_PLATE);
        Registry.register(Registry.ITEM, new Identifier("terrestrial_agriculture", "silver_gear"), SILVER_GEAR);
    }
}
