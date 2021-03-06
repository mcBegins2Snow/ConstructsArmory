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

package c4.conarm.common.items.armor;

import c4.conarm.common.ConstructsRegistry;
import c4.conarm.lib.armor.ArmorCore;
import c4.conarm.lib.materials.ArmorMaterialType;
import net.minecraft.inventory.EntityEquipmentSlot;

public class Helmet extends ArmorCore {

    public Helmet(String appearanceName) {
        super(EntityEquipmentSlot.HEAD, appearanceName, ArmorMaterialType.core(ConstructsRegistry.helmetCore));
    }

}
