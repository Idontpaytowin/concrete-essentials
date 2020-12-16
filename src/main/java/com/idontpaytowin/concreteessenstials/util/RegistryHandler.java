package com.idontpaytowin.concreteessenstials.util;

import com.idontpaytowin.concreteessenstials.ConcreteEssentials;
import com.idontpaytowin.concreteessenstials.blocks.BlockItemBase;
import com.idontpaytowin.concreteessenstials.blocks.MultiColorConcretePowder;
import com.idontpaytowin.concreteessenstials.items.Materials;
import com.idontpaytowin.concreteessenstials.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.ToolType;
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

    // Items
    public static final RegistryObject<Item> MULTI_COLOR_DYE = ITEMS.register("multi_color_dye", Materials::new);
    public static final RegistryObject<Item> MULTI_COLOR_DYE_PART1 = ITEMS.register("multi_color_dye_part1", Materials::new);
    public static final RegistryObject<Item> MULTI_COLOR_DYE_PART2 = ITEMS.register("multi_color_dye_part2", Materials::new);
    public static final RegistryObject<Item> PILE_OF_COBBLESTONE = ITEMS.register("pile_of_cobblestone", Materials::new);
    public static final RegistryObject<Item> PILE_OF_GRAVEL = ITEMS.register("pile_of_gravel", Materials::new);
    public static final RegistryObject<Item> PILE_OF_DIRT = ITEMS.register("pile_of_dirt", Materials::new);
    public static final RegistryObject<Item> PILE_OF_SAND = ITEMS.register("pile_of_sand", Materials::new);
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", Materials::new);

    //public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("pile_of_sand", Materials::new);
    //public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("pile_of_sand", Materials::new);
    //public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("pile_of_sand", Materials::new);
    //public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("pile_of_sand", Materials::new);
    //public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("pile_of_sand", Materials::new);

    // Tools


    // Blocks
    public static final RegistryObject<Block> MULTI_COLOR_CONCRETE_POWDER = BLOCKS.register("multi_color_concrete_powder", MultiColorConcretePowder::new);

    // Blocks Items
    public static final RegistryObject<Item> MULTI_COLOR_CONCRETE_POWDER_ITEM = ITEMS.register("multi_color_concrete_powder", () -> new BlockItemBase( MULTI_COLOR_CONCRETE_POWDER.get()));

}
