package org.guaitech.chunk.plugins.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickGUI implements Listener {
    @EventHandler
    public void ClickGui(InventoryClickEvent event){
        if (event.getView().getTitle().equalsIgnoreCase(ChatColor.BLACK + "Chunk | 命令帮助")){
            event.setCancelled(true);
        }
    }
}
