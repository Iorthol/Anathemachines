package com.iorthol.anathemachines.item;

import com.iorthol.anathemachines.Anathemachines;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.List;

public class ItemAnathemachinesItem extends Item {

    public ItemAnathemachinesItem(String name) {
        setUnlocalizedName(name);
        setCreativeTab(Anathemachines.tabAnathemachines);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {

        // Video 3, 20:18

        return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return super.getRarity(stack);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return super.hasEffect(stack);
    }
}
