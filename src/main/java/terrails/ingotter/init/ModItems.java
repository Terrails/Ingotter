package terrails.ingotter.init;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import terrails.ingotter.Constants;
import terrails.ingotter.Ingotter;
import terrails.ingotter.config.ConfigHandler;
import terrails.ingotter.items.ArmorRepairBase;
import terrails.ingotter.items.PaxelBase;
import terrails.terracore.item.ItemBase;
import terrails.terracore.item.ItemCraftingDurabilityBase;
import terrails.terracore.item.tool.*;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("WeakerAccess")
@Mod.EventBusSubscriber
@GameRegistry.ObjectHolder(Ingotter.MOD_ID)
public class ModItems {

    // Need to use a map since JAOPCA won't work if I don't register
    // OreDict in Registry event
    public static LinkedHashMap<String, Item> items = Maps.newLinkedHashMap();
    private static List<Item> itemList = Lists.newArrayList();

    public static final Item HAMMER;
    public static final Item WIRE_CUTTERS;

    public static final Item COPPER_INGOT;
    public static final Item TIN_INGOT;
    public static final Item SILVER_INGOT;
    public static final Item LEAD_INGOT;
    public static final Item ALUMINUM_INGOT;
    public static final Item NICKEL_INGOT;
    public static final Item PLATINUM_INGOT;
    public static final Item STEEL_INGOT;
    public static final Item ELECTRUM_INGOT;
    public static final Item BRONZE_INGOT;
    public static final Item INVAR_INGOT;

    public static final Item COPPER_NUGGET;
    public static final Item TIN_NUGGET;
    public static final Item SILVER_NUGGET;
    public static final Item LEAD_NUGGET;
    public static final Item ALUMINUM_NUGGET;
    public static final Item NICKEL_NUGGET;
    public static final Item PLATINUM_NUGGET;
    public static final Item STEEL_NUGGET;
    public static final Item ELECTRUM_NUGGET;
    public static final Item BRONZE_NUGGET;
    public static final Item IRON_NUGGET;
    public static final Item COAL_NUGGET;
    public static final Item DIAMOND_NUGGET;
    public static final Item EMERALD_NUGGET;
    public static final Item LAPIS_NUGGET;
    public static final Item REDSTONE_NUGGET;
    public static final Item INVAR_NUGGET;

    public static final Item COPPER_DUST;
    public static final Item TIN_DUST;
    public static final Item SILVER_DUST;
    public static final Item LEAD_DUST;
    public static final Item ALUMINUM_DUST;
    public static final Item NICKEL_DUST;
    public static final Item PLATINUM_DUST;
    public static final Item STEEL_DUST;
    public static final Item ELECTRUM_DUST;
    public static final Item BRONZE_DUST;
    public static final Item IRON_DUST;
    public static final Item GOLD_DUST;
    public static final Item COAL_DUST;
    public static final Item DIAMOND_DUST;
    public static final Item EMERALD_DUST;
    public static final Item LAPIS_DUST;
    public static final Item INVAR_DUST;

    public static final Item COPPER_PLATE;
    public static final Item TIN_PLATE;
    public static final Item SILVER_PLATE;
    public static final Item LEAD_PLATE;
    public static final Item ALUMINUM_PLATE;
    public static final Item NICKEL_PLATE;
    public static final Item PLATINUM_PLATE;
    public static final Item STEEL_PLATE;
    public static final Item ELECTRUM_PLATE;
    public static final Item BRONZE_PLATE;
    public static final Item IRON_PLATE;
    public static final Item GOLD_PLATE;
    public static final Item COAL_PLATE;
    public static final Item DIAMOND_PLATE;
    public static final Item EMERALD_PLATE;
    public static final Item LAPIS_PLATE;
    public static final Item REDSTONE_PLATE;
    public static final Item INVAR_PLATE;

    public static final Item COPPER_WIRE;
    public static final Item TIN_WIRE;
    public static final Item SILVER_WIRE;
    public static final Item LEAD_WIRE;
    public static final Item ALUMINUM_WIRE;
    public static final Item NICKEL_WIRE;
    public static final Item PLATINUM_WIRE;
    public static final Item STEEL_WIRE;
    public static final Item ELECTRUM_WIRE;
    public static final Item BRONZE_WIRE;
    public static final Item IRON_WIRE;
    public static final Item GOLD_WIRE;
    public static final Item COAL_WIRE;
    public static final Item DIAMOND_WIRE;
    public static final Item EMERALD_WIRE;
    public static final Item LAPIS_WIRE;
    public static final Item REDSTONE_WIRE;
    public static final Item INVAR_WIRE;


    public static final Item COPPER_SWORD;
    public static final Item TIN_SWORD;
    public static final Item SILVER_SWORD;
    public static final Item LEAD_SWORD;
    public static final Item ALUMINUM_SWORD;
    public static final Item NICKEL_SWORD;
    public static final Item PLATINUM_SWORD;
    public static final Item STEEL_SWORD;
    public static final Item ELECTRUM_SWORD;
    public static final Item BRONZE_SWORD;
    public static final Item EMERALD_SWORD;
    public static final Item LAPIS_SWORD;
    public static final Item REDSTONE_SWORD;
    public static final Item INVAR_SWORD;

