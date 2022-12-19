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
    }

    @Override
    public void onDisable() {
    }
}
