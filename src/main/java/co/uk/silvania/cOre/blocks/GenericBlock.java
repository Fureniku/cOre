package co.uk.silvania.cOre.blocks;

import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IIconRegister;
import co.uk.silvania.cOre.COre;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GenericBlock extends BlockOre {

	public GenericBlock() {
		this.setCreativeTab(COre.tabMinerals);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon(COre.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
}