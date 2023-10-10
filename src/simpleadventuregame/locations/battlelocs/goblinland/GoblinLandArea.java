package simpleadventuregame.locations.battlelocs.goblinland;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.Location;
import simpleadventuregame.locations.normallocs.storelocs.UglyGoblinsStore;
import simpleadventuregame.utils.PlayerScanner;

public class GoblinLandArea extends Location {

	public GoblinLandArea(Player player) {
		super(15, player, "Goblin Land Area");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		boolean forestMenu = true;
		while (forestMenu) {
			System.out.println(
					"-----You are at the Goblin Land Area----- \n -*-*-*- You choose GoblinLand BattleLocations -*-*-*-");
			System.out.println(
					"1 - Goblin Camp \n 2- Goblin Cave \n 3- Orc's Mine  \n 4- Goblin King's Place  \n 5- Ugly Goblin Store  \n 6- Exit from Forest Area ");

			System.out.println(
					"---Goblin Camp       : (ID=16) Enemy= Little Goblin       Award= Emerald (%80change) + Iron (%80change) ---");
			System.out.println(
					"---Goblin Cave       : (ID=17) Enemy= Mountain Goblin     Award= Steel (%80change) + Food  (%70change) ---");
			System.out.println(
					"---Orc's Mine        : (ID=18) Enemy= Orc                 Award= HammerParts (%80change) + Water  (%70change) ---");
			System.out.println(
					"---Goblin King Place : (ID=19) Enemy= Goblin King(Boss)   Award= GoblinKing Box (%80change) + Steel  (%70change) ---");
			System.out.println("---Ugly Goblin Place : (ID=20) Enemy= Safe Place          Purchase Equipments ");

			System.out.print("Select : ");

			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 7) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				new GoblinCamp(getPlayer()).onLocation();

				break;
			case 2:
				new GoblinCave(getPlayer()).onLocation();
				break;
			case 3:
				new OrcsMine(getPlayer()).onLocation();
				break;
			case 4:
				new GoblinKingPlace(getPlayer()).onLocation();
				break;
			case 5:
				new UglyGoblinsStore(getPlayer()).onLocation();
				break;
			case 6:

				System.out.println("You exit from Forest Area");
				forestMenu = false;
				break;

			}
		}

		return true;
	}
}
