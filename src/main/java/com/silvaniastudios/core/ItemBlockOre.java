package com.silvaniastudios.core;

import java.util.List;

import javax.annotation.Nullable;

import com.silvaniastudios.core.enums.EnumMaterialDrops;
import com.silvaniastudios.core.enums.EnumMaterialGen;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
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
		EnumMaterialGen gen = EnumMaterialGen.copper;
		EnumMaterialDrops drops = EnumMaterialDrops.copper;
		if (this.getBlock() == ModBlocks.blockOre1) {
			if (meta == 0) {
				gen = EnumMaterialGen.copper;
				drops = EnumMaterialDrops.copper;
			}
		}
		
		if (this.getBlock() == ModBlocks.blockOre2) {
			
		}
		
		TextFormatting tw = TextFormatting.WHITE;
		TextFormatting tg = TextFormatting.GREEN;
		TextFormatting tdg = TextFormatting.DARK_GREEN;
		TextFormatting ty = TextFormatting.YELLOW;
		ItemStack primary = new ItemStack(drops.primaryItem(), 1, drops.primaryMeta());
		ItemStack secondary = null;
		if (drops.secondaryItem() != null) { secondary = new ItemStack(drops.secondaryItem(), 1, drops.secondaryMeta()); }
		if (Minecraft.getMinecraft().player.isSneaking()) {
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
				if (drops.canSilkTouch()) {
					tooltip.add(tg + "  Silk touch will drop this ore as a block.");
				} else { 
					tooltip.add(tg + "  Silk touch is ineffective on this block.");
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
