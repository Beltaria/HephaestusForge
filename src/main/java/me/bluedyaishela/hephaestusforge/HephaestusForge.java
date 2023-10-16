package me.bluedyaishela.hephaestusforge;

import me.bluedyaishela.hephaestusforge.events.ArmorSwapCancel;
import org.bukkit.plugin.java.JavaPlugin;

public final class HephaestusForge extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new ArmorSwapCancel(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
