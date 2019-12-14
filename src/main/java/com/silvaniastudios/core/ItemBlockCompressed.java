package com.silvaniastudios.core;

import java.util.List;

import javax.annotation.Nullable;

import com.silvaniastudios.core.blocks.BlockCompressed;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBlockCompressed extends ItemBlock {

	public ItemBlockCompressed(Block block) {
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
		if (this.getBlock() instanceof BlockCompressed) {
			BlockCompressed block = (BlockCompressed) this.getBlock();
			TextFormatting lg = TextFormatting.GRAY;
			TextFormatting dg = TextFormatting.DARK_GRAY;
			
			if (meta == 0) {
				tooltip.add(lg + "Double compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "9 blocks");
			}
			if (meta == 1) {
				tooltip.add(lg + "Triple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "81 blocks");
			}
			if (meta == 2) {
				tooltip.add(lg + "Quadruple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "729 blocks");
			}
			if (meta == 3) {
				tooltip.add(lg + "Quintuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "6,561 blocks");
			}
			if (meta == 4) {
				tooltip.add(lg + "Sextuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "59,049 blocks");
			}
			if (meta == 5) {
				tooltip.add(lg + "Septuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "531,441 blocks");
			}
			if (meta == 6) {
				tooltip.add(lg + "Octuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "4,782,969 blocks");
			}
			if (meta == 7) {
				tooltip.add(lg + "Nonuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "43,046,721 blocks");
			}
			if (meta == 8) {
				tooltip.add(lg + "Decuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "387,420,489 blocks");
			}
			if (meta == 9) {
				tooltip.add(lg + "Undecuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "3,486,784,401 blocks");
			}
			if (meta == 10) {
				tooltip.add(lg + "Duodecuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "31,381,059,609 blocks");
			}
			if (meta == 11) {
				tooltip.add(lg + "Tredecuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "282,429,536,481 blocks");
			}
			if (meta == 12) {
				tooltip.add(lg + "Quattuordecuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "2,541,865,828,329 blocks");
			}
			if (meta == 13) {
				tooltip.add(lg + "Quindecuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "22,876,792,454,961 blocks");
			}
			if (meta == 14) {
				tooltip.add(lg + "Sexdecuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "205,891,132,094,649 blocks");
			}
			if (meta == 15) {
				tooltip.add(lg + "Septendecuple compressed " + block.baseBlock.getDisplayName());
				tooltip.add(dg + "1,853,020,188,851,841 blocks");
				tooltip.add("We all know you cheated if you have this one.");
			}
		}

	}
}
