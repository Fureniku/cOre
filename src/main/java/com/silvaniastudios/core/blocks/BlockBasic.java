package com.silvaniastudios.core.blocks;

import java.util.Random;

import com.google.common.collect.ImmutableList;
import com.silvaniastudios.core.COre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.DefaultStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBasic extends Block {
	
	protected String name;
	protected String primaryDrop;
	protected String secondaryDrop;
	protected int priMin;
	protected int priMax;
	protected int secMin;
	protected int secMax;
	protected int priChance;
	protected int secChance;
	protected boolean canFortune;

	
	public BlockBasic(String name, String pDrop, String sDrop, int pMin, int pMax, int sMin, int sMax, int pChance, int sChance, boolean ftn, float hardness) {
		super(Material.ROCK);
		this.setCreativeTab(COre.tabCOre);
		this.setHarvestLevel("pickaxe", 0);
		this.primaryDrop = pDrop;
		this.secondaryDrop = sDrop;
		this.priMin = pMin;
		this.priMax = pMax;
		this.secMin = sMin;
		this.secMax = sMax;
		this.priChance = pChance;
		this.secChance = sChance;
		this.canFortune = ftn;
		this.setHardness(hardness);
	}
	
	public void registerItemModel(Item itemBlock) {
		COre.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		Random rand = world instanceof World ? ((World)world).rand : RANDOM;
		if (!canFortune) { fortune = 0; }
		
        for (int i = 0; i < quantityDropped(state, fortune, rand); i++) {
            Item primaryItem = Item.getByNameOrId(primaryDrop);
            Item secondaryItem = Item.getByNameOrId(secondaryDrop);
            if (rand.nextInt(100) < priChance) {
            	int amt = rand.nextInt(priMax + 1);
            	if (amt < priMin) { amt = priMin; }
            	if (amt > priMax) { amt = priMax; }
            	if (primaryItem != null) { drops.add(new ItemStack(primaryItem, amt)); System.out.println("Dropping " + primaryItem);} else { System.out.println("primaryItem for " + state.toString() + " (" + primaryDrop + ") is NULL! Please check your configs and make sure this item really exists."); }
            }
            int rng = rand.nextInt(100);
            System.out.println("secondary chance: " + secChance + ", chance rolled: " + rng);
            if (rng < secChance) {
            	int amt = rand.nextInt(secMax + 1);
            	if (amt < secMin) { amt = secMin; }
            	if (amt > secMax) { amt = secMax; }
            	if (secondaryItem != null) { drops.add(new ItemStack(secondaryItem, amt)); System.out.println("Dropping " + secondaryItem); } else { System.out.println("secondaryItem for " + state.toString() + " (" + secondaryDrop + ") is NULL! Please check your configs and make sure this item really exists."); }
            }
        }
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel() {
		StateMapperBase b = new DefaultStateMapper();
		BlockStateContainer bsc = this.getBlockState();
		ImmutableList<IBlockState> values = bsc.getValidStates();
		
		for(IBlockState state : values) {
			ModelResourceLocation mrl = new ModelResourceLocation(state.getBlock().getRegistryName(), b.getPropertyString(state.getProperties()));
			
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(state.getBlock()), this.getMetaFromState(state), mrl);
		}
	}
}
