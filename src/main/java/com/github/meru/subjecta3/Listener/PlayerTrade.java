package com.github.meru.subjecta3.Listener;

import io.papermc.paper.event.player.PlayerTradeEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * ここではプレイヤーが村人との取引を開始したらサーバーにいる全プレイヤーに通知するクソ迷惑な機能を実装します。
 */
public class PlayerTrade implements Listener {

    @EventHandler
    public void onTrade(PlayerTradeEvent e) {
        // 村人はエンティティなので型はEntity
        Entity tradeTarget = e.getVillager();
        Bukkit.broadcast(Component.text(e.getPlayer().getName() + "が" + tradeTarget.getName() + "と取引しました"));
    }

}
