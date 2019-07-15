package com.silvaniastudios.core;

import java.util.List;

import javax.annotation.Nullable;

import org.lwjgl.input.Keyboard;

import com.silvaniastudios.core.enums.EnumMaterialDrops;
import com.silvaniastudios.core.enums.EnumMaterialGen;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBlockOre extends ItemBlock {

	public ItemBlockOre(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName(stack) + "." + ((IMetaBlockName) this.block).getSpecialName(stack);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		int meta = stack.getMetadata();
		EnumMaterialGen gen = null;
		EnumMaterialDrops drops = null;
		if (this.getBlock() == ModBlocks.blockOre1) {
			if (meta == 0) {
				gen = EnumMaterialGen.copper;
				drops = EnumMaterialDrops.copper;
			}
			if (meta == 1) {
				gen = EnumMaterialGen.tin;
				drops = EnumMaterialDrops.tin;
			}
			if (meta == 2) {
				gen = EnumMaterialGen.zinc;
				drops = EnumMaterialDrops.zinc;
			}
			if (meta == 3) {
				gen = EnumMaterialGen.nickel;
				drops = EnumMaterialDrops.nickel;
			}
			if (meta == 4) {
				gen = EnumMaterialGen.silver;
				drops = EnumMaterialDrops.silver;
			}
			if (meta == 5) {
				gen = EnumMaterialGen.aluminium;
				drops = EnumMaterialDrops.aluminium;
			}
			if (meta == 6) {
				gen = EnumMaterialGen.titanium;
				drops = EnumMaterialDrops.titanium;
			}
			if (meta == 7) {
				gen = EnumMaterialGen.chromium;
				drops = EnumMaterialDrops.chromium;
			}
			if (meta == 8) {
				gen = EnumMaterialGen.silicon;
				drops = EnumMaterialDrops.silicon;
			}
			if (meta == 9) {
				gen = EnumMaterialGen.cobalt;
				drops = EnumMaterialDrops.cobalt;
			}
			if (meta == 10) {
				gen = EnumMaterialGen.tungsten;
				drops = EnumMaterialDrops.tungsten;
			}
			if (meta == 11) {
				gen = EnumMaterialGen.lead;
				drops = EnumMaterialDrops.lead;
			}
			if (meta == 12) {
				gen = EnumMaterialGen.platinum;
				drops = EnumMaterialDrops.platinum;
			}
			if (meta == 13) {
				gen = EnumMaterialGen.lithium;
				drops = EnumMaterialDrops.lithium;
			}
			if (meta == 14) {
				gen = EnumMaterialGen.uranium;
				drops = EnumMaterialDrops.uranium;
			}
			if (meta == 15) {
				gen = EnumMaterialGen.plutonium;
				drops = EnumMaterialDrops.plutonium;
			}
		}
		
		if (this.getBlock() == ModBlocks.blockOre2) {
			if (meta == 0) {
				gen = EnumMaterialGen.ruby;
				drops = EnumMaterialDrops.copper;
			}
			if (meta == 1) {
				gen = EnumMaterialGen.sapphire;
				drops = EnumMaterialDrops.sapphire;
			}
			if (meta == 2) {
				gen = EnumMaterialGen.amethyst;
				drops = EnumMaterialDrops.amethyst;
			}
			if (meta == 3) {
				gen = EnumMaterialGen.crystal;
				drops = EnumMaterialDrops.crystal;
			}
			if (meta == 4) {
				gen = EnumMaterialGen.magnesium;
				drops = EnumMaterialDrops.magnesium;
			}
			if (meta == 5) {
				gen = EnumMaterialGen.phosphorus;
				drops = EnumMaterialDrops.phosphorus;
			}
			if (meta == 6) {
				gen = EnumMaterialGen.sulfur;
				drops = EnumMaterialDrops.sulfur;
			}
			if (meta == 7) {
				gen = EnumMaterialGen.silvanite;
				drops = EnumMaterialDrops.silvanite;
			}
			if (meta == 8) {
				gen = EnumMaterialGen.mercilite;
				drops = EnumMaterialDrops.mercilite;
			}
			if (meta == 9) {
				gen = EnumMaterialGen.mythian;
				drops = EnumMaterialDrops.mythian;
			}
			if (meta == 10) {
				gen = EnumMaterialGen.dragite;
				drops = EnumMaterialDrops.dragite;
			}
			if (meta == 11) {
				gen = EnumMaterialGen.flarite;
				drops = EnumMaterialDrops.flarite;
			}
			if (meta == 12) {
				gen = EnumMaterialGen.furenium;
				drops = EnumMaterialDrops.furenium;
			}
			if (meta == 13) {
				gen = EnumMaterialGen.blackstone;
				drops = EnumMaterialDrops.blackstone;
			}
			if (meta == 14) {
				gen = EnumMaterialGen.bluestone;
				drops = EnumMaterialDrops.bluestone;
			}
			if (meta == 15) {
				gen = EnumMaterialGen.purplestone;
				drops = EnumMaterialDrops.purplestone;
			}
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
					tooltip.add(TextFormatting.ITALIC + "" + TextFormatting.GOLD + "World Generation is disabled for this ore.");
				}
			} else {
				tooltip.add("Hold shift to view ore details");
			}
		}
	}
}
