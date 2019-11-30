package mod.azure.wowweapons.util;

import mod.azure.wowweapons.WoWWeaponsMod;
import mod.azure.wowweapons.items.StaffItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Register {

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				WoWItems.wow_thunderfury = new SwordItem(WoWToolMaterials.wowweapons, 0, 6.0f,
						new Item.Properties().group(WoWTabs.WoWItemGroup)).setRegistryName(location("thunderfury")),
				WoWItems.wow_armageddon = new SwordItem(WoWToolMaterials.wowweapons, 0, 6.0f,
						new Item.Properties().group(WoWTabs.WoWItemGroup)).setRegistryName(location("armageddon")),
				WoWItems.wow_frostmourne = new SwordItem(WoWToolMaterials.wowweapons, 0, 6.0f,
						new Item.Properties().group(WoWTabs.WoWItemGroup)).setRegistryName(location("frostmourne")),
				WoWItems.wow_ashbringer = new SwordItem(WoWToolMaterials.wowweapons, 0, 6.0f,
						new Item.Properties().group(WoWTabs.WoWItemGroup)).setRegistryName(location("ashbringer")),
				WoWItems.wow_swordofathousandtruths = new SwordItem(WoWToolMaterials.wowweapons, 0, 6.0f,
						new Item.Properties().group(WoWTabs.WoWItemGroup))
								.setRegistryName(location("swordofathousandtruths")),
				WoWItems.wow_marlis_touch = new StaffItem(new Item.Properties().group(WoWTabs.WoWItemGroup), 0)
						.setRegistryName(location("marlis_touch")),
				WoWItems.wow_touch_of_chaos = new StaffItem(new Item.Properties().group(WoWTabs.WoWItemGroup), 0)
						.setRegistryName(location("touch_of_chaos")),
				WoWItems.wow_doomfinger = new StaffItem(new Item.Properties().group(WoWTabs.WoWItemGroup), 0)
						.setRegistryName(location("doomfinger")),
				WoWItems.wow_anzusscorn = new StaffItem(new Item.Properties().group(WoWTabs.WoWItemGroup), 0)
						.setRegistryName(location("anzusscorn")));

		WoWWeaponsMod.LOGGER.info("All Items registered.");
	}

	public static ResourceLocation location(String name) {
		return new ResourceLocation(WoWWeaponsMod.MODID, name);
	}
}