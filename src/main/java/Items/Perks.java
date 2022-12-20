package Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Perks {

        public static ItemStack P_speed = createItem(Material.SUGAR, 1, ChatColor.GREEN + "Speed", ChatColor.GRAY + "Klicke um die Geschwindigkeit zu erhöhen.");
        public static ItemStack P_jump = createItem(Material.FEATHER, 1, ChatColor.GREEN + "Jump", ChatColor.GRAY + "Klicke um die Sprungkraft zu erhöhen.");
        public static ItemStack P_Barrier = createItem(Material.BARRIER, 1, ChatColor.RED + "Cooming Soon.", "Dieses Feature ist noch nicht", "verfügbar.");
        public static ItemStack P_dont_have_this_perk = createItem(Material.BARRIER, 1, ChatColor.RED + "Du besitzt dieses Perk nicht.", "Du besitzt dieses Perk ", "nicht.");
        public static ItemStack P_glass_pane = createItem(Material.BLACK_STAINED_GLASS_PANE, 1, ChatColor.BLACK + " ");

        public static ItemStack createItem(Material material, int amount, String displayName, String... lore) {
            ItemStack item = new ItemStack(material, amount);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(displayName);
            meta.setLore(Arrays.asList(lore));
            item.setItemMeta(meta);
            return item;
        }

}
