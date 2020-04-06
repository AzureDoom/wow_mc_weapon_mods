package mod.azure.wowweapons.items;

import mod.azure.wowweapons.WoWWeaponsMod;
import mod.azure.wowweapons.config.Config;
import mod.azure.wowweapons.util.WoWTabs;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;

public class WoWBow extends BowItem {

	public WoWBow(String name) {
		super(new Item.Properties().group(WoWTabs.WoWItemGroup).maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()));
		this.setRegistryName(WoWWeaponsMod.MODID, name);
	}
}