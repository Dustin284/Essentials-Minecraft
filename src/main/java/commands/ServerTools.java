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
                    inv.setItem(0, sign_info);
                    inv.setItem(1, glass_pane);
                    inv.setItem(2, glass_pane);
                    inv.setItem(3, glass_pane);
                    inv.setItem(4, glass_pane);
                    inv.setItem(5, glass_pane);
                    inv.setItem(6, glass_pane);
                    inv.setItem(7, glass_pane);
                    inv.setItem(8, glass_pane);
                    inv.setItem(9, glass_pane);
                    inv.setItem(10, redstone_block);
                    inv.setItem(11, barrier);
                    inv.setItem(12, barrier);
                    inv.setItem(13, barrier);
                    inv.setItem(14, eye_of_ender);
                    inv.setItem(15, barrier);
                    inv.setItem(16, glass_pane);
                    inv.setItem(17, glass_pane);
                    inv.setItem(18, glass_pane);
                    inv.setItem(19, glass_pane);
                    inv.setItem(20, glass_pane);
                    inv.setItem(21, glass_pane);
                    inv.setItem(22, glass_pane);
                    inv.setItem(23, glass_pane);
                    inv.setItem(24, glass_pane);
                    inv.setItem(25, glass_pane);
                    inv.setItem(26, glass_pane);
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

    private static ItemStack sign_info = createItem(Material.OAK_SIGN, 1, ChatColor.GREEN + "Information", "Hier kannst du die Server Einstellungen ändern", "und den Server Verwalten.");
    private static ItemStack barrier = createItem(Material.BARRIER, 1, ChatColor.RED + "Cooming Soon.", "Dieses Feature ist noch nicht", "verfügbar.");
    private static ItemStack eye_of_ender = createItem(Material.ENDER_EYE, 1, ChatColor.GREEN + "Neu Laden", ChatColor.GRAY + "Hier kannst du den Server neu Laden.");
    private static ItemStack glass_pane = createItem(Material.BLACK_STAINED_GLASS_PANE, 1, ChatColor.BLACK + " ");
    private static ItemStack redstone_block = createItem(Material.REDSTONE_BLOCK, 1, ChatColor.RED + "Server Herunterfahren", ChatColor.GRAY + "Klicke um den Server herunterzufahren");
    private static ItemStack createItem(Material material, int amount, String displayName, String... lore) {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);
        return item;
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
                p.sendMessage("ja");
                p.sendMessage(Strings.noperms + " (" + Permissions.server_tools_reload + ")");
            }
        }
    }

}
