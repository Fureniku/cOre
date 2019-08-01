package com.silvaniastudios.core;

import java.util.List;

import org.lwjgl.input.Keyboard;

import com.silvaniastudios.core.enums.EnumMaterialDrops;
import com.silvaniastudios.core.enums.EnumMaterialGen;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientEvents {
	
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
