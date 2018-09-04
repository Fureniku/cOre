package com.silvaniastudios.core.config;

import com.silvaniastudios.core.COre;

import net.minecraftforge.common.config.Config;

@Config(modid = COre.MODID, name = "cOre/_cOre")
@Config.LangKey("core.config.title_core")
public class _COreConfig {
	
	@Config.Name("General Settings")
	public static General general = new General();
	
	@Config.Name("Tinkers Construct")
	public static TinkersConstruct tcon = new TinkersConstruct();
	
	@Config.Name("RPGCore")
	public static RPGCore rpgcore = new RPGCore();
	
	@Config.Name("CoFHCore / Thermal Expansion")
	public static CoFHCore cofh = new CoFHCore();
	
	@Config.Name("Developer Things")
	public static Dev dev = new Dev();
	
	public static class General {
		@Config.Comment("Whether to show detailed information on the Ore block tooltip. \n"
				+ "As you never get the ore itself in-game, this is only visible in creative OR NEI/JEI. \n"
				+ "It gives various information on the block relating to mining, such as mining level, drops etc. \n"
				+ "This is a CLIENT-SIDE setting. Currently, it cannot be forced - if that is in-demand I may add it.\n"
				+ "Alternatively, you can hide the ores from JEI/NEI using something like MineTweaker.\n"
				+ "But remember; at the end of the day this just shows config values in-game. Players can always access this data anyway.")
		public boolean showDetailsOnOre = true;
		
		@Config.Comment("What level of console output should you get from the mod. \n"
				+ "0: Nothing except absolute major errors. \n"
				+ "1: Config errors etc (for example, when an ore drop fails)\n"
				+ "2: Full logging. Logs every ore mined, who mined it, what it dropped. Very spammy and probably never needed for users.")
		public int debugLevel = 0;
		
		@Config.Comment("Whether the vanilla-style tools (pickaxe, shovel, axe and hoe) are enabled. \n"
				+ "If using Tinkers you might want to disab"
				+ "le this, but its your call.")
		public boolean vanillaStyleTools = true;
		
		@Config.Comment("Whether you can craft 9 tiny dust into 1 standard dust on a standard crafting bench")
		public boolean craftTinyToDust = true;
		
		@Config.Comment("Whether one normal dust can craft to 9 tiny dust in any standard crafting inventory")
		public boolean craftDustToTiny = true;
		
		@Config.Comment("Whether you can craft 9 nuggets into one ingot on a standard crafting bench")
		public boolean craftNuggetToIngot = true;
		
		@Config.Comment("Whether one ingot can craft to 9 nuggets in any standard crafting inventory")
		public boolean craftIngotToNugget = true;
		
		@Config.Comment("Whether crushing ore will give Impure dust. If false, you'll just get normal dust straight away.")
		public boolean crushOreToImpure = true;
		
		@Config.Comment("Whether you can wash impure dust into standard dust - which gives small byproducts.")
		public boolean washImpureToDust = true;
		
		@Config.Comment("Whether you can smelt a pile of dust into an ingot. You probably want this on.")
		public boolean smeltDustToIngot = true;
		
		@Config.Comment("Whether you can smelt a tiny dust into a nugget.")
		public boolean smeltTinyDustToNugget = true;
		
		@Config.Comment("Whether you can smelt impure dusts directly into ingots (will NOT give byproducts)")
		public boolean smeltImpureToIngot = false;
		
		@Config.Comment("Whether you can smelt the dropped ore directly into one single ingot (Vanilla-style)")
		public boolean smeltOreToIngot = true;
	}
	
	public static class TinkersConstruct {
		@Config.Comment("Whether to add any missing materials to Tinkers Construct, if installed. \n"
				+ "If Tinkers isn't installed this option is ignored anyway. \n"
				+ "All further options allow you to fine-tune which things are/n't added.\n"
				+ "For obvious reasons, anything included with Tinkers by default isn't included.")
		public boolean aaaTinkersConstructSupport = true;
		
		@Config.Comment("Whether Solarium can be used as a furnace fuel. I recommend leaving this on if you're using Tinkers support! \n"
				+ "Some metals from cOre by default have melting temperatures much higher than Lava can handle, so you need to use Solarium.")
		public boolean registerSolariumAsFuel = true;
		
		@Config.Comment("The temperature of Solarium. I recommend keeping this as high as your highest configured melting point (Default: 5530)")
		public int solariumTemperature = 5530;
		//TODO stuff
	}
	
	public static class RPGCore {
		@Config.Comment("Whether to add the Mining level to RPGCore, if installed. \n"
				+ "NOTE! RPGCore isn't ported to 1.12 just yet, but I'm offering configs for it anyway :)\n"
				+ "Each ore can have its own values set. set XP and Level both to zero to disable that ore from the levelling system.\n")
		public boolean aaa_RpgCoreSupport = true;
		
		public int copperXp = 2;
		public int copperLvl = 1;
		//TODO for EACH ORE - XP given per mine, level required to successfully mine
		
		@Config.Comment("The unlocalized name of any ores from other mods you want to gain mining XP from, or require a level to mine.")
		public String[] zzw_ExternalOres = new String[]{"ae2:certus_quartz"};
		@Config.Comment("How much XP to give for the matching entry in ExternalOres")
		public int[] zzx_ExternalOreXp = new int[]{5};
		@Config.Comment("The level required to mine the matching entry in ExternalOres")
		public int[] zzy_ExternalOreLevel = new int[]{12};
		
		@Config.Comment("Debug output for the levelling system.")
		public boolean zzz_RpgCoreMiningLevelDebug = false;
	}
	
	public static class CoFHCore {
		@Config.Comment("Blanket allow/deny ALL support from CoFH mods. Set to false to completely disable.")
		public boolean aaa_supportEnabled = true;
		@Config.Comment("Setting this true (default) will disable the internal CoFH recipes."
				+ "\nThis ensures you get the correct configured output from cOre instead of oredictionary outputs that they might give."
				+ "\nNOTE: This only applies to recipes I add. Things for ores not added by cOre will be left untouched."
				+ "\nThis should theoretically have no negative impact on gameplay. If anything, you'll get my outputs from other mods too.")
		public boolean aaa_disableCoFHRecipes =true;
		
		@Config.Comment("Enable or disable recipes specific to the pulverizer.")
		public boolean pulveriserRecipes = true;
		@Config.Comment("Enable or disable recipes specific to the furnace.")
		public boolean furnaceRecipes = true;
		@Config.Comment("Enable or disable recipes specific to the induction furnace (for alloys).")
		public boolean inductionFurnaceRecipes = true;
		@Config.Comment("Enable or disable recipes specific to the compressor (for compressed dust \"ingots\").")
		public boolean compressorRecipes = true;
	}
	
	public static class Dev {
		@Config.Comment("Spits loads of debug info onto the console. For ores, this will only use COPPER, so use copper for testing.")
		public boolean debug = false;
	}
}
