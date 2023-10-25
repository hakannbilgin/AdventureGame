package simpleadventuregame.locations.normallocs.houselocs;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.Item;
import simpleadventuregame.items.Loot.Award;
import simpleadventuregame.items.Loot.boxes.ElfKingBox;
import simpleadventuregame.items.Loot.boxes.GoblinKingBox;
import simpleadventuregame.items.armors.Armor;
import simpleadventuregame.items.weapons.Weapon;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class SafeHouse extends NormalLoc {
	private String infoPlayer = " Info :  [Your Health:  %-1d] [Your FoodCount:  %-1d] [Your WaterCount:  %-1d] [Your Satietry Level:  %-1d/20] [Your Thirst Level:  %-1d/20] \n";
//	private String infoTrollBoxListFormat = " Item :  [%-11s] [Id :%d] [Count:  %-1d]   \n";

	private ElfKingBox elfKingBox = new ElfKingBox();
	private GoblinKingBox goblinKingBox = new GoblinKingBox();

	public SafeHouse(Player player) {
		super(1, player, "Safe House");

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
			System.out.println("3 - Open a box from Your inventory");
			System.out.println("4 - Clean the broken Tool -  (You will have useless stick(Only Useable for ---))");
			System.out.println("4 - Exit");
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
				openBoxInSafeHouse2();
				break;
			case 4:
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
			this.getPlayer().getInventory().setFoodCount(this.getPlayer().getInventory().getFoodCount() - 1);
			this.getPlayer().setSatiety(this.getPlayer().getSatiety() + 2);
		}

	}

	public void openBoxInSafeHouse2() {

		if (infoGiftBox() == true) {
			boolean openBoxMenu = true;
			while (openBoxMenu) {

				System.out.println("------------ \n Do you want to Open a box \n ------------");
				System.out.println(" 1 - Open a Elf King Box \n 2- Goblin King Box  \n 3- Exit ");

				System.out.print("Select : ");

				int selectCase = PlayerScanner.intScanner();

				while (selectCase < 0 && selectCase > 3) {
					System.out.println(" you entered invalid number, please enter again ! ");
					selectCase = PlayerScanner.intScanner();
				}

				switch (selectCase) {
				case 1:
					openElfKingBox();
					break;
				case 2:
					openGoblinKingBox();
					break;
				case 3:
					System.out.println("You exit from Safe House");
					openBoxMenu = false;
					break;

				}

			}
		}

	}

	public boolean infoGiftBox() {
		if (this.getInventory().getBoxChest().getTotalBoxCount() == 0) {
			System.out.println(" You Don't have any GiftBox, You need to kill boss to gain GiftBox");
			return false;
		} else {
			System.out.println("Elf King Box : " + this.getInventory().getBoxChest().getElfKingBoxCount());

		}
		return true;
	}

	public void openElfKingBox() {

		if (this.getInventory().getBoxChest().getElfKingBoxCount() > 0) {
			System.out.println("YOU ARE COLLECTING YOUR BOX");
			this.getInventory().getBoxChest()
					.setElfKingBoxCount(this.getInventory().getBoxChest().getElfKingBoxCount() - 1);
			this.collectBoxAward(elfKingBox.openBox());

		} else {
			System.out.println("You don't have any Elf King's box");
		}

	}

	public void openGoblinKingBox() {
		if (this.getInventory().getBoxChest().getElfKingBoxCount() > 0) {
			System.out.println("YOU ARE COLLECTING YOUR BOX");
			this.getInventory().getBoxChest()
					.setElfKingBoxCount(this.getInventory().getBoxChest().getElfKingBoxCount() - 1);
			this.collectBoxAward(goblinKingBox.openBox());

		} else {
			System.out.println("You don't have any Elf King's box");
		}

	}

	public void collectBoxAward(Item item) {

		if (item instanceof Award) {

			this.getInventory().addBoxAwardItem(item);

		} else if (item instanceof Armor) {
			getInventory().setArmor((Armor) item);

			System.out.println("You gained " + item.getName());

		} else if (item instanceof Weapon) {
			getInventory().setWeapon((Weapon) item);
			System.out.println("You gained " + item.getName());
		}

	}

	public Inventory getInventory() {

		return this.getPlayer().getInventory();
	}

//	public void collectBoxAward(Item item) {
//
//		if (item instanceof Award && item.getId() == 1) {
//
//			getInventory().setFoodCount(getInventory().getFoodCount() + 1);
//			System.out
//					.println("You gained Food from Box and your current Food Count is" + getInventory().getFoodCount());
//
//		} else if (item instanceof Award && item.getId() == 2) {
//			getInventory().setWaterCount(getInventory().getWaterCount() + 1);
//			System.out.println(
//					"You gained Food from Box and your current Water Count is" + getInventory().getWaterCount());
//		} else if (item instanceof Award && item.getId() == 3) {
//			getInventory().setWoodCount(this.getPlayer().getInventory().getWoodCount() + 1);
//			System.out
//					.println("You gained Food from Box and your current Wood Count is" + getInventory().getWoodCount());
//		} else if (item instanceof Award && item.getId() == 4) {
//			getInventory().setIronCount(getInventory().getIronCount() + 1);
//			System.out
//					.println("You gained Food from Box and your current Iron Count is" + getInventory().getIronCount());
//		} else if (item instanceof Award && item.getId() == 5) {
//			getInventory().setDarkStone(getInventory().getDarkStone() + 1);
//			System.out.println(
//					"You gained Food from Box and your current DarkStone Count is" + getInventory().getDarkStone());
//		} else if (item instanceof Award && item.getId() == 6) {
//			getInventory().setDiamondCount(getInventory().getDiamondCount() + 1);
//			System.out.println(
//					"You gained Food from Box and your current Diamond Count is" + getInventory().getDiamondCount());
//
//		} else if (item instanceof Armor && item.getId() == 7) {
//			getInventory().setArmor(new TrollArmor());
//
//			System.out.println("You gained Troll Armor");
//
//		}
//	}

//	public void openBoxInSafeHouse() {
//
//		
//		if (infoGiftBox()==true) {
//			
//		}
//
//		boolean openBoxMenu = true;
//		while (openBoxMenu) {
//
//			System.out.println("------------ \n Do you want to Open a box \n ------------");
//			System.out.println(" 1 - Open a Troll Box \n 2-   \n 3- Exit ");
//
//			System.out.print("Select : ");
//
//			int selectCase = PlayerScanner.intScanner();
//
//			while (selectCase < 0 && selectCase > 3) {
//				System.out.println(" you entered invalid number, please enter again ! ");
//				selectCase = PlayerScanner.intScanner();
//			}
//			System.out.println("Burada1");
//			if (selectCase == 1) {
//				System.out.println("Burada2");
//				this.openTrollBox();
//				return;
//			} else if (selectCase == 2) {
//				System.out.println("Burada 3");
//				return;
//			} else if (selectCase == 3) {
//				System.out.println("You exit from Safe House");
//				System.out.println("Burada 4");
//				openBoxMenu = false;
//				return;
//			}
//
//		}
//	}

}
