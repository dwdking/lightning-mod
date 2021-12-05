package com.dwdking.tutorialmod.core.init;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dwdking.tutorialmod.TutorialMod.MOD_ID;

public final class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> TUTORIAL_ITEM = ITEMS.register(
            "tutorial_item",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant())
    );

    public static final RegistryObject<BlockItem> TUTORIAL_BLOCK_ITEM = ITEMS.register(
            "tutorial_block",
            () -> new BlockItem(
                    BlockInit.TUTORIAL_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
            )
    );

    public static final RegistryObject<SwordItem> TUTORIAL_SWORD = ITEMS.register(
            "tutorial_sword",
            () -> new SwordItem(
                    ToolMaterialInit.TUTORIAL_TOOL_MATERIAL,
                    99,
                    99f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
            )
    );

    public static final RegistryObject<PickaxeItem> TUTORIAL_PICKAXE = ITEMS.register(
            "tutorial_pickaxe",
            () -> new PickaxeItem(
                    ToolMaterialInit.TUTORIAL_TOOL_MATERIAL,
                    99,
                    99f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
            )
    );

    public static final RegistryObject<ShovelItem> TUTORIAL_SHOVEL = ITEMS.register(
            "tutorial_shovel",
            () -> new ShovelItem(
                    ToolMaterialInit.TUTORIAL_TOOL_MATERIAL,
                    99,
                    99f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
            )
    );

    public static final RegistryObject<AxeItem> TUTORIAL_AXE = ITEMS.register(
            "tutorial_axe",
            () -> new AxeItem(
                    ToolMaterialInit.TUTORIAL_TOOL_MATERIAL,
                    99,
                    99f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
            )
    );

    public static final RegistryObject<HoeItem> TUTORIAL_HOE = ITEMS.register(
            "tutorial_hoe",
            () -> new HoeItem(
                    ToolMaterialInit.TUTORIAL_TOOL_MATERIAL,
                    99,
                    99f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
            )
    );

    public static final RegistryObject<ArmorItem> TUTORIAL_HELMET = ITEMS.register(
            "tutorial_helmet",
            () -> new ArmorItem(
                    ArmorMaterialInit.TUTORIAL_ARMOR_MATERIAL,
                    EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
            )
    );

    public static final RegistryObject<ArmorItem> TUTORIAL_CHEST = ITEMS.register(
            "tutorial_chest",
            () -> new ArmorItem(
                    ArmorMaterialInit.TUTORIAL_ARMOR_MATERIAL,
                    EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
            )
    );

    public static final RegistryObject<ArmorItem> TUTORIAL_LEGS = ITEMS.register(
            "tutorial_legs",
            () -> new ArmorItem(
                    ArmorMaterialInit.TUTORIAL_ARMOR_MATERIAL,
                    EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
            )
    );

    public static final RegistryObject<ArmorItem> TUTORIAL_BOOTS = ITEMS.register(
            "tutorial_boots",
            () -> new ArmorItem(
                    ArmorMaterialInit.TUTORIAL_ARMOR_MATERIAL,
                    EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
            )
    );

    private ItemInit() {
    }

}
