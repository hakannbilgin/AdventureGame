package simpleadventuregame.locations.normallocs;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.utils.PlayerScanner;

public class MagicalElfStore extends NormalLoc {

	public MagicalElfStore( Player player) {
		super(8, player, "magical Elf Store");
		
	}

	@Override
	public boolean onLocation() {

		System.out.println("-----Welcome to Magical Elf store !-----");

		boolean showMenu = true;
		while (showMenu) {

			System.out.println("1 - ");
			System.out.println("2 - ");
			System.out.println("3 - ");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:

				break;
			case 2:

				break;
			case 3:
				System.out.println("You exit from Elf Store");
				showMenu = false;
				break;

			}
		}
		return true;
	}

}
