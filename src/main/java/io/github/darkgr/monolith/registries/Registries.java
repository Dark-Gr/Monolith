package io.github.darkgr.monolith.registries;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import io.github.darkgr.monolith.Monolith;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;

public class Registries {

    public static final NonNullSupplier<Registrate> REGISTRATE = NonNullSupplier.lazy(
            () -> Registrate.create(Monolith.MOD_ID));

    public static final RegistryEntry<Block> TEST_BLOCK = REGISTRATE.get().block("test_block", Block::new)
            .item().tab(NonNullSupplier.of(() -> CreativeModeTab.TAB_BUILDING_BLOCKS)).build()
            .register();

    public static void register() {}

}
