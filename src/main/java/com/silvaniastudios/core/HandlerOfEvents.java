package com.silvaniastudios.core;

import java.util.Random;

import com.silvaniastudios.core.blocks.BlockCore;
import com.silvaniastudios.core.config.VanillaCoalConfig;
import com.silvaniastudios.core.config.VanillaDiamondConfig;
import com.silvaniastudios.core.config.VanillaEmeraldConfig;
import com.silvaniastudios.core.config.VanillaGoldConfig;
import com.silvaniastudios.core.config.VanillaIronConfig;
import com.silvaniastudios.core.config.VanillaLapisLazuliConfig;
import com.silvaniastudios.core.config.VanillaNetherQuartzConfig;
import com.silvaniastudios.core.config.VanillaRedstoneConfig;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class HandlerOfEvents {
	
	//DIAMOND, GOLD, LAPIS, REDSTONE, QUARTZ, EMERALD
	
	@SubscribeEvent
	public void onOreGeneration(OreGenEvent.GenerateMinable event) {
		//Disable ores relative to whether cOre will handle their generation.
		if (event.getType().equals(OreGenEvent.GenerateMinable.EventType.COAL)) { 		if (VanillaCoalConfig.worldgen.worldGenEnabled) { event.setResult(Result.DENY); }}
		if (event.getType().equals(OreGenEvent.GenerateMinable.EventType.IRON)) { 		if (VanillaIronConfig.worldgen.worldGenEnabled) { event.setResult(Result.DENY); COre.debug("Denying iron spawn"); }}
		if (event.getType().equals(OreGenEvent.GenerateMinable.EventType.GOLD)) { 		if (VanillaGoldConfig.worldgen.worldGenEnabled) { event.setResult(Result.DENY); }}
		if (event.getType().equals(OreGenEvent.GenerateMinable.EventType.DIAMOND)) { 	if (VanillaDiamondConfig.worldgen.worldGenEnabled) { event.setResult(Result.DENY); }}
		if (event.getType().equals(OreGenEvent.GenerateMinable.EventType.LAPIS)) { 		if (VanillaLapisLazuliConfig.worldgen.worldGenEnabled) { event.setResult(Result.DENY); }}
		if (event.getType().equals(OreGenEvent.GenerateMinable.EventType.REDSTONE)) { 	if (VanillaRedstoneConfig.worldgen.worldGenEnabled) { event.setResult(Result.DENY); }}
		if (event.getType().equals(OreGenEvent.GenerateMinable.EventType.EMERALD)) { 	if (VanillaEmeraldConfig.worldgen.worldGenEnabled) { event.setResult(Result.DENY); }}
		if (event.getType().equals(OreGenEvent.GenerateMinable.EventType.QUARTZ)) { 	if (VanillaNetherQuartzConfig.worldgen.worldGenEnabled) { event.setResult(Result.DENY); }}
	}
	
	@SubscribeEvent
	public void onHarvestDrops(HarvestDropsEvent event) {
		Block block = event.getState().getBlock();
		BlockCore bc = new BlockCore();
		Random rand = event.getWorld().rand;
		
		if (block.getUnlocalizedName().equalsIgnoreCase("tile.oreCoal") && VanillaCoalConfig.drops.overrideVanillaDrop) {
			event.getDrops().clear();
			VanillaCoalConfig.Drops cfg = new VanillaCoalConfig.Drops();
			bc.processDrops((NonNullList<ItemStack>) event.getDrops(), rand, event.getState(), event.getFortuneLevel(), cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin, cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance);
		}
		if (block.getUnlocalizedName().equalsIgnoreCase("tile.oreIron")) {
			event.getDrops().clear();
			VanillaIronConfig.Drops cfg = new VanillaIronConfig.Drops();
			bc.processDrops((NonNullList<ItemStack>) event.getDrops(), rand, event.getState(), event.getFortuneLevel(), cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin, cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance);
		}
		if (block.getUnlocalizedName().equalsIgnoreCase("tile.oreGold")) {
			event.getDrops().clear();
			VanillaGoldConfig.Drops cfg = new VanillaGoldConfig.Drops();
			bc.processDrops((NonNullList<ItemStack>) event.getDrops(), rand, event.getState(), event.getFortuneLevel(), cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin, cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance);
		}
		if (block.getUnlocalizedName().equalsIgnoreCase("tile.oreLapis")) {
			event.getDrops().clear();
			VanillaLapisLazuliConfig.Drops cfg = new VanillaLapisLazuliConfig.Drops();
			bc.processDrops((NonNullList<ItemStack>) event.getDrops(), rand, event.getState(), event.getFortuneLevel(), cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin, cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance);
		}
		if (block.getUnlocalizedName().equalsIgnoreCase("tile.oreDiamond")) {
			event.getDrops().clear();
			VanillaDiamondConfig.Drops cfg = new VanillaDiamondConfig.Drops();
			bc.processDrops((NonNullList<ItemStack>) event.getDrops(), rand, event.getState(), event.getFortuneLevel(), cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin, cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance);
		}
		if (block.getUnlocalizedName().equalsIgnoreCase("tile.oreRedstone")) {
			event.getDrops().clear();
			VanillaRedstoneConfig.Drops cfg = new VanillaRedstoneConfig.Drops();
			bc.processDrops((NonNullList<ItemStack>) event.getDrops(), rand, event.getState(), event.getFortuneLevel(), cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin, cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance);
		}
		if (block.getUnlocalizedName().equalsIgnoreCase("tile.oreEmerald")) {
			event.getDrops().clear();
			VanillaEmeraldConfig.Drops cfg = new VanillaEmeraldConfig.Drops();
			bc.processDrops((NonNullList<ItemStack>) event.getDrops(), rand, event.getState(), event.getFortuneLevel(), cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin, cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance);
		}
		if (block.getUnlocalizedName().equalsIgnoreCase("tile.netherquartz")) {
			event.getDrops().clear();
			VanillaNetherQuartzConfig.Drops cfg = new VanillaNetherQuartzConfig.Drops();
			bc.processDrops((NonNullList<ItemStack>) event.getDrops(), rand, event.getState(), event.getFortuneLevel(), cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin, cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance);
		}
	}
}
