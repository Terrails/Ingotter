package terrails.ingotter.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import terrails.ingotter.Constants;
import terrails.ingotter.config.ConfigHandler;
import terrails.terracore.item.ArmorBase;
import terrails.terracore.item.ItemBase;
import terrails.terracore.item.ItemCraftingDurabilityBase;
import terrails.terracore.item.tool.*;
import terrails.terracore.registry.ItemRegistry;

@Mod.EventBusSubscriber
public class ModItems extends ItemRegistry {

    public static Item HAMMER;
    public static Item WIRE_CUTTERS;

    public static Item COPPER_INGOT;
    public static Item TIN_INGOT;
    public static Item SILVER_INGOT;
    public static Item LEAD_INGOT;
    public static Item ALUMINUM_INGOT;
    public static Item NICKEL_INGOT;
    public static Item PLATINUM_INGOT;
    public static Item STEEL_INGOT;
    public static Item ELECTRUM_INGOT;
    public static Item BRONZE_INGOT;

    public static Item COPPER_NUGGET;
    public static Item TIN_NUGGET;
    public static Item SILVER_NUGGET;
    public static Item LEAD_NUGGET;
    public static Item ALUMINUM_NUGGET;
    public static Item NICKEL_NUGGET;
    public static Item PLATINUM_NUGGET;
    public static Item STEEL_NUGGET;
    public static Item ELECTRUM_NUGGET;
    public static Item BRONZE_NUGGET;
    public static Item IRON_NUGGET;
    public static Item COAL_NUGGET;
    public static Item DIAMOND_NUGGET;
    public static Item EMERALD_NUGGET;
    public static Item LAPIS_NUGGET;
    public static Item REDSTONE_NUGGET;

    public static Item COPPER_DUST;
    public static Item TIN_DUST;
    public static Item SILVER_DUST;
    public static Item LEAD_DUST;
    public static Item ALUMINUM_DUST;
    public static Item NICKEL_DUST;
    public static Item PLATINUM_DUST;
    public static Item STEEL_DUST;
    public static Item ELECTRUM_DUST;
    public static Item BRONZE_DUST;
    public static Item IRON_DUST;
    public static Item GOLD_DUST;
    public static Item COAL_DUST;
    public static Item DIAMOND_DUST;
    public static Item EMERALD_DUST;
    public static Item LAPIS_DUST;

    public static Item COPPER_PLATE;
    public static Item TIN_PLATE;
    public static Item SILVER_PLATE;
    public static Item LEAD_PLATE;
    public static Item ALUMINUM_PLATE;
    public static Item NICKEL_PLATE;
    public static Item PLATINUM_PLATE;
    public static Item STEEL_PLATE;
    public static Item ELECTRUM_PLATE;
    public static Item BRONZE_PLATE;
    public static Item IRON_PLATE;
    public static Item GOLD_PLATE;
    public static Item COAL_PLATE;
    public static Item DIAMOND_PLATE;
    public static Item EMERALD_PLATE;
    public static Item LAPIS_PLATE;
    public static Item REDSTONE_PLATE;

    public static Item COPPER_WIRE;
    public static Item TIN_WIRE;
    public static Item SILVER_WIRE;
    public static Item LEAD_WIRE;
    public static Item ALUMINUM_WIRE;
    public static Item NICKEL_WIRE;
    public static Item PLATINUM_WIRE;
    public static Item STEEL_WIRE;
    public static Item ELECTRUM_WIRE;
    public static Item BRONZE_WIRE;
    public static Item IRON_WIRE;
    public static Item GOLD_WIRE;
    public static Item COAL_WIRE;
    public static Item DIAMOND_WIRE;
    public static Item EMERALD_WIRE;
    public static Item LAPIS_WIRE;
    public static Item REDSTONE_WIRE;


    public static Item COPPER_SWORD;
    public static Item TIN_SWORD;
    public static Item SILVER_SWORD;
    public static Item LEAD_SWORD;
    public static Item ALUMINUM_SWORD;
    public static Item NICKEL_SWORD;
    public static Item PLATINUM_SWORD;
    public static Item STEEL_SWORD;
    public static Item ELECTRUM_SWORD;
    public static Item BRONZE_SWORD;
    public static Item EMERALD_SWORD;
    public static Item LAPIS_SWORD;
    public static Item REDSTONE_SWORD;

