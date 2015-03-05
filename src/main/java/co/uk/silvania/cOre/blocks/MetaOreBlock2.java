package co.uk.silvania.cOre.blocks;

import java.util.Random;

import net.minecraft.item.Item;
import net.minecraft.world.World;
import co.uk.silvania.cOre.COreItems;

public class MetaOreBlock2 extends MetaOre {

	public MetaOreBlock2() {
		this.setHardness(3.0F);
		this.setBlockName("metaOres2");
		this.setHarvestLevel("pickaxe", 2, 0); //Calcium
		this.setHarvestLevel("pickaxe", 2, 1); //Lanathum
		this.setHarvestLevel("pickaxe", 2, 2); //Cerium
		this.setHarvestLevel("pickaxe", 2, 3); //Promethium
		this.setHarvestLevel("pickaxe", 2, 4); //Uranium
		this.setHarvestLevel("pickaxe", 2, 5); //Plutonium
		this.setHarvestLevel("pickaxe", 3, 6); //Technetium
		this.setHarvestLevel("pickaxe", 2, 7); //Tantalum
		this.setHarvestLevel("pickaxe", 2, 8); //Scandium
		this.setHarvestLevel("pickaxe", 1, 9); //Aluminium
		this.setHarvestLevel("pickaxe", 3, 10); //Gallium
		this.setHarvestLevel("pickaxe", 3, 11); //Indium
		this.setHarvestLevel("pickaxe", 3, 12); //Thallium
		this.setHarvestLevel("pickaxe", 1, 13); //Tecmonium
		this.setHarvestLevel("pickaxe", 1, 14); //Silvanite
		this.setHarvestLevel("pickaxe", 1, 15); //Mercilite
	}
	
	@Override
	public boolean canSilkHarvest() {
		return false;
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return COreItems.itemOre;
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta + 16;
	}
	
	@Override
    public int getDamageValue(World world, int x, int y, int z) {
        return world.getBlockMetadata(x, y, z);
    }
}
