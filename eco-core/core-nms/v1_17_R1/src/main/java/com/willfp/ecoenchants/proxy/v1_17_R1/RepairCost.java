package com.willfp.ecoenchants.proxy.v1_17_R1;

import com.willfp.ecoenchants.proxy.proxies.RepairCostProxy;
import org.bukkit.craftbukkit.v1_17_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class RepairCost implements RepairCostProxy {
    @Override
    public ItemStack setRepairCost(@NotNull final ItemStack itemStack,
                                   final int cost) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        nmsStack.setRepairCost(cost);
        return CraftItemStack.asBukkitCopy(nmsStack);
    }

    @Override
    public int getRepairCost(@NotNull final ItemStack itemStack) {
        net.minecraft.world.item.ItemStack nmsStack = CraftItemStack.asNMSCopy(itemStack);
        return nmsStack.getRepairCost();
    }
}
