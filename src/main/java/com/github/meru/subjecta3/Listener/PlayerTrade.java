package com.github.meru.subjecta3.Listener;

import io.papermc.paper.event.player.PlayerTradeEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerTrade implements Listener {

    @EventHandler
    public void onTrade(PlayerTradeEvent e) {
        Entity tradeTarget = e.getVillager();

        Bukkit.broadcast(Component.text(e.getPlayer().getName() + "が" + tradeTarget.getName() + "と取引しました"));
    }
}
