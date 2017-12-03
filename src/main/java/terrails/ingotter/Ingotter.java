package terrails.ingotter;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import terrails.ingotter.config.ConfigHandler;
import terrails.ingotter.init.*;
import terrails.ingotter.proxies.IProxy;
import terrails.ingotter.world.OreGenerator;

@Mod(dependencies =
        "required-after:terracore@[" + Constants.TERRACORE_VERSION + ",);" +
        "required-after:ore_controller@[" + Constants.ORE_CONTROLLER_VERSION + ",);",
        modid = Constants.MOD_ID,
        name = Constants.MOD_NAME,
        version = Constants.VERSION,
        acceptedMinecraftVersions = Constants.MC_VERSION,
        guiFactory = Constants.GUI_FACTORY
        )
public class Ingotter {
    @SidedProxy(clientSide = Constants.CLIENT_PROXY, serverSide = Constants.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        ConfigHandler.init(event.getModConfigurationDirectory());
        ModBlocks.init();
        ModItems.init();

        MinecraftForge.ORE_GEN_BUS.register(new OreGenerator());
        GameRegistry.registerWorldGenerator(new OreGenerator(), 0);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
