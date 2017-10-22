package terrails.ingotter.init.tabs;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import terrails.ingotter.Constants;
import terrails.ingotter.config.ConfigHandler;
import terrails.ingotter.init.ModBlocks;
import terrails.ingotter.init.ModItems;

import javax.annotation.Nonnull;
import java.util.List;

public class ModResourcesCreativeTab extends CreativeTabs {

    private List<ItemStack> list;

    public ModResourcesCreativeTab() {
        super("ingotter_resources");
    }

    @Override
    @Nonnull
    public Item getTabIconItem() {
        return new ItemStack(ModBlocks.COPPER_ORE).getItem();
    }


    @SideOnly(Side.CLIENT)
    @Override
    public void displayAllRelevantItems(@Nonnull List<ItemStack> list) {
        this.list = list;

        if (ConfigHandler.ores) {
            for (Block block : ModBlocks.getBlocks()) {
                if (!block.getUnlocalizedName().contains("_block"))
                    this.add(block);
            }
        }

        for (Item item : ModItems.getItems()) {
            if (item != ModItems.WIRE_CUTTERS && item != ModItems.HAMMER) {
                if (item.getUnlocalizedName().contains("_ingot") || item.getUnlocalizedName().contains("_nugget")) {
                    this.add(item);
                }
                else if (ConfigHandler.plates && item.getUnlocalizedName().contains("_plate")) {
                    this.add(item);
                }
                else if (ConfigHandler.wires && item.getUnlocalizedName().contains("_wire")) {
                    this.add(item);
                }
                else if (ConfigHandler.dusts && item.getUnlocalizedName().contains("_dust")) {
                    this.add(item);
                }
            }
        }
    }

    private void add(Item item){
        if(item != null){
            item.getSubItems(item, Constants.RESOURCES_TAB, this.list);
        }
    }
    private void add(Block block){
        if(block != null){
            block.getSubBlocks(new ItemStack(block).getItem(), Constants.RESOURCES_TAB, this.list);
        }
    }
    private void add(Item item, int meta){
        if(item != null){
            new ItemStack(item, 1, meta).getItem().getSubItems(new ItemStack(item, 1, meta).getItem(), Constants.RESOURCES_TAB, this.list);
        }
    }
}
