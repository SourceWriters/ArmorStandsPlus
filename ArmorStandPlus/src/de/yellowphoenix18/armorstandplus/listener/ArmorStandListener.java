package de.yellowphoenix18.armorstandplus.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.Inventory;

import de.yellowphoenix18.armorstandplus.utils.ArmorStandUtils;
import de.yellowphoenix18.armorstandplus.utils.Utils;

public class ArmorStandListener implements Listener {
	
	@EventHandler
	public void on(PlayerInteractAtEntityEvent e) {
		Entity en = e.getRightClicked();
		Player p = e.getPlayer();
		if(en instanceof ArmorStand) {
			if(p.hasPermission("ArmorStandPlus.Use")) {
				e.setCancelled(true);
				
				ArmorStand a = (ArmorStand) en;
				ArmorStandUtils.armor_stands.put(p, a);
				
				Inventory inv = Bukkit.createInventory(null, 54, "§6ArmorStands§5Plus");
				
				inv.setItem(10, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Info", "§6UUID§7: §8" + a.getUniqueId().toString(), null, 416, 0, 1));
				
				inv.setItem(20, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Helmet", "§7Set the Helmet", "§7of the ArmorStand", 298, 0, 1));
				inv.setItem(21, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Chestplate", "§7Set the Chestplate", "§7of the ArmorStand", 299, 0, 1));
				inv.setItem(22, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Leggings", "§7Set the Leggings", "§7of the ArmorStand", 300, 0, 1));
				inv.setItem(23, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Boots", "§7Set the Boots", "§7of the ArmorStand", 301, 0, 1));
				inv.setItem(24, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Item", "§7Set the ItemInHand", "§7of the ArmorStand", 268, 0, 1));
				inv.setItem(25, Utils.ItemStackCreatorID("§cDelete §7ArmorStand", "§cDelete the", "§7ArmorStand", 166, 0, 1));
				inv.setItem(40, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Settings", "§7Set the Settings", "§7of the ArmorStand", 331, 0, 1));
				
				p.openInventory(inv);
				
			}
		}
	}

}
