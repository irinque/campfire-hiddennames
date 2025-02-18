package me.irinque.CampfireHiddenNames.loaders;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;
import org.bukkit.scoreboard.Team.Option;
import org.bukkit.scoreboard.Team.OptionStatus;

public class PluginTeam
{
    private Team team_plugin;
    private Scoreboard scoreboard;

    public PluginTeam ()
    {
        ScoreboardManager scoreboardmanager = Bukkit.getScoreboardManager();
        scoreboard = scoreboardmanager.getNewScoreboard();
        team_plugin = scoreboard.registerNewTeam("CHN");
        team_plugin.setCanSeeFriendlyInvisibles(false);
        team_plugin.setOption(Option.NAME_TAG_VISIBILITY, OptionStatus.NEVER);
    }

    public void AddPlayer (Player player_joined)
    {
        player_joined.setScoreboard(scoreboard);
        team_plugin.addPlayer(player_joined);
    }

    public void UnRegisterTeam ()
    {
        if (team_plugin != null){team_plugin.unregister();}
    }

}
