package com.silvaniastudios.core.enums;

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

public enum EnumMaterialGen {
	copper("copper", CopperConfig.worldgen.worldGenEnabled, CopperConfig.worldgen.minVeinSize, CopperConfig.worldgen.maxVeinSize, CopperConfig.worldgen.minWorldHeight,
			CopperConfig.worldgen.maxWorldHeight, CopperConfig.worldgen.veinsPerChunk, CopperConfig.worldgen.veinSpawnChance),
	tin("tin", TinConfig.worldgen.worldGenEnabled, TinConfig.worldgen.minVeinSize, TinConfig.worldgen.maxVeinSize, TinConfig.worldgen.minWorldHeight,
			TinConfig.worldgen.maxWorldHeight, TinConfig.worldgen.veinsPerChunk, TinConfig.worldgen.veinSpawnChance),
	zinc("zinc", ZincConfig.worldgen.worldGenEnabled, ZincConfig.worldgen.minVeinSize, ZincConfig.worldgen.maxVeinSize, ZincConfig.worldgen.minWorldHeight,
			ZincConfig.worldgen.maxWorldHeight, ZincConfig.worldgen.veinsPerChunk, ZincConfig.worldgen.veinSpawnChance),
	nickel("nickel", NickelConfig.worldgen.worldGenEnabled, NickelConfig.worldgen.minVeinSize, NickelConfig.worldgen.maxVeinSize, NickelConfig.worldgen.minWorldHeight,
			NickelConfig.worldgen.maxWorldHeight, NickelConfig.worldgen.veinsPerChunk, NickelConfig.worldgen.veinSpawnChance),
	silver("silver", SilverConfig.worldgen.worldGenEnabled, SilverConfig.worldgen.minVeinSize, SilverConfig.worldgen.maxVeinSize, SilverConfig.worldgen.minWorldHeight,
			SilverConfig.worldgen.maxWorldHeight, SilverConfig.worldgen.veinsPerChunk, SilverConfig.worldgen.veinSpawnChance),
	aluminium("aluminium", AluminiumConfig.worldgen.worldGenEnabled, AluminiumConfig.worldgen.minVeinSize, AluminiumConfig.worldgen.maxVeinSize, AluminiumConfig.worldgen.minWorldHeight,
			AluminiumConfig.worldgen.maxWorldHeight, AluminiumConfig.worldgen.veinsPerChunk, AluminiumConfig.worldgen.veinSpawnChance),
	titanium("titanium", TitaniumConfig.worldgen.worldGenEnabled, TitaniumConfig.worldgen.minVeinSize, TitaniumConfig.worldgen.maxVeinSize, TitaniumConfig.worldgen.minWorldHeight,
			TitaniumConfig.worldgen.maxWorldHeight, TitaniumConfig.worldgen.veinsPerChunk, TitaniumConfig.worldgen.veinSpawnChance),
	chromium("chromium", ChromiumConfig.worldgen.worldGenEnabled, ChromiumConfig.worldgen.minVeinSize, ChromiumConfig.worldgen.maxVeinSize, ChromiumConfig.worldgen.minWorldHeight,
			ChromiumConfig.worldgen.maxWorldHeight, ChromiumConfig.worldgen.veinsPerChunk, ChromiumConfig.worldgen.veinSpawnChance),
	silicon("silicon", SiliconConfig.worldgen.worldGenEnabled, SiliconConfig.worldgen.minVeinSize, SiliconConfig.worldgen.maxVeinSize, SiliconConfig.worldgen.minWorldHeight,
			SiliconConfig.worldgen.maxWorldHeight, SiliconConfig.worldgen.veinsPerChunk, SiliconConfig.worldgen.veinSpawnChance),
	cobalt("Cobalt", CobaltConfig.worldgen.worldGenEnabled, CobaltConfig.worldgen.minVeinSize, CobaltConfig.worldgen.maxVeinSize, CobaltConfig.worldgen.minWorldHeight,
			CobaltConfig.worldgen.maxWorldHeight, CobaltConfig.worldgen.veinsPerChunk, CobaltConfig.worldgen.veinSpawnChance),
	tungsten("tungsten", TungstenConfig.worldgen.worldGenEnabled, TungstenConfig.worldgen.minVeinSize, TungstenConfig.worldgen.maxVeinSize, TungstenConfig.worldgen.minWorldHeight,
			TungstenConfig.worldgen.maxWorldHeight, TungstenConfig.worldgen.veinsPerChunk, TungstenConfig.worldgen.veinSpawnChance),
	lead("lead", LeadConfig.worldgen.worldGenEnabled, LeadConfig.worldgen.minVeinSize, LeadConfig.worldgen.maxVeinSize, LeadConfig.worldgen.minWorldHeight,
			LeadConfig.worldgen.maxWorldHeight, LeadConfig.worldgen.veinsPerChunk, LeadConfig.worldgen.veinSpawnChance),
	platinum("platinum", PlatinumConfig.worldgen.worldGenEnabled, PlatinumConfig.worldgen.minVeinSize, PlatinumConfig.worldgen.maxVeinSize, PlatinumConfig.worldgen.minWorldHeight,
			PlatinumConfig.worldgen.maxWorldHeight, PlatinumConfig.worldgen.veinsPerChunk, PlatinumConfig.worldgen.veinSpawnChance),
	lithium("lithium", LithiumConfig.worldgen.worldGenEnabled, LithiumConfig.worldgen.minVeinSize, LithiumConfig.worldgen.maxVeinSize, LithiumConfig.worldgen.minWorldHeight,
			LithiumConfig.worldgen.maxWorldHeight, LithiumConfig.worldgen.veinsPerChunk, LithiumConfig.worldgen.veinSpawnChance),
	uranium("uranium", UraniumConfig.worldgen.worldGenEnabled, UraniumConfig.worldgen.minVeinSize, UraniumConfig.worldgen.maxVeinSize, UraniumConfig.worldgen.minWorldHeight,
			UraniumConfig.worldgen.maxWorldHeight, UraniumConfig.worldgen.veinsPerChunk, UraniumConfig.worldgen.veinSpawnChance),
	plutonium("plutonium", PlutoniumConfig.worldgen.worldGenEnabled, PlutoniumConfig.worldgen.minVeinSize, PlutoniumConfig.worldgen.maxVeinSize, PlutoniumConfig.worldgen.minWorldHeight,
			PlutoniumConfig.worldgen.maxWorldHeight, PlutoniumConfig.worldgen.veinsPerChunk, PlutoniumConfig.worldgen.veinSpawnChance),
	
