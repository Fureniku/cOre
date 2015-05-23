package co.uk.silvania.cOre.fluids;

import co.uk.silvania.cOre.COre;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemBucket;

public class TarBucket extends ItemBucket {

	public TarBucket(Block fluid) {
		super(fluid);
		this.setCreativeTab(COre.tabMinerals);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister icon) {
		itemIcon = icon.registerIcon(COre.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
