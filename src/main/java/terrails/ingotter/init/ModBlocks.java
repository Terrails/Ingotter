package terrails.ingotter.init;

import com.google.common.collect.Maps;
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
import net.minecraftforge.fml.common.registry.GameRegistry;
import terrails.ingotter.Constants;
import terrails.ingotter.blocks.BlockOreBase;
import terrails.ingotter.blocks.BlockOreCustomDrop;
import terrails.ingotter.config.ConfigHandler;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@SuppressWarnings("WeakerAccess")
@Mod.EventBusSubscriber
@GameRegistry.ObjectHolder(Constants.MOD_ID)
public class ModBlocks {

    public static LinkedHashMap<String, Block> blocks = Maps.newLinkedHashMap();
    
    public static final Block COPPER_BLOCK;
    public static final Block TIN_BLOCK;
    public static final Block SILVER_BLOCK;
    public static final Block LEAD_BLOCK;
    public static final Block ALUMINUM_BLOCK;
    public static final Block NICKEL_BLOCK;
    public static final Block PLATINUM_BLOCK;
    public static final Block STEEL_BLOCK;
    public static final Block ELECTRUM_BLOCK;
    public static final Block BRONZE_BLOCK;
    public static final Block INVAR_BLOCK;

    public static final Block COPPER_ORE;
    public static final Block TIN_ORE;
    public static final Block SILVER_ORE;
    public static final Block LEAD_ORE;
    public static final Block ALUMINUM_ORE;
    public static final Block NICKEL_ORE;
    public static final Block PLATINUM_ORE;

    public static final Block COPPER_ORE_NETHER;
    public static final Block TIN_ORE_NETHER;
    public static final Block SILVER_ORE_NETHER;
    public static final Block LEAD_ORE_NETHER;
    public static final Block ALUMINUM_ORE_NETHER;
    public static final Block NICKEL_ORE_NETHER;
    public static final Block PLATINUM_ORE_NETHER;
    public static final Block IRON_ORE_NETHER;
    public static final Block GOLD_ORE_NETHER;
    public static final Block DIAMOND_ORE_NETHER;
    public static final Block LAPIS_ORE_NETHER;
    public static final Block REDSTONE_ORE_NETHER;
    public static final Block EMERALD_ORE_NETHER;
    public static final Block COAL_ORE_NETHER;

    public static final Block COPPER_ORE_END;
    public static final Block TIN_ORE_END;
    public static final Block SILVER_ORE_END;
    public static final Block LEAD_ORE_END;
    public static final Block ALUMINUM_ORE_END;
    public static final Block NICKEL_ORE_END;
    public static final Block PLATINUM_ORE_END;
    public static final Block IRON_ORE_END;
    public static final Block GOLD_ORE_END;
    public static final Block DIAMOND_ORE_END;
    public static final Block LAPIS_ORE_END;
    public static final Block REDSTONE_ORE_END;
    public static final Block EMERALD_ORE_END;
    public static final Block COAL_ORE_END;

    public static void init() {
        if (ConfigHandler.blocks) {
            add(new BlockOreBase(Material.IRON, "copper_block", 1));
            add(new BlockOreBase(Material.IRON, "tin_block", 1));
            add(new BlockOreBase(Material.IRON, "silver_block", 2).setLightLevel(0.5f));
            add(new BlockOreBase(Material.IRON, "lead_block", 2));
            add(new BlockOreBase(Material.IRON, "aluminum_block", 1));
            add(new BlockOreBase(Material.IRON, "nickel_block", 2));
            add(new BlockOreBase(Material.IRON, "platinum_block", 3));
            add(new BlockOreBase(Material.IRON, "steel_block", 3));
            add(new BlockOreBase(Material.IRON, "electrum_block", 3));
            add(new BlockOreBase(Material.IRON, "bronze_block", 3));
            add(new BlockOreBase(Material.IRON, "invar_block", 2));
        }

        if (ConfigHandler.ores) {
            initOres();
            initNetherOres();
            initEndOres();
        }
    }
    
