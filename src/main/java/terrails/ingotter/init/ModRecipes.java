package terrails.ingotter.init;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import terrails.ingotter.config.ConfigHandler;

public class ModRecipes {

    public static void init() {
        smeltingRecipes();
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
}
