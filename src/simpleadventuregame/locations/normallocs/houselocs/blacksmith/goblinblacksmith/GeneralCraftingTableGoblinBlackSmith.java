package simpleadventuregame.locations.normallocs.houselocs.blacksmith.goblinblacksmith;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.generalitems.keys.GoblinKey;
import simpleadventuregame.items.weapons.blacksmithweapons.DoubleDagger;

public class GeneralCraftingTableGoblinBlackSmith {

	Player player;

	public GeneralCraftingTableGoblinBlackSmith(Player player) {
		this.player = player;
	}

	public void craftGoblinKey() {

//		if (getInventory().getIronCount() >= 2 && getInventory().getWoodCount() >= 4
//				&& getInventory().getWaterCount() >= 1 &&this.getInventory().getTool().use()) {
//			getInventory().getKeyChest().setGoblinKeyCount(getInventory().getKeyChest().getGoblinKeyCount() + 1);
//			getInventory().setIronCount(getInventory().getIronCount() - 2);
//			getInventory().setWoodCount(getInventory().getWoodCount() - 4);
//			getInventory().setWaterCount(getInventory().getWaterCount() - 1);
//			
//			System.out.println("-------------------------- \n Double Dagger Crafted \n --------------------");
//			System.out.println("------------- \n Spear info: [Id: 4] [Damage:  4] [Money: 0 (Craft Item)]   ");
//
//		} else {
//			System.out.println("You don't have enough item");
//		}

		if (getInventory().getIronCount() < 2 && getInventory().getWoodCount() < 4
				&& getInventory().getWaterCount() < 1) {
			System.out.println("You don't have enough item");
		} else if (!this.getInventory().getTool().use()) {
			System.out.println("Your tool doesn't have enough use count");
		} else {
			getInventory().getKeyChest().setGoblinKeyCount(getInventory().getKeyChest().getGoblinKeyCount() + 1);
			getInventory().setIronCount(getInventory().getIronCount() - 2);
			getInventory().setWoodCount(getInventory().getWoodCount() - 4);
			getInventory().setWaterCount(getInventory().getWaterCount() - 1);

			System.out.println("-------------------------- \n Goblin Key Crafted \n --------------------");
			System.out.println("------------- \n Key Count info: "+this.getInventory().getKeyChest().getGoblinKeyCount() +" ]   ");
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
