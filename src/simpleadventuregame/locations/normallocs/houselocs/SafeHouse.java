package simpleadventuregame.locations.normallocs.houselocs;

import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class SafeHouse extends NormalLoc {
	private String infoPlayer = " Info :  [Your Health:  %-1d] [Your FoodCount:  %-1d] [Your WaterCount:  %-1d] [Your Satietry Level:  %-1d/20] [Your Thirst Level:  %-1d/20] \n";

	public SafeHouse(Player player) {
		super(1 ,player, "Safe House");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		System.out.println(" Now you are in the safe house \n Your have been healed, your health is full");
		this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());

		boolean showMenu = true;
		while (showMenu) {
			System.out.println("Informations \n ------------------------");
			System.out.printf(infoPlayer, this.getPlayer().getHealth(), this.getPlayer().getInventory().getFoodCount(),
					this.getPlayer().getInventory().getWaterCount(), this.getPlayer().getSatiety(),
					this.getPlayer().getThirstLevel());

			System.out.println("1 - Drink Water (One water item add -2 point to your Thirst Level");
			System.out.println("2 - Eat Food (One Food item add +2 point to your Satietry");
//			System.out.println("3 - Craft Room (Crafting new items for your battle)");
			System.out.println("3 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				drinkWater();
				break;
			case 2:
				eatFood();
				break;
//			case 3:
//				
//				break;
			case 3:
				System.out.println("You exit from Safe House");
				showMenu = false;
				break;

			}
		}
		return true;

	}

	public void drinkWater() {
		if (this.getPlayer().getThirstLevel() == 0) {
			System.out.println(
					"-------------------- \n You can't drink water, you are not thursty \n --------------------");
		} else if (this.getPlayer().getInventory().getWaterCount() == 0) {
			System.out.println(
					"-------------------- \n You can't drink water, you don't have water \n --------------------");
		} else {
			this.getPlayer().getInventory().setWaterCount(this.getPlayer().getInventory().getWaterCount() - 1);
			this.getPlayer().setThirstLevel(this.getPlayer().getThirstLevel() - 2);
			
		}
	}

	public void eatFood() {
		if (this.getPlayer().getSatiety() == 20) {
			System.out.println("-------------------- \n You can't eat food, yo are not hungry \n --------------------");
		} else if (this.getPlayer().getInventory().getFoodCount() == 0) {
			System.out.println(
					"-------------------- \\n You can't eat food, you don't have food \\n --------------------");
		} else {
			this.getPlayer().getInventory().setFoodCount(this.getPlayer().getInventory().getFoodCount() -1);
			this.getPlayer().setSatiety(this.getPlayer().getSatiety() + 2);
//			
		}

	}

}
