package com.silvaniastudios.core.config;

import org.apache.commons.lang3.ArrayUtils;

public class _ConfigValues {
	
	public static final String worldGenEnabled = "Whether to generate this ore in the world naturally at all. \nIf false, all further generator settings are ignored.";
	public static final String worldGenEnabledVanilla = "Whether to override vanilla ore generation with this config. \nIf false, all further generator settings are ignored, and the ore will generate as default. \nTIP: if you wanted to disable the ore ENTIRELY, use this config to generate with a vein spawn chance of 0!";
	public static final String minVeinSize = "The minimum size of one vein of ore. MUST BE LESS THAN MAXIMUM; NOT EQUAL TO.";
	public static final String maxVeinSize = "The maximum size of one vein of ore. MUST BE MORE THAN MINIMUM; NOT EQUAL TO.";
	public static final String minWorldHeight = "The lowest point of the world an ore can spawn at. Must be above 0.";
	public static final String maxWorldHeight = "The highest point of the world an ore can spawn at. Must be below 255.";
	public static final String veinsPerChunk = "How many veins of ore will spawn within a 16x16 area.";
	public static final String veinSpawnChance = "The chance each vein has to actually be generated. As a percentage, so 0-100. \nUsed for rare ores that should be less than one per chunk.";
	public static final String allowedDimensions = "A list of dimension IDs which this ore can spawn in. 0 is overworld, -1 is Nether and 1 is The End. \nCheck relevant mod configs for any other IDs.";
	public static final String restrictBiomes = "Whether to use the allowed biomes whitelist or just generate in all biomes.";
	public static final String allowedBiomes = "if restrictBiomes is true, the ore will only spawn in biomes listed here. A list can be found in the /assets/core/ folder of this mod. \nCurrent setting is just an example as restrictBiomes is off by default. \nYou can also use numerical biome IDs (which may be more reliable for mods!) \nNOTE! Biomes o' Plenty biomes are included but only work with the DEFAULT CONFIG. If you changed their config, use the ID numbers.";

	public static final String overrideVanillaDrop = "Whether cOre should override the vanilla drops. Set to false to leave normal vanilla mode when mining vanilla ores.";
	public static final String primaryDroppedItem = "The unlocalized name of the item which should be dropped (for example, core:ore_copper or minecraft:dye:4 for Lapis Lazuli)";
	public static final String secondaryDroppedItem = "The unlocalized name of a secondary item which can be dropped (leave blank to disable)";
	public static final String primaryDropQtyMin = "The minimum amount that will drop (Must be 1 or higher)";
	public static final String primaryDropQtyMax = "The maximum amount that will drop (cannot be higher than the items maximum stack size - usualy 64)";
	public static final String secondaryDropQtyMin = "The minimum amount of the secondary item that will drop";
	public static final String secondaryDropQtyMax = "The maximum amount of the secondary item that will drop";
	public static final String primaryDropChance = "The odds that the primary drop will occur. As a percentage, so 0-100.";
	public static final String secondaryDropChance = "The odds that the secondary drop will occur. As a percentage, so 0-100.";
	public static final String dropPrimaryForFakePlayer = "Whether the primary drop can drop when mined by a fake player (E.G. a quarry)";
	public static final String dropSecondaryForFakePlayer = "Whether the secondary drop can drop when mined by a fake player";
	public static final String canSilkTouch = "Whether Silk Touch enchantments works on this block \n(Dropping the block itself, instead of any drops listed above)";
	public static final String canFortune = "Whether Fortune enchantments work on this block \n(Increasing the total amounts dropped - does not increase drop chance for secondary.)";

	public static final String ingotOreDict = "The Ore Dictionary name used for ingots (typically ingotOrename)";
	public static final String oreOreDict = "The Ore Dictionary name used for the in-world ore block (typically oreOrename;. \nLeave blank to disable (in case you want to make block forms useless)";
	public static final String itemOreOreDict = "The Ore Dictionary name used for item form of ore (typically oreOrename - same as the block.)";
	public static final String dustOreDict = "The Ore Dictionary name used for dusts (typically dustOrename)";
	public static final String dustImpureOreDict = "The Ore Dictionary name used for impure dusts (typically dustImpureOrename)";
	public static final String dustTinyOreDict = "The Ore Dictionary name used for tiny dusts (typically dustTinyOrename)";
	public static final String nuggetOreDict = "The Ore Dictionary name used for nuggets (typically nuggetOrename)";
	public static final String gemOreDict = "The Ore Dictionary name used for gems (typically gemOrename)";
	public static final String blockOreDict = "The Ore Dictionary name used for the purified block (typically blockOrename)";
	public static final String fluidName = "The Fluid Dictionary name used for the fluid/molten version of the block (typically fluidOrename)";

	public static final String harvestLevel = "The tool level required to mine this rock. Vanilla examples are wood 0, stone 1, iron 2 and diamond 3. \nBoth ore and refined block share this value.";
	public static final String experienceMin = "The minimum experience dropped from this block. Disabled with Silk Touch.";
	public static final String experienceMax = "The maximum experience dropped from this block. Disabled with Silk Touchh. \nSet to 0 to disable experience drop entirely.";
	public static final String hardnessOre = "How hard the ore block is - how long it takes to mine. All vanilla ores are 3.";
	public static final String hardnessBlock = "How hard the refined block is - how long it takes to mine.";
	public static final String weight = "The weight of this metal in purified form, per cubic meter. For real metals this is accurate so probably doesn't need changing but tweak as you see fit.";
	public static final String durability = "An arbitrary value assigned based on material properties such as malleability and ductility as well as brittleness. This affects any tools made when using cOre directly. \nNOTE: that means both tools made directly by cOre, and also any mods which REQUIRE core as a dependency!! (Assuming they use this value, which they should.)";
	public static final String meltingPoint = "The melting point of the pure metal, in celcius.";
	public static final String componentName = "A list of component materials. Should simply be oredict name without the type (so for example Copper or Iron) \nStart each entry with a capital letter or it may fail.";
	public static final String componentAmount = "The makeup of each component listed in Component Name. \nThis list will align with that, so entry one of the component name list will have entry one from here. \nThe numbers are a ratio; so 75/25 and 3/1 will produce the same result - but 75/25 will require those as minimums for creating an alloy (anything less won't work). \nI recommend using the lowest possible values.";
	public static final String symbol = "The chemical symbol for this material. Not always used.";
	public static final String notes = "Any additional notes to be displayed in tooltip. Not used by default.\nEach entry will be displayed on its own line.";
	
