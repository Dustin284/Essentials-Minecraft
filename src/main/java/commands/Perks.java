package commands;

import Utils.Booleans;
import Utils.Permissions;
import Utils.Strings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Perks implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(Booleans.Perks == true){
            if(!(sender instanceof Player)){
                sender.sendMessage(Strings.need_user);
            }else{
                if(p.hasPermission(Permissions.perks_use) || p.hasPermission(Permissions.perks_use_all)){
                    Inventory inv = Bukkit.getServer().createInventory(null, 9*3, ChatColor.RED + "" + ChatColor.BOLD + "Perks");
                    inv.setItem(1-9, Items.Perks.P_glass_pane);
                    inv.setItem(10-15, Items.Perks.P_Barrier);
                    inv.setItem(16-26, Items.Perks.P_glass_pane);
                    p.openInventory(inv);
                    if(p.hasPermission(Permissions.perks_use_all) || p.hasPermission(Permissions.perks_speed)){
                        inv.setItem(1-9, Items.Perks.P_glass_pane);
                        inv.setItem(10, Items.Perks.P_speed);
                        inv.setItem(12-15, Items.Perks.P_Barrier);
                        inv.setItem(16-26, Items.Perks.P_glass_pane);
                        p.openInventory(inv);
                    }
                }else{
                    p.sendMessage(Strings.noperms + " (" + Permissions.perks_use + ")");
                }
            }
        }else{
            sender.sendMessage(Strings.command_not_enabled);
        }
        return false;
    }

    @EventHandler
    private void onClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Speed")){
            if(p.hasPermission(Permissions.perks_speed)) {
                p.sendMessage(Strings.perks_Speed_ac);
            }else{
                p.sendMessage(Strings.noperms + " (" + Permissions.perks_speed + ")");
            }
        }
    }
}
