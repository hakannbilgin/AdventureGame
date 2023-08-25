package simpleadventuregame.locations.battlelocs.darkforests;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.Location;
import simpleadventuregame.utils.PlayerScanner;

public class ForestArea extends Location {

	public ForestArea(Player player) {
		super(10, player, "Forest Location");

	}

	@Override
	public boolean onLocation() {

		boolean forestMenu = true;
		while (forestMenu) {
			System.out.println(
					"-----You are at the Forest Area----- \n -*-*-*- You choose Forest BattleLocations -*-*-*-");
			System.out.println("1 - Enchanted Forest");
			System.out.println("2 - Dark Forest");
			System.out.println(
					"---Enchanted Forest: (ID=8) Enemy= Elf      Award= Dark Stone (%40change) + Water (%70change) ---");
			System.out.println(
					"---Dead Forest       (ID=9) Enemy= Spirit   Award= Diamond(%80chance) + Food(%70change) ");
			System.out.println("3 - Exit");

			System.out.print("Select : ");

			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				new EnchantedForest(getPlayer()).onLocation();

				break;
			case 2:

				if (this.getPlayer().getInventory().getDarkStone() >= 1) {
					new DeadForest(getPlayer()).onLocation();
					this.getPlayer().getInventory().setDarkStone(this.getPlayer().getInventory().getDarkStone() - 1);
				} else {
					System.out.println("You can't enter the Dark Forest because you don't have Dark Stone");
					continue;
				}
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
