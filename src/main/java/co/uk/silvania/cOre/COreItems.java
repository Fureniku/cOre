package co.uk.silvania.cOre;

import co.uk.silvania.cOre.items.*;
import net.minecraft.item.Item;

public class COreItems {
	
	public static Item itemOre;
	public static Item itemDust;
	public static Item itemGem;
	public static Item itemIngot;
	public static Item itemNugget;
	public static Item itemCrushed;
	public static Item itemWashed;
	
	public static void init() {
		initMinerals();
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
}
