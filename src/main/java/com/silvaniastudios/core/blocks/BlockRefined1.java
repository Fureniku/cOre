package com.silvaniastudios.core.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class BlockRefined1 extends BlockCore {
	
	public static final PropertyEnum<EnumMeta> BLOCK_NAME = PropertyEnum.create("refined_block_1", EnumMeta.class);
	
	public BlockRefined1(String name) {
		super(name, BLOCK_NAME, Material.IRON);
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		int meta = stack.getItemDamage();
		
		if (meta == 0) { return "copper_block"; }
		if (meta == 1) { return "tin_block"; }
		if (meta == 2) { return "zinc_block"; }
		if (meta == 3) { return "nickel_block"; }
		if (meta == 4) { return "silver_block"; }
		if (meta == 5) { return "aluminium_block"; }
		if (meta == 6) { return "titanium_block"; }
		if (meta == 7) { return "chromium_block"; }
		if (meta == 8) { return "silicon_block"; }
		if (meta == 9) { return "cobalt_block"; }
		if (meta == 10) { return "tungsten_block"; }
		if (meta == 11) { return "lead_block"; }
		if (meta == 12) { return "platinum_block"; }
		if (meta == 13) { return "lithium_block"; }
		if (meta == 14) { return "uranium_block"; }
		if (meta == 15) { return "plutonium_block"; }
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
