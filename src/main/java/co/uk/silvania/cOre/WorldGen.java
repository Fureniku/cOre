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

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
            case 1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}	
	}

	private void generateEnd(World world, Random random, int x, int z)
	  {
	    if (COreEndConfig.copperMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 0, Blocks.end_stone, world, random, x, z, COreEndConfig.copperMin + random.nextInt(COreEndConfig.copperMax - COreEndConfig.copperMin), COreEndConfig.copperRarity, COreEndConfig.copperMinY, COreEndConfig.copperMaxY);
	    }
	    if (COreEndConfig.tinMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 1, Blocks.end_stone, world, random, x, z, COreEndConfig.tinMin + random.nextInt(COreEndConfig.tinMax - COreEndConfig.tinMin), COreEndConfig.tinRarity, COreEndConfig.tinMinY, COreEndConfig.tinMaxY);
	    }
	    if (COreEndConfig.zincMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 2, Blocks.end_stone, world, random, x, z, COreEndConfig.zincMin + random.nextInt(COreEndConfig.zincMax - COreEndConfig.zincMin), COreEndConfig.zincRarity, COreEndConfig.zincMinY, COreEndConfig.zincMaxY);
	    }
	    if (COreEndConfig.nickelMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 3, Blocks.end_stone, world, random, x, z, COreEndConfig.nickelMin + random.nextInt(COreEndConfig.nickelMax - COreEndConfig.nickelMin), COreEndConfig.nickelRarity, COreEndConfig.nickelMinY, COreEndConfig.nickelMaxY);
	    }
	    if (COreEndConfig.silverMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 4, Blocks.end_stone, world, random, x, z, COreEndConfig.silverMin + random.nextInt(COreEndConfig.silverMax - COreEndConfig.silverMin), COreEndConfig.silverRarity, COreEndConfig.silverMinY, COreEndConfig.silverMaxY);
	    }
	    if (COreEndConfig.cobaltMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 5, Blocks.end_stone, world, random, x, z, COreEndConfig.cobaltMin + random.nextInt(COreEndConfig.cobaltMax - COreEndConfig.cobaltMin), COreEndConfig.cobaltRarity, COreEndConfig.cobaltMinY, COreEndConfig.cobaltMaxY);
	    }
	    if (COreEndConfig.titaniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 6, Blocks.end_stone, world, random, x, z, COreEndConfig.titaniumMin + random.nextInt(COreEndConfig.titaniumMax - COreEndConfig.titaniumMin), COreEndConfig.titaniumRarity, COreEndConfig.titaniumMinY, COreEndConfig.titaniumMaxY);
	    }
	    if (COreEndConfig.chromiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 7, Blocks.end_stone, world, random, x, z, COreEndConfig.chromiumMin + random.nextInt(COreEndConfig.chromiumMax - COreEndConfig.chromiumMin), COreEndConfig.chromiumRarity, COreEndConfig.chromiumMinY, COreEndConfig.chromiumMaxY);
	    }
	    if (COreEndConfig.manganeseMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 8, Blocks.end_stone, world, random, x, z, COreEndConfig.manganeseMin + random.nextInt(COreEndConfig.manganeseMax - COreEndConfig.manganeseMin), COreEndConfig.manganeseRarity, COreEndConfig.manganeseMinY, COreEndConfig.manganeseMaxY);
	    }
	    if (COreEndConfig.cadmiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 9, Blocks.end_stone, world, random, x, z, COreEndConfig.cadmiumMin + random.nextInt(COreEndConfig.cadmiumMax - COreEndConfig.cadmiumMin), COreEndConfig.cadmiumRarity, COreEndConfig.cadmiumMinY, COreEndConfig.cadmiumMaxY);
	    }
	    if (COreEndConfig.tungstenMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 10, Blocks.end_stone, world, random, x, z, COreEndConfig.tungstenMin + random.nextInt(COreEndConfig.tungstenMax - COreEndConfig.tungstenMin), COreEndConfig.tungstenRarity, COreEndConfig.tungstenMinY, COreEndConfig.tungstenMaxY);
	    }
	    if (COreEndConfig.leadMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 11, Blocks.end_stone, world, random, x, z, COreEndConfig.leadMin + random.nextInt(COreEndConfig.leadMax - COreEndConfig.leadMin), COreEndConfig.leadRarity, COreEndConfig.leadMinY, COreEndConfig.leadMaxY);
	    }
	    if (COreEndConfig.platinumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 12, Blocks.end_stone, world, random, x, z, COreEndConfig.platinumMin + random.nextInt(COreEndConfig.platinumMax - COreEndConfig.platinumMin), COreEndConfig.platinumRarity, COreEndConfig.platinumMinY, COreEndConfig.platinumMaxY);
	    }
	    if (COreEndConfig.lithiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 13, Blocks.end_stone, world, random, x, z, COreEndConfig.lithiumMin + random.nextInt(COreEndConfig.lithiumMax - COreEndConfig.lithiumMin), COreEndConfig.lithiumRarity, COreEndConfig.lithiumMinY, COreEndConfig.lithiumMaxY);
	    }
	    if (COreEndConfig.potassiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 14, Blocks.end_stone, world, random, x, z, COreEndConfig.potassiumMin + random.nextInt(COreEndConfig.potassiumMax - COreEndConfig.potassiumMin), COreEndConfig.potassiumRarity, COreEndConfig.potassiumMinY, COreEndConfig.potassiumMaxY);
	    }
	    if (COreEndConfig.magnesiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 15, Blocks.end_stone, world, random, x, z, COreEndConfig.magnesiumMin + random.nextInt(COreEndConfig.magnesiumMax - COreEndConfig.magnesiumMin), COreEndConfig.magnesiumRarity, COreEndConfig.magnesiumMinY, COreEndConfig.magnesiumMaxY);
	    }
	    if (COreEndConfig.calciumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 0, Blocks.end_stone, world, random, x, z, COreEndConfig.calciumMin + random.nextInt(COreEndConfig.calciumMax - COreEndConfig.calciumMin), COreEndConfig.calciumRarity, COreEndConfig.calciumMinY, COreEndConfig.calciumMaxY);
	    }
	    if (COreEndConfig.lanthanumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 1, Blocks.end_stone, world, random, x, z, COreEndConfig.lanthanumMin + random.nextInt(COreEndConfig.lanthanumMax - COreEndConfig.lanthanumMin), COreEndConfig.lanthanumRarity, COreEndConfig.lanthanumMinY, COreEndConfig.lanthanumMaxY);
	    }
	    if (COreEndConfig.ceriumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 2, Blocks.end_stone, world, random, x, z, COreEndConfig.ceriumMin + random.nextInt(COreEndConfig.ceriumMax - COreEndConfig.ceriumMin), COreEndConfig.ceriumRarity, COreEndConfig.ceriumMinY, COreEndConfig.ceriumMaxY);
	    }
	    if (COreEndConfig.promethiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 3, Blocks.end_stone, world, random, x, z, COreEndConfig.promethiumMin + random.nextInt(COreEndConfig.promethiumMax - COreEndConfig.promethiumMin), COreEndConfig.promethiumRarity, COreEndConfig.promethiumMinY, COreEndConfig.promethiumMaxY);
	    }
	    if (COreEndConfig.uraniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 4, Blocks.end_stone, world, random, x, z, COreEndConfig.uraniumMin + random.nextInt(COreEndConfig.uraniumMax - COreEndConfig.uraniumMin), COreEndConfig.uraniumRarity, COreEndConfig.uraniumMinY, COreEndConfig.uraniumMaxY);
	    }
	    if (COreEndConfig.plutoniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 5, Blocks.end_stone, world, random, x, z, COreEndConfig.plutoniumMin + random.nextInt(COreEndConfig.plutoniumMax - COreEndConfig.plutoniumMin), COreEndConfig.plutoniumRarity, COreEndConfig.plutoniumMinY, COreEndConfig.plutoniumMaxY);
	    }
	    if (COreEndConfig.technetiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 6, Blocks.end_stone, world, random, x, z, COreEndConfig.technetiumMin + random.nextInt(COreEndConfig.technetiumMax - COreEndConfig.technetiumMin), COreEndConfig.technetiumRarity, COreEndConfig.technetiumMinY, COreEndConfig.technetiumMaxY);
	    }
	    if (COreEndConfig.tantalumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 7, Blocks.end_stone, world, random, x, z, COreEndConfig.tantalumMin + random.nextInt(COreEndConfig.tantalumMax - COreEndConfig.tantalumMin), COreEndConfig.tantalumRarity, COreEndConfig.tantalumMinY, COreEndConfig.tantalumMaxY);
	    }
	    if (COreEndConfig.scandiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 8, Blocks.end_stone, world, random, x, z, COreEndConfig.scandiumMin + random.nextInt(COreEndConfig.scandiumMax - COreEndConfig.scandiumMin), COreEndConfig.scandiumRarity, COreEndConfig.scandiumMinY, COreEndConfig.scandiumMaxY);
	    }
	    if (COreEndConfig.aluminiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 9, Blocks.end_stone, world, random, x, z, COreEndConfig.aluminiumMin + random.nextInt(COreEndConfig.aluminiumMax - COreEndConfig.aluminiumMin), COreEndConfig.aluminiumRarity, COreEndConfig.aluminiumMinY, COreEndConfig.aluminiumMaxY);
	    }
	    if (COreEndConfig.galliumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 10, Blocks.end_stone, world, random, x, z, COreEndConfig.galliumMin + random.nextInt(COreEndConfig.galliumMax - COreEndConfig.galliumMin), COreEndConfig.galliumRarity, COreEndConfig.galliumMinY, COreEndConfig.galliumMaxY);
	    }
	    if (COreEndConfig.indiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 11, Blocks.end_stone, world, random, x, z, COreEndConfig.indiumMin + random.nextInt(COreEndConfig.indiumMax - COreEndConfig.indiumMin), COreEndConfig.indiumRarity, COreEndConfig.indiumMinY, COreEndConfig.indiumMaxY);
	    }
	    if (COreEndConfig.thalliumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 12, Blocks.end_stone, world, random, x, z, COreEndConfig.thalliumMin + random.nextInt(COreEndConfig.thalliumMax - COreEndConfig.thalliumMin), COreEndConfig.thalliumRarity, COreEndConfig.thalliumMinY, COreEndConfig.thalliumMaxY);
	    }
	    if (COreEndConfig.tecmoniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 13, Blocks.end_stone, world, random, x, z, COreEndConfig.tecmoniumMin + random.nextInt(COreEndConfig.tecmoniumMax - COreEndConfig.tecmoniumMin), COreEndConfig.tecmoniumRarity, COreEndConfig.tecmoniumMinY, COreEndConfig.tecmoniumMaxY);
	    }
	    if (COreEndConfig.silvaniteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 14, Blocks.end_stone, world, random, x, z, COreEndConfig.silvaniteMin + random.nextInt(COreEndConfig.silvaniteMax - COreEndConfig.silvaniteMin), COreEndConfig.silvaniteRarity, COreEndConfig.silvaniteMinY, COreEndConfig.silvaniteMaxY);
	    }
	    if (COreEndConfig.merciliteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 15, Blocks.end_stone, world, random, x, z, COreEndConfig.merciliteMin + random.nextInt(COreEndConfig.merciliteMax - COreEndConfig.merciliteMin), COreEndConfig.merciliteRarity, COreEndConfig.merciliteMinY, COreEndConfig.merciliteMaxY);
	    }
	    if (COreEndConfig.dragiteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 0, Blocks.end_stone, world, random, x, z, COreEndConfig.dragiteMin + random.nextInt(COreEndConfig.dragiteMax - COreEndConfig.dragiteMin), COreEndConfig.dragiteRarity, COreEndConfig.dragiteMinY, COreEndConfig.dragiteMaxY);
	    }
	    if (COreEndConfig.flariteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 1, Blocks.end_stone, world, random, x, z, COreEndConfig.flariteMin + random.nextInt(COreEndConfig.flariteMax - COreEndConfig.flariteMin), COreEndConfig.flariteRarity, COreEndConfig.flariteMinY, COreEndConfig.flariteMaxY);
	    }
	    if (COreEndConfig.mythrilMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 2, Blocks.end_stone, world, random, x, z, COreEndConfig.mythrilMin + random.nextInt(COreEndConfig.mythrilMax - COreEndConfig.mythrilMin), COreEndConfig.mythrilRarity, COreEndConfig.mythrilMinY, COreEndConfig.mythrilMaxY);
	    }
	    if (COreEndConfig.adamantiteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 3, Blocks.end_stone, world, random, x, z, COreEndConfig.adamantiteMin + random.nextInt(COreEndConfig.adamantiteMax - COreEndConfig.adamantiteMin), COreEndConfig.adamantiteRarity, COreEndConfig.adamantiteMinY, COreEndConfig.adamantiteMaxY);
	    }
	    if (COreEndConfig.sulfurMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 4, Blocks.end_stone, world, random, x, z, COreEndConfig.sulfurMin + random.nextInt(COreEndConfig.sulfurMax - COreEndConfig.sulfurMin), COreEndConfig.sulfurRarity, COreEndConfig.sulfurMinY, COreEndConfig.sulfurMaxY);
	    }
	    if (COreEndConfig.rubyMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 5, Blocks.end_stone, world, random, x, z, COreEndConfig.rubyMin + random.nextInt(COreEndConfig.rubyMax - COreEndConfig.rubyMin), COreEndConfig.rubyRarity, COreEndConfig.rubyMinY, COreEndConfig.rubyMaxY);
	    }
	    if (COreEndConfig.sapphireMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 6, Blocks.end_stone, world, random, x, z, COreEndConfig.sapphireMin + random.nextInt(COreEndConfig.sapphireMax - COreEndConfig.sapphireMin), COreEndConfig.sapphireRarity, COreEndConfig.sapphireMinY, COreEndConfig.sapphireMaxY);
	    }
	    if (COreEndConfig.amethystMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 7, Blocks.end_stone, world, random, x, z, COreEndConfig.amethystMin + random.nextInt(COreEndConfig.amethystMax - COreEndConfig.amethystMin), COreEndConfig.amethystRarity, COreEndConfig.amethystMinY, COreEndConfig.amethystMaxY);
	    }
	    if (COreEndConfig.crystalMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 8, Blocks.end_stone, world, random, x, z, COreEndConfig.crystalMin + random.nextInt(COreEndConfig.crystalMax - COreEndConfig.crystalMin), COreEndConfig.crystalRarity, COreEndConfig.crystalMinY, COreEndConfig.crystalMaxY);
	    }
	    if (COreEndConfig.mythianMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 9, Blocks.end_stone, world, random, x, z, COreEndConfig.mythianMin + random.nextInt(COreEndConfig.mythianMax - COreEndConfig.mythianMin), COreEndConfig.mythianRarity, COreEndConfig.mythianMinY, COreEndConfig.mythianMaxY);
	    }
	    if (COreEndConfig.blackstoneMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 10, Blocks.end_stone, world, random, x, z, COreEndConfig.blackstoneMin + random.nextInt(COreEndConfig.blackstoneMax - COreEndConfig.blackstoneMin), COreEndConfig.blackstoneRarity, COreEndConfig.blackstoneMinY, COreEndConfig.blackstoneMaxY);
	    }
	    if (COreEndConfig.bluestoneMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 11, Blocks.end_stone, world, random, x, z, COreEndConfig.bluestoneMin + random.nextInt(COreEndConfig.bluestoneMax - COreEndConfig.bluestoneMin), COreEndConfig.bluestoneRarity, COreEndConfig.bluestoneMinY, COreEndConfig.bluestoneMaxY);
	    }
	    if (COreEndConfig.purplestoneMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 12, Blocks.end_stone, world, random, x, z, COreEndConfig.purplestoneMin + random.nextInt(COreEndConfig.purplestoneMax - COreEndConfig.purplestoneMin), COreEndConfig.purplestoneRarity, COreEndConfig.purplestoneMinY, COreEndConfig.purplestoneMaxY);
	    }
	    if (COreEndConfig.iridiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 13, Blocks.end_stone, world, random, x, z, COreEndConfig.iridiumMin + random.nextInt(COreEndConfig.iridiumMax - COreEndConfig.iridiumMin), COreEndConfig.iridiumRarity, COreEndConfig.iridiumMinY, COreEndConfig.iridiumMaxY);
	    }
	    if (COreEndConfig.arditeMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 14, Blocks.end_stone, world, random, x, z, COreEndConfig.arditeMin + random.nextInt(COreEndConfig.arditeMax - COreEndConfig.arditeMin), COreEndConfig.arditeRarity, COreEndConfig.arditeMinY, COreEndConfig.arditeMaxY);
	    }
	  }
	
	private void generateSurface(World world, Random random, int x, int z)
	  {
	    if (COreOverWorldConfig.copperMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 0, Blocks.stone, world, random, x, z, COreOverWorldConfig.copperMin + random.nextInt(COreOverWorldConfig.copperMax - COreOverWorldConfig.copperMin), COreOverWorldConfig.copperRarity, COreOverWorldConfig.copperMinY, COreOverWorldConfig.copperMaxY);
	    }
	    if (COreOverWorldConfig.tinMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 1, Blocks.stone, world, random, x, z, COreOverWorldConfig.tinMin + random.nextInt(COreOverWorldConfig.tinMax - COreOverWorldConfig.tinMin), COreOverWorldConfig.tinRarity, COreOverWorldConfig.tinMinY, COreOverWorldConfig.tinMaxY);
	    }
	    if (COreOverWorldConfig.zincMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 2, Blocks.stone, world, random, x, z, COreOverWorldConfig.zincMin + random.nextInt(COreOverWorldConfig.zincMax - COreOverWorldConfig.zincMin), COreOverWorldConfig.zincRarity, COreOverWorldConfig.zincMinY, COreOverWorldConfig.zincMaxY);
	    }
	    if (COreOverWorldConfig.nickelMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 3, Blocks.stone, world, random, x, z, COreOverWorldConfig.nickelMin + random.nextInt(COreOverWorldConfig.nickelMax - COreOverWorldConfig.nickelMin), COreOverWorldConfig.nickelRarity, COreOverWorldConfig.nickelMinY, COreOverWorldConfig.nickelMaxY);
	    }
	    if (COreOverWorldConfig.silverMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 4, Blocks.stone, world, random, x, z, COreOverWorldConfig.silverMin + random.nextInt(COreOverWorldConfig.silverMax - COreOverWorldConfig.silverMin), COreOverWorldConfig.silverRarity, COreOverWorldConfig.silverMinY, COreOverWorldConfig.silverMaxY);
	    }
	    if (COreOverWorldConfig.cobaltMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 5, Blocks.stone, world, random, x, z, COreOverWorldConfig.cobaltMin + random.nextInt(COreOverWorldConfig.cobaltMax - COreOverWorldConfig.cobaltMin), COreOverWorldConfig.cobaltRarity, COreOverWorldConfig.cobaltMinY, COreOverWorldConfig.cobaltMaxY);
	    }
	    if (COreOverWorldConfig.titaniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 6, Blocks.stone, world, random, x, z, COreOverWorldConfig.titaniumMin + random.nextInt(COreOverWorldConfig.titaniumMax - COreOverWorldConfig.titaniumMin), COreOverWorldConfig.titaniumRarity, COreOverWorldConfig.titaniumMinY, COreOverWorldConfig.titaniumMaxY);
	    }
	    if (COreOverWorldConfig.chromiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 7, Blocks.stone, world, random, x, z, COreOverWorldConfig.chromiumMin + random.nextInt(COreOverWorldConfig.chromiumMax - COreOverWorldConfig.chromiumMin), COreOverWorldConfig.chromiumRarity, COreOverWorldConfig.chromiumMinY, COreOverWorldConfig.chromiumMaxY);
	    }
	    if (COreOverWorldConfig.manganeseMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 8, Blocks.stone, world, random, x, z, COreOverWorldConfig.manganeseMin + random.nextInt(COreOverWorldConfig.manganeseMax - COreOverWorldConfig.manganeseMin), COreOverWorldConfig.manganeseRarity, COreOverWorldConfig.manganeseMinY, COreOverWorldConfig.manganeseMaxY);
	    }
	    if (COreOverWorldConfig.cadmiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 9, Blocks.stone, world, random, x, z, COreOverWorldConfig.cadmiumMin + random.nextInt(COreOverWorldConfig.cadmiumMax - COreOverWorldConfig.cadmiumMin), COreOverWorldConfig.cadmiumRarity, COreOverWorldConfig.cadmiumMinY, COreOverWorldConfig.cadmiumMaxY);
	    }
	    if (COreOverWorldConfig.tungstenMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 10, Blocks.stone, world, random, x, z, COreOverWorldConfig.tungstenMin + random.nextInt(COreOverWorldConfig.tungstenMax - COreOverWorldConfig.tungstenMin), COreOverWorldConfig.tungstenRarity, COreOverWorldConfig.tungstenMinY, COreOverWorldConfig.tungstenMaxY);
	    }
	    if (COreOverWorldConfig.leadMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 11, Blocks.stone, world, random, x, z, COreOverWorldConfig.leadMin + random.nextInt(COreOverWorldConfig.leadMax - COreOverWorldConfig.leadMin), COreOverWorldConfig.leadRarity, COreOverWorldConfig.leadMinY, COreOverWorldConfig.leadMaxY);
	    }
	    if (COreOverWorldConfig.platinumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 12, Blocks.stone, world, random, x, z, COreOverWorldConfig.platinumMin + random.nextInt(COreOverWorldConfig.platinumMax - COreOverWorldConfig.platinumMin), COreOverWorldConfig.platinumRarity, COreOverWorldConfig.platinumMinY, COreOverWorldConfig.platinumMaxY);
	    }
	    if (COreOverWorldConfig.lithiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 13, Blocks.stone, world, random, x, z, COreOverWorldConfig.lithiumMin + random.nextInt(COreOverWorldConfig.lithiumMax - COreOverWorldConfig.lithiumMin), COreOverWorldConfig.lithiumRarity, COreOverWorldConfig.lithiumMinY, COreOverWorldConfig.lithiumMaxY);
	    }
	    if (COreOverWorldConfig.potassiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 14, Blocks.stone, world, random, x, z, COreOverWorldConfig.potassiumMin + random.nextInt(COreOverWorldConfig.potassiumMax - COreOverWorldConfig.potassiumMin), COreOverWorldConfig.potassiumRarity, COreOverWorldConfig.potassiumMinY, COreOverWorldConfig.potassiumMaxY);
	    }
	    if (COreOverWorldConfig.magnesiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 15, Blocks.stone, world, random, x, z, COreOverWorldConfig.magnesiumMin + random.nextInt(COreOverWorldConfig.magnesiumMax - COreOverWorldConfig.magnesiumMin), COreOverWorldConfig.magnesiumRarity, COreOverWorldConfig.magnesiumMinY, COreOverWorldConfig.magnesiumMaxY);
	    }
	    if (COreOverWorldConfig.calciumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 0, Blocks.stone, world, random, x, z, COreOverWorldConfig.calciumMin + random.nextInt(COreOverWorldConfig.calciumMax - COreOverWorldConfig.calciumMin), COreOverWorldConfig.calciumRarity, COreOverWorldConfig.calciumMinY, COreOverWorldConfig.calciumMaxY);
	    }
	    if (COreOverWorldConfig.lanthanumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 1, Blocks.stone, world, random, x, z, COreOverWorldConfig.lanthanumMin + random.nextInt(COreOverWorldConfig.lanthanumMax - COreOverWorldConfig.lanthanumMin), COreOverWorldConfig.lanthanumRarity, COreOverWorldConfig.lanthanumMinY, COreOverWorldConfig.lanthanumMaxY);
	    }
	    if (COreOverWorldConfig.ceriumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 2, Blocks.stone, world, random, x, z, COreOverWorldConfig.ceriumMin + random.nextInt(COreOverWorldConfig.ceriumMax - COreOverWorldConfig.ceriumMin), COreOverWorldConfig.ceriumRarity, COreOverWorldConfig.ceriumMinY, COreOverWorldConfig.ceriumMaxY);
	    }
	    if (COreOverWorldConfig.promethiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 3, Blocks.stone, world, random, x, z, COreOverWorldConfig.promethiumMin + random.nextInt(COreOverWorldConfig.promethiumMax - COreOverWorldConfig.promethiumMin), COreOverWorldConfig.promethiumRarity, COreOverWorldConfig.promethiumMinY, COreOverWorldConfig.promethiumMaxY);
	    }
	    if (COreOverWorldConfig.uraniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 4, Blocks.stone, world, random, x, z, COreOverWorldConfig.uraniumMin + random.nextInt(COreOverWorldConfig.uraniumMax - COreOverWorldConfig.uraniumMin), COreOverWorldConfig.uraniumRarity, COreOverWorldConfig.uraniumMinY, COreOverWorldConfig.uraniumMaxY);
	    }
	    if (COreOverWorldConfig.plutoniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 5, Blocks.stone, world, random, x, z, COreOverWorldConfig.plutoniumMin + random.nextInt(COreOverWorldConfig.plutoniumMax - COreOverWorldConfig.plutoniumMin), COreOverWorldConfig.plutoniumRarity, COreOverWorldConfig.plutoniumMinY, COreOverWorldConfig.plutoniumMaxY);
	    }
	    if (COreOverWorldConfig.technetiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 6, Blocks.stone, world, random, x, z, COreOverWorldConfig.technetiumMin + random.nextInt(COreOverWorldConfig.technetiumMax - COreOverWorldConfig.technetiumMin), COreOverWorldConfig.technetiumRarity, COreOverWorldConfig.technetiumMinY, COreOverWorldConfig.technetiumMaxY);
	    }
	    if (COreOverWorldConfig.tantalumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 7, Blocks.stone, world, random, x, z, COreOverWorldConfig.tantalumMin + random.nextInt(COreOverWorldConfig.tantalumMax - COreOverWorldConfig.tantalumMin), COreOverWorldConfig.tantalumRarity, COreOverWorldConfig.tantalumMinY, COreOverWorldConfig.tantalumMaxY);
	    }
	    if (COreOverWorldConfig.scandiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 8, Blocks.stone, world, random, x, z, COreOverWorldConfig.scandiumMin + random.nextInt(COreOverWorldConfig.scandiumMax - COreOverWorldConfig.scandiumMin), COreOverWorldConfig.scandiumRarity, COreOverWorldConfig.scandiumMinY, COreOverWorldConfig.scandiumMaxY);
	    }
	    if (COreOverWorldConfig.aluminiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 9, Blocks.stone, world, random, x, z, COreOverWorldConfig.aluminiumMin + random.nextInt(COreOverWorldConfig.aluminiumMax - COreOverWorldConfig.aluminiumMin), COreOverWorldConfig.aluminiumRarity, COreOverWorldConfig.aluminiumMinY, COreOverWorldConfig.aluminiumMaxY);
	    }
	    if (COreOverWorldConfig.galliumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 10, Blocks.stone, world, random, x, z, COreOverWorldConfig.galliumMin + random.nextInt(COreOverWorldConfig.galliumMax - COreOverWorldConfig.galliumMin), COreOverWorldConfig.galliumRarity, COreOverWorldConfig.galliumMinY, COreOverWorldConfig.galliumMaxY);
	    }
	    if (COreOverWorldConfig.indiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 11, Blocks.stone, world, random, x, z, COreOverWorldConfig.indiumMin + random.nextInt(COreOverWorldConfig.indiumMax - COreOverWorldConfig.indiumMin), COreOverWorldConfig.indiumRarity, COreOverWorldConfig.indiumMinY, COreOverWorldConfig.indiumMaxY);
	    }
	    if (COreOverWorldConfig.thalliumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 12, Blocks.stone, world, random, x, z, COreOverWorldConfig.thalliumMin + random.nextInt(COreOverWorldConfig.thalliumMax - COreOverWorldConfig.thalliumMin), COreOverWorldConfig.thalliumRarity, COreOverWorldConfig.thalliumMinY, COreOverWorldConfig.thalliumMaxY);
	    }
	    if (COreOverWorldConfig.tecmoniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 13, Blocks.stone, world, random, x, z, COreOverWorldConfig.tecmoniumMin + random.nextInt(COreOverWorldConfig.tecmoniumMax - COreOverWorldConfig.tecmoniumMin), COreOverWorldConfig.tecmoniumRarity, COreOverWorldConfig.tecmoniumMinY, COreOverWorldConfig.tecmoniumMaxY);
	    }
	    if (COreOverWorldConfig.silvaniteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 14, Blocks.stone, world, random, x, z, COreOverWorldConfig.silvaniteMin + random.nextInt(COreOverWorldConfig.silvaniteMax - COreOverWorldConfig.silvaniteMin), COreOverWorldConfig.silvaniteRarity, COreOverWorldConfig.silvaniteMinY, COreOverWorldConfig.silvaniteMaxY);
	    }
	    if (COreOverWorldConfig.merciliteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 15, Blocks.stone, world, random, x, z, COreOverWorldConfig.merciliteMin + random.nextInt(COreOverWorldConfig.merciliteMax - COreOverWorldConfig.merciliteMin), COreOverWorldConfig.merciliteRarity, COreOverWorldConfig.merciliteMinY, COreOverWorldConfig.merciliteMaxY);
	    }
	    if (COreOverWorldConfig.dragiteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 0, Blocks.stone, world, random, x, z, COreOverWorldConfig.dragiteMin + random.nextInt(COreOverWorldConfig.dragiteMax - COreOverWorldConfig.dragiteMin), COreOverWorldConfig.dragiteRarity, COreOverWorldConfig.dragiteMinY, COreOverWorldConfig.dragiteMaxY);
	    }
	    if (COreOverWorldConfig.flariteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 1, Blocks.stone, world, random, x, z, COreOverWorldConfig.flariteMin + random.nextInt(COreOverWorldConfig.flariteMax - COreOverWorldConfig.flariteMin), COreOverWorldConfig.flariteRarity, COreOverWorldConfig.flariteMinY, COreOverWorldConfig.flariteMaxY);
	    }
	    if (COreOverWorldConfig.mythrilMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 2, Blocks.stone, world, random, x, z, COreOverWorldConfig.mythrilMin + random.nextInt(COreOverWorldConfig.mythrilMax - COreOverWorldConfig.mythrilMin), COreOverWorldConfig.mythrilRarity, COreOverWorldConfig.mythrilMinY, COreOverWorldConfig.mythrilMaxY);
	    }
	    if (COreOverWorldConfig.adamantiteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 3, Blocks.stone, world, random, x, z, COreOverWorldConfig.adamantiteMin + random.nextInt(COreOverWorldConfig.adamantiteMax - COreOverWorldConfig.adamantiteMin), COreOverWorldConfig.adamantiteRarity, COreOverWorldConfig.adamantiteMinY, COreOverWorldConfig.adamantiteMaxY);
	    }
	    if (COreOverWorldConfig.sulfurMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 4, Blocks.stone, world, random, x, z, COreOverWorldConfig.sulfurMin + random.nextInt(COreOverWorldConfig.sulfurMax - COreOverWorldConfig.sulfurMin), COreOverWorldConfig.sulfurRarity, COreOverWorldConfig.sulfurMinY, COreOverWorldConfig.sulfurMaxY);
	    }
	    if (COreOverWorldConfig.rubyMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 5, Blocks.stone, world, random, x, z, COreOverWorldConfig.rubyMin + random.nextInt(COreOverWorldConfig.rubyMax - COreOverWorldConfig.rubyMin), COreOverWorldConfig.rubyRarity, COreOverWorldConfig.rubyMinY, COreOverWorldConfig.rubyMaxY);
	    }
	    if (COreOverWorldConfig.sapphireMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 6, Blocks.stone, world, random, x, z, COreOverWorldConfig.sapphireMin + random.nextInt(COreOverWorldConfig.sapphireMax - COreOverWorldConfig.sapphireMin), COreOverWorldConfig.sapphireRarity, COreOverWorldConfig.sapphireMinY, COreOverWorldConfig.sapphireMaxY);
	    }
	    if (COreOverWorldConfig.amethystMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 7, Blocks.stone, world, random, x, z, COreOverWorldConfig.amethystMin + random.nextInt(COreOverWorldConfig.amethystMax - COreOverWorldConfig.amethystMin), COreOverWorldConfig.amethystRarity, COreOverWorldConfig.amethystMinY, COreOverWorldConfig.amethystMaxY);
	    }
	    if (COreOverWorldConfig.crystalMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 8, Blocks.stone, world, random, x, z, COreOverWorldConfig.crystalMin + random.nextInt(COreOverWorldConfig.crystalMax - COreOverWorldConfig.crystalMin), COreOverWorldConfig.crystalRarity, COreOverWorldConfig.crystalMinY, COreOverWorldConfig.crystalMaxY);
	    }
	    if (COreOverWorldConfig.mythianMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 9, Blocks.stone, world, random, x, z, COreOverWorldConfig.mythianMin + random.nextInt(COreOverWorldConfig.mythianMax - COreOverWorldConfig.mythianMin), COreOverWorldConfig.mythianRarity, COreOverWorldConfig.mythianMinY, COreOverWorldConfig.mythianMaxY);
	    }
	    if (COreOverWorldConfig.blackstoneMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 10, Blocks.stone, world, random, x, z, COreOverWorldConfig.blackstoneMin + random.nextInt(COreOverWorldConfig.blackstoneMax - COreOverWorldConfig.blackstoneMin), COreOverWorldConfig.blackstoneRarity, COreOverWorldConfig.blackstoneMinY, COreOverWorldConfig.blackstoneMaxY);
	    }
	    if (COreOverWorldConfig.bluestoneMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 11, Blocks.stone, world, random, x, z, COreOverWorldConfig.bluestoneMin + random.nextInt(COreOverWorldConfig.bluestoneMax - COreOverWorldConfig.bluestoneMin), COreOverWorldConfig.bluestoneRarity, COreOverWorldConfig.bluestoneMinY, COreOverWorldConfig.bluestoneMaxY);
	    }
	    if (COreOverWorldConfig.purplestoneMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 12, Blocks.stone, world, random, x, z, COreOverWorldConfig.purplestoneMin + random.nextInt(COreOverWorldConfig.purplestoneMax - COreOverWorldConfig.purplestoneMin), COreOverWorldConfig.purplestoneRarity, COreOverWorldConfig.purplestoneMinY, COreOverWorldConfig.purplestoneMaxY);
	    }
	    if (COreOverWorldConfig.iridiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 13, Blocks.stone, world, random, x, z, COreOverWorldConfig.iridiumMin + random.nextInt(COreOverWorldConfig.iridiumMax - COreOverWorldConfig.iridiumMin), COreOverWorldConfig.iridiumRarity, COreOverWorldConfig.iridiumMinY, COreOverWorldConfig.iridiumMaxY);
	    }
	    if (COreOverWorldConfig.arditeMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 14, Blocks.stone, world, random, x, z, COreOverWorldConfig.arditeMin + random.nextInt(COreOverWorldConfig.arditeMax - COreOverWorldConfig.arditeMin), COreOverWorldConfig.arditeRarity, COreOverWorldConfig.arditeMinY, COreOverWorldConfig.arditeMaxY);
	    }
	    if (COreOverWorldConfig.mercuryMax > 0) {
	      addOreSpawn(COreBlocks.mercuryBlock, 0, Blocks.stone, world, random, x, z, COreOverWorldConfig.mercuryMin + random.nextInt(COreOverWorldConfig.mercuryMax - COreOverWorldConfig.mercuryMin), COreOverWorldConfig.mercuryRarity, COreOverWorldConfig.mercuryMinY, COreOverWorldConfig.mercuryMaxY);
	    }
	    if (COreOverWorldConfig.limestoneMax > 0) {
	      addOreSpawn(COreBlocks.limestoneBlock, 0, Blocks.stone, world, random, x, z, COreOverWorldConfig.limestoneMin + random.nextInt(COreOverWorldConfig.limestoneMax - COreOverWorldConfig.limestoneMin), COreOverWorldConfig.limestoneRarity, COreOverWorldConfig.limestoneMinY, COreOverWorldConfig.limestoneMaxY);
	    }
	    if (COreOverWorldConfig.calciteMax > 0) {
	      addOreSpawn(COreBlocks.calciteBlock, 0, Blocks.stone, world, random, x, z, COreOverWorldConfig.calciteMin + random.nextInt(COreOverWorldConfig.calciteMax - COreOverWorldConfig.calciteMin), COreOverWorldConfig.calciteRarity, COreOverWorldConfig.calciteMinY, COreOverWorldConfig.calciteMaxY);
	    }
	    if (COreOverWorldConfig.graphiteMax > 0) {
	      addOreSpawn(COreBlocks.graphiteBlock, 0, Blocks.stone, world, random, x, z, COreOverWorldConfig.graphiteMin + random.nextInt(COreOverWorldConfig.graphiteMax - COreOverWorldConfig.graphiteMin), COreOverWorldConfig.graphiteRarity, COreOverWorldConfig.graphiteMinY, COreOverWorldConfig.graphiteMaxY);
	    }
	    BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(x * 16, z * 26);
	    if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.WASTELAND))
	    {
	      if (COreOverWorldConfig.oilRarity > 0) {
	        addLiquidSpawn(COreBlocks.oilBlock, world, random, x, z, COreOverWorldConfig.oilRarity, COreOverWorldConfig.oilMinY, COreOverWorldConfig.oilMaxY);
	      }
	      if (COreOverWorldConfig.tarRarity > 0) {
	        addLiquidSpawn(COreBlocks.tarBlock, world, random, x, z, COreOverWorldConfig.tarRarity, COreOverWorldConfig.tarMinY, COreOverWorldConfig.tarMaxY);
	      }
	    }
	    if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SANDY))
	    {
	      if (COreOverWorldConfig.oilRarity > 0) {
	        addLiquidSpawn(COreBlocks.oilBlock, world, random, x, z, COreOverWorldConfig.oilRarity, COreOverWorldConfig.oilMinY, COreOverWorldConfig.oilMaxY);
	      }
	      if (COreOverWorldConfig.tarRarity > 0) {
	        addLiquidSpawn(COreBlocks.tarBlock, world, random, x, z, COreOverWorldConfig.tarRarity, COreOverWorldConfig.tarMinY, COreOverWorldConfig.tarMaxY);
	      }
	    }
	    if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.WATER)) && 
	      (COreOverWorldConfig.oilRarity > 0)) {
	      addLiquidSpawn(COreBlocks.oilBlock, world, random, x, z, COreOverWorldConfig.oilRarity, COreOverWorldConfig.oilMinY, COreOverWorldConfig.oilMaxY);
	    }
	    if ((BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SWAMP)) && 
	      (COreOverWorldConfig.tarRarity > 0)) {
	      addLiquidSpawn(COreBlocks.tarBlock, world, random, x, z, COreOverWorldConfig.tarRarity, COreOverWorldConfig.tarMinY, COreOverWorldConfig.tarMaxY);
	    }
	  }
	  
	  private void generateNether(World world, Random random, int x, int z)
	  {
	    if (COreNetherConfig.copperMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 0, Blocks.netherrack, world, random, x, z, COreNetherConfig.copperMin + random.nextInt(COreNetherConfig.copperMax - COreNetherConfig.copperMin), COreNetherConfig.copperRarity, COreNetherConfig.copperMinY, COreNetherConfig.copperMaxY);
	    }
	    if (COreNetherConfig.tinMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 1, Blocks.netherrack, world, random, x, z, COreNetherConfig.tinMin + random.nextInt(COreNetherConfig.tinMax - COreNetherConfig.tinMin), COreNetherConfig.tinRarity, COreNetherConfig.tinMinY, COreNetherConfig.tinMaxY);
	    }
	    if (COreNetherConfig.zincMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 2, Blocks.netherrack, world, random, x, z, COreNetherConfig.zincMin + random.nextInt(COreNetherConfig.zincMax - COreNetherConfig.zincMin), COreNetherConfig.zincRarity, COreNetherConfig.zincMinY, COreNetherConfig.zincMaxY);
	    }
	    if (COreNetherConfig.nickelMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 3, Blocks.netherrack, world, random, x, z, COreNetherConfig.nickelMin + random.nextInt(COreNetherConfig.nickelMax - COreNetherConfig.nickelMin), COreNetherConfig.nickelRarity, COreNetherConfig.nickelMinY, COreNetherConfig.nickelMaxY);
	    }
	    if (COreNetherConfig.silverMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 4, Blocks.netherrack, world, random, x, z, COreNetherConfig.silverMin + random.nextInt(COreNetherConfig.silverMax - COreNetherConfig.silverMin), COreNetherConfig.silverRarity, COreNetherConfig.silverMinY, COreNetherConfig.silverMaxY);
	    }
	    if (COreNetherConfig.cobaltMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 5, Blocks.netherrack, world, random, x, z, COreNetherConfig.cobaltMin + random.nextInt(COreNetherConfig.cobaltMax - COreNetherConfig.cobaltMin), COreNetherConfig.cobaltRarity, COreNetherConfig.cobaltMinY, COreNetherConfig.cobaltMaxY);
	    }
	    if (COreNetherConfig.titaniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 6, Blocks.netherrack, world, random, x, z, COreNetherConfig.titaniumMin + random.nextInt(COreNetherConfig.titaniumMax - COreNetherConfig.titaniumMin), COreNetherConfig.titaniumRarity, COreNetherConfig.titaniumMinY, COreNetherConfig.titaniumMaxY);
	    }
	    if (COreNetherConfig.chromiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 7, Blocks.netherrack, world, random, x, z, COreNetherConfig.chromiumMin + random.nextInt(COreNetherConfig.chromiumMax - COreNetherConfig.chromiumMin), COreNetherConfig.chromiumRarity, COreNetherConfig.chromiumMinY, COreNetherConfig.chromiumMaxY);
	    }
	    if (COreNetherConfig.manganeseMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 8, Blocks.netherrack, world, random, x, z, COreNetherConfig.manganeseMin + random.nextInt(COreNetherConfig.manganeseMax - COreNetherConfig.manganeseMin), COreNetherConfig.manganeseRarity, COreNetherConfig.manganeseMinY, COreNetherConfig.manganeseMaxY);
	    }
	    if (COreNetherConfig.cadmiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 9, Blocks.netherrack, world, random, x, z, COreNetherConfig.cadmiumMin + random.nextInt(COreNetherConfig.cadmiumMax - COreNetherConfig.cadmiumMin), COreNetherConfig.cadmiumRarity, COreNetherConfig.cadmiumMinY, COreNetherConfig.cadmiumMaxY);
	    }
	    if (COreNetherConfig.tungstenMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 10, Blocks.netherrack, world, random, x, z, COreNetherConfig.tungstenMin + random.nextInt(COreNetherConfig.tungstenMax - COreNetherConfig.tungstenMin), COreNetherConfig.tungstenRarity, COreNetherConfig.tungstenMinY, COreNetherConfig.tungstenMaxY);
	    }
	    if (COreNetherConfig.leadMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 11, Blocks.netherrack, world, random, x, z, COreNetherConfig.leadMin + random.nextInt(COreNetherConfig.leadMax - COreNetherConfig.leadMin), COreNetherConfig.leadRarity, COreNetherConfig.leadMinY, COreNetherConfig.leadMaxY);
	    }
	    if (COreNetherConfig.platinumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 12, Blocks.netherrack, world, random, x, z, COreNetherConfig.platinumMin + random.nextInt(COreNetherConfig.platinumMax - COreNetherConfig.platinumMin), COreNetherConfig.platinumRarity, COreNetherConfig.platinumMinY, COreNetherConfig.platinumMaxY);
	    }
	    if (COreNetherConfig.lithiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 13, Blocks.netherrack, world, random, x, z, COreNetherConfig.lithiumMin + random.nextInt(COreNetherConfig.lithiumMax - COreNetherConfig.lithiumMin), COreNetherConfig.lithiumRarity, COreNetherConfig.lithiumMinY, COreNetherConfig.lithiumMaxY);
	    }
	    if (COreNetherConfig.potassiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 14, Blocks.netherrack, world, random, x, z, COreNetherConfig.potassiumMin + random.nextInt(COreNetherConfig.potassiumMax - COreNetherConfig.potassiumMin), COreNetherConfig.potassiumRarity, COreNetherConfig.potassiumMinY, COreNetherConfig.potassiumMaxY);
	    }
	    if (COreNetherConfig.magnesiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre1, 15, Blocks.netherrack, world, random, x, z, COreNetherConfig.magnesiumMin + random.nextInt(COreNetherConfig.magnesiumMax - COreNetherConfig.magnesiumMin), COreNetherConfig.magnesiumRarity, COreNetherConfig.magnesiumMinY, COreNetherConfig.magnesiumMaxY);
	    }
	    if (COreNetherConfig.calciumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 0, Blocks.netherrack, world, random, x, z, COreNetherConfig.calciumMin + random.nextInt(COreNetherConfig.calciumMax - COreNetherConfig.calciumMin), COreNetherConfig.calciumRarity, COreNetherConfig.calciumMinY, COreNetherConfig.calciumMaxY);
	    }
	    if (COreNetherConfig.lanthanumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 1, Blocks.netherrack, world, random, x, z, COreNetherConfig.lanthanumMin + random.nextInt(COreNetherConfig.lanthanumMax - COreNetherConfig.lanthanumMin), COreNetherConfig.lanthanumRarity, COreNetherConfig.lanthanumMinY, COreNetherConfig.lanthanumMaxY);
	    }
	    if (COreNetherConfig.ceriumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 2, Blocks.netherrack, world, random, x, z, COreNetherConfig.ceriumMin + random.nextInt(COreNetherConfig.ceriumMax - COreNetherConfig.ceriumMin), COreNetherConfig.ceriumRarity, COreNetherConfig.ceriumMinY, COreNetherConfig.ceriumMaxY);
	    }
	    if (COreNetherConfig.promethiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 3, Blocks.netherrack, world, random, x, z, COreNetherConfig.promethiumMin + random.nextInt(COreNetherConfig.promethiumMax - COreNetherConfig.promethiumMin), COreNetherConfig.promethiumRarity, COreNetherConfig.promethiumMinY, COreNetherConfig.promethiumMaxY);
	    }
	    if (COreNetherConfig.uraniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 4, Blocks.netherrack, world, random, x, z, COreNetherConfig.uraniumMin + random.nextInt(COreNetherConfig.uraniumMax - COreNetherConfig.uraniumMin), COreNetherConfig.uraniumRarity, COreNetherConfig.uraniumMinY, COreNetherConfig.uraniumMaxY);
	    }
	    if (COreNetherConfig.plutoniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 5, Blocks.netherrack, world, random, x, z, COreNetherConfig.plutoniumMin + random.nextInt(COreNetherConfig.plutoniumMax - COreNetherConfig.plutoniumMin), COreNetherConfig.plutoniumRarity, COreNetherConfig.plutoniumMinY, COreNetherConfig.plutoniumMaxY);
	    }
	    if (COreNetherConfig.technetiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 6, Blocks.netherrack, world, random, x, z, COreNetherConfig.technetiumMin + random.nextInt(COreNetherConfig.technetiumMax - COreNetherConfig.technetiumMin), COreNetherConfig.technetiumRarity, COreNetherConfig.technetiumMinY, COreNetherConfig.technetiumMaxY);
	    }
	    if (COreNetherConfig.tantalumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 7, Blocks.netherrack, world, random, x, z, COreNetherConfig.tantalumMin + random.nextInt(COreNetherConfig.tantalumMax - COreNetherConfig.tantalumMin), COreNetherConfig.tantalumRarity, COreNetherConfig.tantalumMinY, COreNetherConfig.tantalumMaxY);
	    }
	    if (COreNetherConfig.scandiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 8, Blocks.netherrack, world, random, x, z, COreNetherConfig.scandiumMin + random.nextInt(COreNetherConfig.scandiumMax - COreNetherConfig.scandiumMin), COreNetherConfig.scandiumRarity, COreNetherConfig.scandiumMinY, COreNetherConfig.scandiumMaxY);
	    }
	    if (COreNetherConfig.aluminiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 9, Blocks.netherrack, world, random, x, z, COreNetherConfig.aluminiumMin + random.nextInt(COreNetherConfig.aluminiumMax - COreNetherConfig.aluminiumMin), COreNetherConfig.aluminiumRarity, COreNetherConfig.aluminiumMinY, COreNetherConfig.aluminiumMaxY);
	    }
	    if (COreNetherConfig.galliumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 10, Blocks.netherrack, world, random, x, z, COreNetherConfig.galliumMin + random.nextInt(COreNetherConfig.galliumMax - COreNetherConfig.galliumMin), COreNetherConfig.galliumRarity, COreNetherConfig.galliumMinY, COreNetherConfig.galliumMaxY);
	    }
	    if (COreNetherConfig.indiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 11, Blocks.netherrack, world, random, x, z, COreNetherConfig.indiumMin + random.nextInt(COreNetherConfig.indiumMax - COreNetherConfig.indiumMin), COreNetherConfig.indiumRarity, COreNetherConfig.indiumMinY, COreNetherConfig.indiumMaxY);
	    }
	    if (COreNetherConfig.thalliumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 12, Blocks.netherrack, world, random, x, z, COreNetherConfig.thalliumMin + random.nextInt(COreNetherConfig.thalliumMax - COreNetherConfig.thalliumMin), COreNetherConfig.thalliumRarity, COreNetherConfig.thalliumMinY, COreNetherConfig.thalliumMaxY);
	    }
	    if (COreNetherConfig.tecmoniumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 13, Blocks.netherrack, world, random, x, z, COreNetherConfig.tecmoniumMin + random.nextInt(COreNetherConfig.tecmoniumMax - COreNetherConfig.tecmoniumMin), COreNetherConfig.tecmoniumRarity, COreNetherConfig.tecmoniumMinY, COreNetherConfig.tecmoniumMaxY);
	    }
	    if (COreNetherConfig.silvaniteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 14, Blocks.netherrack, world, random, x, z, COreNetherConfig.silvaniteMin + random.nextInt(COreNetherConfig.silvaniteMax - COreNetherConfig.silvaniteMin), COreNetherConfig.silvaniteRarity, COreNetherConfig.silvaniteMinY, COreNetherConfig.silvaniteMaxY);
	    }
	    if (COreNetherConfig.merciliteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre2, 15, Blocks.netherrack, world, random, x, z, COreNetherConfig.merciliteMin + random.nextInt(COreNetherConfig.merciliteMax - COreNetherConfig.merciliteMin), COreNetherConfig.merciliteRarity, COreNetherConfig.merciliteMinY, COreNetherConfig.merciliteMaxY);
	    }
	    if (COreNetherConfig.dragiteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 0, Blocks.netherrack, world, random, x, z, COreNetherConfig.dragiteMin + random.nextInt(COreNetherConfig.dragiteMax - COreNetherConfig.dragiteMin), COreNetherConfig.dragiteRarity, COreNetherConfig.dragiteMinY, COreNetherConfig.dragiteMaxY);
	    }
	    if (COreNetherConfig.flariteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 1, Blocks.netherrack, world, random, x, z, COreNetherConfig.flariteMin + random.nextInt(COreNetherConfig.flariteMax - COreNetherConfig.flariteMin), COreNetherConfig.flariteRarity, COreNetherConfig.flariteMinY, COreNetherConfig.flariteMaxY);
	    }
	    if (COreNetherConfig.mythrilMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 2, Blocks.netherrack, world, random, x, z, COreNetherConfig.mythrilMin + random.nextInt(COreNetherConfig.mythrilMax - COreNetherConfig.mythrilMin), COreNetherConfig.mythrilRarity, COreNetherConfig.mythrilMinY, COreNetherConfig.mythrilMaxY);
	    }
	    if (COreNetherConfig.adamantiteMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 3, Blocks.netherrack, world, random, x, z, COreNetherConfig.adamantiteMin + random.nextInt(COreNetherConfig.adamantiteMax - COreNetherConfig.adamantiteMin), COreNetherConfig.adamantiteRarity, COreNetherConfig.adamantiteMinY, COreNetherConfig.adamantiteMaxY);
	    }
	    if (COreNetherConfig.sulfurMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 4, Blocks.netherrack, world, random, x, z, COreNetherConfig.sulfurMin + random.nextInt(COreNetherConfig.sulfurMax - COreNetherConfig.sulfurMin), COreNetherConfig.sulfurRarity, COreNetherConfig.sulfurMinY, COreNetherConfig.sulfurMaxY);
	    }
	    if (COreNetherConfig.rubyMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 5, Blocks.netherrack, world, random, x, z, COreNetherConfig.rubyMin + random.nextInt(COreNetherConfig.rubyMax - COreNetherConfig.rubyMin), COreNetherConfig.rubyRarity, COreNetherConfig.rubyMinY, COreNetherConfig.rubyMaxY);
	    }
	    if (COreNetherConfig.sapphireMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 6, Blocks.netherrack, world, random, x, z, COreNetherConfig.sapphireMin + random.nextInt(COreNetherConfig.sapphireMax - COreNetherConfig.sapphireMin), COreNetherConfig.sapphireRarity, COreNetherConfig.sapphireMinY, COreNetherConfig.sapphireMaxY);
	    }
	    if (COreNetherConfig.amethystMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 7, Blocks.netherrack, world, random, x, z, COreNetherConfig.amethystMin + random.nextInt(COreNetherConfig.amethystMax - COreNetherConfig.amethystMin), COreNetherConfig.amethystRarity, COreNetherConfig.amethystMinY, COreNetherConfig.amethystMaxY);
	    }
	    if (COreNetherConfig.crystalMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 8, Blocks.netherrack, world, random, x, z, COreNetherConfig.crystalMin + random.nextInt(COreNetherConfig.crystalMax - COreNetherConfig.crystalMin), COreNetherConfig.crystalRarity, COreNetherConfig.crystalMinY, COreNetherConfig.crystalMaxY);
	    }
	    if (COreNetherConfig.mythianMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 9, Blocks.netherrack, world, random, x, z, COreNetherConfig.mythianMin + random.nextInt(COreNetherConfig.mythianMax - COreNetherConfig.mythianMin), COreNetherConfig.mythianRarity, COreNetherConfig.mythianMinY, COreNetherConfig.mythianMaxY);
	    }
	    if (COreNetherConfig.blackstoneMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 10, Blocks.netherrack, world, random, x, z, COreNetherConfig.blackstoneMin + random.nextInt(COreNetherConfig.blackstoneMax - COreNetherConfig.blackstoneMin), COreNetherConfig.blackstoneRarity, COreNetherConfig.blackstoneMinY, COreNetherConfig.blackstoneMaxY);
	    }
	    if (COreNetherConfig.bluestoneMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 11, Blocks.netherrack, world, random, x, z, COreNetherConfig.bluestoneMin + random.nextInt(COreNetherConfig.bluestoneMax - COreNetherConfig.bluestoneMin), COreNetherConfig.bluestoneRarity, COreNetherConfig.bluestoneMinY, COreNetherConfig.bluestoneMaxY);
	    }
	    if (COreNetherConfig.purplestoneMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 12, Blocks.netherrack, world, random, x, z, COreNetherConfig.purplestoneMin + random.nextInt(COreNetherConfig.purplestoneMax - COreNetherConfig.purplestoneMin), COreNetherConfig.purplestoneRarity, COreNetherConfig.purplestoneMinY, COreNetherConfig.purplestoneMaxY);
	    }
	    if (COreNetherConfig.iridiumMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 13, Blocks.netherrack, world, random, x, z, COreNetherConfig.iridiumMin + random.nextInt(COreNetherConfig.iridiumMax - COreNetherConfig.iridiumMin), COreNetherConfig.iridiumRarity, COreNetherConfig.iridiumMinY, COreNetherConfig.iridiumMaxY);
	    }
	    if (COreNetherConfig.arditeMax > 0) {
	      addOreSpawn(COreBlocks.metaOre3, 14, Blocks.netherrack, world, random, x, z, COreNetherConfig.arditeMin + random.nextInt(COreNetherConfig.arditeMax - COreNetherConfig.arditeMin), COreNetherConfig.arditeRarity, COreNetherConfig.arditeMinY, COreNetherConfig.arditeMaxY);
	    }
	  }
	
	public void addOreSpawn(Block block, int meta, Block target, World world, Random rand, int blockX, int blockZ, int vein, int chance, int minY, int maxY) {
		assert (maxY > minY) : "The maximum Y must be greater than the Minimum Y";
	    assert (minY > 0) : "addOreSpawn: The Minimum Y must be greater than 0";
	    assert ((maxY < 256) && (maxY > 0)) : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
	    if (vein > 64) {
	      vein = 64;
	    }
	    int diff = maxY - minY;
	    for (int x = 0; x < chance; x++)
	    {
	      int posX = blockX + rand.nextInt(16);
	      int posY = minY + rand.nextInt(diff);
	      int posZ = blockZ + rand.nextInt(16);
	      new WorldGenMinable(block, meta, vein, target).generate(world, rand, posX, posY, posZ);
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