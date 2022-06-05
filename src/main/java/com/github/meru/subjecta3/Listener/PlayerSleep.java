package com.github.meru.subjecta3.Listener;

import io.papermc.paper.event.player.PlayerDeepSleepEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * ここではプレイヤーが睡眠を開始したらサーバーにいる全プレイヤーに通知するクソ迷惑な機能を実装します。
 */
public class PlayerSleep implements Listener {

    @EventHandler
    public void onSleep(PlayerDeepSleepEvent e) {
        Player p = e.getPlayer();

        // プレイヤーが寝ているかを確認します。早期returnでネストが深くならないようにします。
        // (もちろん、条件を肯定に変更して {} の中にbroadcastを書いてもいいですが、めるが許しません。)
        // ネストについて: https://wa3.i-3-i.info/word1284.html
        if (!p.isSleeping()) {
            return;
        }

        Bukkit.broadcast(Component.text(p.getName() + "がベッドで寝ています....", NamedTextColor.DARK_PURPLE));
    }

}
