package simpleadventuregame.locations.battlelocs.goblinland;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.Location;
import simpleadventuregame.locations.battlelocs.darkforests.AbandonedForest;
import simpleadventuregame.locations.battlelocs.darkforests.DarkForest;
import simpleadventuregame.locations.battlelocs.darkforests.DeadForest;
import simpleadventuregame.locations.battlelocs.darkforests.ElfKingPlace;
import simpleadventuregame.locations.battlelocs.darkforests.EnchantedForest;
import simpleadventuregame.locations.normallocs.storelocs.MagicalElfStore;
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
					"1 - Goblin Camp \n 2- Exit from Forest Area \n 3- Exit from Forest Area  \n 4-  \n 5-  \n 6- ");

			System.out.println(
					"---Goblin Camp : (ID=16) Enemy= Little Goblin      Award= Emerald (%80change) + Water (%70change) ---");

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

				break;
			case 3:

				System.out.println("You exit from Forest Area");
				forestMenu = false;
				break;

			}
		}

		return true;
	}
}
