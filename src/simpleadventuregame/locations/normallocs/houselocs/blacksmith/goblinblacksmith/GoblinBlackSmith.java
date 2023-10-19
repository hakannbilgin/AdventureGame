package simpleadventuregame.locations.normallocs.houselocs.blacksmith.goblinblacksmith;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class GoblinBlackSmith extends NormalLoc{

	public GoblinBlackSmith( Player player) {
		super(21, player, "Goblin BlackSmith");
		
	}

	@Override
	public boolean onLocation() {
//		this.getPlayer().getInventory().setWaterCount(500);
//		this.getPlayer().getInventory().setWoodCount(500);
//		this.getPlayer().getInventory().setIronCount(500);
		System.out.println("You are in Goblin BlackSmith");
//		weaponCraftingTable = new WeaponCraftingTable(getPlayer());
//		armorCraftingTable = new ArmorCraftingTable(getPlayer());
		boolean blackSmithMenu = true;
		while (blackSmithMenu) {
			System.out.println("1 - General Crafting ");
			System.out.println("2 - Craft Tools");
			System.out.println("3 - Weapon Crafting");
			System.out.println("4 - Armor Crafting");
			System.out.println("5 - Exit");
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

				break;

			case 5:
				System.out.println("You exit from BlackSmith");
				blackSmithMenu = false;
				break;

			}
		}
		return true;
	}

	

}
