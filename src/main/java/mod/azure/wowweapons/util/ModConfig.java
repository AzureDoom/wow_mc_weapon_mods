package mod.azure.wowweapons.util;

import mod.azure.wowweapons.WoWWeaponsMod;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = WoWWeaponsMod.modid)
@Config.LangKey("wowweapons.config.title")
public class ModConfig {

	@Config.Name("Default Mine and Slash Stats")
	@Config.Comment("Auto Compat with Mine and Slash")
	public static boolean USE_COMPATIBILITY_ITEMS = true;

	@Mod.EventBusSubscriber(modid = WoWWeaponsMod.modid)
	private static class EventHandler {

		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(WoWWeaponsMod.modid)) {
				ConfigManager.sync(WoWWeaponsMod.modid, Config.Type.INSTANCE);
			}
		}
	}
}
