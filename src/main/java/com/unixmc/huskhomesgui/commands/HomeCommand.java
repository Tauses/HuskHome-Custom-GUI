package com.unixmc.huskhomesgui.commands;

import com.unixmc.huskhomesgui.gui.HomeGui;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HomeCommand implements CommandExecutor {
  
  /**
   * /home command.
   * Plays sound ENTITY_EXPERIENCE_ORB_PICKUP after running command.
   * Pre: Player has permission node for command.
   *
   * @param sender
   * @param command
   * @param label
   * @param args
   * @return
   */
  
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (!(sender instanceof Player player)) {
      sender.sendMessage("This command can only be used by players.");
      return false;
    }
    
    new HomeGui(player);
    player.playSound(player, Sound.ENTITY_COW_DEATH, 10, 10);
    
    return true;
  }
  
}
