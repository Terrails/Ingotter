package terrails.ingotter.items;

import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import terrails.ingotter.Constants;
import terrails.terracore.item.ArmorBase;

import javax.annotation.Nullable;

public class ArmorRepairBase extends ArmorBase {

    public ArmorRepairBase(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, slot, Constants.MOD_ID);
        setRegistryName(new ResourceLocation(Constants.MOD_ID, name));
        setUnlocalizedName(name);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, @Nullable ItemStack repair) {
        if (repair != null && !repair.isEmpty()) {
            int[] oreId = OreDictionary.getOreIDs(repair);

            for (int i : oreId) {
                if (getArmorMaterial() == Constants.Materials.COPPER_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotCopper"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.TIN_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotTin"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.SILVER_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotSilver"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.LEAD_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotLead"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.ALUMINUM_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotAluminum"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.NICKEL_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotNickel"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.PLATINUM_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotPlatinum"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.STEEL_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotSteel"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.ELECTRUM_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotElectrum"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.BRONZE_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotBronze"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.EMERALD_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotEmerald"))
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.LAPIS_ARMOR) {
                    if (repair.getItem().equals(new ItemStack(Items.DYE, 1, 4).getItem()) && repair.getMetadata() == new ItemStack(Items.DYE, 1, 4).getMetadata())
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.REDSTONE_ARMOR) {
                    if (repair.getItem() == Items.REDSTONE)
                        return true;
                } else if (getArmorMaterial() == Constants.Materials.INVAR_ARMOR) {
                    if (OreDictionary.getOreName(i).contains("ingotInvar"))
                        return true;
                }
            }
        }
        return super.getIsRepairable(toRepair, repair);
    }
}
