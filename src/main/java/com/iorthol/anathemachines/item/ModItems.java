package com.iorthol.anathemachines.item;

import com.iorthol.anathemachines.Anathemachines;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {


    public static Item anathemachinesItem;


    public static void preInit() {

        anathemachinesItem = new ItemAnathemachinesItem("anathemachines_item");

        registerItems();

    }

    public static void registerItems() {
        GameRegistry.register(anathemachinesItem, new ResourceLocation(Anathemachines.MODID, "anathemachines_item"));
    }

    public static void registerRenders() {
        registerRender(anathemachinesItem);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item, 0, new ModelResourceLocation(Anathemachines.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    }


