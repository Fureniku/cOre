package co.uk.silvania.cOre.blocks;

import java.util.List;

import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import co.uk.silvania.cOre.COre;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MetaOre extends BlockOre {

	public MetaOre() {
		this.setCreativeTab(COre.tabMinerals);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
		for (int i = 0; i < 16; i++) {
			list.add(new ItemStack(this, 1, i));
		}
	}
	
	@Override
	public boolean canSilkHarvest() {
		return false;
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@Override
	public int quantityDropped(int meta) {
		return 1;
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		icons = new IIcon[16];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = icon.registerIcon(COre.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_" + i);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[meta];
	}
}
