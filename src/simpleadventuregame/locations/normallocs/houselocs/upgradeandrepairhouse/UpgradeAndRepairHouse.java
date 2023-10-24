package simpleadventuregame.locations.normallocs.houselocs.upgradeandrepairhouse;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.locations.normallocs.houselocs.blacksmith.normalBlackSmith.GeneralCraftingTable;
import simpleadventuregame.utils.PlayerScanner;

public class UpgradeAndRepairHouse extends NormalLoc {

	public UpgradeAndRepairHouse(Player player) {
		super(22, player, "Upgrade And Repair House");
		
	}

	@Override
	public boolean onLocation() {
		
		System.out.println("You are in Upgrade And Repair House");
		boolean blackSmithMenu = true;
		while (blackSmithMenu) {
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
				blackSmithMenu = false;
				break;

			}
		}
		return true;
	}

	
		public boolean repairStation() {
			
			
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
	
}
