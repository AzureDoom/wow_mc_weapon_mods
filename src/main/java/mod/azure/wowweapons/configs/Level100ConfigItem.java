package mod.azure.wowweapons.configs;

import com.robertx22.config.non_mine_items.ConfigItem;

public class Level100ConfigItem extends ConfigItem {
	
	public Level100ConfigItem() {
		this.itemLevelIfDoesntUsePlayerLevel = 100;
		this.itemIsPlayerLevel = false;
	}
}
