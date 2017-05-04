package gman.WitcherCraft;


import org.apache.logging.log4j.Logger;

import gman.WitcherCraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = WitcherCraft.MODID, name = WitcherCraft.NAME, version = WitcherCraft.VERSION, dependencies = "after:forge@[11.16.0.1865,)", useMetadata = true)
public class WitcherCraft {
	
	public static final String MODID = "wc";
	public static final String VERSION= "0.0.1";
	public static final String NAME = "Witcher Craft";
	
	@SidedProxy(clientSide = "gman.WitcherCraft.proxy.ClientProxy", serverSide = "gman.WitcherCraft.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance
	public static WitcherCraft instance;
	
	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		logger = event.getModLog();		
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}
}
