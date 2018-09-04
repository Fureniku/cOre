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
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;

public class RecipeRegistry {
	
	//SANITY NOTE!!
	//Some things are included, but commented out.
	//That means there is no recipe, and is intentional (For example, you cant make a ruby ingot from ruby dust)
	//I've simply included them so I can count through and make sure I didn't miss a recipe somewhere. They are for my own sanity.
	
	public static void furnaceRecipes() {
		if (_COreConfig.general.smeltDustToIngot) {
			if (CopperConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(CopperConfig.oredict.dustOreDict, ModItems.ingotCopper); }
			if (TinConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(TinConfig.oredict.dustOreDict, ModItems.ingotTin); }
			if (ZincConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(ZincConfig.oredict.dustOreDict, ModItems.ingotZinc); }
			if (NickelConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(NickelConfig.oredict.dustOreDict, ModItems.ingotNickel); }
			if (SilverConfig.recipes.dustSmeltingEnabled) {		addOreDictFurnaceRecipe(SilverConfig.oredict.dustOreDict, ModItems.ingotSilver); }
			if (AluminiumConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(AluminiumConfig.oredict.dustOreDict, ModItems.ingotAluminium); }
			if (TitaniumConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(TitaniumConfig.oredict.dustOreDict, ModItems.ingotTitanium); }
			if (ChromiumConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(ChromiumConfig.oredict.dustOreDict, ModItems.ingotChromium); }
			if (SiliconConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(SiliconConfig.oredict.dustOreDict, ModItems.ingotSilicon); }
			if (CobaltConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(CobaltConfig.oredict.dustOreDict, ModItems.ingotCobalt); }
			if (TungstenConfig.recipes.dustSmeltingEnabled) {	addOreDictFurnaceRecipe(TungstenConfig.oredict.dustOreDict, ModItems.ingotTungsten); }
			if (LeadConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(LeadConfig.oredict.dustOreDict, ModItems.ingotLead); }
			if (PlatinumConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(PlatinumConfig.oredict.dustOreDict, ModItems.ingotPlatinum); }
			if (LithiumConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(LithiumConfig.oredict.dustOreDict, ModItems.ingotLithium); }
			if (UraniumConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(UraniumConfig.oredict.dustOreDict, ModItems.ingotUranium); }
			if (PlutoniumConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(PlutoniumConfig.oredict.dustOreDict, ModItems.ingotPlutonium); }
			
			//if (RubyConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(RubyConfig.oredict.dustOreDict, ModItems.gemRuby); }
			//if (SapphireConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(SapphireConfig.oredict.dustOreDict, ModItems.gemSapphire); }
			//if (AmethystConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(AmethystConfig.oredict.dustOreDict, ModItems.gemAmethyst); }
			//if (CrystalConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(CrystalConfig.oredict.dustOreDict, ModItems.gemCrystal); }
			if (MagnesiumConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(MagnesiumConfig.oredict.dustOreDict, ModItems.ingotMagnesium); }
			//if (PhosphorusConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(PhosphorusConfig.oredict.dustOreDict, ModItems.ingotPhosphorus); }
			//if (SulfurConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(SulfurConfig.oredict.dustOreDict, ModItems.ingotSulfur); }
			if (SilvaniteConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(SilvaniteConfig.oredict.dustOreDict, ModItems.ingotSilvanite); }
			if (MerciliteConfig.recipes.dustSmeltingEnabled) {		addOreDictFurnaceRecipe(MerciliteConfig.oredict.dustOreDict, ModItems.ingotMercilite); }
			if (MythianConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(MythianConfig.oredict.dustOreDict, ModItems.ingotMythian); }
			if (DragiteConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(DragiteConfig.oredict.dustOreDict, ModItems.ingotDragite); }
			if (FlariteConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(FlariteConfig.oredict.dustOreDict, ModItems.ingotFlarite); }
			if (FureniumConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(FureniumConfig.oredict.dustOreDict, ModItems.ingotFurenium); }
			//if (BlackstoneConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(BlackstoneConfig.oredict.dustOreDict, ModItems.ingotBlackstone); }
			//if (BluestoneConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(BluestoneConfig.oredict.dustOreDict, ModItems.ingotBluestone); }
			//if (PurplestoneConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(PurplestoneConfig.oredict.dustOreDict, ModItems.ingotPurplestone); }
			
			if (AlloyBronzeConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyBronzeConfig.oredict.dustOreDict, ModItems.ingotBronze); }
			if (AlloyCupronickelConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(AlloyCupronickelConfig.oredict.dustOreDict, ModItems.ingotCupronickel); }
			if (AlloyBrassConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyBrassConfig.oredict.dustOreDict, ModItems.ingotBrass); }
			if (AlloyRoseGoldConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyRoseGoldConfig.oredict.dustOreDict, ModItems.ingotRosegold); }
			if (AlloySteelConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloySteelConfig.oredict.dustOreDict, ModItems.ingotSteel); }
			if (AlloyStainlessSteelConfig.recipes.dustSmeltingEnabled) { 	addOreDictFurnaceRecipe(AlloyStainlessSteelConfig.oredict.dustOreDict, ModItems.ingotStainlesssteel); }
			if (AlloyNichromeConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyNichromeConfig.oredict.dustOreDict, ModItems.ingotNichrome); }
			if (AlloyElectrumConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyElectrumConfig.oredict.dustOreDict, ModItems.ingotElectrum); }
			if (AlloyStelliteConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyStelliteConfig.oredict.dustOreDict, ModItems.ingotStellite); }
			if (AlloySilvamerConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloySilvamerConfig.oredict.dustOreDict, ModItems.ingotSilvamer); }
			if (AlloyUniumConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyUniumConfig.oredict.dustOreDict, ModItems.ingotUnium); }
			if (AlloyFenikisiteConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(AlloyFenikisiteConfig.oredict.dustOreDict, ModItems.ingotFenikisite); }
			if (AlloyUltimiteConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyUltimiteConfig.oredict.dustOreDict, ModItems.ingotUltimite); }
			if (AlloyStrootiteConfig.recipes.dustSmeltingEnabled) { 		addOreDictFurnaceRecipe(AlloyStrootiteConfig.oredict.dustOreDict, ModItems.ingotStrootite); }
			if (AlloySpeedoiConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloySpeedoiConfig.oredict.dustOreDict, ModItems.ingotSpeedoi); }
			if (AlloyLegeniteConfig.recipes.dustSmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyLegeniteConfig.oredict.dustOreDict, ModItems.ingotLegenite); }
		}
		
		if (_COreConfig.general.smeltOreToIngot) {
			if (CopperConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(CopperConfig.oredict.oreOreDict, ModItems.ingotCopper); }
			if (TinConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(TinConfig.oredict.oreOreDict, ModItems.ingotTin); }
			if (ZincConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(ZincConfig.oredict.oreOreDict, ModItems.ingotZinc); }
			if (NickelConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(NickelConfig.oredict.oreOreDict, ModItems.ingotNickel); }
			if (SilverConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(SilverConfig.oredict.oreOreDict, ModItems.ingotSilver); }
			if (AluminiumConfig.recipes.oreSmeltingEnabled) {	addOreDictFurnaceRecipe(AluminiumConfig.oredict.oreOreDict, ModItems.ingotAluminium); }
			if (TitaniumConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(TitaniumConfig.oredict.oreOreDict, ModItems.ingotTitanium); }
			if (ChromiumConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(ChromiumConfig.oredict.oreOreDict, ModItems.ingotChromium); }
			if (SiliconConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(SiliconConfig.oredict.oreOreDict, ModItems.ingotSilicon); }
			if (CobaltConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(CobaltConfig.oredict.oreOreDict, ModItems.ingotCobalt); }
			if (TungstenConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(TungstenConfig.oredict.oreOreDict, ModItems.ingotTungsten); }
			if (LeadConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(LeadConfig.oredict.oreOreDict, ModItems.ingotLead); }
			if (PlatinumConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(PlatinumConfig.oredict.oreOreDict, ModItems.ingotPlatinum); }
			if (LithiumConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(LithiumConfig.oredict.oreOreDict, ModItems.ingotLithium); }
			if (UraniumConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(UraniumConfig.oredict.oreOreDict, ModItems.ingotUranium); }
			if (PlutoniumConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(PlutoniumConfig.oredict.oreOreDict, ModItems.ingotPlutonium); }
			
			//if (RubyConfig.recipes.oreSmeltingEnabled) { 			addOreDictFurnaceRecipe(RubyConfig.oredict.oreOreDict, ModItems.gemRuby); }
			//if (SapphireConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(SapphireConfig.oredict.oreOreDict, ModItems.gemSapphire); }
			//if (AmethystConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(AmethystConfig.oredict.oreOreDict, ModItems.gemAmethyst); }
			//if (CrystalConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(CrystalConfig.oredict.oreOreDict, ModItems.gemCrystal); }
			if (MagnesiumConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(MagnesiumConfig.oredict.oreOreDict, ModItems.ingotMagnesium); }
			//if (PhosphorusConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(PhosphorusConfig.oredict.oreOreDict, ModItems.ingotPhosphorus); }
			//if (SulfurConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(SulfurConfig.oredict.oreOreDict, ModItems.ingotSulfur); }
			if (SilvaniteConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(SilvaniteConfig.oredict.oreOreDict, ModItems.ingotSilvanite); }
			if (MerciliteConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(MerciliteConfig.oredict.oreOreDict, ModItems.ingotMercilite); }
			if (MythianConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(MythianConfig.oredict.oreOreDict, ModItems.ingotMythian); }
			if (DragiteConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(DragiteConfig.oredict.oreOreDict, ModItems.ingotDragite); }
			if (FlariteConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(FlariteConfig.oredict.oreOreDict, ModItems.ingotFlarite); }
			if (FureniumConfig.recipes.oreSmeltingEnabled) { 		addOreDictFurnaceRecipe(FureniumConfig.oredict.oreOreDict, ModItems.ingotFurenium); }
			//if (BlackstoneConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(BlackstoneConfig.oredict.oreOreDict, ModItems.ingotBlackstone); }
			//if (BluestoneConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(BluestoneConfig.oredict.oreOreDict, ModItems.ingotBluestone); }
			//if (PurplestoneConfig.recipes.oreSmeltingEnabled) { 	addOreDictFurnaceRecipe(PurplestoneConfig.oredict.oreOreDict, ModItems.ingotPurplestone); }
			
			//No such thing as alloy ore. Skip!
		}
		
		if (_COreConfig.general.smeltImpureToIngot) {
			if (CopperConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(CopperConfig.oredict.dustImpureOreDict, ModItems.ingotCopper); }
			if (TinConfig.recipes.dustImpureSmeltingEnabled) {			addOreDictFurnaceRecipe(TinConfig.oredict.dustImpureOreDict, ModItems.ingotTin); }
			if (ZincConfig.recipes.dustImpureSmeltingEnabled) {			addOreDictFurnaceRecipe(ZincConfig.oredict.dustImpureOreDict, ModItems.ingotZinc); }
			if (NickelConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(NickelConfig.oredict.dustImpureOreDict, ModItems.ingotNickel); }
			if (SilverConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(SilverConfig.oredict.dustImpureOreDict, ModItems.ingotSilver); }
			if (AluminiumConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(AluminiumConfig.oredict.dustImpureOreDict, ModItems.ingotAluminium); }
			if (TitaniumConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(TitaniumConfig.oredict.dustImpureOreDict, ModItems.ingotTitanium); }
			if (ChromiumConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(ChromiumConfig.oredict.dustImpureOreDict, ModItems.ingotChromium); }
			if (SiliconConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(SiliconConfig.oredict.dustImpureOreDict, ModItems.ingotSilicon); }
			if (CobaltConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(CobaltConfig.oredict.dustImpureOreDict, ModItems.ingotCobalt); }
			if (TungstenConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(TungstenConfig.oredict.dustImpureOreDict, ModItems.ingotTungsten); }
			if (LeadConfig.recipes.dustImpureSmeltingEnabled) {			addOreDictFurnaceRecipe(LeadConfig.oredict.dustImpureOreDict, ModItems.ingotLead); }
			if (PlatinumConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(PlatinumConfig.oredict.dustImpureOreDict, ModItems.ingotPlatinum); }
			if (LithiumConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(LithiumConfig.oredict.dustImpureOreDict, ModItems.ingotLithium); }
			if (UraniumConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(UraniumConfig.oredict.dustImpureOreDict, ModItems.ingotUranium); }
			if (PlutoniumConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(PlutoniumConfig.oredict.dustImpureOreDict, ModItems.ingotPlutonium); }
			
			//if (RubyConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(RubyConfig.oredict.dustImpureOreDict, ModItems.gemRuby); }
			//if (SapphireConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(SapphireConfig.oredict.dustImpureOreDict, ModItems.gemSapphire); }
			//if (AmethystConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(AmethystConfig.oredict.dustImpureOreDict, ModItems.gemAmethyst); }
			//if (CrystalConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(CrystalConfig.oredict.dustImpureOreDict, ModItems.gemCrystal); }
			if (MagnesiumConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(MagnesiumConfig.oredict.dustImpureOreDict, ModItems.ingotMagnesium); }
			//if (PhosphorusConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(PhosphorusConfig.oredict.dustImpureOreDict, ModItems.ingotPhosphorus); }
			//if (SulfurConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(SulfurConfig.oredict.dustImpureOreDict, ModItems.ingotSulfur); }
			if (SilvaniteConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(SilvaniteConfig.oredict.dustImpureOreDict, ModItems.ingotSilvanite); }
			if (MerciliteConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(MerciliteConfig.oredict.dustImpureOreDict, ModItems.ingotMercilite); }
			if (MythianConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(MythianConfig.oredict.dustImpureOreDict, ModItems.ingotMythian); }
			if (DragiteConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(DragiteConfig.oredict.dustImpureOreDict, ModItems.ingotDragite); }
			if (FlariteConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(FlariteConfig.oredict.dustImpureOreDict, ModItems.ingotFlarite); }
			if (FureniumConfig.recipes.dustImpureSmeltingEnabled) {		addOreDictFurnaceRecipe(FureniumConfig.oredict.dustImpureOreDict, ModItems.ingotFurenium); }
			//if (BlackstoneConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(BlackstoneConfig.oredict.dustImpureOreDict, ModItems.ingotBlackstone); }
			//if (BluestoneConfig.recipes.dustImpureSmeltingEnabled) {	addOreDictFurnaceRecipe(BluestoneConfig.oredict.dustImpureOreDict, ModItems.ingotBluestone); }
			//if (PurplestoneConfig.recipes.dustImpureSmeltingEnabled) {addOreDictFurnaceRecipe(PurplestoneConfig.oredict.dustImpureOreDict, ModItems.ingotPurplestone); }
			
			//No such thing as alloy impure dust. Skip!
		}
		
		if (_COreConfig.general.smeltTinyDustToNugget) {
			if (CopperConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(CopperConfig.oredict.dustTinyOreDict, ModItems.nuggetCopper); }
			if (TinConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(TinConfig.oredict.dustTinyOreDict, ModItems.nuggetTin); }
			if (ZincConfig.recipes.dustTinySmeltingEnabled) {		addOreDictFurnaceRecipe(ZincConfig.oredict.dustTinyOreDict, ModItems.nuggetZinc); }
			if (NickelConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(NickelConfig.oredict.dustTinyOreDict, ModItems.nuggetNickel); }
			if (SilverConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(SilverConfig.oredict.dustTinyOreDict, ModItems.nuggetSilver); }
			if (AluminiumConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(AluminiumConfig.oredict.dustTinyOreDict, ModItems.nuggetAluminium); }
			if (TitaniumConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(TitaniumConfig.oredict.dustTinyOreDict, ModItems.nuggetTitanium); }
			if (ChromiumConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(ChromiumConfig.oredict.dustTinyOreDict, ModItems.nuggetChromium); }
			//if (SiliconConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(SiliconConfig.oredict.dustTinyOreDict, ModItems.nuggetSilicon); }
			if (CobaltConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(CobaltConfig.oredict.dustTinyOreDict, ModItems.nuggetCobalt); }
			if (TungstenConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(TungstenConfig.oredict.dustTinyOreDict, ModItems.nuggetTungsten); }
			if (LeadConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(LeadConfig.oredict.dustTinyOreDict, ModItems.nuggetLead); }
			if (PlatinumConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(PlatinumConfig.oredict.dustTinyOreDict, ModItems.nuggetPlatinum); }
			if (LithiumConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(LithiumConfig.oredict.dustTinyOreDict, ModItems.nuggetLithium); }
			if (UraniumConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(UraniumConfig.oredict.dustTinyOreDict, ModItems.nuggetUranium); }
			if (PlutoniumConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(PlutoniumConfig.oredict.dustTinyOreDict, ModItems.nuggetPlutonium); }
			
			//if (RubyConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(RubyConfig.oredict.dustTinyOreDict, ModItems.nuggetRuby); }
			//if (SapphireConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(SapphireConfig.oredict.dustTinyOreDict, ModItems.nuggetSapphire); }
			//if (AmethystConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(AmethystConfig.oredict.dustTinyOreDict, ModItems.nuggetAmethyst); }
			//if (CrystalConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(CrystalConfig.oredict.dustTinyOreDict, ModItems.nuggetCrystal); }
			if (MagnesiumConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(MagnesiumConfig.oredict.dustTinyOreDict, ModItems.nuggetMagnesium); }
			//if (PhosphorusConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(PhosphorusConfig.oredict.dustTinyOreDict, ModItems.nuggetPhosphorus); }
			//if (SulfurConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(SulfurConfig.oredict.dustTinyOreDict, ModItems.nuggetSulfur); }
			if (SilvaniteConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(SilvaniteConfig.oredict.dustTinyOreDict, ModItems.nuggetSilvanite); }
			if (MerciliteConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(MerciliteConfig.oredict.dustTinyOreDict, ModItems.nuggetMercilite); }
			if (MythianConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(MythianConfig.oredict.dustTinyOreDict, ModItems.nuggetMythian); }
			if (DragiteConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(DragiteConfig.oredict.dustTinyOreDict, ModItems.nuggetDragite); }
			if (FlariteConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(FlariteConfig.oredict.dustTinyOreDict, ModItems.nuggetFlarite); }
			if (FureniumConfig.recipes.dustTinySmeltingEnabled) {		addOreDictFurnaceRecipe(FureniumConfig.oredict.dustTinyOreDict, ModItems.nuggetFurenium); }
			//if (BlackstoneConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(BlackstoneConfig.oredict.dustTinyOreDict, ModItems.nuggetBlackstone); }
			//if (BluestoneConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(BluestoneConfig.oredict.dustTinyOreDict, ModItems.nuggetBluestone); }
			//if (PurplestoneConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(PurplestoneConfig.oredict.dustTinyOreDict, ModItems.nuggetPurplestone); }
				
			if (AlloyBronzeConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyBronzeConfig.oredict.dustTinyOreDict, ModItems.nuggetBronze); }
			if (AlloyCupronickelConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(AlloyCupronickelConfig.oredict.dustTinyOreDict, ModItems.nuggetCupronickel); }
			if (AlloyBrassConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyBrassConfig.oredict.dustTinyOreDict, ModItems.nuggetBrass); }
			if (AlloyRoseGoldConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyRoseGoldConfig.oredict.dustTinyOreDict, ModItems.nuggetRosegold); }
			if (AlloySteelConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloySteelConfig.oredict.dustTinyOreDict, ModItems.nuggetSteel); }
			if (AlloyStainlessSteelConfig.recipes.dustTinySmeltingEnabled) { 	addOreDictFurnaceRecipe(AlloyStainlessSteelConfig.oredict.dustTinyOreDict, ModItems.nuggetStainlesssteel); }
			if (AlloyNichromeConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyNichromeConfig.oredict.dustTinyOreDict, ModItems.nuggetNichrome); }
			if (AlloyElectrumConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyElectrumConfig.oredict.dustTinyOreDict, ModItems.nuggetElectrum); }
			if (AlloyStelliteConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyStelliteConfig.oredict.dustTinyOreDict, ModItems.nuggetStellite); }
			if (AlloySilvamerConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloySilvamerConfig.oredict.dustTinyOreDict, ModItems.nuggetSilvamer); }
			if (AlloyUniumConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyUniumConfig.oredict.dustTinyOreDict, ModItems.nuggetUnium); }
			if (AlloyFenikisiteConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(AlloyFenikisiteConfig.oredict.dustTinyOreDict, ModItems.nuggetFenikisite); }
			if (AlloyUltimiteConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyUltimiteConfig.oredict.dustTinyOreDict, ModItems.nuggetUltimite); }
			if (AlloyStrootiteConfig.recipes.dustTinySmeltingEnabled) { 		addOreDictFurnaceRecipe(AlloyStrootiteConfig.oredict.dustTinyOreDict, ModItems.nuggetStrootite); }
			if (AlloySpeedoiConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloySpeedoiConfig.oredict.dustTinyOreDict, ModItems.nuggetSpeedoi); }
			if (AlloyLegeniteConfig.recipes.dustTinySmeltingEnabled) { 			addOreDictFurnaceRecipe(AlloyLegeniteConfig.oredict.dustTinyOreDict, ModItems.nuggetLegenite); }
		}
	}
	
	public static void thermalExpansionRecipes() {
		if (_COreConfig.cofh.aaa_disableCoFHRecipes) {
			disableCoFHRecipes();
		}
		
		if (_COreConfig.cofh.pulveriserRecipes) {
			//Ore to ingot
			addTEPulverizerRecipe(CopperConfig.recipes.oreCrushingEnabled, CopperConfig.recipes.oreCrusherEnergyUsage, CopperConfig.oredict.oreOreDict, CopperConfig.recipes.oreCrusherPrimaryOutput, CopperConfig.recipes.oreCrusherPrimaryOutputAmount,
					CopperConfig.recipes.oreCrusherSecondaryOutput, CopperConfig.recipes.oreCrusherSecondaryOutputAmount, CopperConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(TinConfig.recipes.oreCrushingEnabled, TinConfig.recipes.oreCrusherEnergyUsage, TinConfig.oredict.oreOreDict, TinConfig.recipes.oreCrusherPrimaryOutput, TinConfig.recipes.oreCrusherPrimaryOutputAmount,
					TinConfig.recipes.oreCrusherSecondaryOutput, TinConfig.recipes.oreCrusherSecondaryOutputAmount, TinConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(ZincConfig.recipes.oreCrushingEnabled, ZincConfig.recipes.oreCrusherEnergyUsage, ZincConfig.oredict.oreOreDict, ZincConfig.recipes.oreCrusherPrimaryOutput, ZincConfig.recipes.oreCrusherPrimaryOutputAmount,
					ZincConfig.recipes.oreCrusherSecondaryOutput, ZincConfig.recipes.oreCrusherSecondaryOutputAmount, ZincConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(NickelConfig.recipes.oreCrushingEnabled, NickelConfig.recipes.oreCrusherEnergyUsage, NickelConfig.oredict.oreOreDict, NickelConfig.recipes.oreCrusherPrimaryOutput, NickelConfig.recipes.oreCrusherPrimaryOutputAmount,
					NickelConfig.recipes.oreCrusherSecondaryOutput, NickelConfig.recipes.oreCrusherSecondaryOutputAmount, NickelConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(SilverConfig.recipes.oreCrushingEnabled, SilverConfig.recipes.oreCrusherEnergyUsage, SilverConfig.oredict.oreOreDict, SilverConfig.recipes.oreCrusherPrimaryOutput, SilverConfig.recipes.oreCrusherPrimaryOutputAmount,
					SilverConfig.recipes.oreCrusherSecondaryOutput, SilverConfig.recipes.oreCrusherSecondaryOutputAmount, SilverConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(AluminiumConfig.recipes.oreCrushingEnabled, AluminiumConfig.recipes.oreCrusherEnergyUsage, AluminiumConfig.oredict.oreOreDict, AluminiumConfig.recipes.oreCrusherPrimaryOutput, AluminiumConfig.recipes.oreCrusherPrimaryOutputAmount,
					AluminiumConfig.recipes.oreCrusherSecondaryOutput, AluminiumConfig.recipes.oreCrusherSecondaryOutputAmount, AluminiumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(TitaniumConfig.recipes.oreCrushingEnabled, TitaniumConfig.recipes.oreCrusherEnergyUsage, TitaniumConfig.oredict.oreOreDict, TitaniumConfig.recipes.oreCrusherPrimaryOutput, TitaniumConfig.recipes.oreCrusherPrimaryOutputAmount,
					TitaniumConfig.recipes.oreCrusherSecondaryOutput, TitaniumConfig.recipes.oreCrusherSecondaryOutputAmount, TitaniumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(ChromiumConfig.recipes.oreCrushingEnabled, ChromiumConfig.recipes.oreCrusherEnergyUsage, ChromiumConfig.oredict.oreOreDict, ChromiumConfig.recipes.oreCrusherPrimaryOutput, ChromiumConfig.recipes.oreCrusherPrimaryOutputAmount,
					ChromiumConfig.recipes.oreCrusherSecondaryOutput, ChromiumConfig.recipes.oreCrusherSecondaryOutputAmount, ChromiumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(SiliconConfig.recipes.oreCrushingEnabled, SiliconConfig.recipes.oreCrusherEnergyUsage, SiliconConfig.oredict.oreOreDict, SiliconConfig.recipes.oreCrusherPrimaryOutput, SiliconConfig.recipes.oreCrusherPrimaryOutputAmount,
					SiliconConfig.recipes.oreCrusherSecondaryOutput, SiliconConfig.recipes.oreCrusherSecondaryOutputAmount, SiliconConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(CobaltConfig.recipes.oreCrushingEnabled, CobaltConfig.recipes.oreCrusherEnergyUsage, CobaltConfig.oredict.oreOreDict, CobaltConfig.recipes.oreCrusherPrimaryOutput, CobaltConfig.recipes.oreCrusherPrimaryOutputAmount,
					CobaltConfig.recipes.oreCrusherSecondaryOutput, CobaltConfig.recipes.oreCrusherSecondaryOutputAmount, CobaltConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(TungstenConfig.recipes.oreCrushingEnabled, TungstenConfig.recipes.oreCrusherEnergyUsage, TungstenConfig.oredict.oreOreDict, TungstenConfig.recipes.oreCrusherPrimaryOutput, TungstenConfig.recipes.oreCrusherPrimaryOutputAmount,
					TungstenConfig.recipes.oreCrusherSecondaryOutput, TungstenConfig.recipes.oreCrusherSecondaryOutputAmount, TungstenConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(LeadConfig.recipes.oreCrushingEnabled, LeadConfig.recipes.oreCrusherEnergyUsage, LeadConfig.oredict.oreOreDict, LeadConfig.recipes.oreCrusherPrimaryOutput, LeadConfig.recipes.oreCrusherPrimaryOutputAmount,
					LeadConfig.recipes.oreCrusherSecondaryOutput, LeadConfig.recipes.oreCrusherSecondaryOutputAmount, LeadConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(PlatinumConfig.recipes.oreCrushingEnabled, PlatinumConfig.recipes.oreCrusherEnergyUsage, PlatinumConfig.oredict.oreOreDict, PlatinumConfig.recipes.oreCrusherPrimaryOutput, PlatinumConfig.recipes.oreCrusherPrimaryOutputAmount,
					PlatinumConfig.recipes.oreCrusherSecondaryOutput, PlatinumConfig.recipes.oreCrusherSecondaryOutputAmount, PlatinumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(LithiumConfig.recipes.oreCrushingEnabled, LithiumConfig.recipes.oreCrusherEnergyUsage, LithiumConfig.oredict.oreOreDict, LithiumConfig.recipes.oreCrusherPrimaryOutput, LithiumConfig.recipes.oreCrusherPrimaryOutputAmount,
					LithiumConfig.recipes.oreCrusherSecondaryOutput, LithiumConfig.recipes.oreCrusherSecondaryOutputAmount, LithiumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(UraniumConfig.recipes.oreCrushingEnabled, UraniumConfig.recipes.oreCrusherEnergyUsage, UraniumConfig.oredict.oreOreDict, UraniumConfig.recipes.oreCrusherPrimaryOutput, UraniumConfig.recipes.oreCrusherPrimaryOutputAmount,
					UraniumConfig.recipes.oreCrusherSecondaryOutput, UraniumConfig.recipes.oreCrusherSecondaryOutputAmount, UraniumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(PlutoniumConfig.recipes.oreCrushingEnabled, PlutoniumConfig.recipes.oreCrusherEnergyUsage, PlutoniumConfig.oredict.oreOreDict, PlutoniumConfig.recipes.oreCrusherPrimaryOutput, PlutoniumConfig.recipes.oreCrusherPrimaryOutputAmount,
					PlutoniumConfig.recipes.oreCrusherSecondaryOutput, PlutoniumConfig.recipes.oreCrusherSecondaryOutputAmount, PlutoniumConfig.recipes.oreCrusherSecondaryOutputChance);
			
			addTEPulverizerRecipe(RubyConfig.recipes.oreCrushingEnabled, RubyConfig.recipes.oreCrusherEnergyUsage, RubyConfig.oredict.oreOreDict, RubyConfig.recipes.oreCrusherPrimaryOutput, RubyConfig.recipes.oreCrusherPrimaryOutputAmount,
					RubyConfig.recipes.oreCrusherSecondaryOutput, RubyConfig.recipes.oreCrusherSecondaryOutputAmount, RubyConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(SapphireConfig.recipes.oreCrushingEnabled, SapphireConfig.recipes.oreCrusherEnergyUsage, SapphireConfig.oredict.oreOreDict, SapphireConfig.recipes.oreCrusherPrimaryOutput, SapphireConfig.recipes.oreCrusherPrimaryOutputAmount,
					SapphireConfig.recipes.oreCrusherSecondaryOutput, SapphireConfig.recipes.oreCrusherSecondaryOutputAmount, SapphireConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(AmethystConfig.recipes.oreCrushingEnabled, AmethystConfig.recipes.oreCrusherEnergyUsage, AmethystConfig.oredict.oreOreDict, AmethystConfig.recipes.oreCrusherPrimaryOutput, AmethystConfig.recipes.oreCrusherPrimaryOutputAmount,
					AmethystConfig.recipes.oreCrusherSecondaryOutput, AmethystConfig.recipes.oreCrusherSecondaryOutputAmount, AmethystConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(CrystalConfig.recipes.oreCrushingEnabled, CrystalConfig.recipes.oreCrusherEnergyUsage, CrystalConfig.oredict.oreOreDict, CrystalConfig.recipes.oreCrusherPrimaryOutput, CrystalConfig.recipes.oreCrusherPrimaryOutputAmount,
					CrystalConfig.recipes.oreCrusherSecondaryOutput, CrystalConfig.recipes.oreCrusherSecondaryOutputAmount, CrystalConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(MagnesiumConfig.recipes.oreCrushingEnabled, MagnesiumConfig.recipes.oreCrusherEnergyUsage, MagnesiumConfig.oredict.oreOreDict, MagnesiumConfig.recipes.oreCrusherPrimaryOutput, MagnesiumConfig.recipes.oreCrusherPrimaryOutputAmount,
					MagnesiumConfig.recipes.oreCrusherSecondaryOutput, MagnesiumConfig.recipes.oreCrusherSecondaryOutputAmount, MagnesiumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(PhosphorusConfig.recipes.oreCrushingEnabled, PhosphorusConfig.recipes.oreCrusherEnergyUsage, PhosphorusConfig.oredict.oreOreDict, PhosphorusConfig.recipes.oreCrusherPrimaryOutput, PhosphorusConfig.recipes.oreCrusherPrimaryOutputAmount,
					PhosphorusConfig.recipes.oreCrusherSecondaryOutput, PhosphorusConfig.recipes.oreCrusherSecondaryOutputAmount, PhosphorusConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(SulfurConfig.recipes.oreCrushingEnabled, SulfurConfig.recipes.oreCrusherEnergyUsage, SulfurConfig.oredict.oreOreDict, SulfurConfig.recipes.oreCrusherPrimaryOutput, SulfurConfig.recipes.oreCrusherPrimaryOutputAmount,
					SulfurConfig.recipes.oreCrusherSecondaryOutput, SulfurConfig.recipes.oreCrusherSecondaryOutputAmount, SulfurConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(SilvaniteConfig.recipes.oreCrushingEnabled, SilvaniteConfig.recipes.oreCrusherEnergyUsage, SilvaniteConfig.oredict.oreOreDict, SilvaniteConfig.recipes.oreCrusherPrimaryOutput, SilvaniteConfig.recipes.oreCrusherPrimaryOutputAmount,
					SilvaniteConfig.recipes.oreCrusherSecondaryOutput, SilvaniteConfig.recipes.oreCrusherSecondaryOutputAmount, SilvaniteConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(MerciliteConfig.recipes.oreCrushingEnabled, MerciliteConfig.recipes.oreCrusherEnergyUsage, MerciliteConfig.oredict.oreOreDict, MerciliteConfig.recipes.oreCrusherPrimaryOutput, MerciliteConfig.recipes.oreCrusherPrimaryOutputAmount,
					MerciliteConfig.recipes.oreCrusherSecondaryOutput, MerciliteConfig.recipes.oreCrusherSecondaryOutputAmount, MerciliteConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(MythianConfig.recipes.oreCrushingEnabled, MythianConfig.recipes.oreCrusherEnergyUsage, MythianConfig.oredict.oreOreDict, MythianConfig.recipes.oreCrusherPrimaryOutput, MythianConfig.recipes.oreCrusherPrimaryOutputAmount,
					MythianConfig.recipes.oreCrusherSecondaryOutput, MythianConfig.recipes.oreCrusherSecondaryOutputAmount, MythianConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(DragiteConfig.recipes.oreCrushingEnabled, DragiteConfig.recipes.oreCrusherEnergyUsage, DragiteConfig.oredict.oreOreDict, DragiteConfig.recipes.oreCrusherPrimaryOutput, DragiteConfig.recipes.oreCrusherPrimaryOutputAmount,
					DragiteConfig.recipes.oreCrusherSecondaryOutput, DragiteConfig.recipes.oreCrusherSecondaryOutputAmount, DragiteConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(FlariteConfig.recipes.oreCrushingEnabled, FlariteConfig.recipes.oreCrusherEnergyUsage, FlariteConfig.oredict.oreOreDict, FlariteConfig.recipes.oreCrusherPrimaryOutput, FlariteConfig.recipes.oreCrusherPrimaryOutputAmount,
					FlariteConfig.recipes.oreCrusherSecondaryOutput, FlariteConfig.recipes.oreCrusherSecondaryOutputAmount, FlariteConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(FureniumConfig.recipes.oreCrushingEnabled, FureniumConfig.recipes.oreCrusherEnergyUsage, FureniumConfig.oredict.oreOreDict, FureniumConfig.recipes.oreCrusherPrimaryOutput, FureniumConfig.recipes.oreCrusherPrimaryOutputAmount,
					FureniumConfig.recipes.oreCrusherSecondaryOutput, FureniumConfig.recipes.oreCrusherSecondaryOutputAmount, FureniumConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(BlackstoneConfig.recipes.oreCrushingEnabled, BlackstoneConfig.recipes.oreCrusherEnergyUsage, BlackstoneConfig.oredict.oreOreDict, BlackstoneConfig.recipes.oreCrusherPrimaryOutput, BlackstoneConfig.recipes.oreCrusherPrimaryOutputAmount,
					BlackstoneConfig.recipes.oreCrusherSecondaryOutput, BlackstoneConfig.recipes.oreCrusherSecondaryOutputAmount, BlackstoneConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(BluestoneConfig.recipes.oreCrushingEnabled, BluestoneConfig.recipes.oreCrusherEnergyUsage, BluestoneConfig.oredict.oreOreDict, BluestoneConfig.recipes.oreCrusherPrimaryOutput, BluestoneConfig.recipes.oreCrusherPrimaryOutputAmount,
					BluestoneConfig.recipes.oreCrusherSecondaryOutput, BluestoneConfig.recipes.oreCrusherSecondaryOutputAmount, BluestoneConfig.recipes.oreCrusherSecondaryOutputChance);
			addTEPulverizerRecipe(PurplestoneConfig.recipes.oreCrushingEnabled, PurplestoneConfig.recipes.oreCrusherEnergyUsage, PurplestoneConfig.oredict.oreOreDict, PurplestoneConfig.recipes.oreCrusherPrimaryOutput, PurplestoneConfig.recipes.oreCrusherPrimaryOutputAmount,
					PurplestoneConfig.recipes.oreCrusherSecondaryOutput, PurplestoneConfig.recipes.oreCrusherSecondaryOutputAmount, PurplestoneConfig.recipes.oreCrusherSecondaryOutputChance);
			
			//Ingot to dust
			addTEPulverizerRecipe(CopperConfig.recipes.ingotCrushingEnabled, CopperConfig.recipes.ingotCrusherEnergyUsage, CopperConfig.oredict.ingotOreDict, CopperConfig.recipes.ingotCrusherOutput, CopperConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(TinConfig.recipes.ingotCrushingEnabled, TinConfig.recipes.ingotCrusherEnergyUsage, TinConfig.oredict.ingotOreDict, TinConfig.recipes.ingotCrusherOutput, TinConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(ZincConfig.recipes.ingotCrushingEnabled, ZincConfig.recipes.ingotCrusherEnergyUsage, ZincConfig.oredict.ingotOreDict, ZincConfig.recipes.ingotCrusherOutput, ZincConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(NickelConfig.recipes.ingotCrushingEnabled, NickelConfig.recipes.ingotCrusherEnergyUsage, NickelConfig.oredict.ingotOreDict, NickelConfig.recipes.ingotCrusherOutput, NickelConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(SilverConfig.recipes.ingotCrushingEnabled, SilverConfig.recipes.ingotCrusherEnergyUsage, SilverConfig.oredict.ingotOreDict, SilverConfig.recipes.ingotCrusherOutput, SilverConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AluminiumConfig.recipes.ingotCrushingEnabled, AluminiumConfig.recipes.ingotCrusherEnergyUsage, AluminiumConfig.oredict.ingotOreDict, AluminiumConfig.recipes.ingotCrusherOutput, AluminiumConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(TitaniumConfig.recipes.ingotCrushingEnabled, TitaniumConfig.recipes.ingotCrusherEnergyUsage, TitaniumConfig.oredict.ingotOreDict, TitaniumConfig.recipes.ingotCrusherOutput, TitaniumConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(ChromiumConfig.recipes.ingotCrushingEnabled, ChromiumConfig.recipes.ingotCrusherEnergyUsage, ChromiumConfig.oredict.ingotOreDict, ChromiumConfig.recipes.ingotCrusherOutput, ChromiumConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(SiliconConfig.recipes.ingotCrushingEnabled, SiliconConfig.recipes.ingotCrusherEnergyUsage, SiliconConfig.oredict.ingotOreDict, SiliconConfig.recipes.ingotCrusherOutput, SiliconConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(CobaltConfig.recipes.ingotCrushingEnabled, CobaltConfig.recipes.ingotCrusherEnergyUsage, CobaltConfig.oredict.ingotOreDict, CobaltConfig.recipes.ingotCrusherOutput, CobaltConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(TungstenConfig.recipes.ingotCrushingEnabled, TungstenConfig.recipes.ingotCrusherEnergyUsage, TungstenConfig.oredict.ingotOreDict, TungstenConfig.recipes.ingotCrusherOutput, TungstenConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(LeadConfig.recipes.ingotCrushingEnabled, LeadConfig.recipes.ingotCrusherEnergyUsage, LeadConfig.oredict.ingotOreDict, LeadConfig.recipes.ingotCrusherOutput, LeadConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(PlatinumConfig.recipes.ingotCrushingEnabled, PlatinumConfig.recipes.ingotCrusherEnergyUsage, PlatinumConfig.oredict.ingotOreDict, PlatinumConfig.recipes.ingotCrusherOutput, PlatinumConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(LithiumConfig.recipes.ingotCrushingEnabled, LithiumConfig.recipes.ingotCrusherEnergyUsage, LithiumConfig.oredict.ingotOreDict, LithiumConfig.recipes.ingotCrusherOutput, LithiumConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(UraniumConfig.recipes.ingotCrushingEnabled, UraniumConfig.recipes.ingotCrusherEnergyUsage, UraniumConfig.oredict.ingotOreDict, UraniumConfig.recipes.ingotCrusherOutput, UraniumConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(PlutoniumConfig.recipes.ingotCrushingEnabled, PlutoniumConfig.recipes.ingotCrusherEnergyUsage, PlutoniumConfig.oredict.ingotOreDict, PlutoniumConfig.recipes.ingotCrusherOutput, PlutoniumConfig.recipes.ingotCrusherOutputAmount);
			
			addTEPulverizerRecipe(RubyConfig.recipes.gemCrushingEnabled, RubyConfig.recipes.gemCrusherEnergyUsage, RubyConfig.oredict.gemOreDict, RubyConfig.recipes.gemCrusherOutput, RubyConfig.recipes.gemCrusherOutputAmount);
			addTEPulverizerRecipe(SapphireConfig.recipes.gemCrushingEnabled, SapphireConfig.recipes.gemCrusherEnergyUsage, SapphireConfig.oredict.gemOreDict, SapphireConfig.recipes.gemCrusherOutput, SapphireConfig.recipes.gemCrusherOutputAmount);
			addTEPulverizerRecipe(AmethystConfig.recipes.gemCrushingEnabled, AmethystConfig.recipes.gemCrusherEnergyUsage, AmethystConfig.oredict.gemOreDict, AmethystConfig.recipes.gemCrusherOutput, AmethystConfig.recipes.gemCrusherOutputAmount);
			addTEPulverizerRecipe(CrystalConfig.recipes.gemCrushingEnabled, CrystalConfig.recipes.gemCrusherEnergyUsage, CrystalConfig.oredict.gemOreDict, CrystalConfig.recipes.gemCrusherOutput, CrystalConfig.recipes.gemCrusherOutputAmount);
			addTEPulverizerRecipe(MagnesiumConfig.recipes.ingotCrushingEnabled, MagnesiumConfig.recipes.ingotCrusherEnergyUsage, MagnesiumConfig.oredict.ingotOreDict, MagnesiumConfig.recipes.ingotCrusherOutput, MagnesiumConfig.recipes.ingotCrusherOutputAmount);
			//addTEPulverizerRecipe(PhosphorusConfig.recipes.ingotCrushingEnabled, PhosphorusConfig.recipes.ingotCrusherEnergyUsage, PhosphorusConfig.oredict.ingotOreDict, PhosphorusConfig.recipes.ingotCrusherOutput, PhosphorusConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(SulfurConfig.recipes.ingotCrushingEnabled, SulfurConfig.recipes.ingotCrusherEnergyUsage, SulfurConfig.oredict.ingotOreDict, SulfurConfig.recipes.ingotCrusherOutput, SulfurConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(SilvaniteConfig.recipes.ingotCrushingEnabled, SilvaniteConfig.recipes.ingotCrusherEnergyUsage, SilvaniteConfig.oredict.ingotOreDict, SilvaniteConfig.recipes.ingotCrusherOutput, SilvaniteConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(MerciliteConfig.recipes.ingotCrushingEnabled, MerciliteConfig.recipes.ingotCrusherEnergyUsage, MerciliteConfig.oredict.ingotOreDict, MerciliteConfig.recipes.ingotCrusherOutput, MerciliteConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(MythianConfig.recipes.ingotCrushingEnabled, MythianConfig.recipes.ingotCrusherEnergyUsage, MythianConfig.oredict.ingotOreDict, MythianConfig.recipes.ingotCrusherOutput, MythianConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(DragiteConfig.recipes.ingotCrushingEnabled, DragiteConfig.recipes.ingotCrusherEnergyUsage, DragiteConfig.oredict.ingotOreDict, DragiteConfig.recipes.ingotCrusherOutput, DragiteConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(FlariteConfig.recipes.ingotCrushingEnabled, FlariteConfig.recipes.ingotCrusherEnergyUsage, FlariteConfig.oredict.ingotOreDict, FlariteConfig.recipes.ingotCrusherOutput, FlariteConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(FureniumConfig.recipes.ingotCrushingEnabled, FureniumConfig.recipes.ingotCrusherEnergyUsage, FureniumConfig.oredict.ingotOreDict, FureniumConfig.recipes.ingotCrusherOutput, FureniumConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(BlackstoneConfig.recipes.ingotCrushingEnabled, BlackstoneConfig.recipes.ingotCrusherEnergyUsage, BlackstoneConfig.oredict.ingotOreDict, BlackstoneConfig.recipes.ingotCrusherOutput, BlackstoneConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(BluestoneConfig.recipes.ingotCrushingEnabled, BluestoneConfig.recipes.ingotCrusherEnergyUsage, BluestoneConfig.oredict.ingotOreDict, BluestoneConfig.recipes.ingotCrusherOutput, BluestoneConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(PurplestoneConfig.recipes.ingotCrushingEnabled, PurplestoneConfig.recipes.ingotCrusherEnergyUsage, PurplestoneConfig.oredict.ingotOreDict, PurplestoneConfig.recipes.ingotCrusherOutput, PurplestoneConfig.recipes.ingotCrusherOutputAmount);
			
			addTEPulverizerRecipe(AlloyBronzeConfig.recipes.ingotCrushingEnabled, AlloyBronzeConfig.recipes.ingotCrusherEnergyUsage, AlloyBronzeConfig.oredict.ingotOreDict, AlloyBronzeConfig.recipes.ingotCrusherOutput, AlloyBronzeConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyCupronickelConfig.recipes.ingotCrushingEnabled, AlloyCupronickelConfig.recipes.ingotCrusherEnergyUsage, AlloyCupronickelConfig.oredict.ingotOreDict, AlloyCupronickelConfig.recipes.ingotCrusherOutput, AlloyCupronickelConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyBrassConfig.recipes.ingotCrushingEnabled, AlloyBrassConfig.recipes.ingotCrusherEnergyUsage, AlloyBrassConfig.oredict.ingotOreDict, AlloyBrassConfig.recipes.ingotCrusherOutput, AlloyBrassConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyRoseGoldConfig.recipes.ingotCrushingEnabled, AlloyRoseGoldConfig.recipes.ingotCrusherEnergyUsage, AlloyRoseGoldConfig.oredict.ingotOreDict, AlloyRoseGoldConfig.recipes.ingotCrusherOutput, AlloyRoseGoldConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloySteelConfig.recipes.ingotCrushingEnabled, AlloySteelConfig.recipes.ingotCrusherEnergyUsage, AlloySteelConfig.oredict.ingotOreDict, AlloySteelConfig.recipes.ingotCrusherOutput, AlloySteelConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyStainlessSteelConfig.recipes.ingotCrushingEnabled, AlloyStainlessSteelConfig.recipes.ingotCrusherEnergyUsage, AlloyStainlessSteelConfig.oredict.ingotOreDict, AlloyStainlessSteelConfig.recipes.ingotCrusherOutput, AlloyStainlessSteelConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyNichromeConfig.recipes.ingotCrushingEnabled, AlloyNichromeConfig.recipes.ingotCrusherEnergyUsage, AlloyNichromeConfig.oredict.ingotOreDict, AlloyNichromeConfig.recipes.ingotCrusherOutput, AlloyNichromeConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyElectrumConfig.recipes.ingotCrushingEnabled, AlloyElectrumConfig.recipes.ingotCrusherEnergyUsage, AlloyElectrumConfig.oredict.ingotOreDict, AlloyElectrumConfig.recipes.ingotCrusherOutput, AlloyElectrumConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyStelliteConfig.recipes.ingotCrushingEnabled, AlloyStelliteConfig.recipes.ingotCrusherEnergyUsage, AlloyStelliteConfig.oredict.ingotOreDict, AlloyStelliteConfig.recipes.ingotCrusherOutput, AlloyStelliteConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloySilvamerConfig.recipes.ingotCrushingEnabled, AlloySilvamerConfig.recipes.ingotCrusherEnergyUsage, AlloySilvamerConfig.oredict.ingotOreDict, AlloySilvamerConfig.recipes.ingotCrusherOutput, AlloySilvamerConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyUniumConfig.recipes.ingotCrushingEnabled, AlloyUniumConfig.recipes.ingotCrusherEnergyUsage, AlloyUniumConfig.oredict.ingotOreDict, AlloyUniumConfig.recipes.ingotCrusherOutput, AlloyUniumConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyFenikisiteConfig.recipes.ingotCrushingEnabled, AlloyFenikisiteConfig.recipes.ingotCrusherEnergyUsage, AlloyFenikisiteConfig.oredict.ingotOreDict, AlloyFenikisiteConfig.recipes.ingotCrusherOutput, AlloyFenikisiteConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyUltimiteConfig.recipes.ingotCrushingEnabled, AlloyUltimiteConfig.recipes.ingotCrusherEnergyUsage, AlloyUltimiteConfig.oredict.ingotOreDict, AlloyUltimiteConfig.recipes.ingotCrusherOutput, AlloyUltimiteConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyStrootiteConfig.recipes.ingotCrushingEnabled, AlloyStrootiteConfig.recipes.ingotCrusherEnergyUsage, AlloyStrootiteConfig.oredict.ingotOreDict, AlloyStrootiteConfig.recipes.ingotCrusherOutput, AlloyStrootiteConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloySpeedoiConfig.recipes.ingotCrushingEnabled, AlloySpeedoiConfig.recipes.ingotCrusherEnergyUsage, AlloySpeedoiConfig.oredict.ingotOreDict, AlloySpeedoiConfig.recipes.ingotCrusherOutput, AlloySpeedoiConfig.recipes.ingotCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyLegeniteConfig.recipes.ingotCrushingEnabled, AlloyLegeniteConfig.recipes.ingotCrusherEnergyUsage, AlloyLegeniteConfig.oredict.ingotOreDict, AlloyLegeniteConfig.recipes.ingotCrusherOutput, AlloyLegeniteConfig.recipes.ingotCrusherOutputAmount);
			
			//Nugget to tiny dust
			addTEPulverizerRecipe(CopperConfig.recipes.nuggetCrushingEnabled, CopperConfig.recipes.nuggetCrusherEnergyUsage, CopperConfig.oredict.nuggetOreDict, CopperConfig.recipes.nuggetCrusherOutput, CopperConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(TinConfig.recipes.nuggetCrushingEnabled, TinConfig.recipes.nuggetCrusherEnergyUsage, TinConfig.oredict.nuggetOreDict, TinConfig.recipes.nuggetCrusherOutput, TinConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(ZincConfig.recipes.nuggetCrushingEnabled, ZincConfig.recipes.nuggetCrusherEnergyUsage, ZincConfig.oredict.nuggetOreDict, ZincConfig.recipes.nuggetCrusherOutput, ZincConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(NickelConfig.recipes.nuggetCrushingEnabled, NickelConfig.recipes.nuggetCrusherEnergyUsage, NickelConfig.oredict.nuggetOreDict, NickelConfig.recipes.nuggetCrusherOutput, NickelConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(SilverConfig.recipes.nuggetCrushingEnabled, SilverConfig.recipes.nuggetCrusherEnergyUsage, SilverConfig.oredict.nuggetOreDict, SilverConfig.recipes.nuggetCrusherOutput, SilverConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AluminiumConfig.recipes.nuggetCrushingEnabled, AluminiumConfig.recipes.nuggetCrusherEnergyUsage, AluminiumConfig.oredict.nuggetOreDict, AluminiumConfig.recipes.nuggetCrusherOutput, AluminiumConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(TitaniumConfig.recipes.nuggetCrushingEnabled, TitaniumConfig.recipes.nuggetCrusherEnergyUsage, TitaniumConfig.oredict.nuggetOreDict, TitaniumConfig.recipes.nuggetCrusherOutput, TitaniumConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(ChromiumConfig.recipes.nuggetCrushingEnabled, ChromiumConfig.recipes.nuggetCrusherEnergyUsage, ChromiumConfig.oredict.nuggetOreDict, ChromiumConfig.recipes.nuggetCrusherOutput, ChromiumConfig.recipes.nuggetCrusherOutputAmount);
			//addTEPulverizerRecipe(SiliconConfig.recipes.nuggetCrushingEnabled, SiliconConfig.recipes.nuggetCrusherEnergyUsage, SiliconConfig.oredict.nuggetOreDict, SiliconConfig.recipes.nuggetCrusherOutput, SiliconConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(CobaltConfig.recipes.nuggetCrushingEnabled, CobaltConfig.recipes.nuggetCrusherEnergyUsage, CobaltConfig.oredict.nuggetOreDict, CobaltConfig.recipes.nuggetCrusherOutput, CobaltConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(TungstenConfig.recipes.nuggetCrushingEnabled, TungstenConfig.recipes.nuggetCrusherEnergyUsage, TungstenConfig.oredict.nuggetOreDict, TungstenConfig.recipes.nuggetCrusherOutput, TungstenConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(LeadConfig.recipes.nuggetCrushingEnabled, LeadConfig.recipes.nuggetCrusherEnergyUsage, LeadConfig.oredict.nuggetOreDict, LeadConfig.recipes.nuggetCrusherOutput, LeadConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(PlatinumConfig.recipes.nuggetCrushingEnabled, PlatinumConfig.recipes.nuggetCrusherEnergyUsage, PlatinumConfig.oredict.nuggetOreDict, PlatinumConfig.recipes.nuggetCrusherOutput, PlatinumConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(LithiumConfig.recipes.nuggetCrushingEnabled, LithiumConfig.recipes.nuggetCrusherEnergyUsage, LithiumConfig.oredict.nuggetOreDict, LithiumConfig.recipes.nuggetCrusherOutput, LithiumConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(UraniumConfig.recipes.nuggetCrushingEnabled, UraniumConfig.recipes.nuggetCrusherEnergyUsage, UraniumConfig.oredict.nuggetOreDict, UraniumConfig.recipes.nuggetCrusherOutput, UraniumConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(PlutoniumConfig.recipes.nuggetCrushingEnabled, PlutoniumConfig.recipes.nuggetCrusherEnergyUsage, PlutoniumConfig.oredict.nuggetOreDict, PlutoniumConfig.recipes.nuggetCrusherOutput, PlutoniumConfig.recipes.nuggetCrusherOutputAmount);
			
			addTEPulverizerRecipe(RubyConfig.recipes.nuggetCrushingEnabled, RubyConfig.recipes.nuggetCrusherEnergyUsage, RubyConfig.oredict.nuggetOreDict, RubyConfig.recipes.nuggetCrusherOutput, RubyConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(SapphireConfig.recipes.nuggetCrushingEnabled, SapphireConfig.recipes.nuggetCrusherEnergyUsage, SapphireConfig.oredict.nuggetOreDict, SapphireConfig.recipes.nuggetCrusherOutput, SapphireConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AmethystConfig.recipes.nuggetCrushingEnabled, AmethystConfig.recipes.nuggetCrusherEnergyUsage, AmethystConfig.oredict.nuggetOreDict, AmethystConfig.recipes.nuggetCrusherOutput, AmethystConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(CrystalConfig.recipes.nuggetCrushingEnabled, CrystalConfig.recipes.nuggetCrusherEnergyUsage, CrystalConfig.oredict.nuggetOreDict, CrystalConfig.recipes.nuggetCrusherOutput, CrystalConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(MagnesiumConfig.recipes.nuggetCrushingEnabled, MagnesiumConfig.recipes.nuggetCrusherEnergyUsage, MagnesiumConfig.oredict.nuggetOreDict, MagnesiumConfig.recipes.nuggetCrusherOutput, MagnesiumConfig.recipes.nuggetCrusherOutputAmount);
			//addTEPulverizerRecipe(PhosphorusConfig.recipes.nuggetCrushingEnabled, PhosphorusConfig.recipes.nuggetCrusherEnergyUsage, PhosphorusConfig.oredict.nuggetOreDict, PhosphorusConfig.recipes.nuggetCrusherOutput, PhosphorusConfig.recipes.nuggetCrusherOutputAmount);
			//addTEPulverizerRecipe(SulfurConfig.recipes.nuggetCrushingEnabled, SulfurConfig.recipes.nuggetCrusherEnergyUsage, SulfurConfig.oredict.nuggetOreDict, SulfurConfig.recipes.nuggetCrusherOutput, SulfurConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(SilvaniteConfig.recipes.nuggetCrushingEnabled, SilvaniteConfig.recipes.nuggetCrusherEnergyUsage, SilvaniteConfig.oredict.nuggetOreDict, SilvaniteConfig.recipes.nuggetCrusherOutput, SilvaniteConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(MerciliteConfig.recipes.nuggetCrushingEnabled, MerciliteConfig.recipes.nuggetCrusherEnergyUsage, MerciliteConfig.oredict.nuggetOreDict, MerciliteConfig.recipes.nuggetCrusherOutput, MerciliteConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(MythianConfig.recipes.nuggetCrushingEnabled, MythianConfig.recipes.nuggetCrusherEnergyUsage, MythianConfig.oredict.nuggetOreDict, MythianConfig.recipes.nuggetCrusherOutput, MythianConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(DragiteConfig.recipes.nuggetCrushingEnabled, DragiteConfig.recipes.nuggetCrusherEnergyUsage, DragiteConfig.oredict.nuggetOreDict, DragiteConfig.recipes.nuggetCrusherOutput, DragiteConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(FlariteConfig.recipes.nuggetCrushingEnabled, FlariteConfig.recipes.nuggetCrusherEnergyUsage, FlariteConfig.oredict.nuggetOreDict, FlariteConfig.recipes.nuggetCrusherOutput, FlariteConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(FureniumConfig.recipes.nuggetCrushingEnabled, FureniumConfig.recipes.nuggetCrusherEnergyUsage, FureniumConfig.oredict.nuggetOreDict, FureniumConfig.recipes.nuggetCrusherOutput, FureniumConfig.recipes.nuggetCrusherOutputAmount);
			//addTEPulverizerRecipe(BlackstoneConfig.recipes.nuggetCrushingEnabled, BlackstoneConfig.recipes.nuggetCrusherEnergyUsage, BlackstoneConfig.oredict.nuggetOreDict, BlackstoneConfig.recipes.nuggetCrusherOutput, BlackstoneConfig.recipes.nuggetCrusherOutputAmount);
			//addTEPulverizerRecipe(BluestoneConfig.recipes.nuggetCrushingEnabled, BluestoneConfig.recipes.nuggetCrusherEnergyUsage, BluestoneConfig.oredict.nuggetOreDict, BluestoneConfig.recipes.nuggetCrusherOutput, BluestoneConfig.recipes.nuggetCrusherOutputAmount);
			//addTEPulverizerRecipe(PurplestoneConfig.recipes.nuggetCrushingEnabled, PurplestoneConfig.recipes.nuggetCrusherEnergyUsage, PurplestoneConfig.oredict.nuggetOreDict, PurplestoneConfig.recipes.nuggetCrusherOutput, PurplestoneConfig.recipes.nuggetCrusherOutputAmount);
			
			addTEPulverizerRecipe(AlloyBronzeConfig.recipes.nuggetCrushingEnabled, AlloyBronzeConfig.recipes.nuggetCrusherEnergyUsage, AlloyBronzeConfig.oredict.nuggetOreDict, AlloyBronzeConfig.recipes.nuggetCrusherOutput, AlloyBronzeConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyCupronickelConfig.recipes.nuggetCrushingEnabled, AlloyCupronickelConfig.recipes.nuggetCrusherEnergyUsage, AlloyCupronickelConfig.oredict.nuggetOreDict, AlloyCupronickelConfig.recipes.nuggetCrusherOutput, AlloyCupronickelConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyBrassConfig.recipes.nuggetCrushingEnabled, AlloyBrassConfig.recipes.nuggetCrusherEnergyUsage, AlloyBrassConfig.oredict.nuggetOreDict, AlloyBrassConfig.recipes.nuggetCrusherOutput, AlloyBrassConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyRoseGoldConfig.recipes.nuggetCrushingEnabled, AlloyRoseGoldConfig.recipes.nuggetCrusherEnergyUsage, AlloyRoseGoldConfig.oredict.nuggetOreDict, AlloyRoseGoldConfig.recipes.nuggetCrusherOutput, AlloyRoseGoldConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloySteelConfig.recipes.nuggetCrushingEnabled, AlloySteelConfig.recipes.nuggetCrusherEnergyUsage, AlloySteelConfig.oredict.nuggetOreDict, AlloySteelConfig.recipes.nuggetCrusherOutput, AlloySteelConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyStainlessSteelConfig.recipes.nuggetCrushingEnabled, AlloyStainlessSteelConfig.recipes.nuggetCrusherEnergyUsage, AlloyStainlessSteelConfig.oredict.nuggetOreDict, AlloyStainlessSteelConfig.recipes.nuggetCrusherOutput, AlloyStainlessSteelConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyNichromeConfig.recipes.nuggetCrushingEnabled, AlloyNichromeConfig.recipes.nuggetCrusherEnergyUsage, AlloyNichromeConfig.oredict.nuggetOreDict, AlloyNichromeConfig.recipes.nuggetCrusherOutput, AlloyNichromeConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyElectrumConfig.recipes.nuggetCrushingEnabled, AlloyElectrumConfig.recipes.nuggetCrusherEnergyUsage, AlloyElectrumConfig.oredict.nuggetOreDict, AlloyElectrumConfig.recipes.nuggetCrusherOutput, AlloyElectrumConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyStelliteConfig.recipes.nuggetCrushingEnabled, AlloyStelliteConfig.recipes.nuggetCrusherEnergyUsage, AlloyStelliteConfig.oredict.nuggetOreDict, AlloyStelliteConfig.recipes.nuggetCrusherOutput, AlloyStelliteConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloySilvamerConfig.recipes.nuggetCrushingEnabled, AlloySilvamerConfig.recipes.nuggetCrusherEnergyUsage, AlloySilvamerConfig.oredict.nuggetOreDict, AlloySilvamerConfig.recipes.nuggetCrusherOutput, AlloySilvamerConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyUniumConfig.recipes.nuggetCrushingEnabled, AlloyUniumConfig.recipes.nuggetCrusherEnergyUsage, AlloyUniumConfig.oredict.nuggetOreDict, AlloyUniumConfig.recipes.nuggetCrusherOutput, AlloyUniumConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyFenikisiteConfig.recipes.nuggetCrushingEnabled, AlloyFenikisiteConfig.recipes.nuggetCrusherEnergyUsage, AlloyFenikisiteConfig.oredict.nuggetOreDict, AlloyFenikisiteConfig.recipes.nuggetCrusherOutput, AlloyFenikisiteConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyUltimiteConfig.recipes.nuggetCrushingEnabled, AlloyUltimiteConfig.recipes.nuggetCrusherEnergyUsage, AlloyUltimiteConfig.oredict.nuggetOreDict, AlloyUltimiteConfig.recipes.nuggetCrusherOutput, AlloyUltimiteConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyStrootiteConfig.recipes.nuggetCrushingEnabled, AlloyStrootiteConfig.recipes.nuggetCrusherEnergyUsage, AlloyStrootiteConfig.oredict.nuggetOreDict, AlloyStrootiteConfig.recipes.nuggetCrusherOutput, AlloyStrootiteConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloySpeedoiConfig.recipes.nuggetCrushingEnabled, AlloySpeedoiConfig.recipes.nuggetCrusherEnergyUsage, AlloySpeedoiConfig.oredict.nuggetOreDict, AlloySpeedoiConfig.recipes.nuggetCrusherOutput, AlloySpeedoiConfig.recipes.nuggetCrusherOutputAmount);
			addTEPulverizerRecipe(AlloyLegeniteConfig.recipes.nuggetCrushingEnabled, AlloyLegeniteConfig.recipes.nuggetCrusherEnergyUsage, AlloyLegeniteConfig.oredict.nuggetOreDict, AlloyLegeniteConfig.recipes.nuggetCrusherOutput, AlloyLegeniteConfig.recipes.nuggetCrusherOutputAmount);
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
			GameRegistry.addSmelting(inputItem, new ItemStack(output, 1), 0f);
			if (_COreConfig.cofh.furnaceRecipes) {
				//TODO
			}
		}
	}
	
	public static void addTEPulverizerRecipe(boolean enabled, int energy, String input, String primaryOutput, int primaryAmt, String secondaryOutput, int secondaryAmt, int chance) {
		if (!enabled) { return; }
		Item p = Item.getByNameOrId(primaryOutput);
		
		if (p != null) {
			ItemStack primary = new ItemStack(p, primaryAmt);
			NonNullList<ItemStack> stackList = OreDictionary.getOres(input);
			
			for (int i = 0; i < stackList.size(); i++) {
				ItemStack inputItem = stackList.get(i);
				if (secondaryOutput != null) {
					Item s = Item.getByNameOrId(secondaryOutput);
					ItemStack secondary = new ItemStack(s, secondaryAmt);
					ThermalExpansionHelper.addPulverizerRecipe(energy, inputItem, primary, secondary, chance);
				} else {
					ThermalExpansionHelper.addPulverizerRecipe(energy, inputItem, primary);
				}
			}
		}
	}
	
	//For when there's no secondary output - IE already purified things such as dust.
	public static void addTEPulverizerRecipe(boolean enabled, int energy, String input, String primaryOutput, int primaryAmt) {
		if (!enabled) { return; }
		addTEPulverizerRecipe(enabled, energy, input, primaryOutput, primaryAmt, null, 0, 0);
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
}
