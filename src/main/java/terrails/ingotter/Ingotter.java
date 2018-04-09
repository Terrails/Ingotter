package terrails.ingotter;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import terrails.ingotter.config.ConfigHandler;
import terrails.ingotter.init.*;
import terrails.ingotter.init.tabs.ModResourcesCreativeTab;
import terrails.ingotter.init.tabs.ModToolsCreativeTab;
import terrails.ingotter.world.OreGenerator;
import terrails.terracore.base.MainModClass;
import terrails.terracore.base.proxies.ProxyBase;
import terrails.terracore.base.registry.RegistryList;

import java.util.Collections;

@Mod(dependencies =
        "required-after:terracore@[0.0.0,);",
        modid = Ingotter.MOD_ID,
        name = Ingotter.MOD_NAME,
        version = Ingotter.VERSION,
        guiFactory = Ingotter.GUI_FACTORY)
public class Ingotter extends MainModClass<Ingotter> {

    public static final String MOD_ID = "ingotter";
    public static final String MOD_NAME = "Ingotter";
    public static final String VERSION = "@VERSION@";
    public static final String GUI_FACTORY = "terrails.ingotter.config.ConfigFactoryGUI";

    public static final ModResourcesCreativeTab RESOURCES_TAB = new ModResourcesCreativeTab();
    public static final ModToolsCreativeTab TOOLS_TAB = new ModToolsCreativeTab();

    public static ProxyBase proxy;

    public Ingotter() {
        super(MOD_ID, MOD_NAME, VERSION);
        Ingotter.proxy = getProxy();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void registerForgeEntries(RegistryList list) {
        switch (list.getType()) {
            case BLOCK:
                Collections.addAll(list, ModBlocks.get());
                break;
            case ITEM:
                Collections.addAll(list, ModItems.get());
                break;
        }
    }

    @Mod.EventHandler
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ConfigHandler.init(event.getModConfigurationDirectory());
        ModBlocks.init();
        ModItems.init();

        MinecraftForge.ORE_GEN_BUS.register(new OreGenerator());
        GameRegistry.registerWorldGenerator(new OreGenerator(), 0);
    }

    @Mod.EventHandler
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        ModRecipes.init();
    }

    @Mod.EventHandler
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @Override
    public Ingotter getInstance() {
        return this;
    }
}
