package terrails.ingotter.config;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import terrails.ingotter.Constants;
import terrails.ingotter.Ingotter;

import java.util.ArrayList;
import java.util.List;

public class GUIConfig  extends GuiConfig {

    public GUIConfig(GuiScreen parentScreen) {
        super(parentScreen, GUIConfig.getConfigElements(), Ingotter.MOD_ID, false, false, "/" + Ingotter.MOD_ID + ".cfg");
    }

    private static List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<>();
        List<IConfigElement> GENERAL_SETTINGS = new ConfigElement(ConfigHandler.config.getCategory(ConfigHandler.FEATURES)).getChildElements();
        List<IConfigElement> GENERATION_SETTINGS = new ConfigElement(ConfigHandler.config.getCategory(ConfigHandler.GENERATION)).getChildElements();

        list.add(new DummyConfigElement.DummyCategoryElement("General Settings", "", GENERAL_SETTINGS));
        list.add(new DummyConfigElement.DummyCategoryElement("Generation Settings", "", GENERATION_SETTINGS));
        return list;
    }
}
