package com.silvaniastudios.core.config;

import com.silvaniastudios.core.COre;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = COre.MODID, name = "cOre/Emerald Ore")
@Config.LangKey("core.config.title_emerald")
public class VanillaEmeraldConfig {
	
	@Config.Name("World Generation")
	public static WorldGen worldgen = new WorldGen();
	
	@Config.Name("Drops")
	public static Drops drops = new Drops();
	
	@Config.Name("Ore Dictionary")
	public static OreDictionary oredict = new OreDictionary();
	
	@Config.Name("Properties")
	public static Properties properties = new Properties();
	
	@Config.Name("Recipes")
	public static Recipes recipes = new Recipes();
	
	public static class WorldGen {
		@Config.Comment(_ConfigValues.worldGenEnabledVanilla)
		public boolean worldGenEnabled = true;
		@Config.Comment(_ConfigValues.minVeinSize)
		public int minVeinSize = 0;
		@Config.Comment(_ConfigValues.maxVeinSize)
		public int maxVeinSize = 1;
		@Config.Comment(_ConfigValues.minWorldHeight)
		public int minWorldHeight = 4;
		@Config.Comment(_ConfigValues.maxWorldHeight)
		public int maxWorldHeight = 32;
		@Config.Comment(_ConfigValues.veinsPerChunk)
		public int veinsPerChunk = 8;
		@Config.Comment(_ConfigValues.veinSpawnChance)
		public int veinSpawnChance = 50;
		@Config.Comment(_ConfigValues.allowedDimensions)
		public int[] allowedDimensions = new int[]{0};
		@Config.Comment(_ConfigValues.restrictBiomes)
		public boolean restrictBiomes = true;
		@Config.Comment(_ConfigValues.allowedBiomes)
		public String[] allowedBiomes = new String[]{"extreme_hills","mutated_extreme_hills","extreme_hills_with_trees","mutated_extreme_hills_with_trees"};
	}

	public static class Drops {
		@Config.Comment(_ConfigValues.overrideVanillaDrop)
		public boolean overrideVanillaDrop = true;
		@Config.Comment(_ConfigValues.primaryDroppedItem)
		public String primaryDroppedItem = "minecraft:emerald";
		@Config.Comment(_ConfigValues.secondaryDroppedItem)
		public String secondaryDroppedItem = "core:nugget_emerald";
		@Config.Comment(_ConfigValues.primaryDropQtyMin)
		public int primaryDropQtyMin = 1;
		@Config.Comment(_ConfigValues.primaryDropQtyMax)
		public int primaryDropQtyMax = 1;
		@Config.Comment(_ConfigValues.secondaryDropQtyMin)
		public int secondaryDropQtyMin = 1;
		@Config.Comment(_ConfigValues.secondaryDropQtyMax)
		public int secondaryDropQtyMax = 4;
		@Config.Comment(_ConfigValues.primaryDropChance)
		public int primaryDropChance = 100;
		@Config.Comment(_ConfigValues.secondaryDropChance)
		public int secondaryDropChance = 10;
		@Config.Comment(_ConfigValues.dropPrimaryForFakePlayer)
		public boolean dropPrimaryForFakePlayer = true;
		@Config.Comment(_ConfigValues.dropSecondaryForFakePlayer)
		public boolean dropSecondaryForFakePlayer = false;
		@Config.Comment(_ConfigValues.canSilkTouch)
		public boolean canSilkTouch = false;
		@Config.Comment(_ConfigValues.canFortune)
		public boolean canFortune = false;
	}
	
	public static class OreDictionary {
		@Config.Comment(_ConfigValues.dustOreDict)
		public String dustOreDict = "dustEmerald";
		@Config.Comment(_ConfigValues.dustTinyOreDict)
		public String dustTinyOreDict = "dustTinyEmerald";
		@Config.Comment(_ConfigValues.nuggetOreDict)
		public String nuggetOreDict = "nuggetEmerald";
	}
	
