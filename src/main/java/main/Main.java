package main;

import Listener.JoinListener;
import Listener.QuitListener;
import commands.ChatClear;
import commands.ServerTools;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {


    @Override
    public void onEnable() {

        //Import Listener
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new QuitListener(), this);
        getServer().getPluginManager().registerEvents(new ServerTools(), this);

        //Import Commands
        getCommand("gm").setExecutor(new commands.Gamemode());
        getCommand("fly").setExecutor(new commands.Fly());
        getCommand("heal").setExecutor(new commands.Heal());
        getCommand("wb").setExecutor(new commands.Workbench());
        getCommand("enable").setExecutor(new commands.Enable());
        getCommand("disable").setExecutor(new commands.Disable());
        getCommand("setspawn").setExecutor(new commands.Set_Spawn());
        getCommand("spawn").setExecutor(new commands.Spawn());
        getCommand("servertools").setExecutor(new commands.ServerTools());
        getCommand("chatclear").setExecutor(new ChatClear());
        //TODO Enderchest
        //TODO Feed
        //TODO Hat
        //TODO Backpack
        //TODO Build
        //TODO Clear
        //TODO Alwyas Night / Day
        //TODO Always Toogleodwnfall
        //TODO Broadcast
        //TODO Perks
    }

    @Override
    public void onDisable() {
    }
}
