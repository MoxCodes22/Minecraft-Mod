package com.moxcodes22.test.items.materials;

import com.moxcodes22.test.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SapphireToolMaterial implements ToolMaterial {

    public static final SapphireToolMaterial INSTANCE = new SapphireToolMaterial();

    @Override
    public int getDurability() {
        return 8000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 14.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.SAPPHIRE);
    }
}
