package com.silvaniastudios.core.enums;

import com.silvaniastudios.core.config.CopperConfig;

import net.minecraft.item.Item;

public enum EnumMaterialDrops {
	copper(Item.getByNameOrId(itemName(CopperConfig.drops.primaryDroppedItem)), Item.getByNameOrId(itemName(CopperConfig.drops.secondaryDroppedItem)),
			itemMeta(CopperConfig.drops.primaryDroppedItem), itemMeta(CopperConfig.drops.secondaryDroppedItem),
			CopperConfig.drops.primaryDropQtyMin, CopperConfig.drops.primaryDropQtyMax, CopperConfig.drops.secondaryDropQtyMin,
			CopperConfig.drops.secondaryDropQtyMax, CopperConfig.drops.primaryDropChance, CopperConfig.drops.secondaryDropChance,
			CopperConfig.drops.canSilkTouch, CopperConfig.drops.canFortune);
	
	private final Item primaryItem;
	private final Item secondaryItem;
	private final int primaryMeta;
	private final int secondaryMeta;
	private final int primaryQtyMin;
	private final int primaryQtyMax;
	private final int secondaryQtyMin;
	private final int secondaryQtyMax;
	private final int primaryChance;
	private final int secondaryChance;
	private final boolean silkTouch;
	private final boolean fortune;
	
	private EnumMaterialDrops(Item priItem, Item secItem, int priMeta, int secMeta, int priQtyMin, int priQtyMax, int secQtyMin, int secQtyMax,
			int priChance, int secChance, boolean silk, boolean fortune) {
		this.primaryItem = priItem;
		this.secondaryItem = secItem;
		this.primaryMeta = priMeta;
		this.secondaryMeta = secMeta;
		this.primaryQtyMin = priQtyMin;
		this.primaryQtyMax = priQtyMax;
		this.secondaryQtyMin = secQtyMin;
		this.secondaryQtyMax = secQtyMax;
		this.primaryChance = priChance;
		this.secondaryChance = secChance;
		this.silkTouch = silk;
		this.fortune = fortune;
	}

	public static EnumMaterialDrops lookupMetal(String name) {
		return EnumMaterialDrops.valueOf(name);
    }
	
	private static String itemName(String name) {
		if (name.matches("^.*\\d$")) {
        	return name.substring(0, name.lastIndexOf(":"));
    	}
		return name;
	}
	
	private static int itemMeta(String name) {
		if (name.matches("^.*\\d$")) {
			return Integer.parseInt(name.substring(name.lastIndexOf(":") + 1));
    	}
		return 0;
	}
	
	public Item primaryItem() {
		return this.primaryItem;
	}
	
	public Item secondaryItem() {
		return this.secondaryItem;
	}
	
	public int primaryMeta() {
		return this.primaryMeta;
	}
	
	public int secondaryMeta() {
		return this.secondaryMeta;
	}
	
	public int primaryDropMin() {
		return this.primaryQtyMin;
	}
	
	public int primaryDropMax() {
		return this.primaryQtyMax;
	}
	
	public int secondaryDropMin() {
		return this.secondaryQtyMin;
	}
	
	public int secondaryDropMax() {
		return this.secondaryQtyMax;
	}
	
	public int primaryChance() { 
		return this.primaryChance;
	}
	
	public int secondaryChance() {
		return this.secondaryChance;
	}
	
	public boolean canSilkTouch() {
		return this.silkTouch;
	}
	
	public boolean canFortune() {
		return this.fortune;
	}
}