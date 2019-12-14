package com.silvaniastudios.core.blocks;

import java.util.Random;

import com.silvaniastudios.core.config.AluminiumConfig;
import com.silvaniastudios.core.config.ChromiumConfig;
import com.silvaniastudios.core.config.CobaltConfig;
import com.silvaniastudios.core.config.CopperConfig;
import com.silvaniastudios.core.config.LeadConfig;
import com.silvaniastudios.core.config.LithiumConfig;
import com.silvaniastudios.core.config.NickelConfig;
import com.silvaniastudios.core.config.PlatinumConfig;
import com.silvaniastudios.core.config.PlutoniumConfig;
import com.silvaniastudios.core.config.SiliconConfig;
import com.silvaniastudios.core.config.SilverConfig;
import com.silvaniastudios.core.config.TinConfig;
import com.silvaniastudios.core.config.TitaniumConfig;
import com.silvaniastudios.core.config.TungstenConfig;
import com.silvaniastudios.core.config.UraniumConfig;
import com.silvaniastudios.core.config.ZincConfig;
import com.silvaniastudios.core.config._COreConfig;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockOre1 extends BlockCore {
	
	public static final PropertyEnum<EnumMeta> META_ID = PropertyEnum.create("ore_block_1", EnumMeta.class);
	
	public BlockOre1(String name) {
		super(name, META_ID);
		this.setHarvestLevel("pickaxe", CopperConfig.properties.harvestLevel, getStateFromMeta(0));
		this.setHarvestLevel("pickaxe", TinConfig.properties.harvestLevel, getStateFromMeta(1));
		this.setHarvestLevel("pickaxe", ZincConfig.properties.harvestLevel, getStateFromMeta(2));
		this.setHarvestLevel("pickaxe", NickelConfig.properties.harvestLevel, getStateFromMeta(3));
		this.setHarvestLevel("pickaxe", SilverConfig.properties.harvestLevel, getStateFromMeta(4));
		this.setHarvestLevel("pickaxe", AluminiumConfig.properties.harvestLevel, getStateFromMeta(5));
		this.setHarvestLevel("pickaxe", TitaniumConfig.properties.harvestLevel, getStateFromMeta(6));
		this.setHarvestLevel("pickaxe", ChromiumConfig.properties.harvestLevel, getStateFromMeta(7));
		this.setHarvestLevel("pickaxe", SiliconConfig.properties.harvestLevel, getStateFromMeta(8));
		this.setHarvestLevel("pickaxe", CobaltConfig.properties.harvestLevel, getStateFromMeta(9));
		this.setHarvestLevel("pickaxe", TungstenConfig.properties.harvestLevel, getStateFromMeta(10));
		this.setHarvestLevel("pickaxe", LeadConfig.properties.harvestLevel, getStateFromMeta(11));
		this.setHarvestLevel("pickaxe", PlatinumConfig.properties.harvestLevel, getStateFromMeta(12));
		this.setHarvestLevel("pickaxe", LithiumConfig.properties.harvestLevel, getStateFromMeta(13));
		this.setHarvestLevel("pickaxe", UraniumConfig.properties.harvestLevel, getStateFromMeta(14));
		this.setHarvestLevel("pickaxe", PlutoniumConfig.properties.harvestLevel, getStateFromMeta(15));
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		int meta = stack.getItemDamage();
		
		if (meta == 0) { return "copper"; }
		if (meta == 1) { return "tin"; }
		if (meta == 2) { return "zinc"; }
		if (meta == 3) { return "nickel"; }
		if (meta == 4) { return "silver"; }
		if (meta == 5) { return "aluminium"; }
		if (meta == 6) { return "titanium"; }
		if (meta == 7) { return "chromium"; }
		if (meta == 8) { return "silicon"; }
		if (meta == 9) { return "cobalt"; }
		if (meta == 10) { return "tungsten"; }
		if (meta == 11) { return "lead"; }
		if (meta == 12) { return "platinum"; }
		if (meta == 13) { return "lithium"; }
		if (meta == 14) { return "uranium"; }
		if (meta == 15) { return "plutonium"; }
		return null;
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {META_ID});
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(META_ID, EnumMeta.byMetadata(meta));
    }
	
	@Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumMeta)state.getValue(META_ID)).getMetadata();
    }
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		Random rand = world instanceof World ? ((World)world).rand : RANDOM;
		int meta = state.getValue(META_ID).getMetadata();
		
		if (meta == 0) { CopperConfig.Drops cfg = new CopperConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 1) { TinConfig.Drops cfg = new TinConfig.Drops(); 				processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 2) { ZincConfig.Drops cfg = new ZincConfig.Drops(); 			processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 3) { NickelConfig.Drops cfg = new NickelConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 4) { SilverConfig.Drops cfg = new SilverConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 5) { AluminiumConfig.Drops cfg = new AluminiumConfig.Drops();	processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 6) { TitaniumConfig.Drops cfg = new TitaniumConfig.Drops(); 	processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 7) { ChromiumConfig.Drops cfg = new ChromiumConfig.Drops(); 	processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 8) { SiliconConfig.Drops cfg = new SiliconConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 9) { CobaltConfig.Drops cfg = new CobaltConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 10) { TungstenConfig.Drops cfg = new TungstenConfig.Drops(); 	processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 11) { LeadConfig.Drops cfg = new LeadConfig.Drops(); 			processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 12) { PlatinumConfig.Drops cfg = new PlatinumConfig.Drops(); 	processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 13) { LithiumConfig.Drops cfg = new LithiumConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 14) { UraniumConfig.Drops cfg = new UraniumConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 15) { PlutoniumConfig.Drops cfg = new PlutoniumConfig.Drops();	processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }

    }
	
	@Override
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return _COreConfig.general.silkTouchOres;
    }
	
	@Override
   	public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
