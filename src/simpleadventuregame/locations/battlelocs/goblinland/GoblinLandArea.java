package simpleadventuregame.locations.battlelocs.goblinland;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.Location;
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
					"1 - Goblin Camp \n 2- Goblin Cave \n 3- Orc's Mine  \n 4-   \n 5-  \n 6- Exit from Forest Area ");

			System.out.println(
					"---Goblin Camp : (ID=16) Enemy= Little Goblin      Award= Emerald (%80change) + Iron (%800change) ---");
			System.out.println(
					"---Goblin Cave : (ID=17) Enemy= Mountain Goblin    Award= Steel (%80change) + Food  (%70change) ---");
			System.out.println(
					"---Orc's Mine  : (ID=18) Enemy= Orc                Award= HammerParts (%80change) + Water  (%70change) ---");

			System.out.print("Select : ");

			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
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

				break;
			case 5:

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
