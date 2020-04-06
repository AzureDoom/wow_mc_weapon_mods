package mod.azure.wowweapons.items;

import mod.azure.wowweapons.WoWWeaponsMod;
import mod.azure.wowweapons.config.Config;
import mod.azure.wowweapons.util.WoWTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class WoWSword extends SwordItem {
	public WoWSword(String name) {
		super(ItemTier.DIAMOND, 5, 0F,
				new Item.Properties().group(WoWTabs.WoWItemGroup).maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()));
		this.setRegistryName(WoWWeaponsMod.MODID, name);
	}
}