package me.irinque.CampfireHiddenNames.handlers;

import me.irinque.CampfireHiddenNames.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;

public class PlayerJoin implements Listener
{
    static Main plugin = Main.getInstance();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        plugin.GetTeam().AddPlayer(player);
    }
}