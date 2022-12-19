package commands;

import Utils.Permissions;
import Utils.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (!(sender instanceof Player)) {
            sender.sendMessage(Strings.need_user);
        } else {
            if (args.length == 0) {
                if (p.hasPermission(Permissions.heal_use)) {
                    if (args.length == 0) {
                        p.setHealth(20);
                        p.sendMessage(Strings.heal);
                    } else {
                        p.sendMessage(Strings.heal_usage + " (" + Permissions.heal_use + ")");
                    }
                }

            } else if (args.length == 1) {
                if (p.hasPermission(Permissions.heal_other)) {
                    if (args.length == 1) {
                        Player target = p.getServer().getPlayer(args[1]);
                        target.setHealth(20);
                        p.sendMessage(Strings.heal);
                    } else {
                        p.sendMessage(Strings.heal_usage);
                    }
                } else {
                    p.sendMessage(Strings.noperms + " (" + Permissions.heal_other + ")");
                    }
                }
            }
        return false;
    }
}
