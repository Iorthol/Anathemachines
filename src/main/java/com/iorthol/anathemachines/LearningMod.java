package com.iorthol.anathemachines;

import com.iorthol.anathemachines.proxy.CommonProxy;
import com.sun.corba.se.impl.presentation.rmi.StubFactoryFactoryProxyImpl;
import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;
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



    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {



        //proxy.
        // proxy // (RESUME HERE, VIDEO 2 AT 12:01/28:05!)

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }


    public static void main(String[] args) {
    LearningMod sample;
    sample = new LearningMod();
        sample.preInit(null);
    }

}
