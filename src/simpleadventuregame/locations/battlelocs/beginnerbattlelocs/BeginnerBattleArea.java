package simpleadventuregame.locations.battlelocs.beginnerbattlelocs;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.Location;
import simpleadventuregame.utils.PlayerScanner;

public class BeginnerBattleArea extends Location {

	public BeginnerBattleArea(Player player) {
		super(16, player, "Beginner Battel Area");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {

		boolean forestMenu = true;
		while (forestMenu) {
			System.out.println(
					"-----You are at the Beginner Area----- \n -*-*-*- You choose Forest BattleLocations -*-*-*-");
			System.out.println("1 - Cave \n 2- Temple \n 3- Normal Forest  \n 4- River \n 5- Exit");

			System.out.println("---Cave  :            (ID=4) Enemy= Zombie   Award= Food  ---");
			System.out.println("---Temple:            (ID=5) Enemy= Skeleton Award= Iron  ---");
			System.out.println("---Normal Forest:     (ID=6) Enemy= Vampire  Award= Wood  ---");
			System.out.println("---River :            (ID=7) Enemy= Bear     Award= Water ---");

			System.out.print("Select : ");

			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 6) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				new Cave(getPlayer()).onLocation();

				break;
			case 2:

				new Temple(getPlayer()).onLocation();
				break;
			case 3:

				new NormalForest(getPlayer()).onLocation();
				break;
			case 4:
				new River(getPlayer()).onLocation();

				break;
			case 5:
				System.out.println("You exit from Forest Area");
				forestMenu = false;
				break;

			}
		}

		return true;
	}

}
