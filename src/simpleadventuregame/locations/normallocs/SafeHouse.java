package simpleadventuregame.locations.normallocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.utils.PlayerScanner;

public class SafeHouse extends NormalLoc {
	private String infoPlayer = " Info :  [Your Health:  %-1d] [Your Hunger Level:  %-1d/20] [Your Thirst Level:  %-1d/20] \n";

	public SafeHouse(Player player) {
		super(player, "Safe House");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		System.out.println(" Now you are in the safe house \n Your have been healed, your health is full");
		this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());

		System.out.println("Informations \n ------------------------");
		System.out.printf(infoPlayer, this.getPlayer().getHealth(), this.getPlayer().getSatiety(),
				this.getPlayer().getThirstLevel());

		boolean showMenu = true;
		while (showMenu) {

			System.out.println("1 - Drink Water (One water item add -2 point to your Thirst Level");
			System.out.println("2 - Eat Food (One Food item add +2 point to your Satietry");
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
					"-------------------- \n You can't drink water, yo are not thursty \n --------------------");
		} else {

			this.getPlayer().getInventory().setWaterCount(-1);
			this.getPlayer().setThirstLevel(this.getPlayer().getThirstLevel() - 2);
			if (this.getPlayer().getThirstLevel() < 0) {
				this.getPlayer().setThirstLevel(0);
			}
		}
	}

	public void eatFood() {
		if (this.getPlayer().getSatiety() == 20) {
			System.out.println("-------------------- \n You can't eat food, yo are not hungry \n --------------------");
		} else {

			this.getPlayer().getInventory().setFoodCount(-1);
			this.getPlayer().setSatiety(this.getPlayer().getSatiety() + 2);
			if (this.getPlayer().getThirstLevel() > 20) {
				this.getPlayer().setThirstLevel(20);
			}
		}

	}

}
