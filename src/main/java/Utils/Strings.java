package Utils;

import org.bukkit.ChatColor;

public class Strings {

    // Prefix and Utils
    public static String prefix = ChatColor.GRAY + "[ " + ChatColor.AQUA + "ESSENTIALS" + ChatColor.GRAY + " ] " + ChatColor.RESET;
    public static String noperms = prefix + ChatColor.RED + "Du hast keine Berechtigung für diesen Befehl!";
    public static String need_user = prefix + ChatColor.RED + "Du musst ein Spieler sein!";


    // Gamemode command
    public static String gm_usage = prefix + ChatColor.RED + "Bitte benutze /gm <0/1/2/3>";
    public static String gm0 = prefix + ChatColor.GREEN + "Dein Gamemode wurde auf §a0 §agesetzt!";
    public static String gm1 = prefix + ChatColor.GREEN + "Dein Gamemode wurde auf §a1 §agesetzt!";
    public static String gm2 = prefix + ChatColor.GREEN + "Dein Gamemode wurde auf §a2 §agesetzt!";
    public static String gm3 = prefix + ChatColor.GREEN + "Dein Gamemode wurde auf §a3 §agesetzt!";


}