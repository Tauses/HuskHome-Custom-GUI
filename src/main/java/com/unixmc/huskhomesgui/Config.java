package com.unixmc.huskhomesgui;

import java.io.File;

public class Config {
  
  private static File file = new File(HuskHomesGUI.getInstance().getDataFolder(), "config.yml");
  
  public static void load() {
    if (!file.exists())
      HuskHomesGUI.getInstance().saveResource("config.yml", false);
  }
  
}
