package co.uk.silvania.cOre;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeDictionary;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	WorldGenMinable copper;
	WorldGenMinable tin;
	WorldGenMinable zinc;
	WorldGenMinable nickel;
	WorldGenMinable silver;
	WorldGenMinable cobalt;
	WorldGenMinable titanium;
	WorldGenMinable chromium;
	WorldGenMinable manganese;
	WorldGenMinable cadmium;
	WorldGenMinable tungsten;
	WorldGenMinable lead;
	WorldGenMinable platinum;
	WorldGenMinable lithium;
	WorldGenMinable potassium;
	WorldGenMinable magnesium;
	WorldGenMinable calcium;
	WorldGenMinable lanthanum;
	WorldGenMinable cerium;
	WorldGenMinable promethium;
	WorldGenMinable uranium;
	WorldGenMinable plutonium;
	WorldGenMinable technetium;
	WorldGenMinable tantalum;
	WorldGenMinable scandium;
	WorldGenMinable aluminium;
	WorldGenMinable gallium;
	WorldGenMinable indium;
	WorldGenMinable thallium;
	WorldGenMinable tecmonium;
	WorldGenMinable silvanite;
	WorldGenMinable mercilite;
	WorldGenMinable dragite;
	WorldGenMinable flarite;
	WorldGenMinable mythril;
	WorldGenMinable adamantite;
	WorldGenMinable sulfur;
	WorldGenMinable ruby;
	WorldGenMinable sapphire;
	WorldGenMinable amethyst;
	WorldGenMinable crystal;
	WorldGenMinable mythian;
	WorldGenMinable blackstone;
	WorldGenMinable bluestone;
	WorldGenMinable purplestone;
	WorldGenMinable iridium;
	WorldGenMinable ardite;
	WorldGenMinable mercury;
	WorldGenMinable limestone;
	WorldGenMinable calcite;
	WorldGenMinable graphite;
	
	COreOverWorldConfig config = new COreOverWorldConfig();
	Block block1 = COreBlocks.metaOre1;
	Block block2 = COreBlocks.metaOre2;
	Block block3 = COreBlocks.metaOre3;
	
	Block mercuryBlock 	 = COreBlocks.mercuryBlock;
	Block limestoneBlock = COreBlocks.limestoneBlock;
	Block calciteBlock	 = COreBlocks.calciteBlock;
	Block graphiteBlock  = COreBlocks.graphiteBlock;
	
	Block stone = Blocks.stone;
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
            case 1:
                //generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                //generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}	
	}
		
	private void generateSurface(World world, Random random, int x, int z) {
		copper 		= new WorldGenMinable(block1, 0,  config.copperMin  	+ random.nextInt(config.copperMax 		- config.copperMin),		stone);
		tin 		= new WorldGenMinable(block1, 1,  config.tinMin 		+ random.nextInt(config.tinMax 			- config.tinMin), 			stone);
		zinc 		= new WorldGenMinable(block1, 2,  config.zincMin 		+ random.nextInt(config.zincMax 		- config.zincMin), 			stone);
		nickel 		= new WorldGenMinable(block1, 3,  config.nickelMin 		+ random.nextInt(config.nickelMax	 	- config.nickelMin), 		stone);
		silver		= new WorldGenMinable(block1, 4,  config.silverMin 		+ random.nextInt(config.silverMax 		- config.silverMin), 		stone);
		cobalt 		= new WorldGenMinable(block1, 5,  config.cobaltMin 		+ random.nextInt(config.cobaltMax 		- config.cobaltMin), 		stone);
		titanium 	= new WorldGenMinable(block1, 6,  config.titaniumMin 	+ random.nextInt(config.titaniumMax 	- config.titaniumMin), 		stone);
		chromium 	= new WorldGenMinable(block1, 7,  config.chromiumMin 	+ random.nextInt(config.chromiumMax 	- config.chromiumMin), 		stone);
		manganese 	= new WorldGenMinable(block1, 8,  config.manganeseMin 	+ random.nextInt(config.manganeseMax 	- config.manganeseMin), 	stone);
		cadmium 	= new WorldGenMinable(block1, 9,  config.cadmiumMin 	+ random.nextInt(config.cadmiumMax 		- config.cadmiumMin), 		stone);
		tungsten 	= new WorldGenMinable(block1, 10, config.tungstenMin 	+ random.nextInt(config.tungstenMax 	- config.tungstenMin), 		stone);
		lead 		= new WorldGenMinable(block1, 11, config.leadMin 		+ random.nextInt(config.leadMax 		- config.leadMin), 			stone);
		platinum 	= new WorldGenMinable(block1, 12, config.platinumMin 	+ random.nextInt(config.platinumMax 	- config.platinumMin), 		stone);
		lithium 	= new WorldGenMinable(block1, 13, config.lithiumMin 	+ random.nextInt(config.lithiumMax 		- config.lithiumMin), 		stone);
		potassium 	= new WorldGenMinable(block1, 14, config.potassiumMin 	+ random.nextInt(config.potassiumMax 	- config.potassiumMin), 	stone);
		magnesium 	= new WorldGenMinable(block1, 15, config.magnesiumMin 	+ random.nextInt(config.magnesiumMax 	- config.magnesiumMin), 	stone);
		calcium 	= new WorldGenMinable(block2, 0,  config.calciumMin 	+ random.nextInt(config.calciumMax 		- config.calciumMin),		stone);
		lanthanum 	= new WorldGenMinable(block2, 1,  config.lanthanumMin 	+ random.nextInt(config.lanthanumMax 	- config.lanthanumMin), 	stone);
		cerium 		= new WorldGenMinable(block2, 2,  config.ceriumMin 		+ random.nextInt(config.ceriumMax 		- config.ceriumMin), 		stone);
		promethium 	= new WorldGenMinable(block2, 3,  config.promethiumMin 	+ random.nextInt(config.promethiumMax 	- config.promethiumMin), 	stone);
		uranium 	= new WorldGenMinable(block2, 4,  config.uraniumMin 	+ random.nextInt(config.uraniumMax 		- config.uraniumMin), 		stone);
		plutonium 	= new WorldGenMinable(block2, 5,  config.plutoniumMin 	+ random.nextInt(config.plutoniumMax 	- config.plutoniumMin), 	stone);
		technetium 	= new WorldGenMinable(block2, 6,  config.technetiumMin 	+ random.nextInt(config.technetiumMax 	- config.technetiumMin), 	stone);
		tantalum 	= new WorldGenMinable(block2, 7,  config.tantalumMin 	+ random.nextInt(config.tantalumMax 	- config.tantalumMin), 		stone);
		scandium 	= new WorldGenMinable(block2, 8,  config.scandiumMin 	+ random.nextInt(config.scandiumMax 	- config.scandiumMin), 		stone);
		aluminium 	= new WorldGenMinable(block2, 9,  config.aluminiumMin 	+ random.nextInt(config.aluminiumMax 	- config.aluminiumMin), 	stone);
		gallium 	= new WorldGenMinable(block2, 10, config.galliumMin 	+ random.nextInt(config.galliumMax 		- config.galliumMin), 		stone);
		indium 		= new WorldGenMinable(block2, 11, config.indiumMin 		+ random.nextInt(config.indiumMax 		- config.indiumMin),		stone);
		thallium 	= new WorldGenMinable(block2, 12, config.thalliumMin 	+ random.nextInt(config.thalliumMax 	- config.thalliumMin), 		stone);
		tecmonium 	= new WorldGenMinable(block2, 13, config.tecmoniumMin 	+ random.nextInt(config.tecmoniumMax	- config.tecmoniumMin), 	stone);
		silvanite 	= new WorldGenMinable(block2, 14, config.silvaniteMin 	+ random.nextInt(config.silvaniteMax 	- config.silvaniteMin), 	stone);
		mercilite 	= new WorldGenMinable(block2, 15, config.merciliteMin 	+ random.nextInt(config.merciliteMax 	- config.merciliteMin), 	stone);
		dragite 	= new WorldGenMinable(block3, 0,  config.dragiteMin 	+ random.nextInt(config.dragiteMax 		- config.dragiteMin), 		stone);
		flarite 	= new WorldGenMinable(block3, 1,  config.flariteMin 	+ random.nextInt(config.flariteMax 		- config.flariteMin), 		stone);
		mythril 	= new WorldGenMinable(block3, 2,  config.mythrilMin 	+ random.nextInt(config.mythrilMax 		- config.mythrilMin), 		stone);
		adamantite 	= new WorldGenMinable(block3, 3,  config.adamantiteMin 	+ random.nextInt(config.adamantiteMax 	- config.adamantiteMin), 	stone);
		sulfur	 	= new WorldGenMinable(block3, 4,  config.sulfurMin 		+ random.nextInt(config.sulfurMax 		- config.sulfurMin), 		stone);
		ruby 		= new WorldGenMinable(block3, 5,  config.rubyMin 		+ random.nextInt(config.rubyMax 		- config.rubyMin), 			stone);
		sapphire 	= new WorldGenMinable(block3, 6,  config.sapphireMin 	+ random.nextInt(config.sapphireMax 	- config.sapphireMin), 		stone);
		amethyst 	= new WorldGenMinable(block3, 7,  config.amethystMin 	+ random.nextInt(config.amethystMax 	- config.amethystMin), 		stone);
		crystal 	= new WorldGenMinable(block3, 8,  config.crystalMin 	+ random.nextInt(config.crystalMax 		- config.crystalMin), 		stone);
		mythian 	= new WorldGenMinable(block3, 9,  config.mythianMin 	+ random.nextInt(config.mythianMax 		- config.mythianMin), 		stone);
		blackstone 	= new WorldGenMinable(block3, 10, config.blackstoneMin 	+ random.nextInt(config.blackstoneMax 	- config.blackstoneMin), 	stone);
		bluestone 	= new WorldGenMinable(block3, 11, config.bluestoneMin 	+ random.nextInt(config.bluestoneMax 	- config.bluestoneMin), 	stone);
		purplestone = new WorldGenMinable(block3, 12, config.purplestoneMin + random.nextInt(config.purplestoneMax 	- config.purplestoneMin),	stone);
		iridium 	= new WorldGenMinable(block3, 13, config.iridiumMin 	+ random.nextInt(config.iridiumMax 		- config.iridiumMin), 		stone);
		ardite 		= new WorldGenMinable(block3, 14, config.arditeMin 		+ random.nextInt(config.arditeMax 		- config.arditeMin), 		stone);
				
		mercury		= new WorldGenMinable(mercuryBlock,   0, config.mercuryMin	 + random.nextInt(config.mercuryMax   - config.mercuryMin),	  stone);
		limestone	= new WorldGenMinable(limestoneBlock, 0, config.limestoneMin + random.nextInt(config.limestoneMax - config.limestoneMin), stone);
		calcite		= new WorldGenMinable(calciteBlock,   0, config.calciteMin 	 + random.nextInt(config.calciteMax   - config.calciteMin),   stone);
		graphite	= new WorldGenMinable(graphiteBlock,  0, config.graphiteMin  + random.nextInt(config.graphiteMax  - config.graphiteMin),  stone);
		
		
		if (config.copperRarity > 0) {	 	addOreSpawn(copper, 	world, random, x, z, config.copperRarity, config.copperMinY, config.copperMaxY);}
	    if (config.tinRarity > 0) { 		addOreSpawn(tin,		world, random, x, z, config.tinRarity, config.tinMinY, config.tinMaxY);}
	    if (config.zincRarity > 0) { 		addOreSpawn(zinc, 		world, random, x, z, config.zincRarity, config.zincMinY, config.zincMaxY);}
	    if (config.nickelRarity > 0) {	 	addOreSpawn(nickel, 	world, random, x, z, config.nickelRarity, config.nickelMinY, config.nickelMaxY);}
	    if (config.silverRarity > 0) {	 	addOreSpawn(silver, 	world, random, x, z, config.silverRarity, config.silverMinY, config.silverMaxY);}
	    if (config.cobaltRarity > 0) {	 	addOreSpawn(cobalt, 	world, random, x, z, config.cobaltRarity, config.cobaltMinY, config.cobaltMaxY);}
	    if (config.titaniumRarity > 0) { 	addOreSpawn(titanium,	world, random, x, z, config.titaniumRarity, config.titaniumMinY, config.titaniumMaxY);}
	    if (config.chromiumRarity > 0) { 	addOreSpawn(chromium, 	world, random, x, z, config.chromiumRarity, config.chromiumMinY, config.chromiumMaxY);}
	    if (config.manganeseRarity > 0) { 	addOreSpawn(manganese, 	world, random, x, z, config.manganeseRarity, config.manganeseMinY, config.manganeseMaxY);}
	    if (config.cadmiumRarity > 0) { 	addOreSpawn(cadmium, 	world, random, x, z, config.cadmiumRarity, config.cadmiumMinY, config.cadmiumMaxY);}
	    if (config.tungstenRarity > 0) { 	addOreSpawn(tungsten, 	world, random, x, z, config.tungstenRarity, config.tungstenMinY, config.tungstenMaxY);}
	    if (config.leadRarity > 0) { 		addOreSpawn(lead, 		world, random, x, z, config.leadRarity, config.leadMinY, config.leadMaxY);}
	    if (config.platinumRarity > 0) { 	addOreSpawn(platinum, 	world, random, x, z, config.platinumRarity, config.platinumMinY, config.platinumMaxY);}
	    if (config.lithiumRarity > 0) { 	addOreSpawn(lithium, 	world, random, x, z, config.lithiumRarity, config.lithiumMinY, config.lithiumMaxY);}
	    if (config.potassiumRarity > 0) { 	addOreSpawn(potassium, 	world, random, x, z, config.potassiumRarity, config.potassiumMinY, config.potassiumMaxY);}
	    if (config.magnesiumRarity > 0) { 	addOreSpawn(magnesium, 	world, random, x, z, config.magnesiumRarity, config.magnesiumMinY, config.magnesiumMaxY);}
	    if (config.calciumRarity > 0) { 	addOreSpawn(calcium, 	world, random, x, z, config.calciumRarity, config.calciumMinY, config.calciumMaxY);}
	    if (config.lanthanumRarity > 0) { 	addOreSpawn(lanthanum, 	world, random, x, z, config.lanthanumRarity, config.lanthanumMinY, config.lanthanumMaxY);}
	    if (config.ceriumRarity > 0) { 		addOreSpawn(cerium, 	world, random, x, z, config.ceriumRarity, config.ceriumMinY, config.ceriumMaxY);}
	    if (config.promethiumRarity > 0) { 	addOreSpawn(promethium, world, random, x, z, config.promethiumRarity, config.promethiumMinY, config.promethiumMaxY);}
	    if (config.uraniumRarity > 0) { 	addOreSpawn(uranium, 	world, random, x, z, config.uraniumRarity, config.uraniumMinY, config.uraniumMaxY);}
	    if (config.plutoniumRarity > 0) { 	addOreSpawn(plutonium, 	world, random, x, z, config.plutoniumRarity, config.plutoniumMinY, config.plutoniumMaxY);}
	    if (config.technetiumRarity > 0) { 	addOreSpawn(technetium, world, random, x, z, config.technetiumRarity, config.technetiumMinY, config.technetiumMaxY);}
	    if (config.tantalumRarity > 0) { 	addOreSpawn(tantalum, 	world, random, x, z, config.tantalumRarity, config.tantalumMinY, config.tantalumMaxY);}
	    if (config.scandiumRarity > 0) { 	addOreSpawn(scandium, 	world, random, x, z, config.scandiumRarity, config.scandiumMinY, config.scandiumMaxY);}
	    if (config.aluminiumRarity > 0) { 	addOreSpawn(aluminium, 	world, random, x, z, config.aluminiumRarity, config.aluminiumMinY, config.aluminiumMaxY);}
	    if (config.galliumRarity > 0) { 	addOreSpawn(gallium, 	world, random, x, z, config.galliumRarity, config.galliumMinY, config.galliumMaxY);}
	    if (config.indiumRarity > 0) { 		addOreSpawn(indium, 	world, random, x, z, config.indiumRarity, config.indiumMinY, config.indiumMaxY);}
	    if (config.thalliumRarity > 0) { 	addOreSpawn(thallium, 	world, random, x, z, config.thalliumRarity, config.thalliumMinY, config.thalliumMaxY);}
	    if (config.tecmoniumRarity > 0) { 	addOreSpawn(tecmonium, 	world, random, x, z, config.tecmoniumRarity, config.tecmoniumMinY, config.tecmoniumMaxY);}
	    if (config.silvaniteRarity > 0) { 	addOreSpawn(silvanite, 	world, random, x, z, config.silvaniteRarity, config.silvaniteMinY, config.silvaniteMaxY);}
	    if (config.merciliteRarity > 0) { 	addOreSpawn(mercilite, 	world, random, x, z, config.merciliteRarity, config.merciliteMinY, config.merciliteMaxY);}
	    if (config.dragiteRarity > 0) { 	addOreSpawn(dragite, 	world, random, x, z, config.dragiteRarity, config.dragiteMinY, config.dragiteMaxY);}
	    if (config.flariteRarity > 0) { 	addOreSpawn(flarite, 	world, random, x, z, config.flariteRarity, config.flariteMinY, config.flariteMaxY);}
	    if (config.mythrilRarity > 0) { 	addOreSpawn(mythril, 	world, random, x, z, config.mythrilRarity, config.mythrilMinY, config.mythrilMaxY);}
	    if (config.adamantiteRarity > 0) { 	addOreSpawn(adamantite, world, random, x, z, config.adamantiteRarity, config.adamantiteMinY, config.adamantiteMaxY);}
	    if (config.sulfurRarity > 0) { 		addOreSpawn(sulfur, 	world, random, x, z, config.sulfurRarity, config.sulfurMinY, config.sulfurMaxY);}
	    if (config.rubyRarity > 0) { 		addOreSpawn(ruby, 		world, random, x, z, config.rubyRarity, config.rubyMinY, config.rubyMaxY);}
	    if (config.sapphireRarity > 0) { 	addOreSpawn(sapphire, 	world, random, x, z, config.sapphireRarity, config.sapphireMinY, config.sapphireMaxY);}
	    if (config.amethystRarity > 0) { 	addOreSpawn(amethyst, 	world, random, x, z, config.amethystRarity, config.amethystMinY, config.amethystMaxY);}
	    if (config.crystalRarity > 0) {		addOreSpawn(crystal, 	world, random, x, z, config.crystalRarity, config.crystalMinY, config.crystalMaxY);}
	    if (config.mythianRarity > 0) { 	addOreSpawn(mythian, 	world, random, x, z, config.mythianRarity, config.mythianMinY, config.mythianMaxY);}
	    if (config.blackstoneRarity > 0) { 	addOreSpawn(blackstone, world, random, x, z, config.blackstoneRarity, config.blackstoneMinY, config.blackstoneMaxY);}
	    if (config.bluestoneRarity > 0) { 	addOreSpawn(bluestone, 	world, random, x, z, config.bluestoneRarity, config.bluestoneMinY, config.bluestoneMaxY);}
	    if (config.purplestoneRarity > 0) {	addOreSpawn(purplestone,world, random, x, z, config.purplestoneRarity, config.purplestoneMinY, config.purplestoneMaxY);}
	    if (config.iridiumRarity > 0) { 	addOreSpawn(iridium, 	world, random, x, z, config.iridiumRarity, config.iridiumMinY, config.iridiumMaxY);}
	    if (config.arditeRarity > 0) { 		addOreSpawn(ardite, 	world, random, x, z, config.arditeRarity, config.arditeMinY, config.arditeMaxY);}

	    if (config.mercuryRarity > 0) { 	addOreSpawn(mercury, 	world, random, x, z, config.mercuryRarity, config.mercuryMinY, config.mercuryMaxY);}
	    if (config.limestoneRarity > 0) { 	addOreSpawn(limestone,  world, random, x, z, config.limestoneRarity, config.limestoneMinY, config.limestoneMaxY);}
	    if (config.calciteRarity > 0) { 	addOreSpawn(calcite,	world, random, x, z, config.calciteRarity, config.calciteMinY, config.calciteMaxY);}
	    if (config.graphiteRarity > 0) { 	addOreSpawn(graphite, 	world, random, x, z, config.graphiteRarity, config.graphiteMinY, config.graphiteMaxY);}
	    
	    BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x * 16, z * 26);
	    
	    if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.WASTELAND)) {
	    	if (config.oilRarity > 0) {
	    		addLiquidSpawn(COreBlocks.oilBlock, world, random, x, z, config.oilRarity, config.oilMinY, config.oilMaxY);
	    	}
	    	if (config.tarRarity > 0) {
	    		addLiquidSpawn(COreBlocks.tarBlock, world, random, x, z, config.tarRarity, config.tarMinY, config.tarMaxY);
	    	}
	    }
	    if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SANDY)) {
	    	if (config.oilRarity > 0) {
	    		addLiquidSpawn(COreBlocks.oilBlock, world, random, x, z, config.oilRarity, config.oilMinY, config.oilMaxY);
	    	}
	    	if (config.tarRarity > 0) {
	    		addLiquidSpawn(COreBlocks.tarBlock, world, random, x, z, config.tarRarity, config.tarMinY, config.tarMaxY);
	    	}
	    }
	    if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.WATER)) && (config.oilRarity > 0)) {
	    	addLiquidSpawn(COreBlocks.oilBlock, world, random, x, z, config.oilRarity, config.oilMinY, config.oilMaxY);
	    }
	    if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SWAMP)) && (config.tarRarity > 0)) {
	    	addLiquidSpawn(COreBlocks.tarBlock, world, random, x, z, config.tarRarity, config.tarMinY, config.tarMaxY);
	    }
	}
	
	public void addOreSpawn(WorldGenMinable wgm, World world, Random rand, int blockX, int blockZ, int chance, int minY, int maxY) {
		assert (maxY > minY) : "The maximum Y must be greater than the Minimum Y";
	    assert (minY > 0) : "addOreSpawn: The Minimum Y must be greater than 0";
	    assert ((maxY < 256) && (maxY > 0)) : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";

	    int diff = maxY - minY;
	    for (int x = 0; x < chance; x++) {
	      int posX = blockX + rand.nextInt(16);
	      int posY = minY + rand.nextInt(diff);
	      int posZ = blockZ + rand.nextInt(16);
	      wgm.generate(world, rand, posX, posY, posZ);
	    }
	}
	
	public void addLiquidSpawn(Block block, World world, Random rand, int blockX, int blockZ, int chance, int minY, int maxY) {
		int diff = maxY - minY;
		
		for (int x = 0; x < chance; x++) {
        	int posX = blockX + rand.nextInt(16);
        	int posY = minY + rand.nextInt(diff);
        	int posZ = blockZ + rand.nextInt(16);
        	(new WorldGenLakes(block)).generate(world, rand, posX, posY, posZ);
		}
	}
}