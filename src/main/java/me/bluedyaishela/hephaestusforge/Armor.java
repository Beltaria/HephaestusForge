package me.bluedyaishela.hephaestusforge;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Armor implements Listener {

    @EventHandler
    private void onConnect(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        PlayerInventory playerInventory = player.getInventory();

        ItemStack playerHelmet = playerInventory.getHelmet();
        ItemStack playerChestplate = playerInventory.getChestplate();
        ItemStack playerLeggings = playerInventory.getLeggings();
        ItemStack playerBoots = playerInventory.getBoots();

        if (playerHelmet == null)
        {
            ItemStack itemStackHelmet = new ItemStack(Material.LEATHER_HELMET);
            playerInventory.setHelmet(itemStackHelmet);
            player.sendMessage("Casque donné avec succès !");
        }
        if (playerChestplate == null)
        {
            ItemStack itemStackChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
            playerInventory.setChestplate(itemStackChestplate);
            player.sendMessage("Plastron donné avec succès !");
        }
        if (playerLeggings == null)
        {
            ItemStack itemStackLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
            playerInventory.setLeggings(itemStackLeggings);
            player.sendMessage("Pantalon donné avec succès !");
        }
        if (playerBoots == null)
        {
            ItemStack itemStackBoots = new ItemStack(Material.LEATHER_BOOTS);
            playerInventory.setBoots(itemStackBoots);
            player.sendMessage("Bottes données avec succès !");
        }
    }

    @EventHandler
    private void onPlayerArmor(InventoryClickEvent event)
    {
        InventoryType.SlotType slotType = event.getSlotType();
        if (slotType == InventoryType.SlotType.ARMOR)
        {
            event.setCancelled(true);
        }
    }
}
