package com.silvaniastudios.core;

import java.util.ArrayList;
import java.util.List;

import com.silvaniastudios.core.config.AlloyBrassConfig;
import com.silvaniastudios.core.config.AlloyBronzeConfig;
import com.silvaniastudios.core.config.AlloyCupronickelConfig;
import com.silvaniastudios.core.config.AlloyElectrumConfig;
import com.silvaniastudios.core.config.AlloyFenikisiteConfig;
import com.silvaniastudios.core.config.AlloyLegeniteConfig;
import com.silvaniastudios.core.config.AlloyNichromeConfig;
import com.silvaniastudios.core.config.AlloyRoseGoldConfig;
import com.silvaniastudios.core.config.AlloySilvamerConfig;
import com.silvaniastudios.core.config.AlloySpeedoiConfig;
import com.silvaniastudios.core.config.AlloyStainlessSteelConfig;
import com.silvaniastudios.core.config.AlloySteelConfig;
import com.silvaniastudios.core.config.AlloyStelliteConfig;
import com.silvaniastudios.core.config.AlloyStrootiteConfig;
import com.silvaniastudios.core.config.AlloyUltimiteConfig;
import com.silvaniastudios.core.config.AlloyUniumConfig;
import com.silvaniastudios.core.config.AluminiumConfig;
import com.silvaniastudios.core.config.AmethystConfig;
import com.silvaniastudios.core.config.BlackstoneConfig;
import com.silvaniastudios.core.config.BluestoneConfig;
import com.silvaniastudios.core.config.ChromiumConfig;
import com.silvaniastudios.core.config.CobaltConfig;
import com.silvaniastudios.core.config.CopperConfig;
import com.silvaniastudios.core.config.CrystalConfig;
import com.silvaniastudios.core.config.DragiteConfig;
import com.silvaniastudios.core.config.FlariteConfig;
import com.silvaniastudios.core.config.FureniumConfig;
import com.silvaniastudios.core.config.LeadConfig;
import com.silvaniastudios.core.config.LithiumConfig;
import com.silvaniastudios.core.config.MagnesiumConfig;
import com.silvaniastudios.core.config.MerciliteConfig;
import com.silvaniastudios.core.config.MythianConfig;
import com.silvaniastudios.core.config.NickelConfig;
import com.silvaniastudios.core.config.PhosphorusConfig;
import com.silvaniastudios.core.config.PlatinumConfig;
import com.silvaniastudios.core.config.PlutoniumConfig;
import com.silvaniastudios.core.config.PurplestoneConfig;
import com.silvaniastudios.core.config.RubyConfig;
import com.silvaniastudios.core.config.SapphireConfig;
import com.silvaniastudios.core.config.SiliconConfig;
import com.silvaniastudios.core.config.SilvaniteConfig;
import com.silvaniastudios.core.config.SilverConfig;
import com.silvaniastudios.core.config.SulfurConfig;
import com.silvaniastudios.core.config.TinConfig;
import com.silvaniastudios.core.config.TitaniumConfig;
import com.silvaniastudios.core.config.TungstenConfig;
import com.silvaniastudios.core.config.UraniumConfig;
import com.silvaniastudios.core.config.ZincConfig;
import com.silvaniastudios.core.config._COreConfig;
import com.silvaniastudios.core.config._ConfigValues;

import cofh.api.util.ThermalExpansionHelper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.BowMaterialStats;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;
import slimeknights.tconstruct.tools.TinkerMaterials;

public class RecipeRegistry {
	
	//SANITY NOTE!!
	//Some things are included, but commented out.
	//That means there is no recipe, and is intentional (For example, you cant make a ruby ingot from ruby dust)
	//I've simply included them so I can count through and make sure I didn't miss a recipe somewhere. They are for my own sanity.
	
