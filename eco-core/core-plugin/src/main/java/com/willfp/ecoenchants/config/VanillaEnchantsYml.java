package com.willfp.ecoenchants.config;

import com.willfp.eco.core.EcoPlugin;
import com.willfp.eco.core.config.yaml.YamlBaseConfig;
import org.jetbrains.annotations.NotNull;

public class VanillaEnchantsYml extends YamlBaseConfig {
    /**
     * Instantiate target.yml.
     *
     * @param plugin Instance of EcoEnchants.
     */
    public VanillaEnchantsYml(@NotNull final EcoPlugin plugin) {
        super("vanillaenchants", true, plugin);
    }
}
