package co.uk.silvania.cOre;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import co.uk.silvania.cOre.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=COre.modid, name="cOre", version="1.1.0") 
public class COre {
	
	public static final String modid = "core";
	
	public static CreativeTabs tabMinerals = new CreativeTabs("tabMinerals") {

		@Override
		public Item getTabIconItem() {
			return new ItemStack(COreItems.itemOre, 1, 0).getItem();
		}
	};

	
    @Instance("cOre")
    public static COre instance;

    // Says where the client and server proxy code is loaded.
    @SidedProxy(clientSide="co.uk.silvania.cOre.client.ClientProxy", serverSide="co.uk.silvania.cOre.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {    	
    	COreOverWorldConfig.loadConfig(event);
    	
    	COreBlocks.init();
    	COreItems.init();
    }
    
	public static WorldGen worldGen = new WorldGen();
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
            proxy.init();
            GameRegistry.registerWorldGenerator(new WorldGen(), 1);
    }


	@EventHandler
    public void postInit(FMLPostInitializationEvent event) {
	}
}
