package com.silvaniastudios.core.config;

import com.silvaniastudios.core.COre;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = COre.MODID, name = "cOre/Alloy Electrum")
@Config.LangKey("core.config.title_electrum")
public class AlloyElectrumConfig {

	@Config.Name("Ore Dictionary")
	public static OreDictionary oredict = new OreDictionary();
	
	@Config.Name("Ore Properties")
	public static Properties properties = new Properties();

	@Config.Name("Ore Recipes")
	public static Recipes recipes = new Recipes();
	
	public static class OreDictionary {
		@Config.Comment(_ConfigValues.ingotOreDict)
		public String ingotOreDict = "ingotElectrum";
		@Config.Comment(_ConfigValues.dustOreDict)
		public String dustOreDict = "dustElectrum";
		@Config.Comment(_ConfigValues.dustTinyOreDict)
		public String dustTinyOreDict = "dustTinyElectrum";
		@Config.Comment(_ConfigValues.nuggetOreDict)
		public String nuggetOreDict = "nuggetElectrum";
		@Config.Comment(_ConfigValues.blockOreDict)
		public String blockOreDict = "blockElectrum";
		@Config.Comment(_ConfigValues.fluidName)
		public String fluidName = "fluidElectrum";
	}
	
	public static class Properties {
		@Config.Comment(_ConfigValues.harvestLevel)
		public int harvestLevel = 1;
		@Config.Comment(_ConfigValues.hardnessBlock)
		public int hardnessBlock = 5;
		@Config.Comment(_ConfigValues.weight)
		public int weight = 16736;
		@Config.Comment(_ConfigValues.durability)
		public int durability = 1;
		@Config.Comment(_ConfigValues.meltingPoint)
		public int meltingPoint = 1029;
		@Config.Comment(_ConfigValues.componentName)
		public String componentName[] = new String[]{"Gold","Silver"};
		@Config.Comment(_ConfigValues.componentAmount)
		public int componentAmount[] = new int[]{2, 1};
		@Config.Comment(_ConfigValues.notes)
		public String[] notes = new String[]{""};
		@Config.Comment(_ConfigValues.colour_r)
		public int colour_r = 231;
		@Config.Comment(_ConfigValues.colour_g)
		public int colour_g = 215;
		@Config.Comment(_ConfigValues.colour_b)
		public int colour_b = 181;
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
		@Config.Comment(_ConfigValues.ingotCrushingEnabled)
		public boolean ingotCrushingEnabled = true;
		@Config.Comment(_ConfigValues.ingotCrusherEnergyUsage)
		public int ingotCrusherEnergyUsage = 2000;
		@Config.Comment(_ConfigValues.ingotCrusherOutput)
		public String ingotCrusherOutput = "core:dust_electrum";
		@Config.Comment(_ConfigValues.ingotCrusherOutputAmount)
		public int ingotCrusherOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.nuggetCrushingEnabled)
		public boolean nuggetCrushingEnabled = true;
		@Config.Comment(_ConfigValues.nuggetCrusherEnergyUsage)
		public int nuggetCrusherEnergyUsage = 250;
		@Config.Comment(_ConfigValues.nuggetCrusherOutput)
		public String nuggetCrusherOutput = "core:dust_tiny_electrum";
		@Config.Comment(_ConfigValues.nuggetCrusherOutputAmount)
		public int nuggetCrusherOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.dustSmeltingEnabled)
		public boolean dustSmeltingEnabled = true;
		@Config.Comment(_ConfigValues.dustSmeltingEnergyUsage)
		public int dustSmeltingEnergyUsage = 4000;
		@Config.Comment(_ConfigValues.dustSmeltingOutput)
		public String dustSmeltingOutput = "core:ingot_electrum";
		@Config.Comment(_ConfigValues.dustSmeltingOutputAmount)
		public int dustSmeltingOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.dustTinySmeltingEnabled)
		public boolean dustTinySmeltingEnabled = true;
		@Config.Comment(_ConfigValues.dustTinySmeltingEnergyUsage)
		public int dustTinySmeltingEnergyUsage = 500;
		@Config.Comment(_ConfigValues.dustTinySmeltingOutput)
		public String dustTinySmeltingOutput = "core:nugget_electrum";
		@Config.Comment(_ConfigValues.dustTinySmeltingOutputAmount)
		public int dustTinySmeltingOutputAmount = 1;
		
		@Config.Comment(_ConfigValues.alloyEnergyUsage)
		public int alloyEnergyUsage = 3000;

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
