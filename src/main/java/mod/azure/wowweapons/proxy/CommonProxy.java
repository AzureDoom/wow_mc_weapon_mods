package mod.azure.wowweapons.proxy;

import java.util.ArrayList;
import java.util.List;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import mod.azure.wowweapons.WoWWeaponsMod;
import mod.azure.wowweapons.items.ItemBaseMagic;
import mod.azure.wowweapons.items.ItemBaseSword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {

	
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
    		
    		for (Item item : itemList) {
    			registry.register(item);
    		}
    		
    		variantList = NonNullList.create();
    		for (Item item : itemList) {
    			item.getSubItems(WoWWeaponsMod.tab, variantList);
    		}
    	}
	}
	
	public static Item[] itemList;
	public static NonNullList<ItemStack> variantList;  
	static {
		if(Loader.isModLoaded("ebwizardry")) {
			List<Item> items = new ArrayList<Item>();
			items.add(new ItemBaseSword("thunderfury", 22));
			items.add(new ItemBaseSword("armageddon", 62));
			items.add(new ItemBaseSword("frostmourne", 747));
			items.add(new ItemBaseSword("ashbringer", 42));
			items.add(new ItemBaseSword("swordofathousandtruths", 180));
			items.add(new ItemBaseMagic("marlis_touch", Tier.MASTER, Element.NECROMANCY));
			items.add(new ItemBaseMagic("touch_of_chaos", Tier.MASTER, Element.NECROMANCY));
			items.add(new ItemBaseMagic("thoughtblighter", Tier.MASTER, Element.NECROMANCY));
			items.add(new ItemBaseMagic("doomfinger", Tier.MASTER, Element.SORCERY));
			items.add(new ItemBaseMagic("anzusscorn", Tier.MASTER, Element.SORCERY));
			itemList = items.toArray(new Item[items.size()]);
		} else {
			List<Item> items = new ArrayList<Item>();
			items.add(new ItemBaseSword("thunderfury", 22));
			items.add(new ItemBaseSword("armageddon", 62));
			items.add(new ItemBaseSword("frostmourne", 747));
			items.add(new ItemBaseSword("ashbringer", 42));
			items.add(new ItemBaseSword("swordofathousandtruths", 180));
			items.add(new ItemBaseSword("marlis_touch", 8));
			items.add(new ItemBaseSword("touch_of_chaos", 8));
			items.add(new ItemBaseSword("thoughtblighter", 129));
			items.add(new ItemBaseSword("doomfinger", 9));
			items.add(new ItemBaseSword("anzusscorn", 18));
			itemList = items.toArray(new Item[items.size()]);
		}
	}
}