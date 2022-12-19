package commands;

import Utils.Booleans;
import Utils.Permissions;
import Utils.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static Utils.Strings.*;

public class Workbench implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(Booleans.Workbench == true) {
            Player p = (Player) sender;
            if (!(sender instanceof Player)) {
                sender.sendMessage(need_user);
            } else {
                if (p.hasPermission(Permissions.workbench_use)) {
                    if (args.length == 0) {
                        p.openWorkbench(null, true);
                    } else {
                        p.sendMessage(workbench_usage);
                    }
                } else {
                    p.sendMessage(noperms + " (" + Permissions.workbench_use + ")");
                }
            }
        }else{
            sender.sendMessage(command_not_enabled);
        }
        return false;
    }
}