	public static final String oreCrushingEnabled = "Whether this can be crushed in some sort of crushing machine, to produce (by default) impure dust.";
	public static final String oreCrusherEnergyUsage = "How much energy should the process consume";
	public static final String oreCrusherPrimaryOutput = "The unlocalized name of the primary output (for example, core:dust_impure_copper)";
	public static final String oreCrusherPrimaryOutputAmount = "The amount of items that should be produced (Modded Minecraft standard is 2 dust for one ore)";
	
	public static final String oreCrusherSecondaryOutput = "The unlocalized name of the primary output (for example, core:dust_copper) \nWill only be produced if the machine used supports secondary outputs with chance!!";
	public static final String oreCrusherSecondaryOutputAmount = "The amount of the secondary output to be produced on successful chance roll";
	public static final String oreCrusherSecondaryOutputChance = "The chance of producing secondary ore, as a percentage (0-100)";
	
	public static final String ingotCrushingEnabled = "Whether this can be crushed in some sort of crushing machine, to produce (by default) dust.";
	public static final String ingotCrusherEnergyUsage = "How much energy should the process consume";
	public static final String ingotCrusherOutput = "The unlocalized name of the primary output (for example, core:dust_copper)";
	public static final String ingotCrusherOutputAmount = "The amount of items that should be produced (For ingots you almost always want 1:1)";
	
	public static final String gemCrushingEnabled = "Whether this can be crushed in some sort of crushing machine, to produce (by default) dust.";
	public static final String gemCrusherEnergyUsage = "How much energy should the process consume";
	public static final String gemCrusherOutput = "The unlocalized name of the primary output (for example, core:dust_ruby)";
	public static final String gemCrusherOutputAmount = "The amount of items that should be produced (For gems you almost always want 1:1)";
	
	public static final String nuggetCrushingEnabled = "Whether this can be crushed in some sort of crushing machine, to produce (by default) tiny dust.";
	public static final String nuggetCrusherEnergyUsage = "How much energy should the process consume";
	public static final String nuggetCrusherOutput = "The unlocalized name of the primary output (for example, core:dust_tiny_copper)";
	public static final String nuggetCrusherOutputAmount = "The amount of items that should be produced (For nuggets you almost always want 1:1)";
	
	public static final String oreSmeltingEnabled = "Whether the ore can be smelted into the configured item (usually ingot)";
	public static final String oreSmeltingEnergyUsage = "How much energy should the process consume";
	public static final String oreSmeltingOutput = "The unlocalized name of the output (for example, core:ingot_copper)";
	public static final String oreSmeltingOutputAmount = "The amount of items that should be produced";
	
	public static final String dustSmeltingEnabled = "Whether the dust can be smelted into the configured item (usually ingot)";
	public static final String dustSmeltingEnergyUsage = "How much energy should the process consume";
	public static final String dustSmeltingOutput = "The unlocalized name of the output (for example, core:ingot_copper)";
	public static final String dustSmeltingOutputAmount = "The amount of items that should be produced";
	
	public static final String dustImpureSmeltingEnabled = "Whether the impure dust can be smelted into the configured item (usually ingot)";
	public static final String dustImpureSmeltingEnergyUsage = "How much energy should the process consume";
	public static final String dustImpureSmeltingOutput = "The unlocalized name of the output (for example, core:ingot_copper)";
	public static final String dustImpureSmeltingOutputAmount = "The amount of items that should be produced";
	
	public static final String dustTinySmeltingEnabled = "Whether the tiny dust can be smelted into the configured item (usually nugget)";
	public static final String dustTinySmeltingEnergyUsage = "How much energy should the process consume";
	public static final String dustTinySmeltingOutput = "The unlocalized name of the output (for example, core:nugget_copper)";
	public static final String dustTinySmeltingOutputAmount = "The amount of items that should be produced";
	
	public static final String dustCompressingEnabled = "Whether gem dust can be compressed to form a gem";
	public static final String dustCompressingEnergyUsage = "How much energy should the process consume";
	public static final String dustCompressingOutput = "The unlocalized name of the output (for example, core:gem_ruby)";
	public static final String dustCompressingOutputAmount = "The amount of items that should be produced";
	
	public static final String dustTinyCompressingEnabled = "Whether tiny gem dust can be compressed to form a gem shard";
	public static final String dustTinyCompressingEnergyUsage = "How much energy should the process consume";
	public static final String dustTinyCompressingOutput = "The unlocalized name of the output (for example, core:nugget_ruby) \nNB: Despite being shards, gem shards are still internally called nuggets.";
	public static final String dustTinyCompressingOutputAmount = "The amount of items that should be produced";
	
	public static final String compressShardToGem = "If true, you must use a compressor to turn Shards into Gems. \nIf false, you can simply craft with a crafting table.";
	public static final String compressShardToGemPowerUsage = "How much energy should the process consume";
	
	public static final String compressNuggetToIngot = "If true, you must use a compressor to turn Nuggets into Ingots. \nIf false, you can simply craft with a crafting table.";
	public static final String compressNuggetToIngotPowerUsage = "How much energy should the process consume";
	
	public static final String alloyEnergyUsage = "How much energy should the alloying process consume";
	
	public static final String colour_r = "Int value of Red colour used for ore colouring. Must be 0-255 \n(Mainly used on fluids - may be used elsewhere later.)";
	public static final String colour_g = "Int value of Green colour used for ore colouring. Must be 0-255 \n(Mainly used on fluids - may be used elsewhere later.)";
	public static final String colour_b = "Int value of Blue colour used for ore colouring. Must be 0-255 \n(Mainly used on fluids - may be used elsewhere later.)";
	
	public static final String pickaxe = "Enable or disable the vanilla pickaxe for this material.";
	public static final String shovel = "Enable or disable the vanilla shovel for this material.";
	public static final String axe = "Enable or disable the vanilla axe for this material.";
	public static final String hoe = "Enable or disable the vanilla hoe for this material.";
	public static final String sword = "Enable or disable the vanilla sword for this material.";
	public static final String armour_helmet = "Enable or disable the vanilla helmet for this material.";
	public static final String armour_chest = "Enable or disable the vanilla chest armour for this material.";
	public static final String armour_legs = "Enable or disable the vanilla leg armour for this material.";
	public static final String armour_boots = "Enable or disable the vanilla boot armour for this material.";
	public static final String tinkers_parts = "Enable or disable Tinkers Construct tools for this material. \nDoes NOT disable smeltery! Only the tool parts themselves!";
	
