package terrails.ingotter.items;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.oredict.OreDictionary;
import terrails.ingotter.Constants;

import javax.annotation.Nullable;

public class PaxelBase extends ItemTool {

    public PaxelBase(ToolMaterial materialIn, String name) {
        super(2.5F, -2.0F, materialIn, Sets.newHashSet());
        efficiency = 2.5F + materialIn.getEfficiency();
        setCreativeTab(Constants.TOOLS_TAB);
        setRegistryName(name);
        setUnlocalizedName(name);
    }

    @Override
    public float getDestroySpeed(@Nullable ItemStack stack, IBlockState state) {
        return state.getBlock() == Blocks.OBSIDIAN ? 0.8F : super.getDestroySpeed(stack, state);
    }

    @Override
    public boolean canHarvestBlock(IBlockState state) {
        Block block = state.getBlock();

        if (block == Blocks.OBSIDIAN) {
            return toolMaterial.getHarvestLevel() == 3;
        } else if (block == Blocks.DIAMOND_BLOCK || block == Blocks.DIAMOND_ORE) {
            return toolMaterial.getHarvestLevel() >= 2;
        } else if (block == Blocks.GOLD_BLOCK || block == Blocks.GOLD_ORE) {
            return toolMaterial.getHarvestLevel() >= 2;
        } else if (block == Blocks.IRON_BLOCK || block == Blocks.IRON_ORE) {
            return toolMaterial.getHarvestLevel() >= 1;
        } else if (block == Blocks.LAPIS_BLOCK || block == Blocks.LAPIS_ORE) {
            return toolMaterial.getHarvestLevel() >= 1;
        } else if (block == Blocks.REDSTONE_ORE || block == Blocks.LIT_REDSTONE_ORE) {
            return toolMaterial.getHarvestLevel() >= 2;
        } else if (block == Blocks.ANVIL) {
            return toolMaterial.getHarvestLevel() >= 0;
        } else if (block == Blocks.SNOW || block == Blocks.SNOW_LAYER) {
            return true;
        } else if (state.getMaterial() == Material.ROCK) {
            return true;
        } else return state.getMaterial() == Material.IRON;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, @Nullable ItemStack repair) {
        if (repair != null && !repair.isEmpty()) {
            int[] oreId = OreDictionary.getOreIDs(repair);

            for (int i : oreId) {
                if (toolMaterial == Constants.Materials.COPPER_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotCopper"))
                        return true;
                } else if (toolMaterial == Constants.Materials.TIN_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotTin"))
                        return true;
                } else if (toolMaterial == Constants.Materials.SILVER_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotSilver"))
                        return true;
                } else if (toolMaterial == Constants.Materials.LEAD_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotLead"))
                        return true;
                } else if (toolMaterial == Constants.Materials.ALUMINUM_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotAluminum"))
                        return true;
                } else if (toolMaterial == Constants.Materials.NICKEL_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotNickel"))
                        return true;
                } else if (toolMaterial == Constants.Materials.PLATINUM_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotPlatinum"))
                        return true;
                } else if (toolMaterial == Constants.Materials.STEEL_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotSteel"))
                        return true;
                } else if (toolMaterial == Constants.Materials.ELECTRUM_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotElectrum"))
                        return true;
                } else if (toolMaterial == Constants.Materials.BRONZE_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotBronze"))
                        return true;
                } else if (toolMaterial == Constants.Materials.EMERALD_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotEmerald"))
                        return true;
                } else if (toolMaterial == Constants.Materials.LAPIS_TOOL) {
                    if (repair.getItem().equals(new ItemStack(Items.DYE, 1, 4).getItem()) && repair.getMetadata() == new ItemStack(Items.DYE, 1, 4).getMetadata())
                        return true;
                } else if (toolMaterial == Constants.Materials.REDSTONE_TOOL) {
                    if (repair.getItem() == Items.REDSTONE)
                        return true;
                } else if (toolMaterial == Constants.Materials.INVAR_TOOL) {
                    if (OreDictionary.getOreName(i).contains("ingotInvar"))
                        return true;
                }
            }
        }
        return super.getIsRepairable(toRepair, repair);
    }
}
