package me.bluedyaishela.hephaestusforge.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SwordGestion implements Listener {
    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        PlayerInventory playerInventory = player.getInventory();

        ItemStack playerSword = playerInventory.getItem(0);

        if (playerSword == null)
        {
            ItemStack itemStackSword = new ItemStack(Material.WOOD_SWORD);
            ItemMeta itemMetaSword = itemStackSword.getItemMeta();

            List<String> lore = new ArrayList<>();

            lore.add("§7§m-------§8§m-------§7§m-------");
            lore.add("");
            lore.add("§7Cette arme s'améliore d'elle-même lorsque");
            lore.add("§7vous tuez des §8monstres§7.");
            lore.add("");
            lore.add("§8» §7Niveau : 1 / 50");
            lore.add("§8» §7Progression : §7|||||||||||||||");
            lore.add("");
            lore.add("§7§m-------§8§m-------§7§m-------");

            itemMetaSword.setLore(lore);
            itemMetaSword.setDisplayName("§7Épée en bois");
            itemMetaSword.spigot().setUnbreakable(true);
            itemStackSword.setItemMeta(itemMetaSword);

            playerInventory.setItem(0, itemStackSword);
            player.sendMessage("Épée donnée avec succès !");
        }
    }
}
