package es.gaspardev.the_buildcraft_reforge.core.utilities;

import es.gaspardev.the_buildcraft_reforge.TheBuildCraftReforge;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TheBuildCraftReforgeBlockRegister {

    public static Block register(Block block, String name, boolean shouldRegisterItem){
        Identifier id = Identifier.of(TheBuildCraftReforge.MOD_ID,name);

        if(shouldRegisterItem){
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM,id,blockItem);
        }

        return Registry.register(Registries.BLOCK,id,block);
    }

}