	public static String[] copperValues = (String[])ArrayUtils.addAll(new String[]{CopperConfig.properties.weight + "", CopperConfig.properties.durability + "", CopperConfig.properties.meltingPoint + "", CopperConfig.properties.symbol}, CopperConfig.properties.notes);
	public static String[] tinValues = (String[])ArrayUtils.addAll(new String[]{TinConfig.properties.weight + "", TinConfig.properties.durability + "", TinConfig.properties.meltingPoint + "", TinConfig.properties.symbol}, TinConfig.properties.notes);
	public static String[] zincValues = (String[])ArrayUtils.addAll(new String[]{ZincConfig.properties.weight + "", ZincConfig.properties.durability + "", ZincConfig.properties.meltingPoint + "", ZincConfig.properties.symbol}, ZincConfig.properties.notes);
	public static String[] nickelValues = (String[])ArrayUtils.addAll(new String[]{NickelConfig.properties.weight + "", NickelConfig.properties.durability + "", NickelConfig.properties.meltingPoint + "", NickelConfig.properties.symbol}, NickelConfig.properties.notes);
	public static String[] silverValues = (String[])ArrayUtils.addAll(new String[]{SilverConfig.properties.weight + "", SilverConfig.properties.durability + "", SilverConfig.properties.meltingPoint + "", SilverConfig.properties.symbol}, SilverConfig.properties.notes);
	public static String[] aluminiumValues = (String[])ArrayUtils.addAll(new String[]{AluminiumConfig.properties.weight + "", AluminiumConfig.properties.durability + "", AluminiumConfig.properties.meltingPoint + "", AluminiumConfig.properties.symbol}, AluminiumConfig.properties.notes);
	public static String[] titaniumValues = (String[])ArrayUtils.addAll(new String[]{TitaniumConfig.properties.weight + "", TitaniumConfig.properties.durability + "", TitaniumConfig.properties.meltingPoint + "", TitaniumConfig.properties.symbol}, TitaniumConfig.properties.notes);
	public static String[] chromiumValues = (String[])ArrayUtils.addAll(new String[]{ChromiumConfig.properties.weight + "", ChromiumConfig.properties.durability + "", ChromiumConfig.properties.meltingPoint + "", ChromiumConfig.properties.symbol}, ChromiumConfig.properties.notes);
	public static String[] siliconValues = (String[])ArrayUtils.addAll(new String[]{SiliconConfig.properties.weight + "", SiliconConfig.properties.durability + "", SiliconConfig.properties.meltingPoint + "", SiliconConfig.properties.symbol}, SiliconConfig.properties.notes);
	public static String[] cobaltValues = (String[])ArrayUtils.addAll(new String[]{CobaltConfig.properties.weight + "", CobaltConfig.properties.durability + "", CobaltConfig.properties.meltingPoint + "", CobaltConfig.properties.symbol}, CobaltConfig.properties.notes);
	public static String[] tungstenValues = (String[])ArrayUtils.addAll(new String[]{TungstenConfig.properties.weight + "", TungstenConfig.properties.durability + "", TungstenConfig.properties.meltingPoint + "", TungstenConfig.properties.symbol}, TungstenConfig.properties.notes);
	public static String[] leadValues = (String[])ArrayUtils.addAll(new String[]{LeadConfig.properties.weight + "", LeadConfig.properties.durability + "", LeadConfig.properties.meltingPoint + "", LeadConfig.properties.symbol}, LeadConfig.properties.notes);
	public static String[] platinumValues = (String[])ArrayUtils.addAll(new String[]{PlatinumConfig.properties.weight + "", PlatinumConfig.properties.durability + "", PlatinumConfig.properties.meltingPoint + "", PlatinumConfig.properties.symbol}, PlatinumConfig.properties.notes);
	public static String[] lithiumValues = (String[])ArrayUtils.addAll(new String[]{LithiumConfig.properties.weight + "", LithiumConfig.properties.durability + "", LithiumConfig.properties.meltingPoint + "", LithiumConfig.properties.symbol}, LithiumConfig.properties.notes);
	public static String[] uraniumValues = (String[])ArrayUtils.addAll(new String[]{UraniumConfig.properties.weight + "", UraniumConfig.properties.durability + "", UraniumConfig.properties.meltingPoint + "", UraniumConfig.properties.symbol}, UraniumConfig.properties.notes);
	public static String[] plutoniumValues = (String[])ArrayUtils.addAll(new String[]{PlutoniumConfig.properties.weight + "", PlutoniumConfig.properties.durability + "", PlutoniumConfig.properties.meltingPoint + "", PlutoniumConfig.properties.symbol}, PlutoniumConfig.properties.notes);
	
