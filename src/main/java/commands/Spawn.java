package commands;

import Utils.Booleans;
import Utils.LocationUtils;
import Utils.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static commands.Set_Spawn.spawns;

public class Spawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;

        if(!(commandSender instanceof Player)) {
            commandSender.sendMessage(Strings.need_user);
        }else{
            if(Booleans.Spawn == true){
                LocationUtils.teleport(p, LocationUtils.str2loc(spawns.getString("spawn")));
            }else{
                p.sendMessage(Strings.command_not_enabled);
            }
        }
        return false;
    }
}
