package com.dwdking.tutorialmod.core;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class BaseArmorMaterial implements ArmorMaterial {

    private int enchantability;

    private int[] durability;

    private int[] damageReduction;

    private float knockbackResistance;

    private float toughness;

    private String name;

    private SoundEvent equipmentSound;

    private Supplier<Ingredient> repairMaterial;

    public BaseArmorMaterial(int enchantability, int[] durability, int[] damageReduction, float knockbackResistance,
                             float toughness, String name, SoundEvent equipmentSound,
                             Supplier<Ingredient> repairMaterial) {
        this.enchantability = enchantability;
        this.durability = durability;
        this.damageReduction = damageReduction;
        this.knockbackResistance = knockbackResistance;
        this.toughness = toughness;
        this.name = name;
        this.equipmentSound = equipmentSound;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot p_40410_) {
        return durability[p_40410_.getIndex()];
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot p_40411_) {
        return damageReduction[p_40411_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipmentSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
