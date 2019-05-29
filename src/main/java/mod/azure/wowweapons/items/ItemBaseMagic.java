package mod.azure.wowweapons.items;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import electroblob.wizardry.item.ItemWand;
import mod.azure.wowweapons.WoWWeaponsMod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemBaseMagic extends ItemWand  {
	

	public ItemBaseMagic(String name, Tier tier, Element element) {
		super(tier, element);
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(WoWWeaponsMod.modid, name));
		this.setCreativeTab(WoWWeaponsMod.tab);
		this.tier = tier;
		this.element = element;
	}
	
	public String getTranslationKey(ItemStack stack) {
		return this.getTranslationKey();
	}

}