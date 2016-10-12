package de.yellowphoenix18.armorstandplus.utils;

import java.io.File;
import java.util.HashMap;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

public class ArmorStandUtils {
	
	public static File f = new File("plugins/ArmorStandPlus", "data.yml");
	public static FileConfiguration cfg = YamlConfiguration.loadConfiguration(f);
	
	public static HashMap<Player, ArmorStand> armor_stands = new HashMap<Player, ArmorStand>();
	
	
	public static void setVisibility(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			if(a.isVisible()) {
				a.setVisible(false);
				p.sendMessage(Utils.prefix + "§aSet §cVisibility §ato §cfalse");
			} else {
				a.setVisible(true);
				p.sendMessage(Utils.prefix + "§aSet §cVisibility §ato §ctrue");
			}
		}
	}
	
	public static void delete(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			a.remove();
			p.sendMessage(Utils.prefix + "§cYour ArmorStand has been removed!");
			p.closeInventory();
			armor_stands.remove(p);
		}
	}
	
	public static void setSize(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			if(a.isSmall()) {
				a.setSmall(false);
				p.sendMessage(Utils.prefix + "§aSet §cSize §ato §ctiny");
			} else {
				a.setSmall(true);
				p.sendMessage(Utils.prefix + "§aSet §cSize §ato §cbig");
			}
		}
	}
	
	public static void setBasePlate(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			if(a.hasBasePlate()) {
				a.setBasePlate(false);
				p.sendMessage(Utils.prefix + "§aSet §cBasePlate §ato §cfalse");
			} else {
				a.setBasePlate(true);
				p.sendMessage(Utils.prefix + "§aSet §cBasePlate §ato §ctrue");
			}
		}
	}
	
	public static void setArms(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			if(a.hasArms()) {
				a.setArms(false);
				p.sendMessage(Utils.prefix + "§aSet §cArms §ato §cfalse");
			} else {
				a.setArms(true);
				p.sendMessage(Utils.prefix + "§aSet §cArms §ato §ctrue");
			}
		}
	}
	
	public static void setGravity(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			if(a.hasGravity()) {
				a.setGravity(false);
				p.sendMessage(Utils.prefix + "§aSet §cGravity §ato §cfalse");
			} else {
				a.setGravity(true);
				p.sendMessage(Utils.prefix + "§aSet §cGravity §ato §ctrue");
			}
		}
	}
	
	public static void rotateHeadX(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getHeadPose().getX()+0.03, a.getHeadPose().getY(), a.getHeadPose().getZ());
			a.setHeadPose(e);
		}
	}
	
	public static void rotateHeadY(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getHeadPose().getX(), a.getHeadPose().getY()+0.03, a.getHeadPose().getZ());
			a.setHeadPose(e);
		}
	}
	
	public static void rotateHeadZ(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getHeadPose().getX(), a.getHeadPose().getY(), a.getHeadPose().getZ()+0.03);
			a.setHeadPose(e);
		}
	}
	
	//Arms [LEFT]	
	public static void rotateArmlX(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getLeftArmPose().getX()+0.03, a.getLeftArmPose().getY(), a.getLeftArmPose().getZ());
			a.setLeftArmPose(e);
		}
	}

	public static void rotateArmlY(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getLeftArmPose().getX(), a.getLeftArmPose().getY()+0.03, a.getLeftArmPose().getZ());
			a.setLeftArmPose(e);
		}
	}
	
	public static void rotateArmlZ(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getLeftArmPose().getX(), a.getLeftArmPose().getY(), a.getLeftArmPose().getZ()+0.03);
			a.setLeftArmPose(e);
		}
	}
	
	//Arms [RIGHT]	
	public static void rotateArmrX(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getRightArmPose().getX()+0.03, a.getRightArmPose().getY(), a.getRightArmPose().getZ());
			a.setRightArmPose(e);
		}
	}

	public static void rotateArmrY(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getRightArmPose().getX(), a.getRightArmPose().getY()+0.03, a.getRightArmPose().getZ());
			a.setRightArmPose(e);
		}
	}
	
	public static void rotateArmrZ(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getRightArmPose().getX(), a.getRightArmPose().getY(), a.getRightArmPose().getZ()+0.03);
			a.setRightArmPose(e);
		}
	}
	
	//Legs [RIGHT]	
	public static void rotateLegrX(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getRightLegPose().getX()+0.03, a.getRightLegPose().getY(), a.getRightLegPose().getZ());
			a.setRightLegPose(e);
		}
	}

	public static void rotateLegrY(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getRightLegPose().getX(), a.getRightLegPose().getY()+0.03, a.getRightLegPose().getZ());
			a.setRightLegPose(e);
		}
	}
	
	public static void rotateLegrZ(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getRightLegPose().getX(), a.getRightLegPose().getY(), a.getRightLegPose().getZ()+0.03);
			a.setRightLegPose(e);
		}
	}
	
	//Legs [LEFT]	
	public static void rotateLeglX(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getLeftLegPose().getX()+0.03, a.getLeftLegPose().getY(), a.getLeftLegPose().getZ());
			a.setLeftLegPose(e);
		}
	}

	public static void rotateLeglY(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getLeftLegPose().getX(), a.getLeftLegPose().getY()+0.03, a.getLeftLegPose().getZ());
			a.setLeftLegPose(e);
		}
	}
	
	public static void rotateLeglZ(Player p) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			EulerAngle e = new EulerAngle(a.getLeftLegPose().getX(), a.getLeftLegPose().getY(), a.getLeftLegPose().getZ()+0.03);
			a.setLeftLegPose(e);
		}
	}
	
	public static void setHelemt(Player p, ItemStack i) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			a.setHelmet(i);
		}
	}
	
	public static void setChestplate(Player p, ItemStack i) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			a.setChestplate(i);
		}
	}
	
	public static void setLeggings(Player p, ItemStack i) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			a.setLeggings(i);
		}
	}
	
	public static void setBoots(Player p, ItemStack i) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			a.setBoots(i);
		}
	}
	
	public static void setItemInHand(Player p, ItemStack i) {
		if(isValid(p)) {
			ArmorStand a = armor_stands.get(p);
			a.setItemInHand(i);
		}
	}
	
	public static void setHolo(Player p, String text, ArmorStand a) {
		a.setCustomName(text);
		a.setCustomNameVisible(true);
		a.setGravity(false);
	}
	
	
	
	
	
	
	
	public static boolean isValid(Player p) {
		if(armor_stands.containsKey(p)) {
			return true;
		} else {
			p.sendMessage(Utils.prefix + "§cNo ArmorStand selected!");
			return false;
		}
	}
	

}
