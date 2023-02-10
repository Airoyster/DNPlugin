package de.airoyster.dn;

import de.airoyster.dn.commands.Day_CMD;
import de.airoyster.dn.commands.Night_CMD;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static String prefix =  "§bDN| ";
    public static String con =  "The console can't use the command";
    public static String noPerms =  "§bDN| §cFor this you don't have permissions!";

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getConsoleSender().sendMessage("§bDNPlugin§a activatet!");
        getCommand("night").setExecutor(new Night_CMD());
        getCommand("day").setExecutor(new Day_CMD());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("§bDNPlugin§a deactivatet!");
    }
}
