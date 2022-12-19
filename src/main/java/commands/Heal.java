package commands;

import Utils.Booleans;
import Utils.Permissions;
import Utils.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(Booleans.Heal == true) {
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
                }
            }
        }else{
            sender.sendMessage(Strings.command_not_enabled);
        }
        return false;
    }
}
