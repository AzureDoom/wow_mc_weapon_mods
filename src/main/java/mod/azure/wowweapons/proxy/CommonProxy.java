package mod.azure.wowweapons.proxy;

import static net.minecraftforge.fml.relauncher.Side.SERVER;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.wowweapons.WoWWeaponsMod;
import mod.azure.wowweapons.util.Register;
import net.minecraft.item.Item;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = WoWWeaponsMod.modid, value = SERVER)
public class CommonProxy {

	private static final Logger LOGGER = LogManager.getLogger();

	public void preInit() {

	}

	public void init() {
	}

	public void postInit() {

	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			IForgeRegistry<Item> registry = event.getRegistry();

			for (Item item : Register.itemList) {
				registry.register(item);
			}

			Register.variantList = NonNullList.create();
			for (Item item : Register.itemList) {
				item.getSubItems(WoWWeaponsMod.tab, Register.variantList);
			}
			LOGGER.debug("Registered Items");
		}
	}
}