package simpleadventuregame.locations.normallocs.houselocs.blacksmith;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.armors.blacksmitharmors.BlueSpiritArmor;
import simpleadventuregame.items.armors.blacksmitharmors.IronArmor;
import simpleadventuregame.items.armors.blacksmitharmors.WoodArmor;
import simpleadventuregame.items.weapons.blacksmithweapons.DoubleDagger;
import simpleadventuregame.items.weapons.blacksmithweapons.Spear;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class BlackSmith extends NormalLoc {

//	private WeaponCraftingTable weaponCraftingTable;
//	private ArmorCraftingTable armorCraftingTable;
//	private String weaponCraftListformat = " WeaponCraft :  [%-7s] [%d] [Damage:  %-1d] [Money: %2d] \n";

	public BlackSmith(Player player) {
		super(3, player, "BlackSmith");

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
				armorCrafting();
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

			System.out.println(
					"1 - Craft Double Dagger   Damage: 2  ----- Items to Create :     Iron : 2 Wood: 4 Water: 1 ");
			System.out.println(
					"2 - Craft Spear           Damager:9  ----- Items to Create :     Iron : 4 Wood: 2 Water: 1 ");
			System.out.println("3-  ");
			System.out.println("4 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				craftDoubleDagger();
				break;
			case 2:
				craftSpear();
				break;
			case 3:

				break;
			case 4:
				System.out.println("You leave from Weapon Craft Table");
				weaponCraftMenu = false;
				break;

			}
		}
		return true;
	}

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

	public boolean armorCrafting() {

		System.out.println("You are at Armor Craft Table");

		boolean weaponCraftMenu = true;
		while (weaponCraftMenu) {

			System.out.println(
					"1 - Craft Wood Armor           Dodge:1             ---- Items to Create : Iron : 0  Wood: 3  Water:  1 ");
			System.out.println(
					"2-  Craft Iron Armor           Dodge:6             ---- Items to Create : Iron : 3  Wood: 1  Water:  2 ");
			System.out.println(
					"3-  Craft Blue Spirit Armor    Dodge:11            ---  Items to Create : Diamond:1 Iron: 2  Water:  2 ");
			System.out.println("4 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 4) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				craftWoodArmor();
				break;
			case 2:
				craftIronArmor();
				break;
			case 3:
				craftBlueSpiritArmor();
				break;
			case 4:
				System.out.println("You leave from Armor Craft Table");
				weaponCraftMenu = false;
				break;

			}
		}
		return true;
	}

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

	public Inventory getInventory() {

		return this.getPlayer().getInventory();
	}

}
