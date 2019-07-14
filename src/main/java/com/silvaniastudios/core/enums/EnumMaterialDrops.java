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

import net.minecraft.item.Item;

public enum EnumMaterialDrops {
	copper(Item.getByNameOrId(itemName(CopperConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(CopperConfig.drops.secondaryDroppedItem)),
			itemMeta(CopperConfig.drops.primaryDroppedItem), itemMeta(CopperConfig.drops.secondaryDroppedItem),
			CopperConfig.drops.primaryDropQtyMin, CopperConfig.drops.primaryDropQtyMax, CopperConfig.drops.secondaryDropQtyMin,
			CopperConfig.drops.secondaryDropQtyMax, CopperConfig.drops.primaryDropChance, CopperConfig.drops.secondaryDropChance, CopperConfig.drops.canFortune),
	tin(Item.getByNameOrId(itemName(TinConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(TinConfig.drops.secondaryDroppedItem)),
			itemMeta(TinConfig.drops.primaryDroppedItem), itemMeta(TinConfig.drops.secondaryDroppedItem),
			TinConfig.drops.primaryDropQtyMin, TinConfig.drops.primaryDropQtyMax, TinConfig.drops.secondaryDropQtyMin,
			TinConfig.drops.secondaryDropQtyMax, TinConfig.drops.primaryDropChance, TinConfig.drops.secondaryDropChance, TinConfig.drops.canFortune),
	zinc(Item.getByNameOrId(itemName(ZincConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(ZincConfig.drops.secondaryDroppedItem)),
			itemMeta(ZincConfig.drops.primaryDroppedItem), itemMeta(ZincConfig.drops.secondaryDroppedItem),
			ZincConfig.drops.primaryDropQtyMin, ZincConfig.drops.primaryDropQtyMax, ZincConfig.drops.secondaryDropQtyMin,
			ZincConfig.drops.secondaryDropQtyMax, ZincConfig.drops.primaryDropChance, ZincConfig.drops.secondaryDropChance, ZincConfig.drops.canFortune),
	nickel(Item.getByNameOrId(itemName(NickelConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(NickelConfig.drops.secondaryDroppedItem)),
			itemMeta(NickelConfig.drops.primaryDroppedItem), itemMeta(NickelConfig.drops.secondaryDroppedItem),
			NickelConfig.drops.primaryDropQtyMin, NickelConfig.drops.primaryDropQtyMax, NickelConfig.drops.secondaryDropQtyMin,
			NickelConfig.drops.secondaryDropQtyMax, NickelConfig.drops.primaryDropChance, NickelConfig.drops.secondaryDropChance, NickelConfig.drops.canFortune),
	silver(Item.getByNameOrId(itemName(SilverConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(SilverConfig.drops.secondaryDroppedItem)),
			itemMeta(SilverConfig.drops.primaryDroppedItem), itemMeta(SilverConfig.drops.secondaryDroppedItem),
			SilverConfig.drops.primaryDropQtyMin, SilverConfig.drops.primaryDropQtyMax, SilverConfig.drops.secondaryDropQtyMin,
			SilverConfig.drops.secondaryDropQtyMax, SilverConfig.drops.primaryDropChance, SilverConfig.drops.secondaryDropChance, SilverConfig.drops.canFortune),
	aluminium(Item.getByNameOrId(itemName(AluminiumConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(AluminiumConfig.drops.secondaryDroppedItem)),
			itemMeta(AluminiumConfig.drops.primaryDroppedItem), itemMeta(AluminiumConfig.drops.secondaryDroppedItem),
			AluminiumConfig.drops.primaryDropQtyMin, AluminiumConfig.drops.primaryDropQtyMax, AluminiumConfig.drops.secondaryDropQtyMin,
			AluminiumConfig.drops.secondaryDropQtyMax, AluminiumConfig.drops.primaryDropChance, AluminiumConfig.drops.secondaryDropChance, AluminiumConfig.drops.canFortune),
	titanium(Item.getByNameOrId(itemName(TitaniumConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(TitaniumConfig.drops.secondaryDroppedItem)),
			itemMeta(TitaniumConfig.drops.primaryDroppedItem), itemMeta(TitaniumConfig.drops.secondaryDroppedItem),
			TitaniumConfig.drops.primaryDropQtyMin, TitaniumConfig.drops.primaryDropQtyMax, TitaniumConfig.drops.secondaryDropQtyMin,
			TitaniumConfig.drops.secondaryDropQtyMax, TitaniumConfig.drops.primaryDropChance, TitaniumConfig.drops.secondaryDropChance, TitaniumConfig.drops.canFortune),
	chromium(Item.getByNameOrId(itemName(ChromiumConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(ChromiumConfig.drops.secondaryDroppedItem)),
			itemMeta(ChromiumConfig.drops.primaryDroppedItem), itemMeta(ChromiumConfig.drops.secondaryDroppedItem),
			ChromiumConfig.drops.primaryDropQtyMin, ChromiumConfig.drops.primaryDropQtyMax, ChromiumConfig.drops.secondaryDropQtyMin,
			ChromiumConfig.drops.secondaryDropQtyMax, ChromiumConfig.drops.primaryDropChance, ChromiumConfig.drops.secondaryDropChance, ChromiumConfig.drops.canFortune),
	silicon(Item.getByNameOrId(itemName(SiliconConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(SiliconConfig.drops.secondaryDroppedItem)),
			itemMeta(SiliconConfig.drops.primaryDroppedItem), itemMeta(SiliconConfig.drops.secondaryDroppedItem),
			SiliconConfig.drops.primaryDropQtyMin, SiliconConfig.drops.primaryDropQtyMax, SiliconConfig.drops.secondaryDropQtyMin,
			SiliconConfig.drops.secondaryDropQtyMax, SiliconConfig.drops.primaryDropChance, SiliconConfig.drops.secondaryDropChance, SiliconConfig.drops.canFortune),
	cobalt(Item.getByNameOrId(itemName(CobaltConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(CobaltConfig.drops.secondaryDroppedItem)),
			itemMeta(CobaltConfig.drops.primaryDroppedItem), itemMeta(CobaltConfig.drops.secondaryDroppedItem),
			CobaltConfig.drops.primaryDropQtyMin, CobaltConfig.drops.primaryDropQtyMax, CobaltConfig.drops.secondaryDropQtyMin,
			CobaltConfig.drops.secondaryDropQtyMax, CobaltConfig.drops.primaryDropChance, CobaltConfig.drops.secondaryDropChance, CobaltConfig.drops.canFortune),
	tungsten(Item.getByNameOrId(itemName(TungstenConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(TungstenConfig.drops.secondaryDroppedItem)),
			itemMeta(TungstenConfig.drops.primaryDroppedItem), itemMeta(TungstenConfig.drops.secondaryDroppedItem),
			TungstenConfig.drops.primaryDropQtyMin, TungstenConfig.drops.primaryDropQtyMax, TungstenConfig.drops.secondaryDropQtyMin,
			TungstenConfig.drops.secondaryDropQtyMax, TungstenConfig.drops.primaryDropChance, TungstenConfig.drops.secondaryDropChance, TungstenConfig.drops.canFortune),
	lead(Item.getByNameOrId(itemName(LeadConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(LeadConfig.drops.secondaryDroppedItem)),
			itemMeta(LeadConfig.drops.primaryDroppedItem), itemMeta(LeadConfig.drops.secondaryDroppedItem),
			LeadConfig.drops.primaryDropQtyMin, LeadConfig.drops.primaryDropQtyMax, LeadConfig.drops.secondaryDropQtyMin,
			LeadConfig.drops.secondaryDropQtyMax, LeadConfig.drops.primaryDropChance, LeadConfig.drops.secondaryDropChance, LeadConfig.drops.canFortune),
	platinum(Item.getByNameOrId(itemName(PlatinumConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(PlatinumConfig.drops.secondaryDroppedItem)),
			itemMeta(PlatinumConfig.drops.primaryDroppedItem), itemMeta(PlatinumConfig.drops.secondaryDroppedItem),
			PlatinumConfig.drops.primaryDropQtyMin, PlatinumConfig.drops.primaryDropQtyMax, PlatinumConfig.drops.secondaryDropQtyMin,
			PlatinumConfig.drops.secondaryDropQtyMax, PlatinumConfig.drops.primaryDropChance, PlatinumConfig.drops.secondaryDropChance, PlatinumConfig.drops.canFortune),
	lithium(Item.getByNameOrId(itemName(LithiumConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(LithiumConfig.drops.secondaryDroppedItem)),
			itemMeta(LithiumConfig.drops.primaryDroppedItem), itemMeta(LithiumConfig.drops.secondaryDroppedItem),
			LithiumConfig.drops.primaryDropQtyMin, LithiumConfig.drops.primaryDropQtyMax, LithiumConfig.drops.secondaryDropQtyMin,
			LithiumConfig.drops.secondaryDropQtyMax, LithiumConfig.drops.primaryDropChance, LithiumConfig.drops.secondaryDropChance, LithiumConfig.drops.canFortune),
	uranium(Item.getByNameOrId(itemName(UraniumConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(UraniumConfig.drops.secondaryDroppedItem)),
			itemMeta(UraniumConfig.drops.primaryDroppedItem), itemMeta(UraniumConfig.drops.secondaryDroppedItem),
			UraniumConfig.drops.primaryDropQtyMin, UraniumConfig.drops.primaryDropQtyMax, UraniumConfig.drops.secondaryDropQtyMin,
			UraniumConfig.drops.secondaryDropQtyMax, UraniumConfig.drops.primaryDropChance, UraniumConfig.drops.secondaryDropChance, UraniumConfig.drops.canFortune),
	plutonium(Item.getByNameOrId(itemName(PlatinumConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(PlatinumConfig.drops.secondaryDroppedItem)),
			itemMeta(PlatinumConfig.drops.primaryDroppedItem), itemMeta(PlatinumConfig.drops.secondaryDroppedItem),
			PlatinumConfig.drops.primaryDropQtyMin, PlatinumConfig.drops.primaryDropQtyMax, PlatinumConfig.drops.secondaryDropQtyMin,
			PlatinumConfig.drops.secondaryDropQtyMax, PlatinumConfig.drops.primaryDropChance, PlatinumConfig.drops.secondaryDropChance, PlatinumConfig.drops.canFortune),
	
	ruby(Item.getByNameOrId(itemName(RubyConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(RubyConfig.drops.secondaryDroppedItem)),
			itemMeta(RubyConfig.drops.primaryDroppedItem), itemMeta(RubyConfig.drops.secondaryDroppedItem),
			RubyConfig.drops.primaryDropQtyMin, RubyConfig.drops.primaryDropQtyMax, RubyConfig.drops.secondaryDropQtyMin,
			RubyConfig.drops.secondaryDropQtyMax, RubyConfig.drops.primaryDropChance, RubyConfig.drops.secondaryDropChance, RubyConfig.drops.canFortune),
	sapphire(Item.getByNameOrId(itemName(SapphireConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(SapphireConfig.drops.secondaryDroppedItem)),
			itemMeta(SapphireConfig.drops.primaryDroppedItem), itemMeta(SapphireConfig.drops.secondaryDroppedItem),
			SapphireConfig.drops.primaryDropQtyMin, SapphireConfig.drops.primaryDropQtyMax, SapphireConfig.drops.secondaryDropQtyMin,
			SapphireConfig.drops.secondaryDropQtyMax, SapphireConfig.drops.primaryDropChance, SapphireConfig.drops.secondaryDropChance, SapphireConfig.drops.canFortune),
	amethyst(Item.getByNameOrId(itemName(AmethystConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(AmethystConfig.drops.secondaryDroppedItem)),
			itemMeta(AmethystConfig.drops.primaryDroppedItem), itemMeta(AmethystConfig.drops.secondaryDroppedItem),
			AmethystConfig.drops.primaryDropQtyMin, AmethystConfig.drops.primaryDropQtyMax, AmethystConfig.drops.secondaryDropQtyMin,
			AmethystConfig.drops.secondaryDropQtyMax, AmethystConfig.drops.primaryDropChance, AmethystConfig.drops.secondaryDropChance, AmethystConfig.drops.canFortune),
	crystal(Item.getByNameOrId(itemName(CrystalConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(CrystalConfig.drops.secondaryDroppedItem)),
			itemMeta(CrystalConfig.drops.primaryDroppedItem), itemMeta(CrystalConfig.drops.secondaryDroppedItem),
			CrystalConfig.drops.primaryDropQtyMin, CrystalConfig.drops.primaryDropQtyMax, CrystalConfig.drops.secondaryDropQtyMin,
			CrystalConfig.drops.secondaryDropQtyMax, CrystalConfig.drops.primaryDropChance, CrystalConfig.drops.secondaryDropChance, CrystalConfig.drops.canFortune),
	magnesium(Item.getByNameOrId(itemName(MagnesiumConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(MagnesiumConfig.drops.secondaryDroppedItem)),
			itemMeta(MagnesiumConfig.drops.primaryDroppedItem), itemMeta(MagnesiumConfig.drops.secondaryDroppedItem),
			MagnesiumConfig.drops.primaryDropQtyMin, MagnesiumConfig.drops.primaryDropQtyMax, MagnesiumConfig.drops.secondaryDropQtyMin,
			MagnesiumConfig.drops.secondaryDropQtyMax, MagnesiumConfig.drops.primaryDropChance, MagnesiumConfig.drops.secondaryDropChance, MagnesiumConfig.drops.canFortune),
	phosphorus(Item.getByNameOrId(itemName(PhosphorusConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(PhosphorusConfig.drops.secondaryDroppedItem)),
			itemMeta(PhosphorusConfig.drops.primaryDroppedItem), itemMeta(PhosphorusConfig.drops.secondaryDroppedItem),
			PhosphorusConfig.drops.primaryDropQtyMin, PhosphorusConfig.drops.primaryDropQtyMax, PhosphorusConfig.drops.secondaryDropQtyMin,
			PhosphorusConfig.drops.secondaryDropQtyMax, PhosphorusConfig.drops.primaryDropChance, PhosphorusConfig.drops.secondaryDropChance, PhosphorusConfig.drops.canFortune),
	sulfur(Item.getByNameOrId(itemName(SulfurConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(SulfurConfig.drops.secondaryDroppedItem)),
			itemMeta(SulfurConfig.drops.primaryDroppedItem), itemMeta(SulfurConfig.drops.secondaryDroppedItem),
			SulfurConfig.drops.primaryDropQtyMin, SulfurConfig.drops.primaryDropQtyMax, SulfurConfig.drops.secondaryDropQtyMin,
			SulfurConfig.drops.secondaryDropQtyMax, SulfurConfig.drops.primaryDropChance, SulfurConfig.drops.secondaryDropChance, SulfurConfig.drops.canFortune),
	silvanite(Item.getByNameOrId(itemName(SilvaniteConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(SilvaniteConfig.drops.secondaryDroppedItem)),
			itemMeta(SilvaniteConfig.drops.primaryDroppedItem), itemMeta(SilvaniteConfig.drops.secondaryDroppedItem),
			SilvaniteConfig.drops.primaryDropQtyMin, SilvaniteConfig.drops.primaryDropQtyMax, SilvaniteConfig.drops.secondaryDropQtyMin,
			SilvaniteConfig.drops.secondaryDropQtyMax, SilvaniteConfig.drops.primaryDropChance, SilvaniteConfig.drops.secondaryDropChance, SilvaniteConfig.drops.canFortune),
	mercilite(Item.getByNameOrId(itemName(MerciliteConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(MerciliteConfig.drops.secondaryDroppedItem)),
			itemMeta(MerciliteConfig.drops.primaryDroppedItem), itemMeta(MerciliteConfig.drops.secondaryDroppedItem),
			MerciliteConfig.drops.primaryDropQtyMin, MerciliteConfig.drops.primaryDropQtyMax, MerciliteConfig.drops.secondaryDropQtyMin,
			MerciliteConfig.drops.secondaryDropQtyMax, MerciliteConfig.drops.primaryDropChance, MerciliteConfig.drops.secondaryDropChance, MerciliteConfig.drops.canFortune),
	mythian(Item.getByNameOrId(itemName(MythianConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(MythianConfig.drops.secondaryDroppedItem)),
			itemMeta(MythianConfig.drops.primaryDroppedItem), itemMeta(MythianConfig.drops.secondaryDroppedItem),
			MythianConfig.drops.primaryDropQtyMin, MythianConfig.drops.primaryDropQtyMax, MythianConfig.drops.secondaryDropQtyMin,
			MythianConfig.drops.secondaryDropQtyMax, MythianConfig.drops.primaryDropChance, MythianConfig.drops.secondaryDropChance, MythianConfig.drops.canFortune),
	dragite(Item.getByNameOrId(itemName(DragiteConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(DragiteConfig.drops.secondaryDroppedItem)),
			itemMeta(DragiteConfig.drops.primaryDroppedItem), itemMeta(DragiteConfig.drops.secondaryDroppedItem),
			DragiteConfig.drops.primaryDropQtyMin, DragiteConfig.drops.primaryDropQtyMax, DragiteConfig.drops.secondaryDropQtyMin,
			DragiteConfig.drops.secondaryDropQtyMax, DragiteConfig.drops.primaryDropChance, DragiteConfig.drops.secondaryDropChance, DragiteConfig.drops.canFortune),
	flarite(Item.getByNameOrId(itemName(FlariteConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(FlariteConfig.drops.secondaryDroppedItem)),
			itemMeta(FlariteConfig.drops.primaryDroppedItem), itemMeta(FlariteConfig.drops.secondaryDroppedItem),
			FlariteConfig.drops.primaryDropQtyMin, FlariteConfig.drops.primaryDropQtyMax, FlariteConfig.drops.secondaryDropQtyMin,
			FlariteConfig.drops.secondaryDropQtyMax, FlariteConfig.drops.primaryDropChance, FlariteConfig.drops.secondaryDropChance, FlariteConfig.drops.canFortune),
	furenium(Item.getByNameOrId(itemName(FureniumConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(FureniumConfig.drops.secondaryDroppedItem)),
			itemMeta(FureniumConfig.drops.primaryDroppedItem), itemMeta(FureniumConfig.drops.secondaryDroppedItem),
			FureniumConfig.drops.primaryDropQtyMin, FureniumConfig.drops.primaryDropQtyMax, FureniumConfig.drops.secondaryDropQtyMin,
			FureniumConfig.drops.secondaryDropQtyMax, FureniumConfig.drops.primaryDropChance, FureniumConfig.drops.secondaryDropChance, FureniumConfig.drops.canFortune),
	blackstone(Item.getByNameOrId(itemName(BlackstoneConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(BlackstoneConfig.drops.secondaryDroppedItem)),
			itemMeta(BlackstoneConfig.drops.primaryDroppedItem), itemMeta(BlackstoneConfig.drops.secondaryDroppedItem),
			BlackstoneConfig.drops.primaryDropQtyMin, BlackstoneConfig.drops.primaryDropQtyMax, BlackstoneConfig.drops.secondaryDropQtyMin,
			BlackstoneConfig.drops.secondaryDropQtyMax, BlackstoneConfig.drops.primaryDropChance, BlackstoneConfig.drops.secondaryDropChance, BlackstoneConfig.drops.canFortune),
	bluestone(Item.getByNameOrId(itemName(BluestoneConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(BluestoneConfig.drops.secondaryDroppedItem)),
			itemMeta(BluestoneConfig.drops.primaryDroppedItem), itemMeta(BluestoneConfig.drops.secondaryDroppedItem),
			BluestoneConfig.drops.primaryDropQtyMin, BluestoneConfig.drops.primaryDropQtyMax, BluestoneConfig.drops.secondaryDropQtyMin,
			BluestoneConfig.drops.secondaryDropQtyMax, BluestoneConfig.drops.primaryDropChance, BluestoneConfig.drops.secondaryDropChance, BluestoneConfig.drops.canFortune),
	purplestone(Item.getByNameOrId(itemName(PurplestoneConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(PurplestoneConfig.drops.secondaryDroppedItem)),
			itemMeta(PurplestoneConfig.drops.primaryDroppedItem), itemMeta(PurplestoneConfig.drops.secondaryDroppedItem),
			PurplestoneConfig.drops.primaryDropQtyMin, PurplestoneConfig.drops.primaryDropQtyMax, PurplestoneConfig.drops.secondaryDropQtyMin,
			PurplestoneConfig.drops.secondaryDropQtyMax, PurplestoneConfig.drops.primaryDropChance, PurplestoneConfig.drops.secondaryDropChance, PurplestoneConfig.drops.canFortune),
	
	coal(Item.getByNameOrId(itemName(VanillaCoalConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(VanillaCoalConfig.drops.secondaryDroppedItem)),
			itemMeta(VanillaCoalConfig.drops.primaryDroppedItem), itemMeta(VanillaCoalConfig.drops.secondaryDroppedItem),
			VanillaCoalConfig.drops.primaryDropQtyMin, VanillaCoalConfig.drops.primaryDropQtyMax, VanillaCoalConfig.drops.secondaryDropQtyMin,
			VanillaCoalConfig.drops.secondaryDropQtyMax, VanillaCoalConfig.drops.primaryDropChance, VanillaCoalConfig.drops.secondaryDropChance, VanillaCoalConfig.drops.canFortune),
	iron(Item.getByNameOrId(itemName(VanillaIronConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(VanillaIronConfig.drops.secondaryDroppedItem)),
			itemMeta(VanillaIronConfig.drops.primaryDroppedItem), itemMeta(VanillaIronConfig.drops.secondaryDroppedItem),
			VanillaIronConfig.drops.primaryDropQtyMin, VanillaIronConfig.drops.primaryDropQtyMax, VanillaIronConfig.drops.secondaryDropQtyMin,
			VanillaIronConfig.drops.secondaryDropQtyMax, VanillaIronConfig.drops.primaryDropChance, VanillaIronConfig.drops.secondaryDropChance, VanillaIronConfig.drops.canFortune),
	gold(Item.getByNameOrId(itemName(VanillaGoldConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(VanillaGoldConfig.drops.secondaryDroppedItem)),
			itemMeta(VanillaGoldConfig.drops.primaryDroppedItem), itemMeta(VanillaGoldConfig.drops.secondaryDroppedItem),
			VanillaGoldConfig.drops.primaryDropQtyMin, VanillaGoldConfig.drops.primaryDropQtyMax, VanillaGoldConfig.drops.secondaryDropQtyMin,
			VanillaGoldConfig.drops.secondaryDropQtyMax, VanillaGoldConfig.drops.primaryDropChance, VanillaGoldConfig.drops.secondaryDropChance, VanillaGoldConfig.drops.canFortune),
	diamond(Item.getByNameOrId(itemName(VanillaDiamondConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(VanillaDiamondConfig.drops.secondaryDroppedItem)),
			itemMeta(VanillaDiamondConfig.drops.primaryDroppedItem), itemMeta(VanillaDiamondConfig.drops.secondaryDroppedItem),
			VanillaDiamondConfig.drops.primaryDropQtyMin, VanillaDiamondConfig.drops.primaryDropQtyMax, VanillaDiamondConfig.drops.secondaryDropQtyMin,
			VanillaDiamondConfig.drops.secondaryDropQtyMax, VanillaDiamondConfig.drops.primaryDropChance, VanillaDiamondConfig.drops.secondaryDropChance, VanillaDiamondConfig.drops.canFortune),
	redstone(Item.getByNameOrId(itemName(VanillaRedstoneConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(VanillaRedstoneConfig.drops.secondaryDroppedItem)),
			itemMeta(VanillaRedstoneConfig.drops.primaryDroppedItem), itemMeta(VanillaRedstoneConfig.drops.secondaryDroppedItem),
			VanillaRedstoneConfig.drops.primaryDropQtyMin, VanillaRedstoneConfig.drops.primaryDropQtyMax, VanillaRedstoneConfig.drops.secondaryDropQtyMin,
			VanillaRedstoneConfig.drops.secondaryDropQtyMax, VanillaRedstoneConfig.drops.primaryDropChance, VanillaRedstoneConfig.drops.secondaryDropChance, VanillaRedstoneConfig.drops.canFortune),
	lapis(Item.getByNameOrId(itemName(VanillaLapisLazuliConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(VanillaLapisLazuliConfig.drops.secondaryDroppedItem)),
			itemMeta(VanillaLapisLazuliConfig.drops.primaryDroppedItem), itemMeta(VanillaLapisLazuliConfig.drops.secondaryDroppedItem),
			VanillaLapisLazuliConfig.drops.primaryDropQtyMin, VanillaLapisLazuliConfig.drops.primaryDropQtyMax, VanillaLapisLazuliConfig.drops.secondaryDropQtyMin,
			VanillaLapisLazuliConfig.drops.secondaryDropQtyMax, VanillaLapisLazuliConfig.drops.primaryDropChance, VanillaLapisLazuliConfig.drops.secondaryDropChance, VanillaLapisLazuliConfig.drops.canFortune),
	emerald(Item.getByNameOrId(itemName(VanillaEmeraldConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(VanillaEmeraldConfig.drops.secondaryDroppedItem)),
			itemMeta(VanillaEmeraldConfig.drops.primaryDroppedItem), itemMeta(VanillaEmeraldConfig.drops.secondaryDroppedItem),
			VanillaEmeraldConfig.drops.primaryDropQtyMin, VanillaEmeraldConfig.drops.primaryDropQtyMax, VanillaEmeraldConfig.drops.secondaryDropQtyMin,
			VanillaEmeraldConfig.drops.secondaryDropQtyMax, VanillaEmeraldConfig.drops.primaryDropChance, VanillaEmeraldConfig.drops.secondaryDropChance, VanillaEmeraldConfig.drops.canFortune),
	quartz(Item.getByNameOrId(itemName(VanillaNetherQuartzConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(VanillaNetherQuartzConfig.drops.secondaryDroppedItem)),
			itemMeta(VanillaNetherQuartzConfig.drops.primaryDroppedItem), itemMeta(VanillaNetherQuartzConfig.drops.secondaryDroppedItem),
			VanillaNetherQuartzConfig.drops.primaryDropQtyMin, VanillaNetherQuartzConfig.drops.primaryDropQtyMax, VanillaNetherQuartzConfig.drops.secondaryDropQtyMin,
			VanillaNetherQuartzConfig.drops.secondaryDropQtyMax, VanillaNetherQuartzConfig.drops.primaryDropChance, VanillaNetherQuartzConfig.drops.secondaryDropChance, VanillaNetherQuartzConfig.drops.canFortune);
	
	private final Item primaryItem;
	private final Item secondaryItem;
	private final int primaryMeta;
	private final int secondaryMeta;
	private final int primaryQtyMin;
	private final int primaryQtyMax;
	private final int secondaryQtyMin;
	private final int secondaryQtyMax;
	private final int primaryChance;
	private final int secondaryChance;
	private final boolean fortune;
	
	private EnumMaterialDrops(Item priItem, Item secItem, int priMeta, int secMeta, int priQtyMin, int priQtyMax, int secQtyMin, int secQtyMax,
			int priChance, int secChance, boolean fortune) {
		this.primaryItem = priItem;
		this.secondaryItem = secItem;
		this.primaryMeta = priMeta;
		this.secondaryMeta = secMeta;
		this.primaryQtyMin = priQtyMin;
		this.primaryQtyMax = priQtyMax;
		this.secondaryQtyMin = secQtyMin;
		this.secondaryQtyMax = secQtyMax;
		this.primaryChance = priChance;
		this.secondaryChance = secChance;
		this.fortune = fortune;
	}

	public static EnumMaterialDrops lookupMetal(String name) {
		return EnumMaterialDrops.valueOf(name);
    }
	
	private static String itemName(String name) {
		if (name.matches("^.*\\d$")) {
        	return name.substring(0, name.lastIndexOf(":"));
    	}
		return name;
	}
	
	private static int itemMeta(String name) {
		if (name.matches("^.*\\d$")) {
			return Integer.parseInt(name.substring(name.lastIndexOf(":") + 1));
    	}
		return 0;
	}
	
	public Item primaryItem() {
		return this.primaryItem;
	}
	
	public Item secondaryItem() {
		return this.secondaryItem;
	}
	
	public int primaryMeta() {
		return this.primaryMeta;
	}
	
	public int secondaryMeta() {
		return this.secondaryMeta;
	}
	
	public int primaryDropMin() {
		return this.primaryQtyMin;
	}
	
	public int primaryDropMax() {
		return this.primaryQtyMax;
	}
	
	public int secondaryDropMin() {
		return this.secondaryQtyMin;
	}
	
	public int secondaryDropMax() {
		return this.secondaryQtyMax;
	}
	
	public int primaryChance() { 
		return this.primaryChance;
	}
	
	public int secondaryChance() {
		return this.secondaryChance;
	}
	
	public boolean canFortune() {
		return this.fortune;
	}
}