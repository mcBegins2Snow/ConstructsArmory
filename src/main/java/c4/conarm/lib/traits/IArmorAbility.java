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

package c4.conarm.lib.traits;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.ModifierNBT;

public interface IArmorAbility {

    /**
     * Determines how the ability level used in {@link c4.conarm.lib.traits.IArmorTrait#onAbilityTick(int, World, EntityPlayer)}
     * is calculated
     * @param data The ModifierNBT data for the ItemStack that has the trait or modifier
     * @return The level amount for an instance of the trait or modifier on an ItemStack
     */
    int getAbilityLevel(ModifierNBT data);
}