    public static Item COPPER_PICKAXE;
    public static Item TIN_PICKAXE;
    public static Item SILVER_PICKAXE;
    public static Item LEAD_PICKAXE;
    public static Item ALUMINUM_PICKAXE;
    public static Item NICKEL_PICKAXE;
    public static Item PLATINUM_PICKAXE;
    public static Item STEEL_PICKAXE;
    public static Item ELECTRUM_PICKAXE;
    public static Item BRONZE_PICKAXE;
    public static Item EMERALD_PICKAXE;
    public static Item LAPIS_PICKAXE;
    public static Item REDSTONE_PICKAXE;

    public static Item COPPER_SHOVEL;
    public static Item TIN_SHOVEL;
    public static Item SILVER_SHOVEL;
    public static Item LEAD_SHOVEL;
    public static Item ALUMINUM_SHOVEL;
    public static Item NICKEL_SHOVEL;
    public static Item PLATINUM_SHOVEL;
    public static Item STEEL_SHOVEL;
    public static Item ELECTRUM_SHOVEL;
    public static Item BRONZE_SHOVEL;
    public static Item EMERALD_SHOVEL;
    public static Item LAPIS_SHOVEL;
    public static Item REDSTONE_SHOVEL;

    public static Item COPPER_AXE;
    public static Item TIN_AXE;
    public static Item SILVER_AXE;
    public static Item LEAD_AXE;
    public static Item ALUMINUM_AXE;
    public static Item NICKEL_AXE;
    public static Item PLATINUM_AXE;
    public static Item STEEL_AXE;
    public static Item ELECTRUM_AXE;
    public static Item BRONZE_AXE;
    public static Item EMERALD_AXE;
    public static Item LAPIS_AXE;
    public static Item REDSTONE_AXE;

    public static Item COPPER_HOE;
    public static Item TIN_HOE;
    public static Item SILVER_HOE;
    public static Item LEAD_HOE;
    public static Item ALUMINUM_HOE;
    public static Item NICKEL_HOE;
    public static Item PLATINUM_HOE;
    public static Item STEEL_HOE;
    public static Item ELECTRUM_HOE;
    public static Item BRONZE_HOE;
    public static Item EMERALD_HOE;
    public static Item LAPIS_HOE;
    public static Item REDSTONE_HOE;

    public static Item COPPER_HELMET;
    public static Item TIN_HELMET;
    public static Item SILVER_HELMET;
    public static Item LEAD_HELMET;
    public static Item ALUMINUM_HELMET;
    public static Item NICKEL_HELMET;
    public static Item PLATINUM_HELMET;
    public static Item STEEL_HELMET;
    public static Item ELECTRUM_HELMET;
    public static Item BRONZE_HELMET;
    public static Item EMERALD_HELMET;
    public static Item LAPIS_HELMET;
    public static Item REDSTONE_HELMET;

    public static Item COPPER_CHESTPLATE;
    public static Item TIN_CHESTPLATE;
    public static Item SILVER_CHESTPLATE;
    public static Item LEAD_CHESTPLATE;
    public static Item ALUMINUM_CHESTPLATE;
    public static Item NICKEL_CHESTPLATE;
    public static Item PLATINUM_CHESTPLATE;
    public static Item STEEL_CHESTPLATE;
    public static Item ELECTRUM_CHESTPLATE;
    public static Item BRONZE_CHESTPLATE;
    public static Item EMERALD_CHESTPLATE;
    public static Item LAPIS_CHESTPLATE;
    public static Item REDSTONE_CHESTPLATE;

    public static Item COPPER_LEGGINGS;
    public static Item TIN_LEGGINGS;
    public static Item SILVER_LEGGINGS;
    public static Item LEAD_LEGGINGS;
    public static Item ALUMINUM_LEGGINGS;
    public static Item NICKEL_LEGGINGS;
    public static Item PLATINUM_LEGGINGS;
    public static Item STEEL_LEGGINGS;
    public static Item ELECTRUM_LEGGINGS;
    public static Item BRONZE_LEGGINGS;
    public static Item EMERALD_LEGGINGS;
    public static Item LAPIS_LEGGINGS;
    public static Item REDSTONE_LEGGINGS;

