package Utils;

import org.bukkit.ChatColor;

public class Strings {
    // Prefix and Utils
    public static String prefix = ChatColor.GRAY + "[ " + ChatColor.AQUA + "ESSENTIALS" + ChatColor.GRAY + " ] " + ChatColor.RESET;
    public static String noperms = prefix + ChatColor.RED + "Du hast keine Berechtigung für diesen Befehl!";
    public static String need_user = prefix + ChatColor.RED + "Du musst ein Spieler sein!";
    public static String command_not_enabled = prefix + ChatColor.RED + "Dieser Befehl ist nicht aktiviert!";

    // Enable command
    public static String comand_speicfy = prefix + ChatColor.RED + "Bitte gebe einen Befehl zum aktivieren an.";
    public static String command_enabled = prefix + ChatColor.GREEN + "Der Befehl wurde erfolgreich aktiviert!";
    public static String command_dosent_exist = prefix + ChatColor.RED + "Dieser Befehl existiert nicht!";

    // Disable command
    public static String command_disabled = prefix + ChatColor.RED + "Der Befehl wurde erfolgreich deaktiviert!";
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
    //Workbench command
    public static String workbench_usage = prefix + ChatColor.RED + "Bitte benutze /wb";
    //SetSpawn command
    public static String set_spawn = prefix + ChatColor.GREEN + "Der Spawn wurde erfolgreich gesetzt!";
    //Spawn command
    public static String spawn = prefix + ChatColor.GREEN + "Du wurdest zum Spawn teleportiert!";
    //ServerTools command
    public static String reload = prefix + ChatColor.GREEN + "Der Server wurde erfolgreich neugeladen!";
    //Perks command
    public static String perks_usage = prefix + ChatColor.RED + "Bitte benutze /perks";
    public static String perk_dont_get = prefix + ChatColor.RED + "Du hast diesen Perk nicht!";
    public static String perks_Speed_ac = prefix + ChatColor.GRAY + "Du hast das " + ChatColor.DARK_AQUA +  "Speed" + ChatColor.GRAY + " Perk" + ChatColor.GREEN + " aktiviert!";
    public static String perks_Speed_dc = prefix + ChatColor.GRAY + "Du hast das " + ChatColor.DARK_AQUA +  "Speed" + ChatColor.GRAY + " Perk" + ChatColor.RED + " deaktiviert!";
    public static String perks_Jump_ac = prefix + ChatColor.GRAY + "Du hast das " + ChatColor.DARK_AQUA +  "Jump" + ChatColor.GRAY + " Perk" + ChatColor.GREEN + " aktiviert!";
    public static String perks_Jump_dc = prefix + ChatColor.GRAY + "Du hast das " + ChatColor.DARK_AQUA +  "Jump" + ChatColor.GRAY + " Perk" + ChatColor.RED + " deaktiviert!";


}