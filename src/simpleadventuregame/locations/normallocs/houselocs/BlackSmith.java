package simpleadventuregame.locations.normallocs.houselocs;


import simpleadventuregame.game.Player;
import simpleadventuregame.locations.Location;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class BlackSmith extends NormalLoc{

//	private String weaponCraftListformat = " WeaponCraft :  [%-7s] [%d] [Damage:  %-1d] [Money: %2d] \n";
	
	public BlackSmith(Player player) {
		super(player, "BlackSmith");
		
	}

	@Override
	public boolean onLocation() {
		System.out.println("You are in BlackSmith");
		boolean menu = true;
		while (menu) {

			System.out.println("1 - Weapon Crafting");
			System.out.println("2 - Armor Crafting");
			System.out.println("3 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				weaponCrafting();

				break;
			case 2:
				
				break;
			case 3:
				System.out.println("You exit from BlackSmith");
				menu = false;
				break;

			}
		}
		return true;
	}

	public void weaponCraftList() {
		
	}

	public void weaponCrafting() {
		
	}
	

	
}
