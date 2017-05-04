package gman.WitcherCraft.proxy;

import java.io.File;
import gman.WitcherCraft.Config;
import gman.WitcherCraft.ModItems;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public static Configuration config;
	
    public void preInit(FMLPreInitializationEvent e) {
    	
    	File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "modtut.cfg"));
        Config.readConfig();
        
        // Initialization of blocks and items typically goes here:
        //ModBlocks.init();
        ModItems.init();
        //ModCrafting.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {
    	 if (config.hasChanged()) {
             config.save();
         }
    }
}