	public static String[] rubyValues = (String[])ArrayUtils.addAll(new String[]{RubyConfig.properties.weight + "", RubyConfig.properties.durability + "", RubyConfig.properties.meltingPoint + "", RubyConfig.properties.symbol}, RubyConfig.properties.notes);
	public static String[] sapphireValues = (String[])ArrayUtils.addAll(new String[]{SapphireConfig.properties.weight + "", SapphireConfig.properties.durability + "", SapphireConfig.properties.meltingPoint + "", SapphireConfig.properties.symbol}, SapphireConfig.properties.notes);
	public static String[] amethystValues = (String[])ArrayUtils.addAll(new String[]{AmethystConfig.properties.weight + "", AmethystConfig.properties.durability + "", AmethystConfig.properties.meltingPoint + "", AmethystConfig.properties.symbol}, AmethystConfig.properties.notes);
	public static String[] crystalValues = (String[])ArrayUtils.addAll(new String[]{CrystalConfig.properties.weight + "", CrystalConfig.properties.durability + "", CrystalConfig.properties.meltingPoint + "", CrystalConfig.properties.symbol}, CrystalConfig.properties.notes);
	public static String[] magnesiumValues = (String[])ArrayUtils.addAll(new String[]{MagnesiumConfig.properties.weight + "", MagnesiumConfig.properties.durability + "", MagnesiumConfig.properties.meltingPoint + "", MagnesiumConfig.properties.symbol}, MagnesiumConfig.properties.notes);
	public static String[] phosphorusValues = (String[])ArrayUtils.addAll(new String[]{PhosphorusConfig.properties.weight + "", PhosphorusConfig.properties.durability + "", PhosphorusConfig.properties.meltingPoint + "", PhosphorusConfig.properties.symbol}, PhosphorusConfig.properties.notes);
	public static String[] sulfurValues = (String[])ArrayUtils.addAll(new String[]{SulfurConfig.properties.weight + "", SulfurConfig.properties.durability + "", SulfurConfig.properties.meltingPoint + "", SulfurConfig.properties.symbol}, SulfurConfig.properties.notes);
	public static String[] silvaniteValues = (String[])ArrayUtils.addAll(new String[]{SilvaniteConfig.properties.weight + "", SilvaniteConfig.properties.durability + "", SilvaniteConfig.properties.meltingPoint + "", SilvaniteConfig.properties.symbol}, SilvaniteConfig.properties.notes);
	public static String[] merciliteValues = (String[])ArrayUtils.addAll(new String[]{MerciliteConfig.properties.weight + "", MerciliteConfig.properties.durability + "", MerciliteConfig.properties.meltingPoint + "", MerciliteConfig.properties.symbol}, MerciliteConfig.properties.notes);
	public static String[] mythianValues = (String[])ArrayUtils.addAll(new String[]{MythianConfig.properties.weight + "", MythianConfig.properties.durability + "", MythianConfig.properties.meltingPoint + "", MythianConfig.properties.symbol}, MythianConfig.properties.notes);
	public static String[] dragiteValues = (String[])ArrayUtils.addAll(new String[]{DragiteConfig.properties.weight + "", DragiteConfig.properties.durability + "", DragiteConfig.properties.meltingPoint + "", DragiteConfig.properties.symbol}, DragiteConfig.properties.notes);
	public static String[] flariteValues = (String[])ArrayUtils.addAll(new String[]{FlariteConfig.properties.weight + "", FlariteConfig.properties.durability + "", FlariteConfig.properties.meltingPoint + "", FlariteConfig.properties.symbol}, FlariteConfig.properties.notes);
	public static String[] fureniumValues = (String[])ArrayUtils.addAll(new String[]{FureniumConfig.properties.weight + "", FureniumConfig.properties.durability + "", FureniumConfig.properties.meltingPoint + "", FureniumConfig.properties.symbol}, FureniumConfig.properties.notes);
	public static String[] blackstoneValues = (String[])ArrayUtils.addAll(new String[]{BlackstoneConfig.properties.weight + "", BlackstoneConfig.properties.durability + "", BlackstoneConfig.properties.meltingPoint + "", BlackstoneConfig.properties.symbol}, BlackstoneConfig.properties.notes);
	public static String[] bluestoneValues = (String[])ArrayUtils.addAll(new String[]{BluestoneConfig.properties.weight + "", BluestoneConfig.properties.durability + "", BluestoneConfig.properties.meltingPoint + "", BluestoneConfig.properties.symbol}, BluestoneConfig.properties.notes);
	public static String[] purplestoneValues = (String[])ArrayUtils.addAll(new String[]{PurplestoneConfig.properties.weight + "", PurplestoneConfig.properties.durability + "", PurplestoneConfig.properties.meltingPoint + "", PurplestoneConfig.properties.symbol}, PurplestoneConfig.properties.notes);
	
	public static String[] bronzeValues = (String[])ArrayUtils.addAll(new String[]{AlloyBronzeConfig.properties.weight + "", AlloyBronzeConfig.properties.durability + "", AlloyBronzeConfig.properties.meltingPoint + "", ""}, AlloyBronzeConfig.properties.notes);
	public static String[] cupronickelValues = (String[])ArrayUtils.addAll(new String[]{AlloyCupronickelConfig.properties.weight + "", AlloyCupronickelConfig.properties.durability + "", AlloyCupronickelConfig.properties.meltingPoint + "", ""}, AlloyCupronickelConfig.properties.notes);
	public static String[] brassValues = (String[])ArrayUtils.addAll(new String[]{AlloyBrassConfig.properties.weight + "", AlloyBrassConfig.properties.durability + "", AlloyBrassConfig.properties.meltingPoint + "", ""}, AlloyBrassConfig.properties.notes);
	public static String[] rosegoldValues = (String[])ArrayUtils.addAll(new String[]{AlloyRoseGoldConfig.properties.weight + "", AlloyRoseGoldConfig.properties.durability + "", AlloyRoseGoldConfig.properties.meltingPoint + "", ""}, AlloyRoseGoldConfig.properties.notes);
	public static String[] steelValues = (String[])ArrayUtils.addAll(new String[]{AlloySteelConfig.properties.weight + "", AlloySteelConfig.properties.durability + "", AlloySteelConfig.properties.meltingPoint + "", ""}, AlloySteelConfig.properties.notes);
	public static String[] stainlesssteelValues = (String[])ArrayUtils.addAll(new String[]{AlloyStainlessSteelConfig.properties.weight + "", AlloyStainlessSteelConfig.properties.durability + "", AlloyStainlessSteelConfig.properties.meltingPoint + "", ""}, AlloyStainlessSteelConfig.properties.notes);
	public static String[] nichromeValues = (String[])ArrayUtils.addAll(new String[]{AlloyNichromeConfig.properties.weight + "", AlloyNichromeConfig.properties.durability + "", AlloyNichromeConfig.properties.meltingPoint + "", ""}, AlloyNichromeConfig.properties.notes);
	public static String[] electrumValues = (String[])ArrayUtils.addAll(new String[]{AlloyElectrumConfig.properties.weight + "", AlloyElectrumConfig.properties.durability + "", AlloyElectrumConfig.properties.meltingPoint + "", ""}, AlloyElectrumConfig.properties.notes);
	public static String[] stelliteValues = (String[])ArrayUtils.addAll(new String[]{AlloyStelliteConfig.properties.weight + "", AlloyStelliteConfig.properties.durability + "", AlloyStelliteConfig.properties.meltingPoint + "", ""}, AlloyStelliteConfig.properties.notes);
	public static String[] silvamerValues = (String[])ArrayUtils.addAll(new String[]{AlloySilvamerConfig.properties.weight + "", AlloySilvamerConfig.properties.durability + "", AlloySilvamerConfig.properties.meltingPoint + "", ""}, AlloySilvamerConfig.properties.notes);
	public static String[] uniumValues = (String[])ArrayUtils.addAll(new String[]{AlloyUniumConfig.properties.weight + "", AlloyUniumConfig.properties.durability + "", AlloyUniumConfig.properties.meltingPoint + "", ""}, AlloyUniumConfig.properties.notes);
	public static String[] fenikisiteValues = (String[])ArrayUtils.addAll(new String[]{AlloyFenikisiteConfig.properties.weight + "", AlloyFenikisiteConfig.properties.durability + "", AlloyFenikisiteConfig.properties.meltingPoint + "", ""}, AlloyFenikisiteConfig.properties.notes);
	public static String[] ultimiteValues = (String[])ArrayUtils.addAll(new String[]{AlloyUltimiteConfig.properties.weight + "", AlloyUltimiteConfig.properties.durability + "", AlloyUltimiteConfig.properties.meltingPoint + "", ""}, AlloyUltimiteConfig.properties.notes);
	public static String[] strootiteValues = (String[])ArrayUtils.addAll(new String[]{AlloyStrootiteConfig.properties.weight + "", AlloyStrootiteConfig.properties.durability + "", AlloyStrootiteConfig.properties.meltingPoint + "", ""}, AlloyStrootiteConfig.properties.notes);
	public static String[] speedoiValues = (String[])ArrayUtils.addAll(new String[]{AlloySpeedoiConfig.properties.weight + "", AlloySpeedoiConfig.properties.durability + "", AlloySpeedoiConfig.properties.meltingPoint + "", ""}, AlloySpeedoiConfig.properties.notes);
	public static String[] legeniteValues = (String[])ArrayUtils.addAll(new String[]{AlloyLegeniteConfig.properties.weight + "", AlloyLegeniteConfig.properties.durability + "", AlloyLegeniteConfig.properties.meltingPoint + "", ""}, AlloyLegeniteConfig.properties.notes);

