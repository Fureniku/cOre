package co.uk.silvania.cOre;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import co.uk.silvania.cOre.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void init () {
		registerBlocks();
		registerHarvestLevels();
		registerMineralItems();
		oreDictionary();
	}
	
	public void registerRenderers() {
		
	}
	
    public void registerBlocks() {
    	GameRegistry.registerBlock(COreBlocks.metaOre1, ItemOre1.class, "metaOres1");
    	GameRegistry.registerBlock(COreBlocks.metaOre2, ItemOre2.class, "metaOres2");
    	GameRegistry.registerBlock(COreBlocks.metaOre3, ItemOre3.class, "metaOres3");
    	
    	GameRegistry.registerBlock(COreBlocks.mercuryBlock, "mercuryBlock");
    	GameRegistry.registerBlock(COreBlocks.tarBlock, "tarBlock");
    	GameRegistry.registerBlock(COreBlocks.oilBlock, "oilBlock");
    	
    	GameRegistry.registerBlock(COreBlocks.limestoneBlock, "limestoneBlock");
    	GameRegistry.registerBlock(COreBlocks.calciteBlock, "calciteBlock");
    	GameRegistry.registerBlock(COreBlocks.graphiteBlock, "graphiteBlock");
    }
    
    public void registerHarvestLevels() {

    }

    public void registerMineralItems() {
    	GameRegistry.registerItem(COreItems.itemOre, "itemOres");
    	GameRegistry.registerItem(COreItems.itemDust, "itemDusts");
    	GameRegistry.registerItem(COreItems.itemGem, "itemGems");
    	GameRegistry.registerItem(COreItems.itemIngot, "itemIngots");
    	GameRegistry.registerItem(COreItems.itemNugget, "itemNuggets");
    	GameRegistry.registerItem(COreItems.itemCrushed, "itemCrushed");
    	GameRegistry.registerItem(COreItems.itemWashed, "itemWashed");
    }

    public void oreDictionary() {
    	System.out.println("TEST! If this shows up, ore dict IS enabled. VqrcTTya67f");
    	OreDictionary.registerOre("oreCopper", new ItemStack(COreItems.itemOre, 0, 0));
    	OreDictionary.registerOre("oreTin", new ItemStack(COreItems.itemOre, 0, 1));
    	OreDictionary.registerOre("oreZinc", new ItemStack(COreItems.itemOre, 0, 2));
    	OreDictionary.registerOre("oreNickel", new ItemStack(COreItems.itemOre, 0, 3));
    	OreDictionary.registerOre("oreSilver", new ItemStack(COreItems.itemOre, 0, 4));
    	OreDictionary.registerOre("oreCobalt", new ItemStack(COreItems.itemOre, 0, 5));
    	OreDictionary.registerOre("oreTitanium", new ItemStack(COreItems.itemOre, 0, 6));
    	OreDictionary.registerOre("oreChromium", new ItemStack(COreItems.itemOre, 0, 7));
    	OreDictionary.registerOre("oreManganese", new ItemStack(COreItems.itemOre, 0, 8));
    	OreDictionary.registerOre("oreCadmium", new ItemStack(COreItems.itemOre, 0, 9));
    	OreDictionary.registerOre("oreTungsten", new ItemStack(COreItems.itemOre, 0, 10));
    	OreDictionary.registerOre("oreLead", new ItemStack(COreItems.itemOre, 0, 11));
    	OreDictionary.registerOre("orePlatinum", new ItemStack(COreItems.itemOre, 0, 12));
    	OreDictionary.registerOre("oreLithium", new ItemStack(COreItems.itemOre, 0, 13));
    	OreDictionary.registerOre("orePotassium", new ItemStack(COreItems.itemOre, 0, 14));
    	OreDictionary.registerOre("oreMagnesium", new ItemStack(COreItems.itemOre, 0, 15));
    	OreDictionary.registerOre("oreCalcium", new ItemStack(COreItems.itemOre, 0, 16));
    	OreDictionary.registerOre("oreLanathum", new ItemStack(COreItems.itemOre, 0, 17));
    	OreDictionary.registerOre("oreCerium", new ItemStack(COreItems.itemOre, 0, 18));
    	OreDictionary.registerOre("orePromethium", new ItemStack(COreItems.itemOre, 0, 19));
    	OreDictionary.registerOre("oreUranium", new ItemStack(COreItems.itemOre, 0, 20));
    	OreDictionary.registerOre("orePlutonium", new ItemStack(COreItems.itemOre, 0, 21));
    	OreDictionary.registerOre("oreTechnetium", new ItemStack(COreItems.itemOre, 0, 22));
    	OreDictionary.registerOre("oreTantalum", new ItemStack(COreItems.itemOre, 0, 23));
    	OreDictionary.registerOre("oreScandium", new ItemStack(COreItems.itemOre, 0, 24));
    	OreDictionary.registerOre("oreAluminium", new ItemStack(COreItems.itemOre, 0, 25));
    	OreDictionary.registerOre("oreGallium", new ItemStack(COreItems.itemOre, 0, 26));
    	OreDictionary.registerOre("oreSilicon", new ItemStack(COreItems.itemOre, 0, 27));
    	OreDictionary.registerOre("oreThallium", new ItemStack(COreItems.itemOre, 0, 28));
    	OreDictionary.registerOre("oreTecmonium", new ItemStack(COreItems.itemOre, 0, 29));
    	OreDictionary.registerOre("oreSilvanite", new ItemStack(COreItems.itemOre, 0, 30));
    	OreDictionary.registerOre("oreMercilite", new ItemStack(COreItems.itemOre, 0, 31));
    	OreDictionary.registerOre("oreDragite", new ItemStack(COreItems.itemOre, 0, 32));
    	OreDictionary.registerOre("oreFlarite", new ItemStack(COreItems.itemOre, 0, 33));
    	OreDictionary.registerOre("oreMythril", new ItemStack(COreItems.itemOre, 0, 34));
    	OreDictionary.registerOre("oreAdamantite", new ItemStack(COreItems.itemOre, 0, 35));
    	OreDictionary.registerOre("oreArdite", new ItemStack(COreItems.itemOre, 0, 36));
    	
    	OreDictionary.registerOre("dustCopper", new ItemStack(COreItems.itemDust, 0, 0));
    	OreDictionary.registerOre("dustTin", new ItemStack(COreItems.itemDust, 0, 1));
    	OreDictionary.registerOre("dustZinc", new ItemStack(COreItems.itemDust, 0, 2));
    	OreDictionary.registerOre("dustNickel", new ItemStack(COreItems.itemDust, 0, 3));
    	OreDictionary.registerOre("dustSilver", new ItemStack(COreItems.itemDust, 0, 4));
    	OreDictionary.registerOre("dustCobalt", new ItemStack(COreItems.itemDust, 0, 5));
    	OreDictionary.registerOre("dustTitanium", new ItemStack(COreItems.itemDust, 0, 6));
    	OreDictionary.registerOre("dustChromium", new ItemStack(COreItems.itemDust, 0, 7));
    	OreDictionary.registerOre("dustManganese", new ItemStack(COreItems.itemDust, 0, 8));
    	OreDictionary.registerOre("dustCadmium", new ItemStack(COreItems.itemDust, 0, 9));
    	OreDictionary.registerOre("dustTungsten", new ItemStack(COreItems.itemDust, 0, 10));
    	OreDictionary.registerOre("dustLead", new ItemStack(COreItems.itemDust, 0, 11));
    	OreDictionary.registerOre("dustPlatinum", new ItemStack(COreItems.itemDust, 0, 12));
    	OreDictionary.registerOre("dustLithium", new ItemStack(COreItems.itemDust, 0, 13));
    	OreDictionary.registerOre("dustPotassium", new ItemStack(COreItems.itemDust, 0, 14));
    	OreDictionary.registerOre("dustMagnesium", new ItemStack(COreItems.itemDust, 0, 15));
    	OreDictionary.registerOre("dustCalcium", new ItemStack(COreItems.itemDust, 0, 16));
    	OreDictionary.registerOre("dustLanathum", new ItemStack(COreItems.itemDust, 0, 17));
    	OreDictionary.registerOre("dustCerium", new ItemStack(COreItems.itemDust, 0, 18));
    	OreDictionary.registerOre("dustPromethium", new ItemStack(COreItems.itemDust, 0, 19));
    	OreDictionary.registerOre("dustUranium", new ItemStack(COreItems.itemDust, 0, 20));
    	OreDictionary.registerOre("dustPlutonium", new ItemStack(COreItems.itemDust, 0, 21));
    	OreDictionary.registerOre("dustTechnetium", new ItemStack(COreItems.itemDust, 0, 22));
    	OreDictionary.registerOre("dustTantalum", new ItemStack(COreItems.itemDust, 0, 23));
    	OreDictionary.registerOre("dustScandium", new ItemStack(COreItems.itemDust, 0, 24));
    	OreDictionary.registerOre("dustAluminium", new ItemStack(COreItems.itemDust, 0, 25));
    	OreDictionary.registerOre("dustGallium", new ItemStack(COreItems.itemDust, 0, 26));
    	OreDictionary.registerOre("dustSilicon", new ItemStack(COreItems.itemDust, 0, 27));
    	OreDictionary.registerOre("dustThallium", new ItemStack(COreItems.itemDust, 0, 28));
    	OreDictionary.registerOre("dustTecmonium", new ItemStack(COreItems.itemDust, 0, 29));
    	OreDictionary.registerOre("dustSilvanite", new ItemStack(COreItems.itemDust, 0, 30));
    	OreDictionary.registerOre("dustMercilite", new ItemStack(COreItems.itemDust, 0, 31));
    	OreDictionary.registerOre("dustDragite", new ItemStack(COreItems.itemDust, 0, 32));
    	OreDictionary.registerOre("dustFlarite", new ItemStack(COreItems.itemDust, 0, 33));
    	OreDictionary.registerOre("dustMythril", new ItemStack(COreItems.itemDust, 0, 34));
    	OreDictionary.registerOre("dustAdamantite", new ItemStack(COreItems.itemDust, 0, 35));
    	OreDictionary.registerOre("dustSulfur", new ItemStack(COreItems.itemDust, 0, 36));
    	OreDictionary.registerOre("dustRuby", new ItemStack(COreItems.itemDust, 0, 37));
    	OreDictionary.registerOre("dustSapphire", new ItemStack(COreItems.itemDust, 0, 38));
    	OreDictionary.registerOre("dustAmethyst", new ItemStack(COreItems.itemDust, 0, 39));
    	OreDictionary.registerOre("dustCrystal", new ItemStack(COreItems.itemDust, 0, 40));
    	OreDictionary.registerOre("dustMythian", new ItemStack(COreItems.itemDust, 0, 41));
    	OreDictionary.registerOre("dustBlackstone", new ItemStack(COreItems.itemDust, 0, 42));
    	OreDictionary.registerOre("dustBluestone", new ItemStack(COreItems.itemDust, 0, 43));
    	OreDictionary.registerOre("dustPurplestone", new ItemStack(COreItems.itemDust, 0, 44));
    	OreDictionary.registerOre("dustIridium", new ItemStack(COreItems.itemDust, 0, 45));
    	OreDictionary.registerOre("dustArdite", new ItemStack(COreItems.itemDust, 0, 46));
    	OreDictionary.registerOre("dustCalcite", new ItemStack(COreItems.itemDust, 0, 47));
    	OreDictionary.registerOre("dustGraphite", new ItemStack(COreItems.itemDust, 0, 48));
    	OreDictionary.registerOre("dustLimestone", new ItemStack(COreItems.itemDust, 0, 49));
    	
    	OreDictionary.registerOre("ingotCopper", new ItemStack(COreItems.itemIngot, 0, 0));
    	OreDictionary.registerOre("ingotTin", new ItemStack(COreItems.itemIngot, 0, 1));
    	OreDictionary.registerOre("ingotZinc", new ItemStack(COreItems.itemIngot, 0, 2));
    	OreDictionary.registerOre("ingotNickel", new ItemStack(COreItems.itemIngot, 0, 3));
    	OreDictionary.registerOre("ingotSilver", new ItemStack(COreItems.itemIngot, 0, 4));
    	OreDictionary.registerOre("ingotCobalt", new ItemStack(COreItems.itemIngot, 0, 5));
    	OreDictionary.registerOre("ingotTitanium", new ItemStack(COreItems.itemIngot, 0, 6));
    	OreDictionary.registerOre("ingotChromium", new ItemStack(COreItems.itemIngot, 0, 7));
    	OreDictionary.registerOre("ingotManganese", new ItemStack(COreItems.itemIngot, 0, 8));
    	OreDictionary.registerOre("ingotCadmium", new ItemStack(COreItems.itemIngot, 0, 9));
    	OreDictionary.registerOre("ingotTungsten", new ItemStack(COreItems.itemIngot, 0, 10));
    	OreDictionary.registerOre("ingotLead", new ItemStack(COreItems.itemIngot, 0, 11));
    	OreDictionary.registerOre("ingotPlatinum", new ItemStack(COreItems.itemIngot, 0, 12));
    	OreDictionary.registerOre("ingotLithium", new ItemStack(COreItems.itemIngot, 0, 13));
    	OreDictionary.registerOre("ingotPotassium", new ItemStack(COreItems.itemIngot, 0, 14));
    	OreDictionary.registerOre("ingotMagnesium", new ItemStack(COreItems.itemIngot, 0, 15));
    	OreDictionary.registerOre("ingotCalcium", new ItemStack(COreItems.itemIngot, 0, 16));
    	OreDictionary.registerOre("ingotLanathum", new ItemStack(COreItems.itemIngot, 0, 17));
    	OreDictionary.registerOre("ingotCerium", new ItemStack(COreItems.itemIngot, 0, 18));
    	OreDictionary.registerOre("ingotPromethium", new ItemStack(COreItems.itemIngot, 0, 19));
    	OreDictionary.registerOre("ingotUranium", new ItemStack(COreItems.itemIngot, 0, 20));
    	OreDictionary.registerOre("ingotPlutonium", new ItemStack(COreItems.itemIngot, 0, 21));
    	OreDictionary.registerOre("ingotTechnetium", new ItemStack(COreItems.itemIngot, 0, 22));
    	OreDictionary.registerOre("ingotTantalum", new ItemStack(COreItems.itemIngot, 0, 23));
    	OreDictionary.registerOre("ingotScandium", new ItemStack(COreItems.itemIngot, 0, 24));
    	OreDictionary.registerOre("ingotAluminium", new ItemStack(COreItems.itemIngot, 0, 25));
    	OreDictionary.registerOre("ingotGallium", new ItemStack(COreItems.itemIngot, 0, 26));
    	OreDictionary.registerOre("ingotSilicon", new ItemStack(COreItems.itemIngot, 0, 27));
    	OreDictionary.registerOre("ingotThallium", new ItemStack(COreItems.itemIngot, 0, 28));
    	OreDictionary.registerOre("ingotTecmonium", new ItemStack(COreItems.itemIngot, 0, 29));
    	OreDictionary.registerOre("ingotSilvanite", new ItemStack(COreItems.itemIngot, 0, 30));
    	OreDictionary.registerOre("ingotMercilite", new ItemStack(COreItems.itemIngot, 0, 31));
    	OreDictionary.registerOre("ingotDragite", new ItemStack(COreItems.itemIngot, 0, 32));
    	OreDictionary.registerOre("ingotFlarite", new ItemStack(COreItems.itemIngot, 0, 33));
    	OreDictionary.registerOre("ingotMythril", new ItemStack(COreItems.itemIngot, 0, 34));
    	OreDictionary.registerOre("ingotAdamantite", new ItemStack(COreItems.itemIngot, 0, 35));
    	OreDictionary.registerOre("ingotArdite", new ItemStack(COreItems.itemIngot, 0, 36));
    }
}
