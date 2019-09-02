package mod.azure.wowweapons.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.ImmutableList;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import mod.azure.wowweapons.items.ebwizardry.ItemBaseMagic;
import mod.azure.wowweapons.items.mineandslash.MSStaff;
import mod.azure.wowweapons.items.normal.ItemBaseBow;
import mod.azure.wowweapons.items.normal.ItemBaseHelmet;
import mod.azure.wowweapons.items.normal.ItemBaseSword;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Loader;

public class Register {

	private static final Logger LOGGER = LogManager.getLogger();

	private static final List<String> NECROMANCY = ImmutableList.of("marlis_touch", "touch_of_chaos",
			"thoughtblighter");

	private static final List<String> SORCERY = ImmutableList.of("doomfinger", "anzusscorn");

	// private static final List<String> EARTH = ImmutableList.of(

	// );

	// private static final List<String> LIGHTNING = ImmutableList.of(

	// );

	// private static final List<String> HEALING = ImmutableList.of(

	// );

	// private static final List<String> ICE = ImmutableList.of(

	// );

	// private static final List<String> FIRE = ImmutableList.of(

	// );

	// private static final List<String> MAGIC = ImmutableList.of(

	// );

	private static final List<String> Bows = ImmutableList.of("marlis_touch", "touch_of_chaos", "doomfinger", "anzusscorn");

	public static Item[] itemList;
	public static NonNullList<ItemStack> variantList;
	static {
		List<Item> items = new ArrayList<Item>();
		items.add(new ItemBaseSword("thunderfury", 22));
		items.add(new ItemBaseSword("armageddon", 62));
		items.add(new ItemBaseSword("frostmourne", 747));
		items.add(new ItemBaseSword("ashbringer", 42));
		items.add(new ItemBaseSword("swordofathousandtruths", 180));
		items.add(new ItemBaseHelmet("raiddeathknight_q_01_gnm", ArmorMaterial.DIAMOND, EntityEquipmentSlot.HEAD));
		if (Loader.isModLoaded("ebwizardry")) {
			for (String s : NECROMANCY) {
				items.add(new ItemBaseMagic(s, Tier.MASTER, Element.NECROMANCY));
			}
			;
			for (String s : SORCERY) {
				items.add(new ItemBaseMagic(s, Tier.MASTER, Element.SORCERY));
			}
			;
		} else if (Loader.isModLoaded("mmorpg")) {
			for (String s : Bows) {
				items.add(new MSStaff(s));
			}
			;
		} else {
			for (String s : Bows) {
				items.add(new ItemBaseBow(s));
			}
			;
		}
		itemList = items.toArray(new Item[items.size()]);
	}
}