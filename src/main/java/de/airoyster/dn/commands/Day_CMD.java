package de.airoyster.dn.commands;

import de.airoyster.dn.Main;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Day_CMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

            if (!(sender instanceof Player)) {
                sender.sendMessage(Main.con);
                return false;
            }
            Player p = (Player) sender;
            if (p.hasPermission("system.day")) {
                if (args.length == 0) {
                    World w = p.getWorld();
                    w.setTime(1000);
                    Bukkit.broadcastMessage(Main.prefix + "§e" + p.getDisplayName() + " §eset the time to §9day");
                } else {
                    sender.sendMessage(Main.prefix + "§cError! §aPlease use '/day'");
                }
            } else {
                p.sendMessage(Main.noPerms);
            }

            return false;

        }
    }