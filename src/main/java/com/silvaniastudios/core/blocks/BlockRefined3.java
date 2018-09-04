package com.silvaniastudios.core.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class BlockRefined3 extends BlockCore {
	
	public static final PropertyEnum<EnumMeta> BLOCK_NAME = PropertyEnum.create("refined_block_2", EnumMeta.class);
	
	public BlockRefined3(String name) {
		super(name, BLOCK_NAME, Material.IRON);
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		int meta = stack.getItemDamage();
		
		if (meta == 0) { return "bronze_block"; }
		if (meta == 1) { return "cupronickel_block"; }
		if (meta == 2) { return "brass_block"; }
		if (meta == 3) { return "rosegold_block"; }
		if (meta == 4) { return "steel_block"; }
		if (meta == 5) { return "stainlesssteel_block"; }
		if (meta == 6) { return "nichrome_block"; }
		if (meta == 7) { return "electrum_block"; }
		if (meta == 8) { return "stellite_block"; }
		if (meta == 9) { return "silvamer_block"; }
		if (meta == 10) { return "unium_block"; }
		if (meta == 11) { return "fenikisite_block"; }
		if (meta == 12) { return "ultimite_block"; }
		if (meta == 13) { return "strootite_block"; }
		if (meta == 14) { return "speedoi_block"; }
		if (meta == 15) { return "legenite_block"; }
		return null;
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {BLOCK_NAME});
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(BLOCK_NAME, EnumMeta.byMetadata(meta));
    }
	
	@Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumMeta)state.getValue(BLOCK_NAME)).getMetadata();
    }
}
