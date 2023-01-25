package net.mocha.fleshyleather.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mocha.fleshyleather.FleshyLeather;

public class ModItems {

    public static final Item ROTTEN_LEATHER = registerItem("rotten_leather",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FleshyLeather.MOD_ID, name), item);
    }
    public static void registerModItems(){
        FleshyLeather.LOGGER.debug("Registering Mod Items for "+ FleshyLeather.MOD_ID);
    }


}
