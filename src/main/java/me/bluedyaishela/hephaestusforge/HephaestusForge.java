package me.bluedyaishela.hephaestusforge;

import me.bluedyaishela.hephaestusforge.events.PlayerJoin;
import me.bluedyaishela.hephaestusforge.events.SwapCancel;
import me.bluedyaishela.hephaestusforge.events.SwordGestion;
import org.bukkit.plugin.java.JavaPlugin;

public final class HephaestusForge extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new SwapCancel(), this);
        this.getServer().getPluginManager().registerEvents(new SwordGestion(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
