package com.willfp.ecoenchants.mmo.enchants.mana;

import com.willfp.eco.util.events.armorequip.ArmorEquipEvent;
import com.willfp.ecoenchants.enchantments.EcoEnchants;
import com.willfp.ecoenchants.enchantments.meta.EnchantmentType;
import com.willfp.ecoenchants.mmo.structure.MMOEnchantment;
import net.mmogroup.mmolib.MMOLib;
import net.mmogroup.mmolib.api.player.MMOPlayerData;
import net.mmogroup.mmolib.api.stat.SharedStat;
import net.mmogroup.mmolib.api.stat.modifier.StatModifier;
import org.bukkit.entity.Player;

public class Augment extends MMOEnchantment {
    private static final String KEY = "ecoenchants_bonus_mana";

    public Augment() {
        super("augment", EnchantmentType.NORMAL);
    }

    @Override
    public void onArmorEquip(Player player, int level, ArmorEquipEvent event) {
        MMOPlayerData data = MMOPlayerData.get(player);

        data.getStatMap().getInstance(SharedStat.MAX_MANA).remove(KEY);

        if(level == 0) {
            MMOLib.plugin.getStats().runUpdates(data.getStatMap());
            return;
        }

        int mana = this.getConfig().getInt(EcoEnchants.CONFIG_LOCATION + "mana-per-level") * level;

        data.getStatMap().getInstance(SharedStat.MAX_MANA).addModifier(KEY, new StatModifier(mana));

        MMOLib.plugin.getStats().runUpdates(data.getStatMap());
    }
}