    public static Item COPPER_BOOTS;
    public static Item TIN_BOOTS;
    public static Item SILVER_BOOTS;
    public static Item LEAD_BOOTS;
    public static Item ALUMINUM_BOOTS;
    public static Item NICKEL_BOOTS;
    public static Item PLATINUM_BOOTS;
    public static Item STEEL_BOOTS;
    public static Item ELECTRUM_BOOTS;
    public static Item BRONZE_BOOTS;
    public static Item EMERALD_BOOTS;
    public static Item LAPIS_BOOTS;
    public static Item REDSTONE_BOOTS;

    public static void init() {
        if (ConfigHandler.wireHammer) {
            HAMMER = registerItem(new ItemCraftingDurabilityBase("hammer", 128, true).setCreativeTab(Constants.TOOLS_TAB));
            WIRE_CUTTERS = registerItem(new ItemCraftingDurabilityBase("wire_cutters", 128, true).setCreativeTab(Constants.TOOLS_TAB));
        }

        initIngots();
        if (ConfigHandler.plates)
            initPlates();

        if (ConfigHandler.wires)
            initWires();

        initNuggets();

        if (ConfigHandler.dusts)
            initDusts();

        if (ConfigHandler.armor)
            initArmor();

        if (ConfigHandler.tools)
            initTools();

        for (Item item : getItems()) {
            if (item.getUnlocalizedName().contains("_helmet") || item.getUnlocalizedName().contains("_chestplate") || item.getUnlocalizedName().contains("_leggings") || item.getUnlocalizedName().contains("_boots")) {
                item.setCreativeTab(Constants.TOOLS_TAB);
            } else if (item.getUnlocalizedName().contains("_sword") || item.getUnlocalizedName().contains("_pickaxe") || item.getUnlocalizedName().contains("_axe") || item.getUnlocalizedName().contains("_shovel") || item.getUnlocalizedName().contains("_hoe")) {
                item.setCreativeTab(Constants.TOOLS_TAB);
            } else if (item.getUnlocalizedName().contains("_ingot") || item.getUnlocalizedName().contains("_nugget")) {
                item.setCreativeTab(Constants.RESOURCES_TAB);
            } else if (ConfigHandler.plates && item.getUnlocalizedName().contains("_plate")) {
                item.setCreativeTab(Constants.RESOURCES_TAB);
            } else if (ConfigHandler.wires && item.getUnlocalizedName().contains("_wire")) {
                item.setCreativeTab(Constants.RESOURCES_TAB);
            } else if (ConfigHandler.dusts && item.getUnlocalizedName().contains("_dust")) {
                item.setCreativeTab(Constants.RESOURCES_TAB);
            }
        }
    }

