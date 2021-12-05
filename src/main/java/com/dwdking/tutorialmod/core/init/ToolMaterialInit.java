package com.dwdking.tutorialmod.core.init;

import com.dwdking.tutorialmod.core.BaseToolMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ToolMaterialInit {

    public final static Tier TUTORIAL_TOOL_MATERIAL = new BaseToolMaterial(
            99, 99, 99, 99, 999,
            () -> Ingredient.of(ItemInit.TUTORIAL_BLOCK_ITEM.get())
    );

    private ToolMaterialInit() {
    }

}