    private static void initOres() {
        add(new BlockOreBase("copper_ore", 1));
        add(new BlockOreBase("tin_ore", 1));
        add(new BlockOreBase("silver_ore", 2, 0.5f));
        add(new BlockOreBase("lead_ore", 2));
        add(new BlockOreBase("aluminum_ore", 1));
        add(new BlockOreBase("nickel_ore", 2));
        add(new BlockOreBase("platinum_ore", 3));
    }
    private static void initNetherOres() {
        add(new BlockOreBase("copper_ore_nether", 1));
        add(new BlockOreBase("tin_ore_nether", 1));
        add(new BlockOreBase("silver_ore_nether", 2, 0.5f));
        add(new BlockOreBase("lead_ore_nether", 2));
        add(new BlockOreBase("aluminum_ore_nether", 1));
        add(new BlockOreBase("nickel_ore_nether", 2));
        add(new BlockOreBase("platinum_ore_nether", 3));
        add(new BlockOreBase("iron_ore_nether", 1));
        add(new BlockOreBase("gold_ore_nether", 2));
        add(new BlockOreCustomDrop("diamond_ore_nether", Items.DIAMOND, 0, 1, 3, 3, 0));
        add(new BlockOreCustomDrop("lapis_ore_nether", Items.DYE, 4, 2, 8, 3, 0));
        add(new BlockOreCustomDrop("redstone_ore_nether", Items.REDSTONE, 0, 3, 8, 3, 0));
        add(new BlockOreCustomDrop("emerald_ore_nether", Items.EMERALD, 0, 1, 3, 3, 0));
        add(new BlockOreCustomDrop("coal_ore_nether", Items.DIAMOND, 0, 1, 2, 1, 0));
    }
    private static void initEndOres() {
        add(new BlockOreBase("copper_ore_end", 1));
        add(new BlockOreBase("tin_ore_end", 1));
        add(new BlockOreBase("silver_ore_end", 2, 0.5f));
        add(new BlockOreBase("lead_ore_end", 2));
        add(new BlockOreBase("aluminum_ore_end", 1));
        add(new BlockOreBase("nickel_ore_end", 2));
        add(new BlockOreBase("platinum_ore_end", 3));
        add(new BlockOreBase("iron_ore_end", 1));
        add(new BlockOreBase("gold_ore_end", 2));
        add(new BlockOreCustomDrop("diamond_ore_end", Items.DIAMOND, 0, 1, 3, 3, 0));
        add(new BlockOreCustomDrop("lapis_ore_end", Items.DYE, 4, 2, 8, 3, 0));
        add(new BlockOreCustomDrop("redstone_ore_end", Items.REDSTONE, 0, 3, 8, 3, 0));
        add(new BlockOreCustomDrop("emerald_ore_end", Items.EMERALD, 0, 1, 3, 3, 0));
        add(new BlockOreCustomDrop("coal_ore_end", Items.DIAMOND, 0, 1, 2, 1, 0));
    }

    public static <T extends Block> void add(T block) {
        blocks.put(Objects.requireNonNull(block.getRegistryName()).getResourcePath(), block);
    }

    public static Block[] get() {
        return blocks.values().toArray(new Block[blocks.size()]);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(get());
    }
    @SubscribeEvent
    public static void registerItemBlocks(net.minecraftforge.event.RegistryEvent.Register<Item> event) {
        for (Block block : get()) {
            if (block.getRegistryName() != null)
                event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
        ModOreDictionary.initBlocks();
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for (Block block : get()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Objects.requireNonNull(block.getRegistryName()), "inventory"));
        }
    }

    static {
        COPPER_BLOCK = null;
        TIN_BLOCK = null;
        SILVER_BLOCK = null;
        LEAD_BLOCK = null;
        ALUMINUM_BLOCK = null;
        NICKEL_BLOCK = null;
        PLATINUM_BLOCK = null;
        STEEL_BLOCK = null;
        ELECTRUM_BLOCK = null;
        BRONZE_BLOCK = null;
        INVAR_BLOCK = null;

        COPPER_ORE = null;
        TIN_ORE = null;
        SILVER_ORE = null;
        LEAD_ORE = null;
        ALUMINUM_ORE = null;
        NICKEL_ORE = null;
        PLATINUM_ORE = null;

        COPPER_ORE_NETHER = null;
        TIN_ORE_NETHER = null;
        SILVER_ORE_NETHER = null;
        LEAD_ORE_NETHER = null;
        ALUMINUM_ORE_NETHER = null;
        NICKEL_ORE_NETHER = null;
        PLATINUM_ORE_NETHER = null;
        IRON_ORE_NETHER = null;
        GOLD_ORE_NETHER = null;
        DIAMOND_ORE_NETHER = null;
        LAPIS_ORE_NETHER = null;
        REDSTONE_ORE_NETHER = null;
        EMERALD_ORE_NETHER = null;
        COAL_ORE_NETHER = null;

        COPPER_ORE_END = null;
        TIN_ORE_END = null;
        SILVER_ORE_END = null;
        LEAD_ORE_END = null;
        ALUMINUM_ORE_END = null;
        NICKEL_ORE_END = null;
        PLATINUM_ORE_END = null;
        IRON_ORE_END = null;
        GOLD_ORE_END = null;
        DIAMOND_ORE_END = null;
        LAPIS_ORE_END = null;
        REDSTONE_ORE_END = null;
        EMERALD_ORE_END = null;
        COAL_ORE_END = null;
    }
}
