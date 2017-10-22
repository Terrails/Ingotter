package terrails.ingotter.config;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

import javax.annotation.Nullable;
import java.util.Set;

public class ConfigFactoryGUI implements IModGuiFactory {

    @Override
    public boolean hasConfigGui() {
        return true;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen parentScreen) {
        return new GUIConfig(parentScreen);
    }

    @Override
    public void initialize(Minecraft minecraftInstance) {

    }

    @Override
    @SuppressWarnings("deprecation")
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return null;
    }

    @Nullable
    @Override
    @SuppressWarnings("deprecation")
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }

    @Override
    public Set<IModGuiFactory.RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }
}
