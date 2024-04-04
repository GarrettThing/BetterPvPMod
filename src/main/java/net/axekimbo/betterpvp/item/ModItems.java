package net.axekimbo.betterpvp.item;

import net.axekimbo.betterpvp.BetterPvP;
import net.axekimbo.betterpvp.item.custom.ModArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterPvP.MODID);
    public static final RegistryObject<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_SCRAP = ITEMS.register("enderite_scrap",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("enderite_upgrade_smithing_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MINER_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("miner_upgrade_smithing_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MINER_HELMET = ITEMS.register("miner_helmet",
            () -> new ModArmorItem(ModArmorMaterials.MINER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MINER_CHESTPLATE = ITEMS.register("miner_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MINER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MINER_LEGGINGS = ITEMS.register("miner_leggings",
            () -> new ArmorItem(ModArmorMaterials.MINER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MINER_BOOTS = ITEMS.register("miner_boots",
            () -> new ArmorItem(ModArmorMaterials.MINER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MINER2_HELMET = ITEMS.register("miner_helmet_tier_2",
            () -> new ModArmorItem(ModArmorMaterials.MINER2, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MINER2_CHESTPLATE = ITEMS.register("miner_chestplate_tier_2",
            () -> new ArmorItem(ModArmorMaterials.MINER2, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MINER2_LEGGINGS = ITEMS.register("miner_leggings_tier_2",
            () -> new ArmorItem(ModArmorMaterials.MINER2, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MINER2_BOOTS = ITEMS.register("miner_boots_tier_2",
            () -> new ArmorItem(ModArmorMaterials.MINER2, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
