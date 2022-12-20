package Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ServerTools {



    public static ItemStack ST_sign_info = createItem(Material.OAK_SIGN, 1, ChatColor.GREEN + "Information", "Hier kannst du die Server Einstellungen ändern", "und den Server Verwalten.");
    public static ItemStack ST_barrier = createItem(Material.BARRIER, 1, ChatColor.RED + "Cooming Soon.", "Dieses Feature ist noch nicht", "verfügbar.");
    public static ItemStack ST_eye_of_ender = createItem(Material.ENDER_EYE, 1, ChatColor.GREEN + "Neu Laden", ChatColor.GRAY + "Hier kannst du den Server neu Laden.");
    public static ItemStack ST_glass_pane = createItem(Material.BLACK_STAINED_GLASS_PANE, 1, ChatColor.BLACK + " ");
    public static ItemStack ST_redstone_block = createItem(Material.REDSTONE_BLOCK, 1, ChatColor.RED + "Server Herunterfahren", ChatColor.GRAY + "Klicke um den Server herunterzufahren");

    public static ItemStack createItem(Material material, int amount, String displayName, String... lore) {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);
        return item;
    }


}
