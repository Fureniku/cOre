package com.silvaniastudios.core.blocks;

import java.util.Random;

import com.silvaniastudios.core.config.AmethystConfig;
import com.silvaniastudios.core.config.BlackstoneConfig;
import com.silvaniastudios.core.config.BluestoneConfig;
import com.silvaniastudios.core.config.CrystalConfig;
import com.silvaniastudios.core.config.DragiteConfig;
import com.silvaniastudios.core.config.FlariteConfig;
import com.silvaniastudios.core.config.FureniumConfig;
import com.silvaniastudios.core.config.MagnesiumConfig;
import com.silvaniastudios.core.config.MerciliteConfig;
import com.silvaniastudios.core.config.MythianConfig;
import com.silvaniastudios.core.config.PhosphorusConfig;
import com.silvaniastudios.core.config.PurplestoneConfig;
import com.silvaniastudios.core.config.RubyConfig;
import com.silvaniastudios.core.config.SapphireConfig;
import com.silvaniastudios.core.config.SilvaniteConfig;
import com.silvaniastudios.core.config.SulfurConfig;
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

public class BlockOre2 extends BlockCore {
	
	public static final PropertyEnum<EnumMeta> META_ID = PropertyEnum.create("ore_block_2", EnumMeta.class);
	
	public BlockOre2(String name) {
		super(name, META_ID);
		this.setHarvestLevel("pickaxe", RubyConfig.properties.harvestLevel, getStateFromMeta(0));
		this.setHarvestLevel("pickaxe", SapphireConfig.properties.harvestLevel, getStateFromMeta(1));
		this.setHarvestLevel("pickaxe", AmethystConfig.properties.harvestLevel, getStateFromMeta(2));
		this.setHarvestLevel("pickaxe", CrystalConfig.properties.harvestLevel, getStateFromMeta(3));
		this.setHarvestLevel("pickaxe", MagnesiumConfig.properties.harvestLevel, getStateFromMeta(4));
		this.setHarvestLevel("pickaxe", PhosphorusConfig.properties.harvestLevel, getStateFromMeta(5));
		this.setHarvestLevel("pickaxe", SulfurConfig.properties.harvestLevel, getStateFromMeta(6));
		this.setHarvestLevel("pickaxe", SilvaniteConfig.properties.harvestLevel, getStateFromMeta(7));
		this.setHarvestLevel("pickaxe", MerciliteConfig.properties.harvestLevel, getStateFromMeta(8));
		this.setHarvestLevel("pickaxe", MythianConfig.properties.harvestLevel, getStateFromMeta(9));
		this.setHarvestLevel("pickaxe", DragiteConfig.properties.harvestLevel, getStateFromMeta(10));
		this.setHarvestLevel("pickaxe", FlariteConfig.properties.harvestLevel, getStateFromMeta(11));
		this.setHarvestLevel("pickaxe", FureniumConfig.properties.harvestLevel, getStateFromMeta(12));
		this.setHarvestLevel("pickaxe", BlackstoneConfig.properties.harvestLevel, getStateFromMeta(13));
		this.setHarvestLevel("pickaxe", BluestoneConfig.properties.harvestLevel, getStateFromMeta(14));
		this.setHarvestLevel("pickaxe", PurplestoneConfig.properties.harvestLevel, getStateFromMeta(15));
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
	public String getSpecialName(ItemStack stack) {
		int meta = stack.getItemDamage();
		
		if (meta == 0) { return "ruby"; }
		if (meta == 1) { return "sapphire"; }
		if (meta == 2) { return "amethyst"; }
		if (meta == 3) { return "crystal"; }
		if (meta == 4) { return "magnesium"; }
		if (meta == 5) { return "phosphorus"; }
		if (meta == 6) { return "sulfur"; }
		if (meta == 7) { return "silvanite"; }
		if (meta == 8) { return "mercilite"; }
		if (meta == 9) { return "mythian"; }
		if (meta == 10) { return "dragite"; }
		if (meta == 11) { return "flarite"; }
		if (meta == 12) { return "furenium"; }
		if (meta == 13) { return "blackstone"; }
		if (meta == 14) { return "bluestone"; }
		if (meta == 15) { return "purplestone"; }
		return null;
	}
	
	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		Random rand = world instanceof World ? ((World)world).rand : RANDOM;
		int meta = state.getValue(META_ID).getMetadata();
		
		if (meta == 0) { RubyConfig.Drops cfg = new RubyConfig.Drops(); 				processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 1) { SapphireConfig.Drops cfg = new SapphireConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 2) { AmethystConfig.Drops cfg = new AmethystConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 3) { CrystalConfig.Drops cfg = new CrystalConfig.Drops(); 			processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 4) { MagnesiumConfig.Drops cfg = new MagnesiumConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 5) { PhosphorusConfig.Drops cfg = new PhosphorusConfig.Drops(); 	processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 6) { SulfurConfig.Drops cfg = new SulfurConfig.Drops(); 			processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 7) { SilvaniteConfig.Drops cfg = new SilvaniteConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 8) { MerciliteConfig.Drops cfg = new MerciliteConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 9) { MythianConfig.Drops cfg = new MythianConfig.Drops(); 			processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 10) { DragiteConfig.Drops cfg = new DragiteConfig.Drops(); 			processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 11) { FlariteConfig.Drops cfg = new FlariteConfig.Drops(); 			processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 12) { FureniumConfig.Drops cfg = new FureniumConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 13) { BlackstoneConfig.Drops cfg = new BlackstoneConfig.Drops(); 	processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 14) { BluestoneConfig.Drops cfg = new BluestoneConfig.Drops(); 		processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }
		if (meta == 15) { PurplestoneConfig.Drops cfg = new PurplestoneConfig.Drops();	processDrops(drops, rand, state, fortune, cfg.canFortune, cfg.primaryDropQtyMax, cfg.primaryDropQtyMin, cfg.secondaryDropQtyMax, cfg.secondaryDropQtyMin,cfg.primaryDroppedItem, cfg.secondaryDroppedItem, cfg.primaryDropChance, cfg.secondaryDropChance); }

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
