package com.silvaniastudios.core;

import java.util.List;

import javax.annotation.Nullable;

import com.silvaniastudios.core.config.CopperConfig;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
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
		if (this.getBlock() == ModBlocks.blockOre1) { 
			if (meta == 0) { 
				tooltip.add("Drops " + CopperConfig.drops.primaryDropQtyMin + "-" + CopperConfig.drops.primaryDropQtyMax + " " 
						+ Item.getByNameOrId(CopperConfig.drops.primaryDroppedItem));
				
			}
		}
		
		if (this.getBlock() == ModBlocks.blockOre2) {
			
		}
	}
	
	private List<String> createTooltip(Object o, List<String> tooltip) {
		if (o instanceof CopperConfig) {
			CopperConfig cfg = (CopperConfig) o;
		}
		return tooltip;
	}
}
