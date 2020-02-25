package mod.azure.wowweapons.util;

import mod.azure.wowweapons.WoWWeaponsMod;
import mod.azure.wowweapons.config.Config;
import mod.azure.wowweapons.items.StaffItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

public class WoWItems {
	public static Item thunderfury;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(
					thunderfury = new SwordItem(ItemTier.DIAMOND, 0, 6.0f,
							new Item.Properties().group(WoWTabs.WoWItemGroup)).setRegistryName(location("thunderfury")),
					new SwordItem(ItemTier.DIAMOND, 0, 6.0f,
							new Item.Properties().group(WoWTabs.WoWItemGroup)
									.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
											.setRegistryName(location("armageddon")),
					new SwordItem(ItemTier.DIAMOND, 0, 6.0f,
							new Item.Properties().group(WoWTabs.WoWItemGroup)
									.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
											.setRegistryName(location("frostmourne")),
					new SwordItem(ItemTier.DIAMOND, 0, 6.0f,
							new Item.Properties().group(WoWTabs.WoWItemGroup)
									.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
											.setRegistryName(location("ashbringer")),
					new SwordItem(ItemTier.DIAMOND, 0, 6.0f,
							new Item.Properties().group(WoWTabs.WoWItemGroup)
									.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
											.setRegistryName(location("swordofathousandtruths")));
			if (ModList.get().isLoaded("mmorpg")) {
				event.getRegistry().registerAll(
						new StaffItem(new Item.Properties().group(WoWTabs.WoWItemGroup)
								.maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get()), 0)
										.setRegistryName(location("marlis_touch")),
						new StaffItem(new Item.Properties().group(WoWTabs.WoWItemGroup)
								.maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get()), 0)
										.setRegistryName(location("touch_of_chaos")),
						new StaffItem(new Item.Properties().group(WoWTabs.WoWItemGroup)
								.maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get()), 0)
										.setRegistryName(location("doomfinger")),
						new StaffItem(new Item.Properties().group(WoWTabs.WoWItemGroup)
								.maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get()), 0)
										.setRegistryName(location("anzusscorn")),
						new StaffItem(new Item.Properties().group(WoWTabs.WoWItemGroup)
								.maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get()), 0)
										.setRegistryName(location("thoughtblighter")));
			} else {
				event.getRegistry().registerAll(
						new BowItem(new Item.Properties().group(WoWTabs.WoWItemGroup)
								.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()))
										.setRegistryName(location("marlis_touch")),
						new BowItem(new Item.Properties().group(WoWTabs.WoWItemGroup)
								.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()))
										.setRegistryName(location("touch_of_chaos")),
						new BowItem(new Item.Properties().group(WoWTabs.WoWItemGroup)
								.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get())).setRegistryName(location("doomfinger")),
						new BowItem(new Item.Properties().group(WoWTabs.WoWItemGroup)
								.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()))
										.setRegistryName(location("thoughtblighter")),
						new BowItem(new Item.Properties().group(WoWTabs.WoWItemGroup)
								.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get())).setRegistryName(location("anzusscorn")));
			}
		}

		public static ResourceLocation location(String name) {
			return new ResourceLocation(WoWWeaponsMod.MODID, name);
		}
	}
}