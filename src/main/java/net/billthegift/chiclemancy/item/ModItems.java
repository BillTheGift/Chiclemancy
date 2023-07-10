package net.billthegift.chiclemancy.item;

import net.billthegift.chiclemancy.Chiclemancy;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
   public static final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, Chiclemancy.MOD_ID);

public static final RegistryObject<Item> CHICLEMASTICADO = ITEMS.register("chiclemasticado",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)
                .food(new FoodProperties.Builder().nutrition(1).saturationMod(.5f).alwaysEat().effect(
                        () -> new MobEffectInstance(MobEffects.CONFUSION,200,0),1.0f).build())));

    public static final RegistryObject<Item> CHICLE_ROJO_NEUTRO = ITEMS.register("chicle_rojo_neutro",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ESENCIA_TRANSDIMENCIONAL = ITEMS.register("esencia_transdimencional",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CORAZON_MECANICO = ITEMS.register("corazon_mecanico",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CUARTO_DE_DOLAR = ITEMS.register("cuarto_de_dolar",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
   public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);

   }
}
