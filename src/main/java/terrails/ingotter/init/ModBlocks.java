package terrails.ingotter.init;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import terrails.ingotter.Constants;
import terrails.ingotter.blocks.BlockOreBase;
import terrails.ingotter.blocks.BlockOreCustomDrop;
import terrails.ingotter.config.ConfigHandler;
import terrails.terracore.registry.newest.BlockRegistry;

import java.util.Objects;

@Mod.EventBusSubscriber
public class ModBlocks extends BlockRegistry {

    public static Block COPPER;
    public static Block TIN;
    public static Block SILVER;
    public static Block LEAD;
    public static Block ALUMINUM;
    public static Block NICKEL;
    public static Block PLATINUM;
    public static Block STEEL;
    public static Block ELECTRUM;
    public static Block BRONZE;

    public static Block COPPER_ORE;
    public static Block TIN_ORE;
    public static Block SILVER_ORE;
    public static Block LEAD_ORE;
    public static Block ALUMINUM_ORE;
    public static Block NICKEL_ORE;
    public static Block PLATINUM_ORE;

    public static Block COPPER_NETHER_ORE;
    public static Block TIN_NETHER_ORE;
    public static Block SILVER_NETHER_ORE;
    public static Block LEAD_NETHER_ORE;
    public static Block ALUMINUM_NETHER_ORE;
    public static Block NICKEL_NETHER_ORE;
    public static Block PLATINUM_NETHER_ORE;
    public static Block IRON_NETHER_ORE;
    public static Block GOLD_NETHER_ORE;
    public static Block DIAMOND_NETHER_ORE;
    public static Block LAPIS_NETHER_ORE;
    public static Block REDSTONE_NETHER_ORE;
    public static Block EMERALD_NETHER_ORE;
    public static Block COAL_NETHER_ORE;

    public static Block COPPER_END_ORE;
    public static Block TIN_END_ORE;
    public static Block SILVER_END_ORE;
    public static Block LEAD_END_ORE;
    public static Block ALUMINUM_END_ORE;
    public static Block NICKEL_END_ORE;
    public static Block PLATINUM_END_ORE;
    public static Block IRON_END_ORE;
    public static Block GOLD_END_ORE;
    public static Block DIAMOND_END_ORE;
    public static Block LAPIS_END_ORE;
    public static Block REDSTONE_END_ORE;
    public static Block EMERALD_END_ORE;
    public static Block COAL_END_ORE;

    public static void init() {
        blockList = Lists.newArrayList();
        COPPER = add(new BlockOreBase(Material.IRON, "copper_block", 1));
        TIN = add(new BlockOreBase(Material.IRON, "tin_block", 1));
        SILVER = add(new BlockOreBase(Material.IRON, "silver_block", 2).setLightLevel(0.5f));
        LEAD = add(new BlockOreBase(Material.IRON, "lead_block", 2));
        ALUMINUM = add(new BlockOreBase(Material.IRON, "aluminum_block", 1));
        NICKEL = add(new BlockOreBase(Material.IRON, "nickel_block", 2));
        PLATINUM = add(new BlockOreBase(Material.IRON, "platinum_block", 3));
        STEEL = add(new BlockOreBase(Material.IRON, "steel_block", 3));
        ELECTRUM = add(new BlockOreBase(Material.IRON, "electrum_block", 3));
        BRONZE = add(new BlockOreBase(Material.IRON, "bronze_block", 3));

        if (ConfigHandler.ores) {
            initOres();
            initNetherOres();
            initEndOres();
        }

        for (Block block : getBlocks()) {
            if (block.getRegistryName() != null && block.getRegistryName().getResourceDomain().contains(Constants.MOD_ID)) {}
          //      block.setCreativeTab(Constants.RESOURCES_TAB);
        }
    }
    
