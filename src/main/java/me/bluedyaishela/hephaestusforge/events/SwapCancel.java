package me.bluedyaishela.hephaestusforge.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class SwapCancel implements Listener {
    @EventHandler
    private void onPlayerInventoryClick(InventoryClickEvent event)
    {
        event.setCancelled(true);
//        InventoryType.SlotType slotType = event.getSlotType();
//        if (slotType == InventoryType.SlotType.ARMOR || slotType == InventoryType.SlotType.QUICKBAR)
//        {
//            event.setCancelled(true);
//        }
    }
}
