package es.gaspardev.the_buildcraft_reforge.core.builders;

import es.gaspardev.the_buildcraft_reforge.core.utilities.TheBuildCraftReforgeBlockRegister;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class BlockBuilder {

    private static Block internalBlock = null;

    public static Block createBlock(String itemId, boolean shouldRegisterItem) {
        internalBlock = TheBuildCraftReforgeBlockRegister.register(internalBlock, itemId, shouldRegisterItem);
        return internalBlock;
    }

    public static  void addToGroup(RegistryKey<ItemGroup> itemGroup){
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register((group)->group.add(internalBlock));
    }

    public static  void isFuel(int fuelTicks){
        FuelRegistry.INSTANCE.add(internalBlock, fuelTicks);
    }
}
