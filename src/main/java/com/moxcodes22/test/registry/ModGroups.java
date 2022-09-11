package com.moxcodes22.test.registry;

import com.moxcodes22.test.TestMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static com.moxcodes22.test.registry.ModItems.*;

public class ModGroups {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
                    new Identifier(TestMod.MOD_ID, "general"))
            .icon(() -> new ItemStack(RUBY))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(RUBY));
                stacks.add(new ItemStack(SAPPHIRE));
                stacks.add(new ItemStack(SAPPHIRE_HELMET));
                stacks.add(new ItemStack(SAPPHIRE_CHESTPLATE));
                stacks.add(new ItemStack(SAPPHIRE_LEGGINGS));
                stacks.add(new ItemStack(SAPPHIRE_BOOTS));
            })
            .build();


}
