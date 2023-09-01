package simpleadventuregame.locations.normallocs.houselocs.blacksmith;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.armors.blacksmitharmors.BlueSpiritArmor;
import simpleadventuregame.items.armors.blacksmitharmors.IronArmor;
import simpleadventuregame.items.armors.blacksmitharmors.WoodArmor;



public class ArmorCraftingTable {
	
	Player player;
	
	public ArmorCraftingTable(Player player) {
		this.player = new Player();
	}
//	
//	public void armorCraftList() {
//		System.out.println("Armor: WoodArmor  Items to Create :     Iron : 0 Wood: 3 Water: 1");
////		TODO: ADD MORE WEAPON TO CRAFT
//	}
	
	
	public void craftWoodArmor() {
		if (getInventory().getWoodCount() >= 5 && getInventory().getWaterCount() >= 1) {
			getInventory().setArmor(new WoodArmor());
			getInventory().setWoodCount(getInventory().getWoodCount() - 5);
			getInventory().setWaterCount(getInventory().getWaterCount() - 1);
			System.out.println("-------------------------- \n Wood Armor Crafted \n --------------------------");
			System.out.println("------------- \n Wood Armor info: [4] [DamageDodge:  5 (Craft Item) ]  ");
		} else {
			System.out.println("You don't have enough item");
		}
	}

	public void craftIronArmor() {
		if (getInventory().getIronCount() >= 4 && getInventory().getWoodCount() >= 2
				&& getInventory().getWaterCount() >= 2) {
			getInventory().setArmor(new IronArmor());
			getInventory().setIronCount(getInventory().getIronCount() - 4);
			getInventory().setWoodCount(getInventory().getWoodCount() - 2);
			getInventory().setWaterCount(getInventory().getWaterCount() - 2);
			System.out.println("-------------------------- \n Iron Armor Crafted \n --------------------------");
			System.out.println("------------- \n Iron Armor info: [5] [DamageDodge:  8 (Craft Item) ]  ");
		} else {
			System.out.println("You don't have enough item");
		}
	}

	public void craftBlueSpiritArmor() {
		if (getInventory().getDiamondCount() >= 1 && getInventory().getIronCount() >= 2
				&& getInventory().getWaterCount() >= 2) {
			getInventory().setArmor(new BlueSpiritArmor());
			getInventory().setDiamondCount(getInventory().getDiamondCount() - 1);
			getInventory().setIronCount(getInventory().getIronCount() - 2);
			getInventory().setWaterCount(getInventory().getWaterCount() - 2);
			System.out.println("-------------------------- \n Blue Spirit Armor Crafted \n --------------------------");
			System.out.println("------------- \n Iron Armor info: [8] [DamageDodge:  11 (Craft Item) ]  ");
		} else {
			System.out.println("You don't have enough item");
		}
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Inventory getInventory() {

		return this.getPlayer().getInventory();
	}
	
}
