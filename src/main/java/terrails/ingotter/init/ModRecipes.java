package terrails.ingotter.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import terrails.ingotter.config.ConfigHandler;

import java.util.List;

public class ModRecipes {

    static List<IRecipe> crafting = CraftingManager.getInstance().getRecipeList();
    static ItemStack HAMMER = new ItemStack(ModItems.HAMMER, 1, 32767);
    static ItemStack WIRE_CUTTERS = new ItemStack(ModItems.WIRE_CUTTERS, 1, 32767);
    static ItemStack LAPIS = new ItemStack(Items.DYE, 1, 4);

    public static void init() {
        ItemStack planksAll = new ItemStack(Blocks.PLANKS, 1, 32767);

        shapelessRecipes();
        blockRecipes();

        crafting.add(ShapelessOre(new ItemStack(ModItems.BRONZE_INGOT, 4), "ingotCopper", "ingotCopper", "ingotCopper", "ingotTin"));
        if (ConfigHandler.dusts) {
            crafting.add(ShapelessOre(new ItemStack(ModItems.ELECTRUM_DUST, 2), "dustSilver", "dustGold"));
            crafting.add(ShapelessOre(ModItems.STEEL_DUST, "ingotIron", Items.COAL));
        }
        if (ConfigHandler.tools) {
            crafting.add(ShapedOre(ModItems.HAMMER, "  I", " S ", "S  ", 'I', "ingotIron", 'S', Items.STICK));
            crafting.add(ShapedOre(ModItems.WIRE_CUTTERS, "I I", " S ", "P P", 'I', "ingotIron", 'S', Items.STICK, 'P', planksAll));
        }

        if (ConfigHandler.plates && ConfigHandler.tools)
            plateRecipes();
        if (ConfigHandler.plates && ConfigHandler.wires && ConfigHandler.tools)
            wireRecipes();
        if (ConfigHandler.dusts && ConfigHandler.tools)
            dustRecipes();

        smeltingRecipes();
    }

