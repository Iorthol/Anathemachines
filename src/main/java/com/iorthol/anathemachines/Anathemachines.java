package com.iorthol.anathemachines;

import com.iorthol.anathemachines.item.ModItems;
import com.iorthol.anathemachines.proxy.CommonProxy;
import com.iorthol.anathemachines.tab.CreativeTabAnathemachines;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Anathemachines.MODID, version = Anathemachines.VERSION, name = Anathemachines.NAME)
public class Anathemachines {
    public static final String MODID = "anathemachines";
    public static final String VERSION = "1.0";
    public static final String NAME = "Anathemachines";

    @SidedProxy(clientSide = "com.iorthol.anathemachines.proxy.ClientProxy", serverSide = "com.iorthol.anathemachines.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Anathemachines instance;

    public static CreativeTabAnathemachines tabAnathemachines;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        tabAnathemachines = new CreativeTabAnathemachines(CreativeTabs.getNextID(), "tab_anathemachines");
        ModItems.preInit();
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);

    }

}
