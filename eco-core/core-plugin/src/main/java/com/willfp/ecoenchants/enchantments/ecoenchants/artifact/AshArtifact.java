package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.eco.util.optional.Prerequisite;
import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import org.bukkit.Particle;
import org.jetbrains.annotations.NotNull;

public class AshArtifact extends Artifact {
    public AshArtifact() {
        super(
                "ash_artifact",
                Prerequisite.MINIMUM_1_16
        );
    }

    @Override
    public @NotNull Particle getParticle() {
        return Particle.WHITE_ASH;
    }
}
