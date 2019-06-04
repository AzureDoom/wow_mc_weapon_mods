package mod.azure.wowweapons.items;

import mod.azure.wowweapons.WoWWeaponsMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemBaseHelmet extends ItemArmor {

	public ItemBaseHelmet(String name, ArmorMaterial material, EntityEquipmentSlot equipmentSlot) {
		super(material, 0, equipmentSlot);
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(WoWWeaponsMod.modid, name));
		this.setCreativeTab(WoWWeaponsMod.tab);
	}
	
	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

}