package terrails.ingotter.recipes;

import com.google.gson.JsonObject;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import terrails.ingotter.Constants;
import terrails.ingotter.config.ConfigHandler;

import java.util.function.BooleanSupplier;

public class ConditionFactory implements IConditionFactory {

    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        boolean value = JsonUtils.getBoolean(json , "value", true);
        String key = JsonUtils.getString(json, "type");

        switch (key) {
            case Constants.MOD_ID + ":crafting_tools":
                return () -> ConfigHandler.wireHammer == value;
            case Constants.MOD_ID + ":tools":
                return () -> ConfigHandler.tools == value;
            case Constants.MOD_ID + ":ores":
                return () -> ConfigHandler.ores == value;
            case Constants.MOD_ID + ":plates":
                return () -> ConfigHandler.plates == value;
            case Constants.MOD_ID + ":dusts":
                return () -> ConfigHandler.dusts == value;
            case Constants.MOD_ID + ":wires":
                return () -> ConfigHandler.wires == value;
            case Constants.MOD_ID + ":armor":
                return () -> ConfigHandler.armor == value;
            case Constants.MOD_ID + ":ingots":
                return () -> ConfigHandler.ingots == value;
            case Constants.MOD_ID + ":ingot_nuggets":
                return () -> ConfigHandler.ingotNuggets == value;
            case Constants.MOD_ID + ":gem_nuggets":
                return () -> ConfigHandler.gemNuggets == value;
        }
        return null;
    }
}
