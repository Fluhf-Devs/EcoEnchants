package com.willfp.ecoenchants.command;

import com.willfp.eco.core.command.CommandHandler;
import com.willfp.eco.core.command.impl.Subcommand;
import com.willfp.ecoenchants.EcoEnchantsPlugin;
import org.jetbrains.annotations.NotNull;

public class CommandReload extends Subcommand {
    /**
     * Instantiate a new command handler.
     *
     * @param plugin The plugin for the commands to listen for.
     */
    public CommandReload(@NotNull final EcoEnchantsPlugin plugin) {
        super(plugin, "reload", "ecoenchants.command.reload", false);
    }

    @Override
    public CommandHandler getHandler() {
        return (sender, args) -> {
            this.getPlugin().reload();
            sender.sendMessage(this.getPlugin().getLangYml().getMessage("reloaded"));
        };
    }
}
