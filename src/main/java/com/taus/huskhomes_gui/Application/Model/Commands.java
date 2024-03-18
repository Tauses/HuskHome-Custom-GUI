package com.taus.huskhomes_gui.Application.Model;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    /**
     * /home command.
     * Plays sound ENTITY_EXPERIENCE_ORB_PICKUP after running command.
     * Pre: Player has permission node for command.
     *
     * @param commandSender
     * @param command
     * @param s
     * @param strings
     * @return
     */
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if (command.getName().equalsIgnoreCase("home", "/homes")){
                HuskHomesGUI plugin = HuskHomesGUI.getPlugin(HuskHomesGUI.class);
                plugin.openGUI(player);
                // SOUND PLAYED WHEN USING COMMAND /HOME
                player.playSound(player.getLocation(), Sound.ENTITY_COW_DEATH, 10, 10);

                return true;
            } else if ()


        } else {
            commandSender.sendMessage("This command can only be used by players.");
        }
        return false;
    }



}
