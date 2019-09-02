package mod.azure.wowweapons.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

import net.minecraftforge.fml.common.Loader;

public class MMORPGHandler {

	public MMORPGHandler() {
		MineAndSlashAPI.addCompatibleItem("wowweapons:marlis_touch",
				new ConfigItem().setType(new Staff()).setMaxRarity(4).setMinRarity(4));
		MineAndSlashAPI.addCompatibleItem("wowweapons:touch_of_chaos",
				new ConfigItem().setType(new Staff()).setMaxRarity(4).setMinRarity(4));
		MineAndSlashAPI.addCompatibleItem("wowweapons:thoughtblighter",
				new ConfigItem().setType(new Staff()).setMaxRarity(2).setMinRarity(2));
		MineAndSlashAPI.addCompatibleItem("wowweapons:doomfinger",
				new ConfigItem().setType(new Staff()).setMaxRarity(4).setMinRarity(4));
		MineAndSlashAPI.addCompatibleItem("wowweapons:anzusscorn",
				new ConfigItem().setType(new Staff()).setMaxRarity(2).setMinRarity(2));
		MineAndSlashAPI.addCompatibleItem("wowweapons:thunderfury",
				new ConfigItem().setType(new Sword()).setMaxRarity(5).setMinRarity(5));
		MineAndSlashAPI.addCompatibleItem("wowweapons:armageddon",
				new ConfigItem().setType(new Sword()).setMaxRarity(4).setMinRarity(4));
		MineAndSlashAPI.addCompatibleItem("wowweapons:frostmourne",
				new ConfigItem().setType(new Sword()).setMaxRarity(5).setMinRarity(5));
		MineAndSlashAPI.addCompatibleItem("wowweapons:ashbringer",
				new ConfigItem().setType(new Sword()).setMaxRarity(5).setMinRarity(5));
		MineAndSlashAPI.addCompatibleItem("wowweapons:swordofathousandtruths",
				new ConfigItem().setType(new Sword()).setMaxRarity(5).setMinRarity(5));
	}
}
