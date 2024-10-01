package es.gaspardev.the_buildcraft_reforge.core.builders;

import es.gaspardev.the_buildcraft_reforge.core.utilities.TheBuildCraftReforgeItemRegister;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;


public class ItemBuilder {

    private static Item internalItem = null;

    public static Item createItem(String itemId){
      internalItem = TheBuildCraftReforgeItemRegister.register(internalItem, itemId);
        return  internalItem;
    }

    public static  void addToGroup(RegistryKey<ItemGroup> itemGroup){
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register((group)->group.add(internalItem));
    }

    public static  void isFuel(int fuelTicks){
        FuelRegistry.INSTANCE.add(internalItem, fuelTicks);
    }

}
