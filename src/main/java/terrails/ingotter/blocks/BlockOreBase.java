package terrails.ingotter.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import terrails.ingotter.Constants;
import terrails.terracore.block.BlockBase;

public class BlockOreBase extends BlockBase {

    public BlockOreBase(Material material, String name, int harvestLevel) {
        super(material, Constants.MOD_ID);
        setRegistryName(new ResourceLocation(Constants.MOD_ID, name));
        setUnlocalizedName(name);
        setHarvestLevel("pickaxe", harvestLevel);
        setHardness(3f);
        setResistance(5f);
        setCreativeTab(Constants.RESOURCES_TAB);
    }

    public BlockOreBase(String name, int harvestLevel) {
        this(Material.ROCK, name, harvestLevel);
    }

    public BlockOreBase(String name, int harvestLevel, float lightLevel) {
        this(name, harvestLevel);
        setLightLevel(lightLevel);
    }
}
