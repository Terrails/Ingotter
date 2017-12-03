package terrails.ingotter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.util.EnumHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import terrails.ingotter.init.tabs.ModResourcesCreativeTab;
import terrails.ingotter.init.tabs.ModToolsCreativeTab;

public class Constants {

    public static final String MOD_ID = "ingotter";
    public static final String MOD_NAME = "Ingotter";

    public static final String VERSION = "2.0.3";
    public static final String TERRACORE_VERSION = "2.1.3";
    public static final String ORE_CONTROLLER_VERSION = "1.0.0";
    public static final String MC_VERSION = "[1.12],[1.12.1],[1.12.2]";

    public static final String CLIENT_PROXY = "terrails.ingotter.proxies.ClientProxy";
    public static final String SERVER_PROXY = "terrails.ingotter.proxies.ServerProxy";
    public static final String GUI_FACTORY = "terrails.ingotter.config.ConfigFactoryGUI";

    public static final ModResourcesCreativeTab RESOURCES_TAB = new ModResourcesCreativeTab();
    public static final ModToolsCreativeTab TOOLS_TAB = new ModToolsCreativeTab();

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    public static void playerMessage(EntityPlayer player, String message) {
        player.sendMessage(new TextComponentString("[" + TextFormatting.GREEN + MOD_NAME + TextFormatting.RESET + "] " + message));
    }

    public static class Materials {
        public static final Item.ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("COPPER", 2, 179, 5.0F, 0.8F, 8);
        public static final Item.ToolMaterial TIN_TOOL = EnumHelper.addToolMaterial("TIN", 2, 199, 6.0F, 1.2F, 10);
        public static final Item.ToolMaterial SILVER_TOOL = EnumHelper.addToolMaterial("SILVER", 3, 215, 6.2F, 1.8F, 21);
        public static final Item.ToolMaterial LEAD_TOOL = EnumHelper.addToolMaterial("LEAD", 2, 149, 5.5F, 1.2F, 11);
        public static final Item.ToolMaterial ALUMINUM_TOOL = EnumHelper.addToolMaterial("ALUMINUM", 2, 255, 11.0F, 1.2F, 14);
        public static final Item.ToolMaterial NICKEL_TOOL = EnumHelper.addToolMaterial("NICKEL", 2, 299, 7.0F, 2.1F, 16);
        public static final Item.ToolMaterial PLATINUM_TOOL = EnumHelper.addToolMaterial("PLATINUM", 4, 1800, 10.0F, 4.5F, 10);
        public static final Item.ToolMaterial STEEL_TOOL = EnumHelper.addToolMaterial("STEEL", 2, 650, 7.5F, 2.1F, 11);
        public static final Item.ToolMaterial ELECTRUM_TOOL = EnumHelper.addToolMaterial("ELECTRUM", 2, 115, 15.0F, 0.5F, 27);
        public static final Item.ToolMaterial BRONZE_TOOL = EnumHelper.addToolMaterial("BRONZE", 2, 650, 7.0F, 2.5F, 18);
        public static final Item.ToolMaterial EMERALD_TOOL = EnumHelper.addToolMaterial("EMERALD", 4, 1656, 13.0F, 3.0F, 21);
        public static final Item.ToolMaterial LAPIS_TOOL = EnumHelper.addToolMaterial("LAPIS", 2, 255, 4.8F, 0.7F, 22);
        public static final Item.ToolMaterial REDSTONE_TOOL = EnumHelper.addToolMaterial("REDSTONE", 2, 200, 4.2F, 0.4F, 22);

        public static final ItemArmor.ArmorMaterial COPPER_ARMOR = EnumHelper.addArmorMaterial("COPPER", "ingotter:copper", 7, new int[] { 2, 4, 4, 2 }, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial TIN_ARMOR = EnumHelper.addArmorMaterial("TIN", "ingotter:tin", 9, new int[] { 2, 4, 5, 2 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial SILVER_ARMOR = EnumHelper.addArmorMaterial("SILVER", "ingotter:silver", 11, new int[] { 3, 5, 5, 2 }, 24, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial LEAD_ARMOR = EnumHelper.addArmorMaterial("LEAD", "ingotter:lead", 17, new int[] { 3, 5, 6, 4 }, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial ALUMINUM_ARMOR = EnumHelper.addArmorMaterial("ALUMINUM", "ingotter:aluminum", 13, new int[] { 2, 4, 5, 3 }, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial NICKEL_ARMOR = EnumHelper.addArmorMaterial("NICKEL", "ingotter:nickel", 16, new int[] { 3, 6, 6, 3 }, 19, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial PLATINUM_ARMOR = EnumHelper.addArmorMaterial("PLATINUM", "ingotter:platinum", 44, new int[] { 4, 7, 9, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial STEEL_ARMOR = EnumHelper.addArmorMaterial("STEEL", "ingotter:steel", 24, new int[] { 3, 6, 8, 3 }, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.3F);
        public static final ItemArmor.ArmorMaterial ELECTRUM_ARMOR = EnumHelper.addArmorMaterial("ELECTRUM", "ingotter:electrum", 8, new int[] { 2, 4, 4, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial BRONZE_ARMOR = EnumHelper.addArmorMaterial("BRONZE", "ingotter:bronze", 19, new int[] { 3, 7, 7, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial EMERALD_ARMOR = EnumHelper.addArmorMaterial("EMERALD", "ingotter:emerald", 40, new int[] { 4, 6, 8, 4 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial LAPIS_ARMOR = EnumHelper.addArmorMaterial("LAPIS", "ingotter:lapis", 6, new int[] { 2, 4, 3, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
        public static final ItemArmor.ArmorMaterial REDSTONE_ARMOR = EnumHelper.addArmorMaterial("REDSTONE", "ingotter:redstone", 6, new int[] { 2, 3, 2, 2 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    }
}