    public static void shapelessRecipes() {
        crafting.add(ShapelessOre(new ItemStack(ModItems.COPPER_INGOT, 9), "blockCopper"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.TIN_INGOT, 9), "blockTin"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.SILVER_INGOT, 9), "blockSilver"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.LEAD_INGOT, 9), "blockLead"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.ALUMINUM_INGOT, 9), "blockAluminum"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.NICKEL_INGOT, 9), "blockNickel"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.PLATINUM_INGOT, 9), "blockPlatinum"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.STEEL_INGOT, 9), "blockSteel"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.ELECTRUM_INGOT, 9), "blockElectrum"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.BRONZE_INGOT, 9), "blockBronze"));

        crafting.add(ShapelessOre(new ItemStack(ModItems.COPPER_NUGGET, 9), "ingotCopper"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.TIN_NUGGET, 9), "ingotTin"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.SILVER_NUGGET, 9), "ingotSilver"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.LEAD_NUGGET, 9), "ingotLead"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.ALUMINUM_NUGGET, 9), "ingotAluminum"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.NICKEL_NUGGET, 9), "ingotNickel"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.PLATINUM_NUGGET, 9), "ingotPlatinum"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.STEEL_NUGGET, 9), "ingotSteel"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.ELECTRUM_NUGGET, 9), "ingotElectrum"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.BRONZE_NUGGET, 9), "ingotBronze"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.COAL_NUGGET, 8), Items.COAL));
        crafting.add(ShapelessOre(new ItemStack(ModItems.DIAMOND_NUGGET, 9), Items.DIAMOND));
        crafting.add(ShapelessOre(new ItemStack(ModItems.EMERALD_NUGGET, 9), Items.EMERALD));
        crafting.add(ShapelessOre(new ItemStack(ModItems.LAPIS_NUGGET, 9), LAPIS));
        crafting.add(ShapelessOre(new ItemStack(ModItems.REDSTONE_NUGGET, 9), Items.REDSTONE));
    }
    public static void plateRecipes() {
        crafting.add(ShapelessOre(ModItems.IRON_PLATE, HAMMER, "ingotIron", "ingotIron"));
        crafting.add(ShapelessOre(ModItems.GOLD_PLATE, HAMMER, "ingotGold", "ingotGold"));
        crafting.add(ShapelessOre(ModItems.COPPER_PLATE, HAMMER, "ingotCopper", "ingotCopper"));
        crafting.add(ShapelessOre(ModItems.TIN_PLATE, HAMMER, "ingotTin", "ingotTin"));
        crafting.add(ShapelessOre(ModItems.SILVER_PLATE, HAMMER, "ingotSilver", "ingotSilver"));
        crafting.add(ShapelessOre(ModItems.LEAD_PLATE, HAMMER, "ingotLead", "ingotLead"));
        crafting.add(ShapelessOre(ModItems.ALUMINUM_PLATE, HAMMER, "ingotAluminum", "ingotAluminum"));
        crafting.add(ShapelessOre(ModItems.NICKEL_PLATE, HAMMER, "ingotNickel", "ingotNickel"));
        crafting.add(ShapelessOre(ModItems.PLATINUM_PLATE, HAMMER, "ingotPlatinum", "ingotPlatinum"));
        crafting.add(ShapelessOre(ModItems.STEEL_PLATE, HAMMER, "ingotSteel", "ingotSteel"));
        crafting.add(ShapelessOre(ModItems.ELECTRUM_PLATE, HAMMER, "ingotElectrum", "ingotElectrum"));
        crafting.add(ShapelessOre(ModItems.BRONZE_PLATE, HAMMER, "ingotBronze", "ingotBronze"));
        crafting.add(ShapelessOre(ModItems.COAL_PLATE, HAMMER, Items.COAL, Items.COAL));
        crafting.add(ShapelessOre(ModItems.DIAMOND_PLATE, HAMMER, Items.DIAMOND, Items.DIAMOND));
        crafting.add(ShapelessOre(ModItems.EMERALD_PLATE, HAMMER, Items.EMERALD, Items.EMERALD));
        crafting.add(ShapelessOre(ModItems.REDSTONE_PLATE, HAMMER, Items.REDSTONE, Items.REDSTONE));
        crafting.add(ShapelessOre(ModItems.LAPIS_PLATE, HAMMER, LAPIS, LAPIS));
    }
    public static void wireRecipes() {
        crafting.add(ShapelessOre(new ItemStack(ModItems.IRON_WIRE, 3), WIRE_CUTTERS, "plateIron"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.GOLD_WIRE, 3), WIRE_CUTTERS, "plateGold"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.COPPER_WIRE, 3), WIRE_CUTTERS, "plateCopper"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.TIN_WIRE, 3), WIRE_CUTTERS, "plateTin"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.SILVER_WIRE, 3), WIRE_CUTTERS, "plateSilver"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.LEAD_WIRE, 3), WIRE_CUTTERS, "plateLead"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.ALUMINUM_WIRE, 3), WIRE_CUTTERS, "plateAluminum"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.NICKEL_WIRE, 3), WIRE_CUTTERS, "plateNickel"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.PLATINUM_WIRE, 3), WIRE_CUTTERS, "platePlatinum"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.STEEL_WIRE, 3), WIRE_CUTTERS, "plateSteel"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.ELECTRUM_WIRE, 3), WIRE_CUTTERS, "plateElectrum"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.BRONZE_WIRE, 3), WIRE_CUTTERS, "plateBronze"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.COAL_WIRE, 3), WIRE_CUTTERS, "plateCoal"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.DIAMOND_WIRE, 3), WIRE_CUTTERS, "plateDiamond"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.EMERALD_WIRE, 3), WIRE_CUTTERS, "plateEmerald"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.REDSTONE_WIRE, 3), WIRE_CUTTERS, "plateRedstone"));
        crafting.add(ShapelessOre(new ItemStack(ModItems.LAPIS_WIRE, 3), WIRE_CUTTERS, "plateLapis"));
    }
    public static void dustRecipes() {
        if (ConfigHandler.ores) {
            crafting.add(ShapelessOre(new ItemStack(ModItems.IRON_DUST, 2), HAMMER, "oreIron"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.GOLD_DUST, 2), HAMMER, "oreGold"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.COPPER_DUST, 2), HAMMER, "oreCopper"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.TIN_DUST, 2), HAMMER, "oreTin"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.SILVER_DUST, 2), HAMMER, "oreSilver"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.LEAD_DUST, 2), HAMMER, "oreLead"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.ALUMINUM_DUST, 2), HAMMER, "oreAluminum"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.NICKEL_DUST, 2), HAMMER, "oreNickel"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.PLATINUM_DUST, 2), HAMMER, "orePlatinum"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.STEEL_DUST, 2), HAMMER, "oreSteel"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.ELECTRUM_DUST, 2), HAMMER, "oreElectrum"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.BRONZE_DUST, 2), HAMMER, "oreBronze"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.COAL_DUST, 2), HAMMER, "oreCoal"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.DIAMOND_DUST, 2), HAMMER, "oreDiamond"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.EMERALD_DUST, 2), HAMMER, "oreEmerald"));
            crafting.add(ShapelessOre(new ItemStack(Items.REDSTONE, 2), HAMMER, "oreRedstone"));
            crafting.add(ShapelessOre(new ItemStack(ModItems.LAPIS_DUST, 2), HAMMER, "oreLapis"));
        }
        crafting.add(ShapelessOre(ModItems.IRON_DUST, HAMMER, "ingotIron"));
        crafting.add(ShapelessOre(ModItems.GOLD_DUST, HAMMER, "ingotGold"));
        crafting.add(ShapelessOre(ModItems.COPPER_DUST, HAMMER, "ingotCopper"));
        crafting.add(ShapelessOre(ModItems.TIN_DUST, HAMMER, "ingotTin"));
        crafting.add(ShapelessOre(ModItems.SILVER_DUST, HAMMER, "ingotSilver"));
        crafting.add(ShapelessOre(ModItems.LEAD_DUST, HAMMER, "ingotLead"));
        crafting.add(ShapelessOre(ModItems.ALUMINUM_DUST, HAMMER, "ingotAluminum"));
        crafting.add(ShapelessOre(ModItems.NICKEL_DUST, HAMMER, "ingotNickel"));
        crafting.add(ShapelessOre(ModItems.PLATINUM_DUST, HAMMER, "ingotPlatinum"));
        crafting.add(ShapelessOre(ModItems.STEEL_DUST, HAMMER, "ingotSteel"));
        crafting.add(ShapelessOre(ModItems.ELECTRUM_DUST, HAMMER, "ingotElectrum"));
        crafting.add(ShapelessOre(ModItems.BRONZE_DUST, HAMMER, "ingotBronze"));
        crafting.add(ShapelessOre(ModItems.COAL_DUST, HAMMER, Items.COAL));
        crafting.add(ShapelessOre(ModItems.DIAMOND_DUST, HAMMER, Items.DIAMOND));
        crafting.add(ShapelessOre(ModItems.EMERALD_DUST, HAMMER, Items.EMERALD));
        crafting.add(ShapelessOre(ModItems.LAPIS_DUST, HAMMER, LAPIS));
    }
    public static void blockRecipes() {
        crafting.add(ShapedOre(ModItems.COPPER_INGOT, "CCC", "CCC", "CCC", 'C', "nuggetCopper"));
        crafting.add(ShapedOre(ModItems.TIN_INGOT, "CCC", "CCC", "CCC", 'C', "nuggetTin"));
        crafting.add(ShapedOre(ModItems.SILVER_INGOT, "CCC", "CCC", "CCC", 'C', "nuggetSilver"));
        crafting.add(ShapedOre(ModItems.LEAD_INGOT, "CCC", "CCC", "CCC", 'C', "nuggetLead"));
        crafting.add(ShapedOre(ModItems.ALUMINUM_INGOT, "CCC", "CCC", "CCC", 'C', "nuggetAluminum"));
        crafting.add(ShapedOre(ModItems.NICKEL_INGOT, "CCC", "CCC", "CCC", 'C', "nuggetNickel"));
        crafting.add(ShapedOre(ModItems.PLATINUM_INGOT, "CCC", "CCC", "CCC", 'C', "nuggetPlatinum"));
        crafting.add(ShapedOre(ModItems.STEEL_INGOT, "CCC", "CCC", "CCC", 'C', "nuggetSteel"));
        crafting.add(ShapedOre(ModItems.ELECTRUM_INGOT, "CCC", "CCC", "CCC", 'C', "nuggetElectrum"));
        crafting.add(ShapedOre(ModItems.BRONZE_INGOT, "CCC", "CCC", "CCC", 'C', "nuggetBronze"));
        crafting.add(ShapedOre(Items.COAL, "CCC", "C C", "CCC", 'C', "nuggetCoal"));
        crafting.add(ShapedOre(Items.DIAMOND, "DDD", "DDD", "DDD", 'D', "nuggetDiamond"));
        crafting.add(ShapedOre(Items.EMERALD, "EEE", "EEE", "EEE", 'E', "nuggetEmerald"));
        crafting.add(ShapedOre(LAPIS, "LLL", "LLL", "LLL", 'L', "nuggetLapis"));

        crafting.add(ShapedOre(ModBlocks.COPPER, "CCC", "CCC", "CCC", 'C', "ingotCopper"));
        crafting.add(ShapedOre(ModBlocks.TIN, "CCC", "CCC", "CCC", 'C', "ingotTin"));
        crafting.add(ShapedOre(ModBlocks.SILVER, "CCC", "CCC", "CCC", 'C', "ingotSilver"));
        crafting.add(ShapedOre(ModBlocks.LEAD, "CCC", "CCC", "CCC", 'C', "ingotLead"));
        crafting.add(ShapedOre(ModBlocks.ALUMINUM, "CCC", "CCC", "CCC", 'C', "ingotAluminum"));
        crafting.add(ShapedOre(ModBlocks.NICKEL, "CCC", "CCC", "CCC", 'C', "ingotNickel"));
        crafting.add(ShapedOre(ModBlocks.PLATINUM, "CCC", "CCC", "CCC", 'C', "ingotPlatinum"));
        crafting.add(ShapedOre(ModBlocks.STEEL, "CCC", "CCC", "CCC", 'C', "ingotSteel"));
        crafting.add(ShapedOre(ModBlocks.ELECTRUM, "CCC", "CCC", "CCC", 'C', "ingotElectrum"));
        crafting.add(ShapedOre(ModBlocks.BRONZE, "CCC", "CCC", "CCC", 'C', "ingotBronze"));
    }
    
    public static void smeltingRecipes() {
        if (ConfigHandler.ores) {
            addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT), 0.4F);
            addSmelting(ModBlocks.TIN_ORE, new ItemStack(ModItems.TIN_INGOT), 0.4F);
            addSmelting(ModBlocks.SILVER_ORE, new ItemStack(ModItems.SILVER_INGOT), 0.4F);
            addSmelting(ModBlocks.LEAD_ORE, new ItemStack(ModItems.LEAD_INGOT), 0.4F);
            addSmelting(ModBlocks.ALUMINUM_ORE, new ItemStack(ModItems.ALUMINUM_INGOT), 0.4F);
            addSmelting(ModBlocks.NICKEL_ORE, new ItemStack(ModItems.NICKEL_INGOT), 0.4F);
            addSmelting(ModBlocks.PLATINUM_ORE, new ItemStack(ModItems.PLATINUM_INGOT), 0.4F);

            addSmelting(ModBlocks.COPPER_NETHER_ORE, new ItemStack(ModItems.COPPER_INGOT), 0.5F);
            addSmelting(ModBlocks.TIN_NETHER_ORE, new ItemStack(ModItems.TIN_INGOT), 0.5F);
            addSmelting(ModBlocks.SILVER_NETHER_ORE, new ItemStack(ModItems.SILVER_INGOT), 0.5F);
            addSmelting(ModBlocks.LEAD_NETHER_ORE, new ItemStack(ModItems.LEAD_INGOT), 0.5F);
            addSmelting(ModBlocks.ALUMINUM_NETHER_ORE, new ItemStack(ModItems.ALUMINUM_INGOT), 0.5F);
            addSmelting(ModBlocks.NICKEL_NETHER_ORE, new ItemStack(ModItems.NICKEL_INGOT), 0.5F);
            addSmelting(ModBlocks.PLATINUM_NETHER_ORE, new ItemStack(ModItems.PLATINUM_INGOT), 0.5F);
            addSmelting(ModBlocks.IRON_NETHER_ORE, new ItemStack(Items.IRON_INGOT), 0.5F);
            addSmelting(ModBlocks.GOLD_NETHER_ORE, new ItemStack(Items.GOLD_INGOT), 0.5F);

            addSmelting(ModBlocks.COPPER_END_ORE, new ItemStack(ModItems.COPPER_INGOT), 0.8f);
            addSmelting(ModBlocks.TIN_END_ORE, new ItemStack(ModItems.TIN_INGOT), 0.8f);
            addSmelting(ModBlocks.SILVER_END_ORE, new ItemStack(ModItems.SILVER_INGOT), 0.8f);
            addSmelting(ModBlocks.LEAD_END_ORE, new ItemStack(ModItems.LEAD_INGOT), 0.8f);
            addSmelting(ModBlocks.ALUMINUM_END_ORE, new ItemStack(ModItems.ALUMINUM_INGOT), 0.8f);
            addSmelting(ModBlocks.NICKEL_END_ORE, new ItemStack(ModItems.NICKEL_INGOT), 0.8f);
            addSmelting(ModBlocks.PLATINUM_END_ORE, new ItemStack(ModItems.PLATINUM_INGOT), 0.8f);
            addSmelting(ModBlocks.IRON_END_ORE, new ItemStack(Items.IRON_INGOT), 0.8f);
            addSmelting(ModBlocks.GOLD_END_ORE, new ItemStack(Items.GOLD_INGOT), 0.8f);
        }

        if (ConfigHandler.dusts) {
            addSmelting(ModItems.IRON_DUST, new ItemStack(Items.IRON_INGOT), 0.5F);
            addSmelting(ModItems.GOLD_DUST, new ItemStack(Items.GOLD_INGOT), 0.5F);
            addSmelting(ModItems.COPPER_DUST, new ItemStack(ModItems.COPPER_INGOT), 0.5F);
            addSmelting(ModItems.TIN_DUST, new ItemStack(ModItems.TIN_INGOT), 0.5F);
            addSmelting(ModItems.SILVER_DUST, new ItemStack(ModItems.SILVER_INGOT), 0.5F);
            addSmelting(ModItems.LEAD_DUST, new ItemStack(ModItems.LEAD_INGOT), 0.5F);
            addSmelting(ModItems.ALUMINUM_DUST, new ItemStack(ModItems.ALUMINUM_INGOT), 0.5F);
            addSmelting(ModItems.NICKEL_DUST, new ItemStack(ModItems.NICKEL_INGOT), 0.5F);
            addSmelting(ModItems.PLATINUM_DUST, new ItemStack(ModItems.PLATINUM_INGOT), 0.5F);
            addSmelting(ModItems.STEEL_DUST, new ItemStack(ModItems.STEEL_INGOT), 0.5F);
            addSmelting(ModItems.ELECTRUM_DUST, new ItemStack(ModItems.ELECTRUM_INGOT), 0.5F);
            addSmelting(ModItems.BRONZE_DUST, new ItemStack(ModItems.BRONZE_INGOT), 0.5F);
            addSmelting(ModItems.DIAMOND_DUST, new ItemStack(Items.DIAMOND), 0.5F);
            addSmelting(ModItems.EMERALD_DUST, new ItemStack(Items.EMERALD), 0.5F);
            addSmelting(ModItems.LAPIS_DUST, new ItemStack(Items.DYE, 1, 4), 0.5F);
        }
    }


    public static void addSmelting(Item input, ItemStack output, float xp) {
        GameRegistry.addSmelting(input, output, xp);
    }
    public static void addSmelting(Block input, ItemStack output, float xp) {
        GameRegistry.addSmelting(input, output, xp);
    }
    public static void addSmelting(ItemStack input, ItemStack output, float xp) {
        GameRegistry.addSmelting(input, output, xp);
    }
    public static ShapelessOreRecipe ShapelessOre(Item output, Object... input) {
        return new ShapelessOreRecipe(new ItemStack(output), input);
    }
    public static ShapelessOreRecipe ShapelessOre(Block output, Object... input) {
        return new ShapelessOreRecipe(new ItemStack(output), input);
    }
    public static ShapelessOreRecipe ShapelessOre(ItemStack output, Object... input) {
        return new ShapelessOreRecipe(output, input);
    }
    public static ShapedOreRecipe ShapedOre(Item output, Object... input) {
        return new ShapedOreRecipe(new ItemStack(output), input);
    }
    public static ShapedOreRecipe ShapedOre(Block output, Object... input) {
        return new ShapedOreRecipe(new ItemStack(output), input);
    }
    public static ShapedOreRecipe ShapedOre(ItemStack output, Object... input) {
        return new ShapedOreRecipe(output, input);
    }
}