    private static void initIngots() {
        COPPER_INGOT = registerItem(new ItemBase("copper_ingot"));
        TIN_INGOT = registerItem(new ItemBase("tin_ingot"));
        SILVER_INGOT = registerItem(new ItemBase("silver_ingot"));
        LEAD_INGOT = registerItem(new ItemBase("lead_ingot"));
        ALUMINUM_INGOT = registerItem(new ItemBase("aluminum_ingot"));
        NICKEL_INGOT = registerItem(new ItemBase("nickel_ingot"));
        PLATINUM_INGOT = registerItem(new ItemBase("platinum_ingot"));
        STEEL_INGOT = registerItem(new ItemBase("steel_ingot"));
        ELECTRUM_INGOT = registerItem(new ItemBase("electrum_ingot"));
        BRONZE_INGOT = registerItem(new ItemBase("bronze_ingot"));
    }
    private static void initNuggets() {
        COPPER_NUGGET = registerItem(new ItemBase("copper_nugget"));
        TIN_NUGGET = registerItem(new ItemBase("tin_nugget"));
        SILVER_NUGGET = registerItem(new ItemBase("silver_nugget"));
        LEAD_NUGGET = registerItem(new ItemBase("lead_nugget"));
        ALUMINUM_NUGGET = registerItem(new ItemBase("aluminum_nugget"));
        NICKEL_NUGGET = registerItem(new ItemBase("nickel_nugget"));
        PLATINUM_NUGGET = registerItem(new ItemBase("platinum_nugget"));
        STEEL_NUGGET = registerItem(new ItemBase("steel_nugget"));
        ELECTRUM_NUGGET = registerItem(new ItemBase("electrum_nugget"));
        BRONZE_NUGGET = registerItem(new ItemBase("bronze_nugget"));
        IRON_NUGGET = registerItem(new ItemBase("iron_nugget"));
        COAL_NUGGET = registerItem(new ItemBase("coal_nugget"));
        DIAMOND_NUGGET = registerItem(new ItemBase("diamond_nugget"));
        EMERALD_NUGGET = registerItem(new ItemBase("emerald_nugget"));
        LAPIS_NUGGET = registerItem(new ItemBase("lapis_nugget"));
        REDSTONE_NUGGET = registerItem(new ItemBase("redstone_nugget"));
    }
    private static void initDusts() {
        COPPER_DUST = registerItem(new ItemBase("copper_dust"));
        TIN_DUST = registerItem(new ItemBase("tin_dust"));
        SILVER_DUST = registerItem(new ItemBase("silver_dust"));
        LEAD_DUST = registerItem(new ItemBase("lead_dust"));
        ALUMINUM_DUST = registerItem(new ItemBase("aluminum_dust"));
        NICKEL_DUST = registerItem(new ItemBase("nickel_dust"));
        PLATINUM_DUST = registerItem(new ItemBase("platinum_dust"));
        STEEL_DUST = registerItem(new ItemBase("steel_dust"));
        ELECTRUM_DUST = registerItem(new ItemBase("electrum_dust"));
        BRONZE_DUST = registerItem(new ItemBase("bronze_dust"));
        IRON_DUST = registerItem(new ItemBase("iron_dust"));
        GOLD_DUST = registerItem(new ItemBase("gold_dust"));
        COAL_DUST = registerItem(new ItemBase("coal_dust"));
        DIAMOND_DUST = registerItem(new ItemBase("diamond_dust"));
        EMERALD_DUST = registerItem(new ItemBase("emerald_dust"));
        LAPIS_DUST = registerItem(new ItemBase("lapis_dust"));
    }
    private static void initPlates() {
        COPPER_PLATE = registerItem(new ItemBase("copper_plate"));
        TIN_PLATE = registerItem(new ItemBase("tin_plate"));
        SILVER_PLATE = registerItem(new ItemBase("silver_plate"));
        LEAD_PLATE = registerItem(new ItemBase("lead_plate"));
        ALUMINUM_PLATE = registerItem(new ItemBase("aluminum_plate"));
        NICKEL_PLATE = registerItem(new ItemBase("nickel_plate"));
        PLATINUM_PLATE = registerItem(new ItemBase("platinum_plate"));
        STEEL_PLATE = registerItem(new ItemBase("steel_plate"));
        ELECTRUM_PLATE = registerItem(new ItemBase("electrum_plate"));
        BRONZE_PLATE = registerItem(new ItemBase("bronze_plate"));
        IRON_PLATE = registerItem(new ItemBase("iron_plate"));
        GOLD_PLATE = registerItem(new ItemBase("gold_plate"));
        COAL_PLATE = registerItem(new ItemBase("coal_plate"));
        DIAMOND_PLATE = registerItem(new ItemBase("diamond_plate"));
        EMERALD_PLATE = registerItem(new ItemBase("emerald_plate"));
        LAPIS_PLATE = registerItem(new ItemBase("lapis_plate"));
        REDSTONE_PLATE = registerItem(new ItemBase("redstone_plate"));
    }
    private static void initWires() {
        COPPER_WIRE = registerItem(new ItemBase("copper_wire"));
        TIN_WIRE = registerItem(new ItemBase("tin_wire"));
        SILVER_WIRE = registerItem(new ItemBase("silver_wire"));
        LEAD_WIRE = registerItem(new ItemBase("lead_wire"));
        ALUMINUM_WIRE = registerItem(new ItemBase("aluminum_wire"));
        NICKEL_WIRE = registerItem(new ItemBase("nickel_wire"));
        PLATINUM_WIRE = registerItem(new ItemBase("platinum_wire"));
        STEEL_WIRE = registerItem(new ItemBase("steel_wire"));
        ELECTRUM_WIRE = registerItem(new ItemBase("electrum_wire"));
        BRONZE_WIRE = registerItem(new ItemBase("bronze_wire"));
        IRON_WIRE = registerItem(new ItemBase("iron_wire"));
        GOLD_WIRE = registerItem(new ItemBase("gold_wire"));
        COAL_WIRE = registerItem(new ItemBase("coal_wire"));
        DIAMOND_WIRE = registerItem(new ItemBase("diamond_wire"));
        EMERALD_WIRE = registerItem(new ItemBase("emerald_wire"));
        LAPIS_WIRE = registerItem(new ItemBase("lapis_wire"));
        REDSTONE_WIRE = registerItem(new ItemBase("redstone_wire"));
    }
    private static void initTools() {
        COPPER_SWORD = registerItem(new SwordBase(Constants.Materials.COPPER_TOOL, "copper_sword"));
        COPPER_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.COPPER_TOOL, "copper_pickaxe"));
        COPPER_SHOVEL = registerItem(new ShovelBase(Constants.Materials.COPPER_TOOL, "copper_shovel"));
        COPPER_AXE = registerItem(new AxeBase(Constants.Materials.COPPER_TOOL, "copper_axe"));
        COPPER_HOE = registerItem(new HoeBase(Constants.Materials.COPPER_TOOL, "copper_hoe"));

        TIN_SWORD = registerItem(new SwordBase(Constants.Materials.TIN_TOOL, "tin_sword"));
        TIN_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.TIN_TOOL, "tin_pickaxe"));
        TIN_SHOVEL = registerItem(new ShovelBase(Constants.Materials.TIN_TOOL, "tin_shovel"));
        TIN_AXE = registerItem(new AxeBase(Constants.Materials.TIN_TOOL, "tin_axe"));
        TIN_HOE = registerItem(new HoeBase(Constants.Materials.TIN_TOOL, "tin_hoe"));

        SILVER_SWORD = registerItem(new SwordBase(Constants.Materials.SILVER_TOOL, "silver_sword"));
        SILVER_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.SILVER_TOOL, "silver_pickaxe"));
        SILVER_SHOVEL = registerItem(new ShovelBase(Constants.Materials.SILVER_TOOL, "silver_shovel"));
        SILVER_AXE = registerItem(new AxeBase(Constants.Materials.SILVER_TOOL, "silver_axe"));
        SILVER_HOE = registerItem(new HoeBase(Constants.Materials.SILVER_TOOL, "silver_hoe"));

        LEAD_SWORD = registerItem(new SwordBase(Constants.Materials.LEAD_TOOL, "lead_sword"));
        LEAD_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.LEAD_TOOL, "lead_pickaxe"));
        LEAD_SHOVEL = registerItem(new ShovelBase(Constants.Materials.LEAD_TOOL, "lead_shovel"));
        LEAD_AXE = registerItem(new AxeBase(Constants.Materials.LEAD_TOOL, "lead_axe"));
        LEAD_HOE = registerItem(new HoeBase(Constants.Materials.LEAD_TOOL, "lead_hoe"));

        ALUMINUM_SWORD = registerItem(new SwordBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_sword"));
        ALUMINUM_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_pickaxe"));
        ALUMINUM_SHOVEL = registerItem(new ShovelBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_shovel"));
        ALUMINUM_AXE = registerItem(new AxeBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_axe"));
        ALUMINUM_HOE = registerItem(new HoeBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_hoe"));

        NICKEL_SWORD = registerItem(new SwordBase(Constants.Materials.NICKEL_TOOL, "nickel_sword"));
        NICKEL_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.NICKEL_TOOL, "nickel_pickaxe"));
        NICKEL_SHOVEL = registerItem(new ShovelBase(Constants.Materials.NICKEL_TOOL, "nickel_shovel"));
        NICKEL_AXE = registerItem(new AxeBase(Constants.Materials.NICKEL_TOOL, "nickel_axe"));
        NICKEL_HOE = registerItem(new HoeBase(Constants.Materials.NICKEL_TOOL, "nickel_hoe"));

        PLATINUM_SWORD = registerItem(new SwordBase(Constants.Materials.PLATINUM_TOOL, "platinum_sword"));
        PLATINUM_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.PLATINUM_TOOL, "platinum_pickaxe"));
        PLATINUM_SHOVEL = registerItem(new ShovelBase(Constants.Materials.PLATINUM_TOOL, "platinum_shovel"));
        PLATINUM_AXE = registerItem(new AxeBase(Constants.Materials.PLATINUM_TOOL, "platinum_axe"));
        PLATINUM_HOE = registerItem(new HoeBase(Constants.Materials.PLATINUM_TOOL, "platinum_hoe"));

        STEEL_SWORD = registerItem(new SwordBase(Constants.Materials.STEEL_TOOL, "steel_sword"));
        STEEL_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.STEEL_TOOL, "steel_pickaxe"));
        STEEL_SHOVEL = registerItem(new ShovelBase(Constants.Materials.STEEL_TOOL, "steel_shovel"));
        STEEL_AXE = registerItem(new AxeBase(Constants.Materials.STEEL_TOOL, "steel_axe"));
        STEEL_HOE = registerItem(new HoeBase(Constants.Materials.STEEL_TOOL, "steel_hoe"));

        ELECTRUM_SWORD = registerItem(new SwordBase(Constants.Materials.ELECTRUM_TOOL, "electrum_sword"));
        ELECTRUM_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.ELECTRUM_TOOL, "electrum_pickaxe"));
        ELECTRUM_SHOVEL = registerItem(new ShovelBase(Constants.Materials.ELECTRUM_TOOL, "electrum_shovel"));
        ELECTRUM_AXE = registerItem(new AxeBase(Constants.Materials.ELECTRUM_TOOL, "electrum_axe"));
        ELECTRUM_HOE = registerItem(new HoeBase(Constants.Materials.ELECTRUM_TOOL, "electrum_hoe"));

        BRONZE_SWORD = registerItem(new SwordBase(Constants.Materials.BRONZE_TOOL, "bronze_sword"));
        BRONZE_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.BRONZE_TOOL, "bronze_pickaxe"));
        BRONZE_SHOVEL = registerItem(new ShovelBase(Constants.Materials.BRONZE_TOOL, "bronze_shovel"));
        BRONZE_AXE = registerItem(new AxeBase(Constants.Materials.BRONZE_TOOL, "bronze_axe"));
        BRONZE_HOE = registerItem(new HoeBase(Constants.Materials.BRONZE_TOOL, "bronze_hoe"));

        EMERALD_SWORD = registerItem(new SwordBase(Constants.Materials.EMERALD_TOOL, "emerald_sword"));
        EMERALD_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.EMERALD_TOOL, "emerald_pickaxe"));
        EMERALD_SHOVEL = registerItem(new ShovelBase(Constants.Materials.EMERALD_TOOL, "emerald_shovel"));
        EMERALD_AXE = registerItem(new AxeBase(Constants.Materials.EMERALD_TOOL, "emerald_axe"));
        EMERALD_HOE = registerItem(new HoeBase(Constants.Materials.EMERALD_TOOL, "emerald_hoe"));

        LAPIS_SWORD = registerItem(new SwordBase(Constants.Materials.LAPIS_TOOL, "lapis_sword"));
        LAPIS_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.LAPIS_TOOL, "lapis_pickaxe"));
        LAPIS_SHOVEL = registerItem(new ShovelBase(Constants.Materials.LAPIS_TOOL, "lapis_shovel"));
        LAPIS_AXE = registerItem(new AxeBase(Constants.Materials.LAPIS_TOOL, "lapis_axe"));
        LAPIS_HOE = registerItem(new HoeBase(Constants.Materials.LAPIS_TOOL, "lapis_hoe"));

        REDSTONE_SWORD = registerItem(new SwordBase(Constants.Materials.REDSTONE_TOOL, "redstone_sword"));
        REDSTONE_PICKAXE = registerItem(new PickaxeBase(Constants.Materials.REDSTONE_TOOL, "redstone_pickaxe"));
        REDSTONE_SHOVEL = registerItem(new ShovelBase(Constants.Materials.REDSTONE_TOOL, "redstone_shovel"));
        REDSTONE_AXE = registerItem(new AxeBase(Constants.Materials.REDSTONE_TOOL, "redstone_axe"));
        REDSTONE_HOE = registerItem(new HoeBase(Constants.Materials.REDSTONE_TOOL, "redstone_hoe"));
    }
    private static void initArmor() {
        COPPER_HELMET = registerItem(new ArmorBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.HEAD, "copper_helmet"));
        COPPER_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.CHEST, "copper_chestplate"));
        COPPER_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.LEGS, "copper_leggings"));
        COPPER_BOOTS = registerItem(new ArmorBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.FEET, "copper_boots"));

        TIN_HELMET = registerItem(new ArmorBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.HEAD, "tin_helmet"));
        TIN_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.CHEST, "tin_chestplate"));
        TIN_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.LEGS, "tin_leggings"));
        TIN_BOOTS = registerItem(new ArmorBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.FEET, "tin_boots"));

        SILVER_HELMET = registerItem(new ArmorBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.HEAD, "silver_helmet"));
        SILVER_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.CHEST, "silver_chestplate"));
        SILVER_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.LEGS, "silver_leggings"));
        SILVER_BOOTS = registerItem(new ArmorBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.FEET, "silver_boots"));

        LEAD_HELMET = registerItem(new ArmorBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.HEAD, "lead_helmet"));
        LEAD_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.CHEST, "lead_chestplate"));
        LEAD_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.LEGS, "lead_leggings"));
        LEAD_BOOTS = registerItem(new ArmorBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.FEET, "lead_boots"));

        ALUMINUM_HELMET = registerItem(new ArmorBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.HEAD, "aluminum_helmet"));
        ALUMINUM_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.CHEST, "aluminum_chestplate"));
        ALUMINUM_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.LEGS, "aluminum_leggings"));
        ALUMINUM_BOOTS = registerItem(new ArmorBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.FEET, "aluminum_boots"));

        NICKEL_HELMET = registerItem(new ArmorBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.HEAD, "nickel_helmet"));
        NICKEL_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.CHEST, "nickel_chestplate"));
        NICKEL_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.LEGS, "nickel_leggings"));
        NICKEL_BOOTS = registerItem(new ArmorBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.FEET, "nickel_boots"));

        PLATINUM_HELMET = registerItem(new ArmorBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.HEAD, "platinum_helmet"));
        PLATINUM_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.CHEST, "platinum_chestplate"));
        PLATINUM_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.LEGS, "platinum_leggings"));
        PLATINUM_BOOTS = registerItem(new ArmorBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.FEET, "platinum_boots"));

        STEEL_HELMET = registerItem(new ArmorBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.HEAD, "steel_helmet"));
        STEEL_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.CHEST, "steel_chestplate"));
        STEEL_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.LEGS, "steel_leggings"));
        STEEL_BOOTS = registerItem(new ArmorBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.FEET, "steel_boots"));

        ELECTRUM_HELMET = registerItem(new ArmorBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.HEAD, "electrum_helmet"));
        ELECTRUM_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.CHEST, "electrum_chestplate"));
        ELECTRUM_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.LEGS, "electrum_leggings"));
        ELECTRUM_BOOTS = registerItem(new ArmorBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.FEET, "electrum_boots"));

        BRONZE_HELMET = registerItem(new ArmorBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.HEAD, "bronze_helmet"));
        BRONZE_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.CHEST, "bronze_chestplate"));
        BRONZE_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.LEGS, "bronze_leggings"));
        BRONZE_BOOTS = registerItem(new ArmorBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.FEET, "bronze_boots"));

        EMERALD_HELMET = registerItem(new ArmorBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.HEAD, "emerald_helmet"));
        EMERALD_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.CHEST, "emerald_chestplate"));
        EMERALD_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.LEGS, "emerald_leggings"));
        EMERALD_BOOTS = registerItem(new ArmorBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.FEET, "emerald_boots"));

        LAPIS_HELMET = registerItem(new ArmorBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.HEAD, "lapis_helmet"));
        LAPIS_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.CHEST, "lapis_chestplate"));
        LAPIS_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.LEGS, "lapis_leggings"));
        LAPIS_BOOTS = registerItem(new ArmorBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.FEET, "lapis_boots"));

        REDSTONE_HELMET = registerItem(new ArmorBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.HEAD, "redstone_helmet"));
        REDSTONE_CHESTPLATE = registerItem(new ArmorBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.CHEST, "redstone_chestplate"));
        REDSTONE_LEGGINGS = registerItem(new ArmorBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.LEGS, "redstone_leggings"));
        REDSTONE_BOOTS = registerItem(new ArmorBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.FEET, "redstone_boots"));
    }

    public static <T extends Item> Item registerItem(T item) {
        addItem(item);
        GameRegistry.register(item);
        if (item.getRegistryName() != null)
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        return item;
    }
}