	public static String[] coalValues = (String[])ArrayUtils.addAll(new String[]{VanillaCoalConfig.properties.weight + "", VanillaCoalConfig.properties.durability + "", VanillaCoalConfig.properties.meltingPoint + "", VanillaCoalConfig.properties.symbol}, VanillaCoalConfig.properties.notes);
	public static String[] ironValues = (String[])ArrayUtils.addAll(new String[]{VanillaIronConfig.properties.weight + "", VanillaIronConfig.properties.durability + "", VanillaIronConfig.properties.meltingPoint + "", VanillaIronConfig.properties.symbol}, VanillaIronConfig.properties.notes);
	public static String[] goldValues = (String[])ArrayUtils.addAll(new String[]{VanillaGoldConfig.properties.weight + "", VanillaGoldConfig.properties.durability + "", VanillaGoldConfig.properties.meltingPoint + "", VanillaGoldConfig.properties.symbol}, VanillaGoldConfig.properties.notes);
	public static String[] diamondValues = (String[])ArrayUtils.addAll(new String[]{VanillaDiamondConfig.properties.weight + "", VanillaDiamondConfig.properties.durability + "", VanillaDiamondConfig.properties.meltingPoint + "", VanillaDiamondConfig.properties.symbol}, VanillaDiamondConfig.properties.notes);
	public static String[] lapisLazuliValues = (String[])ArrayUtils.addAll(new String[]{VanillaLapisLazuliConfig.properties.weight + "", VanillaLapisLazuliConfig.properties.durability + "", VanillaLapisLazuliConfig.properties.meltingPoint + "", VanillaLapisLazuliConfig.properties.symbol}, VanillaLapisLazuliConfig.properties.notes);
	public static String[] redstoneValues = (String[])ArrayUtils.addAll(new String[]{VanillaRedstoneConfig.properties.weight + "", VanillaRedstoneConfig.properties.durability + "", VanillaRedstoneConfig.properties.meltingPoint + "", VanillaRedstoneConfig.properties.symbol}, VanillaRedstoneConfig.properties.notes);
	public static String[] emeraldValues = (String[])ArrayUtils.addAll(new String[]{VanillaEmeraldConfig.properties.weight + "", VanillaEmeraldConfig.properties.durability + "", VanillaEmeraldConfig.properties.meltingPoint + "", VanillaEmeraldConfig.properties.symbol}, VanillaEmeraldConfig.properties.notes);
	public static String[] netherQuartzValues = (String[])ArrayUtils.addAll(new String[]{VanillaNetherQuartzConfig.properties.weight + "", VanillaNetherQuartzConfig.properties.durability + "", VanillaNetherQuartzConfig.properties.meltingPoint + "", VanillaNetherQuartzConfig.properties.symbol}, VanillaNetherQuartzConfig.properties.notes);
	
	public static String[] limestoneValues = (String[])ArrayUtils.addAll(new String[]{LimestoneConfig.properties.weight + "", LimestoneConfig.properties.durability + "", LimestoneConfig.properties.meltingPoint + "", LimestoneConfig.properties.symbol}, LimestoneConfig.properties.notes);
	public static String[] graphiteValues = (String[])ArrayUtils.addAll(new String[]{GraphiteConfig.properties.weight + "", GraphiteConfig.properties.durability + "", GraphiteConfig.properties.meltingPoint + "", GraphiteConfig.properties.symbol}, GraphiteConfig.properties.notes);
	public static String[] calciteValues = (String[])ArrayUtils.addAll(new String[]{CalciteConfig.properties.weight + "", CalciteConfig.properties.durability + "", CalciteConfig.properties.meltingPoint + "", CalciteConfig.properties.symbol}, CalciteConfig.properties.notes);

