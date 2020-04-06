package mod.azure.wowweapons.util;

import mod.azure.wowweapons.WoWWeaponsMod;
import mod.azure.wowweapons.items.WoWBow;
import mod.azure.wowweapons.items.WoWSword;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class WoWItems {
	public static Item tabicon;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(new WoWSword("thunderfury"), new WoWSword("armageddon"),
					new WoWSword("frostmourne"), new WoWSword("ashbringer"), new WoWSword("ashbringercorrupt"),
					new WoWSword("zinrokhdestroyerofworlds"), new WoWSword("sickleofunyieldingstrength"),
					new WoWSword("qirajisacrificialdagger"), new WoWSword("obsidianedgedblade"),
					new WoWSword("highwarlordsgreatsword"), new WoWSword("deathssting"),
					new WoWSword("daggerofveiledshadows"), tabicon = new WoWSword("sulfurashandofragnaros"),
					new WoWSword("swordofathousandtruths"), new WoWBow("marlis_touch"), new WoWBow("touch_of_chaos"),
					new WoWBow("doomfinger"), new WoWBow("thoughtblighter"), new WoWBow("anzusscorn"));
		}

		public static ResourceLocation location(String name) {
			return new ResourceLocation(WoWWeaponsMod.MODID, name);
		}
	}
}