package terrails.ingotter.init.tabs;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import terrails.ingotter.Constants;
import terrails.ingotter.config.ConfigHandler;
import terrails.ingotter.init.ModItems;

import javax.annotation.Nonnull;

public class ModToolsCreativeTab extends CreativeTabs {

    private NonNullList<ItemStack> list;

    public ModToolsCreativeTab() {
        super("ingotter_tools");
    }

    @Override
    @Nonnull
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.HAMMER);
    }


    @SideOnly(Side.CLIENT)
    @Override
    public void displayAllRelevantItems(@Nonnull NonNullList<ItemStack> list) {
        this.list = list;

        if(ConfigHandler.tools) {
            this.add(ModItems.HAMMER);
            this.add(ModItems.WIRE_CUTTERS);
        }

        for (Item item : ModItems.getItems()) {
            if (item != ModItems.WIRE_CUTTERS && item != ModItems.HAMMER) {
                if (ConfigHandler.armor) {
                    if (item.getUnlocalizedName().contains("_helmet") || item.getUnlocalizedName().contains("_chestplate") || item.getUnlocalizedName().contains("_leggings") || item.getUnlocalizedName().contains("_boots")) {
                        this.add(item);
                    }
                }
                if (ConfigHandler.tools) {
                    if (item.getUnlocalizedName().contains("_sword") || item.getUnlocalizedName().contains("_pickaxe") || item.getUnlocalizedName().contains("_axe") || item.getUnlocalizedName().contains("_shovel") || item.getUnlocalizedName().contains("_hoe")) {
                        this.add(item);
                    }
                }
            }
        }
    }

    private void add(Item item){
        if(item != null){
            item.getSubItems(item, Constants.TOOLS_TAB, this.list);
        }
    }
    private void add(Block block){
        if(block != null){
            block.getSubBlocks(new ItemStack(block).getItem(), Constants.TOOLS_TAB, this.list);
        }
    }
    private void add(Item item, int meta){
        if(item != null){
            new ItemStack(item, 1, meta).getItem().getSubItems(new ItemStack(item, 1, meta).getItem(), Constants.TOOLS_TAB, this.list);
        }
    }
}