	public static String[] copperOreDictValues = new String[]{CopperConfig.oredict.oreOreDict + "", CopperConfig.oredict.ingotOreDict + "", CopperConfig.oredict.dustOreDict + "", CopperConfig.oredict.dustImpureOreDict + "", CopperConfig.oredict.nuggetOreDict + "", CopperConfig.oredict.dustTinyOreDict + "", CopperConfig.oredict.blockOreDict};
	public static String[] tinOreDictValues = new String[]{TinConfig.oredict.oreOreDict + "", TinConfig.oredict.ingotOreDict + "", TinConfig.oredict.dustOreDict + "", TinConfig.oredict.dustImpureOreDict + "", TinConfig.oredict.nuggetOreDict + "", TinConfig.oredict.dustTinyOreDict + "", TinConfig.oredict.blockOreDict};
	public static String[] zincOreDictValues = new String[]{ZincConfig.oredict.oreOreDict + "", ZincConfig.oredict.ingotOreDict + "", ZincConfig.oredict.dustOreDict + "", ZincConfig.oredict.dustImpureOreDict + "", ZincConfig.oredict.nuggetOreDict + "", ZincConfig.oredict.dustTinyOreDict + "", ZincConfig.oredict.blockOreDict};
	public static String[] nickelOreDictValues = new String[]{NickelConfig.oredict.oreOreDict + "", NickelConfig.oredict.ingotOreDict + "", NickelConfig.oredict.dustOreDict + "", NickelConfig.oredict.dustImpureOreDict + "", NickelConfig.oredict.nuggetOreDict + "", NickelConfig.oredict.dustTinyOreDict + "", NickelConfig.oredict.blockOreDict};
	public static String[] silverOreDictValues = new String[]{SilverConfig.oredict.oreOreDict + "", SilverConfig.oredict.ingotOreDict + "", SilverConfig.oredict.dustOreDict + "", SilverConfig.oredict.dustImpureOreDict + "", SilverConfig.oredict.nuggetOreDict + "", SilverConfig.oredict.dustTinyOreDict + "", SilverConfig.oredict.blockOreDict};
	public static String[] aluminiumOreDictValues = new String[]{AluminiumConfig.oredict.oreOreDict + "", AluminiumConfig.oredict.ingotOreDict + "", AluminiumConfig.oredict.dustOreDict + "", AluminiumConfig.oredict.dustImpureOreDict + "", AluminiumConfig.oredict.nuggetOreDict + "", AluminiumConfig.oredict.dustTinyOreDict + "", AluminiumConfig.oredict.blockOreDict};
	public static String[] titaniumOreDictValues = new String[]{TitaniumConfig.oredict.oreOreDict + "", TitaniumConfig.oredict.ingotOreDict + "", TitaniumConfig.oredict.dustOreDict + "", TitaniumConfig.oredict.dustImpureOreDict + "", TitaniumConfig.oredict.nuggetOreDict + "", TitaniumConfig.oredict.dustTinyOreDict + "", TitaniumConfig.oredict.blockOreDict};
	public static String[] chromiumOreDictValues = new String[]{ChromiumConfig.oredict.oreOreDict + "", ChromiumConfig.oredict.ingotOreDict + "", ChromiumConfig.oredict.dustOreDict + "", ChromiumConfig.oredict.dustImpureOreDict + "", ChromiumConfig.oredict.nuggetOreDict + "", ChromiumConfig.oredict.dustTinyOreDict + "", ChromiumConfig.oredict.blockOreDict};
	public static String[] siliconOreDictValues = new String[]{SiliconConfig.oredict.oreOreDict + "", SiliconConfig.oredict.ingotOreDict + "", SiliconConfig.oredict.dustOreDict + "", SiliconConfig.oredict.dustImpureOreDict + "", "null", SiliconConfig.oredict.dustTinyOreDict + "", SiliconConfig.oredict.blockOreDict};
	public static String[] cobaltOreDictValues = new String[]{CobaltConfig.oredict.oreOreDict + "", CobaltConfig.oredict.ingotOreDict + "", CobaltConfig.oredict.dustOreDict + "", CobaltConfig.oredict.dustImpureOreDict + "", CobaltConfig.oredict.nuggetOreDict + "", CobaltConfig.oredict.dustTinyOreDict + "", CobaltConfig.oredict.blockOreDict};
	public static String[] tungstenOreDictValues = new String[]{TungstenConfig.oredict.oreOreDict + "", TungstenConfig.oredict.ingotOreDict + "", TungstenConfig.oredict.dustOreDict + "", TungstenConfig.oredict.dustImpureOreDict + "", TungstenConfig.oredict.nuggetOreDict + "", TungstenConfig.oredict.dustTinyOreDict + "", TungstenConfig.oredict.blockOreDict};
	public static String[] leadOreDictValues = new String[]{LeadConfig.oredict.oreOreDict + "", LeadConfig.oredict.ingotOreDict + "", LeadConfig.oredict.dustOreDict + "", LeadConfig.oredict.dustImpureOreDict + "", LeadConfig.oredict.nuggetOreDict + "", LeadConfig.oredict.dustTinyOreDict + "", LeadConfig.oredict.blockOreDict};
	public static String[] platinumOreDictValues = new String[]{PlatinumConfig.oredict.oreOreDict + "", PlatinumConfig.oredict.ingotOreDict + "", PlatinumConfig.oredict.dustOreDict + "", PlatinumConfig.oredict.dustImpureOreDict + "", PlatinumConfig.oredict.nuggetOreDict + "", PlatinumConfig.oredict.dustTinyOreDict + "", PlatinumConfig.oredict.blockOreDict};
	public static String[] lithiumOreDictValues = new String[]{LithiumConfig.oredict.oreOreDict + "", LithiumConfig.oredict.ingotOreDict + "", LithiumConfig.oredict.dustOreDict + "", LithiumConfig.oredict.dustImpureOreDict + "", LithiumConfig.oredict.nuggetOreDict + "", LithiumConfig.oredict.dustTinyOreDict + "", LithiumConfig.oredict.blockOreDict};
	public static String[] uraniumOreDictValues = new String[]{UraniumConfig.oredict.oreOreDict + "", UraniumConfig.oredict.ingotOreDict + "", UraniumConfig.oredict.dustOreDict + "", UraniumConfig.oredict.dustImpureOreDict + "", UraniumConfig.oredict.nuggetOreDict + "", UraniumConfig.oredict.dustTinyOreDict + "", UraniumConfig.oredict.blockOreDict};
	public static String[] plutoniumOreDictValues = new String[]{PlutoniumConfig.oredict.oreOreDict + "", PlutoniumConfig.oredict.ingotOreDict + "", PlutoniumConfig.oredict.dustOreDict + "", PlutoniumConfig.oredict.dustImpureOreDict + "", PlutoniumConfig.oredict.nuggetOreDict + "", PlutoniumConfig.oredict.dustTinyOreDict + "", PlutoniumConfig.oredict.blockOreDict};

