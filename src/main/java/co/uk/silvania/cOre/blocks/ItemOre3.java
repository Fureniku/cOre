package co.uk.silvania.cOre.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemOre3 extends ItemBlock {
	
	private final static String[] NAMES = {
		"Dragite",
		"Flarite",
		"Mythril",
		"Adamantite",
		"Sulfur",
		"Ruby",
		"Sapphire",
		"Amethyst",
		"Crystal",
		"Mythian",
		"Blackstone",
		"Bluestone",
		"Purplestone",
		"Iridium",
		"Ardite",
		"Saltpeter"
	};

	public ItemOre3(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	
	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		return NAMES[itemstack.getItemDamage()] + " Ore";
	}
	
	public int getMetadata(int par1) {
		return par1;
	}
}
