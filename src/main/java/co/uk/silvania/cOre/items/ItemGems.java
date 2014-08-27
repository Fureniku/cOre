package co.uk.silvania.cOre.items;

import java.util.List;

import co.uk.silvania.cOre.COre;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class ItemGems extends Item {

	public ItemGems() {
		super();
		this.setCreativeTab(COre.tabMinerals);
		this.setHasSubtypes(true);
	}
	
	private final static String[] NAMES = {
		"Ruby",
		"Sapphire",
		"Amethyst",
		"Crystal",
		"Mythian Nugget",
		"Iridium",
		"-",
		"-",
		"-",
		"-",
		"-",
		"-",
		"-",
		"-",
		"-",
		"-"
	};
	
	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		return NAMES[itemstack.getItemDamage()];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, NAMES.length);
		return super.getUnlocalizedName() + "." + NAMES[i];
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[NAMES.length];   
		for(int i = 0; i < icons.length; i++) {
			icons[i] = par1IconRegister.registerIcon(COre.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
    public IIcon getIconFromDamage(int meta){
        return this.icons[meta];
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tabs, List list) {
		for (int x = 0; x < NAMES.length; x++) {
			list.add(new ItemStack(this, 1, x));
		}
	}
}
