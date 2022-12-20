package commands;

import Utils.Booleans;
import Utils.Permissions;
import Utils.Strings;
import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collections;

public class ServerTools implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (Booleans.ServerTools == true) {
            if (commandSender instanceof Player) {
                if (p.hasPermission(Permissions.server_tools_use)) {
                    Inventory inv = Bukkit.getServer().createInventory(null, 9*3, ChatColor.RED + "" + ChatColor.BOLD + "Server Einstellungen");
                    inv.setItem(0, Items.ServerTools.ST_sign_info);
                    inv.setItem(1, Items.ServerTools.ST_glass_pane);
                    inv.setItem(2, Items.ServerTools.ST_glass_pane);
                    inv.setItem(3, Items.ServerTools.ST_glass_pane);
                    inv.setItem(4, Items.ServerTools.ST_glass_pane);
                    inv.setItem(5, Items.ServerTools.ST_glass_pane);
                    inv.setItem(6, Items.ServerTools.ST_glass_pane);
                    inv.setItem(7, Items.ServerTools.ST_glass_pane);
                    inv.setItem(8, Items.ServerTools.ST_glass_pane);
                    inv.setItem(9, Items.ServerTools.ST_glass_pane);
                    inv.setItem(10, Items.ServerTools.ST_redstone_block);
                    inv.setItem(11, Items.ServerTools.ST_barrier);
                    inv.setItem(12, Items.ServerTools.ST_barrier);
                    inv.setItem(13, Items.ServerTools.ST_barrier);
                    inv.setItem(14, Items.ServerTools.ST_eye_of_ender);
                    inv.setItem(15, Items.ServerTools.ST_barrier);
                    inv.setItem(16, Items.ServerTools.ST_glass_pane);
                    inv.setItem(17, Items.ServerTools.ST_glass_pane);
                    inv.setItem(18, Items.ServerTools.ST_glass_pane);
                    inv.setItem(19, Items.ServerTools.ST_glass_pane);
                    inv.setItem(20, Items.ServerTools.ST_glass_pane);
                    inv.setItem(21, Items.ServerTools.ST_glass_pane);
                    inv.setItem(22, Items.ServerTools.ST_glass_pane);
                    inv.setItem(23, Items.ServerTools.ST_glass_pane);
                    inv.setItem(24, Items.ServerTools.ST_glass_pane);
                    inv.setItem(25, Items.ServerTools.ST_glass_pane);
                    inv.setItem(26, Items.ServerTools.ST_glass_pane);
                    p.openInventory(inv);
                } else {
                    p.sendMessage(Strings.noperms + " (" + Permissions.server_tools_use + ")");
                }
            }
        } else {
            commandSender.sendMessage(Strings.command_not_enabled);
        }
        return false;
    }



    @EventHandler
    public void onClick(InventoryClickEvent e)  {
        if (e.getCurrentItem() == null){ return;}
        e.setCancelled(true);
        Player p = (Player) e.getWhoClicked();
        if(e.getCurrentItem().getType() == Material.REDSTONE_BLOCK){
            if(p.hasPermission(Permissions.server_tools_shutdown)){
                Bukkit.getServer().shutdown();
            } else {
                p.sendMessage(Strings.noperms + " (" + Permissions.server_tools_shutdown + ")");
            }
        }else if(e.getCurrentItem().getType() == Material.ENDER_EYE){
            if(p.hasPermission(Permissions.server_tools_reload)){
                Bukkit.getServer().reload();
                p.sendMessage(Strings.reload);
                p.sendMessage(Strings.noperms + " (" + Permissions.server_tools_reload + ")");
            }
        }
    }

}
