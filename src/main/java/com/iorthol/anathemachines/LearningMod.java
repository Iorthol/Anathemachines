package com.iorthol.anathemachines;

import com.iorthol.anathemachines.proxy.CommonProxy;
import com.iorthol.anathemachines.tab.CreativeTabLearningMod;
import com.sun.corba.se.impl.presentation.rmi.StubFactoryFactoryProxyImpl;
import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LearningMod.MODID, version = LearningMod.VERSION, name = LearningMod.NAME)
public class LearningMod {
    public static final String MODID = "learningmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "LearningMod";

    @SidedProxy(clientSide = "com.iorthol.anathemachines.proxy.ClientProxy", serverSide = "com.iorthol.anathemachines.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static LearningMod instance;

    public static CreativeTabLearningMod tabLearningMod;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        tabLearningMod = new CreativeTabLearningMod(CreativeTabs.getNextID(), "tab_learningmod");
        proxy.preInit(event);

        //proxy.
        // proxy // (RESUME HERE, VIDEO 2 AT 12:01/28:05!)

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
