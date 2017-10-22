package terrails.ingotter.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import terrails.ingotter.config.ConfigHandler;

import java.util.ArrayList;
import java.util.List;

public class FuelHandler implements IFuelHandler {

    private static final List<Fuel> FUEL_LIST = new ArrayList();

    public static void init() {
        GameRegistry.registerFuelHandler(new FuelHandler());

        addFuel(new ItemStack(ModItems.COAL_NUGGET), 200);
        if (ConfigHandler.dusts)
            addFuel(new ItemStack(ModItems.COAL_DUST), 1800);
        if (ConfigHandler.plates)
            addFuel(new ItemStack(ModItems.COAL_PLATE), 2400);
        if (ConfigHandler.wires)
            addFuel(new ItemStack(ModItems.COAL_WIRE), 800);
    }

    private static void addFuel(Item item, int value)
    {
        FUEL_LIST.add(new Fuel(new ItemStack(item, 1), value));
    }

    private static void addFuel(Block block, int value)
    {
        addFuel(Item.getItemFromBlock(block), value);
    }

    private static void addFuel(ItemStack itemStack, int value)
    {
        FUEL_LIST.add(new Fuel(itemStack, value));
    }

    @Override
    public int getBurnTime(ItemStack stack) {
        for (Fuel fuel : FUEL_LIST) {
            if (stack.isItemEqual(fuel.fuel)) {
                return fuel.burnTime;
            }
        }
        return 0;
    }

    private static class Fuel
    {
        public ItemStack fuel;
        public int burnTime;

        public Fuel(ItemStack fuel, int burnTime)
        {
            this.fuel = fuel;
            this.burnTime = burnTime;
        }
    }
}
