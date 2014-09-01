package co.uk.silvania.cOre.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemOre2 extends ItemBlock {
	
	private final static String[] NAMES = {
		"Calcium",
		"Lanathum",
		"Cerium",
		"Promethium",
		"Uranium",
		"Plutonium",
		"Technetium",
		"Tantalum",
		"Scandium",
		"Aluminium",
		"Gallium",
		"Silicon",
		"Thallium",
		"Tecmonium",
		"Silvanite",
		"Mercilite"
	};

	public ItemOre2(Block block) {
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
