package commands;

import Utils.Booleans;
import Utils.Permissions;
import Utils.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChatClear implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(Booleans.ChatClear == true){
            if(p.hasPermission(Permissions.ChatClear_use)){
                for(int i = 0; i < 201; i++){
                    sender.getServer().broadcastMessage(Strings.ChatClear);
                }
                sender.getServer().broadcastMessage(Strings.ChatCleat_Top);
                sender.getServer().broadcastMessage(Strings.ChatClear_Middle);
                sender.getServer().broadcastMessage(Strings.ChatCleat_Down);
            }else{
                p.sendMessage(Strings.noperms);
            }
        }else{
            p.sendMessage(Strings.command_not_enabled);
        }
        return false;
    }
}
