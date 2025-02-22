package me.irinque.CampfireHiddenNames.handlers;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class PlayerClick implements Listener
{
    @EventHandler
    public void onPlayerClick (PlayerInteractAtEntityEvent event)
    {
        Entity entity_clicked = event.getRightClicked();
        Player player = event.getPlayer();

        if (entity_clicked instanceof Player && !player.isSneaking())
        {
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacy(entity_clicked.getName()));
        }
    }
}