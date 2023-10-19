package simpleadventuregame.locations.normallocs.houselocs.blacksmith.normalBlackSmith;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.armors.blacksmitharmors.GreenElfArmor;
import simpleadventuregame.items.armors.blacksmitharmors.IronArmor;
import simpleadventuregame.items.armors.blacksmitharmors.WoodArmor;



public class ArmorCraftingTable {
	
	Player player;
	
	public ArmorCraftingTable(Player player) {
		this.player = player;
	}
//	
//	public void armorCraftList() {
//		System.out.println("Armor: WoodArmor  Items to Create :     Iron : 0 Wood: 3 Water: 1");
////		TODO: ADD MORE WEAPON TO CRAFT
//	}
	
	
	public void craftWoodArmor() {
		if (getInventory().getWoodCount() >= 4 && getInventory().getWaterCount() >= 1) {
			getInventory().setArmor(new WoodArmor());
			getInventory().setWoodCount(getInventory().getWoodCount() - 4);
			getInventory().setWaterCount(getInventory().getWaterCount() - 1);
			System.out.println("-------------------------- \n Wood Armor Crafted \n --------------------------");
			System.out.println("------------- \n Wood Armor info: [4] [DamageDodge:  2 (Craft Item) ]  ");
		} else {
			System.out.println("You don't have enough item");
		}
	}

	public void craftIronArmor() {
		if (getInventory().getIronCount() >= 3 && getInventory().getWoodCount() >= 1
				&& getInventory().getWaterCount() >= 2) {
			getInventory().setArmor(new IronArmor());
			getInventory().setIronCount(getInventory().getIronCount() - 3);
			getInventory().setWoodCount(getInventory().getWoodCount() - 1);
			getInventory().setWaterCount(getInventory().getWaterCount() - 2);
			System.out.println("-------------------------- \n Iron Armor Crafted \n --------------------------");
			System.out.println("------------- \n Iron Armor info: [5] [DamageDodge:  6 (Craft Item) ]  ");
		} else {
			System.out.println("You don't have enough item");
		}
	}

	public void craftGreenElfArmor() {
		if (getInventory().getDiamondCount() >= 1 && getInventory().getIronCount() >= 2
				&& getInventory().getWaterCount() >= 2) {
			getInventory().setArmor(new GreenElfArmor());
			getInventory().setDiamondCount(getInventory().getDiamondCount() - 1);
			getInventory().setIronCount(getInventory().getIronCount() - 3);
			getInventory().setWaterCount(getInventory().getWaterCount() - 2);
			System.out.println("-------------------------- \n Green Elf Armor Crafted \n --------------------------");
			System.out.println("------------- \n Iron Armor info: [8] [DamageDodge:  8 (Craft Item) ]  ");
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