	ruby("ruby", RubyConfig.worldgen.worldGenEnabled, RubyConfig.worldgen.minVeinSize, RubyConfig.worldgen.maxVeinSize, RubyConfig.worldgen.minWorldHeight,
			RubyConfig.worldgen.maxWorldHeight, RubyConfig.worldgen.veinsPerChunk, RubyConfig.worldgen.veinSpawnChance),
	sapphire("sapphire", SapphireConfig.worldgen.worldGenEnabled, SapphireConfig.worldgen.minVeinSize, SapphireConfig.worldgen.maxVeinSize, SapphireConfig.worldgen.minWorldHeight,
			SapphireConfig.worldgen.maxWorldHeight, SapphireConfig.worldgen.veinsPerChunk, SapphireConfig.worldgen.veinSpawnChance),
	amethyst("amethyst", AmethystConfig.worldgen.worldGenEnabled, AmethystConfig.worldgen.minVeinSize, AmethystConfig.worldgen.maxVeinSize, AmethystConfig.worldgen.minWorldHeight,
			AmethystConfig.worldgen.maxWorldHeight, AmethystConfig.worldgen.veinsPerChunk, AmethystConfig.worldgen.veinSpawnChance),
	crystal("crystal", CrystalConfig.worldgen.worldGenEnabled, CrystalConfig.worldgen.minVeinSize, CrystalConfig.worldgen.maxVeinSize, CrystalConfig.worldgen.minWorldHeight,
			CrystalConfig.worldgen.maxWorldHeight, CrystalConfig.worldgen.veinsPerChunk, CrystalConfig.worldgen.veinSpawnChance),
	magnesium("magnesium", MagnesiumConfig.worldgen.worldGenEnabled, MagnesiumConfig.worldgen.minVeinSize, MagnesiumConfig.worldgen.maxVeinSize, MagnesiumConfig.worldgen.minWorldHeight,
			MagnesiumConfig.worldgen.maxWorldHeight, MagnesiumConfig.worldgen.veinsPerChunk, MagnesiumConfig.worldgen.veinSpawnChance),
	phosphorus("phosphorus", PhosphorusConfig.worldgen.worldGenEnabled, PhosphorusConfig.worldgen.minVeinSize, PhosphorusConfig.worldgen.maxVeinSize, PhosphorusConfig.worldgen.minWorldHeight,
			PhosphorusConfig.worldgen.maxWorldHeight, PhosphorusConfig.worldgen.veinsPerChunk, PhosphorusConfig.worldgen.veinSpawnChance),
	sulfur("sulfur", SulfurConfig.worldgen.worldGenEnabled, SulfurConfig.worldgen.minVeinSize, SulfurConfig.worldgen.maxVeinSize, SulfurConfig.worldgen.minWorldHeight,
			SulfurConfig.worldgen.maxWorldHeight, SulfurConfig.worldgen.veinsPerChunk, SulfurConfig.worldgen.veinSpawnChance),
	silvanite("silvanite", SilvaniteConfig.worldgen.worldGenEnabled, SilvaniteConfig.worldgen.minVeinSize, SilvaniteConfig.worldgen.maxVeinSize, SilvaniteConfig.worldgen.minWorldHeight,
			SilvaniteConfig.worldgen.maxWorldHeight, SilvaniteConfig.worldgen.veinsPerChunk, SilvaniteConfig.worldgen.veinSpawnChance),
	mercilite("mercilite", MerciliteConfig.worldgen.worldGenEnabled, MerciliteConfig.worldgen.minVeinSize, MerciliteConfig.worldgen.maxVeinSize, MerciliteConfig.worldgen.minWorldHeight,
			MerciliteConfig.worldgen.maxWorldHeight, MerciliteConfig.worldgen.veinsPerChunk, MerciliteConfig.worldgen.veinSpawnChance),
	mythian("mythian", MythianConfig.worldgen.worldGenEnabled, MythianConfig.worldgen.minVeinSize, MythianConfig.worldgen.maxVeinSize, MythianConfig.worldgen.minWorldHeight,
			MythianConfig.worldgen.maxWorldHeight, MythianConfig.worldgen.veinsPerChunk, MythianConfig.worldgen.veinSpawnChance),
	dragite("dragite", DragiteConfig.worldgen.worldGenEnabled, DragiteConfig.worldgen.minVeinSize, DragiteConfig.worldgen.maxVeinSize, DragiteConfig.worldgen.minWorldHeight,
			DragiteConfig.worldgen.maxWorldHeight, DragiteConfig.worldgen.veinsPerChunk, DragiteConfig.worldgen.veinSpawnChance),
	flarite("flarite", FlariteConfig.worldgen.worldGenEnabled, FlariteConfig.worldgen.minVeinSize, FlariteConfig.worldgen.maxVeinSize, FlariteConfig.worldgen.minWorldHeight,
			FlariteConfig.worldgen.maxWorldHeight, FlariteConfig.worldgen.veinsPerChunk, FlariteConfig.worldgen.veinSpawnChance),
	furenium("flarite", FureniumConfig.worldgen.worldGenEnabled, FureniumConfig.worldgen.minVeinSize, FureniumConfig.worldgen.maxVeinSize, FureniumConfig.worldgen.minWorldHeight,
			FureniumConfig.worldgen.maxWorldHeight, FureniumConfig.worldgen.veinsPerChunk, FureniumConfig.worldgen.veinSpawnChance),
	blackstone("blackstone", BlackstoneConfig.worldgen.worldGenEnabled, BlackstoneConfig.worldgen.minVeinSize, BlackstoneConfig.worldgen.maxVeinSize, BlackstoneConfig.worldgen.minWorldHeight,
			BlackstoneConfig.worldgen.maxWorldHeight, BlackstoneConfig.worldgen.veinsPerChunk, BlackstoneConfig.worldgen.veinSpawnChance),
	bluestone("bluestone", BluestoneConfig.worldgen.worldGenEnabled, BluestoneConfig.worldgen.minVeinSize, BluestoneConfig.worldgen.maxVeinSize, BluestoneConfig.worldgen.minWorldHeight,
			BluestoneConfig.worldgen.maxWorldHeight, BluestoneConfig.worldgen.veinsPerChunk, BluestoneConfig.worldgen.veinSpawnChance),
	purplestone("purplestone", PurplestoneConfig.worldgen.worldGenEnabled, PurplestoneConfig.worldgen.minVeinSize, PurplestoneConfig.worldgen.maxVeinSize, PurplestoneConfig.worldgen.minWorldHeight,
			PurplestoneConfig.worldgen.maxWorldHeight, PurplestoneConfig.worldgen.veinsPerChunk, PurplestoneConfig.worldgen.veinSpawnChance),
	
