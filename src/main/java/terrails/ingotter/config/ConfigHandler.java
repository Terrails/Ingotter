package terrails.ingotter.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import terrails.ingotter.Constants;

import java.io.File;

@Mod.EventBusSubscriber
public class ConfigHandler {

    public static Configuration config;
    public static final String FEATURES = "Features";
    public static final String GENERATION = "Generation";

    public static boolean wireHammer;
    public static boolean tools;
    public static boolean ores;
    public static boolean plates;
    public static boolean dusts;
    public static boolean wires;
    public static boolean armor;
    public static boolean ingotNuggets;
    public static boolean gemNuggets;
    public static boolean ingots;
    public static boolean blocks;

    public static String[] generationArray;
    public static boolean generate;

    public static void init(File directory) {
        config = new Configuration(new File(directory, Constants.MOD_ID + ".cfg"));
        syncConfig();
    }

    @SubscribeEvent
    public static void configChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(Constants.MOD_ID)) {
            syncConfig();
        }
    }

    public static void syncConfig() {
        wireHammer = config.get(FEATURES, "Wire Cutters & Hammer", true).getBoolean();
        tools = config.get(FEATURES, "Tools", true).getBoolean();
        ores = config.get(FEATURES, "Ores", true).getBoolean();
        plates = config.get(FEATURES, "Plates", true).getBoolean();
        dusts = config.get(FEATURES, "Dusts", true).getBoolean();
        wires = config.get(FEATURES, "Wires", true).getBoolean();
        armor = config.get(FEATURES, "Armors", true).getBoolean();
        ingotNuggets = config.get(FEATURES, "Ingot Nuggets", true).getBoolean();
        gemNuggets = config.get(FEATURES, "Gem Nuggets", true).getBoolean();
        ingots = config.get(FEATURES, "Ingots", true).getBoolean();
        blocks = config.get(FEATURES, "Blocks", true).getBoolean();

        generate = config.get(GENERATION, "Generate", true).getBoolean();
        generationArray = config.getStringList("Ore Generation", GENERATION, INGOTTER_DEFAULT(), "");

        if (config.hasChanged()) {
            config.save();
        }
    }

    private static String[] INGOTTER_DEFAULT() {
        return new String[] {
                "ingotter:copper_ore -minVein:6 -maxVein:12 -minY:40 -maxY:90 -perChunk:14 -dimension:0",
                "ingotter:tin_ore -minVein:5 -maxVein:11 -minY:25 -maxY:60 -perChunk:12 -dimension:0",
                "ingotter:silver_ore -minVein:3 -maxVein:7 -minY:5 -maxY:25 -perChunk:9 -dimension:0",
                "ingotter:lead_ore -minVein:4 -maxVein:8 -minY:15 -maxY:30 -perChunk:8 -dimension:0",
                "ingotter:aluminum_ore -minVein:2 -maxVein:8 -minY:25 -maxY:80 -perChunk:8 -dimension:0",
                "ingotter:nickel_ore -minVein:3 -maxVein:6 -minY:20 -maxY:40 -perChunk:9 -dimension:0",
                "ingotter:platinum_ore -minVein:1 -maxVein:1 -minY:2 -maxY:24 -perChunk:1 -dimension:0",
                "ingotter:copper_ore_nether -minVein:5 -maxVein:8 -minY:20 -maxY:120 -perChunk:14 -dimension:-1",
                "ingotter:tin_ore_nether -minVein:5 -maxVein:9 -minY:25 -maxY:100 -perChunk:12 -dimension:-1",
                "ingotter:silver_ore_nether -minVein:3 -maxVein:9 -minY:10 -maxY:100 -perChunk:9 -dimension:-1",
                "ingotter:lead_ore_nether -minVein:4 -maxVein:8 -minY:15 -maxY:30 -perChunk:8 -dimension:-1",
                "ingotter:aluminum_ore_nether -minVein:4 -maxVein:9 -minY:15 -maxY:105 -perChunk:8 -dimension:-1",
                "ingotter:nickel_ore_nether -minVein:4 -maxVein:8 -minY:15 -maxY:90 -perChunk:9 -dimension:-1",
                "ingotter:platinum_ore_nether -minVein:1 -maxVein:3 -minY:15 -maxY:80 -perChunk:4 -dimension:-1",
                "ingotter:iron_ore_nether -minVein:6 -maxVein:10 -minY:15 -maxY:100 -perChunk:12 -dimension:-1",
                "ingotter:gold_ore_nether -minVein:6 -maxVein:10 -minY:15 -maxY:70 -perChunk:7 -dimension:-1",
                "ingotter:diamond_ore_nether -minVein:4 -maxVein:8 -minY:15 -maxY:85 -perChunk:6 -dimension:-1",
                "ingotter:lapis_ore_nether -minVein:6 -maxVein:11 -minY:15 -maxY:95 -perChunk:5 -dimension:-1",
                "ingotter:redstone_ore_nether -minVein:4 -maxVein:8 -minY:15 -maxY:90 -perChunk:5 -dimension:-1",
                "ingotter:emerald_ore_nether -minVein:2 -maxVein:5 -minY:15 -maxY:105 -perChunk:5 -dimension:-1",
                "ingotter:coal_ore_nether -minVein:8 -maxVein:16 -minY:15 -maxY:130 -perChunk:6 -dimension:-1",
                "ingotter:copper_ore_end -minVein:4 -maxVein:8 -minY:50 -maxY:125 -perChunk:14 -dimension:1",
                "ingotter:tin_ore_end -minVein:2 -maxVein:8 -minY:25 -maxY:130 -perChunk:12 -dimension:1",
                "ingotter:silver_ore_end -minVein:3 -maxVein:9 -minY:20 -maxY:115 -perChunk:9 -dimension:1",
                "ingotter:lead_ore_end -minVein:4 -maxVein:8 -minY:20 -maxY:110 -perChunk:8 -dimension:1",
                "ingotter:aluminum_ore_end -minVein:4 -maxVein:9 -minY:15 -maxY:120 -perChunk:8 -dimension:1",
                "ingotter:nickel_ore_end -minVein:4 -maxVein:8 -minY:15 -maxY:130 -perChunk:9 -dimension:1",
                "ingotter:platinum_ore_end -minVein:1 -maxVein:3 -minY:15 -maxY:125 -perChunk:4 -dimension:1",
                "ingotter:iron_ore_end -minVein:6 -maxVein:10 -minY:15 -maxY:100 -perChunk:12 -dimension:1",
                "ingotter:gold_ore_end -minVein:6 -maxVein:10 -minY:15 -maxY:115 -perChunk:7 -dimension:1",
                "ingotter:diamond_ore_end -minVein:4 -maxVein:8 -minY:15 -maxY:140 -perChunk:6 -dimension:1",
                "ingotter:lapis_ore_end -minVein:6 -maxVein:11 -minY:15 -maxY:125 -perChunk:5 -dimension:1",
                "ingotter:redstone_ore_end -minVein:4 -maxVein:8 -minY:15 -maxY:120 -perChunk:5 -dimension:1",
                "ingotter:emerald_ore_end -minVein:2 -maxVein:5 -minY:15 -maxY:135 -perChunk:5 -dimension:1",
                "ingotter:coal_ore_end -minVein:8 -maxVein:16 -minY:15 -maxY:130 -perChunk:6 -dimension:1"};
    }
}