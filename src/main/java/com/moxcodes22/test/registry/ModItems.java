package com.moxcodes22.test.registry;

import com.moxcodes22.test.TestMod;
import com.moxcodes22.test.armor.SapphireArmorMaterial;
import com.moxcodes22.test.items.SapphireItem;
import com.moxcodes22.test.items.SapphireSwordItem;
import com.moxcodes22.test.items.materials.SapphireToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {


    //Items

    public static final Item RUBY = new Item(new Item.Settings().group(ModGroups.ITEM_GROUP).group(ItemGroup.MATERIALS).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final SapphireItem SAPPHIRE = new SapphireItem();

    public static final Item SAPPHIRE_HELMET = new ArmorItem(SapphireArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ModGroups.ITEM_GROUP).group(ItemGroup.COMBAT));
    public static final Item SAPPHIRE_CHESTPLATE = new ArmorItem(SapphireArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ModGroups.ITEM_GROUP).group(ItemGroup.COMBAT));
    public static final Item SAPPHIRE_LEGGINGS = new ArmorItem(SapphireArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ModGroups.ITEM_GROUP).group(ItemGroup.COMBAT));
    public static final Item SAPPHIRE_BOOTS = new ArmorItem(SapphireArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ModGroups.ITEM_GROUP).group(ItemGroup.COMBAT));
    public static ToolItem SAPPHIRE_SWORD = new SapphireSwordItem(SapphireToolMaterial.INSTANCE, 10, -2F, new Item.Settings().group(ModGroups.ITEM_GROUP).group(ItemGroup.COMBAT));

    //Item Groups



    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, "sapphire"), SAPPHIRE);
        Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, "sapphire_sword"), SAPPHIRE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, "sapphire_helmet"), SAPPHIRE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, "sapphire_chestplate"), SAPPHIRE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, "sapphire_leggings"), SAPPHIRE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, "sapphire_boots"), SAPPHIRE_BOOTS);

    }

}