	coal("coal", VanillaCoalConfig.worldgen.worldGenEnabled, VanillaCoalConfig.worldgen.minVeinSize, VanillaCoalConfig.worldgen.maxVeinSize, VanillaCoalConfig.worldgen.minWorldHeight,
			VanillaCoalConfig.worldgen.maxWorldHeight, VanillaCoalConfig.worldgen.veinsPerChunk, VanillaCoalConfig.worldgen.veinSpawnChance),
	iron("iron", VanillaIronConfig.worldgen.worldGenEnabled, VanillaIronConfig.worldgen.minVeinSize, VanillaIronConfig.worldgen.maxVeinSize, VanillaIronConfig.worldgen.minWorldHeight,
			VanillaIronConfig.worldgen.maxWorldHeight, VanillaIronConfig.worldgen.veinsPerChunk, VanillaIronConfig.worldgen.veinSpawnChance),
	gold("gold", VanillaGoldConfig.worldgen.worldGenEnabled, VanillaGoldConfig.worldgen.minVeinSize, VanillaGoldConfig.worldgen.maxVeinSize, VanillaGoldConfig.worldgen.minWorldHeight,
			VanillaGoldConfig.worldgen.maxWorldHeight, VanillaGoldConfig.worldgen.veinsPerChunk, VanillaGoldConfig.worldgen.veinSpawnChance),
	diamond("diamond", VanillaDiamondConfig.worldgen.worldGenEnabled, VanillaDiamondConfig.worldgen.minVeinSize, VanillaDiamondConfig.worldgen.maxVeinSize, VanillaDiamondConfig.worldgen.minWorldHeight,
			VanillaDiamondConfig.worldgen.maxWorldHeight, VanillaDiamondConfig.worldgen.veinsPerChunk, VanillaDiamondConfig.worldgen.veinSpawnChance),
	redstone("redstone", VanillaRedstoneConfig.worldgen.worldGenEnabled, VanillaRedstoneConfig.worldgen.minVeinSize, VanillaRedstoneConfig.worldgen.maxVeinSize, VanillaRedstoneConfig.worldgen.minWorldHeight,
			VanillaRedstoneConfig.worldgen.maxWorldHeight, VanillaRedstoneConfig.worldgen.veinsPerChunk, VanillaRedstoneConfig.worldgen.veinSpawnChance),
	lapis("lapis", VanillaLapisLazuliConfig.worldgen.worldGenEnabled, VanillaLapisLazuliConfig.worldgen.minVeinSize, VanillaLapisLazuliConfig.worldgen.maxVeinSize, VanillaLapisLazuliConfig.worldgen.minWorldHeight,
			VanillaLapisLazuliConfig.worldgen.maxWorldHeight, VanillaLapisLazuliConfig.worldgen.veinsPerChunk, VanillaLapisLazuliConfig.worldgen.veinSpawnChance),
	emerald("emerald", VanillaEmeraldConfig.worldgen.worldGenEnabled, VanillaEmeraldConfig.worldgen.minVeinSize, VanillaEmeraldConfig.worldgen.maxVeinSize, VanillaEmeraldConfig.worldgen.minWorldHeight,
			VanillaEmeraldConfig.worldgen.maxWorldHeight, VanillaEmeraldConfig.worldgen.veinsPerChunk, VanillaEmeraldConfig.worldgen.veinSpawnChance),
	quartz("quartz", VanillaNetherQuartzConfig.worldgen.worldGenEnabled, VanillaNetherQuartzConfig.worldgen.minVeinSize, VanillaNetherQuartzConfig.worldgen.maxVeinSize, VanillaNetherQuartzConfig.worldgen.minWorldHeight,
			VanillaNetherQuartzConfig.worldgen.maxWorldHeight, VanillaNetherQuartzConfig.worldgen.veinsPerChunk, VanillaNetherQuartzConfig.worldgen.veinSpawnChance);
	
