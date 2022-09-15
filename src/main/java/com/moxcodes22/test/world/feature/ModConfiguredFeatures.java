package com.moxcodes22.test.world.feature;

import com.moxcodes22.test.registry.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_SAPPHIRE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE = ConfiguredFeatures.register("sapphire_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SAPPHIRE_ORES, 3));

    public static void registerConfiguredFeatures(){


    }


}
