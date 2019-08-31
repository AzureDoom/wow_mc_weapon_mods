package mod.azure.wowweapons.items.mineandslash;

import com.robertx22.items.gearitems.weapons.ItemStaff;

import mod.azure.wowweapons.WoWWeaponsMod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class MSStaff extends ItemStaff {

	public MSStaff(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(WoWWeaponsMod.modid, name));
		this.setCreativeTab(WoWWeaponsMod.tab);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
}