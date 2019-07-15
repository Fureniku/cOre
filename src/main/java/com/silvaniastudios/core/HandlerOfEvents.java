package com.silvaniastudios.core;

import java.util.List;
import java.util.Random;

import org.lwjgl.input.Keyboard;

import com.silvaniastudios.core.blocks.BlockCore;
import com.silvaniastudios.core.config.VanillaCoalConfig;
import com.silvaniastudios.core.config.VanillaDiamondConfig;
import com.silvaniastudios.core.config.VanillaEmeraldConfig;
import com.silvaniastudios.core.config.VanillaGoldConfig;
import com.silvaniastudios.core.config.VanillaIronConfig;
import com.silvaniastudios.core.config.VanillaLapisLazuliConfig;
import com.silvaniastudios.core.config.VanillaNetherQuartzConfig;
import com.silvaniastudios.core.config.VanillaRedstoneConfig;
import com.silvaniastudios.core.enums.EnumMaterialDrops;
import com.silvaniastudios.core.enums.EnumMaterialGen;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class HandlerOfEvents {
	
	//COAL, IRON, DIAMOND, GOLD, LAPIS, REDSTONE, QUARTZ, EMERALD
	
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
	
	@SubscribeEvent
	public void onItemTooltip(ItemTooltipEvent event) {
		Block block = Block.getBlockFromItem(event.getItemStack().getItem());
		if (block != null) {
			List<String> tooltip = event.getToolTip();
			EnumMaterialGen gen = null;
			EnumMaterialDrops drops = null;
			if (block == Blocks.COAL_ORE) {
				gen = EnumMaterialGen.coal;
				drops = EnumMaterialDrops.coal;
			}
			if (block == Blocks.IRON_ORE) {
				gen = EnumMaterialGen.iron;
				drops = EnumMaterialDrops.iron;
			}
			if (block == Blocks.GOLD_ORE) {
				gen = EnumMaterialGen.gold;
				drops = EnumMaterialDrops.gold;
			}
			if (block == Blocks.DIAMOND_ORE) {
				gen = EnumMaterialGen.diamond;
				drops = EnumMaterialDrops.diamond;
			}
			if (block == Blocks.REDSTONE_ORE) {
				gen = EnumMaterialGen.redstone;
				drops = EnumMaterialDrops.redstone;
			}
			if (block == Blocks.LAPIS_ORE) {
				gen = EnumMaterialGen.lapis;
				drops = EnumMaterialDrops.lapis;
			}
			if (block == Blocks.EMERALD_ORE) {
				gen = EnumMaterialGen.emerald;
				drops = EnumMaterialDrops.emerald;
			}
			if (block == Blocks.QUARTZ_ORE) {
				gen = EnumMaterialGen.quartz;
				drops = EnumMaterialDrops.quartz;
			}
			
			if (gen != null && drops != null) {
				TextFormatting tw = TextFormatting.WHITE;
				TextFormatting tg = TextFormatting.GREEN;
				TextFormatting tdg = TextFormatting.DARK_GREEN;
				TextFormatting ty = TextFormatting.YELLOW;
				ItemStack primary = new ItemStack(drops.primaryItem(), 1, drops.primaryMeta());
				ItemStack secondary = null;
				if (drops.secondaryItem() != null) { secondary = new ItemStack(drops.secondaryItem(), 1, drops.secondaryMeta()); }
				if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
					if (gen.enabled()) {
						tooltip.add(TextFormatting.BOLD + "" + TextFormatting.GOLD + "WORLD GENERATION");
						tooltip.add(ty + "  Generates between " + tw + gen.minHeight() + ty + " and " + tw + gen.maxHeight());
						tooltip.add(ty + "  Generates veins between " + tw + gen.minVein() + ty + " and " +tw+ gen.maxVein() + ty + " in size.");
						tooltip.add(ty + "  Average of " + tw + gen.vpc() + ty + " possible veins per 16x16 chunk");
						tooltip.add(ty + "  with a " + tw + gen.veinChance() + "%" + ty + " chance of the vein spawning.");
						tooltip.add("");
						
						tooltip.add(TextFormatting.BOLD + "" + tdg + "DROPS");
						if (drops.primaryDropMax() - drops.primaryDropMin() != 0) {
							tooltip.add(tdg + "  (" + drops.primaryChance() + "%) " + tw + drops.primaryDropMin() + "-" + drops.primaryDropMax() + " " + tg + primary.getDisplayName());
						} else {
							tooltip.add(tdg + "  (" + drops.primaryChance() + "%) " + tw + drops.primaryDropMax() + tg + " " + primary.getDisplayName());
						}
						if (secondary != null ) {
							if (drops.secondaryDropMax() - drops.secondaryDropMin() != 0) { 
								tooltip.add(tdg + "  (" + drops.secondaryChance() + "%) " + tw + drops.secondaryDropMin() + "-" + drops.secondaryDropMax() + " " + tg + secondary.getDisplayName());
							} else { 
								tooltip.add(tdg + "  (" + drops.secondaryChance() + "%) " + tw + drops.secondaryDropMax() + " " + tg + secondary.getDisplayName());
							}
						}
						if (drops.canFortune()) {
							tooltip.add(tg + "  Fortune can amplify all dropped items.");
						} else {
							if (secondary != null) {
								tooltip.add(tg + "  Fortune will increase your chance of a secondary drop.");
							} else {
								tooltip.add(tg + "  Fortune is ineffective on this block.");
							}
						}
					} else {
						tooltip.add(TextFormatting.ITALIC + "" + TextFormatting.GOLD + "World Generation uses vanilla values for this ore.");
					}
				} else {
					tooltip.add("Hold shift to view ore details");
				}
			}
		}
	}
}
