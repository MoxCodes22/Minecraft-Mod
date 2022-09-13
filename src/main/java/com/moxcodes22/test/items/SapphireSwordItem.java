package com.moxcodes22.test.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;

public class SapphireSwordItem extends SwordItem {

    public SapphireSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        attacker.sendMessage(Text.translatable("You've been a bad boy..."));

        return super.postHit(stack, target, attacker);
    }
}
