package net.axekimbo.betterpvp.item;

import net.axekimbo.betterpvp.BetterPvP;
import net.axekimbo.betterpvp.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterPvP.MODID);

    public static final RegistryObject<CreativeModeTab> ENDERITE_TAB = CREATIVE_MODE_TABS.register("enderite_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDERITE.get()))
                    .title(Component.translatable("creativetab.enderite_tab"))
                    .displayItems((pParameters, pOutput) ->{
                        pOutput.accept(ModItems.ENDERITE.get());
                        pOutput.accept(ModItems.ENDERITE_SCRAP.get());

                        pOutput.accept(ModBlocks.ENDERITE_DEBRIS.get());
                        pOutput.accept(ModBlocks.ENDERITE_BLOCK.get());

                        pOutput.accept(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(ModItems.ENDERITE_HELMET.get());
                        pOutput.accept(ModItems.ENDERITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.ENDERITE_LEGGINGS.get());
                        pOutput.accept(ModItems.ENDERITE_BOOTS.get());
                    } )
                    .build());

    public static final RegistryObject<CreativeModeTab> MINING_TAB = CREATIVE_MODE_TABS.register("miners_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.IRON_PICKAXE))
                    .title(Component.translatable("creativetab.miners_tab"))
                    .displayItems((pParameters, pOutput) ->{
                        pOutput.accept(ModItems.MINER_HELMET.get());
                        pOutput.accept(ModItems.MINER_CHESTPLATE.get());
                        pOutput.accept(ModItems.MINER_LEGGINGS.get());
                        pOutput.accept(ModItems.MINER_BOOTS.get());

                        pOutput.accept(ModItems.MINER_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(ModItems.MINER2_HELMET.get());
                        pOutput.accept(ModItems.MINER2_CHESTPLATE.get());
                        pOutput.accept(ModItems.MINER2_LEGGINGS.get());
                        pOutput.accept(ModItems.MINER2_BOOTS.get());
                    } )
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
