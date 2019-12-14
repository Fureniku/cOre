package com.silvaniastudios.core.items;

import com.silvaniastudios.core.COre;

import net.minecraft.item.Item;

public class ItemGeneric extends Item {
	
	String name;
	
	public ItemGeneric(String name) {
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(COre.tabCOre);
	}
	
	public void registerItemModel() {
		COre.proxy.registerItemRenderer(this, 0, name);
	}
	

}
