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

public class ItemDusts extends Item {

	public ItemDusts() {
		super();
		this.setCreativeTab(COre.tabMinerals);
		this.setHasSubtypes(true);
	}
	
	private final static String[] NAMES = {
		/*0 */ "Copper",
		/*1 */ "Tin",
		/*2 */ "Zinc",
		/*3 */ "Nickel",
		/*4 */ "Silver",
		/*5 */ "Cobalt",
		/*6 */ "Titanium",
		/*7 */ "Chromium",
		/*8 */ "Manganese",
		/*9 */ "Cadmium",
		/*10*/ "Tungsten",
		/*11*/ "Lead",
		/*12*/ "Platinum",
		/*13*/ "Lithium",
		/*14*/ "Potassium",
		/*15*/ "Magnesium",
		/*16*/ "Calcium",
		/*17*/ "Lanathum",
		/*18*/ "Cerium",
		/*19*/ "Promethium",
		/*20*/ "Uranium",
		/*21*/ "Plutonium",
		/*22*/ "Technetium",
		/*23*/ "Tantalum",
		/*24*/ "Scandium",
		/*25*/ "Aluminium",
		/*26*/ "Gallium",
		/*27*/ "Indium",
		/*28*/ "Thallium",
		/*29*/ "Tecmonium",
		/*30*/ "Silvanite",
		/*31*/ "Mercilite",
		/*32*/ "Dragite",
		/*33*/ "Flarite",
		/*34*/ "Mythril",
		/*35*/ "Adamantite",
		/*36*/ "Sulfur",
		/*37*/ "Ruby",
		/*38*/ "Sapphire",
		/*39*/ "Amethyst",
		/*40*/ "Crystal",
		/*41*/ "Mythian",
		/*42*/ "Blackstone",
		/*43*/ "Bluestone",
		/*44*/ "Purplestone",
		/*45*/ "Iridium",
		/*46*/ "Ardite",
		/*47*/ "Calcite",
		/*48*/ "Graphite",
		/*49*/ "Limestone"
	};
	
	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		return NAMES[itemstack.getItemDamage()] + " Dust";
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