	public static String[] rubyOreDictValues = new String[]{RubyConfig.oredict.oreOreDict + "", RubyConfig.oredict.gemOreDict + "", RubyConfig.oredict.dustOreDict + "", RubyConfig.oredict.dustImpureOreDict + "", RubyConfig.oredict.nuggetOreDict + "", RubyConfig.oredict.dustTinyOreDict + "", RubyConfig.oredict.blockOreDict};
	public static String[] sapphireOreDictValues = new String[]{SapphireConfig.oredict.oreOreDict + "", SapphireConfig.oredict.gemOreDict + "", SapphireConfig.oredict.dustOreDict + "", SapphireConfig.oredict.dustImpureOreDict + "", SapphireConfig.oredict.nuggetOreDict + "", SapphireConfig.oredict.dustTinyOreDict + "", SapphireConfig.oredict.blockOreDict};
	public static String[] amethystOreDictValues = new String[]{AmethystConfig.oredict.oreOreDict + "", AmethystConfig.oredict.gemOreDict + "", AmethystConfig.oredict.dustOreDict + "", AmethystConfig.oredict.dustImpureOreDict + "", AmethystConfig.oredict.nuggetOreDict + "", AmethystConfig.oredict.dustTinyOreDict + "", AmethystConfig.oredict.blockOreDict};
	public static String[] crystalOreDictValues = new String[]{CrystalConfig.oredict.oreOreDict + "", CrystalConfig.oredict.gemOreDict + "", CrystalConfig.oredict.dustOreDict + "", CrystalConfig.oredict.dustImpureOreDict + "", CrystalConfig.oredict.nuggetOreDict + "", CrystalConfig.oredict.dustTinyOreDict + "", CrystalConfig.oredict.blockOreDict};
	public static String[] magnesiumOreDictValues = new String[]{MagnesiumConfig.oredict.oreOreDict + "", MagnesiumConfig.oredict.ingotOreDict + "", MagnesiumConfig.oredict.dustOreDict + "", MagnesiumConfig.oredict.dustImpureOreDict + "", MagnesiumConfig.oredict.nuggetOreDict + "", MagnesiumConfig.oredict.dustTinyOreDict + "", MagnesiumConfig.oredict.blockOreDict};
	public static String[] phosphorusOreDictValues = new String[]{PhosphorusConfig.oredict.oreOreDict + "", "null" + "", PhosphorusConfig.oredict.dustOreDict + "", PhosphorusConfig.oredict.dustImpureOreDict + "", "null", PhosphorusConfig.oredict.dustTinyOreDict + "", PhosphorusConfig.oredict.blockOreDict};
	public static String[] sulfurOreDictValues = new String[]{SulfurConfig.oredict.oreOreDict + "", SulfurConfig.oredict.ingotOreDict + "", SulfurConfig.oredict.dustOreDict + "", SulfurConfig.oredict.dustImpureOreDict + "", "null", SulfurConfig.oredict.dustTinyOreDict + "", SulfurConfig.oredict.blockOreDict};
	public static String[] silvaniteOreDictValues = new String[]{SilvaniteConfig.oredict.oreOreDict + "", SilvaniteConfig.oredict.ingotOreDict + "", SilvaniteConfig.oredict.dustOreDict + "", SilvaniteConfig.oredict.dustImpureOreDict + "", SilvaniteConfig.oredict.nuggetOreDict + "", SilvaniteConfig.oredict.dustTinyOreDict + "", SilvaniteConfig.oredict.blockOreDict};
	public static String[] merciliteOreDictValues = new String[]{MerciliteConfig.oredict.oreOreDict + "", MerciliteConfig.oredict.ingotOreDict + "", MerciliteConfig.oredict.dustOreDict + "", MerciliteConfig.oredict.dustImpureOreDict + "", MerciliteConfig.oredict.nuggetOreDict + "", MerciliteConfig.oredict.dustTinyOreDict + "", MerciliteConfig.oredict.blockOreDict};
	public static String[] mythianOreDictValues = new String[]{MythianConfig.oredict.oreOreDict + "", MythianConfig.oredict.ingotOreDict + "", MythianConfig.oredict.dustOreDict + "", MythianConfig.oredict.dustImpureOreDict + "", MythianConfig.oredict.nuggetOreDict + "", MythianConfig.oredict.dustTinyOreDict + "", MythianConfig.oredict.blockOreDict};
	public static String[] dragiteOreDictValues = new String[]{DragiteConfig.oredict.oreOreDict + "", DragiteConfig.oredict.ingotOreDict + "", DragiteConfig.oredict.dustOreDict + "", DragiteConfig.oredict.dustImpureOreDict + "", DragiteConfig.oredict.nuggetOreDict + "", DragiteConfig.oredict.dustTinyOreDict + "", DragiteConfig.oredict.blockOreDict};
	public static String[] flariteOreDictValues = new String[]{FlariteConfig.oredict.oreOreDict + "", FlariteConfig.oredict.ingotOreDict + "", FlariteConfig.oredict.dustOreDict + "", FlariteConfig.oredict.dustImpureOreDict + "", FlariteConfig.oredict.nuggetOreDict + "", FlariteConfig.oredict.dustTinyOreDict + "", FlariteConfig.oredict.blockOreDict};
	public static String[] fureniumOreDictValues = new String[]{FureniumConfig.oredict.oreOreDict + "", FureniumConfig.oredict.ingotOreDict + "", FureniumConfig.oredict.dustOreDict + "", FureniumConfig.oredict.dustImpureOreDict + "", FureniumConfig.oredict.nuggetOreDict + "", FureniumConfig.oredict.dustTinyOreDict + "", FureniumConfig.oredict.blockOreDict};
	public static String[] blackstoneOreDictValues = new String[]{BlackstoneConfig.oredict.oreOreDict + "", BlackstoneConfig.oredict.ingotOreDict + "", BlackstoneConfig.oredict.dustOreDict + "", BlackstoneConfig.oredict.dustImpureOreDict + "", "null", BlackstoneConfig.oredict.dustTinyOreDict + "", BlackstoneConfig.oredict.blockOreDict};
	public static String[] bluestoneOreDictValues = new String[]{BluestoneConfig.oredict.oreOreDict + "", BluestoneConfig.oredict.ingotOreDict + "", BluestoneConfig.oredict.dustOreDict + "", BluestoneConfig.oredict.dustImpureOreDict + "", "null", BluestoneConfig.oredict.dustTinyOreDict + "", BluestoneConfig.oredict.blockOreDict};
	public static String[] purplestoneOreDictValues = new String[]{PurplestoneConfig.oredict.oreOreDict + "", PurplestoneConfig.oredict.ingotOreDict + "", PurplestoneConfig.oredict.dustOreDict + "", PurplestoneConfig.oredict.dustImpureOreDict + "", "null", PurplestoneConfig.oredict.dustTinyOreDict + "", PurplestoneConfig.oredict.blockOreDict};
	
