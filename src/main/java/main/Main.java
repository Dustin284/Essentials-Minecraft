package main;

import Listener.JoinListener;
import Listener.QuitListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {


    @Override
    public void onEnable() {

        //Import Listener
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new QuitListener(), this);

        //Import Commands
        getCommand("gm").setExecutor(new commands.Gamemode());
        getCommand("fly").setExecutor(new commands.Fly());
        getCommand("heal").setExecutor(new commands.Heal());
        getCommand("wb").setExecutor(new commands.Workbench());
        getCommand("enable").setExecutor(new commands.Enable());
        getCommand("disable").setExecutor(new commands.Disable());
        getCommand("setspawn").setExecutor(new commands.Set_Spawn());
        getCommand("spawn").setExecutor(new commands.Spawn());
    }

    @Override
    public void onDisable() {
    }
}
