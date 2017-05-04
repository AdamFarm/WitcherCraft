package gman.WitcherCraft.items;

import gman.WitcherCraft.WitcherCraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWitcherAmulet extends Item {
	
	public ItemWitcherAmulet(){
		setRegistryName("witcheramulet");
		setUnlocalizedName(WitcherCraft.MODID + ".witcheramulet");
		GameRegistry.register(this);
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

}
