package com.silvaniastudios.core.config;

import com.silvaniastudios.core.COre;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = COre.MODID, name = "cOre/Redstone Ore")
@Config.LangKey("core.config.title_redstone")
public class VanillaRedstoneConfig {
	
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
		public int minVeinSize = 4;
		@Config.Comment(_ConfigValues.maxVeinSize)
		public int maxVeinSize = 8;
		@Config.Comment(_ConfigValues.minWorldHeight)
		public int minWorldHeight = 1;
		@Config.Comment(_ConfigValues.maxWorldHeight)
		public int maxWorldHeight = 16;
		@Config.Comment(_ConfigValues.veinsPerChunk)
		public int veinsPerChunk = 5;
		@Config.Comment(_ConfigValues.veinSpawnChance)
		public int veinSpawnChance = 83;
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
		public String primaryDroppedItem = "minecraft:redstone";
		@Config.Comment(_ConfigValues.secondaryDroppedItem)
		public String secondaryDroppedItem = "core:dust_tiny_redstone";
		@Config.Comment(_ConfigValues.primaryDropQtyMin)
		public int primaryDropQtyMin = 4;
		@Config.Comment(_ConfigValues.primaryDropQtyMax)
		public int primaryDropQtyMax = 5;
		@Config.Comment(_ConfigValues.secondaryDropQtyMin)
		public int secondaryDropQtyMin = 1;
		@Config.Comment(_ConfigValues.secondaryDropQtyMax)
		public int secondaryDropQtyMax = 3;
		@Config.Comment(_ConfigValues.primaryDropChance)
		public int primaryDropChance = 100;
		@Config.Comment(_ConfigValues.secondaryDropChance)
		public int secondaryDropChance = 15;
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
		public String ingotOreDict = "ingotRedstone";
		@Config.Comment(_ConfigValues.dustTinyOreDict)
		public String dustTinyOreDict = "dustTinyRedstone";
	}
	
	public static class Properties {
		@Config.Comment(_ConfigValues.weight)
		public int weight = 7874;
		@Config.Comment(_ConfigValues.durability)
		public int durability = 1;
		@Config.Comment(_ConfigValues.meltingPoint)
		public int meltingPoint = 1535;
		@Config.Comment(_ConfigValues.symbol)
		public String symbol = "Rd";
		@Config.Comment(_ConfigValues.notes)
		public String[] notes = new String[]{""};
		@Config.Comment(_ConfigValues.colour_r)
		public int colour_r = 255;
		@Config.Comment(_ConfigValues.colour_g)
		public int colour_g = 0;
		@Config.Comment(_ConfigValues.colour_b)
		public int colour_b = 0;
	}
	
	public static class Recipes {
		@Config.Comment(_ConfigValues.oreCrushingEnabled)
		public boolean oreCrushingEnabled = true;
		@Config.Comment(_ConfigValues.oreCrusherEnergyUsage)
		public int oreCrusherEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.oreCrusherPrimaryOutput)
		public String oreCrusherPrimaryOutput = "core:dust_impure_redstone";
		@Config.Comment(_ConfigValues.oreCrusherPrimaryOutputAmount)
		public int oreCrusherPrimaryOutputAmount = 10;
		
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutput)
		public String oreCrusherSecondaryOutput = "core:dust_tiny_redstone";
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputAmount)
		public int oreCrusherSecondaryOutputAmount = 1;
		@Config.Comment(_ConfigValues.oreCrusherSecondaryOutputChance)
		public int oreCrusherSecondaryOutputChance = 15;
		
		@Config.Comment(_ConfigValues.ingotCrushingEnabled)
		public boolean ingotCrushingEnabled = true;
		@Config.Comment(_ConfigValues.ingotCrusherEnergyUsage)
		public int ingotCrusherEnergyUsage = 2000;
		@Config.Comment(_ConfigValues.ingotCrusherOutput)
		public String ingotCrusherOutput = "core:dust_redstone";
		@Config.Comment(_ConfigValues.ingotCrusherOutputAmount)
		public int ingotCrusherOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.oreSmeltingEnabled)
		public boolean oreSmeltingEnabled = true;
		@Config.Comment(_ConfigValues.oreSmeltingEnergyUsage)
		public int oreSmeltingEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.oreSmeltingOutput)
		public String oreSmeltingOutput = "minecraft:redstone";
		@Config.Comment(_ConfigValues.oreSmeltingOutputAmount)
		public int oreSmeltingOutputAmount = 5;
		
		@Config.Comment(_ConfigValues.dustImpureSmeltingEnabled)
		public boolean dustImpureSmeltingEnabled = true;
		@Config.Comment(_ConfigValues.dustImpureSmeltingEnergyUsage)
		public int dustImpureSmeltingEnergyUsage = 5000;
		@Config.Comment(_ConfigValues.dustImpureSmeltingOutput)
		public String dustImpureSmeltingOutput = "minecraft:redstone";
		@Config.Comment(_ConfigValues.dustImpureSmeltingOutputAmount)
		public int dustImpureSmeltingOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.dustCompressingEnabled)
		public boolean dustCompressingEnabled = true;
		@Config.Comment(_ConfigValues.dustCompressingEnergyUsage)
		public int dustCompressingEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.dustCompressingOutput)
		public String dustCompressingOutput = "core:ingot_redstone";
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
