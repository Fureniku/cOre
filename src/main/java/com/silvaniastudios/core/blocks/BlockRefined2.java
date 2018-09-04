package com.silvaniastudios.core.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class BlockRefined2 extends BlockCore {
	
	public static final PropertyEnum<EnumMeta> BLOCK_NAME = PropertyEnum.create("refined_block_2", EnumMeta.class);
	
	public BlockRefined2(String name) {
		super(name, BLOCK_NAME, Material.IRON);
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		int meta = stack.getItemDamage();
		
		if (meta == 0) { return "ruby_block"; }
		if (meta == 1) { return "sapphire_block"; }
		if (meta == 2) { return "amethyst_block"; }
		if (meta == 3) { return "crystal_block"; }
		if (meta == 4) { return "magnesium_block"; }
		if (meta == 5) { return "phosphorus_block"; }
		if (meta == 6) { return "sulfur_block"; }
		if (meta == 7) { return "silvanite_block"; }
		if (meta == 8) { return "mercilite_block"; }
		if (meta == 9) { return "mythian_block"; }
		if (meta == 10) { return "dragite_block"; }
		if (meta == 11) { return "flarite_block"; }
		if (meta == 12) { return "furenium_block"; }
		if (meta == 13) { return "blackstone_block"; }
		if (meta == 14) { return "bluestone_block"; }
		if (meta == 15) { return "purplestone_block"; }
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
