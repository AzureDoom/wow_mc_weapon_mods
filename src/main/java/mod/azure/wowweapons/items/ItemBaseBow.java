package mod.azure.wowweapons.items;

import mod.azure.wowweapons.WoWWeaponsMod;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemBaseBow extends ItemBow {

	public ItemBaseBow(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(WoWWeaponsMod.modid, name));
		this.setCreativeTab(WoWWeaponsMod.tab);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
}