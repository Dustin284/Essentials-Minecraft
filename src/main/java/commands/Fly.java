package commands;

import Utils.Permissions;
import Utils.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(!(sender instanceof Player)){
            sender.sendMessage(Strings.need_user);
            return true;
        }else{
            if(p.hasPermission(Permissions.fly_use)){
                if(args.length == 0) {
                    p.sendMessage(Strings.fly_usage);
                }else if(args.length == 1){
                    if(args[0].equalsIgnoreCase("on")) {
                        p.setAllowFlight(true);
                        p.sendMessage(Strings.fly_on);
                    }else if(args[0].equalsIgnoreCase("off")) {
                        p.setAllowFlight(false);
                        p.sendMessage(Strings.fly_off);
                    }else{
                        p.sendMessage(Strings.fly_usage);
                    }
                }else{
                    p.sendMessage(Strings.fly_usage);
                }
            }else{
                p.sendMessage(Strings.noperms + " (" + Permissions.fly_use + ")");
            }
        }

        return false;
    }
}
