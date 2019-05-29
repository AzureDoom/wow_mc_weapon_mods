package mod.azure.wowweapons.configs;

import com.robertx22.config.non_mine_items.ConfigItem;

public class Level60ConfigItem extends ConfigItem {

	public Level60ConfigItem() {
		this.itemLevelIfDoesntUsePlayerLevel = 60;
		this.itemIsPlayerLevel = false;
	}
}
