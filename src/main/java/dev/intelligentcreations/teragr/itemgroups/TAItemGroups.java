package dev.intelligentcreations.teragr.itemgroups;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class TAItemGroups {
    public static final ItemGroup TA_MAIN = FabricItemGroupBuilder.build(
            new Identifier("terrestrial_agriculture", "main"),
            () -> new ItemStack(Blocks.COBBLESTONE));
}
