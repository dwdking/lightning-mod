package com.dwdking.tutorialmod.core;

import net.minecraft.tags.Tag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BaseToolMaterial implements Tier {

    private float attackDamageBonus;

    private float speed;

    private int enchantability;

    private int harvestLevel;

    private int durability;

    private Supplier<Ingredient> repairMaterial;

    public BaseToolMaterial(float attackDamageBonus, float speed, int enchantability, int harvestLevel, int durability, Supplier<Ingredient> repairMaterial) {
        this.attackDamageBonus = attackDamageBonus;
        this.speed = speed;
        this.enchantability = enchantability;
        this.harvestLevel = harvestLevel;
        this.durability = durability;
        this.repairMaterial = repairMaterial;
    }

    @Nullable
    @Override
    public Tag<Block> getTag() {
        return Tier.super.getTag();
    }

    @Override
    public int getUses() {
        return durability;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
