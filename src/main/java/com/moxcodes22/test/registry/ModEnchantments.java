package com.moxcodes22.test.registry;

import com.moxcodes22.test.TestMod;
import com.moxcodes22.test.items.enchantments.PoisonEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

    public static final Enchantment POISON = new PoisonEnchantment();


    public static void registerEnchantments(){
        Registry.register(Registry.ENCHANTMENT, new Identifier(TestMod.MOD_ID, "poison"), POISON);

    }


}
