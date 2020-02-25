package mod.azure.wowweapons.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

import mod.azure.wowweapons.WoWWeaponsMod;
import mod.azure.wowweapons.config.Config;

public class MMORPGHandler {

	public MMORPGHandler() {
		MineAndSlashAPI.addCompatibleItem(WoWWeaponsMod.MODID + ":marlis_touch",
				new ConfigItem().setType(Staff.INSTANCE).setSalvagable(true)
						.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem(WoWWeaponsMod.MODID + ":touch_of_chaos",
				new ConfigItem().setType(Staff.INSTANCE).setSalvagable(true)
						.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem(WoWWeaponsMod.MODID + ":doomfinger", new ConfigItem().setType(Staff.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem(WoWWeaponsMod.MODID + ":anzusscorn", new ConfigItem().setType(Staff.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem(WoWWeaponsMod.MODID + ":thoughtblighter",
				new ConfigItem().setType(Staff.INSTANCE).setSalvagable(true)
						.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		WoWWeaponsMod.LOGGER.info("Registered Staffs");
		MineAndSlashAPI.addCompatibleItem(WoWWeaponsMod.MODID + ":thunderfury", new ConfigItem().setType(Sword.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem(WoWWeaponsMod.MODID + ":armageddon", new ConfigItem().setType(Sword.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem(WoWWeaponsMod.MODID + ":frostmourne", new ConfigItem().setType(Sword.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem(WoWWeaponsMod.MODID + ":ashbringer", new ConfigItem().setType(Sword.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem(WoWWeaponsMod.MODID + ":swordofathousandtruths",
				new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true)
						.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		WoWWeaponsMod.LOGGER.info("Registered Swords");
	}
}