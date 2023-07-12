package net.billthegift.chiclemancy.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.billthegift.chiclemancy.Chiclemancy;
import net.billthegift.chiclemancy.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Chiclemancy.MOD_ID);


    public static final Supplier<List<OreConfiguration.TargetBlockState>> SOBREMUNDO_FISURA_UMBRAL = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.FISURA_UMBRAL.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> FISURA_UMBRAL = CONFIGURED_FEATURES.register("fisura_umbral",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SOBREMUNDO_FISURA_UMBRAL.get(), 7)));


public static void register(IEventBus eventBus) {
    CONFIGURED_FEATURES.register(eventBus);
}
}
