package co.uk.silvania.cOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import co.uk.silvania.cOre.blocks.*;
import co.uk.silvania.cOre.fluids.*;

public class COreBlocks {
	
	//private static COreConfig config;
	
	public static Block metaOre1;
	public static Block metaOre2;
	public static Block metaOre3;
	
	public static Block mercuryBlock;
	public static Block oilBlock;
	public static Block tarBlock;
	
	public static Block limestoneBlock;
	public static Block calciteBlock;
	public static Block graphiteBlock;
	
	public static Fluid mercuryFluid;
	public static Fluid oilFluid;
	public static Fluid tarFluid;
	
	public static void init() {
		initBlocks();
		initFluids();
	}

	private static void initBlocks() {
		metaOre1 = new MetaOreBlock1();
		metaOre2 = new MetaOreBlock2();
		metaOre3 = new MetaOreBlock3();
		
		limestoneBlock = new GenericBlock().setBlockName("limestoneBlock");
		calciteBlock = new GenericBlock().setBlockName("calciteBlock");
		graphiteBlock = new GenericBlock().setBlockName("graphiteBlock");
	}
	
	private static void initFluids() {
		mercuryFluid = new Fluid("mercury").setViscosity(4500);
		oilFluid = new Fluid("oil").setDensity(4000).setViscosity(2000);
		tarFluid = new Fluid("tar").setDensity(10000).setViscosity(10000);
		
		FluidRegistry.registerFluid(mercuryFluid);
		FluidRegistry.registerFluid(oilFluid);
		FluidRegistry.registerFluid(tarFluid);
		
		mercuryBlock = new MercuryFluidBlock(mercuryFluid, Material.water).setBlockName("mercury");
		oilBlock = new OilFluidBlock(oilFluid, Material.water).setBlockName("oil");
		tarBlock = new TarFluidBlock(tarFluid, Material.water).setBlockName("tar");
	}
}
