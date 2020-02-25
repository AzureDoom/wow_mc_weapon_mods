package mod.azure.wowweapons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.wowweapons.config.Config;
import mod.azure.wowweapons.util.LootHandler;
import mod.azure.wowweapons.util.MMORPGHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(WoWWeaponsMod.MODID)
public class WoWWeaponsMod {

	public static WoWWeaponsMod instance;
	public static final String MODID = "wowweapons";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public WoWWeaponsMod() {
		instance = this;
		ModLoadingContext modLoadingContext = ModLoadingContext.get();
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::enqueueIMC);
		modLoadingContext.registerConfig(ModConfig.Type.SERVER, Config.SERVER_SPEC, "wowweapons-config.toml");
		Config.loadConfig(Config.SERVER_SPEC,
				FMLPaths.CONFIGDIR.get().resolve("wowweapons-config.toml").toString());
	}

	private void setup(final FMLCommonSetupEvent event) {
		if (Config.SERVER.USE_CHESTLOOTSYSTEM.get()) {
			MinecraftForge.EVENT_BUS.register(new LootHandler());
		}
	}

	private void enqueueIMC(final InterModProcessEvent event) {
		if (ModList.get().isLoaded("mmorpg") && Config.SERVER.USE_COMPATIBILITY_ON_ITEMS.get()) {
			MinecraftForge.EVENT_BUS.register(new MMORPGHandler());
		}
	}
}