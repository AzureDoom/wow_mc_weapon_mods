package mod.azure.wowweapons.configs;

import com.robertx22.config.non_mine_items.ConfigItem;

public class Level80ConfigItem extends ConfigItem {

	public Level80ConfigItem() {
		this.itemLevelIfDoesntUsePlayerLevel = 80;
		this.itemIsPlayerLevel = false;
	}
}