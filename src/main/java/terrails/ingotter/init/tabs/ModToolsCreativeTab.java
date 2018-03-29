package terrails.ingotter.init.tabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.StringUtils;
import terrails.ingotter.config.ConfigHandler;
import terrails.ingotter.init.ModItems;
import terrails.terracore.creativetab.CreativeTabsBase;

import javax.annotation.Nonnull;

public class ModToolsCreativeTab extends CreativeTabsBase {

    public ModToolsCreativeTab() {
        super("ingotter_tools");
    }

    @Nonnull
    @Override
    public ItemStack getTabIconItem() {
        if (ConfigHandler.wireHammer)
            return new ItemStack(ModItems.HAMMER);
        else if (ConfigHandler.tools)
            return new ItemStack(ModItems.BRONZE_SWORD);
        else if (ConfigHandler.armor)
            return new ItemStack(ModItems.BRONZE_HELMET);
        return ItemStack.EMPTY;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void displayAllRelevantItems(@Nonnull NonNullList<ItemStack> list) {
        this.list = list;

        if(ConfigHandler.wireHammer) {
            add(ModItems.HAMMER);
            add(ModItems.WIRE_CUTTERS);
        }

        for (Item item : ModItems.get()) {
            if (item != ModItems.WIRE_CUTTERS && item != ModItems.HAMMER && (ConfigHandler.armor || ConfigHandler.tools)) {
                boolean valn = StringUtils.containsAny(item.getUnlocalizedName(), "_helmet", "_chestplate", "_leggings", "_boots");
                boolean valm = StringUtils.containsAny(item.getUnlocalizedName(), "_sword", "_pickaxe", "_axe", "_shovel", "_hoe");
                if (valn || valm) {
                    add(item);
                }
            }
        }
    }
}