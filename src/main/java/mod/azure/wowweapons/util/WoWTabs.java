package mod.azure.wowweapons.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class WoWTabs {

	public static final ItemGroup WoWItemGroup = (new ItemGroup("wowweapons") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(WoWItems.thunderfury);
		}

		public boolean hasSearchBar() {
			return true;
		}
	}).setBackgroundImageName("item_search.png");
}