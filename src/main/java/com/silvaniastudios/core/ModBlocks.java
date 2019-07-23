package com.silvaniastudios.core;

import com.silvaniastudios.core.blocks.BlockBasic;
import com.silvaniastudios.core.blocks.BlockOre1;
import com.silvaniastudios.core.blocks.BlockOre2;
import com.silvaniastudios.core.blocks.BlockRefined1;
import com.silvaniastudios.core.blocks.BlockRefined2;
import com.silvaniastudios.core.blocks.BlockRefined3;
import com.silvaniastudios.core.config.CalciteConfig;
import com.silvaniastudios.core.config.GraphiteConfig;
import com.silvaniastudios.core.config.LimestoneConfig;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockOre1 blockOre1 = new BlockOre1("ore_block_1");
	public static BlockOre2 blockOre2 = new BlockOre2("ore_block_2");
	public static BlockRefined1 blockRefined1 = new BlockRefined1("refined_block_1");
	public static BlockRefined2 blockRefined2 = new BlockRefined2("refined_block_2");
	public static BlockRefined3 blockRefined3 = new BlockRefined3("refined_block_3");
		
	public static Block blockGraphite = new BlockBasic("block_graphite", GraphiteConfig.drops.primaryDroppedItem, GraphiteConfig.drops.secondaryDroppedItem, GraphiteConfig.drops.primaryDropQtyMin, GraphiteConfig.drops.primaryDropQtyMax, GraphiteConfig.drops.secondaryDropQtyMin, GraphiteConfig.drops.secondaryDropQtyMax, GraphiteConfig.drops.primaryDropChance, GraphiteConfig.drops.secondaryDropChance, GraphiteConfig.drops.canFortune, GraphiteConfig.properties.hardnessBlock).setRegistryName("block_graphite").setUnlocalizedName("block_graphite");
	public static Block blockCalcite = new BlockBasic("block_calcite", CalciteConfig.drops.primaryDroppedItem, CalciteConfig.drops.secondaryDroppedItem, CalciteConfig.drops.primaryDropQtyMin, CalciteConfig.drops.primaryDropQtyMax, CalciteConfig.drops.secondaryDropQtyMin, CalciteConfig.drops.secondaryDropQtyMax, CalciteConfig.drops.primaryDropChance, CalciteConfig.drops.secondaryDropChance, CalciteConfig.drops.canFortune, CalciteConfig.properties.hardnessBlock).setRegistryName("block_calcite").setUnlocalizedName("block_calcite");
	public static Block blockLimestone = new BlockBasic("block_limestone", LimestoneConfig.drops.primaryDroppedItem, LimestoneConfig.drops.secondaryDroppedItem, LimestoneConfig.drops.primaryDropQtyMin, LimestoneConfig.drops.primaryDropQtyMax, LimestoneConfig.drops.secondaryDropQtyMin, LimestoneConfig.drops.secondaryDropQtyMax, LimestoneConfig.drops.primaryDropChance, LimestoneConfig.drops.secondaryDropChance, LimestoneConfig.drops.canFortune, LimestoneConfig.properties.hardnessBlock).setRegistryName("block_limestone").setUnlocalizedName("block_limestone");

	public static Block blockFluidSolarium = new BlockFluidFinite(ModFluids.fluidSolarium, Material.LAVA).setRegistryName("block_fluid_solarium").setUnlocalizedName("block_fluid_solarium");
	
	public static Block blockFluidCopper = new BlockFluidFinite(ModFluids.fluidCopper, Material.LAVA).setRegistryName("block_fluid_copper").setUnlocalizedName("block_fluid_copper");
	public static Block blockFluidTin = new BlockFluidFinite(ModFluids.fluidTin, Material.LAVA).setRegistryName("block_fluid_tin").setUnlocalizedName("block_fluid_tin");
	public static Block blockFluidZinc = new BlockFluidFinite(ModFluids.fluidZinc, Material.LAVA).setRegistryName("block_fluid_zinc").setUnlocalizedName("block_fluid_zinc");
	public static Block blockFluidNickel = new BlockFluidFinite(ModFluids.fluidNickel, Material.LAVA).setRegistryName("block_fluid_nickel").setUnlocalizedName("block_fluid_nickel");
	public static Block blockFluidSilver = new BlockFluidFinite(ModFluids.fluidSilver, Material.LAVA).setRegistryName("block_fluid_silver").setUnlocalizedName("block_fluid_silver");
	public static Block blockFluidAluminium = new BlockFluidFinite(ModFluids.fluidAluminium, Material.LAVA).setRegistryName("block_fluid_aluminium").setUnlocalizedName("block_fluid_aluminium");
	public static Block blockFluidTitanium = new BlockFluidFinite(ModFluids.fluidTitanium, Material.LAVA).setRegistryName("block_fluid_titanium").setUnlocalizedName("block_fluid_titanium");
	public static Block blockFluidChromium = new BlockFluidFinite(ModFluids.fluidChromium, Material.LAVA).setRegistryName("block_fluid_chromium").setUnlocalizedName("block_fluid_chromium");
	public static Block blockFluidSilicon = new BlockFluidFinite(ModFluids.fluidSilicon, Material.LAVA).setRegistryName("block_fluid_silicon").setUnlocalizedName("block_fluid_silicon");
	public static Block blockFluidCobalt = new BlockFluidFinite(ModFluids.fluidCobalt, Material.LAVA).setRegistryName("block_fluid_cobalt").setUnlocalizedName("block_fluid_cobalt");
	public static Block blockFluidTungsten = new BlockFluidFinite(ModFluids.fluidTungsten, Material.LAVA).setRegistryName("block_fluid_tungsten").setUnlocalizedName("block_fluid_tungsten");
	public static Block blockFluidLead = new BlockFluidFinite(ModFluids.fluidLead, Material.LAVA).setRegistryName("block_fluid_lead").setUnlocalizedName("block_fluid_lead");
	public static Block blockFluidPlatinum = new BlockFluidFinite(ModFluids.fluidPlatinum, Material.LAVA).setRegistryName("block_fluid_platinum").setUnlocalizedName("block_fluid_platinum");
	public static Block blockFluidLithium = new BlockFluidFinite(ModFluids.fluidLithium, Material.LAVA).setRegistryName("block_fluid_lithium").setUnlocalizedName("block_fluid_lithium");
	public static Block blockFluidUranium = new BlockFluidFinite(ModFluids.fluidUranium, Material.LAVA).setRegistryName("block_fluid_uranium").setUnlocalizedName("block_fluid_uranium");
	public static Block blockFluidPlutonium = new BlockFluidFinite(ModFluids.fluidPlutonium, Material.LAVA).setRegistryName("block_fluid_plutonium").setUnlocalizedName("block_fluid_plutonium");
	
	public static Block blockFluidRuby = new BlockFluidFinite(ModFluids.fluidRuby, Material.LAVA).setRegistryName("block_fluid_ruby").setUnlocalizedName("block_fluid_ruby");
	public static Block blockFluidSapphire = new BlockFluidFinite(ModFluids.fluidSapphire, Material.LAVA).setRegistryName("block_fluid_sapphire").setUnlocalizedName("block_fluid_sapphire");
	public static Block blockFluidAmethyst = new BlockFluidFinite(ModFluids.fluidAmethyst, Material.LAVA).setRegistryName("block_fluid_amethyst").setUnlocalizedName("block_fluid_amethyst");
	public static Block blockFluidCrystal = new BlockFluidFinite(ModFluids.fluidCrystal, Material.LAVA).setRegistryName("block_fluid_crystal").setUnlocalizedName("block_fluid_crystal");
	public static Block blockFluidMagnesium = new BlockFluidFinite(ModFluids.fluidMagnesium, Material.LAVA).setRegistryName("block_fluid_magnesium").setUnlocalizedName("block_fluid_magnesium");
	public static Block blockFluidPhosphorus = new BlockFluidFinite(ModFluids.fluidPhosphorus, Material.LAVA).setRegistryName("block_fluid_phosphorus").setUnlocalizedName("block_fluid_phosphorus");
	public static Block blockFluidSulfur = new BlockFluidFinite(ModFluids.fluidSulfur, Material.LAVA).setRegistryName("block_fluid_sulfur").setUnlocalizedName("block_fluid_sulfur");
	public static Block blockFluidSilvanite = new BlockFluidFinite(ModFluids.fluidSilvanite, Material.LAVA).setRegistryName("block_fluid_silvanite").setUnlocalizedName("block_fluid_silvanite");
	public static Block blockFluidMercilite = new BlockFluidFinite(ModFluids.fluidMercilite, Material.LAVA).setRegistryName("block_fluid_mercilite").setUnlocalizedName("block_fluid_mercilite");
	public static Block blockFluidMythian = new BlockFluidFinite(ModFluids.fluidMythian, Material.LAVA).setRegistryName("block_fluid_mythian").setUnlocalizedName("block_fluid_mythian");
	public static Block blockFluidDragite = new BlockFluidFinite(ModFluids.fluidDragite, Material.LAVA).setRegistryName("block_fluid_dragite").setUnlocalizedName("block_fluid_dragite");
	public static Block blockFluidFlarite = new BlockFluidFinite(ModFluids.fluidFlarite, Material.LAVA).setRegistryName("block_fluid_flarite").setUnlocalizedName("block_fluid_flarite");
	public static Block blockFluidFurenium = new BlockFluidFinite(ModFluids.fluidFurenium, Material.LAVA).setRegistryName("block_fluid_furenium").setUnlocalizedName("block_fluid_furenium");
	public static Block blockFluidBlackstone = new BlockFluidFinite(ModFluids.fluidBlackstone, Material.LAVA).setRegistryName("block_fluid_blackstone").setUnlocalizedName("block_fluid_blackstone");
	public static Block blockFluidBluestone = new BlockFluidFinite(ModFluids.fluidBluestone, Material.LAVA).setRegistryName("block_fluid_bluestone").setUnlocalizedName("block_fluid_bluestone");
	public static Block blockFluidPurplestone = new BlockFluidFinite(ModFluids.fluidPurplestone, Material.LAVA).setRegistryName("block_fluid_purplestone").setUnlocalizedName("block_fluid_purplestone");
	
	public static Block blockFluidBronze = new BlockFluidFinite(ModFluids.fluidBronze, Material.LAVA).setRegistryName("block_fluid_bronze").setUnlocalizedName("block_fluid_bronze");
	public static Block blockFluidCupronickel = new BlockFluidFinite(ModFluids.fluidCupronickel, Material.LAVA).setRegistryName("block_fluid_cupronickel").setUnlocalizedName("block_fluid_cupronickel");
	public static Block blockFluidBrass = new BlockFluidFinite(ModFluids.fluidBrass, Material.LAVA).setRegistryName("block_fluid_brass").setUnlocalizedName("block_fluid_brass");
	public static Block blockFluidRoseGold = new BlockFluidFinite(ModFluids.fluidRoseGold, Material.LAVA).setRegistryName("block_fluid_rosegold").setUnlocalizedName("block_fluid_rosegold");
	public static Block blockFluidSteel = new BlockFluidFinite(ModFluids.fluidSteel, Material.LAVA).setRegistryName("block_fluid_steel").setUnlocalizedName("block_fluid_steel");
	public static Block blockFluidStainlessSteel = new BlockFluidFinite(ModFluids.fluidStainlessSteel, Material.LAVA).setRegistryName("block_fluid_stainlesssteel").setUnlocalizedName("block_fluid_stainlesssteel");
	public static Block blockFluidNichrome = new BlockFluidFinite(ModFluids.fluidNichrome, Material.LAVA).setRegistryName("block_fluid_nichrome").setUnlocalizedName("block_fluid_nichrome");
	public static Block blockFluidElectrum = new BlockFluidFinite(ModFluids.fluidElectrum, Material.LAVA).setRegistryName("block_fluid_electrum").setUnlocalizedName("block_fluid_electrum");
	public static Block blockFluidStellite = new BlockFluidFinite(ModFluids.fluidStellite, Material.LAVA).setRegistryName("block_fluid_stellite").setUnlocalizedName("block_fluid_stellite");
	public static Block blockFluidSilvamer = new BlockFluidFinite(ModFluids.fluidSilvamer, Material.LAVA).setRegistryName("block_fluid_silvamer").setUnlocalizedName("block_fluid_silvamer");
	public static Block blockFluidUnium = new BlockFluidFinite(ModFluids.fluidUnium, Material.LAVA).setRegistryName("block_fluid_unium").setUnlocalizedName("block_fluid_unium");
	public static Block blockFluidFenikisite = new BlockFluidFinite(ModFluids.fluidFenikisite, Material.LAVA).setRegistryName("block_fluid_fenikisite").setUnlocalizedName("block_fluid_fenikisite");
	public static Block blockFluidUltimite = new BlockFluidFinite(ModFluids.fluidUltimite, Material.LAVA).setRegistryName("block_fluid_ultimite").setUnlocalizedName("block_fluid_ultimite");
	public static Block blockFluidStrootite = new BlockFluidFinite(ModFluids.fluidStrootite, Material.LAVA).setRegistryName("block_fluid_strootite").setUnlocalizedName("block_fluid_strootite");
	public static Block blockFluidSpeedoi = new BlockFluidFinite(ModFluids.fluidSpeedoi, Material.LAVA).setRegistryName("block_fluid_speedoi").setUnlocalizedName("block_fluid_speedoi");
	public static Block blockFluidLegenite = new BlockFluidFinite(ModFluids.fluidLegenite, Material.LAVA).setRegistryName("block_fluid_legenite").setUnlocalizedName("block_fluid_legenite");
	
	public static Block blockFluidCoal = new BlockFluidFinite(ModFluids.fluidCoal, Material.LAVA).setRegistryName("block_fluid_coal").setUnlocalizedName("block_fluid_coal");
	public static Block blockFluidIron = new BlockFluidFinite(ModFluids.fluidIron, Material.LAVA).setRegistryName("block_fluid_iron").setUnlocalizedName("block_fluid_iron");
	public static Block blockFluidGold = new BlockFluidFinite(ModFluids.fluidGold, Material.LAVA).setRegistryName("block_fluid_gold").setUnlocalizedName("block_fluid_gold");
	public static Block blockFluidDiamond = new BlockFluidFinite(ModFluids.fluidDiamond, Material.LAVA).setRegistryName("block_fluid_diamond").setUnlocalizedName("block_fluid_diamond");
	public static Block blockFluidLapisLazuli = new BlockFluidFinite(ModFluids.fluidLapisLazuli, Material.LAVA).setRegistryName("block_fluid_lapislazuli").setUnlocalizedName("block_fluid_lapislazuli");
	public static Block blockFluidRedstone = new BlockFluidFinite(ModFluids.fluidRedstone, Material.LAVA).setRegistryName("block_fluid_redstone").setUnlocalizedName("block_fluid_redstone");
	public static Block blockFluidEmerald = new BlockFluidFinite(ModFluids.fluidEmerald, Material.LAVA).setRegistryName("block_fluid_emerald").setUnlocalizedName("block_fluid_emerald");
	public static Block blockFluidNetherQuartz = new BlockFluidFinite(ModFluids.fluidNetherQuartz, Material.LAVA).setRegistryName("block_fluid_netherquartz").setUnlocalizedName("block_fluid_netherquartz");
	
	public static Block[] fluidBlockArray = new Block[]{blockFluidCopper, blockFluidTin, blockFluidZinc, blockFluidNickel, blockFluidSilver, blockFluidAluminium, blockFluidTitanium, blockFluidChromium,
			blockFluidSilicon, blockFluidCobalt, blockFluidTungsten, blockFluidLead, blockFluidPlatinum, blockFluidLithium, blockFluidUranium, blockFluidPlutonium,
			blockFluidRuby, blockFluidSapphire, blockFluidAmethyst, blockFluidCrystal, blockFluidMagnesium, blockFluidPhosphorus, blockFluidSulfur, blockFluidSilvanite,
			blockFluidMercilite, blockFluidMythian, blockFluidDragite, blockFluidFlarite, blockFluidFurenium, blockFluidBlackstone, blockFluidBluestone, blockFluidPurplestone, 
			blockFluidBronze, blockFluidCupronickel, blockFluidBrass, blockFluidRoseGold, blockFluidSteel, blockFluidStainlessSteel, blockFluidNichrome, blockFluidElectrum, 
			blockFluidStellite, blockFluidSilvamer, blockFluidUnium, blockFluidFenikisite, blockFluidUltimite, blockFluidStrootite, blockFluidSpeedoi, blockFluidLegenite, 
			blockFluidCoal, blockFluidIron, blockFluidGold, blockFluidDiamond, blockFluidLapisLazuli, blockFluidRedstone, blockFluidEmerald, blockFluidNetherQuartz, 
			blockFluidSolarium};
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				blockOre1,
				blockOre2,
				blockRefined1,
				blockRefined2,
				blockRefined3,
				blockGraphite,
				blockCalcite,
				blockLimestone
		);
		
		for (int i = 0; i < fluidBlockArray.length; i++) {
			registry.register(fluidBlockArray[i]);
		}
	}
	

	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.register(new ItemBlockOre(blockOre1).setRegistryName(blockOre1.getRegistryName()));
		registry.register(new ItemBlockOre(blockOre2).setRegistryName(blockOre2.getRegistryName()));
		registry.register(new ItemBlockOre(blockRefined1).setRegistryName(blockRefined1.getRegistryName()));
		registry.register(new ItemBlockOre(blockRefined2).setRegistryName(blockRefined2.getRegistryName()));
		registry.register(new ItemBlockOre(blockRefined3).setRegistryName(blockRefined3.getRegistryName()));
		
		registry.register(new ItemBlockOre(blockGraphite).setRegistryName(blockGraphite.getRegistryName()));
		registry.register(new ItemBlockOre(blockCalcite).setRegistryName(blockCalcite.getRegistryName()));
		registry.register(new ItemBlockOre(blockLimestone).setRegistryName(blockLimestone.getRegistryName()));
		
		for (int i = 0; i < fluidBlockArray.length; i++) {
			registry.register(new ItemBlock(fluidBlockArray[i]).setRegistryName(fluidBlockArray[i].getRegistryName()));
		}
	}
	
	public static void registerModels() {
		blockOre1.initModel();
		blockOre2.initModel();
		blockRefined1.initModel();
		blockRefined2.initModel();
		blockRefined3.initModel();
		blockGraphite.initModel();
		blockCalcite.initModel();
		blockLimestone.initModel();
		
		for (int i = 0; i < fluidBlockArray.length; i++) {
			initModel(fluidBlockArray[i]);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModel(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(COre.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

}
