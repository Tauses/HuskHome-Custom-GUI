package com.unixmc.huskhomesgui.gui;

import fr.mrmicky.fastinv.FastInv;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HomeGui extends FastInv {
  
  public HomeGui(Player player) {
    super(9, "Homes");
    setItem(2, new ItemStack(Material.DARK_OAK_DOOR), event -> {
      player.sendMessage("set a home");
      player.closeInventory();
    });
    setItem(5, new ItemStack(Material.CHERRY_DOOR), event -> {
      player.sendMessage("Set another home");
      player.closeInventory();
    });
    open(player);
  }
  
}
