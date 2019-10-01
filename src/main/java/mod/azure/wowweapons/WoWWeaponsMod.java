package mod.azure.wowweapons;

import mod.azure.wowweapons.proxy.CommonProxy;
import mod.azure.wowweapons.util.LootHandler;
import mod.azure.wowweapons.util.MMORPGHandler;
import mod.azure.wowweapons.util.ModConfig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = WoWWeaponsMod.modid, version = WoWWeaponsMod.version, dependencies = WoWWeaponsMod.dependencies)
public class WoWWeaponsMod {

	public static final String modid = "wowweapons";
	public static final String MODNAME = "World of Warcraft Weapons";
	public static final String version = "0.0.7";
	public static final String dependencies = "required-after:ebwizardry;required-after:mmorpg";

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
		MinecraftForge.EVENT_BUS.register(new LootHandler());
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit();
		if (ModConfig.USE_COMPATIBILITY_ITEMS) {
			if (Loader.isModLoaded("mmorpg")) {
				MinecraftForge.EVENT_BUS.register(new MMORPGHandler());
			}
		}
	}
}