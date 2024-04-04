package net.axekimbo.betterpvp.datagen;

import net.axekimbo.betterpvp.BetterPvP;
import net.axekimbo.betterpvp.block.ModBlocks;
import net.axekimbo.betterpvp.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;
import java.util.List;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> ENDERITE_DEBRIS = List.of(ModBlocks.ENDERITE_BLOCK.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        oreSmelting(pRecipeOutput, ENDERITE_DEBRIS, RecipeCategory.MISC, ModItems.ENDERITE_SCRAP.get(), .25f, 200, "enderite_scrap");
        oreBlasting(pRecipeOutput, ENDERITE_DEBRIS, RecipeCategory.MISC, ModItems.ENDERITE_SCRAP.get(), .25f, 100, "enderite_scrap");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERITE.get(), 1)
                .requires(ModItems.ENDERITE_SCRAP.get(),4)
                .requires(Items.DIAMOND, 4)
                .unlockedBy(getHasName(ModItems.ENDERITE_SCRAP.get()), has(ModItems.ENDERITE_SCRAP.get()))
                .save(pRecipeOutput);

        enderiteSmithing(pRecipeOutput, Items.DIAMOND_HELMET,RecipeCategory.MISC, ModItems.ENDERITE_HELMET.get());
        enderiteSmithing(pRecipeOutput, Items.DIAMOND_CHESTPLATE,RecipeCategory.MISC, ModItems.ENDERITE_CHESTPLATE.get());
        enderiteSmithing(pRecipeOutput, Items.DIAMOND_LEGGINGS,RecipeCategory.MISC, ModItems.ENDERITE_LEGGINGS.get());
        enderiteSmithing(pRecipeOutput, Items.DIAMOND_BOOTS,RecipeCategory.MISC, ModItems.ENDERITE_BOOTS.get());

        miningSmithing(pRecipeOutput, ModItems.MINER_HELMET.get(),RecipeCategory.MISC, ModItems.MINER2_HELMET.get());
        miningSmithing(pRecipeOutput, ModItems.MINER_CHESTPLATE.get(),RecipeCategory.MISC, ModItems.MINER2_CHESTPLATE.get());
        miningSmithing(pRecipeOutput, ModItems.MINER_LEGGINGS.get(),RecipeCategory.MISC, ModItems.MINER2_LEGGINGS.get());
        miningSmithing(pRecipeOutput, ModItems.MINER_BOOTS.get(),RecipeCategory.MISC, ModItems.MINER2_BOOTS.get());

//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERITE.get(), 9)
//                .requires(ModBlocks.ENDERITE_BLOCK.get())
//                .unlockedBy(getHasName(ModBlocks.ENDERITE_BLOCK.get()), has(ModBlocks.ENDERITE_BLOCK.get()))
//                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENDERITE_BLOCK.get(), 1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ENDERITE.get())
                .unlockedBy(getHasName(ModItems.ENDERITE.get()), has(ModItems.ENDERITE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("DED")
                .pattern("DsD")
                .pattern("DDD")
                .define('D', Items.DIAMOND)
                .define('E', ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get())
                .define('s', Items.END_STONE)
                .unlockedBy(getHasName(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get()), has(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MINER_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("DED")
                .pattern("DsD")
                .pattern("DDD")
                .define('D', Items.REDSTONE)
                .define('E', ModItems.MINER_UPGRADE_SMITHING_TEMPLATE.get())
                .define('s', Items.STONE)
                .unlockedBy(getHasName(ModItems.MINER_UPGRADE_SMITHING_TEMPLATE.get()), has(ModItems.MINER_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MINER_HELMET.get(), 1)
                .pattern("LIL")
                .pattern("I I")
                .define('I', Items.IRON_INGOT)
                .define('L', Items.LEATHER)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MINER_CHESTPLATE.get(), 1)
                .pattern("L L")
                .pattern("IRI")
                .pattern("LIL")
                .define('I', Items.IRON_INGOT)
                .define('L', Items.LEATHER)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MINER_LEGGINGS.get(), 1)
                .pattern("III")
                .pattern("L L")
                .pattern("L L")
                .define('I', Items.IRON_INGOT)
                .define('L', Items.LEATHER)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MINER_BOOTS.get(), 1)
                .pattern("I I")
                .pattern("L L")
                .define('I', Items.IRON_INGOT)
                .define('L', Items.LEATHER)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .save(pRecipeOutput);


    }


    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }
    private static void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, BetterPvP.MODID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }

    }
    protected static void enderiteSmithing(RecipeOutput pRecipeOutput, Item pIngredientItem, RecipeCategory pCategory, Item pResultItem) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(pIngredientItem), Ingredient.of(ModItems.ENDERITE.get()), pCategory, pResultItem).unlocks("has_enderite", has(ModItems.ENDERITE.get())).save(pRecipeOutput, getItemName(pResultItem) + "_smithing");
    }

    protected static void miningSmithing(RecipeOutput pRecipeOutput, Item pIngredientItem, RecipeCategory pCategory, Item pResultItem) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.MINER_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(pIngredientItem), Ingredient.of(Blocks.REDSTONE_BLOCK), pCategory, pResultItem).unlocks("has_redstone_block", has(Blocks.REDSTONE_BLOCK)).save(pRecipeOutput, getItemName(pResultItem) + "_smithing");
    }
}
