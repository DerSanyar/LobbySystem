package me.sanyar.main;

import me.sanyar.managers.CLManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private final String prefix = "§7[§eLobby§6System§7] ";

    private static Main INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
        Bukkit.getConsoleSender().sendMessage(prefix+"§astarting §eLobby§6System. §8| §3v"+getDescription().getVersion());
        CLManager.init();
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(prefix+"§cShutting down §eLobby§6System.");

    }

    public String getPrefix() {
        return prefix;
    }

    public static Main getInstance() {
        return INSTANCE;
    }
}
