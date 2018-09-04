package com.silvaniastudios.core;

import com.silvaniastudios.core.config.AlloyBrassConfig;
import com.silvaniastudios.core.config.AlloyBronzeConfig;
import com.silvaniastudios.core.config.AlloyCupronickelConfig;
import com.silvaniastudios.core.config.AlloyElectrumConfig;
import com.silvaniastudios.core.config.AlloyFenikisiteConfig;
import com.silvaniastudios.core.config.AlloyLegeniteConfig;
import com.silvaniastudios.core.config.AlloyNichromeConfig;
import com.silvaniastudios.core.config.AlloyRoseGoldConfig;
import com.silvaniastudios.core.config.AlloySilvamerConfig;
import com.silvaniastudios.core.config.AlloySpeedoiConfig;
import com.silvaniastudios.core.config.AlloyStainlessSteelConfig;
import com.silvaniastudios.core.config.AlloySteelConfig;
import com.silvaniastudios.core.config.AlloyStelliteConfig;
import com.silvaniastudios.core.config.AlloyStrootiteConfig;
import com.silvaniastudios.core.config.AlloyUltimiteConfig;
import com.silvaniastudios.core.config.AlloyUniumConfig;
import com.silvaniastudios.core.config._ConfigValues;
import com.silvaniastudios.core.items.ItemCore;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
		
	public static ItemCore dustCopper = (ItemCore) new ItemCore("dust_copper", _ConfigValues.copperValues, "dust", false, null, null);
	public static ItemCore dustTin = (ItemCore) new ItemCore("dust_tin", _ConfigValues.tinValues, "dust", false, null, null);
	public static ItemCore dustZinc = (ItemCore) new ItemCore("dust_zinc", _ConfigValues.zincValues, "dust", false, null, null);
	public static ItemCore dustNickel = (ItemCore) new ItemCore("dust_nickel", _ConfigValues.nickelValues, "dust", false, null, null);
	public static ItemCore dustSilver = (ItemCore) new ItemCore("dust_silver", _ConfigValues.silverValues, "dust", false, null, null);
	public static ItemCore dustAluminium = (ItemCore) new ItemCore("dust_aluminium", _ConfigValues.aluminiumValues, "dust", false, null, null);
	public static ItemCore dustTitanium = (ItemCore) new ItemCore("dust_titanium", _ConfigValues.titaniumValues, "dust", false, null, null);
	public static ItemCore dustChromium = (ItemCore) new ItemCore("dust_chromium", _ConfigValues.chromiumValues, "dust", false, null, null);
	public static ItemCore dustSilicon = (ItemCore) new ItemCore("dust_silicon", _ConfigValues.siliconValues, "dust", false, null, null);
	public static ItemCore dustCobalt = (ItemCore) new ItemCore("dust_cobalt", _ConfigValues.cobaltValues, "dust", false, null, null);
	public static ItemCore dustTungsten = (ItemCore) new ItemCore("dust_tungsten", _ConfigValues.tungstenValues, "dust", false, null, null);
	public static ItemCore dustLead = (ItemCore) new ItemCore("dust_lead", _ConfigValues.leadValues, "dust", false, null, null);
	public static ItemCore dustPlatinum = (ItemCore) new ItemCore("dust_platinum", _ConfigValues.platinumValues, "dust", false, null, null);
	public static ItemCore dustLithium = (ItemCore) new ItemCore("dust_lithium", _ConfigValues.lithiumValues, "dust", false, null, null);
	public static ItemCore dustUranium = (ItemCore) new ItemCore("dust_uranium", _ConfigValues.uraniumValues, "dust", false, null, null);
	public static ItemCore dustPlutonium = (ItemCore) new ItemCore("dust_plutonium", _ConfigValues.plutoniumValues, "dust", false, null, null);
	public static ItemCore dustRuby = (ItemCore) new ItemCore("dust_ruby", _ConfigValues.rubyValues, "dust", false, null, null);
	public static ItemCore dustSapphire = (ItemCore) new ItemCore("dust_sapphire", _ConfigValues.sapphireValues, "dust", false, null, null);
	public static ItemCore dustAmethyst = (ItemCore) new ItemCore("dust_amethyst", _ConfigValues.amethystValues, "dust", false, null, null);
	public static ItemCore dustCrystal = (ItemCore) new ItemCore("dust_crystal", _ConfigValues.crystalValues, "dust", false, null, null);
	public static ItemCore dustMagnesium = (ItemCore) new ItemCore("dust_magnesium", _ConfigValues.magnesiumValues, "dust", false, null, null);
	public static ItemCore dustPhosphorus = (ItemCore) new ItemCore("dust_phosphorus", _ConfigValues.phosphorusValues, "dust", false, null, null);
	public static ItemCore dustSulfur = (ItemCore) new ItemCore("dust_sulfur", _ConfigValues.sulfurValues, "dust", false, null, null);
	public static ItemCore dustSilvanite = (ItemCore) new ItemCore("dust_silvanite", _ConfigValues.silvaniteValues, "dust", false, null, null);
	public static ItemCore dustMercilite = (ItemCore) new ItemCore("dust_mercilite", _ConfigValues.merciliteValues, "dust", false, null, null);
	public static ItemCore dustMythian = (ItemCore) new ItemCore("dust_mythian", _ConfigValues.mythianValues, "dust", false, null, null);
	public static ItemCore dustDragite = (ItemCore) new ItemCore("dust_dragite", _ConfigValues.dragiteValues, "dust", false, null, null);
	public static ItemCore dustFlarite = (ItemCore) new ItemCore("dust_flarite", _ConfigValues.flariteValues, "dust", false, null, null);
	public static ItemCore dustFurenium = (ItemCore) new ItemCore("dust_furenium", _ConfigValues.fureniumValues, "dust", false, null, null);
	public static ItemCore dustBlackstone = (ItemCore) new ItemCore("dust_blackstone", _ConfigValues.blackstoneValues, "dust", false, null, null);
	public static ItemCore dustBluestone = (ItemCore) new ItemCore("dust_bluestone", _ConfigValues.bluestoneValues, "dust", false, null, null);
	public static ItemCore dustPurplestone = (ItemCore) new ItemCore("dust_purplestone", _ConfigValues.purplestoneValues, "dust", false, null, null);
	public static ItemCore dustBronze = (ItemCore) new ItemCore("dust_bronze", _ConfigValues.bronzeValues, "dust", true, AlloyBronzeConfig.properties.componentName, AlloyBronzeConfig.properties.componentAmount);
	public static ItemCore dustCupronickel = (ItemCore) new ItemCore("dust_cupronickel", _ConfigValues.cupronickelValues, "dust", true, AlloyCupronickelConfig.properties.componentName, AlloyBronzeConfig.properties.componentAmount);
	public static ItemCore dustBrass = (ItemCore) new ItemCore("dust_brass", _ConfigValues.brassValues, "dust", true, AlloyBrassConfig.properties.componentName, AlloyBrassConfig.properties.componentAmount);
	public static ItemCore dustRosegold = (ItemCore) new ItemCore("dust_rosegold", _ConfigValues.rosegoldValues, "dust", true, AlloyRoseGoldConfig.properties.componentName, AlloyRoseGoldConfig.properties.componentAmount);
	public static ItemCore dustSteel = (ItemCore) new ItemCore("dust_steel", _ConfigValues.steelValues, "dust", true, AlloySteelConfig.properties.componentName, AlloySteelConfig.properties.componentAmount);
	public static ItemCore dustStainlesssteel = (ItemCore) new ItemCore("dust_stainlesssteel", _ConfigValues.stainlesssteelValues, "dust", true, AlloyStainlessSteelConfig.properties.componentName, AlloyStainlessSteelConfig.properties.componentAmount);
	public static ItemCore dustNichrome = (ItemCore) new ItemCore("dust_nichrome", _ConfigValues.nichromeValues, "dust", true, AlloyNichromeConfig.properties.componentName, AlloyNichromeConfig.properties.componentAmount);
	public static ItemCore dustElectrum = (ItemCore) new ItemCore("dust_electrum", _ConfigValues.electrumValues, "dust", true, AlloyElectrumConfig.properties.componentName, AlloyElectrumConfig.properties.componentAmount);
	public static ItemCore dustStellite = (ItemCore) new ItemCore("dust_stellite", _ConfigValues.stelliteValues, "dust", true, AlloyStelliteConfig.properties.componentName, AlloyStelliteConfig.properties.componentAmount);
	public static ItemCore dustSilvamer = (ItemCore) new ItemCore("dust_silvamer", _ConfigValues.silvamerValues, "dust", true, AlloySilvamerConfig.properties.componentName, AlloySilvamerConfig.properties.componentAmount);
	public static ItemCore dustUnium = (ItemCore) new ItemCore("dust_unium", _ConfigValues.uniumValues, "dust", true, AlloyUniumConfig.properties.componentName, AlloyUniumConfig.properties.componentAmount);
	public static ItemCore dustFenikisite = (ItemCore) new ItemCore("dust_fenikisite", _ConfigValues.fenikisiteValues, "dust", true, AlloyFenikisiteConfig.properties.componentName, AlloyFenikisiteConfig.properties.componentAmount);
	public static ItemCore dustUltimite = (ItemCore) new ItemCore("dust_ultimite", _ConfigValues.ultimiteValues, "dust", true, AlloyUltimiteConfig.properties.componentName, AlloyUltimiteConfig.properties.componentAmount);
	public static ItemCore dustStrootite = (ItemCore) new ItemCore("dust_strootite", _ConfigValues.strootiteValues, "dust", true, AlloyStrootiteConfig.properties.componentName, AlloyStrootiteConfig.properties.componentAmount);
	public static ItemCore dustSpeedoi = (ItemCore) new ItemCore("dust_speedoi", _ConfigValues.speedoiValues, "dust", true, AlloySpeedoiConfig.properties.componentName, AlloySpeedoiConfig.properties.componentAmount);
	public static ItemCore dustLegenite = (ItemCore) new ItemCore("dust_legenite", _ConfigValues.legeniteValues, "dust", true, AlloyLegeniteConfig.properties.componentName, AlloyLegeniteConfig.properties.componentAmount);
	public static ItemCore dustCoal = (ItemCore) new ItemCore("dust_coal", _ConfigValues.coalValues, "dust", false, null, null);
	public static ItemCore dustIron = (ItemCore) new ItemCore("dust_iron", _ConfigValues.ironValues, "dust", false, null, null);
	public static ItemCore dustGold = (ItemCore) new ItemCore("dust_gold", _ConfigValues.goldValues, "dust", false, null, null);
	public static ItemCore dustDiamond = (ItemCore) new ItemCore("dust_diamond", _ConfigValues.diamondValues, "dust", false, null, null);
	public static ItemCore dustLapisLazuli = (ItemCore) new ItemCore("dust_lapislazuli", _ConfigValues.lapisLazuliValues, "dust", false, null, null);
	public static ItemCore dustEmerald = (ItemCore) new ItemCore("dust_emerald", _ConfigValues.emeraldValues, "dust", false, null, null);
	public static ItemCore dustNetherQuartz = (ItemCore) new ItemCore("dust_netherquartz", _ConfigValues.netherQuartzValues, "dust", false, null, null);
	public static ItemCore dustLimestone = (ItemCore) new ItemCore("dust_limestone", _ConfigValues.limestoneValues, "dust", false, null, null);
	public static ItemCore dustGraphite = (ItemCore) new ItemCore("dust_graphite", _ConfigValues.graphiteValues, "dust", false, null, null);
	public static ItemCore dustCalcite = (ItemCore) new ItemCore("dust_calcite", _ConfigValues.calciteValues, "dust", false, null, null);
	
	public static ItemCore dustImpureCopper = (ItemCore) new ItemCore("dust_impure_copper", _ConfigValues.copperValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureTin = (ItemCore) new ItemCore("dust_impure_tin", _ConfigValues.tinValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureZinc = (ItemCore) new ItemCore("dust_impure_zinc", _ConfigValues.zincValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureNickel = (ItemCore) new ItemCore("dust_impure_nickel", _ConfigValues.nickelValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureSilver = (ItemCore) new ItemCore("dust_impure_silver", _ConfigValues.silverValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureAluminium = (ItemCore) new ItemCore("dust_impure_aluminium", _ConfigValues.aluminiumValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureTitanium = (ItemCore) new ItemCore("dust_impure_titanium", _ConfigValues.titaniumValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureChromium = (ItemCore) new ItemCore("dust_impure_chromium", _ConfigValues.chromiumValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureSilicon = (ItemCore) new ItemCore("dust_impure_silicon", _ConfigValues.siliconValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureCobalt = (ItemCore) new ItemCore("dust_impure_cobalt", _ConfigValues.cobaltValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureTungsten = (ItemCore) new ItemCore("dust_impure_tungsten", _ConfigValues.tungstenValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureLead = (ItemCore) new ItemCore("dust_impure_lead", _ConfigValues.leadValues, "dustImpure", false, null, null);
	public static ItemCore dustImpurePlatinum = (ItemCore) new ItemCore("dust_impure_platinum", _ConfigValues.platinumValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureLithium = (ItemCore) new ItemCore("dust_impure_lithium", _ConfigValues.lithiumValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureUranium = (ItemCore) new ItemCore("dust_impure_uranium", _ConfigValues.uraniumValues, "dustImpure", false, null, null);
	public static ItemCore dustImpurePlutonium = (ItemCore) new ItemCore("dust_impure_plutonium", _ConfigValues.plutoniumValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureRuby = (ItemCore) new ItemCore("dust_impure_ruby", _ConfigValues.rubyValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureSapphire = (ItemCore) new ItemCore("dust_impure_sapphire", _ConfigValues.sapphireValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureAmethyst = (ItemCore) new ItemCore("dust_impure_amethyst", _ConfigValues.amethystValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureCrystal = (ItemCore) new ItemCore("dust_impure_crystal", _ConfigValues.crystalValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureMagnesium = (ItemCore) new ItemCore("dust_impure_magnesium", _ConfigValues.magnesiumValues, "dustImpure", false, null, null);
	public static ItemCore dustImpurePhosphorus = (ItemCore) new ItemCore("dust_impure_phosphorus", _ConfigValues.phosphorusValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureSulfur = (ItemCore) new ItemCore("dust_impure_sulfur", _ConfigValues.sulfurValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureSilvanite = (ItemCore) new ItemCore("dust_impure_silvanite", _ConfigValues.silvaniteValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureMercilite = (ItemCore) new ItemCore("dust_impure_mercilite", _ConfigValues.merciliteValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureMythian = (ItemCore) new ItemCore("dust_impure_mythian", _ConfigValues.mythianValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureDragite = (ItemCore) new ItemCore("dust_impure_dragite", _ConfigValues.dragiteValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureFlarite = (ItemCore) new ItemCore("dust_impure_flarite", _ConfigValues.flariteValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureFurenium = (ItemCore) new ItemCore("dust_impure_furenium", _ConfigValues.fureniumValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureBlackstone = (ItemCore) new ItemCore("dust_impure_blackstone", _ConfigValues.blackstoneValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureBluestone = (ItemCore) new ItemCore("dust_impure_bluestone", _ConfigValues.bluestoneValues, "dustImpure", false, null, null);
	public static ItemCore dustImpurePurplestone = (ItemCore) new ItemCore("dust_impure_purplestone", _ConfigValues.purplestoneValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureCoal = (ItemCore) new ItemCore("dust_impure_coal", _ConfigValues.coalValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureIron = (ItemCore) new ItemCore("dust_impure_iron", _ConfigValues.ironValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureGold = (ItemCore) new ItemCore("dust_impure_gold", _ConfigValues.goldValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureDiamond = (ItemCore) new ItemCore("dust_impure_diamond", _ConfigValues.diamondValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureLapisLazuli = (ItemCore) new ItemCore("dust_impure_lapislazuli", _ConfigValues.lapisLazuliValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureRedstone = (ItemCore) new ItemCore("dust_impure_redstone", _ConfigValues.redstoneValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureEmerald = (ItemCore) new ItemCore("dust_impure_emerald", _ConfigValues.emeraldValues, "dustImpure", false, null, null);
	public static ItemCore dustImpureNetherQuartz = (ItemCore) new ItemCore("dust_impure_netherquartz", _ConfigValues.netherQuartzValues, "dustImpure", false, null, null);
	
	public static ItemCore dustTinyCopper = (ItemCore) new ItemCore("dust_tiny_copper", _ConfigValues.copperValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyTin = (ItemCore) new ItemCore("dust_tiny_tin", _ConfigValues.tinValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyZinc = (ItemCore) new ItemCore("dust_tiny_zinc", _ConfigValues.zincValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyNickel = (ItemCore) new ItemCore("dust_tiny_nickel", _ConfigValues.nickelValues, "dustTiny", false, null, null);
	public static ItemCore dustTinySilver = (ItemCore) new ItemCore("dust_tiny_silver", _ConfigValues.silverValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyAluminium = (ItemCore) new ItemCore("dust_tiny_aluminium", _ConfigValues.aluminiumValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyTitanium = (ItemCore) new ItemCore("dust_tiny_titanium", _ConfigValues.titaniumValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyChromium = (ItemCore) new ItemCore("dust_tiny_chromium", _ConfigValues.chromiumValues, "dustTiny", false, null, null);
	public static ItemCore dustTinySilicon = (ItemCore) new ItemCore("dust_tiny_silicon", _ConfigValues.siliconValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyCobalt = (ItemCore) new ItemCore("dust_tiny_cobalt", _ConfigValues.cobaltValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyTungsten = (ItemCore) new ItemCore("dust_tiny_tungsten", _ConfigValues.tungstenValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyLead = (ItemCore) new ItemCore("dust_tiny_lead", _ConfigValues.leadValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyPlatinum = (ItemCore) new ItemCore("dust_tiny_platinum", _ConfigValues.platinumValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyLithium = (ItemCore) new ItemCore("dust_tiny_lithium", _ConfigValues.lithiumValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyUranium = (ItemCore) new ItemCore("dust_tiny_uranium", _ConfigValues.uraniumValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyPlutonium = (ItemCore) new ItemCore("dust_tiny_plutonium", _ConfigValues.plutoniumValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyRuby = (ItemCore) new ItemCore("dust_tiny_ruby", _ConfigValues.rubyValues, "dustTiny", false, null, null);
	public static ItemCore dustTinySapphire = (ItemCore) new ItemCore("dust_tiny_sapphire", _ConfigValues.sapphireValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyAmethyst = (ItemCore) new ItemCore("dust_tiny_amethyst", _ConfigValues.amethystValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyCrystal = (ItemCore) new ItemCore("dust_tiny_crystal", _ConfigValues.crystalValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyMagnesium = (ItemCore) new ItemCore("dust_tiny_magnesium", _ConfigValues.magnesiumValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyPhosphorus = (ItemCore) new ItemCore("dust_tiny_phosphorus", _ConfigValues.phosphorusValues, "dustTiny", false, null, null);
	public static ItemCore dustTinySulfur = (ItemCore) new ItemCore("dust_tiny_sulfur", _ConfigValues.sulfurValues, "dustTiny", false, null, null);
	public static ItemCore dustTinySilvanite = (ItemCore) new ItemCore("dust_tiny_silvanite", _ConfigValues.silvaniteValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyMercilite = (ItemCore) new ItemCore("dust_tiny_mercilite", _ConfigValues.merciliteValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyMythian = (ItemCore) new ItemCore("dust_tiny_mythian", _ConfigValues.mythianValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyDragite = (ItemCore) new ItemCore("dust_tiny_dragite", _ConfigValues.dragiteValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyFlarite = (ItemCore) new ItemCore("dust_tiny_flarite", _ConfigValues.flariteValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyFurenium = (ItemCore) new ItemCore("dust_tiny_furenium", _ConfigValues.fureniumValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyBlackstone = (ItemCore) new ItemCore("dust_tiny_blackstone", _ConfigValues.blackstoneValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyBluestone = (ItemCore) new ItemCore("dust_tiny_bluestone", _ConfigValues.bluestoneValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyPurplestone = (ItemCore) new ItemCore("dust_tiny_purplestone", _ConfigValues.purplestoneValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyBronze = (ItemCore) new ItemCore("dust_tiny_bronze", _ConfigValues.bronzeValues, "dustTiny", true, AlloyBronzeConfig.properties.componentName, AlloyBronzeConfig.properties.componentAmount);
	public static ItemCore dustTinyCupronickel = (ItemCore) new ItemCore("dust_tiny_cupronickel", _ConfigValues.cupronickelValues, "dustTiny", true, AlloyCupronickelConfig.properties.componentName, AlloyBronzeConfig.properties.componentAmount);
	public static ItemCore dustTinyBrass = (ItemCore) new ItemCore("dust_tiny_brass", _ConfigValues.brassValues, "dustTiny", true, AlloyBrassConfig.properties.componentName, AlloyBrassConfig.properties.componentAmount);
	public static ItemCore dustTinyRosegold = (ItemCore) new ItemCore("dust_tiny_rosegold", _ConfigValues.rosegoldValues, "dustTiny", true, AlloyRoseGoldConfig.properties.componentName, AlloyRoseGoldConfig.properties.componentAmount);
	public static ItemCore dustTinySteel = (ItemCore) new ItemCore("dust_tiny_steel", _ConfigValues.steelValues, "dustTiny", true, AlloySteelConfig.properties.componentName, AlloySteelConfig.properties.componentAmount);
	public static ItemCore dustTinyStainlesssteel = (ItemCore) new ItemCore("dust_tiny_stainlesssteel", _ConfigValues.stainlesssteelValues, "dustTiny", true, AlloyStainlessSteelConfig.properties.componentName, AlloyStainlessSteelConfig.properties.componentAmount);
	public static ItemCore dustTinyNichrome = (ItemCore) new ItemCore("dust_tiny_nichrome", _ConfigValues.nichromeValues, "dustTiny", true, AlloyNichromeConfig.properties.componentName, AlloyNichromeConfig.properties.componentAmount);
	public static ItemCore dustTinyElectrum = (ItemCore) new ItemCore("dust_tiny_electrum", _ConfigValues.electrumValues, "dustTiny", true, AlloyElectrumConfig.properties.componentName, AlloyElectrumConfig.properties.componentAmount);
	public static ItemCore dustTinyStellite = (ItemCore) new ItemCore("dust_tiny_stellite", _ConfigValues.stelliteValues, "dustTiny", true, AlloyStelliteConfig.properties.componentName, AlloyStelliteConfig.properties.componentAmount);
	public static ItemCore dustTinySilvamer = (ItemCore) new ItemCore("dust_tiny_silvamer", _ConfigValues.silvamerValues, "dustTiny", true, AlloySilvamerConfig.properties.componentName, AlloySilvamerConfig.properties.componentAmount);
	public static ItemCore dustTinyUnium = (ItemCore) new ItemCore("dust_tiny_unium", _ConfigValues.uniumValues, "dustTiny", true, AlloyUniumConfig.properties.componentName, AlloyUniumConfig.properties.componentAmount);
	public static ItemCore dustTinyFenikisite = (ItemCore) new ItemCore("dust_tiny_fenikisite", _ConfigValues.fenikisiteValues, "dustTiny", true, AlloyFenikisiteConfig.properties.componentName, AlloyFenikisiteConfig.properties.componentAmount);
	public static ItemCore dustTinyUltimite = (ItemCore) new ItemCore("dust_tiny_ultimite", _ConfigValues.ultimiteValues, "dustTiny", true, AlloyUltimiteConfig.properties.componentName, AlloyUltimiteConfig.properties.componentAmount);
	public static ItemCore dustTinyStrootite = (ItemCore) new ItemCore("dust_tiny_strootite", _ConfigValues.strootiteValues, "dustTiny", true, AlloyStrootiteConfig.properties.componentName, AlloyStrootiteConfig.properties.componentAmount);
	public static ItemCore dustTinySpeedoi = (ItemCore) new ItemCore("dust_tiny_speedoi", _ConfigValues.speedoiValues, "dustTiny", true, AlloySpeedoiConfig.properties.componentName, AlloySpeedoiConfig.properties.componentAmount);
	public static ItemCore dustTinyLegenite = (ItemCore) new ItemCore("dust_tiny_legenite", _ConfigValues.legeniteValues, "dustTiny", true, AlloyLegeniteConfig.properties.componentName, AlloyLegeniteConfig.properties.componentAmount);
	public static ItemCore dustTinyCoal = (ItemCore) new ItemCore("dust_tiny_coal", _ConfigValues.coalValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyIron = (ItemCore) new ItemCore("dust_tiny_iron", _ConfigValues.ironValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyGold = (ItemCore) new ItemCore("dust_tiny_gold", _ConfigValues.goldValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyDiamond = (ItemCore) new ItemCore("dust_tiny_diamond", _ConfigValues.diamondValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyLapisLazuli = (ItemCore) new ItemCore("dust_tiny_lapislazuli", _ConfigValues.lapisLazuliValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyEmerald = (ItemCore) new ItemCore("dust_tiny_emerald", _ConfigValues.emeraldValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyNetherQuartz = (ItemCore) new ItemCore("dust_tiny_netherquartz", _ConfigValues.netherQuartzValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyRedstone = (ItemCore) new ItemCore("dust_tiny_redstone", _ConfigValues.redstoneValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyLimestone = (ItemCore) new ItemCore("dust_tiny_limestone", _ConfigValues.limestoneValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyGraphite = (ItemCore) new ItemCore("dust_tiny_graphite", _ConfigValues.graphiteValues, "dustTiny", false, null, null);
	public static ItemCore dustTinyCalcite = (ItemCore) new ItemCore("dust_tiny_calcite", _ConfigValues.calciteValues, "dustTiny", false, null, null);
	
	public static ItemCore nuggetCopper = (ItemCore) new ItemCore("nugget_copper", _ConfigValues.copperValues, "nugget", false, null, null);
	public static ItemCore nuggetTin = (ItemCore) new ItemCore("nugget_tin", _ConfigValues.tinValues, "nugget", false, null, null);
	public static ItemCore nuggetZinc = (ItemCore) new ItemCore("nugget_zinc", _ConfigValues.zincValues, "nugget", false, null, null);
	public static ItemCore nuggetNickel = (ItemCore) new ItemCore("nugget_nickel", _ConfigValues.nickelValues, "nugget", false, null, null);
	public static ItemCore nuggetSilver = (ItemCore) new ItemCore("nugget_silver", _ConfigValues.silverValues, "nugget", false, null, null);
	public static ItemCore nuggetAluminium = (ItemCore) new ItemCore("nugget_aluminium", _ConfigValues.aluminiumValues, "nugget", false, null, null);
	public static ItemCore nuggetTitanium = (ItemCore) new ItemCore("nugget_titanium", _ConfigValues.titaniumValues, "nugget", false, null, null);
	public static ItemCore nuggetChromium = (ItemCore) new ItemCore("nugget_chromium", _ConfigValues.chromiumValues, "nugget", false, null, null);
	//Silicon = no
	public static ItemCore nuggetCobalt = (ItemCore) new ItemCore("nugget_cobalt", _ConfigValues.cobaltValues, "nugget", false, null, null);
	public static ItemCore nuggetTungsten = (ItemCore) new ItemCore("nugget_tungsten", _ConfigValues.tungstenValues, "nugget", false, null, null);
	public static ItemCore nuggetLead = (ItemCore) new ItemCore("nugget_lead", _ConfigValues.leadValues, "nugget", false, null, null);
	public static ItemCore nuggetPlatinum = (ItemCore) new ItemCore("nugget_platinum", _ConfigValues.platinumValues, "nugget", false, null, null);
	public static ItemCore nuggetLithium = (ItemCore) new ItemCore("nugget_lithium", _ConfigValues.lithiumValues, "nugget", false, null, null);
	public static ItemCore nuggetUranium = (ItemCore) new ItemCore("nugget_uranium", _ConfigValues.uraniumValues, "nugget", false, null, null);
	public static ItemCore nuggetPlutonium = (ItemCore) new ItemCore("nugget_plutonium", _ConfigValues.plutoniumValues, "nugget", false, null, null);
	public static ItemCore nuggetRuby = (ItemCore) new ItemCore("nugget_ruby", _ConfigValues.rubyValues, "nugget", false, null, null);
	public static ItemCore nuggetSapphire = (ItemCore) new ItemCore("nugget_sapphire", _ConfigValues.sapphireValues, "nugget", false, null, null);
	public static ItemCore nuggetAmethyst = (ItemCore) new ItemCore("nugget_amethyst", _ConfigValues.amethystValues, "nugget", false, null, null);
	public static ItemCore nuggetCrystal = (ItemCore) new ItemCore("nugget_crystal", _ConfigValues.crystalValues, "nugget", false, null, null);
	public static ItemCore nuggetMagnesium = (ItemCore) new ItemCore("nugget_magnesium", _ConfigValues.magnesiumValues, "nugget", false, null, null);
	//Phosphorus
	//Sulfur
	public static ItemCore nuggetSilvanite = (ItemCore) new ItemCore("nugget_silvanite", _ConfigValues.silvaniteValues, "nugget", false, null, null);
	public static ItemCore nuggetMercilite = (ItemCore) new ItemCore("nugget_mercilite", _ConfigValues.merciliteValues, "nugget", false, null, null);
	public static ItemCore nuggetMythian = (ItemCore) new ItemCore("nugget_mythian", _ConfigValues.mythianValues, "nugget", false, null, null);
	public static ItemCore nuggetDragite = (ItemCore) new ItemCore("nugget_dragite", _ConfigValues.dragiteValues, "nugget", false, null, null);
	public static ItemCore nuggetFlarite = (ItemCore) new ItemCore("nugget_flarite", _ConfigValues.flariteValues, "nugget", false, null, null);
	public static ItemCore nuggetFurenium = (ItemCore) new ItemCore("nugget_furenium", _ConfigValues.fureniumValues, "nugget", false, null, null);
	//Blackstone
	//Bluestone
	//Purplestone
	public static ItemCore nuggetBronze = (ItemCore) new ItemCore("nugget_bronze", _ConfigValues.bronzeValues, "nugget", true, AlloyBronzeConfig.properties.componentName, AlloyBronzeConfig.properties.componentAmount);
	public static ItemCore nuggetCupronickel = (ItemCore) new ItemCore("nugget_cupronickel", _ConfigValues.cupronickelValues, "nugget", true, AlloyCupronickelConfig.properties.componentName, AlloyBronzeConfig.properties.componentAmount);
	public static ItemCore nuggetBrass = (ItemCore) new ItemCore("nugget_brass", _ConfigValues.brassValues, "nugget", true, AlloyBrassConfig.properties.componentName, AlloyBrassConfig.properties.componentAmount);
	public static ItemCore nuggetRosegold = (ItemCore) new ItemCore("nugget_rosegold", _ConfigValues.rosegoldValues, "nugget", true, AlloyRoseGoldConfig.properties.componentName, AlloyRoseGoldConfig.properties.componentAmount);
	public static ItemCore nuggetSteel = (ItemCore) new ItemCore("nugget_steel", _ConfigValues.steelValues, "nugget", true, AlloySteelConfig.properties.componentName, AlloySteelConfig.properties.componentAmount);
	public static ItemCore nuggetStainlesssteel = (ItemCore) new ItemCore("nugget_stainlesssteel", _ConfigValues.stainlesssteelValues, "nugget", true, AlloyStainlessSteelConfig.properties.componentName, AlloyStainlessSteelConfig.properties.componentAmount);
	public static ItemCore nuggetNichrome = (ItemCore) new ItemCore("nugget_nichrome", _ConfigValues.nichromeValues, "nugget", true, AlloyNichromeConfig.properties.componentName, AlloyNichromeConfig.properties.componentAmount);
	public static ItemCore nuggetElectrum = (ItemCore) new ItemCore("nugget_electrum", _ConfigValues.electrumValues, "nugget", true, AlloyElectrumConfig.properties.componentName, AlloyElectrumConfig.properties.componentAmount);
	public static ItemCore nuggetStellite = (ItemCore) new ItemCore("nugget_stellite", _ConfigValues.stelliteValues, "nugget", true, AlloyStelliteConfig.properties.componentName, AlloyStelliteConfig.properties.componentAmount);
	public static ItemCore nuggetSilvamer = (ItemCore) new ItemCore("nugget_silvamer", _ConfigValues.silvamerValues, "nugget", true, AlloySilvamerConfig.properties.componentName, AlloySilvamerConfig.properties.componentAmount);
	public static ItemCore nuggetUnium = (ItemCore) new ItemCore("nugget_unium", _ConfigValues.uniumValues, "nugget", true, AlloyUniumConfig.properties.componentName, AlloyUniumConfig.properties.componentAmount);
	public static ItemCore nuggetFenikisite = (ItemCore) new ItemCore("nugget_fenikisite", _ConfigValues.fenikisiteValues, "nugget", true, AlloyFenikisiteConfig.properties.componentName, AlloyFenikisiteConfig.properties.componentAmount);
	public static ItemCore nuggetUltimite = (ItemCore) new ItemCore("nugget_ultimite", _ConfigValues.ultimiteValues, "nugget", true, AlloyUltimiteConfig.properties.componentName, AlloyUltimiteConfig.properties.componentAmount);
	public static ItemCore nuggetStrootite = (ItemCore) new ItemCore("nugget_strootite", _ConfigValues.strootiteValues, "nugget", true, AlloyStrootiteConfig.properties.componentName, AlloyStrootiteConfig.properties.componentAmount);
	public static ItemCore nuggetSpeedoi = (ItemCore) new ItemCore("nugget_speedoi", _ConfigValues.speedoiValues, "nugget", true, AlloySpeedoiConfig.properties.componentName, AlloySpeedoiConfig.properties.componentAmount);
	public static ItemCore nuggetLegenite = (ItemCore) new ItemCore("nugget_legenite", _ConfigValues.legeniteValues, "nugget", true, AlloyLegeniteConfig.properties.componentName, AlloyLegeniteConfig.properties.componentAmount);
	//Coal
	public static ItemCore nuggetIron = (ItemCore) new ItemCore("nugget_iron", _ConfigValues.ironValues, "nugget", false, null, null);
	//Gold
	public static ItemCore nuggetDiamond = (ItemCore) new ItemCore("nugget_diamond", _ConfigValues.diamondValues, "nugget", false, null, null);
	//Lapis
	//Redstone
	public static ItemCore nuggetEmerald = (ItemCore) new ItemCore("nugget_emerald", _ConfigValues.emeraldValues, "nugget", false, null, null);
	public static ItemCore nuggetNetherQuartz = (ItemCore) new ItemCore("nugget_netherquartz", _ConfigValues.netherQuartzValues, "nugget", false, null, null);
	
	public static ItemCore oreCopper = (ItemCore) new ItemCore("ore_copper", _ConfigValues.copperValues, "ore", false, null, null);
	public static ItemCore oreTin = (ItemCore) new ItemCore("ore_tin", _ConfigValues.tinValues, "ore", false, null, null);
	public static ItemCore oreZinc = (ItemCore) new ItemCore("ore_zinc", _ConfigValues.zincValues, "ore", false, null, null);
	public static ItemCore oreNickel = (ItemCore) new ItemCore("ore_nickel", _ConfigValues.nickelValues, "ore", false, null, null);
	public static ItemCore oreSilver = (ItemCore) new ItemCore("ore_silver", _ConfigValues.silverValues, "ore", false, null, null);
	public static ItemCore oreAluminium = (ItemCore) new ItemCore("ore_aluminium", _ConfigValues.aluminiumValues, "ore", false, null, null);
	public static ItemCore oreTitanium = (ItemCore) new ItemCore("ore_titanium", _ConfigValues.titaniumValues, "ore", false, null, null);
	public static ItemCore oreChromium = (ItemCore) new ItemCore("ore_chromium", _ConfigValues.chromiumValues, "ore", false, null, null);
	public static ItemCore oreSilicon = (ItemCore) new ItemCore("ore_silicon", _ConfigValues.siliconValues, "ore", false, null, null);
	public static ItemCore oreCobalt = (ItemCore) new ItemCore("ore_cobalt", _ConfigValues.cobaltValues, "ore", false, null, null);
	public static ItemCore oreTungsten = (ItemCore) new ItemCore("ore_tungsten", _ConfigValues.tungstenValues, "ore", false, null, null);
	public static ItemCore oreLead = (ItemCore) new ItemCore("ore_lead", _ConfigValues.leadValues, "ore", false, null, null);
	public static ItemCore orePlatinum = (ItemCore) new ItemCore("ore_platinum", _ConfigValues.platinumValues, "ore", false, null, null);
	public static ItemCore oreLithium = (ItemCore) new ItemCore("ore_lithium", _ConfigValues.lithiumValues, "ore", false, null, null);
	public static ItemCore oreUranium = (ItemCore) new ItemCore("ore_uranium", _ConfigValues.uraniumValues, "ore", false, null, null);
	public static ItemCore orePlutonium = (ItemCore) new ItemCore("ore_plutonium", _ConfigValues.plutoniumValues, "ore", false, null, null);
	public static ItemCore oreRuby = (ItemCore) new ItemCore("ore_ruby", _ConfigValues.rubyValues, "ore", false, null, null);
	public static ItemCore oreSapphire = (ItemCore) new ItemCore("ore_sapphire", _ConfigValues.sapphireValues, "ore", false, null, null);
	public static ItemCore oreAmethyst = (ItemCore) new ItemCore("ore_amethyst", _ConfigValues.amethystValues, "ore", false, null, null);
	public static ItemCore oreCrystal = (ItemCore) new ItemCore("ore_crystal", _ConfigValues.crystalValues, "ore", false, null, null);
	public static ItemCore oreMagnesium = (ItemCore) new ItemCore("ore_magnesium", _ConfigValues.magnesiumValues, "ore", false, null, null);
	public static ItemCore orePhosphorus = (ItemCore) new ItemCore("ore_phosphorus", _ConfigValues.phosphorusValues, "ore", false, null, null);
	public static ItemCore oreSulfur = (ItemCore) new ItemCore("ore_sulfur", _ConfigValues.sulfurValues, "ore", false, null, null);
	public static ItemCore oreSilvanite = (ItemCore) new ItemCore("ore_silvanite", _ConfigValues.silvaniteValues, "ore", false, null, null);
	public static ItemCore oreMercilite = (ItemCore) new ItemCore("ore_mercilite", _ConfigValues.merciliteValues, "ore", false, null, null);
	public static ItemCore oreMythian = (ItemCore) new ItemCore("ore_mythian", _ConfigValues.mythianValues, "ore", false, null, null);
	public static ItemCore oreDragite = (ItemCore) new ItemCore("ore_dragite", _ConfigValues.dragiteValues, "ore", false, null, null);
	public static ItemCore oreFlarite = (ItemCore) new ItemCore("ore_flarite", _ConfigValues.flariteValues, "ore", false, null, null);
	public static ItemCore oreFurenium = (ItemCore) new ItemCore("ore_furenium", _ConfigValues.fureniumValues, "ore", false, null, null);
	public static ItemCore oreBlackstone = (ItemCore) new ItemCore("ore_blackstone", _ConfigValues.blackstoneValues, "ore", false, null, null);
	public static ItemCore oreBluestone = (ItemCore) new ItemCore("ore_bluestone", _ConfigValues.bluestoneValues, "ore", false, null, null);
	public static ItemCore orePurplestone = (ItemCore) new ItemCore("ore_purplestone", _ConfigValues.purplestoneValues, "ore", false, null, null);
	public static ItemCore oreCoal = (ItemCore) new ItemCore("ore_coal", _ConfigValues.coalValues, "ore", false, null, null);
	public static ItemCore oreIron = (ItemCore) new ItemCore("ore_iron", _ConfigValues.ironValues, "ore", false, null, null);
	public static ItemCore oreGold = (ItemCore) new ItemCore("ore_gold", _ConfigValues.goldValues, "ore", false, null, null);
	public static ItemCore oreDiamond = (ItemCore) new ItemCore("ore_diamond", _ConfigValues.diamondValues, "ore", false, null, null);
	public static ItemCore oreLapisLazuli = (ItemCore) new ItemCore("ore_lapislazuli", _ConfigValues.lapisLazuliValues, "ore", false, null, null);
	public static ItemCore oreRedstone = (ItemCore) new ItemCore("ore_redstone", _ConfigValues.redstoneValues, "ore", false, null, null);
	public static ItemCore oreEmerald = (ItemCore) new ItemCore("ore_emerald", _ConfigValues.emeraldValues, "ore", false, null, null);
	public static ItemCore oreNetherQuartz = (ItemCore) new ItemCore("ore_netherquartz", _ConfigValues.netherQuartzValues, "ore", false, null, null);
	
	public static ItemCore ingotCopper = (ItemCore) new ItemCore("ingot_copper", _ConfigValues.copperValues, "ingot", false, null, null);
	public static ItemCore ingotTin = (ItemCore) new ItemCore("ingot_tin", _ConfigValues.tinValues, "ingot", false, null, null);
	public static ItemCore ingotZinc = (ItemCore) new ItemCore("ingot_zinc", _ConfigValues.zincValues, "ingot", false, null, null);
	public static ItemCore ingotNickel = (ItemCore) new ItemCore("ingot_nickel", _ConfigValues.nickelValues, "ingot", false, null, null);
	public static ItemCore ingotSilver = (ItemCore) new ItemCore("ingot_silver", _ConfigValues.silverValues, "ingot", false, null, null);
	public static ItemCore ingotAluminium = (ItemCore) new ItemCore("ingot_aluminium", _ConfigValues.aluminiumValues, "ingot", false, null, null);
	public static ItemCore ingotTitanium = (ItemCore) new ItemCore("ingot_titanium", _ConfigValues.titaniumValues, "ingot", false, null, null);
	public static ItemCore ingotChromium = (ItemCore) new ItemCore("ingot_chromium", _ConfigValues.chromiumValues, "ingot", false, null, null);
	public static ItemCore ingotSilicon = (ItemCore) new ItemCore("ingot_silicon", _ConfigValues.siliconValues, "ingot", false, null, null);
	public static ItemCore ingotCobalt = (ItemCore) new ItemCore("ingot_cobalt", _ConfigValues.cobaltValues, "ingot", false, null, null);
	public static ItemCore ingotTungsten = (ItemCore) new ItemCore("ingot_tungsten", _ConfigValues.tungstenValues, "ingot", false, null, null);
	public static ItemCore ingotLead = (ItemCore) new ItemCore("ingot_lead", _ConfigValues.leadValues, "ingot", false, null, null);
	public static ItemCore ingotPlatinum = (ItemCore) new ItemCore("ingot_platinum", _ConfigValues.platinumValues, "ingot", false, null, null);
	public static ItemCore ingotLithium = (ItemCore) new ItemCore("ingot_lithium", _ConfigValues.lithiumValues, "ingot", false, null, null);
	public static ItemCore ingotUranium = (ItemCore) new ItemCore("ingot_uranium", _ConfigValues.uraniumValues, "ingot", false, null, null);
	public static ItemCore ingotPlutonium = (ItemCore) new ItemCore("ingot_plutonium", _ConfigValues.plutoniumValues, "ingot", false, null, null);
	public static ItemCore ingotMagnesium = (ItemCore) new ItemCore("ingot_magnesium", _ConfigValues.magnesiumValues, "ingot", false, null, null);
	public static ItemCore ingotSulfur = (ItemCore) new ItemCore("ingot_sulfur", _ConfigValues.sulfurValues, "ingot", false, null, null);
	public static ItemCore ingotSilvanite = (ItemCore) new ItemCore("ingot_silvanite", _ConfigValues.silvaniteValues, "ingot", false, null, null);
	public static ItemCore ingotMercilite = (ItemCore) new ItemCore("ingot_mercilite", _ConfigValues.merciliteValues, "ingot", false, null, null);
	public static ItemCore ingotMythian = (ItemCore) new ItemCore("ingot_mythian", _ConfigValues.mythianValues, "ingot", false, null, null);
	public static ItemCore ingotDragite = (ItemCore) new ItemCore("ingot_dragite", _ConfigValues.dragiteValues, "ingot", false, null, null);
	public static ItemCore ingotFlarite = (ItemCore) new ItemCore("ingot_flarite", _ConfigValues.flariteValues, "ingot", false, null, null);
	public static ItemCore ingotFurenium = (ItemCore) new ItemCore("ingot_furenium", _ConfigValues.fureniumValues, "ingot", false, null, null);
	public static ItemCore ingotBlackstone = (ItemCore) new ItemCore("ingot_blackstone", _ConfigValues.blackstoneValues, "ingot", false, null, null);
	public static ItemCore ingotBluestone = (ItemCore) new ItemCore("ingot_bluestone", _ConfigValues.bluestoneValues, "ingot", false, null, null);
	public static ItemCore ingotPurplestone = (ItemCore) new ItemCore("ingot_purplestone", _ConfigValues.purplestoneValues, "ingot", false, null, null);
	public static ItemCore ingotBronze = (ItemCore) new ItemCore("ingot_bronze", _ConfigValues.bronzeValues, "ingot", true, AlloyBronzeConfig.properties.componentName, AlloyBronzeConfig.properties.componentAmount);
	public static ItemCore ingotCupronickel = (ItemCore) new ItemCore("ingot_cupronickel", _ConfigValues.cupronickelValues, "ingot", true, AlloyCupronickelConfig.properties.componentName, AlloyBronzeConfig.properties.componentAmount);
	public static ItemCore ingotBrass = (ItemCore) new ItemCore("ingot_brass", _ConfigValues.brassValues, "ingot", true, AlloyBrassConfig.properties.componentName, AlloyBrassConfig.properties.componentAmount);
	public static ItemCore ingotRosegold = (ItemCore) new ItemCore("ingot_rosegold", _ConfigValues.rosegoldValues, "ingot", true, AlloyRoseGoldConfig.properties.componentName, AlloyRoseGoldConfig.properties.componentAmount);
	public static ItemCore ingotSteel = (ItemCore) new ItemCore("ingot_steel", _ConfigValues.steelValues, "ingot", true, AlloySteelConfig.properties.componentName, AlloySteelConfig.properties.componentAmount);
	public static ItemCore ingotStainlesssteel = (ItemCore) new ItemCore("ingot_stainlesssteel", _ConfigValues.stainlesssteelValues, "ingot", true, AlloyStainlessSteelConfig.properties.componentName, AlloyStainlessSteelConfig.properties.componentAmount);
	public static ItemCore ingotNichrome = (ItemCore) new ItemCore("ingot_nichrome", _ConfigValues.nichromeValues, "ingot", true, AlloyNichromeConfig.properties.componentName, AlloyNichromeConfig.properties.componentAmount);
	public static ItemCore ingotElectrum = (ItemCore) new ItemCore("ingot_electrum", _ConfigValues.electrumValues, "ingot", true, AlloyElectrumConfig.properties.componentName, AlloyElectrumConfig.properties.componentAmount);
	public static ItemCore ingotStellite = (ItemCore) new ItemCore("ingot_stellite", _ConfigValues.stelliteValues, "ingot", true, AlloyStelliteConfig.properties.componentName, AlloyStelliteConfig.properties.componentAmount);
	public static ItemCore ingotSilvamer = (ItemCore) new ItemCore("ingot_silvamer", _ConfigValues.silvamerValues, "ingot", true, AlloySilvamerConfig.properties.componentName, AlloySilvamerConfig.properties.componentAmount);
	public static ItemCore ingotUnium = (ItemCore) new ItemCore("ingot_unium", _ConfigValues.uniumValues, "ingot", true, AlloyUniumConfig.properties.componentName, AlloyUniumConfig.properties.componentAmount);
	public static ItemCore ingotFenikisite = (ItemCore) new ItemCore("ingot_fenikisite", _ConfigValues.fenikisiteValues, "ingot", true, AlloyFenikisiteConfig.properties.componentName, AlloyFenikisiteConfig.properties.componentAmount);
	public static ItemCore ingotUltimite = (ItemCore) new ItemCore("ingot_ultimite", _ConfigValues.ultimiteValues, "ingot", true, AlloyUltimiteConfig.properties.componentName, AlloyUltimiteConfig.properties.componentAmount);
	public static ItemCore ingotStrootite = (ItemCore) new ItemCore("ingot_strootite", _ConfigValues.strootiteValues, "ingot", true, AlloyStrootiteConfig.properties.componentName, AlloyStrootiteConfig.properties.componentAmount);
	public static ItemCore ingotSpeedoi = (ItemCore) new ItemCore("ingot_speedoi", _ConfigValues.speedoiValues, "ingot", true, AlloySpeedoiConfig.properties.componentName, AlloySpeedoiConfig.properties.componentAmount);
	public static ItemCore ingotLegenite = (ItemCore) new ItemCore("ingot_legenite", _ConfigValues.legeniteValues, "ingot", true, AlloyLegeniteConfig.properties.componentName, AlloyLegeniteConfig.properties.componentAmount);
	public static ItemCore ingotRedstone = (ItemCore) new ItemCore("ingot_redstone", _ConfigValues.redstoneValues, "ingot", false, null, null);
	
	public static ItemCore gemRuby = (ItemCore) new ItemCore("gem_ruby", _ConfigValues.rubyValues, "gem", false, null, null);
	public static ItemCore gemSapphire = (ItemCore) new ItemCore("gem_sapphire", _ConfigValues.sapphireValues, "gem", false, null, null);
	public static ItemCore gemAmethyst = (ItemCore) new ItemCore("gem_amethyst", _ConfigValues.amethystValues, "gem", false, null, null);
	public static ItemCore gemCrystal = (ItemCore) new ItemCore("gem_crystal", _ConfigValues.crystalValues, "gem", false, null, null);
	
	public static ItemCore[] itemArray = new ItemCore[]{
			dustCopper, dustTin, dustZinc, dustNickel, dustSilver, dustAluminium, dustTitanium, dustChromium,
			dustSilicon, dustCobalt, dustTungsten, dustLead, dustPlatinum, dustLithium, dustUranium, dustPlutonium,
			dustRuby, dustSapphire, dustAmethyst, dustCrystal, dustMagnesium, dustPhosphorus, dustSulfur, dustSilvanite,
			dustMercilite, dustMythian, dustDragite, dustFlarite, dustFurenium, dustBlackstone, dustBluestone, dustPurplestone,
			dustBronze, dustCupronickel, dustBrass, dustRosegold, dustSteel, dustStainlesssteel, dustNichrome, dustElectrum,
			dustStellite, dustSilvamer, dustUnium, dustFenikisite, dustUltimite, dustStrootite, dustSpeedoi, dustLegenite,
			dustCoal, dustIron, dustGold, dustDiamond, dustLapisLazuli, dustEmerald, dustNetherQuartz,
			dustLimestone, dustGraphite, dustCalcite,
			
			dustImpureCopper, dustImpureTin, dustImpureZinc, dustImpureNickel, dustImpureSilver, dustImpureAluminium, dustImpureTitanium, dustImpureChromium,
			dustImpureSilicon, dustImpureCobalt, dustImpureTungsten, dustImpureLead, dustImpurePlatinum, dustImpureLithium, dustImpureUranium, dustImpurePlutonium,
			dustImpureRuby, dustImpureSapphire, dustImpureAmethyst, dustImpureCrystal, dustImpureMagnesium, dustImpurePhosphorus, dustImpureSulfur, dustImpureSilvanite,
			dustImpureMercilite, dustImpureMythian, dustImpureDragite, dustImpureFlarite, dustImpureFurenium, dustImpureBlackstone, dustImpureBluestone, dustImpurePurplestone,
			dustImpureCoal, dustImpureIron, dustImpureGold, dustImpureDiamond, dustImpureLapisLazuli, dustImpureRedstone, dustImpureEmerald, dustImpureNetherQuartz,
			
			dustTinyCopper, dustTinyTin, dustTinyZinc, dustTinyNickel, dustTinySilver, dustTinyAluminium, dustTinyTitanium, dustTinyChromium, 
			dustTinySilicon, dustTinyCobalt, dustTinyTungsten, dustTinyLead, dustTinyPlatinum, dustTinyLithium, dustTinyUranium, dustTinyPlutonium,
			dustTinyRuby, dustTinySapphire, dustTinyAmethyst, dustTinyCrystal, dustTinyMagnesium, dustTinyPhosphorus, dustTinySulfur, dustTinySilvanite,
			dustTinyMercilite, dustTinyMythian, dustTinyDragite, dustTinyFlarite, dustTinyFurenium, dustTinyBlackstone, dustTinyBluestone, 	dustTinyPurplestone,
			dustTinyBronze, dustTinyCupronickel, dustTinyBrass, dustTinyRosegold, dustTinySteel, dustTinyStainlesssteel, dustTinyNichrome, dustTinyElectrum,
			dustTinyStellite, dustTinySilvamer, dustTinyUnium, dustTinyFenikisite, dustTinyUltimite, dustTinyStrootite, dustTinySpeedoi, dustTinyLegenite,
			dustTinyCoal, dustTinyIron, dustTinyGold, dustTinyDiamond, dustTinyLapisLazuli, dustTinyRedstone, dustTinyEmerald, dustTinyNetherQuartz,
			dustTinyLimestone, dustTinyGraphite, dustTinyCalcite,
			
			nuggetCopper, nuggetTin, nuggetZinc, nuggetNickel, nuggetSilver, nuggetAluminium, nuggetTitanium, nuggetChromium,
			nuggetCobalt, nuggetTungsten, nuggetLead, nuggetPlatinum, nuggetLithium, nuggetUranium, nuggetPlutonium,
			nuggetRuby, nuggetSapphire, nuggetAmethyst, nuggetCrystal, nuggetMagnesium, nuggetSilvanite,
			nuggetMercilite, nuggetMythian, nuggetDragite, nuggetFlarite, nuggetFurenium,
			nuggetBronze, nuggetCupronickel, nuggetBrass, nuggetRosegold, nuggetSteel, nuggetStainlesssteel, nuggetNichrome, nuggetElectrum,
			nuggetStellite, nuggetSilvamer, nuggetUnium, nuggetFenikisite, nuggetUltimite, nuggetStrootite, nuggetSpeedoi, nuggetLegenite,
			nuggetIron, nuggetDiamond, nuggetEmerald, nuggetNetherQuartz,
			
			oreCopper, oreTin, oreZinc, oreNickel, oreSilver, oreAluminium, oreTitanium, oreChromium, 
			oreSilicon, oreCobalt, oreTungsten, oreLead, orePlatinum, oreLithium, oreUranium, orePlutonium,
			oreRuby, oreSapphire, oreAmethyst, oreCrystal, oreMagnesium, orePhosphorus, oreSulfur, oreSilvanite,
			oreMercilite, oreMythian, oreDragite, oreFlarite, oreFurenium, oreBlackstone, oreBluestone, orePurplestone,
			oreCoal, oreIron, oreGold, oreDiamond, oreLapisLazuli, oreRedstone, oreEmerald,
			
			ingotCopper, ingotTin, ingotZinc, ingotNickel, ingotSilver, ingotAluminium, ingotTitanium, ingotChromium,
			ingotSilicon, ingotCobalt, ingotTungsten, ingotLead, ingotPlatinum, ingotLithium, ingotUranium, ingotPlutonium,
			ingotMagnesium, ingotSulfur, ingotSilvanite,
			ingotMercilite, ingotMythian, ingotDragite, ingotFlarite, ingotFurenium, ingotBlackstone, ingotBluestone, ingotPurplestone,
			ingotBronze, ingotCupronickel, ingotBrass, ingotRosegold, ingotSteel, ingotStainlesssteel, ingotNichrome, ingotElectrum,
			ingotStellite, ingotSilvamer, ingotUnium, ingotFenikisite, ingotUltimite, ingotStrootite, ingotSpeedoi, ingotLegenite,
			ingotRedstone,
			
			gemRuby, gemSapphire, gemAmethyst, gemCrystal,
		};
	
	public static void register(IForgeRegistry<Item> registry) {
		for (int i = 0; i< itemArray.length; i++) {
			ItemCore item = itemArray[i];
			registry.register(item);
		}
	}
	
	public static void registerModels() {
		for (int i = 0; i < itemArray.length; i++) {
			ItemCore item = itemArray[i];
			item.registerItemModel();
		}
	}

}
