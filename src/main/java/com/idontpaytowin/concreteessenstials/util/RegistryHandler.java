package com.idontpaytowin.concreteessenstials.util;

import com.idontpaytowin.concreteessenstials.ConcreteEssentials;
import com.idontpaytowin.concreteessenstials.blocks.BlockItemBase;
import com.idontpaytowin.concreteessenstials.blocks.MultiColorConcretePowder;
import com.idontpaytowin.concreteessenstials.items.Materials;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ConcreteEssentials.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ConcreteEssentials.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> MULTICOLOR_DYE = ITEMS.register("multicolor_dye", Materials::new);
    public static final RegistryObject<Item> MULTICOLOR_DYE_PART1 = ITEMS.register("multicolor_dye_part1", Materials::new);
    public static final RegistryObject<Item> MULTICOLOR_DYE_PART2 = ITEMS.register("multicolor_dye_part2", Materials::new);

    // Blocks
    public static final RegistryObject<Block> MULTI_COLOR_CONCRETE_POWDER = BLOCKS.register("multi_color_concrete_powder", MultiColorConcretePowder::new);

    // Blocks Items
    public static final RegistryObject<Item> MULTI_COLOR_CONCRETE_POWDER_ITEM = ITEMS.register("multi_color_concrete_powder", () -> new BlockItemBase( MULTI_COLOR_CONCRETE_POWDER.get()));

}
