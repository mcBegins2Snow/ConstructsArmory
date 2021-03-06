/*
 * Copyright (c) 2018-2019 <C4>
 *
 * This Java class is distributed as a part of the Construct's Armory mod.
 * Construct's Armory is open source and distributed under the GNU Lesser General Public License v3.
 * View the source code and license file on github: https://github.com/TheIllusiveC4/ConstructsArmory
 *
 * Some classes and assets are taken and modified from the parent mod, Tinkers' Construct.
 * Tinkers' Construct is open source and distributed under the MIT License.
 * View the source code on github: https://github.com/SlimeKnights/TinkersConstruct/
 * View the MIT License here: https://tldrlegal.com/license/mit-license
 */

package c4.conarm.lib.modifiers;

import c4.conarm.lib.ArmoryRegistry;
import c4.conarm.lib.tinkering.TinkersArmor;
import c4.conarm.lib.utils.RecipeMatchHolder;
import com.google.common.collect.ImmutableList;
import net.minecraft.item.ItemStack;
import slimeknights.mantle.util.RecipeMatch;
import slimeknights.tconstruct.tools.modifiers.ToolModifier;

import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;

public abstract class ArmorModifier extends ToolModifier implements IArmorModelModifier {

    public ArmorModifier(String identifier, int color) {
        super(identifier + "_armor", color);
        ArmoryRegistry.registerModifier(this);
    }

    @Override
    public boolean canApplyCustom(ItemStack stack) {

        return stack.getItem() instanceof TinkersArmor;
    }

    @Override
    public List<List<ItemStack>> getItems() {
        ImmutableList.Builder<List<ItemStack>> builder = ImmutableList.builder();
        Optional<PriorityQueue<RecipeMatch>> recipes = RecipeMatchHolder.getRecipes(this);
        if (recipes.isPresent()) {
            PriorityQueue<RecipeMatch> recipeMatches = recipes.get();
            for (RecipeMatch rm : recipeMatches) {
                List<ItemStack> in = rm.getInputs();
                if (!in.isEmpty()) {
                    builder.add(in);
                }
            }
        }

        return builder.build();
    }
}
