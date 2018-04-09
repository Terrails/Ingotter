package terrails.ingotter.items;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.oredict.OreDictionary;
import terrails.ingotter.Constants;
import terrails.ingotter.Ingotter;

import javax.annotation.Nullable;
import java.util.Set;

public class PaxelBase extends ItemTool {

    private static Set<Block> EFFECTIVE_ON = null;
    
    public PaxelBase(ToolMaterial materialIn, String name) {
        super(2.5F, -2.0F, materialIn, Sets.newHashSet());
        setCreativeTab(Ingotter.TOOLS_TAB);
        setRegistryName(new ResourceLocation(Ingotter.MOD_ID, name));
        setUnlocalizedName(Ingotter.MOD_ID + "." + name);
        if (EFFECTIVE_ON == null) {
            EFFECTIVE_ON = getEffectiveOn();
        }
    }

    @Override
    public float getDestroySpeed(@Nullable ItemStack stack, IBlockState state) {
        for (Block block : EFFECTIVE_ON) {
            if (block == state.getBlock())
                return this.efficiency;
        }

        Material material = state.getMaterial();
        boolean axe = material != Material.WOOD && material != Material.PLANTS && material != Material.VINE;
        boolean pickaxe = material != Material.IRON && material != Material.ANVIL && material != Material.ROCK;

        return axe && pickaxe ? super.getDestroySpeed(stack, state) : this.efficiency;
    }

    @SuppressWarnings("unchecked")
    private static Set<Block> getEffectiveOn() {
        try {
            Set<Block> set = Sets.newHashSet();
            String[] fieldNames = new String[]{"EFFECTIVE_ON", "field_150915_c", "field_150916_c", "field_150917_c"};
            set.addAll((Set<Block>) ReflectionHelper.findField(ItemSpade.class, fieldNames).get(Sets.newHashSet()));
            set.addAll((Set<Block>) ReflectionHelper.findField(ItemPickaxe.class, fieldNames).get(Sets.newHashSet()));
            set.addAll((Set<Block>) ReflectionHelper.findField(ItemAxe.class, fieldNames).get(Sets.newHashSet()));
            return set;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)) {
            return EnumActionResult.FAIL;
        } else {
            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (facing != EnumFacing.DOWN && worldIn.getBlockState(pos.up()).getMaterial() == Material.AIR && block == Blocks.GRASS) {
                IBlockState iblockstate1 = Blocks.GRASS_PATH.getDefaultState();
                worldIn.playSound(player, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);

                if (!worldIn.isRemote) {
                    worldIn.setBlockState(pos, iblockstate1, 11);
                    itemstack.damageItem(1, player);
                }

                return EnumActionResult.SUCCESS;
            } else {
                return EnumActionResult.PASS;
            }
        }
    }

    @Override
    public boolean canHarvestBlock(IBlockState state) {
        Block block = state.getBlock();

        if (block == Blocks.SNOW_LAYER)
            return true;
        else if (block == Blocks.SNOW)
            return true;

        if (block == Blocks.OBSIDIAN) {
            return this.toolMaterial.getHarvestLevel() == 3;
        } else if (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE) {
            if (block != Blocks.EMERALD_ORE && block != Blocks.EMERALD_BLOCK) {
                if (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE) {
                    if (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE) {
                        if (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE) {
                            if (block != Blocks.REDSTONE_ORE && block != Blocks.LIT_REDSTONE_ORE) {
                                Material material = state.getMaterial();
                                return material == Material.ROCK || material == Material.IRON || material == Material.ANVIL;
                            } else return this.toolMaterial.getHarvestLevel() >= 2;
                        } else return this.toolMaterial.getHarvestLevel() >= 1;
                    } else return this.toolMaterial.getHarvestLevel() >= 1;
                } else return this.toolMaterial.getHarvestLevel() >= 2;
            } else return this.toolMaterial.getHarvestLevel() >= 2;
        } else return this.toolMaterial.getHarvestLevel() >= 2;
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
