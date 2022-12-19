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
    // Fly command
    public static String fly_usage = prefix + ChatColor.RED + "Bitte benutze /fly <on/off>";
    public static String fly_on = prefix + ChatColor.GREEN + "Du kannst nun fliegen!";
    public static String fly_off = prefix + ChatColor.RED + "Du kannst nun nicht mehr fliegen!";
    // Heal command
    public static String heal_usage = prefix + ChatColor.RED + "Bitte benutze /heal <Spieler>";
    public static String heal = prefix + ChatColor.GREEN + "Du wurdest geheilt!";
    public static String heal_other = prefix + ChatColor.GREEN + "Du hast den Spieler geheilt!";
    //Backpack command
    public static String backpack_usage = prefix + ChatColor.RED + "Bitte benutze /bp";
    //Workbench command
    public static String workbench_usage = prefix + ChatColor.RED + "Bitte benutze /wb";
}