package com.growlyx;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

public final class moose extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("HubCoreX Verifying Licence...");
        System.out.println("HubCoreX Has Been Verified");
        System.out.println("HubCoreX V1.0 Has Been Enabled.");
        System.out.println("For the PVPX Network, by GrowlyX");

        getCommand("heal").setExecutor(new HealCommand());
        getCommand("fly").setExecutor(new flyCommand());
        getCommand("number").setExecutor(new numberCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("HubCoreX V1.0 Has Been Disabled.");
        System.out.println("Goodbye!");
    }

}