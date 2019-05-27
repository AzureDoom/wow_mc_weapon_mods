package mod.azure.wowweapons;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

import net.minecraftforge.fml.common.Loader;

public class MMORPGHandler {

	public static void registerMMORPG() {
		MineAndSlashAPI.addCompatibleItem("wowweapons:marlis_touch", new ConfigItem().setType(new Staff()));
		MineAndSlashAPI.addCompatibleItem("wowweapons:touch_of_chaos", new ConfigItem().setType(new Staff()));
		MineAndSlashAPI.addCompatibleItem("wowweapons:thoughtblighter", new ConfigItem().setType(new Staff()));
		MineAndSlashAPI.addCompatibleItem("wowweapons:doomfinger", new ConfigItem().setType(new Staff()));
		MineAndSlashAPI.addCompatibleItem("wowweapons:anzusscorn", new ConfigItem().setType(new Staff()));
		MineAndSlashAPI.addCompatibleItem("wowweapons:thunderfury", new ConfigItem().setType(new Sword()));
	}
}
