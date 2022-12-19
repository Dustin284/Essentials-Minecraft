package commands;

import Utils.Permissions;
import Utils.Strings;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Disable implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender.hasPermission(Permissions.disable_command_use)){
            if(strings.length == 0){
                commandSender.sendMessage(Strings.comand_speicfy);
            }else{
                if(strings[0].equalsIgnoreCase("fly")){
                    Utils.Booleans.Fly = false;
                    commandSender.sendMessage(Strings.command_disabled + ChatColor.AQUA + " Fly");
                }else if(strings[0].equalsIgnoreCase("gamemode")){
                    Utils.Booleans.Gamemode = false;
                    commandSender.sendMessage(Strings.command_disabled + ChatColor.AQUA + " Gamemode");
                }else if(strings[0].equalsIgnoreCase("heal")){
                    Utils.Booleans.Heal = false;
                    commandSender.sendMessage(Strings.command_disabled + ChatColor.AQUA + " Heal");
                }else if(strings[0].equalsIgnoreCase("workbench")){
                    Utils.Booleans.Workbench = false;
                    commandSender.sendMessage(Strings.command_disabled + ChatColor.AQUA + " Workbench");
                }else{
                    commandSender.sendMessage(Strings.command_dosent_exist);
                }
            }
        }else{
            commandSender.sendMessage(Strings.noperms + " (" + Permissions.disable_command_use + ")");
        }
        return false;
    }
}

