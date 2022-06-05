package com.github.meru.subjecta3;

import com.github.meru.subjecta3.Listener.GamemodeChange;
import com.github.meru.subjecta3.Listener.PlayerJoin;
import com.github.meru.subjecta3.Listener.PlayerSleep;
import com.github.meru.subjecta3.Listener.PlayerTrade;
import org.bukkit.plugin.java.JavaPlugin;

public final class SubjectA3 extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerSleep(), this);
        getServer().getPluginManager().registerEvents(new PlayerTrade(), this);
        getServer().getPluginManager().registerEvents(new GamemodeChange(), this);
    }

}
