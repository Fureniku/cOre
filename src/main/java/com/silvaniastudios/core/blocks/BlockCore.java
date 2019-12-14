package com.silvaniastudios.core.blocks;

import java.util.Random;

import com.google.common.collect.ImmutableList;
import com.silvaniastudios.core.COre;
import com.silvaniastudios.core.IMetaBlockName;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.DefaultStateMapper;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCore extends Block implements IMetaBlockName {
	
	protected String name;
	public static PropertyEnum<EnumMeta> enumMeta;
	
	public BlockCore(String name, PropertyEnum<EnumMeta> enumMeta) {
		this(name, enumMeta, Material.ROCK);
	}
	
	public BlockCore(String name, PropertyEnum<EnumMeta> enumMeta, Material mat) {
		super(mat);
		this.name = name;
		BlockCore.enumMeta = enumMeta;
		
		setUnlocalizedName(COre.MODID + "." + name);
		setRegistryName(name);
		setCreativeTab(COre.tabCOre);
		setDefaultState(this.blockState.getBaseState().withProperty(enumMeta, EnumMeta.id0));
		this.setHardness(3.0F);
	}
	
	//Empty constructor for instancing this class to use methods elsewhere.
	public BlockCore() {
		super(Material.AIR);
	}
	
	public void registerItemModel(Item itemBlock) {
		COre.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
    
	@Override
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items) {
        for (EnumMeta ores: EnumMeta.values()) {
            items.add(new ItemStack(this, 1, ores.getMetadata()));
        }
    }
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(state.getBlock(), 1, this.getMetaFromState(state));
    }

	@Override
	public String getSpecialName(ItemStack stack) {
		return null;
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
		
	public void processDrops(NonNullList<ItemStack> drops, Random rand, IBlockState state, int fortune, boolean canFortune, int priMax, int priMin, int secMax, int secMin, String priItem, String secItem, int priChance, int secChance) {
		int fortuneBonus = getFortuneBonus(canFortune, fortune, rand);
		
    	int priMeta = 0;
    	String primaryName = priItem;
    	if (priItem.matches("^.*\\d$")) {
    		priMeta = Integer.parseInt(priItem.substring(priItem.lastIndexOf(":") + 1));
        	primaryName = priItem.substring(0, priItem.lastIndexOf(":"));
    	}
    	
    	int secMeta = 0;
    	String secondaryName = secItem;
    	if (secItem.matches("^.*\\d$")) {
    		secMeta = Integer.parseInt(secItem.substring(secItem.lastIndexOf(":") + 1));
        	secondaryName = secItem.substring(0, secItem.lastIndexOf(":"));
    	}
    	
        Item primaryItem = Item.getByNameOrId(primaryName);
        Item secondaryItem = Item.getByNameOrId(secondaryName);
        
        COre.debug(2, "Starting drops for " + priItem + " (with chance of " + secItem + "). Primary chance: " + priChance + ", secondary chance: " + secChance);
        
        int priRng = rand.nextInt(100);
        if (priRng < priChance) {
        	int amt = rand.nextInt(priMax + 1);
        	if (amt < priMin) { amt = priMin; }
        	if (amt > priMax) { amt = priMax; }
        	if (primaryItem != null) {
        		drops.add(new ItemStack(primaryItem, amt+fortuneBonus, priMeta));
        	} else {
        		System.out.println("primaryItem for " + state.toString() + " (" + priItem + ") is NULL! Please check your configs and make sure this item really exists.");
        	}
        	COre.debug(2, "Primary drop: " + primaryItem.getItemStackDisplayName(new ItemStack(primaryItem)) + " x " + (amt+fortuneBonus));
        } else {
        	COre.debug(2, "Primary drop chance not reached (" + priRng + " is greater than " + priChance + ")");
        }
        int secRng = rand.nextInt(100);
        if (secRng < secChance) {
        	int amt = rand.nextInt(secMax + 1);
        	if (amt < secMin) { amt = secMin; }
        	if (amt > secMax) { amt = secMax; }
        	if (secondaryItem != null) {
        		drops.add(new ItemStack(secondaryItem, amt+fortuneBonus, secMeta));
        		COre.debug(2, "Secondary drop: " + secondaryItem.getItemStackDisplayName(new ItemStack(secondaryItem)) + " x " + (amt+fortuneBonus));
        	} else {
        		System.out.println("secondaryItem for " + state.toString() + " (" + secItem + ") is NULL! Please check your configs and make sure this item really exists.");
        	}
        	
        } else {
        	COre.debug(2, "Secondary drop chance not reached (" + secRng + " is greater than " + secChance + ")");
        }
	}
	
	public int getFortuneBonus(boolean canFortune, int fortuneLevel, Random rand) {
		if (!canFortune || fortuneLevel <= 0) {
			return 0;
		}
		int bonus = rand.nextInt(fortuneLevel + 2) - 1;
		if (bonus <= 0) {
			return 1;
		}
		return bonus;
	}
}
