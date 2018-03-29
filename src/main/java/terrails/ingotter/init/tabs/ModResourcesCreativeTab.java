package terrails.ingotter.init.tabs;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.StringUtils;
import terrails.ingotter.config.ConfigHandler;
import terrails.ingotter.init.ModBlocks;
import terrails.ingotter.init.ModItems;
import terrails.terracore.creativetab.CreativeTabsBase;

import javax.annotation.Nonnull;

public class ModResourcesCreativeTab extends CreativeTabsBase {

    public ModResourcesCreativeTab() {
        super("ingotter_resources");
    }

    @Nonnull
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.COPPER_ORE);
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void displayAllRelevantItems(@Nonnull NonNullList<ItemStack> list) {
        this.list = list;

        if (ConfigHandler.ores) {
            for (Block block : ModBlocks.get()) {
                if (!block.getUnlocalizedName().contains("_block")) {
                    add(block);
                }
            }
        }

        for (Item item : ModItems.get()) {
            if (item != ModItems.WIRE_CUTTERS && item != ModItems.HAMMER) {
                boolean valn = StringUtils.containsAny(item.getUnlocalizedName(), "_ingot", "_nugget", "_plate", "_wire", "_dust");
                if (valn) {
                    add(item);
                }
            }
        }
    }
}
