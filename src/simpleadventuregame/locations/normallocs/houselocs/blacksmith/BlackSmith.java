package simpleadventuregame.locations.normallocs.houselocs.blacksmith;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class BlackSmith extends NormalLoc {

	private WeaponCraftingTable weaponCraftingTable;
	private ArmorCraftingTable armorCraftingTable;
//	private String weaponCraftListformat = " WeaponCraft :  [%-7s] [%d] [Damage:  %-1d] [Money: %2d] \n";

	public BlackSmith(Player player) {
		super(3, player, "BlackSmith");

	}

	@Override
	public boolean onLocation() {
//		this.getPlayer().getInventory().setWaterCount(500);
//		this.getPlayer().getInventory().setWoodCount(500);
//		this.getPlayer().getInventory().setIronCount(500);
		System.out.println("You are in BlackSmith");
		weaponCraftingTable = new WeaponCraftingTable(getPlayer());
		armorCraftingTable = new ArmorCraftingTable(getPlayer());
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
			this.getPlayer().printDetailedInfo();
			System.out.println(
					"1 - Craft Double Dagger   Damage: 2      ----- Items to Create :     Iron    : 2 Wood: 4  Water: 1 ");
			System.out.println(
					"2 - Craft Spear           Damage: 9      ----- Items to Create :     Iron    : 4 Wood: 2  Water: 1 ");
			System.out.println(
					"3 - Diamond Sword         Damage: 11     ----- Items to Create :     Diamond : 2 Iron: 3  Water: 1 ");
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
				weaponCraftingTable.craftDoubleDagger();
				break;
			case 2:
				weaponCraftingTable.craftSpear();
				break;
			case 3:
				weaponCraftingTable.craftDiamondSword();
				break;
			case 4:
				System.out.println("You leave from Weapon Craft Table");
				weaponCraftMenu = false;
				break;

			}
		}
		return true;
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
				armorCraftingTable.craftWoodArmor();
				break;
			case 2:
				armorCraftingTable.craftIronArmor();
				break;
			case 3:
				armorCraftingTable.craftBlueSpiritArmor();
				break;
			case 4:
				System.out.println("You leave from Armor Craft Table");
				weaponCraftMenu = false;
				break;

			}
		}
		return true;
	}

}