	public static class Properties {
		@Config.Comment(_ConfigValues.weight)
		public int weight = 7874;
		@Config.Comment(_ConfigValues.durability)
		public int durability = 1;
		@Config.Comment(_ConfigValues.meltingPoint)
		public int meltingPoint = 1535;
		@Config.Comment(_ConfigValues.symbol)
		public String symbol = "Fe";
		@Config.Comment(_ConfigValues.notes)
		public String[] notes = new String[]{""};
		@Config.Comment(_ConfigValues.colour_r)
		public int colour_r = 0;
		@Config.Comment(_ConfigValues.colour_g)
		public int colour_g = 176;
		@Config.Comment(_ConfigValues.colour_b)
		public int colour_b = 56;
	}
	
	public static class Recipes {
		@Config.Comment(_ConfigValues.oreCrushingEnabled)
		public boolean oreCrushingEnabled = true;
		@Config.Comment(_ConfigValues.oreCrusherEnergyUsage)
		public int oreCrusherEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.oreCrusherPrimaryOutput)
		public String oreCrusherPrimaryOutput = "core:dust_impure_emerald";
		@Config.Comment(_ConfigValues.oreCrusherPrimaryOutputAmount)
		public int oreCrusherPrimaryOutputAmount = 2;
		
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutput)
		public String oreCrusherSecondaryOutput = "core:dust_tiny_emerald";
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputAmount)
		public int oreCrusherSecondaryOutputAmount = 1;
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputChance)
		public int oreCrusherSecondaryOutputChance = 15;
		
		@Config.Comment(_ConfigValues.gemCrushingEnabled)
		public boolean gemCrushingEnabled = true;
		@Config.Comment(_ConfigValues.gemCrusherEnergyUsage)
		public int gemCrusherEnergyUsage = 2000;
		@Config.Comment(_ConfigValues.gemCrusherOutput)
		public String gemCrusherOutput = "core:dust_emerald";
		@Config.Comment(_ConfigValues.gemCrusherOutputAmount)
		public int gemCrusherOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.nuggetCrushingEnabled)
		public boolean nuggetCrushingEnabled = true;
		@Config.Comment(_ConfigValues.nuggetCrusherEnergyUsage)
		public int nuggetCrusherEnergyUsage = 250;
		@Config.Comment(_ConfigValues.nuggetCrusherOutput)
		public String nuggetCrusherOutput = "core:dust_tiny_emerald";
		@Config.Comment(_ConfigValues.nuggetCrusherOutputAmount)
		public int nuggetCrusherOutputAmount = 1;
	
		@Config.Comment(_ConfigValues.dustCompressingEnabled)
		public boolean dustCompressingEnabled = true;
		@Config.Comment(_ConfigValues.dustCompressingEnergyUsage)
		public int dustCompressingEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.dustCompressingOutput)
		public String dustCompressingOutput = "core:gem_emerald";
		@Config.Comment(_ConfigValues.dustCompressingOutputAmount)
		public int dustCompressingOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.dustTinyCompressingEnabled)
		public boolean dustTinyCompressingEnabled = true;
		@Config.Comment(_ConfigValues.dustTinyCompressingEnergyUsage)
		public int dustTinyCompressingEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.dustTinyCompressingOutput)
		public String dustTinyCompressingOutput = "core:nugget_emerald";
		@Config.Comment(_ConfigValues.dustTinyCompressingOutputAmount)
		public int dustTinyCompressingOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.compressShardToGem)
		public boolean compressShardToGem = true;
		@Config.Comment(_ConfigValues.compressShardToGemPowerUsage)
		public int compressShardToGemPowerUsage = 3000;
	}
	
	@Mod.EventBusSubscriber
	private static class EventHandler {
		
		@SubscribeEvent
		public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(COre.MODID)) {
				ConfigManager.sync(COre.MODID, Config.Type.INSTANCE);
			}
		}
	}

}
