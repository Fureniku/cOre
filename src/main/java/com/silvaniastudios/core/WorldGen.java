package com.silvaniastudios.core;

import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

import com.silvaniastudios.core.blocks.BlockOre1;
import com.silvaniastudios.core.blocks.BlockOre2;
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

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	WorldGenMinable copper;
	WorldGenMinable tin;
	WorldGenMinable zinc;
	WorldGenMinable nickel;
	WorldGenMinable silver;
	WorldGenMinable aluminium;
	WorldGenMinable titanium;
	WorldGenMinable chromium;
	WorldGenMinable silicon;
	WorldGenMinable cobalt;
	WorldGenMinable tungsten;
	WorldGenMinable lead;
	WorldGenMinable platinum;
	WorldGenMinable lithium;
	WorldGenMinable uranium;
	WorldGenMinable plutonium;
	
	WorldGenMinable ruby;
	WorldGenMinable sapphire;
	WorldGenMinable amethyst;
	WorldGenMinable crystal;
	WorldGenMinable magnesium;
	WorldGenMinable phosphorus;
	WorldGenMinable sulfur;
	WorldGenMinable silvanite;
	WorldGenMinable mercilite;
	WorldGenMinable mythian;
	WorldGenMinable dragite;
	WorldGenMinable flarite;
	WorldGenMinable furenium;
	WorldGenMinable blackstone;
	WorldGenMinable bluestone;
	WorldGenMinable purplestone;
	
	WorldGenMinable limestone;
	WorldGenMinable calcite;
	WorldGenMinable graphite;
	
	WorldGenMinable coal;
	WorldGenMinable iron;
	WorldGenMinable gold;
	WorldGenMinable diamond;
	WorldGenMinable lapis;
	WorldGenMinable redstone;
	WorldGenMinable emerald;
	WorldGenMinable quartz;
		
	BlockOre1 blockSet1 = ModBlocks.blockOre1;
	BlockOre2 blockSet2 = ModBlocks.blockOre2;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) { // the overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		int dim = world.provider.getDimension();
		int copperVar = CopperConfig.worldgen.maxVeinSize-CopperConfig.worldgen.minVeinSize;
		int tinVar = TinConfig.worldgen.maxVeinSize-TinConfig.worldgen.minVeinSize;
		int zincVar = ZincConfig.worldgen.maxVeinSize-ZincConfig.worldgen.minVeinSize;
		int nickelVar = NickelConfig.worldgen.maxVeinSize-NickelConfig.worldgen.minVeinSize;
		int silverVar = SilverConfig.worldgen.maxVeinSize-SilverConfig.worldgen.minVeinSize;
		int aluminiumVar = AluminiumConfig.worldgen.maxVeinSize-AluminiumConfig.worldgen.minVeinSize;
		int titaniumVar = TitaniumConfig.worldgen.maxVeinSize-TitaniumConfig.worldgen.minVeinSize;
		int chromiumVar = ChromiumConfig.worldgen.maxVeinSize-ChromiumConfig.worldgen.minVeinSize;
		int siliconVar = SiliconConfig.worldgen.maxVeinSize-SiliconConfig.worldgen.minVeinSize;
		int cobaltVar = CobaltConfig.worldgen.maxVeinSize-CobaltConfig.worldgen.minVeinSize;
		int tungstenVar = TungstenConfig.worldgen.maxVeinSize-TungstenConfig.worldgen.minVeinSize;
		int leadVar = LeadConfig.worldgen.maxVeinSize-LeadConfig.worldgen.minVeinSize;
		int platinumVar = PlatinumConfig.worldgen.maxVeinSize-PlatinumConfig.worldgen.minVeinSize;
		int lithiumVar = LithiumConfig.worldgen.maxVeinSize-LithiumConfig.worldgen.minVeinSize;
		int uraniumVar = UraniumConfig.worldgen.maxVeinSize-UraniumConfig.worldgen.minVeinSize;
		int plutoniumVar = PlutoniumConfig.worldgen.maxVeinSize-PlutoniumConfig.worldgen.minVeinSize;
		int rubyVar = RubyConfig.worldgen.maxVeinSize-RubyConfig.worldgen.minVeinSize;
		int sapphireVar = SapphireConfig.worldgen.maxVeinSize-SapphireConfig.worldgen.minVeinSize;
		int amethystVar = AmethystConfig.worldgen.maxVeinSize-AmethystConfig.worldgen.minVeinSize;
		int crystalVar = CrystalConfig.worldgen.maxVeinSize-CrystalConfig.worldgen.minVeinSize;
		int magnesiumVar = MagnesiumConfig.worldgen.maxVeinSize-MagnesiumConfig.worldgen.minVeinSize;
		int phosphorusVar = PhosphorusConfig.worldgen.maxVeinSize-PhosphorusConfig.worldgen.minVeinSize;
		int sulfurVar = SulfurConfig.worldgen.maxVeinSize-SulfurConfig.worldgen.minVeinSize;
		int silvaniteVar = SilvaniteConfig.worldgen.maxVeinSize-SilvaniteConfig.worldgen.minVeinSize;
		int merciliteVar = MerciliteConfig.worldgen.maxVeinSize-MerciliteConfig.worldgen.minVeinSize;
		int mythianVar = MythianConfig.worldgen.maxVeinSize-MythianConfig.worldgen.minVeinSize;
		int dragiteVar = DragiteConfig.worldgen.maxVeinSize-DragiteConfig.worldgen.minVeinSize;
		int flariteVar = FlariteConfig.worldgen.maxVeinSize-FlariteConfig.worldgen.minVeinSize;
		int fureniumVar = FureniumConfig.worldgen.maxVeinSize-FureniumConfig.worldgen.minVeinSize;
		int blackstoneVar = BlackstoneConfig.worldgen.maxVeinSize-BlackstoneConfig.worldgen.minVeinSize;
		int bluestoneVar = BluestoneConfig.worldgen.maxVeinSize-BluestoneConfig.worldgen.minVeinSize;
		int purplestoneVar = PurplestoneConfig.worldgen.maxVeinSize-PurplestoneConfig.worldgen.minVeinSize;

		copper = new WorldGenMinable(blockSet1.getStateFromMeta(0), CopperConfig.worldgen.minVeinSize + random.nextInt(copperVar));
		tin = new WorldGenMinable(blockSet1.getStateFromMeta(1), TinConfig.worldgen.minVeinSize + random.nextInt(tinVar));
		zinc = new WorldGenMinable(blockSet1.getStateFromMeta(2), ZincConfig.worldgen.minVeinSize + random.nextInt(zincVar));
		nickel = new WorldGenMinable(blockSet1.getStateFromMeta(3), NickelConfig.worldgen.minVeinSize + random.nextInt(nickelVar));
		silver = new WorldGenMinable(blockSet1.getStateFromMeta(4), SilverConfig.worldgen.minVeinSize + random.nextInt(silverVar));
		aluminium = new WorldGenMinable(blockSet1.getStateFromMeta(5), AluminiumConfig.worldgen.minVeinSize + random.nextInt(aluminiumVar));
		titanium = new WorldGenMinable(blockSet1.getStateFromMeta(6), TitaniumConfig.worldgen.minVeinSize + random.nextInt(titaniumVar));
		chromium = new WorldGenMinable(blockSet1.getStateFromMeta(7), ChromiumConfig.worldgen.minVeinSize + random.nextInt(chromiumVar));
		silicon = new WorldGenMinable(blockSet1.getStateFromMeta(8), SiliconConfig.worldgen.minVeinSize + random.nextInt(siliconVar));
		cobalt = new WorldGenMinable(blockSet1.getStateFromMeta(9), CobaltConfig.worldgen.minVeinSize + random.nextInt(cobaltVar));
		tungsten = new WorldGenMinable(blockSet1.getStateFromMeta(10), TungstenConfig.worldgen.minVeinSize + random.nextInt(tungstenVar));
		lead = new WorldGenMinable(blockSet1.getStateFromMeta(11), LeadConfig.worldgen.minVeinSize + random.nextInt(leadVar));
		platinum = new WorldGenMinable(blockSet1.getStateFromMeta(12), PlatinumConfig.worldgen.minVeinSize + random.nextInt(platinumVar));
		lithium = new WorldGenMinable(blockSet1.getStateFromMeta(13), LithiumConfig.worldgen.minVeinSize + random.nextInt(lithiumVar));
		uranium = new WorldGenMinable(blockSet1.getStateFromMeta(14), UraniumConfig.worldgen.minVeinSize + random.nextInt(uraniumVar));
		plutonium = new WorldGenMinable(blockSet1.getStateFromMeta(15), PlutoniumConfig.worldgen.minVeinSize + random.nextInt(plutoniumVar));
		ruby = new WorldGenMinable(blockSet2.getStateFromMeta(0), RubyConfig.worldgen.minVeinSize + random.nextInt(rubyVar));
		sapphire = new WorldGenMinable(blockSet2.getStateFromMeta(1), SapphireConfig.worldgen.minVeinSize + random.nextInt(sapphireVar));
		amethyst = new WorldGenMinable(blockSet2.getStateFromMeta(2), AmethystConfig.worldgen.minVeinSize + random.nextInt(amethystVar));
		crystal = new WorldGenMinable(blockSet2.getStateFromMeta(3), CrystalConfig.worldgen.minVeinSize + random.nextInt(crystalVar));
		magnesium = new WorldGenMinable(blockSet2.getStateFromMeta(4), MagnesiumConfig.worldgen.minVeinSize + random.nextInt(magnesiumVar));
		phosphorus = new WorldGenMinable(blockSet2.getStateFromMeta(5), PhosphorusConfig.worldgen.minVeinSize + random.nextInt(phosphorusVar));
		sulfur = new WorldGenMinable(blockSet2.getStateFromMeta(6), SulfurConfig.worldgen.minVeinSize + random.nextInt(sulfurVar));
		silvanite = new WorldGenMinable(blockSet2.getStateFromMeta(7), SilvaniteConfig.worldgen.minVeinSize + random.nextInt(silvaniteVar));
		mercilite = new WorldGenMinable(blockSet2.getStateFromMeta(8), MerciliteConfig.worldgen.minVeinSize + random.nextInt(merciliteVar));
		mythian = new WorldGenMinable(blockSet2.getStateFromMeta(9), MythianConfig.worldgen.minVeinSize + random.nextInt(mythianVar));
		dragite = new WorldGenMinable(blockSet2.getStateFromMeta(10), DragiteConfig.worldgen.minVeinSize + random.nextInt(dragiteVar));
		flarite = new WorldGenMinable(blockSet2.getStateFromMeta(11), FlariteConfig.worldgen.minVeinSize + random.nextInt(flariteVar));
		furenium = new WorldGenMinable(blockSet2.getStateFromMeta(12), FureniumConfig.worldgen.minVeinSize + random.nextInt(fureniumVar));
		blackstone = new WorldGenMinable(blockSet2.getStateFromMeta(13), BlackstoneConfig.worldgen.minVeinSize + random.nextInt(blackstoneVar));
		bluestone = new WorldGenMinable(blockSet2.getStateFromMeta(14), BluestoneConfig.worldgen.minVeinSize + random.nextInt(bluestoneVar));
		purplestone = new WorldGenMinable(blockSet2.getStateFromMeta(15), PurplestoneConfig.worldgen.minVeinSize + random.nextInt(purplestoneVar));
		
		int coalVar = VanillaCoalConfig.worldgen.maxVeinSize-VanillaCoalConfig.worldgen.minVeinSize;
		int ironVar = VanillaIronConfig.worldgen.maxVeinSize-VanillaIronConfig.worldgen.minVeinSize;
		int goldVar = VanillaGoldConfig.worldgen.maxVeinSize-VanillaGoldConfig.worldgen.minVeinSize;
		int diamondVar = VanillaDiamondConfig.worldgen.maxVeinSize-VanillaDiamondConfig.worldgen.minVeinSize;
		int lapisVar = VanillaLapisLazuliConfig.worldgen.maxVeinSize-VanillaLapisLazuliConfig.worldgen.minVeinSize;
		int redstoneVar = VanillaRedstoneConfig.worldgen.maxVeinSize-VanillaRedstoneConfig.worldgen.minVeinSize;
		int emeraldVar = VanillaEmeraldConfig.worldgen.maxVeinSize-VanillaEmeraldConfig.worldgen.minVeinSize;
		int quartzVar = VanillaNetherQuartzConfig.worldgen.maxVeinSize-VanillaNetherQuartzConfig.worldgen.minVeinSize;
		
		coal = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), VanillaCoalConfig.worldgen.minVeinSize + random.nextInt(coalVar));
		iron = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), VanillaIronConfig.worldgen.minVeinSize + random.nextInt(ironVar));
		gold = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), VanillaGoldConfig.worldgen.minVeinSize + random.nextInt(goldVar));
		diamond = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), VanillaDiamondConfig.worldgen.minVeinSize + random.nextInt(diamondVar));
		lapis = new WorldGenMinable(Blocks.LAPIS_ORE.getDefaultState(), VanillaLapisLazuliConfig.worldgen.minVeinSize + random.nextInt(lapisVar));
		redstone = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), VanillaRedstoneConfig.worldgen.minVeinSize + random.nextInt(redstoneVar));
		emerald = new WorldGenMinable(Blocks.EMERALD_ORE.getDefaultState(), VanillaEmeraldConfig.worldgen.minVeinSize + random.nextInt(emeraldVar));
		quartz = new WorldGenMinable(Blocks.QUARTZ_ORE.getDefaultState(), VanillaNetherQuartzConfig.worldgen.minVeinSize + random.nextInt(quartzVar));
		
		if (ArrayUtils.contains(CopperConfig.worldgen.allowedDimensions, dim) && CopperConfig.worldgen.worldGenEnabled) {
			int vpc = CopperConfig.worldgen.veinsPerChunk;
			int min = CopperConfig.worldgen.minWorldHeight;
			int max = CopperConfig.worldgen.maxWorldHeight;
			int chance = CopperConfig.worldgen.veinSpawnChance;
			COre.debug("adding Copper spawns.VPC: " + vpc + ", min height: " + min + ", max height: " + max + ", chance: " + chance); 
			addOreSpawn(copper, world, random, chunkX * 16, chunkZ * 16, vpc, min, max, chance, CopperConfig.worldgen.restrictBiomes, CopperConfig.worldgen.allowedBiomes);
		}
		if (ArrayUtils.contains(TinConfig.worldgen.allowedDimensions, dim) && TinConfig.worldgen.worldGenEnabled) { addOreSpawn(tin, world, random, chunkX * 16, chunkZ * 16, TinConfig.worldgen.veinsPerChunk, TinConfig.worldgen.minWorldHeight, TinConfig.worldgen.maxWorldHeight, TinConfig.worldgen.veinSpawnChance, TinConfig.worldgen.restrictBiomes, TinConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(ZincConfig.worldgen.allowedDimensions, dim) && ZincConfig.worldgen.worldGenEnabled) { addOreSpawn(zinc, world, random, chunkX * 16, chunkZ * 16, ZincConfig.worldgen.veinsPerChunk, ZincConfig.worldgen.minWorldHeight, ZincConfig.worldgen.maxWorldHeight, ZincConfig.worldgen.veinSpawnChance, ZincConfig.worldgen.restrictBiomes, ZincConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(NickelConfig.worldgen.allowedDimensions, dim) && NickelConfig.worldgen.worldGenEnabled) { addOreSpawn(nickel, world, random, chunkX * 16, chunkZ * 16, NickelConfig.worldgen.veinsPerChunk, NickelConfig.worldgen.minWorldHeight, NickelConfig.worldgen.maxWorldHeight, NickelConfig.worldgen.veinSpawnChance, NickelConfig.worldgen.restrictBiomes, NickelConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(SilverConfig.worldgen.allowedDimensions, dim) && SilverConfig.worldgen.worldGenEnabled) { addOreSpawn(silver, world, random, chunkX * 16, chunkZ * 16, SilverConfig.worldgen.veinsPerChunk, SilverConfig.worldgen.minWorldHeight, SilverConfig.worldgen.maxWorldHeight, SilverConfig.worldgen.veinSpawnChance, SilverConfig.worldgen.restrictBiomes, SilverConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(AluminiumConfig.worldgen.allowedDimensions, dim) && AluminiumConfig.worldgen.worldGenEnabled) { addOreSpawn(aluminium, world, random, chunkX * 16, chunkZ * 16, AluminiumConfig.worldgen.veinsPerChunk, AluminiumConfig.worldgen.minWorldHeight, AluminiumConfig.worldgen.maxWorldHeight, AluminiumConfig.worldgen.veinSpawnChance, AluminiumConfig.worldgen.restrictBiomes, AluminiumConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(TitaniumConfig.worldgen.allowedDimensions, dim) && TitaniumConfig.worldgen.worldGenEnabled) { addOreSpawn(titanium, world, random, chunkX * 16, chunkZ * 16, TitaniumConfig.worldgen.veinsPerChunk, TitaniumConfig.worldgen.minWorldHeight, TitaniumConfig.worldgen.maxWorldHeight, TitaniumConfig.worldgen.veinSpawnChance, TitaniumConfig.worldgen.restrictBiomes, TitaniumConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(ChromiumConfig.worldgen.allowedDimensions, dim) && ChromiumConfig.worldgen.worldGenEnabled) { addOreSpawn(chromium, world, random, chunkX * 16, chunkZ * 16, ChromiumConfig.worldgen.veinsPerChunk, ChromiumConfig.worldgen.minWorldHeight, ChromiumConfig.worldgen.maxWorldHeight, ChromiumConfig.worldgen.veinSpawnChance, ChromiumConfig.worldgen.restrictBiomes, ChromiumConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(SiliconConfig.worldgen.allowedDimensions, dim) && SiliconConfig.worldgen.worldGenEnabled) { addOreSpawn(silicon, world, random, chunkX * 16, chunkZ * 16, SiliconConfig.worldgen.veinsPerChunk, SiliconConfig.worldgen.minWorldHeight, SiliconConfig.worldgen.maxWorldHeight, SiliconConfig.worldgen.veinSpawnChance, SiliconConfig.worldgen.restrictBiomes, SiliconConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(CobaltConfig.worldgen.allowedDimensions, dim) && CobaltConfig.worldgen.worldGenEnabled) { addOreSpawn(cobalt, world, random, chunkX * 16, chunkZ * 16, CobaltConfig.worldgen.veinsPerChunk, CobaltConfig.worldgen.minWorldHeight, CobaltConfig.worldgen.maxWorldHeight, CobaltConfig.worldgen.veinSpawnChance, CobaltConfig.worldgen.restrictBiomes, CobaltConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(TungstenConfig.worldgen.allowedDimensions, dim) && TungstenConfig.worldgen.worldGenEnabled) { addOreSpawn(tungsten, world, random, chunkX * 16, chunkZ * 16, TungstenConfig.worldgen.veinsPerChunk, TungstenConfig.worldgen.minWorldHeight, TungstenConfig.worldgen.maxWorldHeight, TungstenConfig.worldgen.veinSpawnChance, TungstenConfig.worldgen.restrictBiomes, TungstenConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(LeadConfig.worldgen.allowedDimensions, dim) && LeadConfig.worldgen.worldGenEnabled) { addOreSpawn(lead, world, random, chunkX * 16, chunkZ * 16, LeadConfig.worldgen.veinsPerChunk, LeadConfig.worldgen.minWorldHeight, LeadConfig.worldgen.maxWorldHeight, LeadConfig.worldgen.veinSpawnChance, LeadConfig.worldgen.restrictBiomes, LeadConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(PlatinumConfig.worldgen.allowedDimensions, dim) && PlatinumConfig.worldgen.worldGenEnabled) { addOreSpawn(platinum, world, random, chunkX * 16, chunkZ * 16, PlatinumConfig.worldgen.veinsPerChunk, PlatinumConfig.worldgen.minWorldHeight, PlatinumConfig.worldgen.maxWorldHeight, PlatinumConfig.worldgen.veinSpawnChance, PlatinumConfig.worldgen.restrictBiomes, PlatinumConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(LithiumConfig.worldgen.allowedDimensions, dim) && LithiumConfig.worldgen.worldGenEnabled) { addOreSpawn(lithium, world, random, chunkX * 16, chunkZ * 16, LithiumConfig.worldgen.veinsPerChunk, LithiumConfig.worldgen.minWorldHeight, LithiumConfig.worldgen.maxWorldHeight, LithiumConfig.worldgen.veinSpawnChance, LithiumConfig.worldgen.restrictBiomes, LithiumConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(UraniumConfig.worldgen.allowedDimensions, dim) && UraniumConfig.worldgen.worldGenEnabled) { addOreSpawn(uranium, world, random, chunkX * 16, chunkZ * 16, UraniumConfig.worldgen.veinsPerChunk, UraniumConfig.worldgen.minWorldHeight, UraniumConfig.worldgen.maxWorldHeight, UraniumConfig.worldgen.veinSpawnChance, UraniumConfig.worldgen.restrictBiomes, UraniumConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(PlutoniumConfig.worldgen.allowedDimensions, dim) && PlutoniumConfig.worldgen.worldGenEnabled) { addOreSpawn(plutonium, world, random, chunkX * 16, chunkZ * 16, PlutoniumConfig.worldgen.veinsPerChunk, PlutoniumConfig.worldgen.minWorldHeight, PlutoniumConfig.worldgen.maxWorldHeight, PlutoniumConfig.worldgen.veinSpawnChance, PlutoniumConfig.worldgen.restrictBiomes, PlutoniumConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(RubyConfig.worldgen.allowedDimensions, dim) && RubyConfig.worldgen.worldGenEnabled) { addOreSpawn(ruby, world, random, chunkX * 16, chunkZ * 16, RubyConfig.worldgen.veinsPerChunk, RubyConfig.worldgen.minWorldHeight, RubyConfig.worldgen.maxWorldHeight, RubyConfig.worldgen.veinSpawnChance, RubyConfig.worldgen.restrictBiomes, RubyConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(SapphireConfig.worldgen.allowedDimensions, dim) && SapphireConfig.worldgen.worldGenEnabled) { addOreSpawn(sapphire, world, random, chunkX * 16, chunkZ * 16, SapphireConfig.worldgen.veinsPerChunk, SapphireConfig.worldgen.minWorldHeight, SapphireConfig.worldgen.maxWorldHeight, SapphireConfig.worldgen.veinSpawnChance, SapphireConfig.worldgen.restrictBiomes, SapphireConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(AmethystConfig.worldgen.allowedDimensions, dim) && AmethystConfig.worldgen.worldGenEnabled) { addOreSpawn(amethyst, world, random, chunkX * 16, chunkZ * 16, AmethystConfig.worldgen.veinsPerChunk, AmethystConfig.worldgen.minWorldHeight, AmethystConfig.worldgen.maxWorldHeight, AmethystConfig.worldgen.veinSpawnChance, AmethystConfig.worldgen.restrictBiomes, AmethystConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(CrystalConfig.worldgen.allowedDimensions, dim) && CrystalConfig.worldgen.worldGenEnabled) { addOreSpawn(crystal, world, random, chunkX * 16, chunkZ * 16, CrystalConfig.worldgen.veinsPerChunk, CrystalConfig.worldgen.minWorldHeight, CrystalConfig.worldgen.maxWorldHeight, CrystalConfig.worldgen.veinSpawnChance, CrystalConfig.worldgen.restrictBiomes, CrystalConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(MagnesiumConfig.worldgen.allowedDimensions, dim) && MagnesiumConfig.worldgen.worldGenEnabled) { addOreSpawn(magnesium, world, random, chunkX * 16, chunkZ * 16, MagnesiumConfig.worldgen.veinsPerChunk, MagnesiumConfig.worldgen.minWorldHeight, MagnesiumConfig.worldgen.maxWorldHeight, MagnesiumConfig.worldgen.veinSpawnChance, MagnesiumConfig.worldgen.restrictBiomes, MagnesiumConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(PhosphorusConfig.worldgen.allowedDimensions, dim) && PhosphorusConfig.worldgen.worldGenEnabled) { addOreSpawn(phosphorus, world, random, chunkX * 16, chunkZ * 16, PhosphorusConfig.worldgen.veinsPerChunk, PhosphorusConfig.worldgen.minWorldHeight, PhosphorusConfig.worldgen.maxWorldHeight, PhosphorusConfig.worldgen.veinSpawnChance, PhosphorusConfig.worldgen.restrictBiomes, PhosphorusConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(SulfurConfig.worldgen.allowedDimensions, dim) && SulfurConfig.worldgen.worldGenEnabled) { addOreSpawn(sulfur, world, random, chunkX * 16, chunkZ * 16, SulfurConfig.worldgen.veinsPerChunk, SulfurConfig.worldgen.minWorldHeight, SulfurConfig.worldgen.maxWorldHeight, SulfurConfig.worldgen.veinSpawnChance, SulfurConfig.worldgen.restrictBiomes, SulfurConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(SilvaniteConfig.worldgen.allowedDimensions, dim) && SilvaniteConfig.worldgen.worldGenEnabled) { addOreSpawn(silvanite, world, random, chunkX * 16, chunkZ * 16, SilvaniteConfig.worldgen.veinsPerChunk, SilvaniteConfig.worldgen.minWorldHeight, SilvaniteConfig.worldgen.maxWorldHeight, SilvaniteConfig.worldgen.veinSpawnChance, SilvaniteConfig.worldgen.restrictBiomes, SilvaniteConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(MerciliteConfig.worldgen.allowedDimensions, dim) && MerciliteConfig.worldgen.worldGenEnabled) { addOreSpawn(mercilite, world, random, chunkX * 16, chunkZ * 16, MerciliteConfig.worldgen.veinsPerChunk, MerciliteConfig.worldgen.minWorldHeight, MerciliteConfig.worldgen.maxWorldHeight, MerciliteConfig.worldgen.veinSpawnChance, MerciliteConfig.worldgen.restrictBiomes, MerciliteConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(MythianConfig.worldgen.allowedDimensions, dim) && MythianConfig.worldgen.worldGenEnabled) { addOreSpawn(mythian, world, random, chunkX * 16, chunkZ * 16, MythianConfig.worldgen.veinsPerChunk, MythianConfig.worldgen.minWorldHeight, MythianConfig.worldgen.maxWorldHeight, MythianConfig.worldgen.veinSpawnChance, MythianConfig.worldgen.restrictBiomes, MythianConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(DragiteConfig.worldgen.allowedDimensions, dim) && DragiteConfig.worldgen.worldGenEnabled) { addOreSpawn(dragite, world, random, chunkX * 16, chunkZ * 16, DragiteConfig.worldgen.veinsPerChunk, DragiteConfig.worldgen.minWorldHeight, DragiteConfig.worldgen.maxWorldHeight, DragiteConfig.worldgen.veinSpawnChance, DragiteConfig.worldgen.restrictBiomes, DragiteConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(FlariteConfig.worldgen.allowedDimensions, dim) && FlariteConfig.worldgen.worldGenEnabled) { addOreSpawn(flarite, world, random, chunkX * 16, chunkZ * 16, FlariteConfig.worldgen.veinsPerChunk, FlariteConfig.worldgen.minWorldHeight, FlariteConfig.worldgen.maxWorldHeight, FlariteConfig.worldgen.veinSpawnChance, FlariteConfig.worldgen.restrictBiomes, FlariteConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(FureniumConfig.worldgen.allowedDimensions, dim) && FureniumConfig.worldgen.worldGenEnabled) { addOreSpawn(furenium, world, random, chunkX * 16, chunkZ * 16, FureniumConfig.worldgen.veinsPerChunk, FureniumConfig.worldgen.minWorldHeight, FureniumConfig.worldgen.maxWorldHeight, FureniumConfig.worldgen.veinSpawnChance, FureniumConfig.worldgen.restrictBiomes, FureniumConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(BlackstoneConfig.worldgen.allowedDimensions, dim) && BlackstoneConfig.worldgen.worldGenEnabled) { addOreSpawn(blackstone, world, random, chunkX * 16, chunkZ * 16, BlackstoneConfig.worldgen.veinsPerChunk, BlackstoneConfig.worldgen.minWorldHeight, BlackstoneConfig.worldgen.maxWorldHeight, BlackstoneConfig.worldgen.veinSpawnChance, BlackstoneConfig.worldgen.restrictBiomes, BlackstoneConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(BluestoneConfig.worldgen.allowedDimensions, dim) && BluestoneConfig.worldgen.worldGenEnabled) { addOreSpawn(bluestone, world, random, chunkX * 16, chunkZ * 16, BluestoneConfig.worldgen.veinsPerChunk, BluestoneConfig.worldgen.minWorldHeight, BluestoneConfig.worldgen.maxWorldHeight, BluestoneConfig.worldgen.veinSpawnChance, BluestoneConfig.worldgen.restrictBiomes, BluestoneConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(PurplestoneConfig.worldgen.allowedDimensions, dim) && PurplestoneConfig.worldgen.worldGenEnabled) { addOreSpawn(purplestone, world, random, chunkX * 16, chunkZ * 16, PurplestoneConfig.worldgen.veinsPerChunk, PurplestoneConfig.worldgen.minWorldHeight, PurplestoneConfig.worldgen.maxWorldHeight, PurplestoneConfig.worldgen.veinSpawnChance, PurplestoneConfig.worldgen.restrictBiomes, PurplestoneConfig.worldgen.allowedBiomes); }
	
		if (ArrayUtils.contains(VanillaCoalConfig.worldgen.allowedDimensions, dim) && VanillaCoalConfig.worldgen.worldGenEnabled) { addOreSpawn(coal, world, random, chunkX * 16, chunkZ * 16, VanillaCoalConfig.worldgen.veinsPerChunk, VanillaCoalConfig.worldgen.minWorldHeight, VanillaCoalConfig.worldgen.maxWorldHeight, VanillaCoalConfig.worldgen.veinSpawnChance, VanillaCoalConfig.worldgen.restrictBiomes, VanillaCoalConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(VanillaIronConfig.worldgen.allowedDimensions, dim) && VanillaIronConfig.worldgen.worldGenEnabled) { addOreSpawn(iron, world, random, chunkX * 16, chunkZ * 16, VanillaIronConfig.worldgen.veinsPerChunk, VanillaIronConfig.worldgen.minWorldHeight, VanillaIronConfig.worldgen.maxWorldHeight, VanillaIronConfig.worldgen.veinSpawnChance, VanillaIronConfig.worldgen.restrictBiomes, VanillaIronConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(VanillaGoldConfig.worldgen.allowedDimensions, dim) && VanillaGoldConfig.worldgen.worldGenEnabled) { addOreSpawn(gold, world, random, chunkX * 16, chunkZ * 16, VanillaGoldConfig.worldgen.veinsPerChunk, VanillaGoldConfig.worldgen.minWorldHeight, VanillaGoldConfig.worldgen.maxWorldHeight, VanillaGoldConfig.worldgen.veinSpawnChance, VanillaGoldConfig.worldgen.restrictBiomes, VanillaGoldConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(VanillaDiamondConfig.worldgen.allowedDimensions, dim) && VanillaDiamondConfig.worldgen.worldGenEnabled) { addOreSpawn(diamond, world, random, chunkX * 16, chunkZ * 16, VanillaDiamondConfig.worldgen.veinsPerChunk, VanillaDiamondConfig.worldgen.minWorldHeight, VanillaDiamondConfig.worldgen.maxWorldHeight, VanillaDiamondConfig.worldgen.veinSpawnChance, VanillaDiamondConfig.worldgen.restrictBiomes, VanillaDiamondConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(VanillaLapisLazuliConfig.worldgen.allowedDimensions, dim) && VanillaLapisLazuliConfig.worldgen.worldGenEnabled) { addOreSpawn(lapis, world, random, chunkX * 16, chunkZ * 16, VanillaLapisLazuliConfig.worldgen.veinsPerChunk, VanillaLapisLazuliConfig.worldgen.minWorldHeight, VanillaLapisLazuliConfig.worldgen.maxWorldHeight, VanillaLapisLazuliConfig.worldgen.veinSpawnChance, VanillaLapisLazuliConfig.worldgen.restrictBiomes, VanillaLapisLazuliConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(VanillaRedstoneConfig.worldgen.allowedDimensions, dim) && VanillaRedstoneConfig.worldgen.worldGenEnabled) { addOreSpawn(redstone, world, random, chunkX * 16, chunkZ * 16, VanillaRedstoneConfig.worldgen.veinsPerChunk, VanillaRedstoneConfig.worldgen.minWorldHeight, VanillaRedstoneConfig.worldgen.maxWorldHeight, VanillaRedstoneConfig.worldgen.veinSpawnChance, VanillaRedstoneConfig.worldgen.restrictBiomes, VanillaRedstoneConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(VanillaEmeraldConfig.worldgen.allowedDimensions, dim) && VanillaEmeraldConfig.worldgen.worldGenEnabled) { addOreSpawn(emerald, world, random, chunkX * 16, chunkZ * 16, VanillaEmeraldConfig.worldgen.veinsPerChunk, VanillaEmeraldConfig.worldgen.minWorldHeight, VanillaEmeraldConfig.worldgen.maxWorldHeight, VanillaEmeraldConfig.worldgen.veinSpawnChance, VanillaEmeraldConfig.worldgen.restrictBiomes, VanillaEmeraldConfig.worldgen.allowedBiomes); }
		if (ArrayUtils.contains(VanillaNetherQuartzConfig.worldgen.allowedDimensions, dim) && VanillaNetherQuartzConfig.worldgen.worldGenEnabled) { addOreSpawn(quartz, world, random, chunkX * 16, chunkZ * 16, VanillaNetherQuartzConfig.worldgen.veinsPerChunk, VanillaNetherQuartzConfig.worldgen.minWorldHeight, VanillaNetherQuartzConfig.worldgen.maxWorldHeight, VanillaNetherQuartzConfig.worldgen.veinSpawnChance, VanillaNetherQuartzConfig.worldgen.restrictBiomes, VanillaNetherQuartzConfig.worldgen.allowedBiomes); }
	}
		
	private void addOreSpawn(WorldGenMinable wgm, World world, Random random, int x, int z, int vpc, int minY, int maxY, int chance, boolean biomeRestrict, String[] allowedBiomes) {
		int rangeY = maxY - minY;
		for (int i = 0; i < vpc; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(rangeY), z + random.nextInt(16));
			wgm.generate(world, random, pos);
		}
		/*assert (maxY > minY) : "The maximum Y must be greater than the Minimum Y";
	    assert (minY > 0) : "addOreSpawn: The Minimum Y must be greater than 0";
	    assert ((maxY < 256) && (maxY > 0)) : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
	    assert ((chance <= 100) && (chance >= 0)) : "addOreSpawn: The Chance must be between 0 and 100";
	    
		int rangeY = maxY - minY;
		int rnd = random.nextInt(100);
		
		if (wgm.equals(copper)) { COre.debug("TRYING TO ADD ORE SPAWN TO WORLD! RNG number: " + rnd + ", ORE CHANCE: " + chance); }
		
		if (biomeRestrict) {
			if (wgm.equals(copper)) { COre.debug("We are restricting biomes for this ore."); }
			int biome = Biome.getIdForBiome(world.getBiome(new BlockPos(x, 60, z)));
			for (int j = 0; j < allowedBiomes.length; j++) {
				if (biome != CoreUtils.biomeNameToID(allowedBiomes[j])) {
					if (wgm.equals(copper)) { COre.debug("The current biome isn't on the allowed biome list. Cancel it all!"); }
					return;
				} else { 
					if (wgm.equals(copper)) { COre.debug("It's ok, this is the right biome. I'll let you spawn."); }
				}
			}
		}

		COre.debug("Chance success! Adding ore spawn. Time to iterate!");
		for (int i = 0; i < vpc; i++) {
			if (wgm.equals(copper)) { COre.debug("ITERATING: " + i + " of " + vpc + "."); }

			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(rangeY), z + random.nextInt(16));
			
			wgm.generate(world, random, pos);
			
			if (wgm.equals(copper)) { COre.debug("Success! Generated an ore somewhere near " + x + ", " + z); }
		}*/
	}
}