	private final String name;
	private final boolean enabled;
	private final int minVein;
	private final int maxVein;
	private final int minWorldHeight;
	private final int maxWorldHeight;
	private final int veinsPerChunk;
	private final int veinSpawnChance;
	
	private EnumMaterialGen(String name, boolean enabled, int minVein, int maxVein, int minWH, int maxWH, int vpc, int veinChance) {
		this.name = name;
		this.enabled = enabled;
		this.minVein = minVein;
		this.maxVein = maxVein;
		this.minWorldHeight = minWH;
		this.maxWorldHeight = maxWH;
		this.veinsPerChunk = vpc;
		this.veinSpawnChance = veinChance;
	}

	public static EnumMaterialGen lookupMetal(String name) {
		return EnumMaterialGen.valueOf(name);
    }
	
	public String getName() {
		return this.name;
	}
	
	public boolean enabled() {
		return this.enabled;
	}
	
	public int minVein() {
		return this.minVein;
	}
	
	public int maxVein() {
		return this.maxVein;
	}
	
	public int minHeight() {
		return this.minWorldHeight;
	}
	
	public int maxHeight() {
		return this.maxWorldHeight;
	}
	
	public int vpc() {
		return this.veinsPerChunk;
	}
	
	public int veinChance() { 
		return this.veinSpawnChance;
	}

}
