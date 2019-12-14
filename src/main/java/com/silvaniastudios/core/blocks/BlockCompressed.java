package com.silvaniastudios.core.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;

public class BlockCompressed extends BlockCore {
	
	public static final PropertyEnum<EnumMeta> BLOCK_NAME = PropertyEnum.create("compressed_block", EnumMeta.class);
	public ItemStack baseBlock;
	
	public BlockCompressed(String name, ItemStack baseBlock) {
		super(name, BLOCK_NAME, Material.IRON);
		if (baseBlock != null) {
			this.baseBlock = baseBlock;
		} else {
			this.baseBlock = new ItemStack(Blocks.STONE);
		}
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		int meta = stack.getItemDamage();
		
		if (meta == 0) { return "double"; }
		if (meta == 1) { return "triple"; }
		if (meta == 2) { return "quadruple"; }
		if (meta == 3) { return "quintuple"; }
		if (meta == 4) { return "sextuple"; }
		if (meta == 5) { return "septuple"; }
		if (meta == 6) { return "octuple"; }
		if (meta == 7) { return "nonuple"; }
		if (meta == 8) { return "decuple"; }
		if (meta == 9) { return "undecuple"; }
		if (meta == 10) { return "duodecuple"; }
		if (meta == 11) { return "teredecuple"; }
		if (meta == 12) { return "quattuordecuple"; }
		if (meta == 13) { return "quindecuple"; }
		if (meta == 14) { return "sexdecuple"; }
		if (meta == 15) { return "septendecuple"; }
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
	
	@Override
   	public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
