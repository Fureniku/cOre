package co.uk.silvania.cOre;

import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidContainerRegistry;
import co.uk.silvania.cOre.fluids.MercuryBucket;
import co.uk.silvania.cOre.fluids.OilBucket;
import co.uk.silvania.cOre.fluids.TarBucket;
import co.uk.silvania.cOre.items.ItemCrushed;
import co.uk.silvania.cOre.items.ItemDusts;
import co.uk.silvania.cOre.items.ItemGems;
import co.uk.silvania.cOre.items.ItemIngots;
import co.uk.silvania.cOre.items.ItemNuggets;
import co.uk.silvania.cOre.items.ItemOres;
import co.uk.silvania.cOre.items.ItemWashed;

public class COreItems {
	
	public static Item itemOre;
	public static Item itemDust;
	public static Item itemGem;
	public static Item itemIngot;
	public static Item itemNugget;
	public static Item itemCrushed;
	public static Item itemWashed;
	
	public static Item mercuryBucket;
	public static Item oilBucket;
	public static Item tarBucket;
	
	public static void init() {
		initMinerals();
		initBuckets();
	}
	
	public static void initMinerals() {
		itemOre = new ItemOres().setUnlocalizedName("itemOres");
		itemDust = new ItemDusts().setUnlocalizedName("itemDusts");
		itemGem = new ItemGems().setUnlocalizedName("itemGems");
		itemIngot = new ItemIngots().setUnlocalizedName("itemIngots");
		itemNugget = new ItemNuggets().setUnlocalizedName("itemNuggets");
		itemCrushed = new ItemCrushed().setUnlocalizedName("itemCrushed");
		itemWashed = new ItemWashed().setUnlocalizedName("itemWashed");
	}
	
	public static void initBuckets() {
		mercuryBucket = new MercuryBucket(COreBlocks.mercuryBlock).setUnlocalizedName("mercuryBucket");
		oilBucket = new OilBucket(COreBlocks.oilBlock).setUnlocalizedName("oilBucket");
		tarBucket = new TarBucket(COreBlocks.tarBlock).setUnlocalizedName("tarBucket");
	}
}
