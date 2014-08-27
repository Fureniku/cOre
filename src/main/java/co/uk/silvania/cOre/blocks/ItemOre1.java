package co.uk.silvania.cOre.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemOre1 extends ItemBlock {
	
	private final static String[] NAMES = {
		"Copper",
		"Tin",
		"Zinc",
		"Nickel",
		"Silver",
		"Cobalt",
		"Titanium",
		"Chromium",
		"Manganese",
		"Cadmium",
		"Tungsten",
		"Lead",
		"Platinum",
		"Lithium",
		"Potassium",
		"Magnesium"
	};

	public ItemOre1(Block block) {
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
