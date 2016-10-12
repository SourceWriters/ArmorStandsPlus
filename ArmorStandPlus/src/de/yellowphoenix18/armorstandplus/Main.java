package de.yellowphoenix18.armorstandplus;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.yellowphoenix18.armorstandplus.listener.ArmorStandListener;
import de.yellowphoenix18.armorstandplus.listener.CloseListener;
import de.yellowphoenix18.armorstandplus.listener.GUIListener;
import de.yellowphoenix18.armorstandplus.listener.SelectListener;

public class Main extends JavaPlugin {
	
	public static Main m;
	
	public void onEnable() {
		m = this;
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new ArmorStandListener(), this);
		pm.registerEvents(new GUIListener(), this);
		pm.registerEvents(new CloseListener(), this);
		pm.registerEvents(new SelectListener(), this);
	}

}
