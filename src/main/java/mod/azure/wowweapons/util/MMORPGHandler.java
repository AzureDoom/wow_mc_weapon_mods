package mod.azure.wowweapons.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.robertx22.mine_and_slash.config.compatible_items.OldConfigItem;
import com.robertx22.mine_and_slash.data_generation.compatible_items.CompatibleItem;
import com.robertx22.mine_and_slash.data_generation.compatible_items.CompatibleItemProvider;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.onevent.data_gen.providers.SlashDataProvider;

import mod.azure.wowweapons.config.Config;
import net.minecraft.data.DataGenerator;

public class MMORPGHandler {

	public static String ID = "compatible_items";

	public MMORPGHandler() {
	}

	@SuppressWarnings("rawtypes")
	public SlashDataProvider getDataPackCreator(DataGenerator gen) {
		return new CompatibleItemProvider(gen, getList(), ID);
	}

	public static List<CompatibleItem> getList() {
		List<String> SWORDS = Stream.of("wowweapons:thunderfury", "wowweapons:armageddon", "wowweapons:frostmourne",
				"wowweapons:ashbringer", "wowweapons:swordofathousandtruths").collect(Collectors.toList());

		List<String> STAFFS = Stream.of("wowweapons:marlis_touch", "wowweapons:touch_of_chaos", "wowweapons:doomfinger",
				"wowweapons:anzusscorn", "wowweapons:thoughtblighter").collect(Collectors.toList());

		List<CompatibleItem> items = new ArrayList<>();
		try {
			for (int type = 1; type <= 1; type++)
				switch (type) {
				case 1:
					for (String sword : SWORDS) {
						OldConfigItem config = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
								.setMinRarity(0).setSalvagable(true).setType(Sword.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id = sword;

						CompatibleItem neww = config.convertToNewFormat();
						neww.guid = id;
						neww.item_id = id;

						items.add(neww);
					}
				case 2:
					for (String staff : STAFFS) {
						OldConfigItem bowconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
								.setMinRarity(0).setSalvagable(true).setType(Staff.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id2 = staff;

						CompatibleItem staffs = bowconfig.convertToNewFormat();
						staffs.guid = id2;
						staffs.item_id = id2;

						items.add(staffs);
					}
				}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return items;
	}
}