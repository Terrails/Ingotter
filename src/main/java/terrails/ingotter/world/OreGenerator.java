package terrails.ingotter.world;

import com.google.common.base.CharMatcher;
import com.google.common.primitives.Ints;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.commons.lang3.StringUtils;
import terrails.ingotter.Constants;
import terrails.ingotter.config.ConfigHandler;
import terrails.terracore.world.generator.WorldGenCustomMinable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber
public class OreGenerator implements IWorldGenerator {

    @SubscribeEvent
    public static void disableVanillaOreGen(OreGenEvent.GenerateMinable event) {
        if (ConfigHandler.generate && ConfigHandler.ores) {
            for (String ore : ConfigHandler.generationArray) {
                String oreName = ore.toLowerCase();
                String nameOfOre = StringUtils.substringBefore(oreName, " -");

                switch (event.getType()) {
                    case COAL:
                        if (nameOfOre.contains("minecraft:coal_ore")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case DIAMOND:
                        if (nameOfOre.contains("minecraft:diamond_ore")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case GOLD:
                        if (nameOfOre.contains("minecraft:gold_ore")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case IRON:
                        if (nameOfOre.contains("minecraft:iron_ore")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case LAPIS:
                        if (nameOfOre.contains("minecraft:lapis_ore")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case REDSTONE:
                        if (nameOfOre.contains("minecraft:redstone_ore")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case QUARTZ:
                        if (nameOfOre.contains("minecraft:quartz_ore")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case EMERALD:
                        if (nameOfOre.contains("minecraft:emerald_ore")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case DIRT:
                        if (nameOfOre.contains("minecraft:dirt")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case GRAVEL:
                        if (nameOfOre.contains("minecraft:gravel")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case DIORITE:
                        if (nameOfOre.contains("minecraft:diorite")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case GRANITE:
                        if (nameOfOre.contains("minecraft:granite")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                    case ANDESITE:
                        if (nameOfOre.contains("minecraft:andesite")) {
                            event.setResult(Event.Result.DENY);
                        }
                        break;
                }
            }
        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        generateOre(ConfigHandler.generate && ConfigHandler.ores, ConfigHandler.generationArray, random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
    }

    public void generateOre(boolean condition, String[] oreArray, Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (condition) {
            for (String theArray : oreArray) {
                String blockArray = theArray.toLowerCase();

                boolean containsMinY = blockArray.contains("-miny:");
                boolean containsMaxY = blockArray.contains("-maxy:");
                boolean containsMinVein = blockArray.contains("-minvein:");
                boolean containsMaxVein = blockArray.contains("-maxvein:");
                boolean containsPerChunk = blockArray.contains("-perchunk:");
                boolean containsRequired = containsMinY && containsMaxY && containsMinVein && containsMaxVein && containsPerChunk;

                int minY = (int) getInteger(blockArray, "-miny:");
                int maxY = (int) getInteger(blockArray, "-maxy:");
                int minVein = (int) getInteger(blockArray, "-minvein:");
                int maxVein = (int) getInteger(blockArray, "-maxvein:");
                double perChunk = getInteger(blockArray, "-perchunk:");
                int[] dimensionID = getDimensions(blockArray);
                String[] biomes = getBiomes(blockArray);
                IBlockState blockOre = getOre(blockArray);
                Block blockReplace = getBlock(blockArray);

                if (blockOre != null && containsRequired) {
                    generator(blockOre, blockReplace, world, random, chunkX, chunkZ, minY, maxY, minVein, maxVein, perChunk, biomes, dimensionID);
                } else {
                    if (blockOre == null)
                        Constants.LOGGER.info("Block '" + getOre(blockArray) + "' is invalid");
                    if (!containsRequired)
                        Constants.LOGGER.info("config Value doesn't contain required variables: " + theArray);
                }
            }
        }
    }
    protected void generator(IBlockState ore, Block replace, World world, Random random, int chunkX, int chunkZ, int minY, int maxY, int minVeinSize, int maxVeinSize, double chancesToSpawn, String[] biomeID, int[] dimensionID) {
        int heightRange = maxY - minY;
        if (chancesToSpawn % 1 == 0) {
            for (int i = 0; i < chancesToSpawn; i++) {
                BlockPos pos = new BlockPos((chunkX * 16) + random.nextInt(16), minY + random.nextInt(heightRange), (chunkZ * 16) + random.nextInt(16));
                generate(ore, replace, world, random, pos, minVeinSize, maxVeinSize, biomeID, dimensionID);
            }
        } else if (round((0.01 + (1 - 0.01) * random.nextDouble()), 2) <= chancesToSpawn) {
            BlockPos pos = new BlockPos((chunkX * 16) + random.nextInt(16), minY + random.nextInt(heightRange), (chunkZ * 16) + random.nextInt(16));
            generate(ore, replace, world, random, pos, minVeinSize, maxVeinSize, biomeID, dimensionID);
        }
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    protected void generate(IBlockState ore, Block replace, World world, Random random, BlockPos pos, int minVeinSize, int maxVeinSize, String[] biomeID, int[] dimensionID) {
        WorldGenCustomMinable generator = null;

        if (isNull(replace) && isNull(biomeID) && isNull(dimensionID)) {
            generator = generateDefault(world, ore, minVeinSize, maxVeinSize);
        }

        else if (isNotNull(replace) && isNull(biomeID) && isNull(dimensionID)) {
            generator = new WorldGenCustomMinable(ore, minVeinSize, maxVeinSize, replace);
        }
        else if (isNull(replace) && isNotNull(biomeID) && isNull(dimensionID)) {
            if (isBiome(world, pos, biomeID)) {
                generator = generateDefault(world, ore, minVeinSize, maxVeinSize);
            }
        }
        else if (isNull(replace) && isNull(biomeID) && isNotNull(dimensionID)) {
            if (isDimension(world, dimensionID))
                generator = generateDefault(world, ore, minVeinSize, maxVeinSize);
        }

        else if (isNotNull(replace) && isNotNull(biomeID) && isNull(dimensionID)) {
            if (isBiome(world, pos, biomeID))
                generator = new WorldGenCustomMinable(ore, minVeinSize, maxVeinSize, replace);
        }
        else if (isNotNull(replace) && isNull(biomeID) && isNotNull(dimensionID)) {
            if (isDimension(world, dimensionID))
                generator = new WorldGenCustomMinable(ore, minVeinSize, maxVeinSize, replace);
        }

        else if (isNull(replace) && isNotNull(biomeID) && isNotNull(dimensionID)) {
            if (isBiome(world, pos, biomeID) && isDimension(world, dimensionID))
                generator = generateDefault(world, ore, minVeinSize, maxVeinSize);
        }

        else if (isNotNull(replace) && isNotNull(biomeID) && isNotNull(dimensionID)) {
            if (isBiome(world, pos, biomeID) && isDimension(world, dimensionID))
                generator = new WorldGenCustomMinable(ore, minVeinSize, maxVeinSize, replace);
        }

        if (generator != null)
            generator.generate(world, random, pos);
    }
    private WorldGenCustomMinable generateDefault(World world, IBlockState ore, int minVeinSize, int maxVeinSize) {
        switch (world.provider.getDimension()) {
            case -1: return new WorldGenCustomMinable(ore, minVeinSize, maxVeinSize, Blocks.NETHERRACK);
            case 1: return new WorldGenCustomMinable(ore, minVeinSize, maxVeinSize, Blocks.END_STONE);
            default: return new WorldGenCustomMinable(ore, minVeinSize, maxVeinSize, Blocks.STONE);
        }
    }

    private boolean isDimension(World world, int[] dimID) {
        boolean condition = false;
        for (int id : dimID) {
            if (world.provider.getDimension() == id)
                condition = true;
        }
        return condition;
    }
    private boolean isBiome(World world, BlockPos pos, String[] biomeNames) {
        boolean condition = false;
        Biome biomeAtPos = world.getBiome(pos);
        for (String string : biomeNames) {
            if (string.matches("^[0-9]+$")) {
                int biomeID = Integer.parseInt(CharMatcher.digit().retainFrom(string));
                if (Biome.getBiome(biomeID) == biomeAtPos)
                    condition = true;
            } else {
                if (string.equals(biomeAtPos.getRegistryName().toString()))
                    condition = true;
            }
        }
        return condition;
    }
    private boolean isNull(Object object) {
        if (object instanceof Integer)
            return ((Integer) object == Integer.MIN_VALUE);
        else return (object == null);
    }
    private boolean isNotNull(Object object) {
        if (object instanceof Integer)
            return ((Integer) object != Integer.MIN_VALUE);
        else return (object != null);
    }
    private boolean isNull(int[] object) {
        boolean condition = false;
        for (int id : object)
            condition = (id == Integer.MIN_VALUE);
        return condition;
    }
    private boolean isNotNull(int[] object) {
        boolean condition = false;
        for (int id : object)
            condition = (id != Integer.MIN_VALUE);
        return condition;
    }

    private static final boolean ENABLE_DEBUGGING = false;
    private static void debugMessage(String string) {
        if (ENABLE_DEBUGGING) {
            Constants.LOGGER.info(string);
        }
    }

    public static IBlockState getOre(String string) {
        if (!string.isEmpty()) {
            String blockString = StringUtils.substringBefore(string, " -").contains("|") ? StringUtils.substringBefore(string, "|") : StringUtils.substringBefore(string, " -");
            debugMessage("Ore String is: " + blockString);

            String meta1 = StringUtils.substringBefore(string , " -");
            String meta2 = meta1.contains("|") ? StringUtils.substringAfter(meta1, "|").replace("|", "") : "0";
            int metadata = Integer.parseInt(meta2);
            debugMessage("Ore Metadata is: " + metadata);

            Block theBlock = Block.getBlockFromName(blockString);

            IBlockState blockState = theBlock != null ? theBlock.getStateFromMeta(metadata) : null;
            debugMessage("The Block is: " + blockState);
            return blockState;
        }
        return null;
    }
    public static Block getBlock(String string) {
        if (string.contains("-replace:")) {
            String replace1 = StringUtils.substringAfter(string, "-replace:").replace("-replace:", "");
            debugMessage("Block Replace1 is: " + replace1);
            String replace2 = replace1.contains(" -") ? replace1.replaceAll("([\\s]).*", "$1").replace(" ", "") : replace1;
            debugMessage("Block String is: " + replace2);

            Block theBlock = Block.getBlockFromName(replace2);
            debugMessage("Block is: " + theBlock);
            return theBlock;
        }
        return null;
    }

    public static String[] getBiomes(String string) {
        if (string.contains("-biome:")) {
            String biome1 = StringUtils.substringAfter(string, "-biome:").replace("-biome:", "");
            debugMessage("Biome1 String is: " + biome1);
            String biome2 = biome1.contains(" -") ? StringUtils.substringBefore(biome1, " -") : biome1;
            debugMessage("Biome2 String is: " + biome2);

            if (!biome2.contains("|")) {
                if (!biome2.matches(".*\\d+.*")) {
                    return new String[] {biome2.trim()};
                } else {
                    return new String[] {CharMatcher.digit().retainFrom(biome2)};
                }
            } else {
                List<String> biomeName = new ArrayList<>();
                String[] biome3 = biome2.split("\\|");
                boolean ran = false;
                for (String biome : biome3) {
                    biomeName.add(biome.trim());
                    ran = true;
                }
                if (!ran) return null;
                return biomeName.toArray(new String[biomeName.size()]);
            }
        }
        return null;
    }

    public static int[] getDimensions(String string) {
        if (string.contains("-dimension:")) {
            String dim1 = StringUtils.substringAfter(string, "-dimension:").replace("-dimension:", "");
            debugMessage("Dim1 String is: " + dim1);
            String dim2 = dim1.contains(" -") ? StringUtils.substringBefore(dim1, " -") : dim1;
            debugMessage("Dim2 String is: " + dim2);
            if (!dim2.contains("|")) {
                return new int[] {Integer.parseInt(dim2)};
            } else {
                List<Integer> dimID = new ArrayList<>();
                String[] dim3 = dim2.split("\\|");
                boolean ran = false;
                for (String dim : dim3) {
                    dimID.add(Integer.parseInt(dim));
                    ran = true;
                }
                if (!ran) dimID.add(Integer.MIN_VALUE);
                return Ints.toArray(dimID);
            }
        }
        return new int[]{Integer.MIN_VALUE};
    }

    public static double getInteger(String string, String index) {
        if (string.contains(index)) {
            String metaDataString = string.replaceAll("^.*(" + index + "\\d+\\.?\\d*).*$", "$1").replace(index, "");
            if (metaDataString.matches(".*\\d.*")) {
                return Double.parseDouble(metaDataString);
            } else return 0;
        }
        else return 0;
    }
}