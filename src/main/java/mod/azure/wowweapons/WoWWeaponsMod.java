package mod.azure.wowweapons;

import java.util.ArrayList;
import java.util.List;

import mod.azure.wowweapons.proxy.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = WoWWeaponsMod.modid, version = WoWWeaponsMod.version, dependencies = "after:mmorpg;required-after:forge@[14.23.5.2768,)")
public class WoWWeaponsMod {

	public static final String modid = "wowweapons";
	public static final String MODNAME = "World of Warcraft Weapons";
	public static final String version = "0.0.1";
	
	@SidedProxy(clientSide = "mod.azure.wowweapons.proxy.ClientProxy", serverSide = "mod.azure.wowweapons.proxy.CommonProxy")
    public static CommonProxy proxy;

	public static CreativeTabs tab = new Tab(modid);

	@Mod.Instance
	public static WoWWeaponsMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit();
	}
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();
        if(Loader.isModLoaded("mmorpg")) {
        	MMORPGHandler.registerMMORPG();
        }
    }  
}