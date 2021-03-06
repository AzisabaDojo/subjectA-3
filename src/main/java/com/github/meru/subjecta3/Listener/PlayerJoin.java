package com.github.meru.subjecta3.Listener;

import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * ここではプレイヤーが参加したらサーバーにいる全プレイヤーに通知する機能を実装します。
 */
public class PlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.joinMessage(Component.text(e.getPlayer().getName() + "がサーバーに参加しました"));
    }

}
