package com.dwdking.tutorialmod.core.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dwdking.tutorialmod.TutorialMod.MOD_ID;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final RegistryObject<Block> TUTORIAL_BLOCK = BLOCKS.register(
            "tutorial_block",
            () -> new Block(
                    BlockBehaviour.Properties
                            .of(Material.METAL, MaterialColor.EMERALD)
                            .strength(6.0f, 7.0f)
                            .requiresCorrectToolForDrops()
            )
    );


    private BlockInit() {
    }

}
