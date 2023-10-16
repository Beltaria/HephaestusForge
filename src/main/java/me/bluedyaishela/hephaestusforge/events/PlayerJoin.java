package me.bluedyaishela.hephaestusforge.events;

import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Dye;
import org.bukkit.material.MaterialData;

public class PlayerJoin implements Listener {
    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        PlayerInventory playerInventory = player.getInventory();
        player.setGameMode(GameMode.ADVENTURE);

        ItemStack playerSlot2 = playerInventory.getItem(1);
        ItemStack playerSlot3 = playerInventory.getItem(2);
        ItemStack playerSlot4 = playerInventory.getItem(3);
        ItemStack playerSlot5 = playerInventory.getItem(4);
        ItemStack playerSlot6 = playerInventory.getItem(5);
        ItemStack playerSlot7 = playerInventory.getItem(6);
        ItemStack playerSlot8 = playerInventory.getItem(7);
        ItemStack playerSlot9 = playerInventory.getItem(8);

        ItemStack grayGlass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7);

        ItemStack redGlass = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
        ItemMeta redGlassItemMeta = redGlass.getItemMeta();
        redGlassItemMeta.setDisplayName("§cObjet non débloqué");
        redGlass.setItemMeta(redGlassItemMeta);

        if (playerSlot2 == null) playerInventory.setItem(1, redGlass);
        if (playerSlot3 == null) playerInventory.setItem(2, redGlass);

        if (playerSlot4 == null) playerInventory.setItem(3, grayGlass);
        if (playerSlot5 == null) playerInventory.setItem(4, grayGlass);
        if (playerSlot6 == null) playerInventory.setItem(5, grayGlass);
        if (playerSlot7 == null) playerInventory.setItem(6, grayGlass);

        if (playerSlot8 == null) playerInventory.setItem(7, new ItemStack(Material.ENDER_CHEST));
        if (playerSlot9 == null) playerInventory.setItem(8, new ItemStack(Material.COMPASS));

    }
}
