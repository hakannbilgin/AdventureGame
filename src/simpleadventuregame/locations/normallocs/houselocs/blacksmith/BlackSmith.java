package simpleadventuregame.locations.normallocs.houselocs.blacksmith;

import simpleadventuregame.game.Player;
import simpleadventuregame.items.weapons.Spear;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class BlackSmith extends NormalLoc {

	private WeaponCraftingTable weaponCraftingTable;
//	private String weaponCraftListformat = " WeaponCraft :  [%-7s] [%d] [Damage:  %-1d] [Money: %2d] \n";

	public BlackSmith(Player player) {
		super(player, "BlackSmith");

	}

	@Override
	public boolean onLocation() {
		System.out.println("You are in BlackSmith");

		boolean blackSmithMenu = true;
		while (blackSmithMenu) {

			System.out.println("1 - Weapon Crafting");
			System.out.println("2 - Armor Crafting");
			System.out.println("3 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				weaponCrafting();

				break;
			case 2:

				break;
			case 3:
				System.out.println("You exit from BlackSmith");
				blackSmithMenu = false;
				break;

			}
		}
		return true;
	}

	public boolean weaponCrafting() {
		System.out.println("You are at Weapon Craft Table");

		boolean weaponCraftMenu = true;
		while (weaponCraftMenu) {

			System.out.println("1 - Craft Spear");
			System.out.println("2-  ");
			System.out.println("3 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				craftSpear();
				break;
			case 2:

				break;
			case 3:
				System.out.println("You leave from Weapon Craft Table");
				weaponCraftMenu = false;
				break;

			}
		}
		return true;
	}

	public void craftSpear() {
		if (this.getPlayer().getInventory().getIronCount()>=1 && this.getPlayer().getInventory().getWoodCount()>=2 && this.getPlayer().getInventory().getWaterCount()>=0) {
			this.getPlayer().getInventory().setWeapon(new Spear());
			this.getPlayer().getInventory().setIronCount(-1);
			this.getPlayer().getInventory().setWoodCount(-2);
			this.getPlayer().getInventory().setWaterCount(-1);
			System.out.println("-------------------------- \n Spear Crafted \n --------------------");
			
		}else {
			System.out.println("You don't have enough item");
		}
	}

}
