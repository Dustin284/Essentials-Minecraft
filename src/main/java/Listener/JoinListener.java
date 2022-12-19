package Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public static void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        e.setJoinMessage("§7[§a+§7] §a" + player.getName());
    }
}
