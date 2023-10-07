package simpleadventuregame.locations.normallocs.houselocs.blacksmith;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.weapons.blacksmithweapons.ElfsFirstSword;
import simpleadventuregame.items.weapons.blacksmithweapons.DoubleDagger;
import simpleadventuregame.items.weapons.blacksmithweapons.Spear;

public class WeaponCraftingTable {

	Player player;

	public WeaponCraftingTable(Player player) {
		this.player = player;
	}

//	public void weaponCraftList() {
//		System.out.println("Weapon: Spear  Items to Create :     Iron : 1 Wood: 2 Water: 1");
////		TODO: ADD MORE WEAPON TO CRAFT
//	}

	public void craftDoubleDagger() {
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

	public void craftSpear() {
		if (getInventory().getIronCount() >= 4 && getInventory().getWoodCount() >= 2
				&& getInventory().getWaterCount() >= 1) {
			getInventory().setWeapon(new Spear());
			getInventory().setIronCount(getInventory().getIronCount() - 4);
			getInventory().setWoodCount(getInventory().getWoodCount() - 2);
			getInventory().setWaterCount(getInventory().getWaterCount() - 1);
			System.out.println("-------------------------- \n Spear Crafted \n --------------------");
			System.out.println("------------- \n Spear info: [Id: 5] [Damage:  6] [Money: 0 (Craft Item)]   ");

		} else {
			System.out.println("You don't have enough item");
		}
	}
	
	public void craftElfsFirstSword() {
		if (getInventory().getDiamondCount() >= 2 && getInventory().getIronCount() >= 3
				&& getInventory().getWaterCount() >= 1) {
			getInventory().setWeapon(new ElfsFirstSword());
			getInventory().setDiamondCount(getInventory().getDiamondCount() - 2);
			getInventory().setIronCount(getInventory().getIronCount() - 4);
			getInventory().setWaterCount(getInventory().getWaterCount() - 1);
			System.out.println("-------------------------- \n Elf's First Sword Crafted \n --------------------------");
			System.out.println("------------- \n Elf's First Sword info: [Id:7] [Damage:  9] [Money: 0 (Craft Item)] ");
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
