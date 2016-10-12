package de.yellowphoenix18.armorstandplus.listener;

import java.util.HashMap;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import de.yellowphoenix18.armorstandplus.utils.ArmorStandUtils;
import de.yellowphoenix18.armorstandplus.utils.Utils;

public class SelectListener implements Listener {
	
	public static HashMap<Player, ArmorStand> select = new HashMap<Player, ArmorStand>();
	public static HashMap<Player, String> select_type = new HashMap<Player, String>();
	
	
	@EventHandler
	public void on(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_AIR) {
			if(select.containsKey(p)) {
				if(select_type.get(p).equalsIgnoreCase("Helmet")) {
					select.get(p).setHelmet(p.getItemInHand());
					p.sendMessage(Utils.prefix + "§aHemelt set.");
					select.remove(p);
					select_type.remove(p);
				} else if(select_type.get(p).equalsIgnoreCase("Chestplate")) {
					select.get(p).setChestplate(p.getItemInHand());
					p.sendMessage(Utils.prefix + "§aChestplate set.");
					select.remove(p);
					select_type.remove(p);
				} else if(select_type.get(p).equalsIgnoreCase("Leggings")) {
					select.get(p).setLeggings(p.getItemInHand());
					p.sendMessage(Utils.prefix + "§aLeggings set.");
					select.remove(p);
					select_type.remove(p);
				} else if(select_type.get(p).equalsIgnoreCase("Boots")) {
					select.get(p).setBoots(p.getItemInHand());
					p.sendMessage(Utils.prefix + "§aBoots set.");
					select.remove(p);
					select_type.remove(p);
				} else if(select_type.get(p).equalsIgnoreCase("Item")) {
					select.get(p).setItemInHand(p.getItemInHand());
					p.sendMessage(Utils.prefix + "§aItem set.");
					select.remove(p);
					select_type.remove(p);
				}
			}
		}
	}
	
	@EventHandler
	public void on(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		
		if(select.containsKey(p)) {
			if(select_type.get(p).equalsIgnoreCase("NameTag")) {
				e.setCancelled(true);
				ArmorStandUtils.setHolo(p, e.getMessage().replace("&", "§"), select.get(p));
				select.remove(p);
				select_type.remove(p);
			}
		}
		
	}

}
