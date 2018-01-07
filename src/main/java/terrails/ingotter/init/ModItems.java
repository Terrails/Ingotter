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
            HAMMER = addItem(new ItemCraftingDurabilityBase("hammer", 128, true).setCreativeTab(Constants.TOOLS_TAB));
            WIRE_CUTTERS = addItem(new ItemCraftingDurabilityBase("wire_cutters", 128, true).setCreativeTab(Constants.TOOLS_TAB));
        }

        if (ConfigHandler.ingots)
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
            String name = item.getUnlocalizedName();
            if (ConfigHandler.armor && (name.contains("_helmet") || name.contains("_chestplate") || name.contains("_leggings") || name.contains("_boots")))
                item.setCreativeTab(Constants.TOOLS_TAB);
            else if (ConfigHandler.tools && (name.contains("_sword") || name.contains("_pickaxe") || name.contains("_axe") || name.contains("_shovel") || name.contains("_hoe")))
                item.setCreativeTab(Constants.TOOLS_TAB);
            else if (ConfigHandler.ingots && name.contains("_ingot"))
                item.setCreativeTab(Constants.RESOURCES_TAB);
            else if ((ConfigHandler.gemNuggets || ConfigHandler.ingotNuggets) && name.contains("_nugget"))
                item.setCreativeTab(Constants.RESOURCES_TAB);
            else if (ConfigHandler.plates && name.contains("_plate"))
                item.setCreativeTab(Constants.RESOURCES_TAB);
            else if (ConfigHandler.wires && name.contains("_wire"))
                item.setCreativeTab(Constants.RESOURCES_TAB);
            else if (ConfigHandler.dusts && name.contains("_dust"))
                item.setCreativeTab(Constants.RESOURCES_TAB);
        }
    }


    private static void initIngots() {
        COPPER_INGOT = addItem(new ItemBase("copper_ingot"));
        TIN_INGOT = addItem(new ItemBase("tin_ingot"));
        SILVER_INGOT = addItem(new ItemBase("silver_ingot"));
        LEAD_INGOT = addItem(new ItemBase("lead_ingot"));
        ALUMINUM_INGOT = addItem(new ItemBase("aluminum_ingot"));
        NICKEL_INGOT = addItem(new ItemBase("nickel_ingot"));
        PLATINUM_INGOT = addItem(new ItemBase("platinum_ingot"));
        STEEL_INGOT = addItem(new ItemBase("steel_ingot"));
        ELECTRUM_INGOT = addItem(new ItemBase("electrum_ingot"));
        BRONZE_INGOT = addItem(new ItemBase("bronze_ingot"));
    }
    private static void initNuggets() {
        if (ConfigHandler.ingotNuggets) {
            COPPER_NUGGET = addItem(new ItemBase("copper_nugget"));
            TIN_NUGGET = addItem(new ItemBase("tin_nugget"));
            SILVER_NUGGET = addItem(new ItemBase("silver_nugget"));
            LEAD_NUGGET = addItem(new ItemBase("lead_nugget"));
            ALUMINUM_NUGGET = addItem(new ItemBase("aluminum_nugget"));
            NICKEL_NUGGET = addItem(new ItemBase("nickel_nugget"));
            PLATINUM_NUGGET = addItem(new ItemBase("platinum_nugget"));
            STEEL_NUGGET = addItem(new ItemBase("steel_nugget"));
            ELECTRUM_NUGGET = addItem(new ItemBase("electrum_nugget"));
            BRONZE_NUGGET = addItem(new ItemBase("bronze_nugget"));
            IRON_NUGGET = addItem(new ItemBase("iron_nugget"));
        }
        if (ConfigHandler.gemNuggets) {
            COAL_NUGGET = addItem(new ItemBase("coal_nugget") {
                @Override
                public int getItemBurnTime(ItemStack itemStack) {
                    return 200;
                }
            });
            DIAMOND_NUGGET = addItem(new ItemBase("diamond_nugget"));
            EMERALD_NUGGET = addItem(new ItemBase("emerald_nugget"));
            LAPIS_NUGGET = addItem(new ItemBase("lapis_nugget"));
            REDSTONE_NUGGET = addItem(new ItemBase("redstone_nugget"));
        }
    }
    private static void initDusts() {
        COPPER_DUST = addItem(new ItemBase("copper_dust"));
        TIN_DUST = addItem(new ItemBase("tin_dust"));
        SILVER_DUST = addItem(new ItemBase("silver_dust"));
        LEAD_DUST = addItem(new ItemBase("lead_dust"));
        ALUMINUM_DUST = addItem(new ItemBase("aluminum_dust"));
        NICKEL_DUST = addItem(new ItemBase("nickel_dust"));
        PLATINUM_DUST = addItem(new ItemBase("platinum_dust"));
        STEEL_DUST = addItem(new ItemBase("steel_dust"));
        ELECTRUM_DUST = addItem(new ItemBase("electrum_dust"));
        BRONZE_DUST = addItem(new ItemBase("bronze_dust"));
        IRON_DUST = addItem(new ItemBase("iron_dust"));
        GOLD_DUST = addItem(new ItemBase("gold_dust"));
        COAL_DUST = addItem(new ItemBase("coal_dust") {
            @Override
            public int getItemBurnTime(ItemStack itemStack) {
                return 1800;
            }
        });
        DIAMOND_DUST = addItem(new ItemBase("diamond_dust"));
        EMERALD_DUST = addItem(new ItemBase("emerald_dust"));
        LAPIS_DUST = addItem(new ItemBase("lapis_dust"));
    }
    private static void initPlates() {
        COPPER_PLATE = addItem(new ItemBase("copper_plate"));
        TIN_PLATE = addItem(new ItemBase("tin_plate"));
        SILVER_PLATE = addItem(new ItemBase("silver_plate"));
        LEAD_PLATE = addItem(new ItemBase("lead_plate"));
        ALUMINUM_PLATE = addItem(new ItemBase("aluminum_plate"));
        NICKEL_PLATE = addItem(new ItemBase("nickel_plate"));
        PLATINUM_PLATE = addItem(new ItemBase("platinum_plate"));
        STEEL_PLATE = addItem(new ItemBase("steel_plate"));
        ELECTRUM_PLATE = addItem(new ItemBase("electrum_plate"));
        BRONZE_PLATE = addItem(new ItemBase("bronze_plate"));
        IRON_PLATE = addItem(new ItemBase("iron_plate"));
        GOLD_PLATE = addItem(new ItemBase("gold_plate"));
        COAL_PLATE = addItem(new ItemBase("coal_plate") {
            @Override
            public int getItemBurnTime(ItemStack itemStack) {
                return 2400;
            }
        });
        DIAMOND_PLATE = addItem(new ItemBase("diamond_plate"));
        EMERALD_PLATE = addItem(new ItemBase("emerald_plate"));
        LAPIS_PLATE = addItem(new ItemBase("lapis_plate"));
        REDSTONE_PLATE = addItem(new ItemBase("redstone_plate"));
    }
    private static void initWires() {
        COPPER_WIRE = addItem(new ItemBase("copper_wire"));
        TIN_WIRE = addItem(new ItemBase("tin_wire"));
        SILVER_WIRE = addItem(new ItemBase("silver_wire"));
        LEAD_WIRE = addItem(new ItemBase("lead_wire"));
        ALUMINUM_WIRE = addItem(new ItemBase("aluminum_wire"));
        NICKEL_WIRE = addItem(new ItemBase("nickel_wire"));
        PLATINUM_WIRE = addItem(new ItemBase("platinum_wire"));
        STEEL_WIRE = addItem(new ItemBase("steel_wire"));
        ELECTRUM_WIRE = addItem(new ItemBase("electrum_wire"));
        BRONZE_WIRE = addItem(new ItemBase("bronze_wire"));
        IRON_WIRE = addItem(new ItemBase("iron_wire"));
        GOLD_WIRE = addItem(new ItemBase("gold_wire"));
        COAL_WIRE = addItem(new ItemBase("coal_wire") {
            @Override
            public int getItemBurnTime(ItemStack itemStack) {
                return 800;
            }
        });
        DIAMOND_WIRE = addItem(new ItemBase("diamond_wire"));
        EMERALD_WIRE = addItem(new ItemBase("emerald_wire"));
        LAPIS_WIRE = addItem(new ItemBase("lapis_wire"));
        REDSTONE_WIRE = addItem(new ItemBase("redstone_wire"));
    }
    private static void initTools() {
        COPPER_SWORD = addItem(new SwordBase(Constants.Materials.COPPER_TOOL, "copper_sword"));
        COPPER_PICKAXE = addItem(new PickaxeBase(Constants.Materials.COPPER_TOOL, "copper_pickaxe"));
        COPPER_SHOVEL = addItem(new ShovelBase(Constants.Materials.COPPER_TOOL, "copper_shovel"));
        COPPER_AXE = addItem(new AxeBase(Constants.Materials.COPPER_TOOL, "copper_axe"));
        COPPER_HOE = addItem(new HoeBase(Constants.Materials.COPPER_TOOL, "copper_hoe"));

        TIN_SWORD = addItem(new SwordBase(Constants.Materials.TIN_TOOL, "tin_sword"));
        TIN_PICKAXE = addItem(new PickaxeBase(Constants.Materials.TIN_TOOL, "tin_pickaxe"));
        TIN_SHOVEL = addItem(new ShovelBase(Constants.Materials.TIN_TOOL, "tin_shovel"));
        TIN_AXE = addItem(new AxeBase(Constants.Materials.TIN_TOOL, "tin_axe"));
        TIN_HOE = addItem(new HoeBase(Constants.Materials.TIN_TOOL, "tin_hoe"));

        SILVER_SWORD = addItem(new SwordBase(Constants.Materials.SILVER_TOOL, "silver_sword"));
        SILVER_PICKAXE = addItem(new PickaxeBase(Constants.Materials.SILVER_TOOL, "silver_pickaxe"));
        SILVER_SHOVEL = addItem(new ShovelBase(Constants.Materials.SILVER_TOOL, "silver_shovel"));
        SILVER_AXE = addItem(new AxeBase(Constants.Materials.SILVER_TOOL, "silver_axe"));
        SILVER_HOE = addItem(new HoeBase(Constants.Materials.SILVER_TOOL, "silver_hoe"));

        LEAD_SWORD = addItem(new SwordBase(Constants.Materials.LEAD_TOOL, "lead_sword"));
        LEAD_PICKAXE = addItem(new PickaxeBase(Constants.Materials.LEAD_TOOL, "lead_pickaxe"));
        LEAD_SHOVEL = addItem(new ShovelBase(Constants.Materials.LEAD_TOOL, "lead_shovel"));
        LEAD_AXE = addItem(new AxeBase(Constants.Materials.LEAD_TOOL, "lead_axe"));
        LEAD_HOE = addItem(new HoeBase(Constants.Materials.LEAD_TOOL, "lead_hoe"));

        ALUMINUM_SWORD = addItem(new SwordBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_sword"));
        ALUMINUM_PICKAXE = addItem(new PickaxeBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_pickaxe"));
        ALUMINUM_SHOVEL = addItem(new ShovelBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_shovel"));
        ALUMINUM_AXE = addItem(new AxeBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_axe"));
        ALUMINUM_HOE = addItem(new HoeBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_hoe"));

        NICKEL_SWORD = addItem(new SwordBase(Constants.Materials.NICKEL_TOOL, "nickel_sword"));
        NICKEL_PICKAXE = addItem(new PickaxeBase(Constants.Materials.NICKEL_TOOL, "nickel_pickaxe"));
        NICKEL_SHOVEL = addItem(new ShovelBase(Constants.Materials.NICKEL_TOOL, "nickel_shovel"));
        NICKEL_AXE = addItem(new AxeBase(Constants.Materials.NICKEL_TOOL, "nickel_axe"));
        NICKEL_HOE = addItem(new HoeBase(Constants.Materials.NICKEL_TOOL, "nickel_hoe"));

        PLATINUM_SWORD = addItem(new SwordBase(Constants.Materials.PLATINUM_TOOL, "platinum_sword"));
        PLATINUM_PICKAXE = addItem(new PickaxeBase(Constants.Materials.PLATINUM_TOOL, "platinum_pickaxe"));
        PLATINUM_SHOVEL = addItem(new ShovelBase(Constants.Materials.PLATINUM_TOOL, "platinum_shovel"));
        PLATINUM_AXE = addItem(new AxeBase(Constants.Materials.PLATINUM_TOOL, "platinum_axe"));
        PLATINUM_HOE = addItem(new HoeBase(Constants.Materials.PLATINUM_TOOL, "platinum_hoe"));

        STEEL_SWORD = addItem(new SwordBase(Constants.Materials.STEEL_TOOL, "steel_sword"));
        STEEL_PICKAXE = addItem(new PickaxeBase(Constants.Materials.STEEL_TOOL, "steel_pickaxe"));
        STEEL_SHOVEL = addItem(new ShovelBase(Constants.Materials.STEEL_TOOL, "steel_shovel"));
        STEEL_AXE = addItem(new AxeBase(Constants.Materials.STEEL_TOOL, "steel_axe"));
        STEEL_HOE = addItem(new HoeBase(Constants.Materials.STEEL_TOOL, "steel_hoe"));

        ELECTRUM_SWORD = addItem(new SwordBase(Constants.Materials.ELECTRUM_TOOL, "electrum_sword"));
        ELECTRUM_PICKAXE = addItem(new PickaxeBase(Constants.Materials.ELECTRUM_TOOL, "electrum_pickaxe"));
        ELECTRUM_SHOVEL = addItem(new ShovelBase(Constants.Materials.ELECTRUM_TOOL, "electrum_shovel"));
        ELECTRUM_AXE = addItem(new AxeBase(Constants.Materials.ELECTRUM_TOOL, "electrum_axe"));
        ELECTRUM_HOE = addItem(new HoeBase(Constants.Materials.ELECTRUM_TOOL, "electrum_hoe"));

        BRONZE_SWORD = addItem(new SwordBase(Constants.Materials.BRONZE_TOOL, "bronze_sword"));
        BRONZE_PICKAXE = addItem(new PickaxeBase(Constants.Materials.BRONZE_TOOL, "bronze_pickaxe"));
        BRONZE_SHOVEL = addItem(new ShovelBase(Constants.Materials.BRONZE_TOOL, "bronze_shovel"));
        BRONZE_AXE = addItem(new AxeBase(Constants.Materials.BRONZE_TOOL, "bronze_axe"));
        BRONZE_HOE = addItem(new HoeBase(Constants.Materials.BRONZE_TOOL, "bronze_hoe"));

        EMERALD_SWORD = addItem(new SwordBase(Constants.Materials.EMERALD_TOOL, "emerald_sword"));
        EMERALD_PICKAXE = addItem(new PickaxeBase(Constants.Materials.EMERALD_TOOL, "emerald_pickaxe"));
        EMERALD_SHOVEL = addItem(new ShovelBase(Constants.Materials.EMERALD_TOOL, "emerald_shovel"));
        EMERALD_AXE = addItem(new AxeBase(Constants.Materials.EMERALD_TOOL, "emerald_axe"));
        EMERALD_HOE = addItem(new HoeBase(Constants.Materials.EMERALD_TOOL, "emerald_hoe"));

        LAPIS_SWORD = addItem(new SwordBase(Constants.Materials.LAPIS_TOOL, "lapis_sword"));
        LAPIS_PICKAXE = addItem(new PickaxeBase(Constants.Materials.LAPIS_TOOL, "lapis_pickaxe"));
        LAPIS_SHOVEL = addItem(new ShovelBase(Constants.Materials.LAPIS_TOOL, "lapis_shovel"));
        LAPIS_AXE = addItem(new AxeBase(Constants.Materials.LAPIS_TOOL, "lapis_axe"));
        LAPIS_HOE = addItem(new HoeBase(Constants.Materials.LAPIS_TOOL, "lapis_hoe"));

        REDSTONE_SWORD = addItem(new SwordBase(Constants.Materials.REDSTONE_TOOL, "redstone_sword"));
        REDSTONE_PICKAXE = addItem(new PickaxeBase(Constants.Materials.REDSTONE_TOOL, "redstone_pickaxe"));
        REDSTONE_SHOVEL = addItem(new ShovelBase(Constants.Materials.REDSTONE_TOOL, "redstone_shovel"));
        REDSTONE_AXE = addItem(new AxeBase(Constants.Materials.REDSTONE_TOOL, "redstone_axe"));
        REDSTONE_HOE = addItem(new HoeBase(Constants.Materials.REDSTONE_TOOL, "redstone_hoe"));
    }
    private static void initArmor() {
        COPPER_HELMET = addItem(new ArmorBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.HEAD, "copper_helmet"));
        COPPER_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.CHEST, "copper_chestplate"));
        COPPER_LEGGINGS = addItem(new ArmorBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.LEGS, "copper_leggings"));
        COPPER_BOOTS = addItem(new ArmorBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.FEET, "copper_boots"));

        TIN_HELMET = addItem(new ArmorBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.HEAD, "tin_helmet"));
        TIN_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.CHEST, "tin_chestplate"));
        TIN_LEGGINGS = addItem(new ArmorBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.LEGS, "tin_leggings"));
        TIN_BOOTS = addItem(new ArmorBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.FEET, "tin_boots"));

        SILVER_HELMET = addItem(new ArmorBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.HEAD, "silver_helmet"));
        SILVER_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.CHEST, "silver_chestplate"));
        SILVER_LEGGINGS = addItem(new ArmorBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.LEGS, "silver_leggings"));
        SILVER_BOOTS = addItem(new ArmorBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.FEET, "silver_boots"));

        LEAD_HELMET = addItem(new ArmorBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.HEAD, "lead_helmet"));
        LEAD_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.CHEST, "lead_chestplate"));
        LEAD_LEGGINGS = addItem(new ArmorBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.LEGS, "lead_leggings"));
        LEAD_BOOTS = addItem(new ArmorBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.FEET, "lead_boots"));

        ALUMINUM_HELMET = addItem(new ArmorBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.HEAD, "aluminum_helmet"));
        ALUMINUM_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.CHEST, "aluminum_chestplate"));
        ALUMINUM_LEGGINGS = addItem(new ArmorBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.LEGS, "aluminum_leggings"));
        ALUMINUM_BOOTS = addItem(new ArmorBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.FEET, "aluminum_boots"));

        NICKEL_HELMET = addItem(new ArmorBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.HEAD, "nickel_helmet"));
        NICKEL_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.CHEST, "nickel_chestplate"));
        NICKEL_LEGGINGS = addItem(new ArmorBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.LEGS, "nickel_leggings"));
        NICKEL_BOOTS = addItem(new ArmorBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.FEET, "nickel_boots"));

        PLATINUM_HELMET = addItem(new ArmorBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.HEAD, "platinum_helmet"));
        PLATINUM_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.CHEST, "platinum_chestplate"));
        PLATINUM_LEGGINGS = addItem(new ArmorBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.LEGS, "platinum_leggings"));
        PLATINUM_BOOTS = addItem(new ArmorBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.FEET, "platinum_boots"));

        STEEL_HELMET = addItem(new ArmorBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.HEAD, "steel_helmet"));
        STEEL_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.CHEST, "steel_chestplate"));
        STEEL_LEGGINGS = addItem(new ArmorBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.LEGS, "steel_leggings"));
        STEEL_BOOTS = addItem(new ArmorBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.FEET, "steel_boots"));

        ELECTRUM_HELMET = addItem(new ArmorBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.HEAD, "electrum_helmet"));
        ELECTRUM_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.CHEST, "electrum_chestplate"));
        ELECTRUM_LEGGINGS = addItem(new ArmorBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.LEGS, "electrum_leggings"));
        ELECTRUM_BOOTS = addItem(new ArmorBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.FEET, "electrum_boots"));

        BRONZE_HELMET = addItem(new ArmorBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.HEAD, "bronze_helmet"));
        BRONZE_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.CHEST, "bronze_chestplate"));
        BRONZE_LEGGINGS = addItem(new ArmorBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.LEGS, "bronze_leggings"));
        BRONZE_BOOTS = addItem(new ArmorBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.FEET, "bronze_boots"));

        EMERALD_HELMET = addItem(new ArmorBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.HEAD, "emerald_helmet"));
        EMERALD_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.CHEST, "emerald_chestplate"));
        EMERALD_LEGGINGS = addItem(new ArmorBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.LEGS, "emerald_leggings"));
        EMERALD_BOOTS = addItem(new ArmorBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.FEET, "emerald_boots"));

        LAPIS_HELMET = addItem(new ArmorBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.HEAD, "lapis_helmet"));
        LAPIS_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.CHEST, "lapis_chestplate"));
        LAPIS_LEGGINGS = addItem(new ArmorBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.LEGS, "lapis_leggings"));
        LAPIS_BOOTS = addItem(new ArmorBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.FEET, "lapis_boots"));

        REDSTONE_HELMET = addItem(new ArmorBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.HEAD, "redstone_helmet"));
        REDSTONE_CHESTPLATE = addItem(new ArmorBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.CHEST, "redstone_chestplate"));
        REDSTONE_LEGGINGS = addItem(new ArmorBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.LEGS, "redstone_leggings"));
        REDSTONE_BOOTS = addItem(new ArmorBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.FEET, "redstone_boots"));
    }

    @SideOnly(Side.CLIENT)
    private static void initModels() {

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(getItems());
        ModOreDictionary.initItems();
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.initModels();
        for (Item item : getItems()) {
            if (item.getRegistryName() != null)
                ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}
