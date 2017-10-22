package terrails.ingotter.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import terrails.ingotter.config.ConfigHandler;

public class ModOreDictionary {

    public static void init() {

        if (ConfigHandler.ores) {
            add("oreCopper", ModBlocks.COPPER_ORE, ModBlocks.COPPER_NETHER_ORE, ModBlocks.COPPER_END_ORE);
            add("oreTin", ModBlocks.TIN_ORE, ModBlocks.TIN_NETHER_ORE, ModBlocks.TIN_END_ORE);
            add("oreSilver", ModBlocks.SILVER_ORE, ModBlocks.SILVER_NETHER_ORE, ModBlocks.SILVER_END_ORE);
            add("oreLead", ModBlocks.LEAD_ORE, ModBlocks.LEAD_NETHER_ORE, ModBlocks.LEAD_END_ORE);
            add("oreAluminum", ModBlocks.ALUMINUM_ORE, ModBlocks.ALUMINUM_NETHER_ORE, ModBlocks.ALUMINUM_END_ORE);
            add("oreAluminium", ModBlocks.ALUMINUM_ORE, ModBlocks.ALUMINUM_NETHER_ORE, ModBlocks.ALUMINUM_END_ORE);
            add("oreNickel", ModBlocks.NICKEL_ORE, ModBlocks.NICKEL_NETHER_ORE, ModBlocks.NICKEL_END_ORE);
            add("oreFerrous", ModBlocks.NICKEL_ORE, ModBlocks.NICKEL_NETHER_ORE, ModBlocks.NICKEL_END_ORE);
            add("orePlatinum", ModBlocks.PLATINUM_ORE, ModBlocks.PLATINUM_NETHER_ORE, ModBlocks.PLATINUM_END_ORE);
            add("oreIron", ModBlocks.IRON_NETHER_ORE, ModBlocks.IRON_END_ORE);
            add("oreGold", ModBlocks.GOLD_NETHER_ORE, ModBlocks.GOLD_END_ORE);
            add("oreDiamond", ModBlocks.DIAMOND_NETHER_ORE, ModBlocks.DIAMOND_END_ORE);
            add("oreLapis", ModBlocks.LAPIS_NETHER_ORE, ModBlocks.LAPIS_END_ORE);
            add("oreRedstone", ModBlocks.REDSTONE_NETHER_ORE, ModBlocks.REDSTONE_END_ORE);
            add("oreEmerald", ModBlocks.EMERALD_NETHER_ORE, ModBlocks.EMERALD_END_ORE);
            add("oreCoal", ModBlocks.COAL_NETHER_ORE, ModBlocks.COAL_END_ORE);
        }

        add("nuggetCopper", ModItems.COPPER_NUGGET);
        add("nuggetTin", ModItems.TIN_NUGGET);
        add("nuggetSilver", ModItems.SILVER_NUGGET);
        add("nuggetLead", ModItems.LEAD_NUGGET);
        add(ModItems.ALUMINUM_NUGGET, "nuggetAluminum", "nuggetAluminium");
        add(ModItems.NICKEL_NUGGET, "nuggetNickel", "nuggetFerrous");
        add("nuggetPlatinum", ModItems.PLATINUM_NUGGET);
        add("nuggetSteel", ModItems.STEEL_NUGGET);
        add("nuggetElectrum", ModItems.ELECTRUM_NUGGET);
        add("nuggetBronze", ModItems.BRONZE_NUGGET);
        add("nuggetCoal", ModItems.COAL_NUGGET);
        add("nuggetDiamond", ModItems.DIAMOND_NUGGET);
        add("nuggetEmerald", ModItems.EMERALD_NUGGET);
        add("nuggetLapis", ModItems.LAPIS_NUGGET);
        add("nuggetIron", ModItems.IRON_NUGGET);
        add("nuggetRedstone", ModItems.REDSTONE_NUGGET);

        add("ingotCopper", ModItems.COPPER_INGOT);
        add("ingotTin", ModItems.TIN_INGOT);
        add("ingotSilver", ModItems.SILVER_INGOT);
        add("ingotLead", ModItems.LEAD_INGOT);
        add(ModItems.ALUMINUM_INGOT, "ingotAluminum", "ingotAluminium");
        add(ModItems.NICKEL_INGOT, "ingotNickel", "ingotFerrous");
        add("ingotPlatinum", ModItems.PLATINUM_INGOT);
        add("ingotSteel", ModItems.STEEL_INGOT);
        add("ingotElectrum", ModItems.ELECTRUM_INGOT);
        add("ingotBronze", ModItems.BRONZE_INGOT);

        add("blockCopper", ModBlocks.COPPER);
        add("blockTin", ModBlocks.TIN);
        add("blockSilver", ModBlocks.SILVER);
        add("blockLead", ModBlocks.LEAD);
        add(ModBlocks.ALUMINUM, "blockAluminum", "blockAluminium");
        add(ModBlocks.NICKEL, "blockNickel", "blockFerrous");
        add("blockPlatinum", ModBlocks.PLATINUM);
        add("blockSteel", ModBlocks.STEEL);
        add("blockElectrum", ModBlocks.ELECTRUM);
        add("blockBronze", ModBlocks.BRONZE);
        
        if (ConfigHandler.dusts) {
            add("dustCopper", ModItems.COPPER_DUST);
            add("dustTin", ModItems.TIN_DUST);
            add("dustSilver", ModItems.SILVER_DUST);
            add("dustLead", ModItems.LEAD_DUST);
            add(ModItems.ALUMINUM_DUST, "dustAluminum", "dustAluminium");
            add(ModItems.NICKEL_DUST, "dustNickel", "dustFerrous");
            add("dustPlatinum", ModItems.PLATINUM_DUST);
            add("dustSteel", ModItems.STEEL_DUST);
            add("dustElectrum", ModItems.ELECTRUM_DUST);
            add("dustBronze", ModItems.BRONZE_DUST);
            add("dustCoal", ModItems.COAL_DUST);
            add("dustDiamond", ModItems.DIAMOND_DUST);
            add("dustEmerald", ModItems.EMERALD_DUST);
            add("dustLapis", ModItems.LAPIS_DUST);
            add("dustIron", ModItems.IRON_DUST);
            add("dustGold", ModItems.GOLD_DUST);
        }
        if (ConfigHandler.plates) {
            add("plateCopper", ModItems.COPPER_PLATE);
            add("plateTin", ModItems.TIN_PLATE);
            add("plateSilver", ModItems.SILVER_PLATE);
            add("plateLead", ModItems.LEAD_PLATE);
            add(ModItems.ALUMINUM_PLATE, "plateAluminum", "plateAluminium");
            add(ModItems.NICKEL_PLATE, "plateNickel", "plateFerrous");
            add("platePlatinum", ModItems.PLATINUM_PLATE);
            add("plateSteel", ModItems.STEEL_PLATE);
            add("plateElectrum", ModItems.ELECTRUM_PLATE);
            add("plateBronze", ModItems.BRONZE_PLATE);
            add("plateCoal", ModItems.COAL_PLATE);
            add("plateDiamond", ModItems.DIAMOND_PLATE);
            add("plateEmerald", ModItems.EMERALD_PLATE);
            add("plateLapis", ModItems.LAPIS_PLATE);
            add("plateIron", ModItems.IRON_PLATE);
            add("plateGold", ModItems.GOLD_PLATE);
            add("plateRedstone", ModItems.REDSTONE_PLATE);
        }
        if (ConfigHandler.wires) {
            add("wireCopper", ModItems.COPPER_WIRE);
            add("wireTin", ModItems.TIN_WIRE);
            add("wireSilver", ModItems.SILVER_WIRE);
            add("wireLead", ModItems.LEAD_WIRE);
            add(ModItems.ALUMINUM_WIRE, "wireAluminum", "wireAluminium");
            add(ModItems.NICKEL_WIRE, "wireNickel", "wireFerrous");
            add("wirePlatinum", ModItems.PLATINUM_WIRE);
            add("wireSteel", ModItems.STEEL_WIRE);
            add("wireElectrum", ModItems.ELECTRUM_WIRE);
            add("wireBronze", ModItems.BRONZE_WIRE);
            add("wireCoal", ModItems.COAL_WIRE);
            add("wireDiamond", ModItems.DIAMOND_WIRE);
            add("wireEmerald", ModItems.EMERALD_WIRE);
            add("wireLapis", ModItems.LAPIS_WIRE);
            add("wireIron", ModItems.IRON_WIRE);
            add("wireGold", ModItems.GOLD_WIRE);
            add("wireRedstone", ModItems.REDSTONE_WIRE);
        }
    }

    private static void add(Block block, String... oreDict) {
        for (String string : oreDict) {
            OreDictionary.registerOre(string, block);
        }
    }
    private static void add(Item item, String... oreDict) {
        for (String string : oreDict) {
            OreDictionary.registerOre(string, item);
        }
    }
    private static void add(ItemStack stack, String... oreDict) {
        for (String string : oreDict) {
            OreDictionary.registerOre(string, stack);
        }
    }
    private static void add(String oreDict, Block... blocks) {
        for (Block block : blocks) {
            OreDictionary.registerOre(oreDict, block);
        }
    }
    private static void add(String oreDict, Item... blocks) {
        for (Item item : blocks) {
            OreDictionary.registerOre(oreDict, item);
        }
    }
    private static void add(String oreDict, ItemStack... stacks) {
        for (ItemStack stack : stacks) {
            OreDictionary.registerOre(oreDict, stack);
        }
    }
}
