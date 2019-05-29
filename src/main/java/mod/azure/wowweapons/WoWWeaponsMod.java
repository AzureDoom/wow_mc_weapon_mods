package mod.azure.wowweapons;

import java.util.ArrayList;
import java.util.List;

import mod.azure.wowweapons.proxy.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = WoWWeaponsMod.modid, version = WoWWeaponsMod.version, dependencies = WoWWeaponsMod.dependencies)
public class WoWWeaponsMod {

	public static final String modid = "wowweapons";
	public static final String MODNAME = "World of Warcraft Weapons";
	public static final String version = "0.0.4";
	public static final String dependencies = "required-after:ebwizardry;after:mmorpg";
	
	@SidedProxy(clientSide = "mod.azure.wowweapons.proxy.ClientProxy", serverSide = "mod.azure.wowweapons.proxy.CommonProxy")
    public static CommonProxy proxy;

	public static CreativeTabs tab = new Tab(modid);

	@Mod.Instance
	public static WoWWeaponsMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit();
	}
	
	@Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init();
        MinecraftForge.EVENT_BUS.register(new LootHandler());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();
        if(Loader.isModLoaded("mmorpg")) {
        	MMORPGHandler.registerMMORPG();
        }
    }
}