package com.moxcodes22.test.registry;

import com.moxcodes22.test.TestMod;
import com.moxcodes22.test.armor.SapphireArmorMaterial;
import com.moxcodes22.test.blocks.SapphireBlock;
import com.moxcodes22.test.blocks.SapphireOreBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final OreBlock SAPPHIRE_ORE = new SapphireOreBlock(FabricBlockSettings.of(Material.METAL).strength(8.0F).requiresTool());

    public static final Block SAPPHIRE_BLOCK = new SapphireBlock(FabricBlockSettings.of(Material.METAL).strength(10.0F).requiresTool());

    public static  void registerBlocks(){

        Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, "sapphire_ore"), SAPPHIRE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, "sapphire_block"), SAPPHIRE_BLOCK);

    }

}
