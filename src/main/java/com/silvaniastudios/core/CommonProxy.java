package com.silvaniastudios.core;

import com.silvaniastudios.core.config._COreConfig;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
	
	
	
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}
	
	public void preInit(FMLPreInitializationEvent event) {
		if (Loader.isModLoaded("tconstruct")) {
			if (_COreConfig.tcon.aaaTinkersConstructSupport) {
				System.out.println("[cOre] Tinkers Construct detected! Enabling recipes...");
			}
		}
	}

	public void init(FMLInitializationEvent event) {
		OreDictRegistry.oreDict();
		RecipeRegistry.furnaceRecipes();
		if (Loader.isModLoaded("cofhcore")) {
			if (_COreConfig.cofh.aaa_supportEnabled) {
				System.out.println("[cOre] CoFH detected! Enabling recipes...");
				RecipeRegistry.thermalExpansionRecipes();
			} else { 
				System.out.println("[cOre] CoFH is detected, but disabled in the config. Not adding recipes.");
			}
		} else { 
			System.out.println("[cOre] CoFH not detected. Disabling external recipes.");
		}
		
		if (Loader.isModLoaded("tconstruct")) {
			if (_COreConfig.tcon.aaaTinkersConstructSupport) {
				System.out.println("[cOre] Tinkers Construct detected! Enabling recipes...");
				RecipeRegistry.tinkersConstructRecipes();
			} else {
				System.out.println("[cOre] Tinkers Construct is detected, but disabled in the config. Not adding recipes.");
			}
		} else { 
			System.out.println("[cOre] Tinkers Construct not detected. Disabling external recipes.");
		}
	}
}


