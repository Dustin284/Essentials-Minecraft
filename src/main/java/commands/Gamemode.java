package commands;

import Utils.Permissions;
import Utils.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Strings.need_user);
        } else {
            Player p = (Player) sender;
            if (p.hasPermission(Permissions.gm_use)) {
                if (args.length == 0) {
                    p.sendMessage(Strings.gm_usage);
                } else if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("0")) {
                        p.setGameMode(org.bukkit.GameMode.SURVIVAL);
                        p.sendMessage(Strings.gm0);
                    } else if (args[0].equalsIgnoreCase("1")) {
                        p.setGameMode(org.bukkit.GameMode.CREATIVE);
                        p.sendMessage(Strings.gm1);
                    } else if (args[0].equalsIgnoreCase("2")) {
                        p.setGameMode(org.bukkit.GameMode.ADVENTURE);
                        p.sendMessage(Strings.gm2);
                    } else if (args[0].equalsIgnoreCase("3")) {
                        p.setGameMode(org.bukkit.GameMode.SPECTATOR);
                        p.sendMessage(Strings.gm3);
                    } else {
                        p.sendMessage(Strings.gm_usage);
                    }
                }
            }
        }
        return false;
    }
}