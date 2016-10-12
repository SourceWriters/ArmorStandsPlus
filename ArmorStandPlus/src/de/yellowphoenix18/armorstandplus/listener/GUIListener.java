package de.yellowphoenix18.armorstandplus.listener;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import de.yellowphoenix18.armorstandplus.utils.ArmorStandUtils;
import de.yellowphoenix18.armorstandplus.utils.Utils;

public class GUIListener implements Listener {
	
	public static HashMap<Player, String> item = new HashMap<Player, String>();
	
	@EventHandler
	public void on(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getClickedInventory().getName().equalsIgnoreCase("§6ArmorStands§5Plus")) {
			if(e.getCurrentItem() != null && e.getCurrentItem().getType() != null && e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName()) {
				String disp = e.getCurrentItem().getItemMeta().getDisplayName();
				Inventory inv = e.getInventory();
				
				if(disp.equalsIgnoreCase("§6ArmorStand§7-§6Helmet")) {
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§6ArmorStand§7-§6Helmet", "§7Select a", "§6Helmet", Material.LEATHER_HELMET, 1));
					inv.setItem(22, Utils.ItemStackCreator("§7Custom §6Helmet", "§7Select a", "§7custom §6Helmet", Material.STICK, 1));
					inv.setItem(29, Utils.ItemStackCreator("§bDiamond §6Helmet", "§7Select a", "§bDiamond §6Helmet", Material.DIAMOND_HELMET, 1));
					inv.setItem(30, Utils.ItemStackCreator("§7Iron §6Helmet", "§7Select a", "§7Iron §6Helmet", Material.IRON_HELMET, 1));
					inv.setItem(31, Utils.ItemStackCreator("§8Chainmail §6Helmet", "§7Select a", "§8Chainmail §6Helmet", Material.CHAINMAIL_HELMET, 1));
					inv.setItem(32, Utils.ItemStackCreator("§6Gold §6Helmet", "§7Select a", "§6Gold §6Helmet", Material.GOLD_HELMET, 1));
					inv.setItem(33, Utils.ItemStackCreator("§cLeather §6Helmet", "§7Select a", "§cLeather §6Helmet", Material.LEATHER_HELMET, 1));
					inv.setItem(40, Utils.ItemStackCreator("§4Delete §6Helmet", "§7Delete the", "§6Helmet", Material.BARRIER, 1));
					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§7Custom §6Helmet")) {
					p.sendMessage(Utils.prefix + "§aSelect the item via Rightclicking in the Air with your Item in Hand.");
					SelectListener.select.put(p, ArmorStandUtils.armor_stands.get(p));
					SelectListener.select_type.put(p, "Helmet");
					p.closeInventory();
				} else if(disp.equalsIgnoreCase("§bDiamond §6Helmet")) {
					p.sendMessage(Utils.prefix + "§aDiamond Helmet selected.");
					ArmorStandUtils.setHelemt(p, Utils.ItemStackCreator("", null, null, Material.DIAMOND_HELMET, 1));
				} else if(disp.equalsIgnoreCase("§7Iron §6Helmet")) {
					p.sendMessage(Utils.prefix + "§aIron Helmet selected.");
					ArmorStandUtils.setHelemt(p, Utils.ItemStackCreator("", null, null, Material.IRON_HELMET, 1));
				} else if(disp.equalsIgnoreCase("§8Chainmail §6Helmet")) {
					p.sendMessage(Utils.prefix + "§aChainmail Helmet selected.");
					ArmorStandUtils.setHelemt(p, Utils.ItemStackCreator("", null, null, Material.CHAINMAIL_HELMET, 1));
				} else if(disp.equalsIgnoreCase("§6Gold §6Helmet")) {
					p.sendMessage(Utils.prefix + "§aGold Helmet selected.");
					ArmorStandUtils.setHelemt(p, Utils.ItemStackCreator("", null, null, Material.GOLD_HELMET, 1));
				} else if(disp.equalsIgnoreCase("§cLeather §6Helmet")) {
					p.sendMessage(Utils.prefix + "§aLeather Helmet selected.");
					ArmorStandUtils.setHelemt(p, Utils.ItemStackCreator("", null, null, Material.LEATHER_HELMET, 1));
				} else if(disp.equalsIgnoreCase("§4Delete §6Helmet")) {
					p.sendMessage(Utils.prefix + "§cHelmet deleted.");
					ArmorStandUtils.setHelemt(p, null);
				} else if(disp.equalsIgnoreCase("§6ArmorStand§7-§6Chestplate")) {
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§6ArmorStand§7-§6Chestplate", "§7Select a", "§6Chestplate", Material.LEATHER_CHESTPLATE, 1));
					inv.setItem(22, Utils.ItemStackCreator("§7Custom §6Chestplate", "§7Select a", "§7custom §6Chestplate", Material.STICK, 1));
					inv.setItem(29, Utils.ItemStackCreator("§bDiamond §6Chestplate", "§7Select a", "§bDiamond §6Chestplate", Material.DIAMOND_CHESTPLATE, 1));
					inv.setItem(30, Utils.ItemStackCreator("§7Iron §6Chestplate", "§7Select a", "§7Iron §6Chestplate", Material.IRON_CHESTPLATE, 1));
					inv.setItem(31, Utils.ItemStackCreator("§8Chainmail §6Chestplate", "§7Select a", "§8Chainmail §6Chestplate", Material.CHAINMAIL_CHESTPLATE, 1));
					inv.setItem(32, Utils.ItemStackCreator("§6Gold §6Chestplate", "§7Select a", "§6Gold §6Chestplate", Material.GOLD_CHESTPLATE, 1));
					inv.setItem(33, Utils.ItemStackCreator("§cLeather §6Chestplate", "§7Select a", "§cLeather §6Chestplate", Material.LEATHER_CHESTPLATE, 1));
					inv.setItem(40, Utils.ItemStackCreator("§4Delete §6Chestplate", "§7Delete the", "§6Chestplate", Material.BARRIER, 1));
					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§7Custom §6Chestplate")) {
					p.sendMessage(Utils.prefix + "§aSelect the item via Rightclicking in the Air with your Item in Hand.");
					SelectListener.select.put(p, ArmorStandUtils.armor_stands.get(p));
					SelectListener.select_type.put(p, "Chestplate");
					p.closeInventory();
				} else if(disp.equalsIgnoreCase("§bDiamond §6Chestplate")) {
					p.sendMessage(Utils.prefix + "§aDiamond Chestplate selected.");
					ArmorStandUtils.setChestplate(p, Utils.ItemStackCreator("", null, null, Material.DIAMOND_CHESTPLATE, 1));
				} else if(disp.equalsIgnoreCase("§7Iron §6Chestplate")) {
					p.sendMessage(Utils.prefix + "§aIron Chestplate selected.");
					ArmorStandUtils.setChestplate(p, Utils.ItemStackCreator("", null, null, Material.IRON_CHESTPLATE, 1));
				} else if(disp.equalsIgnoreCase("§8Chainmail §6Chestplate")) {
					p.sendMessage(Utils.prefix + "§aChainmail Chestplate selected.");
					ArmorStandUtils.setChestplate(p, Utils.ItemStackCreator("", null, null, Material.CHAINMAIL_CHESTPLATE, 1));
				} else if(disp.equalsIgnoreCase("§6Gold §6Chestplate")) {
					p.sendMessage(Utils.prefix + "§aGold Chestplate selected.");
					ArmorStandUtils.setChestplate(p, Utils.ItemStackCreator("", null, null, Material.GOLD_CHESTPLATE, 1));
				} else if(disp.equalsIgnoreCase("§cLeather §6Chestplate")) {
					p.sendMessage(Utils.prefix + "§aLeather Chestplate selected.");
					ArmorStandUtils.setChestplate(p, Utils.ItemStackCreator("", null, null, Material.LEATHER_CHESTPLATE, 1));
				} else if(disp.equalsIgnoreCase("§4Delete §6Chestplate")) {
					p.sendMessage(Utils.prefix + "§cChestplate deleted.");
					ArmorStandUtils.setChestplate(p, null);
				} else if(disp.equalsIgnoreCase("§6ArmorStand§7-§6Leggings")) {
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§6ArmorStand§7-§6Leggings", "§7Select a", "§6Leggings", Material.LEATHER_LEGGINGS, 1));
					inv.setItem(22, Utils.ItemStackCreator("§7Custom §6Leggings", "§7Select a", "§7custom §6Leggings", Material.STICK, 1));
					inv.setItem(29, Utils.ItemStackCreator("§bDiamond §6Leggings", "§7Select a", "§bDiamond §6Leggings", Material.DIAMOND_LEGGINGS, 1));
					inv.setItem(30, Utils.ItemStackCreator("§7Iron §6Leggings", "§7Select a", "§7Iron §6Leggings", Material.IRON_LEGGINGS, 1));
					inv.setItem(31, Utils.ItemStackCreator("§8Chainmail §6Leggings", "§7Select a", "§8Chainmail §6Leggings", Material.CHAINMAIL_LEGGINGS, 1));
					inv.setItem(32, Utils.ItemStackCreator("§6Gold §6Leggings", "§7Select a", "§6Gold §6Leggings", Material.GOLD_LEGGINGS, 1));
					inv.setItem(33, Utils.ItemStackCreator("§cLeather §6Leggings", "§7Select a", "§cLeather §6Leggings", Material.LEATHER_LEGGINGS, 1));
					inv.setItem(40, Utils.ItemStackCreator("§4Delete §6Leggings", "§7Delete the", "§6Leggings", Material.BARRIER, 1));
					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§7Custom §6Leggings")) {
					p.sendMessage(Utils.prefix + "§aSelect the item via Rightclicking in the Air with your Item in Hand.");
					SelectListener.select.put(p, ArmorStandUtils.armor_stands.get(p));
					SelectListener.select_type.put(p, "Leggings");
					p.closeInventory();
				} else if(disp.equalsIgnoreCase("§bDiamond §6Leggings")) {
					p.sendMessage(Utils.prefix + "§aDiamond Leggings selected.");
					ArmorStandUtils.setLeggings(p, Utils.ItemStackCreator("", null, null, Material.DIAMOND_LEGGINGS, 1));
				} else if(disp.equalsIgnoreCase("§7Iron §6Leggings")) {
					p.sendMessage(Utils.prefix + "§aIron Leggings selected.");
					ArmorStandUtils.setLeggings(p, Utils.ItemStackCreator("", null, null, Material.IRON_LEGGINGS, 1));
				} else if(disp.equalsIgnoreCase("§8Chainmail §6Leggings")) {
					p.sendMessage(Utils.prefix + "§aChainmail Leggings selected.");
					ArmorStandUtils.setLeggings(p, Utils.ItemStackCreator("", null, null, Material.CHAINMAIL_LEGGINGS, 1));
				} else if(disp.equalsIgnoreCase("§6Gold §6Leggings")) {
					p.sendMessage(Utils.prefix + "§aGold Leggings selected.");
					ArmorStandUtils.setLeggings(p, Utils.ItemStackCreator("", null, null, Material.GOLD_LEGGINGS, 1));
				} else if(disp.equalsIgnoreCase("§cLeather §6Leggings")) {
					p.sendMessage(Utils.prefix + "§aLeather Leggings selected.");
					ArmorStandUtils.setLeggings(p, Utils.ItemStackCreator("", null, null, Material.LEATHER_LEGGINGS, 1));
				} else if(disp.equalsIgnoreCase("§4Delete §6Leggings")) {
					p.sendMessage(Utils.prefix + "§cLeggings deleted.");
					ArmorStandUtils.setLeggings(p, null);
				} else if(disp.equalsIgnoreCase("§6ArmorStand§7-§6Boots")) {
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§6ArmorStand§7-§6Boots", "§7Select", "§6Boots", Material.LEATHER_BOOTS, 1));
					inv.setItem(22, Utils.ItemStackCreator("§7Custom §6Boots", "§7Select", "§7custom §6Boots", Material.STICK, 1));
					inv.setItem(29, Utils.ItemStackCreator("§bDiamond §6Boots", "§7Select", "§bDiamond §6Boots", Material.DIAMOND_BOOTS, 1));
					inv.setItem(30, Utils.ItemStackCreator("§7Iron §6Boots", "§7Select", "§7Iron §6Boots", Material.IRON_BOOTS, 1));
					inv.setItem(31, Utils.ItemStackCreator("§8Chainmail §6Boots", "§7Select", "§8Chainmail §6Boots", Material.CHAINMAIL_BOOTS, 1));
					inv.setItem(32, Utils.ItemStackCreator("§6Gold §6Boots", "§7Select", "§6Gold §6Boots", Material.GOLD_BOOTS, 1));
					inv.setItem(33, Utils.ItemStackCreator("§cLeather §6Boots", "§7Select", "§cLeather §6Boots", Material.LEATHER_BOOTS, 1));
					inv.setItem(40, Utils.ItemStackCreator("§4Delete §6Boots", "§7Delete the", "§6Boots", Material.BARRIER, 1));
					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§7Custom §6Boots")) {
					p.sendMessage(Utils.prefix + "§aSelect the item via Rightclicking in the Air with your Item in Hand.");
					SelectListener.select.put(p, ArmorStandUtils.armor_stands.get(p));
					SelectListener.select_type.put(p, "Boots");
					p.closeInventory();
				} else if(disp.equalsIgnoreCase("§bDiamond §6Boots")) {
					p.sendMessage(Utils.prefix + "§aDiamond Boots selected.");
					ArmorStandUtils.setBoots(p, Utils.ItemStackCreator("", null, null, Material.DIAMOND_BOOTS, 1));
				} else if(disp.equalsIgnoreCase("§7Iron §6Boots")) {
					p.sendMessage(Utils.prefix + "§aIron Boots selected.");
					ArmorStandUtils.setBoots(p, Utils.ItemStackCreator("", null, null, Material.IRON_BOOTS, 1));
				} else if(disp.equalsIgnoreCase("§8Chainmail §6Boots")) {
					p.sendMessage(Utils.prefix + "§aChainmail Boots selected.");
					ArmorStandUtils.setBoots(p, Utils.ItemStackCreator("", null, null, Material.CHAINMAIL_BOOTS, 1));
				} else if(disp.equalsIgnoreCase("§6Gold §6Boots")) {
					p.sendMessage(Utils.prefix + "§aGold Boots selected.");
					ArmorStandUtils.setBoots(p, Utils.ItemStackCreator("", null, null, Material.GOLD_BOOTS, 1));
				} else if(disp.equalsIgnoreCase("§cLeather §6Boots")) {
					p.sendMessage(Utils.prefix + "§aLeather Boots selected.");
					ArmorStandUtils.setBoots(p, Utils.ItemStackCreator("", null, null, Material.LEATHER_BOOTS, 1));
				} else if(disp.equalsIgnoreCase("§4Delete §6Boots")) {
					p.sendMessage(Utils.prefix + "§cBoots deleted.");
					ArmorStandUtils.setBoots(p, null);
				} else if(disp.equalsIgnoreCase("§6ArmorStand§7-§6Item")) {
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§6ArmorStand§7-§6Item", "§7Select a", "§6Item", Material.WOOD_SWORD, 1));
					inv.setItem(22, Utils.ItemStackCreator("§7Custom §6Item", "§7Select a", "§7custom §6Item", Material.STICK, 1));
					inv.setItem(29, Utils.ItemStackCreator("§bDiamond §6Sword", "§7Select a", "§bDiamond §6Sword", Material.DIAMOND_SWORD, 1));
					inv.setItem(30, Utils.ItemStackCreator("§7Iron §6Sword", "§7Select a", "§7Iron §6Sword", Material.IRON_SWORD, 1));
					inv.setItem(31, Utils.ItemStackCreator("§8Chainmail §6Sword", "§7Select a", "§8Stone §6Sword", Material.STONE_SWORD, 1));
					inv.setItem(32, Utils.ItemStackCreator("§6Gold §6Sword", "§7Select a", "§6Gold §6Sword", Material.GOLD_SWORD, 1));
					inv.setItem(33, Utils.ItemStackCreator("§cLeather §6Sword", "§7Select a", "§cWood §6Sword", Material.WOOD_SWORD, 1));
					inv.setItem(40, Utils.ItemStackCreator("§4Delete §6Item", "§7Delete the", "§6Item", Material.BARRIER, 1));
					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§7Custom §6Item")) {
					p.sendMessage(Utils.prefix + "§aSelect the item via Rightclicking in the Air with your Item in Hand.");
					SelectListener.select.put(p, ArmorStandUtils.armor_stands.get(p));
					SelectListener.select_type.put(p, "Item");
					p.closeInventory();
				} else if(disp.equalsIgnoreCase("§bDiamond §6Sword")) {
					p.sendMessage(Utils.prefix + "§aDiamond Sword selected.");
					ArmorStandUtils.setItemInHand(p, Utils.ItemStackCreator("", null, null, Material.DIAMOND_SWORD, 1));
				} else if(disp.equalsIgnoreCase("§7Iron §6Sword")) {
					p.sendMessage(Utils.prefix + "§aIron Sword selected.");
					ArmorStandUtils.setItemInHand(p, Utils.ItemStackCreator("", null, null, Material.IRON_SWORD, 1));
				} else if(disp.equalsIgnoreCase("§8Stone §6Sword")) {
					p.sendMessage(Utils.prefix + "§aStone Sword selected.");
					ArmorStandUtils.setItemInHand(p, Utils.ItemStackCreator("", null, null, Material.STONE_SWORD, 1));
				} else if(disp.equalsIgnoreCase("§6Gold §6Sword")) {
					p.sendMessage(Utils.prefix + "§aGold Sword selected.");
					ArmorStandUtils.setItemInHand(p, Utils.ItemStackCreator("", null, null, Material.GOLD_SWORD, 1));
				} else if(disp.equalsIgnoreCase("§cWood §6Sword")) {
					p.sendMessage(Utils.prefix + "§aWood Sword selected.");
					ArmorStandUtils.setItemInHand(p, Utils.ItemStackCreator("", null, null, Material.WOOD_SWORD, 1));
				} else if(disp.equalsIgnoreCase("§4Delete §6Item")) {
					p.sendMessage(Utils.prefix + "§cItem deleted.");
					ArmorStandUtils.setItemInHand(p, null);
				} else if(disp.equalsIgnoreCase("§cDelete §7ArmorStand")) {
					ArmorStandUtils.delete(p);
					p.closeInventory();
				} else if(disp.equalsIgnoreCase("§6ArmorStand§7-§6Settings")) {
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§6ArmorStand§7-§6Settings", "§7ArmorStand", "§6Settings", Material.REDSTONE, 1));
					inv.setItem(20, Utils.ItemStackCreator("§6Visibility", "§7Set", "§7Visibility", Material.STRING, 1));
					inv.setItem(21, Utils.ItemStackCreator("§6Arms", "§7Set", "§7Arms", Material.STICK, 1));
					inv.setItem(22, Utils.ItemStackCreatorID("§6BasePlate", "§7Set", "§7BasePlate", 44, 0, 1));
					inv.setItem(23, Utils.ItemStackCreator("§6Gravity", "§7Set", "§7Gravity", Material.ENDER_PEARL, 1));
					inv.setItem(24, Utils.ItemStackCreator("§6Size", "§7Set", "§7Size", Material.LEATHER, 1));
					inv.setItem(29, Utils.ItemStackCreator("§cLeft §6Leg", "§7Rotation", "§7left Leg", Material.STICK, 1));
					inv.setItem(30, Utils.ItemStackCreator("§cLeft §6Arm", "§7Rotation", "§7left Arm", Material.BLAZE_ROD, 1));
					inv.setItem(31, Utils.ItemStackCreator("§6Head", "§7Rotation", "§7Head", Material.SKULL_ITEM, 1));
					inv.setItem(32, Utils.ItemStackCreator("§cRight §6Arm", "§7Rotation", "§7right Arm", Material.BLAZE_ROD, 1));
					inv.setItem(33, Utils.ItemStackCreator("§cRight §6Leg", "§7Rotation", "§7right Leg", Material.STICK, 1));
					inv.setItem(40, Utils.ItemStackCreator("§cNameTag", "§7Set the", "§7NameTag", Material.NAME_TAG, 1));
					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§7Back")) {
					inv.clear();
			
			        inv.setItem(10, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Info", "§6UUID§7: §8" + ArmorStandUtils.armor_stands.get(p).getUniqueId().toString(), null, 416, 0, 1));
			
			        inv.setItem(20, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Helmet", "§7Set the Helmet", "§7of the ArmorStand", 298, 0, 1));
			        inv.setItem(21, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Chestplate", "§7Set the Chestplate", "§7of the ArmorStand", 299, 0, 1));
			        inv.setItem(22, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Leggings", "§7Set the Leggings", "§7of the ArmorStand", 300, 0, 1));
			        inv.setItem(23, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Boots", "§7Set the Boots", "§7of the ArmorStand", 301, 0, 1));
			        inv.setItem(24, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Item", "§7Set the ItemInHand", "§7of the ArmorStand", 268, 0, 1));
			        inv.setItem(25, Utils.ItemStackCreatorID("§cDelete §7ArmorStand", "§cDelete the", "§7ArmorStand", 166, 0, 1));
			        inv.setItem(40, Utils.ItemStackCreatorID("§6ArmorStand§7-§6Settings", "§7Set the Settings", "§7of the ArmorStand", 331, 0, 1));
				} else if(disp.equalsIgnoreCase("§6Visibility")) {
					ArmorStandUtils.setVisibility(p);
				} else if(disp.equalsIgnoreCase("§6Arms")) {
					ArmorStandUtils.setArms(p);
				} else if(disp.equalsIgnoreCase("§6BasePlate")) {
					ArmorStandUtils.setBasePlate(p);
				} else if(disp.equalsIgnoreCase("§6Gravity")) {
					ArmorStandUtils.setGravity(p);
				} else if(disp.equalsIgnoreCase("§6Size")) {
					ArmorStandUtils.setSize(p);
				} else if(disp.equalsIgnoreCase("§cNameTag")) {
					p.sendMessage(Utils.prefix + "§aWrite the NameTag now in the Chat.");
					SelectListener.select.put(p, ArmorStandUtils.armor_stands.get(p));
					SelectListener.select_type.put(p, "NameTag");
					p.closeInventory();
				} else if(disp.equalsIgnoreCase("§cLeft §6Leg")) {
					item.put(p, "LLeg");
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§cLeft §6Leg", "§7Rotate", "§7left Leg", Material.STICK, 1));
					inv.setItem(21, Utils.SkullCreator("§7Rotate §cX", "mhf_arrowleft", "§7Rotate", "§7Leg X", 1));
					inv.setItem(22, Utils.SkullCreator("§7Rotate §cY", "mhf_arrowup", "§7Rotate", "§7Leg Y", 1));
					inv.setItem(23, Utils.SkullCreator("§7Rotate §cZ", "mhf_arrowright", "§7Rotate", "§7Leg Z", 1));
					inv.setItem(30, Utils.SkullCreator("§7Rotate §cX x5", "mhf_arrowleft", "§7Rotate", "§7Leg X", 1));
					inv.setItem(31, Utils.SkullCreator("§7Rotate §cY x5", "mhf_arrowup", "§7Rotate", "§7Leg Y", 1));
					inv.setItem(32, Utils.SkullCreator("§7Rotate §cZ x5", "mhf_arrowright", "§7Rotate", "§7Leg Z", 1));
					

					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§cLeft §6Arm")) {
					item.put(p, "LArm");
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§cLeft §6Arm", "§7Rotate", "§7left Arm", Material.BLAZE_ROD, 1));
					inv.setItem(21, Utils.SkullCreator("§7Rotate §cX", "mhf_arrowleft", "§7Rotate", "§7Arm X", 1));
					inv.setItem(22, Utils.SkullCreator("§7Rotate §cY", "mhf_arrowup", "§7Rotate", "§7Arm Y", 1));
					inv.setItem(23, Utils.SkullCreator("§7Rotate §cZ", "mhf_arrowright", "§7Rotate", "§7Arm Z", 1));
					inv.setItem(30, Utils.SkullCreator("§7Rotate §cX x5", "mhf_arrowleft", "§7Rotate", "§7Arm X", 1));
					inv.setItem(31, Utils.SkullCreator("§7Rotate §cY x5", "mhf_arrowup", "§7Rotate", "§7Arm Y", 1));
					inv.setItem(32, Utils.SkullCreator("§7Rotate §cZ x5", "mhf_arrowright", "§7Rotate", "§7Arm Z", 1));
					

					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§6Head")) {
					item.put(p, "Head");
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§6Head", "§7Rotate", "§7Head", Material.SKULL_ITEM, 1));
					inv.setItem(21, Utils.SkullCreator("§7Rotate §cX", "mhf_arrowleft", "§7Rotate", "§7Head X", 1));
					inv.setItem(22, Utils.SkullCreator("§7Rotate §cY", "mhf_arrowup", "§7Rotate", "§7Head Y", 1));
					inv.setItem(23, Utils.SkullCreator("§7Rotate §cZ", "mhf_arrowright", "§7Rotate", "§7Head Z", 1));
					inv.setItem(30, Utils.SkullCreator("§7Rotate §cX x5", "mhf_arrowleft", "§7Rotate", "§7Head X", 1));
					inv.setItem(31, Utils.SkullCreator("§7Rotate §cY x5", "mhf_arrowup", "§7Rotate", "§7Head Y", 1));
					inv.setItem(32, Utils.SkullCreator("§7Rotate §cZ x5", "mhf_arrowright", "§7Rotate", "§7Head Z", 1));
					

					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§cRight §6Leg")) {
					item.put(p, "RLeg");
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§cRight §6Leg", "§7Rotate", "§7right Leg", Material.STICK, 1));
					inv.setItem(21, Utils.SkullCreator("§7Rotate §cX", "mhf_arrowleft", "§7Rotate", "§7Leg X", 1));
					inv.setItem(22, Utils.SkullCreator("§7Rotate §cY", "mhf_arrowup", "§7Rotate", "§7Leg Y", 1));
					inv.setItem(23, Utils.SkullCreator("§7Rotate §cZ", "mhf_arrowright", "§7Rotate", "§7Leg Z", 1));
					inv.setItem(30, Utils.SkullCreator("§7Rotate §cX x5", "mhf_arrowleft", "§7Rotate", "§7Leg X", 1));
					inv.setItem(31, Utils.SkullCreator("§7Rotate §cY x5", "mhf_arrowup", "§7Rotate", "§7Leg Y", 1));
					inv.setItem(32, Utils.SkullCreator("§7Rotate §cZ x5", "mhf_arrowright", "§7Rotate", "§7Leg Z", 1));
					

					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§cRight §6Arm")) {
					item.put(p, "RArm");
					inv.clear();
					
					inv.setItem(10, Utils.ItemStackCreator("§cRight §6Arm", "§7Rotate", "§7right Arm", Material.BLAZE_ROD, 1));
					inv.setItem(21, Utils.SkullCreator("§7Rotate §cX", "mhf_arrowleft", "§7Rotate", "§7Arm X", 1));
					inv.setItem(22, Utils.SkullCreator("§7Rotate §cY", "mhf_arrowup", "§7Rotate", "§7Arm Y", 1));
					inv.setItem(23, Utils.SkullCreator("§7Rotate §cZ", "mhf_arrowright", "§7Rotate", "§7Arm Z", 1));
					inv.setItem(30, Utils.SkullCreator("§7Rotate §cX x5", "mhf_arrowleft", "§7Rotate", "§7Arm X", 1));
					inv.setItem(31, Utils.SkullCreator("§7Rotate §cY x5", "mhf_arrowup", "§7Rotate", "§7Arm Y", 1));
					inv.setItem(32, Utils.SkullCreator("§7Rotate §cZ x5", "mhf_arrowright", "§7Rotate", "§7Arm Z", 1));
					

					inv.setItem(53, Utils.ItemStackCreator("§7Back", "§7Back to", "§6Mainmenu", Material.IRON_DOOR, 1));
				} else if(disp.equalsIgnoreCase("§7Rotate §cX")) {
					if(item.get(p).equalsIgnoreCase("RArm")) {
						ArmorStandUtils.rotateArmrX(p);
					} else if(item.get(p).equalsIgnoreCase("RLeg")) {
						ArmorStandUtils.rotateLegrX(p);
					} else if(item.get(p).equalsIgnoreCase("Head")) {
						ArmorStandUtils.rotateHeadX(p);
					} else if(item.get(p).equalsIgnoreCase("LLeg")) {
						ArmorStandUtils.rotateLeglX(p);
					} else if(item.get(p).equalsIgnoreCase("LArm")) {
						ArmorStandUtils.rotateArmlX(p);
					}
				} else if(disp.equalsIgnoreCase("§7Rotate §cY")) {
					if(item.get(p).equalsIgnoreCase("RArm")) {
						ArmorStandUtils.rotateArmrY(p);
					} else if(item.get(p).equalsIgnoreCase("RLeg")) {
						ArmorStandUtils.rotateLegrY(p);
					} else if(item.get(p).equalsIgnoreCase("Head")) {
						ArmorStandUtils.rotateHeadY(p);
					} else if(item.get(p).equalsIgnoreCase("LLeg")) {
						ArmorStandUtils.rotateLeglY(p);
					} else if(item.get(p).equalsIgnoreCase("LArm")) {
						ArmorStandUtils.rotateArmlY(p);
					}
				} else if(disp.equalsIgnoreCase("§7Rotate §cZ")) {
					if(item.get(p).equalsIgnoreCase("RArm")) {
						ArmorStandUtils.rotateArmrZ(p);
					} else if(item.get(p).equalsIgnoreCase("RLeg")) {
						ArmorStandUtils.rotateLegrZ(p);
					} else if(item.get(p).equalsIgnoreCase("Head")) {
						ArmorStandUtils.rotateHeadZ(p);
					} else if(item.get(p).equalsIgnoreCase("LLeg")) {
						ArmorStandUtils.rotateLeglZ(p);
					} else if(item.get(p).equalsIgnoreCase("LArm")) {
						ArmorStandUtils.rotateArmlZ(p);
					}
				} else if(disp.equalsIgnoreCase("§7Rotate §cX x5")) {
					if(item.get(p).equalsIgnoreCase("RArm")) {
						ArmorStandUtils.rotateArmrX(p);
						ArmorStandUtils.rotateArmrX(p);
						ArmorStandUtils.rotateArmrX(p);
						ArmorStandUtils.rotateArmrX(p);
						ArmorStandUtils.rotateArmrX(p);
						
					} else if(item.get(p).equalsIgnoreCase("RLeg")) {
						ArmorStandUtils.rotateLegrX(p);
						ArmorStandUtils.rotateLegrX(p);
						ArmorStandUtils.rotateLegrX(p);
						ArmorStandUtils.rotateLegrX(p);
						ArmorStandUtils.rotateLegrX(p);
					} else if(item.get(p).equalsIgnoreCase("Head")) {
						ArmorStandUtils.rotateHeadX(p);
						ArmorStandUtils.rotateHeadX(p);
						ArmorStandUtils.rotateHeadX(p);
						ArmorStandUtils.rotateHeadX(p);
						ArmorStandUtils.rotateHeadX(p);
					} else if(item.get(p).equalsIgnoreCase("LLeg")) {
						ArmorStandUtils.rotateLeglX(p);
						ArmorStandUtils.rotateLeglX(p);
						ArmorStandUtils.rotateLeglX(p);
						ArmorStandUtils.rotateLeglX(p);
						ArmorStandUtils.rotateLeglX(p);
					} else if(item.get(p).equalsIgnoreCase("LArm")) {
						ArmorStandUtils.rotateArmlX(p);
						ArmorStandUtils.rotateArmlX(p);
						ArmorStandUtils.rotateArmlX(p);
						ArmorStandUtils.rotateArmlX(p);
						ArmorStandUtils.rotateArmlX(p);
					}
				} else if(disp.equalsIgnoreCase("§7Rotate §cY x5")) {
					if(item.get(p).equalsIgnoreCase("RArm")) {
						ArmorStandUtils.rotateArmrY(p);
						ArmorStandUtils.rotateArmrY(p);
						ArmorStandUtils.rotateArmrY(p);
						ArmorStandUtils.rotateArmrY(p);
						ArmorStandUtils.rotateArmrY(p);
					} else if(item.get(p).equalsIgnoreCase("RLeg")) {
						ArmorStandUtils.rotateLegrY(p);
						ArmorStandUtils.rotateLegrY(p);
						ArmorStandUtils.rotateLegrY(p);
						ArmorStandUtils.rotateLegrY(p);
						ArmorStandUtils.rotateLegrY(p);
					} else if(item.get(p).equalsIgnoreCase("Head")) {
						ArmorStandUtils.rotateHeadY(p);
						ArmorStandUtils.rotateHeadY(p);
						ArmorStandUtils.rotateHeadY(p);
						ArmorStandUtils.rotateHeadY(p);
						ArmorStandUtils.rotateHeadY(p);
					} else if(item.get(p).equalsIgnoreCase("LLeg")) {
						ArmorStandUtils.rotateLeglY(p);
						ArmorStandUtils.rotateLeglY(p);
						ArmorStandUtils.rotateLeglY(p);
						ArmorStandUtils.rotateLeglY(p);
						ArmorStandUtils.rotateLeglY(p);
					} else if(item.get(p).equalsIgnoreCase("LArm")) {
						ArmorStandUtils.rotateArmlY(p);
						ArmorStandUtils.rotateArmlY(p);
						ArmorStandUtils.rotateArmlY(p);
						ArmorStandUtils.rotateArmlY(p);
						ArmorStandUtils.rotateArmlY(p);
					}
				} else if(disp.equalsIgnoreCase("§7Rotate §cZ x5")) {
					if(item.get(p).equalsIgnoreCase("RArm")) {
						ArmorStandUtils.rotateArmrZ(p);
						ArmorStandUtils.rotateArmrZ(p);
						ArmorStandUtils.rotateArmrZ(p);
						ArmorStandUtils.rotateArmrZ(p);
						ArmorStandUtils.rotateArmrZ(p);
					} else if(item.get(p).equalsIgnoreCase("RLeg")) {
						ArmorStandUtils.rotateLegrZ(p);
						ArmorStandUtils.rotateLegrZ(p);
						ArmorStandUtils.rotateLegrZ(p);
						ArmorStandUtils.rotateLegrZ(p);
						ArmorStandUtils.rotateLegrZ(p);
					} else if(item.get(p).equalsIgnoreCase("Head")) {
						ArmorStandUtils.rotateHeadZ(p);
						ArmorStandUtils.rotateHeadZ(p);
						ArmorStandUtils.rotateHeadZ(p);
						ArmorStandUtils.rotateHeadZ(p);
						ArmorStandUtils.rotateHeadZ(p);
					} else if(item.get(p).equalsIgnoreCase("LLeg")) {
						ArmorStandUtils.rotateLeglZ(p);
						ArmorStandUtils.rotateLeglZ(p);
						ArmorStandUtils.rotateLeglZ(p);
						ArmorStandUtils.rotateLeglZ(p);
						ArmorStandUtils.rotateLeglZ(p);
					} else if(item.get(p).equalsIgnoreCase("LArm")) {
						ArmorStandUtils.rotateArmlZ(p);
						ArmorStandUtils.rotateArmlZ(p);
						ArmorStandUtils.rotateArmlZ(p);
						ArmorStandUtils.rotateArmlZ(p);
						ArmorStandUtils.rotateArmlZ(p);
					}
				}
				
				
			}
			e.setCancelled(true);
		}
	}

}
