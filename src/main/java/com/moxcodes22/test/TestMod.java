package com.moxcodes22.test;

import com.moxcodes22.test.registry.ModBlocks;
import com.moxcodes22.test.registry.ModEnchantments;
import com.moxcodes22.test.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class TestMod implements ModInitializer {

    public static final String MOD_ID = "test";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModEnchantments.registerEnchantments();
        ModBlocks.registerBlocks();
    }

}