	public static String[] bronzeOreDictValues = new String[]{AlloyBronzeConfig.oredict.ingotOreDict + "", AlloyBronzeConfig.oredict.dustOreDict + "", AlloyBronzeConfig.oredict.dustTinyOreDict + "", AlloyBronzeConfig.oredict.nuggetOreDict + "", AlloyBronzeConfig.oredict.blockOreDict};
	public static String[] cupronickelOreDictValues = new String[]{AlloyCupronickelConfig.oredict.ingotOreDict + "", AlloyCupronickelConfig.oredict.dustOreDict + "", AlloyCupronickelConfig.oredict.dustTinyOreDict + "", AlloyCupronickelConfig.oredict.nuggetOreDict + "", AlloyCupronickelConfig.oredict.blockOreDict};
	public static String[] brassOreDictValues = new String[]{AlloyBrassConfig.oredict.ingotOreDict + "", AlloyBrassConfig.oredict.dustOreDict + "", AlloyBrassConfig.oredict.dustTinyOreDict + "", AlloyBrassConfig.oredict.nuggetOreDict + "", AlloyBrassConfig.oredict.blockOreDict};
	public static String[] rosegoldOreDictValues = new String[]{AlloyRoseGoldConfig.oredict.ingotOreDict + "", AlloyRoseGoldConfig.oredict.dustOreDict + "", AlloyRoseGoldConfig.oredict.dustTinyOreDict + "", AlloyRoseGoldConfig.oredict.nuggetOreDict + "", AlloyRoseGoldConfig.oredict.blockOreDict};
	public static String[] steelOreDictValues = new String[]{AlloySteelConfig.oredict.ingotOreDict + "", AlloySteelConfig.oredict.dustOreDict + "", AlloySteelConfig.oredict.dustTinyOreDict + "", AlloySteelConfig.oredict.nuggetOreDict + "", AlloySteelConfig.oredict.blockOreDict};
	public static String[] stainlesssteelOreDictValues = new String[]{AlloyStainlessSteelConfig.oredict.ingotOreDict + "", AlloyStainlessSteelConfig.oredict.dustOreDict + "", AlloyStainlessSteelConfig.oredict.dustTinyOreDict + "", AlloyStainlessSteelConfig.oredict.nuggetOreDict + "", AlloyStainlessSteelConfig.oredict.blockOreDict};
	public static String[] nichromeOreDictValues = new String[]{AlloyNichromeConfig.oredict.ingotOreDict + "", AlloyNichromeConfig.oredict.dustOreDict + "", AlloyNichromeConfig.oredict.dustTinyOreDict + "", AlloyNichromeConfig.oredict.nuggetOreDict + "", AlloyNichromeConfig.oredict.blockOreDict};
	public static String[] electrumOreDictValues = new String[]{AlloyElectrumConfig.oredict.ingotOreDict + "", AlloyElectrumConfig.oredict.dustOreDict + "", AlloyElectrumConfig.oredict.dustTinyOreDict + "", AlloyElectrumConfig.oredict.nuggetOreDict + "", AlloyElectrumConfig.oredict.blockOreDict};
	public static String[] stelliteOreDictValues = new String[]{AlloyStelliteConfig.oredict.ingotOreDict + "", AlloyStelliteConfig.oredict.dustOreDict + "", AlloyStelliteConfig.oredict.dustTinyOreDict + "", AlloyStelliteConfig.oredict.nuggetOreDict + "", AlloyStelliteConfig.oredict.blockOreDict};
	public static String[] silvamerOreDictValues = new String[]{AlloySilvamerConfig.oredict.ingotOreDict + "", AlloySilvamerConfig.oredict.dustOreDict + "", AlloySilvamerConfig.oredict.dustTinyOreDict + "", AlloySilvamerConfig.oredict.nuggetOreDict + "", AlloySilvamerConfig.oredict.blockOreDict};
	public static String[] uniumOreDictValues = new String[]{AlloyUniumConfig.oredict.ingotOreDict + "", AlloyUniumConfig.oredict.dustOreDict + "", AlloyUniumConfig.oredict.dustTinyOreDict + "", AlloyUniumConfig.oredict.nuggetOreDict + "", AlloyUniumConfig.oredict.blockOreDict};
	public static String[] fenikisiteOreDictValues = new String[]{AlloyFenikisiteConfig.oredict.ingotOreDict + "", AlloyFenikisiteConfig.oredict.dustOreDict + "", AlloyFenikisiteConfig.oredict.dustTinyOreDict + "", AlloyFenikisiteConfig.oredict.nuggetOreDict + "", AlloyFenikisiteConfig.oredict.blockOreDict};
	public static String[] ultimiteOreDictValues = new String[]{AlloyUltimiteConfig.oredict.ingotOreDict + "", AlloyUltimiteConfig.oredict.dustOreDict + "", AlloyUltimiteConfig.oredict.dustTinyOreDict + "", AlloyUltimiteConfig.oredict.nuggetOreDict + "", AlloyUltimiteConfig.oredict.blockOreDict};
	public static String[] strootiteOreDictValues = new String[]{AlloyStrootiteConfig.oredict.ingotOreDict + "", AlloyStrootiteConfig.oredict.dustOreDict + "", AlloyStrootiteConfig.oredict.dustTinyOreDict + "", AlloyStrootiteConfig.oredict.nuggetOreDict + "", AlloyStrootiteConfig.oredict.blockOreDict};
	public static String[] speedoiOreDictValues = new String[]{AlloySpeedoiConfig.oredict.ingotOreDict + "", AlloySpeedoiConfig.oredict.dustOreDict + "", AlloySpeedoiConfig.oredict.dustTinyOreDict + "", AlloySpeedoiConfig.oredict.nuggetOreDict + "", AlloySpeedoiConfig.oredict.blockOreDict};
	public static String[] legeniteOreDictValues = new String[]{AlloyLegeniteConfig.oredict.ingotOreDict + "", AlloyLegeniteConfig.oredict.dustOreDict + "", AlloyLegeniteConfig.oredict.dustTinyOreDict + "", AlloyLegeniteConfig.oredict.nuggetOreDict + "", AlloyLegeniteConfig.oredict.blockOreDict};
 
}
