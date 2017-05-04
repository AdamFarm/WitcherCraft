package gman.WitcherCraft.proxy;

import gman.WitcherCraft.ModItems;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        // Typically initialization of models and such goes here:
        //ModRenderers.preInit();
    }
}
