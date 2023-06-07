package simpleadventuregame.locations.normallocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.utils.PlayerScanner;

public class ToolStore extends NormalLoc {

	public ToolStore(Player player) {
		super(player, "Store");

	}

	@Override
	public boolean onLocation() {
		System.out.println("-----Welcome to the store !-----");
		System.out.println("1 - Weapons");
		System.out.println("2 - Armors");
		System.out.println("3 - Exit");
		System.out.print("Seçim : ");
		int selectCase = PlayerScanner.intScanner();
		while (selectCase < 1 || selectCase > 3) {
			System.out.println(" you entered invalid number, please enter again ! ");
			selectCase = PlayerScanner.intScanner();
			switch (selectCase) {
			case 1:
				printWeapons();
				break;
			case 2:
				printArmor();
				break;
			case 3:
				System.out.println("You exit from Store");;
				return true;
			}
		}

		return true;
	}

	public void printWeapons() {

	}

	public void printArmor() {

	}
}