    public static final Item COPPER_PICKAXE;
    public static final Item TIN_PICKAXE;
    public static final Item SILVER_PICKAXE;
    public static final Item LEAD_PICKAXE;
    public static final Item ALUMINUM_PICKAXE;
    public static final Item NICKEL_PICKAXE;
    public static final Item PLATINUM_PICKAXE;
    public static final Item STEEL_PICKAXE;
    public static final Item ELECTRUM_PICKAXE;
    public static final Item BRONZE_PICKAXE;
    public static final Item EMERALD_PICKAXE;
    public static final Item LAPIS_PICKAXE;
    public static final Item REDSTONE_PICKAXE;
    public static final Item INVAR_PICKAXE;

    public static final Item COPPER_SHOVEL;
    public static final Item TIN_SHOVEL;
    public static final Item SILVER_SHOVEL;
    public static final Item LEAD_SHOVEL;
    public static final Item ALUMINUM_SHOVEL;
    public static final Item NICKEL_SHOVEL;
    public static final Item PLATINUM_SHOVEL;
    public static final Item STEEL_SHOVEL;
    public static final Item ELECTRUM_SHOVEL;
    public static final Item BRONZE_SHOVEL;
    public static final Item EMERALD_SHOVEL;
    public static final Item LAPIS_SHOVEL;
    public static final Item REDSTONE_SHOVEL;
    public static final Item INVAR_SHOVEL;

    public static final Item COPPER_AXE;
    public static final Item TIN_AXE;
    public static final Item SILVER_AXE;
    public static final Item LEAD_AXE;
    public static final Item ALUMINUM_AXE;
    public static final Item NICKEL_AXE;
    public static final Item PLATINUM_AXE;
    public static final Item STEEL_AXE;
    public static final Item ELECTRUM_AXE;
    public static final Item BRONZE_AXE;
    public static final Item EMERALD_AXE;
    public static final Item LAPIS_AXE;
    public static final Item REDSTONE_AXE;
    public static final Item INVAR_AXE;

    public static final Item COPPER_HOE;
    public static final Item TIN_HOE;
    public static final Item SILVER_HOE;
    public static final Item LEAD_HOE;
    public static final Item ALUMINUM_HOE;
    public static final Item NICKEL_HOE;
    public static final Item PLATINUM_HOE;
    public static final Item STEEL_HOE;
    public static final Item ELECTRUM_HOE;
    public static final Item BRONZE_HOE;
    public static final Item EMERALD_HOE;
    public static final Item LAPIS_HOE;
    public static final Item REDSTONE_HOE;
    public static final Item INVAR_HOE;

    public static final Item COPPER_PAXEL;
    public static final Item TIN_PAXEL;
    public static final Item SILVER_PAXEL;
    public static final Item LEAD_PAXEL;
    public static final Item ALUMINUM_PAXEL;
    public static final Item NICKEL_PAXEL;
    public static final Item PLATINUM_PAXEL;
    public static final Item STEEL_PAXEL;
    public static final Item ELECTRUM_PAXEL;
    public static final Item BRONZE_PAXEL;
    public static final Item EMERALD_PAXEL;
    public static final Item LAPIS_PAXEL;
    public static final Item REDSTONE_PAXEL;
    public static final Item INVAR_PAXEL;

    public static final Item COPPER_HELMET;
    public static final Item TIN_HELMET;
    public static final Item SILVER_HELMET;
    public static final Item LEAD_HELMET;
    public static final Item ALUMINUM_HELMET;
    public static final Item NICKEL_HELMET;
    public static final Item PLATINUM_HELMET;
    public static final Item STEEL_HELMET;
    public static final Item ELECTRUM_HELMET;
    public static final Item BRONZE_HELMET;
    public static final Item EMERALD_HELMET;
    public static final Item LAPIS_HELMET;
    public static final Item REDSTONE_HELMET;
    public static final Item INVAR_HELMET;

    public static final Item COPPER_CHESTPLATE;
    public static final Item TIN_CHESTPLATE;
    public static final Item SILVER_CHESTPLATE;
    public static final Item LEAD_CHESTPLATE;
    public static final Item ALUMINUM_CHESTPLATE;
    public static final Item NICKEL_CHESTPLATE;
    public static final Item PLATINUM_CHESTPLATE;
    public static final Item STEEL_CHESTPLATE;
    public static final Item ELECTRUM_CHESTPLATE;
    public static final Item BRONZE_CHESTPLATE;
    public static final Item EMERALD_CHESTPLATE;
    public static final Item LAPIS_CHESTPLATE;
    public static final Item REDSTONE_CHESTPLATE;
    public static final Item INVAR_CHESTPLATE;

    public static final Item COPPER_LEGGINGS;
    public static final Item TIN_LEGGINGS;
    public static final Item SILVER_LEGGINGS;
    public static final Item LEAD_LEGGINGS;
    public static final Item ALUMINUM_LEGGINGS;
    public static final Item NICKEL_LEGGINGS;
    public static final Item PLATINUM_LEGGINGS;
    public static final Item STEEL_LEGGINGS;
    public static final Item ELECTRUM_LEGGINGS;
    public static final Item BRONZE_LEGGINGS;
    public static final Item EMERALD_LEGGINGS;
    public static final Item LAPIS_LEGGINGS;
    public static final Item REDSTONE_LEGGINGS;
    public static final Item INVAR_LEGGINGS;

