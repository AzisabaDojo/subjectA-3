package com.github.meru.subjecta3.Listener;

import io.papermc.paper.event.player.PlayerDeepSleepEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerSleep implements Listener {

    @EventHandler
    public void onSleep(PlayerDeepSleepEvent e) {
        Player p = e.getPlayer();

        if (!p.isSleeping()) {
            return;
        }

        Bukkit.broadcast(Component.text(p.getName() + "がベッドで寝ています....", NamedTextColor.DARK_PURPLE));
    }
}
