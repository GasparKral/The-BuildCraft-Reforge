package es.gaspardev.the_buildcraft_reforge.core.utilities;

import es.gaspardev.the_buildcraft_reforge.TheBuildCraftReforge;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TheBuildCraftReforgeItemRegister {

    public  static  Item register(Item item, String id){
        Identifier itemID = Identifier.of(TheBuildCraftReforge.MOD_ID, id);

     return Registry.register(Registries.ITEM, itemID, item);
    }
}