    private static void initOres() {
        COPPER_ORE = add(new BlockOreBase("copper_ore", 1));
        TIN_ORE = add(new BlockOreBase("tin_ore", 1));
        SILVER_ORE = add(new BlockOreBase("silver_ore", 2, 0.5f));
        LEAD_ORE = add(new BlockOreBase("lead_ore", 2));
        ALUMINUM_ORE = add(new BlockOreBase("aluminum_ore", 1));
        NICKEL_ORE = add(new BlockOreBase("nickel_ore", 2));
        PLATINUM_ORE = add(new BlockOreBase("platinum_ore", 3));
    }
    private static void initNetherOres() {
        COPPER_NETHER_ORE = add(new BlockOreBase("copper_ore_nether", 1));
        TIN_NETHER_ORE = add(new BlockOreBase("tin_ore_nether", 1));
        SILVER_NETHER_ORE = add(new BlockOreBase("silver_ore_nether", 2, 0.5f));
        LEAD_NETHER_ORE = add(new BlockOreBase("lead_ore_nether", 2));
        ALUMINUM_NETHER_ORE = add(new BlockOreBase("aluminum_ore_nether", 1));
        NICKEL_NETHER_ORE = add(new BlockOreBase("nickel_ore_nether", 2));
        PLATINUM_NETHER_ORE = add(new BlockOreBase("platinum_ore_nether", 3));
        IRON_NETHER_ORE = add(new BlockOreBase("iron_ore_nether", 1));
        GOLD_NETHER_ORE = add(new BlockOreBase("gold_ore_nether", 2));
        DIAMOND_NETHER_ORE = add(new BlockOreCustomDrop("diamond_ore_nether", Items.DIAMOND, 0, 1, 3, 3, 0));
        LAPIS_NETHER_ORE = add(new BlockOreCustomDrop("lapis_ore_nether", Items.DYE, 4, 2, 8, 3, 0));
        REDSTONE_NETHER_ORE = add(new BlockOreCustomDrop("redstone_ore_nether", Items.REDSTONE, 0, 3, 8, 3, 0));
        EMERALD_NETHER_ORE = add(new BlockOreCustomDrop("emerald_ore_nether", Items.EMERALD, 0, 1, 3, 3, 0));
        COAL_NETHER_ORE = add(new BlockOreCustomDrop("coal_ore_nether", Items.DIAMOND, 0, 1, 2, 1, 0));
    }
    private static void initEndOres() {
        COPPER_END_ORE = add(new BlockOreBase("copper_ore_end", 1));
        TIN_END_ORE = add(new BlockOreBase("tin_ore_end", 1));
        SILVER_END_ORE = add(new BlockOreBase("silver_ore_end", 2, 0.5f));
        LEAD_END_ORE = add(new BlockOreBase("lead_ore_end", 2));
        ALUMINUM_END_ORE = add(new BlockOreBase("aluminum_ore_end", 1));
        NICKEL_END_ORE = add(new BlockOreBase("nickel_ore_end", 2));
        PLATINUM_END_ORE = add(new BlockOreBase("platinum_ore_end", 3));
        IRON_END_ORE = add(new BlockOreBase("iron_ore_end", 1));
        GOLD_END_ORE = add(new BlockOreBase("gold_ore_end", 2));
        DIAMOND_END_ORE = add(new BlockOreCustomDrop("diamond_ore_end", Items.DIAMOND, 0, 1, 3, 3, 0));
        LAPIS_END_ORE = add(new BlockOreCustomDrop("lapis_ore_end", Items.DYE, 4, 2, 8, 3, 0));
        REDSTONE_END_ORE = add(new BlockOreCustomDrop("redstone_ore_end", Items.REDSTONE, 0, 3, 8, 3, 0));
        EMERALD_END_ORE = add(new BlockOreCustomDrop("emerald_ore_end", Items.EMERALD, 0, 1, 3, 3, 0));
        COAL_END_ORE = add(new BlockOreCustomDrop("coal_ore_end", Items.DIAMOND, 0, 1, 2, 1, 0));
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(getBlocks());
    }
    @SubscribeEvent
    public static void registerItemBlocks(net.minecraftforge.event.RegistryEvent.Register<Item> event) {
        for (Block block : getBlocks()) {
            if (block.getRegistryName() != null)
                event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
        ModOreDictionary.initBlocks();
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for (Block block : getBlocks()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Objects.requireNonNull(block.getRegistryName()), "inventory"));
        }
    }
}
