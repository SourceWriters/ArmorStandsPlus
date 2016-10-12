package de.yellowphoenix18.armorstandplus.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

import de.yellowphoenix18.armorstandplus.utils.ArmorStandUtils;

public class CloseListener implements Listener {
	
	@EventHandler
	public void on(InventoryCloseEvent e) {
		Player p = (Player) e.getPlayer();
		if(ArmorStandUtils.armor_stands.containsKey(p)) {
			ArmorStandUtils.armor_stands.remove(p);
		}
	}

}
