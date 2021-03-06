package com.odium.marine.armors;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public class DeepSeaMaterial {

    public enum SeaArmorMaterial implements ArmorMaterial {
        SEA("sea", 33, new int[] {3 , 6, 8 , 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0f, () -> {
            return Ingredient.ofItems(Items.DARK_PRISMARINE);
        });
        private static final int[] baseDurability = {13, 15, 16, 11};
        private final String name;
        private final int durabilityMultiplier;
        private final int[] armorValues;
        private final int enchantability;
        private final SoundEvent equipSound;
        private final float toughness;
        private final float knockbackResistance;
        private final Lazy<Ingredient> repairIngredient;

        SeaArmorMaterial(String name, int durabilityMultiplier, int[] armorValueArr, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
            this.name = name;
            this.durabilityMultiplier = durabilityMultiplier;
            this.armorValues = armorValueArr;
            this.enchantability = enchantability;
            this.equipSound = soundEvent;
            this.toughness = toughness;
            this.knockbackResistance = getKnockbackResistance();
            this.repairIngredient = new Lazy(repairIngredient);
        }

        public int getDurability(EquipmentSlot equipmentSlot_1) {
            return baseDurability[equipmentSlot_1.getEntitySlotId()] * this.durabilityMultiplier;
        }

        public int getProtectionAmount(EquipmentSlot equipmentSlot_1) {
            return this.armorValues[equipmentSlot_1.getEntitySlotId()];
        }

        public int getEnchantability() {
            return this.enchantability;
        }

        public SoundEvent getEquipSound() {
            return this.equipSound;
        }

        public Ingredient getRepairIngredient() {
            // We needed to make it a Lazy type so we can actually get the Ingredient from the Supplier.
            return this.repairIngredient.get();
        }

        @Environment(EnvType.CLIENT)
        public String getName() {
            return this.name;
        }

        public float getToughness() {
            return this.toughness;
        }

        public float getKnockbackResistance() {
            return this.knockbackResistance;
        }

    }


}
