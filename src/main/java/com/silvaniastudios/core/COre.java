package com.silvaniastudios.core;

import com.silvaniastudios.core.config._COreConfig;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = COre.MODID, version = COre.VERSION, updateJSON = "http://www.silvaniastudios.com/mods/update/cOre.json", dependencies = "after:cofhcore;after:cofhworld;after:tconstruct")
public class COre {
	
	public static final String MODID = "core";
	public static final String VERSION = "1.0.10";
	
	@SidedProxy(clientSide = "com.silvaniastudios.core.client.ClientProxy", serverSide = "com.silvaniastudios.core.CommonProxy")
	public static CommonProxy proxy;
	
	public static final CreativeTabs tabCOre = new CreativeTabs("cOre") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.blockOre1, 1, 0);
		}
	};
	
	static {
		FluidRegistry.enableUniversalBucket();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new WorldGen(), 500);
		ModFluids.registerFluids();
	}
	    
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		MinecraftForge.ORE_GEN_BUS.register(new HandlerOfEvents());
		MinecraftForge.EVENT_BUS.register(new HandlerOfEvents());
		
		if (event.getSide() == Side.CLIENT) {
			MinecraftForge.EVENT_BUS.register(new ClientEvents());
		}
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//proxy.postInit(event);
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
	}
	
	public static void debug(int level, String str) {
		if (_COreConfig.general.debugLevel >= level) {
			System.out.println("[cOre]" + str);
		}
	}

}
