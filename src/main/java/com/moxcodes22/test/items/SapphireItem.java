package com.moxcodes22.test.items;

import com.moxcodes22.test.registry.ModGroups;
import com.moxcodes22.test.registry.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.sound.Sound;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SapphireItem extends Item {


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if(!world.isClient()){
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 10; j++){
                    for(int k = 0; k < 10; k++){
                        world.breakBlock(new BlockPos(new Vec3d(user.getX()-i, user.getY()-j, user.getZ()-k)), false);
                    }
                }
            }

        }
        else{
            user.playSound(SoundEvents.ENTITY_DRAGON_FIREBALL_EXPLODE, 1.0f, 1.0f);
        }

        return super.use(world, user, hand);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        World world = context.getWorld();
        Block block = world.getBlockState(context.getBlockPos()).getBlock();
        if(block == Blocks.GRASS_BLOCK){
            if(!world.isClient()){
                // update on server side
                world.setBlockState(context.getBlockPos(), Blocks.LAPIS_BLOCK.getDefaultState());
                context.getPlayer().getStackInHand(context.getHand()).decrement(1);
            }
            else{
                // Play sound on client side
                context.getPlayer().playSound(SoundEvents.BLOCK_WOOL_PLACE, 1.0f, 1.0f);
            }
        }
        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        tooltip.add(Text.translatable("item.test.sapphire.tooltip"));

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        //Server: giving/removing items, affect entities/blocks
        //Client: rendering, particle effects, music/sound

        if(!user.getWorld().isClient() && hand == Hand.MAIN_HAND){

            if(entity.getType() == EntityType.SHEEP){
                SheepEntity sheep = (SheepEntity) entity;
                sheep.setColor(DyeColor.BLUE);
                user.getStackInHand(hand).decrement(1);
            }
            else{
                user.sendMessage(Text.literal("Try using that item on a sheep..."));
            }

        }

        return super.useOnEntity(stack, user, entity, hand);
    }

    public SapphireItem() {
        super(new FabricItemSettings().group(ModGroups.ITEM_GROUP).group(ItemGroup.MATERIALS).rarity(Rarity.EPIC));
    }

}
