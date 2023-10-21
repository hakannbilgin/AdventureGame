package simpleadventuregame.locations.normallocs.houselocs.blacksmith.goblinblacksmith;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.weapons.blacksmithweapons.DoubleDagger;

public class GeneralCraftingTableGoblinBlackSmith {

	Player player;

	public GeneralCraftingTableGoblinBlackSmith(Player player) {
		this.player = player;
	}
	
	
	public void craftGoblinKey() {
		
		if (getInventory().getIronCount() >= 2 && getInventory().getWoodCount() >= 4
				&& getInventory().getWaterCount() >= 1) {
			getInventory().setWeapon(new DoubleDagger());
			getInventory().setIronCount(getInventory().getIronCount() - 2);
			getInventory().setWoodCount(getInventory().getWoodCount() - 4);
			getInventory().setWaterCount(getInventory().getWaterCount() - 1);
			System.out.println("-------------------------- \n Double Dagger Crafted \n --------------------");
			System.out.println("------------- \n Spear info: [Id: 4] [Damage:  4] [Money: 0 (Craft Item)]   ");

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
