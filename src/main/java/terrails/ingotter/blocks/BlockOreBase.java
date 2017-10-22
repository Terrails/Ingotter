package terrails.ingotter.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import terrails.terracore.block.BlockBase;

public class BlockOreBase extends BlockBase {

    public BlockOreBase(Material material, String name, int harvestLevel) {
        super(material, name);
        setHarvestLevel("pickaxe", harvestLevel);
        setHardness(3f);
        setResistance(5f);
    }

    public BlockOreBase(String name, int harvestLevel) {
        this(Material.ROCK, name, harvestLevel);
    }

    public BlockOreBase(String name, int harvestLevel, float lightLevel) {
        this(name, harvestLevel);
        setLightLevel(lightLevel);
    }
}
