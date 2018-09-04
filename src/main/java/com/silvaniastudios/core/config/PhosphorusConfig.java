package com.silvaniastudios.core.config;

import com.silvaniastudios.core.COre;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = COre.MODID, name = "cOre/Phosphorus Ore")
@Config.LangKey("core.config.title_phosphorus")
public class PhosphorusConfig {
	
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
		@Config.Comment(_ConfigValues.worldGenEnabled)
		public boolean worldGenEnabled = true;
		@Config.Comment(_ConfigValues.minVeinSize)
		public int minVeinSize = 3;
		@Config.Comment(_ConfigValues.maxVeinSize)
		public int maxVeinSize = 5;
		@Config.Comment(_ConfigValues.minWorldHeight)
		public int minWorldHeight = 24;
		@Config.Comment(_ConfigValues.maxWorldHeight)
		public int maxWorldHeight = 32;
		@Config.Comment(_ConfigValues.veinsPerChunk)
		public int veinsPerChunk = 3;
		@Config.Comment(_ConfigValues.veinSpawnChance)
		public int veinSpawnChance = 100;
		@Config.Comment(_ConfigValues.allowedDimensions)
		public int[] allowedDimensions = new int[]{0};
		@Config.Comment(_ConfigValues.restrictBiomes)
		public boolean restrictBiomes = false;
		@Config.Comment(_ConfigValues.allowedBiomes)
		public String[] allowedBiomes = new String[]{"ocean","desert","forest"};
	}
	
	public static class Drops {
		@Config.Comment(_ConfigValues.primaryDroppedItem)
		public String primaryDroppedItem = "core:ore_phosphorus";
		@Config.Comment(_ConfigValues.secondaryDroppedItem)
		public String secondaryDroppedItem = "core:dust_tiny_phosphorus";
		@Config.Comment(_ConfigValues.primaryDropQtyMin)
		public int primaryDropQtyMin = 1;
		@Config.Comment(_ConfigValues.primaryDropQtyMax)
		public int primaryDropQtyMax = 1;
		@Config.Comment(_ConfigValues.secondaryDropQtyMin)
		public int secondaryDropQtyMin = 1;
		@Config.Comment(_ConfigValues.secondaryDropQtyMax)
		public int secondaryDropQtyMax = 4;
		@Config.Comment(_ConfigValues.primaryDropChance)
		public int primaryDropChance = 88;
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
		@Config.Comment(_ConfigValues.oreOreDict)
		public String oreOreDict = "orePhosphorus";
		@Config.Comment(_ConfigValues.dustOreDict)
		public String dustOreDict = "dustPhosphorus";
		@Config.Comment(_ConfigValues.dustImpureOreDict)
		public String dustImpureOreDict = "dustImpurePhosphorus";
		@Config.Comment(_ConfigValues.dustTinyOreDict)
		public String dustTinyOreDict = "dustTinyPhosphorus";
		@Config.Comment(_ConfigValues.blockOreDict)
		public String blockOreDict = "blockPhosphorus";
	}
	
	public static class Properties {
		@Config.Comment(_ConfigValues.harvestLevel)
		public int harvestLevel = 1;
		@Config.Comment(_ConfigValues.experienceMin)
		public int experienceMin = 2;
		@Config.Comment(_ConfigValues.experienceMax)
		public int experienceMax = 5;
		@Config.Comment(_ConfigValues.hardnessOre)
		public int hardnessOre = 3;
		@Config.Comment(_ConfigValues.hardnessBlock)
		public int hardnessBlock = 5;
		@Config.Comment(_ConfigValues.weight)
		public int weight = 3830;
		@Config.Comment(_ConfigValues.durability)
		public int durability = 1;
		@Config.Comment(_ConfigValues.meltingPoint)
		public int meltingPoint = 44;
		@Config.Comment(_ConfigValues.symbol)
		public String symbol = "P";
		@Config.Comment(_ConfigValues.notes)
		public String[] notes = new String[]{""};
		@Config.Comment(_ConfigValues.colour_r)
		public int colour_r = 227;
		@Config.Comment(_ConfigValues.colour_g)
		public int colour_g = 67;
		@Config.Comment(_ConfigValues.colour_b)
		public int colour_b = 105;
	}
	
	public static class Tools {
		@Config.Comment(_ConfigValues.pickaxe)
		public boolean pickaxe = true;
		@Config.Comment(_ConfigValues.shovel)
		public boolean shovel = true;
		@Config.Comment(_ConfigValues.axe)
		public boolean axe = true;
		@Config.Comment(_ConfigValues.hoe)
		public boolean hoe = true;
		@Config.Comment(_ConfigValues.sword)
		public boolean sword = true;
		@Config.Comment(_ConfigValues.armour_helmet)
		public boolean armour_helmet = true;
		@Config.Comment(_ConfigValues.armour_chest)
		public boolean armour_chest = true;
		@Config.Comment(_ConfigValues.armour_legs)
		public boolean armour_legs = true;
		@Config.Comment(_ConfigValues.armour_boots)
		public boolean armour_boots = true;
		@Config.Comment(_ConfigValues.tinkers_parts)
		public boolean tinkers_parts = true;
	}
	
	public static class Recipes {
		@Config.Comment(_ConfigValues.oreCrushingEnabled)
		public boolean oreCrushingEnabled = true;
		@Config.Comment(_ConfigValues.oreCrusherEnergyUsage)
		public int oreCrusherEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.oreCrusherPrimaryOutput)
		public String oreCrusherPrimaryOutput = "core:dust_impure_phosphorus";
		@Config.Comment(_ConfigValues.oreCrusherPrimaryOutputAmount)
		public int oreCrusherPrimaryOutputAmount = 2;
		
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutput)
		public String oreCrusherSecondaryOutput = "core:dust_tiny_phosphorus";
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputAmount)
		public int oreCrusherSecondaryOutputAmount = 1;
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputChance)
		public int oreCrusherSecondaryOutputChance = 15;
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
