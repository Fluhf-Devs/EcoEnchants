package com.willfp.ecoenchants.enchantments.ecoenchants.normal;

import com.willfp.ecoenchants.enchantments.EcoEnchant;
import com.willfp.ecoenchants.enchantments.meta.EnchantmentType;
import com.willfp.ecoenchants.enchantments.util.EnchantmentUtils;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.jetbrains.annotations.NotNull;

public class Arcanic extends EcoEnchant {
    public Arcanic() {
        super(
                "arcanic", EnchantmentType.NORMAL
        );
    }

    @Override
    public void onDamageWearingArmor(@NotNull final LivingEntity victim,
                                     final int level,
                                     @NotNull final EntityDamageEvent event) {
        if (!(event.getCause().equals(EntityDamageEvent.DamageCause.POISON) || event.getCause().equals(EntityDamageEvent.DamageCause.WITHER))) {
            return;
        }

        if (!EnchantmentUtils.passedChance(this, level)) {
            return;
        }

        event.setCancelled(true);
    }
}
