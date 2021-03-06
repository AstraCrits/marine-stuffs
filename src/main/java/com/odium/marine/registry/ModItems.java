package com.odium.marine.registry;

import com.odium.marine.Marine;
import com.odium.marine.armors.*;
import com.odium.marine.charms.ConduitCharm;
import com.odium.marine.charms.DolphinCharm;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item CEVICHE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(6).build()));
    public static final Item FUGU = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(10).build()));
    public static final Item CALAMARI = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(6).build()));
    public static final Item RAW_CALAMARI = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(1).build()));
    public static final Item FISH_BOWL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(12).saturationModifier(14).build()));

    public static final Item DOLPHIN_LEATHER = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Item DOLPHIN_CHARM= new DolphinCharm();
    public static final Item CONDUIT_CHARM= new ConduitCharm();

    public static final Item SEA_HELMET = new ArmorItem(DeepSeaMaterial.SeaArmorMaterial.SEA, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_CHESTPLATE = new ArmorItem(DeepSeaMaterial.SeaArmorMaterial.SEA, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_LEGGINGS = new ArmorItem(DeepSeaMaterial.SeaArmorMaterial.SEA, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SEA_BOOTS = new ArmorItem(DeepSeaMaterial.SeaArmorMaterial.SEA, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item SHELL_HELMET = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SHELL_CHESTPLATE = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SHELL_LEGGINGS = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item SHELL_BOOTS = new ArmorItem(NautilusShellMaterial.ShellArmorMaterial.SHELL, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item PRISM_HELM = new ArmorItem(PrismarineMaterial.PrismMaterial.PRISM, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item PRISM_CHEST = new ArmorItem(PrismarineMaterial.PrismMaterial.PRISM, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item PRISM_LEGS = new ArmorItem(PrismarineMaterial.PrismMaterial.PRISM, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
    public static final Item PRISM_BOOTS = new ArmorItem(PrismarineMaterial.PrismMaterial.PRISM, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));

    public static final Item TYPHORITE_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TYPHORITE_SCRAP = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Item Typhorite_Trident = new Item(new Item.Settings().group(ItemGroup.COMBAT).maxCount(1).maxDamage(12));

    public static void RegisterItems(){

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "ceviche"), CEVICHE);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "fugu"), FUGU);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "calamari"), CALAMARI);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "raw_calamari"), RAW_CALAMARI);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "fish_bowl"), FISH_BOWL);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "dolphin_leather"), DOLPHIN_LEATHER);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "dolphin_charm"), DOLPHIN_CHARM);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "conduit_charm"), CONDUIT_CHARM);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "sea_helmet"), SEA_HELMET);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"sea_chestplate"), SEA_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"sea_leggings"), SEA_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"sea_boots"), SEA_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "shell_helmet"), SHELL_HELMET);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"shell_chestplate"), SHELL_CHESTPLATE);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"shell_leggings"), SHELL_LEGGINGS);
        Registry.register(Registry.ITEM,new Identifier(Marine.ID,"shell_boots"), SHELL_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "prism_helm"), PRISM_HELM);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "prism_chest"), PRISM_CHEST);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "prism_legs"), PRISM_LEGS);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "prism_boots"), PRISM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_ingot"), TYPHORITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_scrap"), TYPHORITE_SCRAP);
        Registry.register(Registry.ITEM, new Identifier(Marine.ID, "typhorite_trident"), Typhorite_Trident);

    }
}


