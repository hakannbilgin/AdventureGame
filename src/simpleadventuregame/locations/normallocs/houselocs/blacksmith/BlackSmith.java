package simpleadventuregame.locations.normallocs.houselocs.blacksmith;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class BlackSmith extends NormalLoc {

	private WeaponCraftingTable weaponCraftingTable;
	private ArmorCraftingTable armorCraftingTable;
	private ToolCraftingTable toolCraftingTable;
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
//		weaponCraftingTable = new WeaponCraftingTable(getPlayer());
//		armorCraftingTable = new ArmorCraftingTable(getPlayer());
		boolean blackSmithMenu = true;
		while (blackSmithMenu) {
			System.out.println("1 - General Crafting ");
			System.out.println("2 - Craft Tools");
			System.out.println("3 - Weapon Crafting");
			System.out.println("4 - Armor Crafting");
			System.out.println("5 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 4) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				generalCrafting();

				break;
			case 2:
				toolCrafting();

				break;
			case 3:
				weaponCrafting();
				break;
			case 4:

//				armorCraftingTable = new ArmorCraftingTable(getPlayer());
				armorCrafting();
				break;

			case 5:
				System.out.println("You exit from BlackSmith");
				blackSmithMenu = false;
				break;

			}
		}
		return true;
	}

	public boolean generalCrafting() {

		toolCraftingTable = new ToolCraftingTable(getPlayer());
		System.out.println("You are at General Craft Table");

		boolean weaponCraftMenu = true;
		while (weaponCraftMenu) {

			System.out.println("1 -  ----- Items to Create :                 ");
			System.out.println("2 -  ----- Items to Create :                 ");
			System.out.println("3 -  ----- Items to Create :                 ");
			System.out.println("4 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 4) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				System.out.println("You leave from General Craft Table");
				weaponCraftMenu = false;
				break;

			}
		}
		return true;
	}

	public boolean toolCrafting() {

		toolCraftingTable = new ToolCraftingTable(getPlayer());
		System.out.println("You are at Tool Craft Table");

		boolean weaponCraftMenu = true;
		while (weaponCraftMenu) {

			System.out.println(
					"1 -Craft Wood Hammer   ----- Items to Create :                 Iron   : 0   Wood :  4  Water: 1  (Use Count : 5) Non-Repariable");
			System.out.println(
					"2- Craft Wood Armor    ----- Items to Create :                 Iron   : 2   Wood :  2  Water: 1  (Use Count : 5) Non-Repariable");
			System.out.println(
					"3- Craft Steel Hammer  ----- Items to Create :   Qualified Tool Parts : 3   Steel:  1  Iron : 1  (Use Count : 5) Repairable ");
			System.out.println("4 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 4) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				toolCraftingTable.craftWoodHammer();
				break;
			case 2:
				toolCraftingTable.craftIronHammer();
				break;
			case 3:
				toolCraftingTable.craftSteelHammer();
				break;
			case 4:
				System.out.println("You leave from Tool Craft Table");
				weaponCraftMenu = false;
				break;

			}
		}
		return true;
	}

	public boolean weaponCrafting() {
		weaponCraftingTable = new WeaponCraftingTable(getPlayer());
		System.out.println("You are at Weapon Craft Table");

		boolean weaponCraftMenu = true;
		while (weaponCraftMenu) {
			this.getPlayer().printDetailedInfo();
			System.out.println(
					"1 - Craft Double Dagger   Damage: 4      ----- Items to Create :     Iron    : 2 Wood:  4  Water: 1 ");
			System.out.println(
					"2 - Craft Spear           Damage: 6      ----- Items to Create :     Iron    : 4 Wood:  2  Water: 1 ");
			System.out.println(
					"3 - Elf's First Sword     Damage: 8      ----- Items to Create :     Diamond : 1 Iron:  4  Water: 1 ");
			System.out.println(
					"4 - Diamond Sword         Damage: 14     ----- Items to Create :     Diamond : 2 Steel: 3  Water: 2 (Requires Hammer)");
			System.out.println("5- Exit ");
//			System.out.println("6 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 4) {
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
				weaponCraftingTable.craftElfsFirstSword();
				break;
			case 4:
				if (this.getPlayer().getInventory().getTool().getId() != 3) {
					System.out.println("You need true tool to craft this item");
				} else if (this.getPlayer().getInventory().getTool().getUseCount() <= 0) {
					System.out.println("Your tool is broken, craft new tool");
				} else {
					weaponCraftingTable.craftDiamondSword();
				}

				break;

			case 5:
				System.out.println("You leave from Weapon Craft Table");
				weaponCraftMenu = false;
				break;

			}
		}
		return true;
	}

	public boolean armorCrafting() {

		System.out.println("You are at Armor Craft Table");
		armorCraftingTable = new ArmorCraftingTable(getPlayer());

		boolean weaponCraftMenu = true;
		while (weaponCraftMenu) {

			System.out.println(
					"1 - Craft Wood Armor           Dodge:2             ---- Items to Create : Iron : 0  Wood: 4  Water:  1 ");
			System.out.println(
					"2-  Craft Iron Armor           Dodge:6             ---- Items to Create : Iron : 3  Wood: 1  Water:  2 ");
			System.out.println(
					"3-  Craft Green Elf Armor      Dodge:11            ---- Items to Create : Diamond:1 Iron: 3  Water:  2 ");
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
				armorCraftingTable.craftGreenElfArmor();
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
