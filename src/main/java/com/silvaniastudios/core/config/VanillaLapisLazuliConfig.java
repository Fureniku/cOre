package com.silvaniastudios.core.config;

import com.silvaniastudios.core.COre;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = COre.MODID, name = "cOre/LapisLazuli Ore")
@Config.LangKey("core.config.title_lapis_lazuli")
public class VanillaLapisLazuliConfig {
	
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
		public int minVeinSize = 3;
		@Config.Comment(_ConfigValues.maxVeinSize)
		public int maxVeinSize = 4;
		@Config.Comment(_ConfigValues.minWorldHeight)
		public int minWorldHeight = 1;
		@Config.Comment(_ConfigValues.maxWorldHeight)
		public int maxWorldHeight = 31;
		@Config.Comment(_ConfigValues.veinsPerChunk)
		public int veinsPerChunk = 1;
		@Config.Comment(_ConfigValues.veinSpawnChance)
		public int veinSpawnChance = 98;
		@Config.Comment(_ConfigValues.allowedDimensions)
		public int[] allowedDimensions = new int[]{0};
		@Config.Comment(_ConfigValues.restrictBiomes)
		public boolean restrictBiomes = false;
		@Config.Comment(_ConfigValues.allowedBiomes)
		public String[] allowedBiomes = new String[]{"ocean","desert","forest"};
	}

	public static class Drops {
		@Config.Comment(_ConfigValues.overrideVanillaDrop)
		public boolean overrideVanillaDrop = true;
		@Config.Comment(_ConfigValues.primaryDroppedItem)
		public String primaryDroppedItem = "minecraft:dye:4";
		@Config.Comment(_ConfigValues.secondaryDroppedItem)
		public String secondaryDroppedItem = "core:nugget_lapis_lazuli";
		@Config.Comment(_ConfigValues.primaryDropQtyMin)
		public int primaryDropQtyMin = 4;
		@Config.Comment(_ConfigValues.primaryDropQtyMax)
		public int primaryDropQtyMax = 8;
		@Config.Comment(_ConfigValues.secondaryDropQtyMin)
		public int secondaryDropQtyMin = 1;
		@Config.Comment(_ConfigValues.secondaryDropQtyMax)
		public int secondaryDropQtyMax = 4;
		@Config.Comment(_ConfigValues.primaryDropChance)
		public int primaryDropChance = 100;
		@Config.Comment(_ConfigValues.secondaryDropChance)
		public int secondaryDropChance = 20;
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
		public String dustOreDict = "dustLapisLazuli";
		@Config.Comment(_ConfigValues.dustTinyOreDict)
		public String dustTinyOreDict = "dustTinyLapisLazuli";
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
		public int colour_r = 90;
		@Config.Comment(_ConfigValues.colour_g)
		public int colour_g = 130;
		@Config.Comment(_ConfigValues.colour_b)
		public int colour_b = 226;
	}
	
	public static class Recipes {
		@Config.Comment(_ConfigValues.oreCrushingEnabled)
		public boolean oreCrushingEnabled = true;
		@Config.Comment(_ConfigValues.oreCrusherEnergyUsage)
		public int oreCrusherEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.oreCrusherPrimaryOutput)
		public String oreCrusherPrimaryOutput = "core:dust_impure_lapislazuli";
		@Config.Comment(_ConfigValues.oreCrusherPrimaryOutputAmount)
		public int oreCrusherPrimaryOutputAmount = 2;
		
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutput)
		public String oreCrusherSecondaryOutput = "core:dust_tiny_lapislazuli";
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputAmount)
		public int oreCrusherSecondaryOutputAmount = 1;
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputChance)
		public int oreCrusherSecondaryOutputChance = 15;

		@Config.Comment(_ConfigValues.dustCompressingEnabled)
		public boolean dustCompressingEnabled = true;
		@Config.Comment(_ConfigValues.dustCompressingEnergyUsage)
		public int dustCompressingEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.dustCompressingOutput)
		public String dustCompressingOutput = "minecraft:dye:4";
		@Config.Comment(_ConfigValues.dustCompressingOutputAmount)
		public int dustCompressingOutputAmount = 1;
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
