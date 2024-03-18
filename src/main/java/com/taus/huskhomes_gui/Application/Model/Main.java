package com.taus.huskhomes_gui.Application.Model;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("HUSKHOMESGUI by Tauses Starting...");
        this.getCommand("home").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("HUSKHOMESGUI by Tauses Closing...");
    }

    public void openGUI(Player player) {
        Inventory GUI = Bukkit.createInventory(null,9, "Homes");

        ItemStack item1 = new ItemStack(Material.DARK_OAK_DOOR);
        ItemStack item2 = new ItemStack(Material.CHERRY_DOOR);

        GUI.setItem(2, item1);
        GUI.setItem(5,item2);

        player.openInventory(GUI);


    }


}
