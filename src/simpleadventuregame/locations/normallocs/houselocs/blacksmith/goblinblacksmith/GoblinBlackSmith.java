package simpleadventuregame.locations.normallocs.houselocs.blacksmith.goblinblacksmith;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class GoblinBlackSmith extends NormalLoc {

	private GeneralCraftingTableGoblinBlackSmith generalCraftingTableGoblinBlackSmith;

	public GoblinBlackSmith(Player player) {
		super(21, player, "Goblin BlackSmith");

	}

	@Override
	public boolean onLocation() {

		System.out.println("You are in Goblin BlackSmith");
		boolean blackSmithMenu = true;
		while (blackSmithMenu) {
			System.out.println("1 - General Crafting ");
			System.out.println("2 - Craft Tools");
			System.out.println("3 - Weapon Crafting");
			System.out.println("4 - Armor Crafting");
			System.out.println("5 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 6) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				generalCraftingInGoblinBlackSmith();
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

	public boolean generalCraftingInGoblinBlackSmith() {

		generalCraftingTableGoblinBlackSmith = new GeneralCraftingTableGoblinBlackSmith(getPlayer());
		System.out.println("You are at General Craft Table");
//		this.getPlayer().getInventory().setIronCount(10);
//		this.getPlayer().getInventory().setWoodCount(10);
//		this.getPlayer().getInventory().setWaterCount(10);

		boolean generalCraftMenu = true;
		while (generalCraftMenu) {

			System.out.println("1 - Goblin Key(ID:1) ----- Items to Create :                 ");
			System.out.println("2 -  ----- Items to Create :                 ");
			System.out.println("3 -  ----- Items to Create :                 ");
			System.out.println("4 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();
			while (selectCase < 0 && selectCase > 4) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			if (this.getPlayer().getInventory().getTool().getId() < 3) {

				switch (selectCase) {
				case 1:
					if (this.getPlayer().getInventory().getTool().getId() < 3) {
						System.out.println("You don't have true tool to create");
						break;
					} else {
						generalCraftingTableGoblinBlackSmith.craftGoblinKey();
						break;
					}
				case 2:
					if (this.getPlayer().getInventory().getTool().getId() < 3) {
						System.out.println("You don't have true tool to create");
						break;
					} else {
						// TODO:
						break;
					}
				case 3:
					if (this.getPlayer().getInventory().getTool().getId() < 3) {
						System.out.println("You don't have true tool to create");
						break;
					} else {
						// TODO:
						break;
					}
				case 4:
					System.out.println("You leave from General Craft Table");
					generalCraftMenu = false;
					break;

				}
			}else {
				System.out.println("You don't have true tool to create");
			}
		}
		return true;

	}

}
