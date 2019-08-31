package mod.azure.wowweapons.items.normal;

import mod.azure.wowweapons.WoWWeaponsMod;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBaseSword extends ItemSword {

	public ItemBaseSword(String name, int damage) {
		super(EnumHelper.addToolMaterial(name, 1, 1561, 4F, damage, 4));
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(WoWWeaponsMod.modid, name));
		this.setCreativeTab(WoWWeaponsMod.tab);
		this.setHasSubtypes(true);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
}