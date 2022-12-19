package commands;

import Utils.Booleans;
import Utils.FileConfig;
import Utils.Permissions;
import Utils.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Set_Spawn implements CommandExecutor {

    public static FileConfig spawns = new FileConfig("locations.yml");

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if(Booleans.Set_Spawn == true){
            if(!(commandSender instanceof Player)) {
                commandSender.sendMessage(Strings.need_user);
            }else{
                if(p.hasPermission(Permissions.set_spawn_use)){
                    p.sendMessage(Strings.set_spawn);
                    spawns.set("spawn", Utils.LocationUtils.loc2Str(p.getLocation()));
                    spawns.saveConfig();
                }else{
                    p.sendMessage(Strings.noperms + " (" + Permissions.set_spawn_use + ")");
                }
            }
        }else{
            commandSender.sendMessage(Strings.command_not_enabled);
        }
        return false;
    }
}
