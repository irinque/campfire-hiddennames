package me.irinque.CampfireHiddenNames;

import me.irinque.CampfireHiddenNames.handlers.PlayerJoin;
import me.irinque.CampfireHiddenNames.loaders.PluginTeam;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin
{
    public static Main instance;
    public static Main getInstance() {return instance;}

    private PluginTeam team_plugin;

    public PluginTeam GetTeam() {
        return team_plugin;
    }

    @Override
    public void onEnable()
    {
        if (instance == null) {instance = this;}

        team_plugin = new PluginTeam();

        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

        getServer().getLogger().info("[CHN] Plugin is ready");

    }

    @Override
    public void onDisable()
    {
        if (instance != null) {instance = null;}
        team_plugin.UnRegisterTeam();
        getServer().getLogger().info("[CHN] Plugin was shutdown!");
    }
}
