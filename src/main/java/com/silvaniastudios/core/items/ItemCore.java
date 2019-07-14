package com.silvaniastudios.core.items;

import java.text.DecimalFormat;
import java.util.List;

import javax.annotation.Nullable;

import com.silvaniastudios.core.COre;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCore extends Item {
	
	protected String name;
	protected String[] information;
	protected String type;
	protected boolean alloy;
	protected String[] alloyComponent;
	protected int[] alloyComponentAmount;	
	
	public ItemCore(String name, String[] information, String type, boolean alloy, String[] alloyComponent, int[] alloyComponentAmount) {
		this.name = name;
		this.information = information;
		this.type = type;
		this.alloy = alloy;
		this.alloyComponent = alloyComponent;
		this.alloyComponentAmount = alloyComponentAmount;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(COre.tabCOre);
	}
	
	public void registerItemModel() {
		COre.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (information[3].length() >= 1) {
			tooltip.add(information[3]);
		}
		int weight = parseInt(information[0]);
		DecimalFormat frmt = new DecimalFormat("#.00");	
		double weightIngot = weight/9.0;
		double weightNugget = weight/81.0;
		double weightImpure = ((weight/9.0)*2)+279.5;
		
		if (type.equalsIgnoreCase("ingot") || type.equalsIgnoreCase("dust")) {
			tooltip.add("Weight: " + frmt.format(weightIngot) + " KG (This stack: " + frmt.format(stack.getCount()*weightIngot) + " KG)");
		} else if (type.equalsIgnoreCase("dustTiny") || type.equalsIgnoreCase("nugget")) {
			tooltip.add("Weight: " + frmt.format(weightNugget) + " KG (This stack: " + frmt.format(stack.getCount()*weightNugget) + " KG)");
		} else { //Ore form or impure dust. Still contains elements of stone (279.5kg)
			tooltip.add("Weight: " + frmt.format(weightImpure) + " KG. (This stack: " + frmt.format(stack.getCount()*weightImpure) + " KG)");
		}
		tooltip.add("Material Durability Rating: " + information[1]);
		tooltip.add("Melting Point: " + information[2] + " C");
		
		if (alloy) {
			if (alloyComponentAmount.length == alloyComponent.length) {
				tooltip.add(" ");
				tooltip.add("Alloy composition:");
				for (int i = 0; i < alloyComponent.length; i++) {
					tooltip.add(alloyComponentAmount[i] + " parts " + alloyComponent[i]);
				}
			} else {
				System.out.println("ERROR! " + name + " ALLOY INFORMATION IS INCORRECT! Please revise configs. The total values in both arrays must be equally matched!");
			}
		}

		if (information.length > 4) {
			tooltip.add(" ");
		}
		for (int i = 4; i < information.length; i++) {
			tooltip.add(information[i]);
		}
    }
	
	public int parseInt(String s) {
		try {
			return Integer.parseInt("" + s);
		} catch (NumberFormatException ex) {
			return 0;
		}
	}
}
