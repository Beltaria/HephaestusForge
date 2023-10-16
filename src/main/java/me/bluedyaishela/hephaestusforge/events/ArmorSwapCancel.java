package me.bluedyaishela.hephaestusforge.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class ArmorSwapCancel implements Listener {
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
