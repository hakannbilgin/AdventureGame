package simpleadventuregame.locations.normallocs.houselocs.upgradeandrepairhouse;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class UpgradeAndRepairHouse extends NormalLoc {

	RepairStation repairStation;

	public UpgradeAndRepairHouse(Player player) {
		super(22, player, "Upgrade And Repair House");

	}

	@Override
	public boolean onLocation() {

		System.out.println("You are in Upgrade And Repair House");
		boolean upgradeAndRepairHouseMenu = true;
		while (upgradeAndRepairHouseMenu) {
			System.out.println("1 - Repair Station ");
			System.out.println("2 - ");
			System.out.println("3 - ");
			System.out.println("4 - ");
			System.out.println("5 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 6) {
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

				break;

			case 5:
				System.out.println("You exit from BlackSmith");
				upgradeAndRepairHouseMenu = false;
				break;

			}
		}
		return true;
	}

	public boolean repairTable() {

		System.out.println("You are at Repair Table");

		boolean repairTableMenu = true;
		while (repairTableMenu) {

			System.out.println("1 - Repair Tool(s)  ");
			System.out.println("2 -                 ");
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
				repairTool();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				System.out.println("You leave from General Craft Table");
				repairTableMenu = false;
				break;

			}
		}
		return true;

	}

	public boolean repairTool() {

		repairStation = new RepairStation(getPlayer());

		System.out.println("You are at Repair Table");

		boolean repairToolMenu = true;
		while (repairToolMenu) {

			System.out.println("1 --- Repair your current tool---");
			System.out.println("1 --- Repair your all tool in your tool Box---");
			System.out.println("3 ---  --- ");
			System.out.println("4 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();
			while (selectCase < 0 && selectCase > 4) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
//				if (this.getPlayer().getInventory().getTool().getId() < 3 ) {
//				}
			switch (selectCase) {
			case 1:
				repairStation.repairCurrentTool();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				System.out.println("You leave from General Craft Table");
				repairToolMenu = false;
				break;

			}
		}
		return true;
	}

}
