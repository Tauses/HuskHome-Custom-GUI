package com.unixmc.huskhomesgui;

import com.unixmc.huskhomesgui.commands.HomeCommand;
import fr.mrmicky.fastinv.FastInvManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class HuskHomesGUI extends JavaPlugin {
  
  @Getter
  private static HuskHomesGUI instance;
  
  @Override
  public void onEnable() {
    instance = this;
    FastInvManager.register(this);
    Config.load();
    getCommand("home").setExecutor(new HomeCommand());
  }
  
  @Override
  public void onDisable() {
  }
  
}
