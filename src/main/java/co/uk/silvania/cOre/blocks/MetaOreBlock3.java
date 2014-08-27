package co.uk.silvania.cOre.blocks;

import java.util.Random;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import co.uk.silvania.cOre.COreItems;

public class MetaOreBlock3 extends MetaOre {

	public MetaOreBlock3() {
		this.setHardness(3.0F);
		this.setBlockName("metaOres3");
		this.setHarvestLevel("pickaxe", 2, 0); //Dragite
		this.setHarvestLevel("pickaxe", 2, 1); //Flarite
		this.setHarvestLevel("pickaxe", 2, 2); //Mythril
		this.setHarvestLevel("pickaxe", 2, 3); //Adamantite
		this.setHarvestLevel("pickaxe", 2, 4); //Sulfur
		this.setHarvestLevel("pickaxe", 2, 5); //Ruby
		this.setHarvestLevel("pickaxe", 3, 6); //Sapphire
		this.setHarvestLevel("pickaxe", 2, 7); //Amethyst
		this.setHarvestLevel("pickaxe", 2, 8); //Crystal
		this.setHarvestLevel("pickaxe", 2, 9); //Mythian
		this.setHarvestLevel("pickaxe", 3, 10); //Blackstone
		this.setHarvestLevel("pickaxe", 3, 11); //Bluestone
		this.setHarvestLevel("pickaxe", 3, 12); //Purplestone
		this.setHarvestLevel("pickaxe", 1, 13); //Iridium
		this.setHarvestLevel("pickaxe", 1, 14); //Ardite
		this.setHarvestLevel("pickaxe", 1, 15); //
	}
	
	@Override
	public boolean canSilkHarvest() {
		return false;
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		if (meta <= 3) {
			return new ItemStack(COreItems.itemOre, 1, meta + 32).getItem();
		}
		if (meta == 4) {
			return new ItemStack(COreItems.itemDust, 1, 36).getItem();
		}
		if (meta == 5) {
			return new ItemStack(COreItems.itemGem, 1, 0).getItem();
		}
		if (meta == 6) {
			return new ItemStack(COreItems.itemGem, 1, 1).getItem();
		}
		if (meta == 7) {
			return new ItemStack(COreItems.itemGem, 1, 2).getItem();
		}
		if (meta == 8) {
			return new ItemStack(COreItems.itemGem, 1, 3).getItem();
		}
		if (meta == 9) {
			return new ItemStack(COreItems.itemGem, 1, 4).getItem();
		}
		if (meta == 10) {
			return new ItemStack(COreItems.itemDust, 4, 42).getItem();
		}
		if (meta == 11) {
			return new ItemStack(COreItems.itemDust, 4, 43).getItem();
		}
		if (meta == 12) {
			return new ItemStack(COreItems.itemDust, 4, 44).getItem();
		}
		if (meta == 13) {
			return new ItemStack(COreItems.itemGem, 1, 5).getItem();
		}
		if (meta == 14) {
			return new ItemStack(COreItems.itemOre, 1, 36).getItem();
		}
		return null;
	}
	
	@Override
	public int damageDropped(int meta) {
		if (meta <= 3) {
			return meta + 32;
		}
		if (meta == 4) {
			return 36;
		}
		if (meta == 5) {
			return 0;
		}
		if (meta == 6) {
			return 1;
		}
		if (meta == 7) {
			return 2;
		}
		if (meta == 8) {
			return 3;
		}
		if (meta == 9) {
			return 4;
		}
		if (meta == 10) {
			return 42;
		}
		if (meta == 11) {
			return 43;
		}
		if (meta == 12) {
			return 44;
		}
		if (meta == 13) {
			return 5;
		}
		if (meta == 14) {
			return 46;
		}
		return 0;
	}
	
	@Override
    public int getDamageValue(World world, int x, int y, int z) {
        return world.getBlockMetadata(x, y, z);
    }
}