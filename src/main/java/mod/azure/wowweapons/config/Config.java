package mod.azure.wowweapons.config;

import java.io.File;

import org.apache.commons.lang3.tuple.Pair;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import mod.azure.wowweapons.WoWWeaponsMod;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class Config {

	public static final ServerConfig SERVER;
	public static final ForgeConfigSpec SERVER_SPEC;

	static {
		final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
		SERVER_SPEC = specPair.getRight();
		SERVER = specPair.getLeft();
	}

	public static class ServerConfig {
		public final BooleanValue USE_COMPATIBILITY_ON_ITEMS;
		public final BooleanValue USE_CHESTLOOTSYSTEM;
		public final BooleanValue USE_MINESLASHLOOTSYSTEM;
		public ConfigValue<Integer> SWORD_MAXDAMAGE;
		public ConfigValue<Integer> STAFF_MAXDAMAGE;
		public ConfigValue<Integer> BOW_MAXDAMAGE;

		ServerConfig(ForgeConfigSpec.Builder builder) {
			builder.comment("Mine and Slash Compatibility").push("Mine and Slash Compatibility")
					.translation("wowweapons.config.use_compatibility_on_items");
			USE_COMPATIBILITY_ON_ITEMS = builder.define("Enable", true);
			builder.comment("Chest Loot Setting").push("Chest Loot Setting")
					.translation("wowweapons.config.use_chestlootsystem");
			USE_CHESTLOOTSYSTEM = builder.define("Enable", true);
			builder.comment("Mine and Slash Loot Setting").push("Mine and Slash Loot Setting")
					.translation("wowweapons.config.use_mineslashlootsystem");
			USE_MINESLASHLOOTSYSTEM = builder.define("Enable", true);
			builder.comment("Sets the max duriabily of Swords.").push("Sets the max duriabily of Swords.")
					.translation("wowweapons.config.sword_maxdamage");
			SWORD_MAXDAMAGE = builder.define("SWORD_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Staffs.").push("Sets the max duriabily of Staffs.")
					.translation("wowweapons.config.staff_maxdamage");
			STAFF_MAXDAMAGE = builder.define("STAFF_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Bows.").push("Sets the max duriabily of Bows.")
					.translation("wowweapons.config.bow_maxdamage");
			BOW_MAXDAMAGE = builder.define("BOW_MAXDAMAGE", 1000);
			builder.pop();
		}
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		WoWWeaponsMod.LOGGER.info("Loading config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		WoWWeaponsMod.LOGGER.info("Built config: " + path);
		file.load();
		WoWWeaponsMod.LOGGER.info("Loaded config: " + path);
		config.setConfig(file);
	}
}