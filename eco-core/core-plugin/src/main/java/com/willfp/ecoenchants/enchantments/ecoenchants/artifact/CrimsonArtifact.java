package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import org.bukkit.Particle;
import org.jetbrains.annotations.NotNull;

public class CrimsonArtifact extends Artifact {
    public CrimsonArtifact() {
        super(
                "crimson_artifact"
        );
    }

    @Override
    public @NotNull Particle getParticle() {
        return Particle.CRIMSON_SPORE;
    }
}
