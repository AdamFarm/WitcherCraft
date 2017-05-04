package gman.WitcherCraft;

import gman.WitcherCraft.items.ItemWitcherAmulet;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	public static ItemWitcherAmulet witcherAmulet;
	
	public static void init(){
		witcherAmulet= new ItemWitcherAmulet();
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		witcherAmulet.initModel();
	}
}
