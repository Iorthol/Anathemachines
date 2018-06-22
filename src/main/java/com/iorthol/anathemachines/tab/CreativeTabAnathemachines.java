package com.iorthol.anathemachines.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class CreativeTabAnathemachines extends CreativeTabs {

    public CreativeTabAnathemachines(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.BED;
    }
}
