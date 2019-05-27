package mod.azure.wowweapons.items;

import mod.azure.wowweapons.IMultiType;
import mod.azure.wowweapons.WoWWeaponsMod;
import mod.azure.wowweapons.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemBaseSword extends ItemSword implements IMultiType {
	private final int maxTypes;

	public ItemBaseSword(String name, int maxTypes) {
		super(EnumHelper.addToolMaterial(name, 1, 0, 4F, 8, 4));
		this.maxTypes = maxTypes;
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(WoWWeaponsMod.modid, name));
		this.setCreativeTab(WoWWeaponsMod.tab);
		this.setHasSubtypes(true);
	}

	public int getMaxTypes() {
		return this.maxTypes;
	}

	public int getType(ItemStack stack) {
		return stack.getItemDamage() + 1;
	}
	
	@Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> variants) {
		if (this.isInCreativeTab(tab)) {
			for (int meta = 0; meta < this.getMaxTypes(); meta++) {
				variants.add(new ItemStack(this, 1, meta));
			}
		}
	}
	
	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
}