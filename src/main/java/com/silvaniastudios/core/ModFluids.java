package com.silvaniastudios.core;

import java.awt.Color;

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
import com.silvaniastudios.core.config.AluminiumConfig;
import com.silvaniastudios.core.config.AmethystConfig;
import com.silvaniastudios.core.config.BlackstoneConfig;
import com.silvaniastudios.core.config.BluestoneConfig;
import com.silvaniastudios.core.config.ChromiumConfig;
import com.silvaniastudios.core.config.CobaltConfig;
import com.silvaniastudios.core.config.CopperConfig;
import com.silvaniastudios.core.config.CrystalConfig;
import com.silvaniastudios.core.config.DragiteConfig;
import com.silvaniastudios.core.config.FlariteConfig;
import com.silvaniastudios.core.config.FureniumConfig;
import com.silvaniastudios.core.config.LeadConfig;
import com.silvaniastudios.core.config.LithiumConfig;
import com.silvaniastudios.core.config.MagnesiumConfig;
import com.silvaniastudios.core.config.MerciliteConfig;
import com.silvaniastudios.core.config.MythianConfig;
import com.silvaniastudios.core.config.NickelConfig;
import com.silvaniastudios.core.config.PhosphorusConfig;
import com.silvaniastudios.core.config.PlatinumConfig;
import com.silvaniastudios.core.config.PlutoniumConfig;
import com.silvaniastudios.core.config.PurplestoneConfig;
import com.silvaniastudios.core.config.RubyConfig;
import com.silvaniastudios.core.config.SapphireConfig;
import com.silvaniastudios.core.config.SiliconConfig;
import com.silvaniastudios.core.config.SilvaniteConfig;
import com.silvaniastudios.core.config.SilverConfig;
import com.silvaniastudios.core.config.SulfurConfig;
import com.silvaniastudios.core.config.TinConfig;
import com.silvaniastudios.core.config.TitaniumConfig;
import com.silvaniastudios.core.config.TungstenConfig;
import com.silvaniastudios.core.config.UraniumConfig;
import com.silvaniastudios.core.config.VanillaCoalConfig;
import com.silvaniastudios.core.config.VanillaDiamondConfig;
import com.silvaniastudios.core.config.VanillaEmeraldConfig;
import com.silvaniastudios.core.config.VanillaGoldConfig;
import com.silvaniastudios.core.config.VanillaIronConfig;
import com.silvaniastudios.core.config.VanillaLapisLazuliConfig;
import com.silvaniastudios.core.config.VanillaNetherQuartzConfig;
import com.silvaniastudios.core.config.VanillaRedstoneConfig;
import com.silvaniastudios.core.config.ZincConfig;
import com.silvaniastudios.core.config._COreConfig;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids {
	
	public static final Fluid fluidSolarium = new Fluid("fluid_solarium", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(12).setViscosity(25000).setTemperature(_COreConfig.tcon.solariumTemperature).setColor(new Color(255, 217, 0));
	
	public static final Fluid fluidCopper = new Fluid("fluid_copper", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(CopperConfig.properties.meltingPoint).setColor(new Color(CopperConfig.properties.colour_r, CopperConfig.properties.colour_g, CopperConfig.properties.colour_b));
	public static final Fluid fluidTin = new Fluid("fluid_tin", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(TinConfig.properties.meltingPoint).setColor(new Color(TinConfig.properties.colour_r, TinConfig.properties.colour_g, TinConfig.properties.colour_b));
	public static final Fluid fluidZinc = new Fluid("fluid_zinc", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(ZincConfig.properties.meltingPoint).setColor(new Color(ZincConfig.properties.colour_r, ZincConfig.properties.colour_g, ZincConfig.properties.colour_b));
	public static final Fluid fluidNickel = new Fluid("fluid_nickel", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(NickelConfig.properties.meltingPoint).setColor(new Color(NickelConfig.properties.colour_r, NickelConfig.properties.colour_g, NickelConfig.properties.colour_b));
	public static final Fluid fluidSilver = new Fluid("fluid_silver", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(SilverConfig.properties.meltingPoint).setColor(new Color(SilverConfig.properties.colour_r, SilverConfig.properties.colour_g, SilverConfig.properties.colour_b));
	public static final Fluid fluidAluminium = new Fluid("fluid_aluminium", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AluminiumConfig.properties.meltingPoint).setColor(new Color(AluminiumConfig.properties.colour_r, AluminiumConfig.properties.colour_g, AluminiumConfig.properties.colour_b));
	public static final Fluid fluidTitanium = new Fluid("fluid_titanium", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(TitaniumConfig.properties.meltingPoint).setColor(new Color(TitaniumConfig.properties.colour_r, TitaniumConfig.properties.colour_g, TitaniumConfig.properties.colour_b));
	public static final Fluid fluidChromium = new Fluid("fluid_chromium", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(ChromiumConfig.properties.meltingPoint).setColor(new Color(ChromiumConfig.properties.colour_r, ChromiumConfig.properties.colour_g, ChromiumConfig.properties.colour_b));
	public static final Fluid fluidSilicon = new Fluid("fluid_silicon", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(SiliconConfig.properties.meltingPoint).setColor(new Color(SiliconConfig.properties.colour_r, SiliconConfig.properties.colour_g, SiliconConfig.properties.colour_b));
	public static final Fluid fluidCobalt = new Fluid("fluid_cobalt", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(CobaltConfig.properties.meltingPoint).setColor(new Color(CobaltConfig.properties.colour_r, CobaltConfig.properties.colour_g, CobaltConfig.properties.colour_b));
	public static final Fluid fluidTungsten = new Fluid("fluid_tungsten", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(TungstenConfig.properties.meltingPoint).setColor(new Color(TungstenConfig.properties.colour_r, TungstenConfig.properties.colour_g, TungstenConfig.properties.colour_b));
	public static final Fluid fluidLead = new Fluid("fluid_lead", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(LeadConfig.properties.meltingPoint).setColor(new Color(LeadConfig.properties.colour_r, LeadConfig.properties.colour_g, LeadConfig.properties.colour_b));
	public static final Fluid fluidPlatinum = new Fluid("fluid_platinum", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(PlatinumConfig.properties.meltingPoint).setColor(new Color(PlatinumConfig.properties.colour_r, PlatinumConfig.properties.colour_g, PlatinumConfig.properties.colour_b));
	public static final Fluid fluidLithium = new Fluid("fluid_lithium", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(LithiumConfig.properties.meltingPoint).setColor(new Color(LithiumConfig.properties.colour_r, LithiumConfig.properties.colour_g, LithiumConfig.properties.colour_b));
	public static final Fluid fluidUranium = new Fluid("fluid_uranium", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(UraniumConfig.properties.meltingPoint).setColor(new Color(UraniumConfig.properties.colour_r, UraniumConfig.properties.colour_g, UraniumConfig.properties.colour_b));
	public static final Fluid fluidPlutonium = new Fluid("fluid_plutonium", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(PlutoniumConfig.properties.meltingPoint).setColor(new Color(PlutoniumConfig.properties.colour_r, PlutoniumConfig.properties.colour_g, PlutoniumConfig.properties.colour_b));
	
	public static final Fluid fluidRuby = new Fluid("fluid_ruby", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(RubyConfig.properties.meltingPoint).setColor(new Color(RubyConfig.properties.colour_r, RubyConfig.properties.colour_g, RubyConfig.properties.colour_b));
	public static final Fluid fluidSapphire = new Fluid("fluid_sapphire", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(SapphireConfig.properties.meltingPoint).setColor(new Color(SapphireConfig.properties.colour_r, SapphireConfig.properties.colour_g, SapphireConfig.properties.colour_b));
	public static final Fluid fluidAmethyst = new Fluid("fluid_amethyst", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AmethystConfig.properties.meltingPoint).setColor(new Color(AmethystConfig.properties.colour_r, AmethystConfig.properties.colour_g, AmethystConfig.properties.colour_b));
	public static final Fluid fluidCrystal = new Fluid("fluid_crystal", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(CrystalConfig.properties.meltingPoint).setColor(new Color(CrystalConfig.properties.colour_r, CrystalConfig.properties.colour_g, CrystalConfig.properties.colour_b));
	public static final Fluid fluidMagnesium = new Fluid("fluid_magnesium", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(MagnesiumConfig.properties.meltingPoint).setColor(new Color(MagnesiumConfig.properties.colour_r, MagnesiumConfig.properties.colour_g, MagnesiumConfig.properties.colour_b));
	public static final Fluid fluidPhosphorus = new Fluid("fluid_phosphorus", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(PhosphorusConfig.properties.meltingPoint).setColor(new Color(PhosphorusConfig.properties.colour_r, PhosphorusConfig.properties.colour_g, PhosphorusConfig.properties.colour_b));
	public static final Fluid fluidSulfur = new Fluid("fluid_sulfur", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(SulfurConfig.properties.meltingPoint).setColor(new Color(SulfurConfig.properties.colour_r, SulfurConfig.properties.colour_g, SulfurConfig.properties.colour_b));
	public static final Fluid fluidSilvanite = new Fluid("fluid_silvanite", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(SilvaniteConfig.properties.meltingPoint).setColor(new Color(SilvaniteConfig.properties.colour_r, SilvaniteConfig.properties.colour_g, SilvaniteConfig.properties.colour_b));
	public static final Fluid fluidMercilite = new Fluid("fluid_mercilite", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(MerciliteConfig.properties.meltingPoint).setColor(new Color(MerciliteConfig.properties.colour_r, MerciliteConfig.properties.colour_g, MerciliteConfig.properties.colour_b));
	public static final Fluid fluidMythian = new Fluid("fluid_mythian", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(MythianConfig.properties.meltingPoint).setColor(new Color(MythianConfig.properties.colour_r, MythianConfig.properties.colour_g, MythianConfig.properties.colour_b));
	public static final Fluid fluidDragite = new Fluid("fluid_dragite", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(DragiteConfig.properties.meltingPoint).setColor(new Color(DragiteConfig.properties.colour_r, DragiteConfig.properties.colour_g, DragiteConfig.properties.colour_b));
	public static final Fluid fluidFlarite = new Fluid("fluid_flarite", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(FlariteConfig.properties.meltingPoint).setColor(new Color(FlariteConfig.properties.colour_r, FlariteConfig.properties.colour_g, FlariteConfig.properties.colour_b));
	public static final Fluid fluidFurenium = new Fluid("fluid_furenium", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(FureniumConfig.properties.meltingPoint).setColor(new Color(FureniumConfig.properties.colour_r, FureniumConfig.properties.colour_g, FureniumConfig.properties.colour_b));
	public static final Fluid fluidBlackstone = new Fluid("fluid_blackstone", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(BlackstoneConfig.properties.meltingPoint).setColor(new Color(BlackstoneConfig.properties.colour_r, BlackstoneConfig.properties.colour_g, BlackstoneConfig.properties.colour_b));
	public static final Fluid fluidBluestone = new Fluid("fluid_bluestone", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(BluestoneConfig.properties.meltingPoint).setColor(new Color(BluestoneConfig.properties.colour_r, BluestoneConfig.properties.colour_g, BluestoneConfig.properties.colour_b));
	public static final Fluid fluidPurplestone = new Fluid("fluid_purplestone", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(PurplestoneConfig.properties.meltingPoint).setColor(new Color(PurplestoneConfig.properties.colour_r, PurplestoneConfig.properties.colour_g, PurplestoneConfig.properties.colour_b));
	
	public static final Fluid fluidBronze = new Fluid("fluid_bronze", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyBronzeConfig.properties.meltingPoint).setColor(new Color(AlloyBronzeConfig.properties.colour_r, AlloyBronzeConfig.properties.colour_g, AlloyBronzeConfig.properties.colour_b));
	public static final Fluid fluidCupronickel = new Fluid("fluid_cupronickel", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyCupronickelConfig.properties.meltingPoint).setColor(new Color(AlloyCupronickelConfig.properties.colour_r, AlloyCupronickelConfig.properties.colour_g, AlloyCupronickelConfig.properties.colour_b));
	public static final Fluid fluidBrass = new Fluid("fluid_brass", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyBrassConfig.properties.meltingPoint).setColor(new Color(AlloyBrassConfig.properties.colour_r, AlloyBrassConfig.properties.colour_g, AlloyBrassConfig .properties.colour_b));
	public static final Fluid fluidRoseGold = new Fluid("fluid_rosegold", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyRoseGoldConfig.properties.meltingPoint).setColor(new Color(AlloyRoseGoldConfig.properties.colour_r, AlloyRoseGoldConfig.properties.colour_g, AlloyRoseGoldConfig.properties.colour_b));
	public static final Fluid fluidSteel = new Fluid("fluid_steel", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloySteelConfig.properties.meltingPoint).setColor(new Color(AlloySteelConfig.properties.colour_r, AlloySteelConfig.properties.colour_g, AlloySteelConfig.properties.colour_b));
	public static final Fluid fluidStainlessSteel = new Fluid("fluid_stainlesssteel", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyStainlessSteelConfig.properties.meltingPoint).setColor(new Color(AlloyStainlessSteelConfig.properties.colour_r, AlloyStainlessSteelConfig.properties.colour_g, AlloyStainlessSteelConfig.properties.colour_b));
	public static final Fluid fluidNichrome = new Fluid("fluid_nichrome", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyNichromeConfig.properties.meltingPoint).setColor(new Color(AlloyNichromeConfig.properties.colour_r, AlloyNichromeConfig.properties.colour_g, AlloyNichromeConfig.properties.colour_b));
	public static final Fluid fluidElectrum = new Fluid("fluid_electrum", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyElectrumConfig.properties.meltingPoint).setColor(new Color(AlloyElectrumConfig.properties.colour_r, AlloyElectrumConfig.properties.colour_g, AlloyElectrumConfig.properties.colour_b));
	public static final Fluid fluidStellite = new Fluid("fluid_stellite", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyStelliteConfig.properties.meltingPoint).setColor(new Color(AlloyStelliteConfig.properties.colour_r, AlloyStelliteConfig.properties.colour_g, AlloyStelliteConfig.properties.colour_b));
	public static final Fluid fluidSilvamer = new Fluid("fluid_silvamer", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloySilvamerConfig.properties.meltingPoint).setColor(new Color(AlloySilvamerConfig.properties.colour_r, AlloySilvamerConfig.properties.colour_g, AlloySilvamerConfig.properties.colour_b));
	public static final Fluid fluidUnium = new Fluid("fluid_unium", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyUniumConfig.properties.meltingPoint).setColor(new Color(AlloyUniumConfig.properties.colour_r, AlloyUniumConfig.properties.colour_g, AlloyUniumConfig.properties.colour_b));
	public static final Fluid fluidFenikisite = new Fluid("fluid_fenikisite", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyFenikisiteConfig.properties.meltingPoint).setColor(new Color(AlloyFenikisiteConfig.properties.colour_r, AlloyFenikisiteConfig.properties.colour_g, AlloyFenikisiteConfig.properties.colour_b));
	public static final Fluid fluidUltimite = new Fluid("fluid_ultimite", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyUltimiteConfig.properties.meltingPoint).setColor(new Color(AlloyUltimiteConfig.properties.colour_r, AlloyUltimiteConfig.properties.colour_g, AlloyUltimiteConfig.properties.colour_b));
	public static final Fluid fluidStrootite = new Fluid("fluid_strootite", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyStrootiteConfig.properties.meltingPoint).setColor(new Color(AlloyStrootiteConfig.properties.colour_r, AlloyStrootiteConfig.properties.colour_g, AlloyStrootiteConfig.properties.colour_b));
	public static final Fluid fluidSpeedoi = new Fluid("fluid_speedoi", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloySpeedoiConfig.properties.meltingPoint).setColor(new Color(AlloySpeedoiConfig.properties.colour_r, AlloySpeedoiConfig.properties.colour_g, AlloySpeedoiConfig.properties.colour_b));
	public static final Fluid fluidLegenite = new Fluid("fluid_legenite", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(AlloyLegeniteConfig.properties.meltingPoint).setColor(new Color(AlloyLegeniteConfig.properties.colour_r, AlloyLegeniteConfig.properties.colour_g, AlloyLegeniteConfig.properties.colour_b));
	
	public static final Fluid fluidCoal = new Fluid("fluid_coal", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(VanillaCoalConfig.properties.meltingPoint).setColor(new Color(VanillaCoalConfig.properties.colour_r, VanillaCoalConfig.properties.colour_g, VanillaCoalConfig.properties.colour_b));
	public static final Fluid fluidIron = new Fluid("fluid_iron", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(VanillaIronConfig.properties.meltingPoint).setColor(new Color(VanillaIronConfig.properties.colour_r, VanillaIronConfig.properties.colour_g, VanillaIronConfig.properties.colour_b));
	public static final Fluid fluidGold = new Fluid("fluid_gold", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(VanillaGoldConfig.properties.meltingPoint).setColor(new Color(VanillaGoldConfig.properties.colour_r, VanillaGoldConfig.properties.colour_g, VanillaGoldConfig.properties.colour_b));
	public static final Fluid fluidDiamond = new Fluid("fluid_diamond", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(VanillaDiamondConfig.properties.meltingPoint).setColor(new Color(VanillaDiamondConfig.properties.colour_r, VanillaDiamondConfig.properties.colour_g, VanillaDiamondConfig.properties.colour_b));
	public static final Fluid fluidLapisLazuli = new Fluid("fluid_lapislazuli", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(VanillaLapisLazuliConfig.properties.meltingPoint).setColor(new Color(VanillaLapisLazuliConfig.properties.colour_r, VanillaLapisLazuliConfig.properties.colour_g, VanillaLapisLazuliConfig.properties.colour_b));
	public static final Fluid fluidRedstone = new Fluid("fluid_redstone", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(VanillaRedstoneConfig.properties.meltingPoint).setColor(new Color(VanillaRedstoneConfig.properties.colour_r, VanillaRedstoneConfig.properties.colour_g, VanillaRedstoneConfig.properties.colour_b));
	public static final Fluid fluidEmerald = new Fluid("fluid_emerald", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(VanillaEmeraldConfig.properties.meltingPoint).setColor(new Color(VanillaEmeraldConfig.properties.colour_r, VanillaEmeraldConfig.properties.colour_g, VanillaEmeraldConfig.properties.colour_b));
	public static final Fluid fluidNetherQuartz = new Fluid("fluid_netherquartz", new ResourceLocation(COre.MODID, "fluid_still"), new ResourceLocation(COre.MODID, "fluid_flowing")).setDensity(1000).setGaseous(false).setLuminosity(5).setViscosity(25000).setTemperature(VanillaNetherQuartzConfig.properties.meltingPoint).setColor(new Color(VanillaNetherQuartzConfig.properties.colour_r, VanillaNetherQuartzConfig.properties.colour_g, VanillaNetherQuartzConfig.properties.colour_b));
	
	public static void registerFluids() {
		FluidRegistry.registerFluid(fluidSolarium);
		
		FluidRegistry.registerFluid(fluidCopper);
		FluidRegistry.registerFluid(fluidTin);
		FluidRegistry.registerFluid(fluidZinc);
		FluidRegistry.registerFluid(fluidNickel);
		FluidRegistry.registerFluid(fluidSilver);
		FluidRegistry.registerFluid(fluidAluminium);
		FluidRegistry.registerFluid(fluidTitanium);
		FluidRegistry.registerFluid(fluidChromium);
		FluidRegistry.registerFluid(fluidSilicon);
		FluidRegistry.registerFluid(fluidCobalt);
		FluidRegistry.registerFluid(fluidTungsten);
		FluidRegistry.registerFluid(fluidLead);
		FluidRegistry.registerFluid(fluidPlatinum);
		FluidRegistry.registerFluid(fluidLithium);
		FluidRegistry.registerFluid(fluidUranium);
		FluidRegistry.registerFluid(fluidPlutonium);
		
		FluidRegistry.registerFluid(fluidRuby);
		FluidRegistry.registerFluid(fluidSapphire);
		FluidRegistry.registerFluid(fluidAmethyst);
		FluidRegistry.registerFluid(fluidCrystal);
		FluidRegistry.registerFluid(fluidMagnesium);
		FluidRegistry.registerFluid(fluidPhosphorus);
		FluidRegistry.registerFluid(fluidSulfur);
		FluidRegistry.registerFluid(fluidSilvanite);
		FluidRegistry.registerFluid(fluidMercilite);
		FluidRegistry.registerFluid(fluidMythian);
		FluidRegistry.registerFluid(fluidDragite);
		FluidRegistry.registerFluid(fluidFlarite);
		FluidRegistry.registerFluid(fluidFurenium);
		FluidRegistry.registerFluid(fluidBlackstone);
		FluidRegistry.registerFluid(fluidBluestone);
		FluidRegistry.registerFluid(fluidPurplestone);
		
		FluidRegistry.registerFluid(fluidBronze);
		FluidRegistry.registerFluid(fluidCupronickel);
		FluidRegistry.registerFluid(fluidBrass);
		FluidRegistry.registerFluid(fluidRoseGold);
		FluidRegistry.registerFluid(fluidSteel);
		FluidRegistry.registerFluid(fluidStainlessSteel);
		FluidRegistry.registerFluid(fluidNichrome);
		FluidRegistry.registerFluid(fluidElectrum);
		FluidRegistry.registerFluid(fluidStellite);
		FluidRegistry.registerFluid(fluidSilvamer);
		FluidRegistry.registerFluid(fluidUnium);
		FluidRegistry.registerFluid(fluidFenikisite);
		FluidRegistry.registerFluid(fluidUltimite);
		FluidRegistry.registerFluid(fluidStrootite);
		FluidRegistry.registerFluid(fluidSpeedoi);
		FluidRegistry.registerFluid(fluidLegenite);
		
		FluidRegistry.registerFluid(fluidCoal);
		FluidRegistry.registerFluid(fluidIron);
		FluidRegistry.registerFluid(fluidGold);
		FluidRegistry.registerFluid(fluidDiamond);
		FluidRegistry.registerFluid(fluidLapisLazuli);
		FluidRegistry.registerFluid(fluidRedstone);
		FluidRegistry.registerFluid(fluidEmerald);
		FluidRegistry.registerFluid(fluidNetherQuartz);
		
		FluidRegistry.addBucketForFluid(fluidSolarium);
		
		FluidRegistry.addBucketForFluid(fluidCopper);
		FluidRegistry.addBucketForFluid(fluidTin);
		FluidRegistry.addBucketForFluid(fluidZinc);
		FluidRegistry.addBucketForFluid(fluidNickel);
		FluidRegistry.addBucketForFluid(fluidSilver);
		FluidRegistry.addBucketForFluid(fluidAluminium);
		FluidRegistry.addBucketForFluid(fluidTitanium);
		FluidRegistry.addBucketForFluid(fluidChromium);
		FluidRegistry.addBucketForFluid(fluidSilicon);
		FluidRegistry.addBucketForFluid(fluidCobalt);
		FluidRegistry.addBucketForFluid(fluidTungsten);
		FluidRegistry.addBucketForFluid(fluidLead);
		FluidRegistry.addBucketForFluid(fluidPlatinum);
		FluidRegistry.addBucketForFluid(fluidLithium);
		FluidRegistry.addBucketForFluid(fluidUranium);
		FluidRegistry.addBucketForFluid(fluidPlutonium);
		
		FluidRegistry.addBucketForFluid(fluidRuby);
		FluidRegistry.addBucketForFluid(fluidSapphire);
		FluidRegistry.addBucketForFluid(fluidAmethyst);
		FluidRegistry.addBucketForFluid(fluidCrystal);
		FluidRegistry.addBucketForFluid(fluidMagnesium);
		FluidRegistry.addBucketForFluid(fluidPhosphorus);
		FluidRegistry.addBucketForFluid(fluidSulfur);
		FluidRegistry.addBucketForFluid(fluidSilvanite);
		FluidRegistry.addBucketForFluid(fluidMercilite);
		FluidRegistry.addBucketForFluid(fluidMythian);
		FluidRegistry.addBucketForFluid(fluidDragite);
		FluidRegistry.addBucketForFluid(fluidFlarite);
		FluidRegistry.addBucketForFluid(fluidFurenium);
		FluidRegistry.addBucketForFluid(fluidBlackstone);
		FluidRegistry.addBucketForFluid(fluidBluestone);
		FluidRegistry.addBucketForFluid(fluidPurplestone);
		
		FluidRegistry.addBucketForFluid(fluidBronze);
		FluidRegistry.addBucketForFluid(fluidCupronickel);
		FluidRegistry.addBucketForFluid(fluidBrass);
		FluidRegistry.addBucketForFluid(fluidRoseGold);
		FluidRegistry.addBucketForFluid(fluidSteel);
		FluidRegistry.addBucketForFluid(fluidStainlessSteel);
		FluidRegistry.addBucketForFluid(fluidNichrome);
		FluidRegistry.addBucketForFluid(fluidElectrum);
		FluidRegistry.addBucketForFluid(fluidStellite);
		FluidRegistry.addBucketForFluid(fluidSilvamer);
		FluidRegistry.addBucketForFluid(fluidUnium);
		FluidRegistry.addBucketForFluid(fluidFenikisite);
		FluidRegistry.addBucketForFluid(fluidUltimite);
		FluidRegistry.addBucketForFluid(fluidStrootite);
		FluidRegistry.addBucketForFluid(fluidSpeedoi);
		FluidRegistry.addBucketForFluid(fluidLegenite);
		
		FluidRegistry.addBucketForFluid(fluidCoal);
		FluidRegistry.addBucketForFluid(fluidIron);
		FluidRegistry.addBucketForFluid(fluidGold);
		FluidRegistry.addBucketForFluid(fluidDiamond);
		FluidRegistry.addBucketForFluid(fluidLapisLazuli);
		FluidRegistry.addBucketForFluid(fluidRedstone);
		FluidRegistry.addBucketForFluid(fluidEmerald);
		FluidRegistry.addBucketForFluid(fluidNetherQuartz);
	}
	
	public static Fluid getFluidFromName(String name) {
		if (name.equalsIgnoreCase((CopperConfig.oredict.oreOreDict).substring(3))) { return fluidCopper; }
		if (name.equalsIgnoreCase((TinConfig.oredict.oreOreDict).substring(3))) { return fluidTin; }
		if (name.equalsIgnoreCase((ZincConfig.oredict.oreOreDict).substring(3))) { return fluidZinc; }
		if (name.equalsIgnoreCase((NickelConfig.oredict.oreOreDict).substring(3))) { return fluidNickel; }
		if (name.equalsIgnoreCase((SilverConfig.oredict.oreOreDict).substring(3))) { return fluidSilver; }
		if (name.equalsIgnoreCase((AluminiumConfig.oredict.oreOreDict).substring(3))) { return fluidAluminium; }
		if (name.equalsIgnoreCase((TitaniumConfig.oredict.oreOreDict).substring(3))) { return fluidTitanium; }
		if (name.equalsIgnoreCase((ChromiumConfig.oredict.oreOreDict).substring(3))) { return fluidChromium; }
		if (name.equalsIgnoreCase((SiliconConfig.oredict.oreOreDict).substring(3))) { return fluidSilicon; }
		if (name.equalsIgnoreCase((CobaltConfig.oredict.oreOreDict).substring(3))) { return fluidCobalt; }
		if (name.equalsIgnoreCase((TungstenConfig.oredict.oreOreDict).substring(3))) { return fluidTungsten; }
		if (name.equalsIgnoreCase((LeadConfig.oredict.oreOreDict).substring(3))) { return fluidLead; }
		if (name.equalsIgnoreCase((PlatinumConfig.oredict.oreOreDict).substring(3))) { return fluidPlatinum; }
		if (name.equalsIgnoreCase((LithiumConfig.oredict.oreOreDict).substring(3))) { return fluidLithium; }
		if (name.equalsIgnoreCase((UraniumConfig.oredict.oreOreDict).substring(3))) { return fluidUranium; }
		if (name.equalsIgnoreCase((PlutoniumConfig.oredict.oreOreDict).substring(3))) { return fluidPlutonium; }
		
		if (name.equalsIgnoreCase((RubyConfig.oredict.oreOreDict).substring(3))) { return fluidRuby; }
		if (name.equalsIgnoreCase((SapphireConfig.oredict.oreOreDict).substring(3))) { return fluidSapphire; }
		if (name.equalsIgnoreCase((AmethystConfig.oredict.oreOreDict).substring(3))) { return fluidAmethyst; }
		if (name.equalsIgnoreCase((CrystalConfig.oredict.oreOreDict).substring(3))) { return fluidCrystal; }
		if (name.equalsIgnoreCase((MagnesiumConfig.oredict.oreOreDict).substring(3))) { return fluidMagnesium; }
		if (name.equalsIgnoreCase((PhosphorusConfig.oredict.oreOreDict).substring(3))) { return fluidPhosphorus; }
		if (name.equalsIgnoreCase((SulfurConfig.oredict.oreOreDict).substring(3))) { return fluidSulfur; }
		if (name.equalsIgnoreCase((SilvaniteConfig.oredict.oreOreDict).substring(3))) { return fluidSilvanite; }
		if (name.equalsIgnoreCase((MerciliteConfig.oredict.oreOreDict).substring(3))) { return fluidMercilite; }
		if (name.equalsIgnoreCase((MythianConfig.oredict.oreOreDict).substring(3))) { return fluidMythian; }
		if (name.equalsIgnoreCase((DragiteConfig.oredict.oreOreDict).substring(3))) { return fluidDragite; }
		if (name.equalsIgnoreCase((FlariteConfig.oredict.oreOreDict).substring(3))) { return fluidFlarite; }
		if (name.equalsIgnoreCase((FureniumConfig.oredict.oreOreDict).substring(3))) { return fluidFurenium; }
		if (name.equalsIgnoreCase((BlackstoneConfig.oredict.oreOreDict).substring(3))) { return fluidBlackstone; }
		if (name.equalsIgnoreCase((BluestoneConfig.oredict.oreOreDict).substring(3))) { return fluidBluestone; }
		if (name.equalsIgnoreCase((PurplestoneConfig.oredict.oreOreDict).substring(3))) { return fluidPurplestone; }
		
		if (name.equalsIgnoreCase((AlloyBronzeConfig.oredict.ingotOreDict).substring(5))) { return fluidBronze; }
		if (name.equalsIgnoreCase((AlloyCupronickelConfig.oredict.ingotOreDict).substring(5))) { return fluidCupronickel; }
		if (name.equalsIgnoreCase((AlloyBrassConfig.oredict.ingotOreDict).substring(5))) { return fluidBrass; }
		if (name.equalsIgnoreCase((AlloyRoseGoldConfig.oredict.ingotOreDict).substring(5))) { return fluidRoseGold; }
		if (name.equalsIgnoreCase((AlloySteelConfig.oredict.ingotOreDict).substring(5))) { return fluidSteel; }
		if (name.equalsIgnoreCase((AlloyStainlessSteelConfig.oredict.ingotOreDict).substring(5))) { return fluidStainlessSteel; }
		if (name.equalsIgnoreCase((AlloyNichromeConfig.oredict.ingotOreDict).substring(5))) { return fluidNichrome; }
		if (name.equalsIgnoreCase((AlloyElectrumConfig.oredict.ingotOreDict).substring(5))) { return fluidElectrum; }
		if (name.equalsIgnoreCase((AlloyStelliteConfig.oredict.ingotOreDict).substring(5))) { return fluidStellite; }
		if (name.equalsIgnoreCase((AlloySilvamerConfig.oredict.ingotOreDict).substring(5))) { return fluidSilvamer; }
		if (name.equalsIgnoreCase((AlloyUniumConfig.oredict.ingotOreDict).substring(5))) { return fluidUnium; }
		if (name.equalsIgnoreCase((AlloyFenikisiteConfig.oredict.ingotOreDict).substring(5))) { return fluidFenikisite; }
		if (name.equalsIgnoreCase((AlloyUltimiteConfig.oredict.ingotOreDict).substring(5))) { return fluidUltimite; }
		if (name.equalsIgnoreCase((AlloyStrootiteConfig.oredict.ingotOreDict).substring(5))) { return fluidStrootite; }
		if (name.equalsIgnoreCase((AlloySpeedoiConfig.oredict.ingotOreDict).substring(5))) { return fluidSpeedoi; }
		if (name.equalsIgnoreCase((AlloyLegeniteConfig.oredict.ingotOreDict).substring(5))) { return fluidLegenite; }
		
		if (name.equalsIgnoreCase("Coal")) { return fluidCoal; }
		if (name.equalsIgnoreCase("Iron")) { return fluidIron; }
		if (name.equalsIgnoreCase("Gold")) { return fluidGold; }
		if (name.equalsIgnoreCase("Diamond")) { return fluidDiamond; }
		if (name.equalsIgnoreCase("LapisLazuli")) { return fluidLapisLazuli; }
		if (name.equalsIgnoreCase("Redstone")) { return fluidRedstone; }
		if (name.equalsIgnoreCase("Emerald")) { return fluidEmerald; }
		if (name.equalsIgnoreCase("NetherQuartz")) { return fluidNetherQuartz; }
		
		if (name.equalsIgnoreCase("Solarium")) { return fluidSolarium; }
		return null;
	}
}
