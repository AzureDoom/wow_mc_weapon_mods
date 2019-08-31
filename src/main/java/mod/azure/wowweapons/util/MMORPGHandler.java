package mod.azure.wowweapons.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

import mod.azure.wowweapons.configs.Level100ConfigItem;
import mod.azure.wowweapons.configs.Level2ConfigItem;
import mod.azure.wowweapons.configs.Level57ConfigItem;
import mod.azure.wowweapons.configs.Level60ConfigItem;
import mod.azure.wowweapons.configs.Level80ConfigItem;
import net.minecraftforge.fml.common.Loader;

public class MMORPGHandler {

	public MMORPGHandler() {
		MineAndSlashAPI.addCompatibleItem("wowweapons:marlis_touch",
				new Level60ConfigItem().setType(new Staff()).setMaxRarity(4).setMinRarity(4));
		MineAndSlashAPI.addCompatibleItem("wowweapons:touch_of_chaos",
				new Level60ConfigItem().setType(new Staff()).setMaxRarity(4).setMinRarity(4));
		MineAndSlashAPI.addCompatibleItem("wowweapons:thoughtblighter",
				new Level60ConfigItem().setType(new Staff()).setMaxRarity(2).setMinRarity(2));
		MineAndSlashAPI.addCompatibleItem("wowweapons:doomfinger",
				new Level60ConfigItem().setType(new Staff()).setMaxRarity(4).setMinRarity(4));
		MineAndSlashAPI.addCompatibleItem("wowweapons:anzusscorn",
				new ConfigItem().setType(new Staff()).setMaxRarity(2).setMinRarity(2));
		MineAndSlashAPI.addCompatibleItem("wowweapons:thunderfury",
				new Level57ConfigItem().setType(new Sword()).setMaxRarity(5).setMinRarity(5));
		MineAndSlashAPI.addCompatibleItem("wowweapons:armageddon",
				new Level100ConfigItem().setType(new Sword()).setMaxRarity(4).setMinRarity(4));
		MineAndSlashAPI.addCompatibleItem("wowweapons:frostmourne",
				new Level80ConfigItem().setType(new Sword()).setMaxRarity(5).setMinRarity(5));
		MineAndSlashAPI.addCompatibleItem("wowweapons:ashbringer",
				new Level100ConfigItem().setType(new Sword()).setMaxRarity(5).setMinRarity(5));
		MineAndSlashAPI.addCompatibleItem("wowweapons:swordofathousandtruths",
				new Level2ConfigItem().setType(new Sword()).setMaxRarity(5).setMinRarity(5));
	}
}