    public static final Item COPPER_BOOTS;
    public static final Item TIN_BOOTS;
    public static final Item SILVER_BOOTS;
    public static final Item LEAD_BOOTS;
    public static final Item ALUMINUM_BOOTS;
    public static final Item NICKEL_BOOTS;
    public static final Item PLATINUM_BOOTS;
    public static final Item STEEL_BOOTS;
    public static final Item ELECTRUM_BOOTS;
    public static final Item BRONZE_BOOTS;
    public static final Item EMERALD_BOOTS;
    public static final Item LAPIS_BOOTS;
    public static final Item REDSTONE_BOOTS;
    public static final Item INVAR_BOOTS;

    public static void init() {
        if (ConfigHandler.wireHammer) {
            add(new CraftingDurabilityItem("hammer", 128).setCreativeTab(Ingotter.TOOLS_TAB));
            add(new CraftingDurabilityItem("wire_cutters", 128).setCreativeTab(Ingotter.TOOLS_TAB));
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

        for (Item item : get()) {
            String name = item.getUnlocalizedName();
            if (ConfigHandler.armor && (name.contains("_helmet") || name.contains("_chestplate") || name.contains("_leggings") || name.contains("_boots")))
                item.setCreativeTab(Ingotter.TOOLS_TAB);
            else if (ConfigHandler.tools && (name.contains("_sword") || name.contains("_pickaxe") || name.contains("_axe") || name.contains("_shovel") || name.contains("_hoe")))
                item.setCreativeTab(Ingotter.TOOLS_TAB);
            else if (ConfigHandler.ingots && name.contains("_ingot"))
                item.setCreativeTab(Ingotter.RESOURCES_TAB);
            else if ((ConfigHandler.gemNuggets || ConfigHandler.ingotNuggets) && name.contains("_nugget"))
                item.setCreativeTab(Ingotter.RESOURCES_TAB);
            else if (ConfigHandler.plates && name.contains("_plate"))
                item.setCreativeTab(Ingotter.RESOURCES_TAB);
            else if (ConfigHandler.wires && name.contains("_wire"))
                item.setCreativeTab(Ingotter.RESOURCES_TAB);
            else if (ConfigHandler.dusts && name.contains("_dust"))
                item.setCreativeTab(Ingotter.RESOURCES_TAB);
        }
    }

    private static void initIngots() {
        add(new BaseItem("copper_ingot"));
        add(new BaseItem("tin_ingot"));
        add(new BaseItem("silver_ingot"));
        add(new BaseItem("lead_ingot"));
        add(new BaseItem("aluminum_ingot"));
        add(new BaseItem("nickel_ingot"));
        add(new BaseItem("platinum_ingot"));
        add(new BaseItem("steel_ingot"));
        add(new BaseItem("electrum_ingot"));
        add(new BaseItem("bronze_ingot"));
        add(new BaseItem("invar_ingot"));
    }
    private static void initNuggets() {
        if (ConfigHandler.ingotNuggets) {
            add(new BaseItem("copper_nugget"));
            add(new BaseItem("tin_nugget"));
            add(new BaseItem("silver_nugget"));
            add(new BaseItem("lead_nugget"));
            add(new BaseItem("aluminum_nugget"));
            add(new BaseItem("nickel_nugget"));
            add(new BaseItem("platinum_nugget"));
            add(new BaseItem("steel_nugget"));
            add(new BaseItem("electrum_nugget"));
            add(new BaseItem("bronze_nugget"));
            add(new BaseItem("iron_nugget"));
            add(new BaseItem("invar_nugget"));
        }
        if (ConfigHandler.gemNuggets) {
            add(new BaseItem("coal_nugget") {
                @Override
                public int getItemBurnTime(ItemStack itemStack) {
                    return 200;
                }
            });
            add(new BaseItem("diamond_nugget"));
            add(new BaseItem("emerald_nugget"));
            add(new BaseItem("lapis_nugget"));
            add(new BaseItem("redstone_nugget"));
        }
    }
    private static void initDusts() {
        add(new BaseItem("copper_dust"));
        add(new BaseItem("tin_dust"));
        add(new BaseItem("silver_dust"));
        add(new BaseItem("lead_dust"));
        add(new BaseItem("aluminum_dust"));
        add(new BaseItem("nickel_dust"));
        add(new BaseItem("platinum_dust"));
        add(new BaseItem("steel_dust"));
        add(new BaseItem("electrum_dust"));
        add(new BaseItem("bronze_dust"));
        add(new BaseItem("iron_dust"));
        add(new BaseItem("gold_dust"));
        add(new BaseItem("invar_dust"));
        add(new BaseItem("coal_dust") {
            @Override
            public int getItemBurnTime(ItemStack itemStack) {
                return 1800;
            }
        });
        add(new BaseItem("diamond_dust"));
        add(new BaseItem("emerald_dust"));
        add(new BaseItem("lapis_dust"));
    }
    private static void initPlates() {
        add(new BaseItem("copper_plate"));
        add(new BaseItem("tin_plate"));
        add(new BaseItem("silver_plate"));
        add(new BaseItem("lead_plate"));
        add(new BaseItem("aluminum_plate"));
        add(new BaseItem("nickel_plate"));
        add(new BaseItem("platinum_plate"));
        add(new BaseItem("steel_plate"));
        add(new BaseItem("electrum_plate"));
        add(new BaseItem("bronze_plate"));
        add(new BaseItem("iron_plate"));
        add(new BaseItem("gold_plate"));
        add(new BaseItem("invar_plate"));
        add(new BaseItem("coal_plate") {
            @Override
            public int getItemBurnTime(ItemStack itemStack) {
                return 2400;
            }
        });
        add(new BaseItem("diamond_plate"));
        add(new BaseItem("emerald_plate"));
        add(new BaseItem("lapis_plate"));
        add(new BaseItem("redstone_plate"));
    }
    private static void initWires() {
        add(new BaseItem("copper_wire"));
        add(new BaseItem("tin_wire"));
        add(new BaseItem("silver_wire"));
        add(new BaseItem("lead_wire"));
        add(new BaseItem("aluminum_wire"));
        add(new BaseItem("nickel_wire"));
        add(new BaseItem("platinum_wire"));
        add(new BaseItem("steel_wire"));
        add(new BaseItem("electrum_wire"));
        add(new BaseItem("bronze_wire"));
        add(new BaseItem("iron_wire"));
        add(new BaseItem("gold_wire"));
        add(new BaseItem("invar_wire"));
        add(new BaseItem("coal_wire") {
            @Override
            public int getItemBurnTime(ItemStack itemStack) {
                return 800;
            }
        });
        add(new BaseItem("diamond_wire"));
        add(new BaseItem("emerald_wire"));
        add(new BaseItem("lapis_wire"));
        add(new BaseItem("redstone_wire"));
    }

    private static void initTools() {
        add(new SwordItem(Constants.Materials.COPPER_TOOL, "copper_sword"));
        add(new PickaxeItem(Constants.Materials.COPPER_TOOL, "copper_pickaxe"));
        add(new ShovelItem(Constants.Materials.COPPER_TOOL, "copper_shovel"));
        add(new AxeItem(Constants.Materials.COPPER_TOOL, "copper_axe"));
        add(new HoeItem(Constants.Materials.COPPER_TOOL, "copper_hoe"));
        add(new PaxelBase(Constants.Materials.COPPER_TOOL, "copper_paxel"));

        add(new SwordItem(Constants.Materials.TIN_TOOL, "tin_sword"));
        add(new PickaxeItem(Constants.Materials.TIN_TOOL, "tin_pickaxe"));
        add(new ShovelItem(Constants.Materials.TIN_TOOL, "tin_shovel"));
        add(new AxeItem(Constants.Materials.TIN_TOOL, "tin_axe"));
        add(new HoeItem(Constants.Materials.TIN_TOOL, "tin_hoe"));
        add(new PaxelBase(Constants.Materials.TIN_TOOL, "tin_paxel"));

        add(new SwordItem(Constants.Materials.SILVER_TOOL, "silver_sword"));
        add(new PickaxeItem(Constants.Materials.SILVER_TOOL, "silver_pickaxe"));
        add(new ShovelItem(Constants.Materials.SILVER_TOOL, "silver_shovel"));
        add(new AxeItem(Constants.Materials.SILVER_TOOL, "silver_axe"));
        add(new HoeItem(Constants.Materials.SILVER_TOOL, "silver_hoe"));
        add(new PaxelBase(Constants.Materials.SILVER_TOOL, "silver_paxel"));

        add(new SwordItem(Constants.Materials.LEAD_TOOL, "lead_sword"));
        add(new PickaxeItem(Constants.Materials.LEAD_TOOL, "lead_pickaxe"));
        add(new ShovelItem(Constants.Materials.LEAD_TOOL, "lead_shovel"));
        add(new AxeItem(Constants.Materials.LEAD_TOOL, "lead_axe"));
        add(new HoeItem(Constants.Materials.LEAD_TOOL, "lead_hoe"));
        add(new PaxelBase(Constants.Materials.LEAD_TOOL, "lead_paxel"));

        add(new SwordItem(Constants.Materials.ALUMINUM_TOOL, "aluminum_sword"));
        add(new PickaxeItem(Constants.Materials.ALUMINUM_TOOL, "aluminum_pickaxe"));
        add(new ShovelItem(Constants.Materials.ALUMINUM_TOOL, "aluminum_shovel"));
        add(new AxeItem(Constants.Materials.ALUMINUM_TOOL, "aluminum_axe"));
        add(new HoeItem(Constants.Materials.ALUMINUM_TOOL, "aluminum_hoe"));
        add(new PaxelBase(Constants.Materials.ALUMINUM_TOOL, "aluminum_paxel"));

        add(new SwordItem(Constants.Materials.NICKEL_TOOL, "nickel_sword"));
        add(new PickaxeItem(Constants.Materials.NICKEL_TOOL, "nickel_pickaxe"));
        add(new ShovelItem(Constants.Materials.NICKEL_TOOL, "nickel_shovel"));
        add(new AxeItem(Constants.Materials.NICKEL_TOOL, "nickel_axe"));
        add(new HoeItem(Constants.Materials.NICKEL_TOOL, "nickel_hoe"));
        add(new PaxelBase(Constants.Materials.NICKEL_TOOL, "nickel_paxel"));

        add(new SwordItem(Constants.Materials.PLATINUM_TOOL, "platinum_sword"));
        add(new PickaxeItem(Constants.Materials.PLATINUM_TOOL, "platinum_pickaxe"));
        add(new ShovelItem(Constants.Materials.PLATINUM_TOOL, "platinum_shovel"));
        add(new AxeItem(Constants.Materials.PLATINUM_TOOL, "platinum_axe"));
        add(new HoeItem(Constants.Materials.PLATINUM_TOOL, "platinum_hoe"));
        add(new PaxelBase(Constants.Materials.PLATINUM_TOOL, "platinum_paxel"));

        add(new SwordItem(Constants.Materials.STEEL_TOOL, "steel_sword"));
        add(new PickaxeItem(Constants.Materials.STEEL_TOOL, "steel_pickaxe"));
        add(new ShovelItem(Constants.Materials.STEEL_TOOL, "steel_shovel"));
        add(new AxeItem(Constants.Materials.STEEL_TOOL, "steel_axe"));
        add(new HoeItem(Constants.Materials.STEEL_TOOL, "steel_hoe"));
        add(new PaxelBase(Constants.Materials.STEEL_TOOL, "steel_paxel"));

        add(new SwordItem(Constants.Materials.ELECTRUM_TOOL, "electrum_sword"));
        add(new PickaxeItem(Constants.Materials.ELECTRUM_TOOL, "electrum_pickaxe"));
        add(new ShovelItem(Constants.Materials.ELECTRUM_TOOL, "electrum_shovel"));
        add(new AxeItem(Constants.Materials.ELECTRUM_TOOL, "electrum_axe"));
        add(new HoeItem(Constants.Materials.ELECTRUM_TOOL, "electrum_hoe"));
        add(new PaxelBase(Constants.Materials.ELECTRUM_TOOL, "electrum_paxel"));

        add(new SwordItem(Constants.Materials.BRONZE_TOOL, "bronze_sword"));
        add(new PickaxeItem(Constants.Materials.BRONZE_TOOL, "bronze_pickaxe"));
        add(new ShovelItem(Constants.Materials.BRONZE_TOOL, "bronze_shovel"));
        add(new AxeItem(Constants.Materials.BRONZE_TOOL, "bronze_axe"));
        add(new HoeItem(Constants.Materials.BRONZE_TOOL, "bronze_hoe"));
        add(new PaxelBase(Constants.Materials.BRONZE_TOOL, "bronze_paxel"));

        add(new SwordItem(Constants.Materials.EMERALD_TOOL, "emerald_sword"));
        add(new PickaxeItem(Constants.Materials.EMERALD_TOOL, "emerald_pickaxe"));
        add(new ShovelItem(Constants.Materials.EMERALD_TOOL, "emerald_shovel"));
        add(new AxeItem(Constants.Materials.EMERALD_TOOL, "emerald_axe"));
        add(new HoeItem(Constants.Materials.EMERALD_TOOL, "emerald_hoe"));
        add(new PaxelBase(Constants.Materials.EMERALD_TOOL, "emerald_paxel"));

        add(new SwordItem(Constants.Materials.LAPIS_TOOL, "lapis_sword"));
        add(new PickaxeItem(Constants.Materials.LAPIS_TOOL, "lapis_pickaxe"));
        add(new ShovelItem(Constants.Materials.LAPIS_TOOL, "lapis_shovel"));
        add(new AxeItem(Constants.Materials.LAPIS_TOOL, "lapis_axe"));
        add(new HoeItem(Constants.Materials.LAPIS_TOOL, "lapis_hoe"));
        add(new PaxelBase(Constants.Materials.LAPIS_TOOL, "lapis_paxel"));

        add(new SwordItem(Constants.Materials.REDSTONE_TOOL, "redstone_sword"));
        add(new PickaxeItem(Constants.Materials.REDSTONE_TOOL, "redstone_pickaxe"));
        add(new ShovelItem(Constants.Materials.REDSTONE_TOOL, "redstone_shovel"));
        add(new AxeItem(Constants.Materials.REDSTONE_TOOL, "redstone_axe"));
        add(new HoeItem(Constants.Materials.REDSTONE_TOOL, "redstone_hoe"));
        add(new PaxelBase(Constants.Materials.REDSTONE_TOOL, "redstone_paxel"));

        add(new SwordItem(Constants.Materials.INVAR_TOOL, "invar_sword"));
        add(new PickaxeItem(Constants.Materials.INVAR_TOOL, "invar_pickaxe"));
        add(new ShovelItem(Constants.Materials.INVAR_TOOL, "invar_shovel"));
        add(new AxeItem(Constants.Materials.INVAR_TOOL, "invar_axe"));
        add(new HoeItem(Constants.Materials.INVAR_TOOL, "invar_hoe"));
        add(new PaxelBase(Constants.Materials.INVAR_TOOL, "invar_paxel"));
    }
    private static void initArmor() {
        add(new ArmorRepairBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.HEAD, "copper_helmet"));
        add(new ArmorRepairBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.CHEST, "copper_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.LEGS, "copper_leggings"));
        add(new ArmorRepairBase(Constants.Materials.COPPER_ARMOR, EntityEquipmentSlot.FEET, "copper_boots"));

        add(new ArmorRepairBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.HEAD, "tin_helmet"));
        add(new ArmorRepairBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.CHEST, "tin_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.LEGS, "tin_leggings"));
        add(new ArmorRepairBase(Constants.Materials.TIN_ARMOR, EntityEquipmentSlot.FEET, "tin_boots"));

        add(new ArmorRepairBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.HEAD, "silver_helmet"));
        add(new ArmorRepairBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.CHEST, "silver_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.LEGS, "silver_leggings"));
        add(new ArmorRepairBase(Constants.Materials.SILVER_ARMOR, EntityEquipmentSlot.FEET, "silver_boots"));

        add(new ArmorRepairBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.HEAD, "lead_helmet"));
        add(new ArmorRepairBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.CHEST, "lead_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.LEGS, "lead_leggings"));
        add(new ArmorRepairBase(Constants.Materials.LEAD_ARMOR, EntityEquipmentSlot.FEET, "lead_boots"));

        add(new ArmorRepairBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.HEAD, "aluminum_helmet"));
        add(new ArmorRepairBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.CHEST, "aluminum_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.LEGS, "aluminum_leggings"));
        add(new ArmorRepairBase(Constants.Materials.ALUMINUM_ARMOR, EntityEquipmentSlot.FEET, "aluminum_boots"));

        add(new ArmorRepairBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.HEAD, "nickel_helmet"));
        add(new ArmorRepairBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.CHEST, "nickel_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.LEGS, "nickel_leggings"));
        add(new ArmorRepairBase(Constants.Materials.NICKEL_ARMOR, EntityEquipmentSlot.FEET, "nickel_boots"));

        add(new ArmorRepairBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.HEAD, "platinum_helmet"));
        add(new ArmorRepairBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.CHEST, "platinum_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.LEGS, "platinum_leggings"));
        add(new ArmorRepairBase(Constants.Materials.PLATINUM_ARMOR, EntityEquipmentSlot.FEET, "platinum_boots"));

        add(new ArmorRepairBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.HEAD, "steel_helmet"));
        add(new ArmorRepairBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.CHEST, "steel_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.LEGS, "steel_leggings"));
        add(new ArmorRepairBase(Constants.Materials.STEEL_ARMOR, EntityEquipmentSlot.FEET, "steel_boots"));

        add(new ArmorRepairBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.HEAD, "electrum_helmet"));
        add(new ArmorRepairBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.CHEST, "electrum_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.LEGS, "electrum_leggings"));
        add(new ArmorRepairBase(Constants.Materials.ELECTRUM_ARMOR, EntityEquipmentSlot.FEET, "electrum_boots"));

        add(new ArmorRepairBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.HEAD, "bronze_helmet"));
        add(new ArmorRepairBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.CHEST, "bronze_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.LEGS, "bronze_leggings"));
        add(new ArmorRepairBase(Constants.Materials.BRONZE_ARMOR, EntityEquipmentSlot.FEET, "bronze_boots"));

        add(new ArmorRepairBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.HEAD, "emerald_helmet"));
        add(new ArmorRepairBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.CHEST, "emerald_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.LEGS, "emerald_leggings"));
        add(new ArmorRepairBase(Constants.Materials.EMERALD_ARMOR, EntityEquipmentSlot.FEET, "emerald_boots"));

        add(new ArmorRepairBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.HEAD, "lapis_helmet"));
        add(new ArmorRepairBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.CHEST, "lapis_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.LEGS, "lapis_leggings"));
        add(new ArmorRepairBase(Constants.Materials.LAPIS_ARMOR, EntityEquipmentSlot.FEET, "lapis_boots"));

        add(new ArmorRepairBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.HEAD, "redstone_helmet"));
        add(new ArmorRepairBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.CHEST, "redstone_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.LEGS, "redstone_leggings"));
        add(new ArmorRepairBase(Constants.Materials.REDSTONE_ARMOR, EntityEquipmentSlot.FEET, "redstone_boots"));

        add(new ArmorRepairBase(Constants.Materials.INVAR_ARMOR, EntityEquipmentSlot.HEAD, "invar_helmet"));
        add(new ArmorRepairBase(Constants.Materials.INVAR_ARMOR, EntityEquipmentSlot.CHEST, "invar_chestplate"));
        add(new ArmorRepairBase(Constants.Materials.INVAR_ARMOR, EntityEquipmentSlot.LEGS, "invar_leggings"));
        add(new ArmorRepairBase(Constants.Materials.INVAR_ARMOR, EntityEquipmentSlot.FEET, "invar_boots"));
    }

    private static class BaseItem extends ItemBase {
        private BaseItem(String name) {
            setRegistryName(new ResourceLocation(Ingotter.MOD_ID, name));
            setUnlocalizedName(Ingotter.MOD_ID + "." + name);
        }
    }
    private static class AxeItem extends AxeBase {
        private AxeItem(ToolMaterial material, String name) {
            super(material);
            this.setRegistryName(new ResourceLocation(Ingotter.MOD_ID, name));
            setUnlocalizedName(Ingotter.MOD_ID + "." + name);
        }
    }
    private static class HoeItem extends HoeBase {
        private HoeItem(ToolMaterial material, String name) {
            super(material);
            this.setRegistryName(new ResourceLocation(Ingotter.MOD_ID, name));
            setUnlocalizedName(Ingotter.MOD_ID + "." + name);
        }
    }
    private static class PickaxeItem extends PickaxeBase {
        private PickaxeItem(ToolMaterial material, String name) {
            super(material);
            this.setRegistryName(new ResourceLocation(Ingotter.MOD_ID, name));
            setUnlocalizedName(Ingotter.MOD_ID + "." + name);
        }
    }
    private static class ShovelItem extends ShovelBase {
        private ShovelItem(ToolMaterial material, String name) {
            super(material);
            this.setRegistryName(new ResourceLocation(Ingotter.MOD_ID, name));
            setUnlocalizedName(Ingotter.MOD_ID + "." + name);
        }
    }
    private static class SwordItem extends SwordBase {
        public SwordItem(ToolMaterial material, String name) {
            super(material);
            this.setRegistryName(new ResourceLocation(Ingotter.MOD_ID, name));
            setUnlocalizedName(Ingotter.MOD_ID + "." + name);
        }
    }
    private static class CraftingDurabilityItem extends ItemCraftingDurabilityBase {
        private CraftingDurabilityItem(String name, int damage) {
            super(damage);
            setRegistryName(new ResourceLocation(Ingotter.MOD_ID, name));
            setUnlocalizedName(Ingotter.MOD_ID + "." + name);
            this.displayDurability = true;
        }
    }

    private static <T extends Item> void add(T item) {
        items.put(Objects.requireNonNull(item.getRegistryName()).getResourcePath(), item);
        itemList.add(item);
    }

    public static Item[] get() {
        return itemList.toArray(new Item[itemList.size()]);
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModOreDictionary.initItems();
    }

    static {
        HAMMER = null;
        WIRE_CUTTERS = null;

        COPPER_INGOT = null;
        TIN_INGOT = null;
        SILVER_INGOT = null;
        LEAD_INGOT = null;
        ALUMINUM_INGOT = null;
        NICKEL_INGOT = null;
        PLATINUM_INGOT = null;
        STEEL_INGOT = null;
        ELECTRUM_INGOT = null;
        BRONZE_INGOT = null;
        INVAR_INGOT = null;

        COPPER_NUGGET = null;
        TIN_NUGGET = null;
        SILVER_NUGGET = null;
        LEAD_NUGGET = null;
        ALUMINUM_NUGGET = null;
        NICKEL_NUGGET = null;
        PLATINUM_NUGGET = null;
        STEEL_NUGGET = null;
        ELECTRUM_NUGGET = null;
        BRONZE_NUGGET = null;
        IRON_NUGGET = null;
        COAL_NUGGET = null;
        DIAMOND_NUGGET = null;
        EMERALD_NUGGET = null;
        LAPIS_NUGGET = null;
        REDSTONE_NUGGET = null;
        INVAR_NUGGET = null;

        COPPER_DUST = null;
        TIN_DUST = null;
        SILVER_DUST = null;
        LEAD_DUST = null;
        ALUMINUM_DUST = null;
        NICKEL_DUST = null;
        PLATINUM_DUST = null;
        STEEL_DUST = null;
        ELECTRUM_DUST = null;
        BRONZE_DUST = null;
        IRON_DUST = null;
        GOLD_DUST = null;
        COAL_DUST = null;
        DIAMOND_DUST = null;
        EMERALD_DUST = null;
        LAPIS_DUST = null;
        INVAR_DUST = null;

        COPPER_PLATE = null;
        TIN_PLATE = null;
        SILVER_PLATE = null;
        LEAD_PLATE = null;
        ALUMINUM_PLATE = null;
        NICKEL_PLATE = null;
        PLATINUM_PLATE = null;
        STEEL_PLATE = null;
        ELECTRUM_PLATE = null;
        BRONZE_PLATE = null;
        IRON_PLATE = null;
        GOLD_PLATE = null;
        COAL_PLATE = null;
        DIAMOND_PLATE = null;
        EMERALD_PLATE = null;
        LAPIS_PLATE = null;
        REDSTONE_PLATE = null;
        INVAR_PLATE = null;

        COPPER_WIRE = null;
        TIN_WIRE = null;
        SILVER_WIRE = null;
        LEAD_WIRE = null;
        ALUMINUM_WIRE = null;
        NICKEL_WIRE = null;
        PLATINUM_WIRE = null;
        STEEL_WIRE = null;
        ELECTRUM_WIRE = null;
        BRONZE_WIRE = null;
        IRON_WIRE = null;
        GOLD_WIRE = null;
        COAL_WIRE = null;
        DIAMOND_WIRE = null;
        EMERALD_WIRE = null;
        LAPIS_WIRE = null;
        REDSTONE_WIRE = null;
        INVAR_WIRE = null;


        COPPER_SWORD = null;
        TIN_SWORD = null;
        SILVER_SWORD = null;
        LEAD_SWORD = null;
        ALUMINUM_SWORD = null;
        NICKEL_SWORD = null;
        PLATINUM_SWORD = null;
        STEEL_SWORD = null;
        ELECTRUM_SWORD = null;
        BRONZE_SWORD = null;
        EMERALD_SWORD = null;
        LAPIS_SWORD = null;
        REDSTONE_SWORD = null;
        INVAR_SWORD = null;

        COPPER_PICKAXE = null;
        TIN_PICKAXE = null;
        SILVER_PICKAXE = null;
        LEAD_PICKAXE = null;
        ALUMINUM_PICKAXE = null;
        NICKEL_PICKAXE = null;
        PLATINUM_PICKAXE = null;
        STEEL_PICKAXE = null;
        ELECTRUM_PICKAXE = null;
        BRONZE_PICKAXE = null;
        EMERALD_PICKAXE = null;
        LAPIS_PICKAXE = null;
        REDSTONE_PICKAXE = null;
        INVAR_PICKAXE = null;

        COPPER_SHOVEL = null;
        TIN_SHOVEL = null;
        SILVER_SHOVEL = null;
        LEAD_SHOVEL = null;
        ALUMINUM_SHOVEL = null;
        NICKEL_SHOVEL = null;
        PLATINUM_SHOVEL = null;
        STEEL_SHOVEL = null;
        ELECTRUM_SHOVEL = null;
        BRONZE_SHOVEL = null;
        EMERALD_SHOVEL = null;
        LAPIS_SHOVEL = null;
        REDSTONE_SHOVEL = null;
        INVAR_SHOVEL = null;

        COPPER_AXE = null;
        TIN_AXE = null;
        SILVER_AXE = null;
        LEAD_AXE = null;
        ALUMINUM_AXE = null;
        NICKEL_AXE = null;
        PLATINUM_AXE = null;
        STEEL_AXE = null;
        ELECTRUM_AXE = null;
        BRONZE_AXE = null;
        EMERALD_AXE = null;
        LAPIS_AXE = null;
        REDSTONE_AXE = null;
        INVAR_AXE = null;

        COPPER_HOE = null;
        TIN_HOE = null;
        SILVER_HOE = null;
        LEAD_HOE = null;
        ALUMINUM_HOE = null;
        NICKEL_HOE = null;
        PLATINUM_HOE = null;
        STEEL_HOE = null;
        ELECTRUM_HOE = null;
        BRONZE_HOE = null;
        EMERALD_HOE = null;
        LAPIS_HOE = null;
        REDSTONE_HOE = null;
        INVAR_HOE = null;

        COPPER_PAXEL = null;
        TIN_PAXEL = null;
        SILVER_PAXEL = null;
        LEAD_PAXEL = null;
        ALUMINUM_PAXEL = null;
        NICKEL_PAXEL = null;
        PLATINUM_PAXEL = null;
        STEEL_PAXEL = null;
        ELECTRUM_PAXEL = null;
        BRONZE_PAXEL = null;
        EMERALD_PAXEL = null;
        LAPIS_PAXEL = null;
        REDSTONE_PAXEL = null;
        INVAR_PAXEL = null;

        COPPER_HELMET = null;
        TIN_HELMET = null;
        SILVER_HELMET = null;
        LEAD_HELMET = null;
        ALUMINUM_HELMET = null;
        NICKEL_HELMET = null;
        PLATINUM_HELMET = null;
        STEEL_HELMET = null;
        ELECTRUM_HELMET = null;
        BRONZE_HELMET = null;
        EMERALD_HELMET = null;
        LAPIS_HELMET = null;
        REDSTONE_HELMET = null;
        INVAR_HELMET = null;

        COPPER_CHESTPLATE = null;
        TIN_CHESTPLATE = null;
        SILVER_CHESTPLATE = null;
        LEAD_CHESTPLATE = null;
        ALUMINUM_CHESTPLATE = null;
        NICKEL_CHESTPLATE = null;
        PLATINUM_CHESTPLATE = null;
        STEEL_CHESTPLATE = null;
        ELECTRUM_CHESTPLATE = null;
        BRONZE_CHESTPLATE = null;
        EMERALD_CHESTPLATE = null;
        LAPIS_CHESTPLATE = null;
        REDSTONE_CHESTPLATE = null;
        INVAR_CHESTPLATE = null;

        COPPER_LEGGINGS = null;
        TIN_LEGGINGS = null;
        SILVER_LEGGINGS = null;
        LEAD_LEGGINGS = null;
        ALUMINUM_LEGGINGS = null;
        NICKEL_LEGGINGS = null;
        PLATINUM_LEGGINGS = null;
        STEEL_LEGGINGS = null;
        ELECTRUM_LEGGINGS = null;
        BRONZE_LEGGINGS = null;
        EMERALD_LEGGINGS = null;
        LAPIS_LEGGINGS = null;
        REDSTONE_LEGGINGS = null;
        INVAR_LEGGINGS = null;

        COPPER_BOOTS = null;
        TIN_BOOTS = null;
        SILVER_BOOTS = null;
        LEAD_BOOTS = null;
        ALUMINUM_BOOTS = null;
        NICKEL_BOOTS = null;
        PLATINUM_BOOTS = null;
        STEEL_BOOTS = null;
        ELECTRUM_BOOTS = null;
        BRONZE_BOOTS = null;
        EMERALD_BOOTS = null;
        LAPIS_BOOTS = null;
        REDSTONE_BOOTS = null;
        INVAR_BOOTS = null;
    }
}
