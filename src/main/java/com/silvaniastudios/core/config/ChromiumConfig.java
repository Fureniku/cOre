package com.silvaniastudios.core.config;

import com.silvaniastudios.core.COre;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = COre.MODID, name = "cOre/Chromium Ore")
@Config.LangKey("core.config.title_chromium")
public class ChromiumConfig {
	
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
		public int minVeinSize = 2;
		@Config.Comment(_ConfigValues.maxVeinSize)
		public int maxVeinSize = 5;
		@Config.Comment(_ConfigValues.minWorldHeight)
		public int minWorldHeight = 1;
		@Config.Comment(_ConfigValues.maxWorldHeight)
		public int maxWorldHeight = 16;
		@Config.Comment(_ConfigValues.veinsPerChunk)
		public int veinsPerChunk = 2;
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
		public String primaryDroppedItem = "core:ore_chromium";
		@Config.Comment(_ConfigValues.secondaryDroppedItem)
		public String secondaryDroppedItem = "core:nugget_chromium";
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
		@Config.Comment(_ConfigValues.ingotOreDict)
		public String ingotOreDict = "ingotChromium";
		@Config.Comment(_ConfigValues.oreOreDict)
		public String oreOreDict = "oreChromium";
		@Config.Comment(_ConfigValues.dustOreDict)
		public String dustOreDict = "dustChromium";
		@Config.Comment(_ConfigValues.dustImpureOreDict)
		public String dustImpureOreDict = "dustImpureChromium";
		@Config.Comment(_ConfigValues.dustTinyOreDict)
		public String dustTinyOreDict = "dustTinyChromium";
		@Config.Comment(_ConfigValues.nuggetOreDict)
		public String nuggetOreDict = "nuggetChromium";
		@Config.Comment(_ConfigValues.blockOreDict)
		public String blockOreDict = "blockChromium";
	}
	
	public static class Properties {
		@Config.Comment(_ConfigValues.harvestLevel)
		public int harvestLevel = 2;
		@Config.Comment(_ConfigValues.experienceMin)
		public int experienceMin = 2;
		@Config.Comment(_ConfigValues.experienceMax)
		public int experienceMax = 5;
		@Config.Comment(_ConfigValues.hardnessOre)
		public int hardnessOre = 3;
		@Config.Comment(_ConfigValues.hardnessBlock)
		public int hardnessBlock = 5;
		@Config.Comment(_ConfigValues.weight)
		public int weight = 7140;
		@Config.Comment(_ConfigValues.durability)
		public int durability = 1;
		@Config.Comment(_ConfigValues.meltingPoint)
		public int meltingPoint = 1900;
		@Config.Comment(_ConfigValues.symbol)
		public String symbol = "Cr";
		@Config.Comment(_ConfigValues.notes)
		public String[] notes = new String[]{""};
		@Config.Comment(_ConfigValues.colour_r)
		public int colour_r = 222;
		@Config.Comment(_ConfigValues.colour_g)
		public int colour_g = 222;
		@Config.Comment(_ConfigValues.colour_b)
		public int colour_b = 222;
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
		public String oreCrusherPrimaryOutput = "core:dust_impure_chromium";
		@Config.Comment(_ConfigValues.oreCrusherPrimaryOutputAmount)
		public int oreCrusherPrimaryOutputAmount = 2;
		
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutput)
		public String oreCrusherSecondaryOutput = "core:dust_tiny_chromium";
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputAmount)
		public int oreCrusherSecondaryOutputAmount = 1;
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputChance)
		public int oreCrusherSecondaryOutputChance = 15;
		
		@Config.Comment(_ConfigValues.ingotCrushingEnabled)
		public boolean ingotCrushingEnabled = true;
		@Config.Comment(_ConfigValues.ingotCrusherEnergyUsage)
		public int ingotCrusherEnergyUsage = 2000;
		@Config.Comment(_ConfigValues.ingotCrusherOutput)
		public String ingotCrusherOutput = "core:dust_chromium";
		@Config.Comment(_ConfigValues.ingotCrusherOutputAmount)
		public int ingotCrusherOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.nuggetCrushingEnabled)
		public boolean nuggetCrushingEnabled = true;
		@Config.Comment(_ConfigValues.nuggetCrusherEnergyUsage)
		public int nuggetCrusherEnergyUsage = 250;
		@Config.Comment(_ConfigValues.nuggetCrusherOutput)
		public String nuggetCrusherOutput = "core:dust_tiny_chromium";
		@Config.Comment(_ConfigValues.nuggetCrusherOutputAmount)
		public int nuggetCrusherOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.oreSmeltingEnabled)
		public boolean oreSmeltingEnabled = true;
		@Config.Comment(_ConfigValues.oreSmeltingEnergyUsage)
		public int oreSmeltingEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.oreSmeltingOutput)
		public String oreSmeltingOutput = "core:ingot_chromium";
		@Config.Comment(_ConfigValues.oreSmeltingOutputAmount)
		public int oreSmeltingOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.dustSmeltingEnabled)
		public boolean dustSmeltingEnabled = true;
		@Config.Comment(_ConfigValues.dustSmeltingEnergyUsage)
		public int dustSmeltingEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.dustSmeltingOutput)
		public String dustSmeltingOutput = "core:ingot_chromium";
		@Config.Comment(_ConfigValues.dustSmeltingOutputAmount)
		public int dustSmeltingOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.dustImpureSmeltingEnabled)
		public boolean dustImpureSmeltingEnabled = true;
		@Config.Comment(_ConfigValues.dustImpureSmeltingEnergyUsage)
		public int dustImpureSmeltingEnergyUsage = 5000;
		@Config.Comment(_ConfigValues.dustImpureSmeltingOutput)
		public String dustImpureSmeltingOutput = "core:ingot_chromium";
		@Config.Comment(_ConfigValues.dustImpureSmeltingOutputAmount)
		public int dustImpureSmeltingOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.dustTinySmeltingEnabled)
		public boolean dustTinySmeltingEnabled = true;
		@Config.Comment(_ConfigValues.dustTinySmeltingEnergyUsage)
		public int dustTinySmeltingEnergyUsage = 500;
		@Config.Comment(_ConfigValues.dustTinySmeltingOutput)
		public String dustTinySmeltingOutput = "core:nugget_chromium";
		@Config.Comment(_ConfigValues.dustTinySmeltingOutputAmount)
		public int dustTinySmeltingOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.compressNuggetToIngot)
		public boolean compressNuggetToIngot = true;
		@Config.Comment(_ConfigValues.compressNuggetToIngotPowerUsage)
		public int compressNuggetToIngotPowerUsage = 3000;
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