	public static void furnaceRecipes() {
		//Smelt dust to ingot
		GameRegistry.addSmelting(ModItems.dustCopper, new ItemStack(ModItems.ingotCopper, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustTin, new ItemStack(ModItems.ingotTin, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustZinc, new ItemStack(ModItems.ingotZinc, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustNickel, new ItemStack(ModItems.ingotNickel, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustSilver, new ItemStack(ModItems.ingotSilver, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustAluminium, new ItemStack(ModItems.ingotAluminium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustTitanium, new ItemStack(ModItems.ingotTitanium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustChromium, new ItemStack(ModItems.ingotChromium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustSilicon, new ItemStack(ModItems.ingotSilicon, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustCobalt, new ItemStack(ModItems.ingotCobalt, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustTungsten, new ItemStack(ModItems.ingotTungsten, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustLead, new ItemStack(ModItems.ingotLead, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustPlatinum, new ItemStack(ModItems.ingotPlatinum, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustLithium, new ItemStack(ModItems.ingotLithium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustUranium, new ItemStack(ModItems.ingotUranium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustPlutonium, new ItemStack(ModItems.ingotPlutonium, 1), 0.5f);
		
		GameRegistry.addSmelting(ModItems.dustMagnesium, new ItemStack(ModItems.ingotMagnesium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustSilvanite, new ItemStack(ModItems.ingotSilvanite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustMercilite, new ItemStack(ModItems.ingotMercilite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustMythian, new ItemStack(ModItems.ingotMythian, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustDragite, new ItemStack(ModItems.ingotDragite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustFlarite, new ItemStack(ModItems.ingotFlarite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustFurenium, new ItemStack(ModItems.ingotFurenium, 1), 0.5f);
		
		GameRegistry.addSmelting(ModItems.dustBronze, new ItemStack(ModItems.ingotBronze, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustCupronickel, new ItemStack(ModItems.ingotCupronickel, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustBrass, new ItemStack(ModItems.ingotBrass, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustRosegold, new ItemStack(ModItems.ingotRosegold, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustSteel, new ItemStack(ModItems.ingotSteel, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustStainlesssteel, new ItemStack(ModItems.ingotStainlesssteel, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustNichrome, new ItemStack(ModItems.ingotNichrome, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustElectrum, new ItemStack(ModItems.ingotElectrum, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustStellite, new ItemStack(ModItems.ingotStellite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustSilvamer, new ItemStack(ModItems.ingotSilvamer, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustUnium, new ItemStack(ModItems.ingotUnium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustFenikisite, new ItemStack(ModItems.ingotFenikisite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustUltimite, new ItemStack(ModItems.ingotUltimite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustStrootite, new ItemStack(ModItems.ingotStrootite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustSpeedoi, new ItemStack(ModItems.ingotSpeedoi, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustLegenite, new ItemStack(ModItems.ingotLegenite, 1), 0.5f);

		//Smelt ore to ingot
		GameRegistry.addSmelting(ModItems.oreCopper, new ItemStack(ModItems.ingotCopper, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreTin, new ItemStack(ModItems.ingotTin, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreZinc, new ItemStack(ModItems.ingotZinc, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreNickel, new ItemStack(ModItems.ingotNickel, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreSilver, new ItemStack(ModItems.ingotSilver, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreAluminium, new ItemStack(ModItems.ingotAluminium, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreTitanium, new ItemStack(ModItems.ingotTitanium, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreChromium, new ItemStack(ModItems.ingotChromium, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreSilicon, new ItemStack(ModItems.ingotSilicon, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreCobalt, new ItemStack(ModItems.ingotCobalt, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreTungsten, new ItemStack(ModItems.ingotTungsten, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreLead, new ItemStack(ModItems.ingotLead, 1), 1f);
		GameRegistry.addSmelting(ModItems.orePlatinum, new ItemStack(ModItems.ingotPlatinum, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreLithium, new ItemStack(ModItems.ingotLithium, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreUranium, new ItemStack(ModItems.ingotUranium, 1), 1f);
		GameRegistry.addSmelting(ModItems.orePlutonium, new ItemStack(ModItems.ingotPlutonium, 1), 1f);
		
		GameRegistry.addSmelting(ModItems.oreMagnesium, new ItemStack(ModItems.ingotMagnesium, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreSilvanite, new ItemStack(ModItems.ingotSilvanite, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreMercilite, new ItemStack(ModItems.ingotMercilite, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreMythian, new ItemStack(ModItems.ingotMythian, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreDragite, new ItemStack(ModItems.ingotDragite, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreFlarite, new ItemStack(ModItems.ingotFlarite, 1), 1f);
		GameRegistry.addSmelting(ModItems.oreFurenium, new ItemStack(ModItems.ingotFurenium, 1), 1f);
		
		GameRegistry.addSmelting(ModItems.oreCoal, new ItemStack(Items.COAL), 1f);
		GameRegistry.addSmelting(ModItems.oreIron, new ItemStack(Items.IRON_INGOT), 1f);
		GameRegistry.addSmelting(ModItems.oreGold, new ItemStack(Items.GOLD_INGOT), 1f);
		GameRegistry.addSmelting(ModItems.oreDiamond, new ItemStack(Items.DIAMOND), 1f);
		GameRegistry.addSmelting(ModItems.oreRedstone, new ItemStack(Items.REDSTONE, 5), 1f);
		GameRegistry.addSmelting(ModItems.oreLapisLazuli, new ItemStack(Items.DYE, 8, 4), 1f);
		GameRegistry.addSmelting(ModItems.oreEmerald, new ItemStack(Items.EMERALD), 1f);
		GameRegistry.addSmelting(ModItems.oreNetherQuartz, new ItemStack(Items.QUARTZ), 1f);
	
		//Smelt impure dust to ingot
		GameRegistry.addSmelting(ModItems.dustImpureCopper, new ItemStack(ModItems.ingotCopper, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureTin, new ItemStack(ModItems.ingotTin, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureZinc, new ItemStack(ModItems.ingotZinc, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureNickel, new ItemStack(ModItems.ingotNickel, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureSilver, new ItemStack(ModItems.ingotSilver, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureAluminium, new ItemStack(ModItems.ingotAluminium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureTitanium, new ItemStack(ModItems.ingotTitanium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureChromium, new ItemStack(ModItems.ingotChromium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureSilicon, new ItemStack(ModItems.ingotSilicon, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureCobalt, new ItemStack(ModItems.ingotCobalt, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureTungsten, new ItemStack(ModItems.ingotTungsten, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureLead, new ItemStack(ModItems.ingotLead, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpurePlatinum, new ItemStack(ModItems.ingotPlatinum, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureLithium, new ItemStack(ModItems.ingotLithium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureUranium, new ItemStack(ModItems.ingotUranium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpurePlutonium, new ItemStack(ModItems.ingotPlutonium, 1), 0.5f);
		
		GameRegistry.addSmelting(ModItems.dustImpureMagnesium, new ItemStack(ModItems.ingotMagnesium, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureSilvanite, new ItemStack(ModItems.ingotSilvanite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureMercilite, new ItemStack(ModItems.ingotMercilite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureMythian, new ItemStack(ModItems.ingotMythian, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureDragite, new ItemStack(ModItems.ingotDragite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureFlarite, new ItemStack(ModItems.ingotFlarite, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.dustImpureFurenium, new ItemStack(ModItems.ingotFurenium, 1), 0.5f);
	
		//Smelt tiny dust to nugget
		GameRegistry.addSmelting(ModItems.dustTinyCopper, new ItemStack(ModItems.nuggetCopper, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyTin, new ItemStack(ModItems.nuggetTin, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyZinc, new ItemStack(ModItems.nuggetZinc, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyNickel, new ItemStack(ModItems.nuggetNickel, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinySilver, new ItemStack(ModItems.nuggetSilver, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyAluminium, new ItemStack(ModItems.nuggetAluminium, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyTitanium, new ItemStack(ModItems.nuggetTitanium, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyChromium, new ItemStack(ModItems.nuggetChromium, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyCobalt, new ItemStack(ModItems.nuggetCobalt, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyTungsten, new ItemStack(ModItems.nuggetTungsten, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyLead, new ItemStack(ModItems.nuggetLead, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyPlatinum, new ItemStack(ModItems.nuggetPlatinum, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyLithium, new ItemStack(ModItems.nuggetLithium, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyUranium, new ItemStack(ModItems.nuggetUranium, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyPlutonium, new ItemStack(ModItems.nuggetPlutonium, 1), 0.2f);
		
		GameRegistry.addSmelting(ModItems.dustTinyMagnesium, new ItemStack(ModItems.nuggetMagnesium, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinySilvanite, new ItemStack(ModItems.nuggetSilvanite, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyMercilite, new ItemStack(ModItems.nuggetMercilite, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyMythian, new ItemStack(ModItems.nuggetMythian, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyDragite, new ItemStack(ModItems.nuggetDragite, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyFlarite, new ItemStack(ModItems.nuggetFlarite, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyFurenium, new ItemStack(ModItems.nuggetFurenium, 1), 0.2f);
		
		GameRegistry.addSmelting(ModItems.dustTinyBronze, new ItemStack(ModItems.nuggetBronze, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyCupronickel, new ItemStack(ModItems.nuggetCupronickel, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyBrass, new ItemStack(ModItems.nuggetBrass, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyRosegold, new ItemStack(ModItems.nuggetRosegold, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinySteel, new ItemStack(ModItems.nuggetSteel, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyStainlesssteel, new ItemStack(ModItems.nuggetStainlesssteel, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyNichrome, new ItemStack(ModItems.nuggetNichrome, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyElectrum, new ItemStack(ModItems.nuggetElectrum, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyStellite, new ItemStack(ModItems.nuggetStellite, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinySilvamer, new ItemStack(ModItems.nuggetSilvamer, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyUnium, new ItemStack(ModItems.nuggetUnium, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyFenikisite, new ItemStack(ModItems.nuggetFenikisite, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyUltimite, new ItemStack(ModItems.nuggetUltimite, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyStrootite, new ItemStack(ModItems.nuggetStrootite, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinySpeedoi, new ItemStack(ModItems.nuggetSpeedoi, 1), 0.2f);
		GameRegistry.addSmelting(ModItems.dustTinyLegenite, new ItemStack(ModItems.nuggetLegenite, 1), 0.2f);
	}
	
	public static void thermalExpansionRecipes() {
		if (_COreConfig.cofh.aaa_disableCoFHRecipes) {
			disableCoFHRecipes();
		}
		
		if (_COreConfig.cofh.pulveriserRecipes) {
			//Ore to ingot
			int oreCrusherEnergyModifier = _COreConfig.cofh.oreCrusherEnergyUsageModifier;
			addTEPulverizerRecipe(CopperConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreCopper, ModItems.dustImpureCopper, CopperConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyCopper, CopperConfig.recipes.oreCrusherSecondaryOutputAmount, CopperConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(TinConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreTin, ModItems.dustImpureTin, TinConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyTin, TinConfig.recipes.oreCrusherSecondaryOutputAmount, TinConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(ZincConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreZinc, ModItems.dustImpureZinc, ZincConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyZinc, ZincConfig.recipes.oreCrusherSecondaryOutputAmount, ZincConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(NickelConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreNickel, ModItems.dustImpureNickel, NickelConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyNickel, NickelConfig.recipes.oreCrusherSecondaryOutputAmount, NickelConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(SilverConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreSilver, ModItems.dustImpureSilver, SilverConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinySilver, SilverConfig.recipes.oreCrusherSecondaryOutputAmount, SilverConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(AluminiumConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreAluminium, ModItems.dustImpureAluminium, AluminiumConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyAluminium, AluminiumConfig.recipes.oreCrusherSecondaryOutputAmount, AluminiumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(TitaniumConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreTitanium, ModItems.dustImpureTitanium, TitaniumConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyTitanium, TitaniumConfig.recipes.oreCrusherSecondaryOutputAmount, TitaniumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(ChromiumConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreChromium, ModItems.dustImpureChromium, ChromiumConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyChromium, ChromiumConfig.recipes.oreCrusherSecondaryOutputAmount, ChromiumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(SiliconConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreSilicon, ModItems.dustImpureSilicon, SiliconConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinySilicon, SiliconConfig.recipes.oreCrusherSecondaryOutputAmount, SiliconConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(CobaltConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreCobalt, ModItems.dustImpureCobalt, CobaltConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyCobalt, CobaltConfig.recipes.oreCrusherSecondaryOutputAmount, CobaltConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(TungstenConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreTungsten, ModItems.dustImpureTungsten, TungstenConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyTungsten, TungstenConfig.recipes.oreCrusherSecondaryOutputAmount, TungstenConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(LeadConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreLead, ModItems.dustImpureLead, LeadConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyLead, LeadConfig.recipes.oreCrusherSecondaryOutputAmount, LeadConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(PlatinumConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.orePlatinum, ModItems.dustImpurePlatinum, PlatinumConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyPlatinum, PlatinumConfig.recipes.oreCrusherSecondaryOutputAmount, PlatinumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(LithiumConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreLithium, ModItems.dustImpureLithium, LithiumConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyLithium, LithiumConfig.recipes.oreCrusherSecondaryOutputAmount, LithiumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(UraniumConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreUranium, ModItems.dustImpureUranium, UraniumConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyUranium, UraniumConfig.recipes.oreCrusherSecondaryOutputAmount, UraniumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(PlutoniumConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.orePlutonium, ModItems.dustImpurePlutonium, PlutoniumConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyPlutonium, PlutoniumConfig.recipes.oreCrusherSecondaryOutputAmount, PlutoniumConfig.recipes.oreCrusherSecondaryOutputChance);
			
			addTEPulverizerRecipe(MagnesiumConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreMagnesium, ModItems.dustImpureMagnesium, MagnesiumConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyMagnesium, MagnesiumConfig.recipes.oreCrusherSecondaryOutputAmount, MagnesiumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(PhosphorusConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.orePhosphorus, ModItems.dustImpurePhosphorus, PhosphorusConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyPhosphorus, PhosphorusConfig.recipes.oreCrusherSecondaryOutputAmount, PhosphorusConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(SilvaniteConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreSilvanite, ModItems.dustImpureSilvanite, SilvaniteConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinySilvanite, SilvaniteConfig.recipes.oreCrusherSecondaryOutputAmount, SilvaniteConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(MerciliteConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreMercilite, ModItems.dustImpureMercilite, MerciliteConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyMercilite, MerciliteConfig.recipes.oreCrusherSecondaryOutputAmount, MerciliteConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(MythianConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreMythian, ModItems.dustImpureMythian, MythianConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyMythian, MythianConfig.recipes.oreCrusherSecondaryOutputAmount, MythianConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(DragiteConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreDragite, ModItems.dustImpureDragite, DragiteConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyDragite, DragiteConfig.recipes.oreCrusherSecondaryOutputAmount, DragiteConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(FlariteConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreFlarite, ModItems.dustImpureFlarite, FlariteConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyFlarite, FlariteConfig.recipes.oreCrusherSecondaryOutputAmount, FlariteConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(FureniumConfig.recipes.energyBaseline * oreCrusherEnergyModifier, ModItems.oreFurenium, ModItems.dustImpureFurenium, FureniumConfig.recipes.oreCrusherPrimaryOutputAmount,
					ModItems.dustTinyFurenium, FureniumConfig.recipes.oreCrusherSecondaryOutputAmount, FureniumConfig.recipes.oreCrusherSecondaryOutputChance);
			
			//Ingot to dust
			int ingotCrusherEnergyModifier = _COreConfig.cofh.ingotCrusherEnergyUsageModifier;
			addTEPulverizerRecipe(CopperConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotCopper, ModItems.dustCopper, 1);
			addTEPulverizerRecipe(TinConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotTin, ModItems.dustTin, 1);
			addTEPulverizerRecipe(ZincConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotZinc, ModItems.dustZinc, 1);
			addTEPulverizerRecipe(NickelConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotNickel, ModItems.dustNickel, 1);
			addTEPulverizerRecipe(SilverConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotSilver, ModItems.dustSilver, 1);
			addTEPulverizerRecipe(AluminiumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotAluminium, ModItems.dustAluminium, 1);
			addTEPulverizerRecipe(TitaniumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotTitanium, ModItems.dustTitanium, 1);
			addTEPulverizerRecipe(ChromiumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotChromium, ModItems.dustChromium, 1);
			addTEPulverizerRecipe(SiliconConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotSilicon, ModItems.dustSilicon, 1);
			addTEPulverizerRecipe(CobaltConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotCobalt, ModItems.dustCobalt, 1);
			addTEPulverizerRecipe(TungstenConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotTungsten, ModItems.dustTungsten, 1);
			addTEPulverizerRecipe(LeadConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotLead, ModItems.dustLead, 1);
			addTEPulverizerRecipe(PlatinumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotPlatinum, ModItems.dustPlatinum, 1);
			addTEPulverizerRecipe(LithiumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotLithium, ModItems.dustLithium, 1);
			addTEPulverizerRecipe(UraniumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotUranium, ModItems.dustUranium, 1);
			addTEPulverizerRecipe(PlutoniumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotPlutonium, ModItems.dustPlutonium, 1);
			
			addTEPulverizerRecipe(RubyConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.gemRuby, ModItems.dustRuby, 1);
			addTEPulverizerRecipe(SapphireConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.gemSapphire, ModItems.dustSapphire, 1);
			addTEPulverizerRecipe(AmethystConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.gemAmethyst, ModItems.dustAmethyst, 1);
			addTEPulverizerRecipe(CrystalConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.gemCrystal, ModItems.dustCrystal, 1);
			addTEPulverizerRecipe(MagnesiumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotMagnesium, ModItems.dustMagnesium, 1);
			//addTEPulverizerRecipe(PhosphorusConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotPhosphorus, ModItems.dustPhosphorus, 1);
			addTEPulverizerRecipe(SulfurConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotSulfur, ModItems.dustSulfur, 1);
			addTEPulverizerRecipe(SilvaniteConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotSilvanite, ModItems.dustSilvanite, 1);
			addTEPulverizerRecipe(MerciliteConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotMercilite, ModItems.dustMercilite, 1);
			addTEPulverizerRecipe(MythianConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotMythian, ModItems.dustMythian, 1);
			addTEPulverizerRecipe(DragiteConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotDragite, ModItems.dustDragite, 1);
			addTEPulverizerRecipe(FlariteConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotFlarite, ModItems.dustFlarite, 1);
			addTEPulverizerRecipe(FureniumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotFurenium, ModItems.dustFurenium, 1);
			addTEPulverizerRecipe(BlackstoneConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotBlackstone, ModItems.dustBlackstone, 1);
			addTEPulverizerRecipe(BluestoneConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotBluestone, ModItems.dustBluestone, 1);
			addTEPulverizerRecipe(PurplestoneConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotPurplestone, ModItems.dustPurplestone, 1);
			
			addTEPulverizerRecipe(AlloyBronzeConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotBronze, ModItems.dustBronze, 1);
			addTEPulverizerRecipe(AlloyCupronickelConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotCupronickel, ModItems.dustCupronickel, 1);
			addTEPulverizerRecipe(AlloyBrassConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotBrass, ModItems.dustBrass, 1);
			addTEPulverizerRecipe(AlloyRoseGoldConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotRosegold, ModItems.dustRosegold, 1);
			addTEPulverizerRecipe(AlloySteelConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotSteel, ModItems.dustSteel, 1);
			addTEPulverizerRecipe(AlloyStainlessSteelConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotStainlesssteel, ModItems.dustStainlesssteel, 1);
			addTEPulverizerRecipe(AlloyNichromeConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotNichrome, ModItems.dustNichrome, 1);
			addTEPulverizerRecipe(AlloyElectrumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotElectrum, ModItems.dustElectrum, 1);
			addTEPulverizerRecipe(AlloyStelliteConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotStellite, ModItems.dustStellite, 1);
			addTEPulverizerRecipe(AlloySilvamerConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotSilvamer, ModItems.dustSilvamer, 1);
			addTEPulverizerRecipe(AlloyUniumConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotUnium, ModItems.dustUnium, 1);
			addTEPulverizerRecipe(AlloyFenikisiteConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotFenikisite, ModItems.dustFenikisite, 1);
			addTEPulverizerRecipe(AlloyUltimiteConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotUltimite, ModItems.dustUltimite, 1);
			addTEPulverizerRecipe(AlloyStrootiteConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotStrootite, ModItems.dustStrootite, 1);
			addTEPulverizerRecipe(AlloySpeedoiConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotSpeedoi, ModItems.dustSpeedoi, 1);
			addTEPulverizerRecipe(AlloyLegeniteConfig.recipes.energyBaseline * ingotCrusherEnergyModifier, ModItems.ingotLegenite, ModItems.dustLegenite, 1);
			
			//Nugget to tiny dust
			int nuggetCrusherEnergyModifier = _COreConfig.cofh.nuggetCrusherEnergyUsageModifier;
			addTEPulverizerRecipe(CopperConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetCopper, ModItems.dustTinyCopper, 1);
			addTEPulverizerRecipe(TinConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetTin, ModItems.dustTinyTin, 1);
			addTEPulverizerRecipe(ZincConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetZinc, ModItems.dustTinyZinc, 1);
			addTEPulverizerRecipe(NickelConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetNickel, ModItems.dustTinyNickel, 1);
			addTEPulverizerRecipe(SilverConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetSilver, ModItems.dustTinySilver, 1);
			addTEPulverizerRecipe(AluminiumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetAluminium, ModItems.dustTinyAluminium, 1);
			addTEPulverizerRecipe(TitaniumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetTitanium, ModItems.dustTinyTitanium, 1);
			addTEPulverizerRecipe(ChromiumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetChromium, ModItems.dustTinyChromium, 1);
			//addTEPulverizerRecipe(SiliconConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nugget, ModItems.dustTinySilicon, 1);
			addTEPulverizerRecipe(CobaltConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetCobalt, ModItems.dustTinyCobalt, 1);
			addTEPulverizerRecipe(TungstenConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetTungsten, ModItems.dustTinyTungsten, 1);
			addTEPulverizerRecipe(LeadConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetLead, ModItems.dustTinyLead, 1);
			addTEPulverizerRecipe(PlatinumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetPlatinum, ModItems.dustTinyPlatinum, 1);
			addTEPulverizerRecipe(LithiumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetLithium, ModItems.dustTinyLithium, 1);
			addTEPulverizerRecipe(UraniumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetUranium, ModItems.dustTinyUranium, 1);
			addTEPulverizerRecipe(PlutoniumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetPlutonium, ModItems.dustTinyPlutonium, 1);
			
			addTEPulverizerRecipe(RubyConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetRuby, ModItems.dustTinyRuby, 1);
			addTEPulverizerRecipe(SapphireConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetSapphire, ModItems.dustTinySapphire, 1);
			addTEPulverizerRecipe(AmethystConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetAmethyst, ModItems.dustTinyAmethyst, 1);
			addTEPulverizerRecipe(CrystalConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetCrystal, ModItems.dustTinyCrystal, 1);
			addTEPulverizerRecipe(MagnesiumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetMagnesium, ModItems.dustTinyMagnesium, 1);
			//addTEPulverizerRecipe(PhosphorusConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nugget, ModItems.dustTinyPhosphorus, 1);
			//addTEPulverizerRecipe(SulfurConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nugget, ModItems.dustTinySulfur, 1);
			addTEPulverizerRecipe(SilvaniteConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetSilvanite, ModItems.dustTinySilvanite, 1);
			addTEPulverizerRecipe(MerciliteConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetMercilite, ModItems.dustTinyMercilite, 1);
			addTEPulverizerRecipe(MythianConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetMythian, ModItems.dustTinyMythian, 1);
			addTEPulverizerRecipe(DragiteConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetDragite, ModItems.dustTinyDragite, 1);
			addTEPulverizerRecipe(FlariteConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetFlarite, ModItems.dustTinyFlarite, 1);
			addTEPulverizerRecipe(FureniumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetFurenium, ModItems.dustTinyFurenium, 1);
			//addTEPulverizerRecipe(BlackstoneConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nugget, ModItems.dustTinyBlackstone, 1);
			//addTEPulverizerRecipe(BluestoneConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nugget, ModItems.dustTinyBluestone, 1);
			//addTEPulverizerRecipe(PurplestoneConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nugget, ModItems.dustTinyPurplestone, 1);
			
			addTEPulverizerRecipe(AlloyBronzeConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetBronze, ModItems.dustTinyBronze, 1);
			addTEPulverizerRecipe(AlloyCupronickelConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetCupronickel, ModItems.dustTinyCupronickel, 1);
			addTEPulverizerRecipe(AlloyBrassConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetBrass, ModItems.dustTinyBrass, 1);
			addTEPulverizerRecipe(AlloyRoseGoldConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetRosegold, ModItems.dustTinyRosegold, 1);
			addTEPulverizerRecipe(AlloySteelConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetSteel, ModItems.dustTinySteel, 1);
			addTEPulverizerRecipe(AlloyStainlessSteelConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetStainlesssteel, ModItems.dustTinyStainlesssteel, 1);
			addTEPulverizerRecipe(AlloyNichromeConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetNichrome, ModItems.dustTinyNichrome, 1);
			addTEPulverizerRecipe(AlloyElectrumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetElectrum, ModItems.dustTinyElectrum, 1);
			addTEPulverizerRecipe(AlloyStelliteConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetStellite, ModItems.dustTinyStellite, 1);
			addTEPulverizerRecipe(AlloySilvamerConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetSilvamer, ModItems.dustTinySilvamer, 1);
			addTEPulverizerRecipe(AlloyUniumConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetUnium, ModItems.dustTinyUnium, 1);
			addTEPulverizerRecipe(AlloyFenikisiteConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetFenikisite, ModItems.dustTinyFenikisite, 1);
			addTEPulverizerRecipe(AlloyUltimiteConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetUltimite, ModItems.dustTinyUltimite, 1);
			addTEPulverizerRecipe(AlloyStrootiteConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetStrootite, ModItems.dustTinyStrootite, 1);
			addTEPulverizerRecipe(AlloySpeedoiConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetSpeedoi, ModItems.dustTinySpeedoi, 1);
			addTEPulverizerRecipe(AlloyLegeniteConfig.recipes.energyBaseline * nuggetCrusherEnergyModifier, ModItems.nuggetLegenite, ModItems.dustTinyLegenite, 1);
		}
		
		if (_COreConfig.cofh.compressorRecipes) {
			//Sulfur
			//Blackstone
			//Bluestone
			//Purplestone
			//Redstone
			
			//Ruby
			//Sapphire
			//Amethyst
			//Crystal
			//Diamond
			//Emerald
			
			//Nuggets
		}
	}
	
	public static void addOreDictFurnaceRecipe(String input, Item output) {
		NonNullList<ItemStack> stackList = OreDictionary.getOres(input);
		for (int i = 0; i < stackList.size(); i++) {
			ItemStack inputItem = stackList.get(i);
			GameRegistry.addSmelting(inputItem, new ItemStack(output, 1), 0.1f);
			if (_COreConfig.cofh.furnaceRecipes) {
				//TODO
			}
		}
	}
	
	public static void addTEPulverizerRecipe(int energy, Item input, Item primaryOutput, int primaryAmt, Item secondaryOutput, int secondaryAmt, int chance) {
		ItemStack inputStack = new ItemStack(input, 1);
		ItemStack primary = new ItemStack(primaryOutput, primaryAmt);
		if (secondaryOutput != null) {
			ItemStack secondary = new ItemStack(secondaryOutput, secondaryAmt);
			ThermalExpansionHelper.addPulverizerRecipe(energy, inputStack, primary, secondary, chance);
		} else {
			ThermalExpansionHelper.addPulverizerRecipe(energy, inputStack, primary);
		}
	}
	
	//For when there's no secondary output - IE already purified things such as dust.
	public static void addTEPulverizerRecipe(int energy, Item input, Item output, int amt) {
		addTEPulverizerRecipe(energy, input, output, amt, null, 0, 0);
	}
	
	//TODO TE furnace
	//TODO induction furnace (alloys)
	//TODO Compactor (dust ingots)
	

	public static void disableCoFHRecipes() {
		System.out.println("[cOre] Disabling CoFH/Thermal Expansion recipes in favour of cOre ones!");
		//PULVERIZER
		//Ore
		removeCoFHPulverizerRecipe(CopperConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(TinConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(ZincConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(NickelConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(SilverConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(AluminiumConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(TitaniumConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(ChromiumConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(SiliconConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(CobaltConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(TungstenConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(LeadConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(PlatinumConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(LithiumConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(UraniumConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(PlutoniumConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(RubyConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(SapphireConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(AmethystConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(CrystalConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(MagnesiumConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(PhosphorusConfig.oredict.oreOreDict);
		removeCoFHPulverizerRecipe(SulfurConfig.oredict.oreOreDict);
		
		//Ingot
		removeCoFHPulverizerRecipe(CopperConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(TinConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(ZincConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(NickelConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(SilverConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(AluminiumConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(TitaniumConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(ChromiumConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(SiliconConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(CobaltConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(TungstenConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(LeadConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(PlatinumConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(LithiumConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(UraniumConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(PlutoniumConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(RubyConfig.oredict.gemOreDict);
		removeCoFHPulverizerRecipe(SapphireConfig.oredict.gemOreDict);
		removeCoFHPulverizerRecipe(AmethystConfig.oredict.gemOreDict);
		removeCoFHPulverizerRecipe(CrystalConfig.oredict.gemOreDict);
		removeCoFHPulverizerRecipe(MagnesiumConfig.oredict.ingotOreDict);
		removeCoFHPulverizerRecipe(SulfurConfig.oredict.ingotOreDict);
		
		//Nugget
		removeCoFHPulverizerRecipe(CopperConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(TinConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(ZincConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(NickelConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(SilverConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(AluminiumConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(TitaniumConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(ChromiumConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(CobaltConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(TungstenConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(LeadConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(PlatinumConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(LithiumConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(UraniumConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(PlutoniumConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(RubyConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(SapphireConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(AmethystConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(CrystalConfig.oredict.nuggetOreDict);
		removeCoFHPulverizerRecipe(MagnesiumConfig.oredict.nuggetOreDict);
		
		//Specific support for Americans who can't spell Aluminium correctly.
		if (AluminiumConfig.oredict.americanSupport) {
			removeCoFHPulverizerRecipe("oreAluminum");
			removeCoFHPulverizerRecipe("ingotAluminum");
			removeCoFHPulverizerRecipe("nuggetAluminum");
		}
	}
	
	public static void removeCoFHPulverizerRecipe(String input) {
		NonNullList<ItemStack> stackList = OreDictionary.getOres(input);
		for (int i = 0; i < stackList.size(); i++) {
			ItemStack inputItem = stackList.get(i);
			ThermalExpansionHelper.removePulverizerRecipe(inputItem);
		}
	}
	
	public static void tinkersConstructRecipes() {
		if (_COreConfig.tcon.registerSolariumAsFuel) {
			TinkerRegistry.registerSmelteryFuel(new FluidStack(ModFluids.fluidSolarium, 50), 100);
		}
		
		 TinkerRegistry.registerMelting("dustRedstone", ModFluids.fluidRedstone, Material.VALUE_Ingot);
		
		addTinkersMaterial(_ConfigValues.titaniumOreDictValues, ModFluids.fluidTitanium, new ItemStack(ModBlocks.blockRefined1, 1, 6), new ItemStack(ModItems.ingotTitanium), new ItemStack(ModItems.nuggetTitanium), false);
		addTinkersMaterial(_ConfigValues.chromiumOreDictValues, ModFluids.fluidChromium, new ItemStack(ModBlocks.blockRefined1, 1, 7), new ItemStack(ModItems.ingotChromium), new ItemStack(ModItems.nuggetChromium), false);
		addTinkersMaterial(_ConfigValues.siliconOreDictValues, ModFluids.fluidSilicon, new ItemStack(ModBlocks.blockRefined1, 1, 8), new ItemStack(ModItems.ingotSilicon), null, false);
		addTinkersMaterial(_ConfigValues.tungstenOreDictValues, ModFluids.fluidTungsten, new ItemStack(ModBlocks.blockRefined1, 1, 10), new ItemStack(ModItems.ingotTungsten),  new ItemStack(ModItems.nuggetTungsten), false);
		addTinkersMaterial(_ConfigValues.lithiumOreDictValues, ModFluids.fluidLithium, new ItemStack(ModBlocks.blockRefined1, 1, 13), new ItemStack(ModItems.ingotLithium),  new ItemStack(ModItems.nuggetLithium), false);
		addTinkersMaterial(_ConfigValues.uraniumOreDictValues, ModFluids.fluidUranium, new ItemStack(ModBlocks.blockRefined1, 1, 14), new ItemStack(ModItems.ingotUranium),  new ItemStack(ModItems.nuggetUranium), false);
		addTinkersMaterial(_ConfigValues.plutoniumOreDictValues, ModFluids.fluidPlutonium, new ItemStack(ModBlocks.blockRefined1, 1, 15), new ItemStack(ModItems.ingotPlutonium), new ItemStack(ModItems.nuggetPlutonium), false);
		
		addTinkersMaterial(_ConfigValues.rubyOreDictValues, ModFluids.fluidRuby, new ItemStack(ModBlocks.blockRefined2, 1, 0), new ItemStack(ModItems.gemRuby),  null, true);
		addTinkersMaterial(_ConfigValues.sapphireOreDictValues, ModFluids.fluidSapphire, new ItemStack(ModBlocks.blockRefined2, 1, 1), new ItemStack(ModItems.gemSapphire),  null, true);
		addTinkersMaterial(_ConfigValues.amethystOreDictValues, ModFluids.fluidAmethyst, new ItemStack(ModBlocks.blockRefined2, 1, 2), new ItemStack(ModItems.gemAmethyst),  new ItemStack(ModItems.nuggetAmethyst), true);
		addTinkersMaterial(_ConfigValues.crystalOreDictValues, ModFluids.fluidCrystal, new ItemStack(ModBlocks.blockRefined2, 1, 3), new ItemStack(ModItems.gemCrystal),  new ItemStack(ModItems.nuggetCrystal), true);
		addTinkersMaterial(_ConfigValues.magnesiumOreDictValues, ModFluids.fluidMagnesium, new ItemStack(ModBlocks.blockRefined2, 1, 4), new ItemStack(ModItems.ingotMagnesium),  new ItemStack(ModItems.nuggetMagnesium), false);
		addTinkersMaterial(_ConfigValues.phosphorusOreDictValues, ModFluids.fluidPhosphorus, new ItemStack(ModBlocks.blockRefined2, 1, 5), null,  null, false);
		addTinkersMaterial(_ConfigValues.sulfurOreDictValues, ModFluids.fluidSulfur, new ItemStack(ModBlocks.blockRefined2, 1, 6), new ItemStack(ModItems.ingotSulfur),  null, false);
		addTinkersMaterial(_ConfigValues.silvaniteOreDictValues, ModFluids.fluidSilvanite, new ItemStack(ModBlocks.blockRefined2, 1, 7), new ItemStack(ModItems.ingotSilvanite),  new ItemStack(ModItems.nuggetSilvanite), false);
		addTinkersMaterial(_ConfigValues.merciliteOreDictValues, ModFluids.fluidMercilite, new ItemStack(ModBlocks.blockRefined2, 1, 8), new ItemStack(ModItems.ingotMercilite),  new ItemStack(ModItems.nuggetMercilite), false);
		addTinkersMaterial(_ConfigValues.mythianOreDictValues, ModFluids.fluidMythian, new ItemStack(ModBlocks.blockRefined2, 1, 9), new ItemStack(ModItems.ingotMythian),  new ItemStack(ModItems.nuggetMythian), false);
		addTinkersMaterial(_ConfigValues.dragiteOreDictValues, ModFluids.fluidDragite, new ItemStack(ModBlocks.blockRefined2, 1, 10), new ItemStack(ModItems.ingotDragite),  new ItemStack(ModItems.nuggetDragite), false);
		addTinkersMaterial(_ConfigValues.flariteOreDictValues, ModFluids.fluidFlarite, new ItemStack(ModBlocks.blockRefined2, 1, 11), new ItemStack(ModItems.ingotFlarite),  new ItemStack(ModItems.nuggetFlarite), false);
		addTinkersMaterial(_ConfigValues.fureniumOreDictValues, ModFluids.fluidFurenium, new ItemStack(ModBlocks.blockRefined2, 1, 12), new ItemStack(ModItems.ingotFurenium),  new ItemStack(ModItems.nuggetFurenium), false);
		addTinkersMaterial(_ConfigValues.blackstoneOreDictValues, ModFluids.fluidBlackstone, new ItemStack(ModBlocks.blockRefined2, 1, 13), new ItemStack(ModItems.ingotBlackstone), null, false);
		addTinkersMaterial(_ConfigValues.bluestoneOreDictValues, ModFluids.fluidBluestone, new ItemStack(ModBlocks.blockRefined2, 1, 14), new ItemStack(ModItems.ingotBluestone), null, false);
		addTinkersMaterial(_ConfigValues.purplestoneOreDictValues, ModFluids.fluidPurplestone, new ItemStack(ModBlocks.blockRefined2, 1, 15), new ItemStack(ModItems.ingotPurplestone), null, false);
		
		
		//bronze already exists in Tinkers
		addTinkersMaterialAlloy(_ConfigValues.cupronickelOreDictValues, ModFluids.fluidCupronickel, new ItemStack(ModBlocks.blockRefined3, 1, 1), new ItemStack(ModItems.ingotCupronickel), new ItemStack(ModItems.nuggetCupronickel));
		//brass already exists in Tinkers
		addTinkersMaterialAlloy(_ConfigValues.rosegoldOreDictValues, ModFluids.fluidRoseGold, new ItemStack(ModBlocks.blockRefined3, 1, 3), new ItemStack(ModItems.ingotRosegold), new ItemStack(ModItems.nuggetRosegold));
		addTinkersMaterialAlloy(_ConfigValues.steelOreDictValues, ModFluids.fluidSteel, new ItemStack(ModBlocks.blockRefined3, 1, 4), new ItemStack(ModItems.ingotSteel), new ItemStack(ModItems.nuggetSteel)); //Steel EXISTS but cant be created, so we'll remake it.
		addTinkersMaterialAlloy(_ConfigValues.stainlesssteelOreDictValues, ModFluids.fluidStainlessSteel, new ItemStack(ModBlocks.blockRefined3, 1, 5), new ItemStack(ModItems.ingotStainlesssteel), new ItemStack(ModItems.nuggetStainlesssteel));
		addTinkersMaterialAlloy(_ConfigValues.nichromeOreDictValues, ModFluids.fluidNichrome, new ItemStack(ModBlocks.blockRefined3, 1, 6), new ItemStack(ModItems.ingotNichrome), new ItemStack(ModItems.nuggetNichrome));
		//electrum already exists in Tinkers
		addTinkersMaterialAlloy(_ConfigValues.stelliteOreDictValues, ModFluids.fluidStellite, new ItemStack(ModBlocks.blockRefined3, 1, 8), new ItemStack(ModItems.ingotStellite), new ItemStack(ModItems.nuggetStellite));
		addTinkersMaterialAlloy(_ConfigValues.silvamerOreDictValues, ModFluids.fluidSilvamer, new ItemStack(ModBlocks.blockRefined3, 1, 9), new ItemStack(ModItems.ingotSilvamer), new ItemStack(ModItems.nuggetSilvamer));
		addTinkersMaterialAlloy(_ConfigValues.uniumOreDictValues, ModFluids.fluidUnium, new ItemStack(ModBlocks.blockRefined3, 1, 10), new ItemStack(ModItems.ingotUnium), new ItemStack(ModItems.nuggetUnium));
		addTinkersMaterialAlloy(_ConfigValues.fenikisiteOreDictValues, ModFluids.fluidFenikisite, new ItemStack(ModBlocks.blockRefined3, 1, 11), new ItemStack(ModItems.ingotFenikisite), new ItemStack(ModItems.nuggetFenikisite));
		addTinkersMaterialAlloy(_ConfigValues.ultimiteOreDictValues, ModFluids.fluidUltimite, new ItemStack(ModBlocks.blockRefined3, 1, 12), new ItemStack(ModItems.ingotUltimite), new ItemStack(ModItems.nuggetUltimite));
		addTinkersMaterialAlloy(_ConfigValues.strootiteOreDictValues, ModFluids.fluidStrootite, new ItemStack(ModBlocks.blockRefined3, 1, 13), new ItemStack(ModItems.ingotStrootite), new ItemStack(ModItems.nuggetStrootite));
		addTinkersMaterialAlloy(_ConfigValues.speedoiOreDictValues, ModFluids.fluidSpeedoi, new ItemStack(ModBlocks.blockRefined3, 1, 14), new ItemStack(ModItems.ingotSpeedoi), new ItemStack(ModItems.nuggetSpeedoi));
		addTinkersMaterialAlloy(_ConfigValues.legeniteOreDictValues, ModFluids.fluidLegenite, new ItemStack(ModBlocks.blockRefined3, 1, 15), new ItemStack(ModItems.ingotLegenite), new ItemStack(ModItems.nuggetLegenite));
		
		//bronze
		//addTinkersAlloy(ModFluids.fluidCupronickel, AlloyCupronickelConfig.properties.componentName, AlloyCupronickelConfig.properties.componentAmount);
		//brass
		addTinkersAlloy(ModFluids.fluidRoseGold, AlloyRoseGoldConfig.properties.componentName, AlloyRoseGoldConfig.properties.componentAmount);
		addTinkersAlloy(ModFluids.fluidSteel, AlloySteelConfig.properties.componentName, AlloySteelConfig.properties.componentAmount);
		addTinkersAlloy(ModFluids.fluidStainlessSteel, AlloyStainlessSteelConfig.properties.componentName, AlloyStainlessSteelConfig.properties.componentAmount);
		addTinkersAlloy(ModFluids.fluidNichrome, AlloyNichromeConfig.properties.componentName, AlloyNichromeConfig.properties.componentAmount);
		//electrum
		addTinkersAlloy(ModFluids.fluidStellite, AlloyStelliteConfig.properties.componentName, AlloyStelliteConfig.properties.componentAmount);
		addTinkersAlloy(ModFluids.fluidSilvamer, AlloySilvamerConfig.properties.componentName, AlloySilvamerConfig.properties.componentAmount);
		addTinkersAlloy(ModFluids.fluidUnium, AlloyUniumConfig.properties.componentName, AlloyUniumConfig.properties.componentAmount);
		addTinkersAlloy(ModFluids.fluidFenikisite, AlloyFenikisiteConfig.properties.componentName, AlloyFenikisiteConfig.properties.componentAmount);
		addTinkersAlloy(ModFluids.fluidUltimite, AlloyUltimiteConfig.properties.componentName, AlloyUltimiteConfig.properties.componentAmount);
		addTinkersAlloy(ModFluids.fluidStrootite, AlloyStrootiteConfig.properties.componentName, AlloyStrootiteConfig.properties.componentAmount);
		addTinkersAlloy(ModFluids.fluidSpeedoi, AlloySpeedoiConfig.properties.componentName, AlloySpeedoiConfig.properties.componentAmount);
		addTinkersAlloy(ModFluids.fluidLegenite, AlloyLegeniteConfig.properties.componentName, AlloyLegeniteConfig.properties.componentAmount);
		
		TinkerRegistry.registerAlloy(new FluidStack(ModFluids.fluidSolarium,  576), new FluidStack(ModFluids.fluidBlackstone, 144), new FluidStack(ModFluids.fluidBluestone, 144), new FluidStack(ModFluids.fluidPurplestone, 144), new FluidStack(ModFluids.fluidRedstone, 144)); 
	}
	
	
	public static void addTinkersAlloy(Fluid output, String[] input, int[] inputAmt) {
		if (input.length == inputAmt.length) {
			List<FluidStack> flds = new ArrayList<FluidStack>();
			int totalAmt = 0;
			for (int i = 0; i < input.length; i++) {
				if (ModFluids.getFluidFromName(input[i]) != null) {
					flds.add(new FluidStack(ModFluids.getFluidFromName(input[i]), inputAmt[i]));
					totalAmt += inputAmt[i];
				} else {
					System.out.println("[cOre] ERROR! " + input[i] + " is null in fluid directory. The alloy for " + output.getName() + " will NOT be added!");
					return;
				}
			}
			FluidStack outputFluid = new FluidStack(output, totalAmt);
			
			TinkerRegistry.registerAlloy(outputFluid, flds.toArray(new FluidStack[flds.size()]));
			
		} else { System.out.println("[cOre] input length mismatch!"); }
	}
	
	public static void addTinkersMaterial(String[] oreDicts, Fluid fluid, ItemStack block, ItemStack ingot, ItemStack nugget, boolean gem) {
		if (oreDicts != null) {
			if (!oreDicts[0].contains("null")) { TinkerRegistry.registerMelting(oreDicts[0], fluid, Material.VALUE_Ingot*2); } //melt ore
			if (!oreDicts[1].contains("null")) { TinkerRegistry.registerMelting(oreDicts[1], fluid, Material.VALUE_Ingot); } //melt ingot or gem
			if (!oreDicts[2].contains("null")) { TinkerRegistry.registerMelting(oreDicts[2], fluid, Material.VALUE_Ingot); } //melt dust
			if (!oreDicts[3].contains("null")) { TinkerRegistry.registerMelting(oreDicts[3], fluid, Material.VALUE_Ingot); } //melt impure dust
			if (!oreDicts[4].contains("null")) { TinkerRegistry.registerMelting(oreDicts[4], fluid, Material.VALUE_Nugget); } //melt nugget
			if (!oreDicts[5].contains("null")) { TinkerRegistry.registerMelting(oreDicts[5], fluid, Material.VALUE_Nugget); } //melt tiny dust
			if (!oreDicts[6].contains("null")) { TinkerRegistry.registerMelting(oreDicts[6], fluid, Material.VALUE_Block); } //melt refined block
			
			if (block != null) { TinkerRegistry.registerBasinCasting(block, ItemStack.EMPTY, fluid, Material.VALUE_Block); } //cast block (no cast needed)
			if (ingot != null) { TinkerRegistry.registerTableCasting(ingot, TinkerSmeltery.castIngot, fluid, Material.VALUE_Ingot); } //cast ingot
			if (nugget != null) { TinkerRegistry.registerTableCasting(nugget, TinkerSmeltery.castNugget, fluid, Material.VALUE_Nugget); } //cast nugget
		}
	}
	
	//TODO fix this. Also fix above with nuggets.
	public static void addTinkersMaterialAlloy(String[] oreDicts, Fluid fluid, ItemStack block, ItemStack ingot, ItemStack nugget) {
		if (oreDicts != null) {
			if (!oreDicts[0].contains("null")) { TinkerRegistry.registerMelting(oreDicts[0], fluid, Material.VALUE_Ingot); } //melt ingot
			if (!oreDicts[1].contains("null")) { TinkerRegistry.registerMelting(oreDicts[1], fluid, Material.VALUE_Ingot); } //melt dust
			if (!oreDicts[2].contains("null")) { TinkerRegistry.registerMelting(oreDicts[2], fluid, Material.VALUE_Nugget); } //melt tiny dust
			if (!oreDicts[3].contains("null")) { TinkerRegistry.registerMelting(oreDicts[3], fluid, Material.VALUE_Nugget); } //melt nugget
			if (!oreDicts[4].contains("null")) { TinkerRegistry.registerMelting(oreDicts[4], fluid, Material.VALUE_Block); } //melt refined block
			
			if (block != null) { TinkerRegistry.registerBasinCasting(block, ItemStack.EMPTY, fluid, Material.VALUE_Block); } //cast block (no cast needed)
			if (ingot != null) { TinkerRegistry.registerTableCasting(ingot, TinkerSmeltery.castIngot, fluid, Material.VALUE_Ingot); } //cast ingot
			if (nugget != null) { TinkerRegistry.registerTableCasting(nugget, TinkerSmeltery.castNugget, fluid, Material.VALUE_Nugget); } //cast nugget
		}
	}
	
	public static void addToTConSmeltery(Fluid fluid, String oreDictName) {
		NBTTagCompound tag = new NBTTagCompound();
		tag.setString("fluid", fluid.getName());
		tag.setString("ore", oreDictName);
		tag.setBoolean("toolforge", true);
		
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", tag);
	}
	
	public static void partRegistry() {
		//Chromium
		//Silicon //Low head dura, high rest dura
		//Tungsten //Heavy AF, durable AF, slow AF
		
		//Silvanite
		//Mercilite
		//Mythian
		//Dragite
		//Flarite
		//Furenium
		
		//AlloyCupronickel
		//AlloyRoseGold
		//(AlloyStainlessSteel
		//AlloyNichrome
		//AlloyStellite
		//AlloySilvamer
		//AlloyUnium
		//AlloyFenikisite
		//AlloyUltimite
		//AlloyStrootite
		//AlloySpeedoi
		//AlloyLegenite
	}
	
	public static void registerTinkersPartMaterial(Item ingot, String name, int col, String oreDict, int durability, float miningSpeed, float attack, int hLevel) {
		Material mat = new Material(name, col);//0xffddff);
	    TinkerMaterials.materials.add(mat);
	    mat.setCraftable(true);
	    mat.addItemIngot(oreDict);
	    mat.setRepresentativeItem(new ItemStack(ingot));
	    TinkerRegistry.addMaterialStats(mat,
	                new HeadMaterialStats(durability, miningSpeed, attack, hLevel),
	                new HandleMaterialStats(0.50f, 350),
	                new ExtraMaterialStats(150),
	                new BowMaterialStats(0.5f, 1.5f, 7f));
	}
}
