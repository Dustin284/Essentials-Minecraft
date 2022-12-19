package commands;

import Utils.Permissions;
import Utils.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Backpack implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (!(sender instanceof Player)){
            sender.sendMessage(Strings.need_user);
        }else{
            if(p.hasPermission(Permissions.backpack_use)){
                if(args.length == 0){
                    p.openInventory(p.getInventory());
                }else{
                    p.sendMessage(Strings.backpack_usage);
                }
            }else{
                p.sendMessage(Strings.noperms);
            }
        }
        return false;
    }
}
