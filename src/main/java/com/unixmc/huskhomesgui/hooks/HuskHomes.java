package com.unixmc.huskhomesgui.hooks;

import com.unixmc.huskhomesgui.HuskHomesGUI;
import lombok.Getter;
import net.william278.huskhomes.api.HuskHomesAPI;
import org.bukkit.Bukkit;

public class HuskHomes {
  
  @Getter
  private static HuskHomesAPI huskHomesAPI;
  
  public static void load() {
    if (Bukkit.getPluginManager().getPlugin("HuskHomes") == null)
      Bukkit.getPluginManager().disablePlugin(HuskHomesGUI.getInstance());
    huskHomesAPI = HuskHomesAPI.getInstance();
  }
  
}
