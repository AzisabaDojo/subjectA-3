package com.github.meru.subjecta3.Listener;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class GamemodeChange implements Listener {

    @EventHandler
    public void onChangeMode(PlayerGameModeChangeEvent e) {
        Player p = e.getPlayer();

        Bukkit.broadcast(Component.text(p.getName() + "が" + p.getGameMode() + "に変更しました。"));
    }
}
