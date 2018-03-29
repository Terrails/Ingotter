package terrails.ingotter.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import terrails.ingotter.Constants;
import terrails.ingotter.config.ConfigHandler;

import java.util.Arrays;
import java.util.List;

public class ModOreDictionary {

    public static void initBlocks() {
        if (ConfigHandler.ores) {
            add("oreCopper", ModBlocks.blocks.get("copper_ore"), ModBlocks.blocks.get("copper_ore_nether"), ModBlocks.blocks.get("copper_ore_end"));
            add("oreTin", ModBlocks.blocks.get("tin_ore"), ModBlocks.blocks.get("tin_ore_nether"), ModBlocks.blocks.get("tin_ore_end"));
            add("oreSilver", ModBlocks.blocks.get("silver_ore"), ModBlocks.blocks.get("silver_ore_nether"), ModBlocks.blocks.get("silver_ore_end"));
            add("oreLead", ModBlocks.blocks.get("lead_ore"), ModBlocks.blocks.get("lead_ore_nether"), ModBlocks.blocks.get("lead_ore_end"));
            add("oreAluminum", ModBlocks.blocks.get("aluminum_ore"), ModBlocks.blocks.get("aluminum_ore_nether"), ModBlocks.blocks.get("aluminum_ore_end"));
            add("oreAluminium", ModBlocks.blocks.get("aluminum_ore"), ModBlocks.blocks.get("aluminum_ore_nether"), ModBlocks.blocks.get("aluminum_ore_end"));
            add("oreNickel", ModBlocks.blocks.get("nickel_ore"), ModBlocks.blocks.get("nickel_ore_nether"), ModBlocks.blocks.get("nickel_ore_end"));
            add("oreFerrous", ModBlocks.blocks.get("nickel_ore"), ModBlocks.blocks.get("nickel_ore_nether"), ModBlocks.blocks.get("nickel_ore_end"));
            add("orePlatinum", ModBlocks.blocks.get("platinum_ore"), ModBlocks.blocks.get("platinum_ore_nether"), ModBlocks.blocks.get("platinum_ore_end"));
            add("oreIron", ModBlocks.blocks.get("iron_ore_nether"), ModBlocks.blocks.get("iron_ore_end"));
            add("oreGold", ModBlocks.blocks.get("gold_ore_nether"), ModBlocks.blocks.get("gold_ore_end"));
            add("oreDiamond", ModBlocks.blocks.get("diamond_ore_nether"), ModBlocks.blocks.get("diamond_ore_end"));
            add("oreLapis", ModBlocks.blocks.get("lapis_ore_nether"), ModBlocks.blocks.get("lapis_ore_end"));
            add("oreRedstone", ModBlocks.blocks.get("redstone_ore_nether"), ModBlocks.blocks.get("redstone_ore_end"));
            add("oreEmerald", ModBlocks.blocks.get("emerald_ore_nether"), ModBlocks.blocks.get("emerald_ore_end"));
            add("oreCoal", ModBlocks.blocks.get("coal_ore_nether"), ModBlocks.blocks.get("coal_ore_end"));
        }

        if (ConfigHandler.blocks) {
            add("blockCopper", ModBlocks.blocks.get("copper_block"));
            add("blockTin", ModBlocks.blocks.get("tin_block"));
            add("blockSilver", ModBlocks.blocks.get("silver_block"));
            add("blockLead", ModBlocks.blocks.get("lead_block"));
            add(ModBlocks.blocks.get("aluminum_block"), "blockAluminum", "blockAluminium");
            add(ModBlocks.blocks.get("nickel_block"), "blockNickel", "blockFerrous");
            add("blockPlatinum", ModBlocks.blocks.get("platinum_block"));
            add("blockSteel", ModBlocks.blocks.get("steel_block"));
            add("blockElectrum", ModBlocks.blocks.get("electrum_block"));
            add("blockBronze", ModBlocks.blocks.get("bronze_block"));
            add("blockInvar", ModBlocks.blocks.get("invar_block"));
        }
    }
    public static void initItems() {

        if (ConfigHandler.ingotNuggets) {
            add("nuggetCopper", ModItems.items.get("copper_nugget"));
            add("nuggetTin", ModItems.items.get("tin_nugget"));
            add("nuggetSilver", ModItems.items.get("silver_nugget"));
            add("nuggetLead", ModItems.items.get("lead_nugget"));
            add(ModItems.items.get("aluminum_nugget"), "nuggetAluminum", "nuggetAluminium");
            add(ModItems.items.get("nickel_nugget"), "nuggetNickel", "nuggetFerrous");
            add("nuggetPlatinum", ModItems.items.get("platinum_nugget"));
            add("nuggetSteel", ModItems.items.get("steel_nugget"));
            add("nuggetElectrum", ModItems.items.get("electrum_nugget"));
            add("nuggetBronze", ModItems.items.get("bronze_nugget"));
            add("nuggetIron", ModItems.items.get("iron_nugget"));
            add("nuggetInvar", ModItems.items.get("invar_nugget"));
        }

        if (ConfigHandler.gemNuggets) {
            add("nuggetCoal", ModItems.items.get("coal_nugget"));
            add("nuggetDiamond", ModItems.items.get("diamond_nugget"));
            add("nuggetEmerald", ModItems.items.get("emerald_nugget"));
            add("nuggetLapis", ModItems.items.get("lapis_nugget"));
            add("nuggetRedstone", ModItems.items.get("redstone_nugget"));
        }

        if (ConfigHandler.ingots) {
            add("ingotCopper", ModItems.items.get("copper_ingot"));
            add("ingotTin", ModItems.items.get("tin_ingot"));
            add("ingotSilver", ModItems.items.get("silver_ingot"));
            add("ingotLead", ModItems.items.get("lead_ingot"));
            add(ModItems.items.get("aluminum_ingot"), "ingotAluminum", "ingotAluminium");
            add(ModItems.items.get("nickel_ingot"), "ingotNickel", "ingotFerrous");
            add("ingotPlatinum", ModItems.items.get("platinum_ingot"));
            add("ingotSteel", ModItems.items.get("steel_ingot"));
            add("ingotElectrum", ModItems.items.get("electrum_ingot"));
            add("ingotBronze", ModItems.items.get("bronze_ingot"));
            add("ingotInvar", ModItems.items.get("invar_ingot"));
        }

        if (ConfigHandler.dusts) {
            add("dustCopper", ModItems.items.get("copper_dust"));
            add("dustTin", ModItems.items.get("tin_dust"));
            add("dustSilver", ModItems.items.get("silver_dust"));
            add("dustLead", ModItems.items.get("lead_dust"));
            add(ModItems.items.get("aluminum_dust"), "dustAluminum", "dustAluminium");
            add(ModItems.items.get("nickel_dust"), "dustNickel", "dustFerrous");
            add("dustPlatinum", ModItems.items.get("platinum_dust"));
            add("dustSteel", ModItems.items.get("steel_dust"));
            add("dustElectrum", ModItems.items.get("electrum_dust"));
            add("dustBronze", ModItems.items.get("bronze_dust"));
            add("dustCoal", ModItems.items.get("coal_dust"));
            add("dustDiamond", ModItems.items.get("diamond_dust"));
            add("dustEmerald", ModItems.items.get("emerald_dust"));
            add("dustLapis", ModItems.items.get("lapis_dust"));
            add("dustIron", ModItems.items.get("iron_dust"));
            add("dustGold", ModItems.items.get("gold_dust"));
            add("dustInvar", ModItems.items.get("invar_dust"));
        }
        if (ConfigHandler.plates) {
            add("plateCopper", ModItems.items.get("copper_plate"));
            add("plateTin", ModItems.items.get("tin_plate"));
            add("plateSilver", ModItems.items.get("silver_plate"));
            add("plateLead", ModItems.items.get("lead_plate"));
            add(ModItems.items.get("aluminum_plate"), "plateAluminum", "plateAluminium");
            add(ModItems.items.get("nickel_plate"), "plateNickel", "plateFerrous");
            add("platePlatinum", ModItems.items.get("platinum_plate"));
            add("plateSteel", ModItems.items.get("steel_plate"));
            add("plateElectrum", ModItems.items.get("electrum_plate"));
            add("plateBronze", ModItems.items.get("bronze_plate"));
            add("plateCoal", ModItems.items.get("coal_plate"));
            add("plateDiamond", ModItems.items.get("diamond_plate"));
            add("plateEmerald", ModItems.items.get("emerald_plate"));
            add("plateLapis", ModItems.items.get("lapis_plate"));
            add("plateIron", ModItems.items.get("iron_plate"));
            add("plateGold", ModItems.items.get("gold_plate"));
            add("plateInvar", ModItems.items.get("invar_plate"));
            add("plateRedstone", ModItems.items.get("redstone_plate"));
        }
        if (ConfigHandler.wires) {
            add("wireCopper", ModItems.items.get("copper_wire"));
            add("wireTin", ModItems.items.get("tin_wire"));
            add("wireSilver", ModItems.items.get("silver_wire"));
            add("wireLead", ModItems.items.get("lead_wire"));
            add(ModItems.items.get("aluminum_wire"), "wireAluminum", "wireAluminium");
            add(ModItems.items.get("nickel_wire"), "wireNickel", "wireFerrous");
            add("wirePlatinum", ModItems.items.get("platinum_wire"));
            add("wireSteel", ModItems.items.get("steel_wire"));
            add("wireElectrum", ModItems.items.get("electrum_wire"));
            add("wireBronze", ModItems.items.get("bronze_wire"));
            add("wireCoal", ModItems.items.get("coal_wire"));
            add("wireDiamond", ModItems.items.get("diamond_wire"));
            add("wireEmerald", ModItems.items.get("emerald_wire"));
            add("wireLapis", ModItems.items.get("lapis_wire"));
            add("wireIron", ModItems.items.get("iron_wire"));
            add("wireGold", ModItems.items.get("gold_wire"));
            add("wireInvar", ModItems.items.get("invar_wire"));
            add("wireRedstone", ModItems.items.get("redstone_wire"));
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
