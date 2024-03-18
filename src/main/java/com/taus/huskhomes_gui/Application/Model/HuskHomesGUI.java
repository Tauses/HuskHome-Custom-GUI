package com.taus.huskhomes_gui.Application.Model;

import org.bukkit.plugin.java.JavaPlugin;

public final class HuskHomesGUI extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("HUSKHOMESGUI by Tauses Starting...");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("HUSKHOMESGUI by Tauses Closing...");
    }
}
