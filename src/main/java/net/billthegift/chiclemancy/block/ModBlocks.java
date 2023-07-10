package net.billthegift.chiclemancy.block;

import net.billthegift.chiclemancy.Chiclemancy;
import net.billthegift.chiclemancy.block.custom.maquina_chicle_base;
import net.billthegift.chiclemancy.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Chiclemancy.MOD_ID);

    public static final RegistryObject<Block> MAQUINA_CHICLE_BASE = registerBlock( "maquina_chicle_base",
            () -> new maquina_chicle_base(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MAQUINA_CHICLE_DOMO = registerBlock( "maquina_chicle_domo",
            () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> FISURA_UMBRAL = registerBlock( "fisura_umbral",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                   .strength(1f).requiresCorrectToolForDrops()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
