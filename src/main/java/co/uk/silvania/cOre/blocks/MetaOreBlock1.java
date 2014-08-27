package co.uk.silvania.cOre.blocks;

import java.util.Random;

import co.uk.silvania.cOre.COreItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MetaOreBlock1 extends MetaOre {

	public MetaOreBlock1() {
		this.setHardness(3.0F);
		this.setBlockName("metaOres1");
		this.setHarvestLevel("pickaxe", 2, 0); //Copper
		this.setHarvestLevel("pickaxe", 2, 1); //Tin
		this.setHarvestLevel("pickaxe", 2, 2); //Zinc
		this.setHarvestLevel("pickaxe", 2, 3); //Nickel
		this.setHarvestLevel("pickaxe", 2, 4); //Silver
		this.setHarvestLevel("pickaxe", 2, 5); //Cobalt
		this.setHarvestLevel("pickaxe", 3, 6); //Titanium
		this.setHarvestLevel("pickaxe", 2, 7); //Chromium
		this.setHarvestLevel("pickaxe", 2, 8); //Manganese
		this.setHarvestLevel("pickaxe", 2, 9); //Cadmium
		this.setHarvestLevel("pickaxe", 3, 10); //Tungsten
		this.setHarvestLevel("pickaxe", 3, 11); //Lead
		this.setHarvestLevel("pickaxe", 3, 12); //Platinum
		this.setHarvestLevel("pickaxe", 1, 13); //Lithium
		this.setHarvestLevel("pickaxe", 1, 14); //Potassium
		this.setHarvestLevel("pickaxe", 1, 15); //Magnesium
	}
	
	@Override
	public boolean canSilkHarvest() {
		return false;
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return new ItemStack(COreItems.itemOre, 1, meta).getItem();
	}
}