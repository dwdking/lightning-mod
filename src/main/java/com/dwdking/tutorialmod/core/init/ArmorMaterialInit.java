package com.dwdking.tutorialmod.core.init;

import com.dwdking.tutorialmod.core.BaseArmorMaterial;
import com.dwdking.tutorialmod.core.BaseToolMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import static com.dwdking.tutorialmod.TutorialMod.MOD_ID;

public class ArmorMaterialInit {

    public final static ArmorMaterial TUTORIAL_ARMOR_MATERIAL = new BaseArmorMaterial(
            99, new int[] {99, 99, 99, 99}, new int[] {99, 99, 99, 99}, 99, 99,
            MOD_ID + ":tutorial_armor_material", SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ItemInit.TUTORIAL_BLOCK_ITEM.get())
    );

    private ArmorMaterialInit() {
    }

}
