package simpleadventuregame.game;

import simpleadventuregame.game.gamecharacters.Archer;
import simpleadventuregame.game.gamecharacters.GameChar;
import simpleadventuregame.game.gamecharacters.Knight;
import simpleadventuregame.game.gamecharacters.Samurai;
import simpleadventuregame.game.gamecharacters.SpearMan;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.Location;
import simpleadventuregame.locations.battlelocs.beginnerbattlelocs.BeginnerBattleArea;
import simpleadventuregame.locations.battlelocs.darkforests.ForestArea;
import simpleadventuregame.locations.battlelocs.goblinland.GoblinLandArea;
import simpleadventuregame.locations.normallocs.houselocs.SafeHouse;
import simpleadventuregame.locations.normallocs.houselocs.blacksmith.normalBlackSmith.BlackSmith;
import simpleadventuregame.locations.normallocs.storelocs.ToolStore;
import simpleadventuregame.utils.PlayerScanner;

public class Game {
	private String charListFormat = " Character : [%d] [%-9s] [Damage:  %-1d] [Health:  %-1d] [Money: %2d] \n";
	private Player player;
	private Location location;
	boolean returnToMainMenu;

	public void start() {

		System.out.println("Welcome to adventure game!");
		System.out.println("Please enter your name !");
		String playerName = PlayerScanner.stringScanner();
		player = new Player(playerName);
		System.out.println("Hi! " + player.getName() + " Welcome to the dangeruous island");
		System.out.println(" Please select an character for your path in this island !");
		selectChar();

		while (true) {
			player.printInfo();

			selectLoc();

			if (location == null) {

				break;
			}
			if (!location.onLocation()) {
				System.out.println("You died");
				break;
			}
		}

	}

	public void selectChar() {

		boolean isValidInput = false;

		while (!isValidInput) {
			GameChar[] charList = { new Samurai(), new Knight(), new Archer(), new SpearMan() };

			System.out.println("----------------------------------------------------");

			for (GameChar gameChar : charList) {

				System.out.printf(charListFormat, gameChar.getId(), gameChar.getName(), gameChar.getDamage(),
						gameChar.getHealth(), gameChar.getMoney());
			}
			System.out.println("---------------------------------------------------- \n Select : ");

			if (PlayerScanner.hasnextIntScanner()) {
				int selectChar = PlayerScanner.intScanner();

				switch (selectChar) {
				case 1:
					initPlayer(new Samurai());
					isValidInput = true;
					break;
				case 2:
					initPlayer(new Knight());
					isValidInput = true;
					break;
				case 3:
					initPlayer(new Archer());
					isValidInput = true;
					break;
				case 4:
					initPlayer(new SpearMan());
					isValidInput = true;
					break;
				default:
					System.out.println("Please enter correct number (between 1- 4)");

				}

			} else {
				System.out.println("Please enter correct number (between 1- 4)");

			}
		}
		System.out.println("Warrior " + player.getName() + " You chose " + player.getCharName()
				+ " character for your path and your power list");
		System.out.printf(charListFormat, player.getId(), player.getCharName(), player.getDamage(), player.getHealth(),
				player.getMoney());
	}

	public void initPlayer(GameChar gameChar) {
		player.setDamage(gameChar.getDamage());
		player.setHealth(gameChar.getHealth());
		player.setDefaultHealth(gameChar.getHealth());
		player.setMoney(gameChar.getMoney());
		player.setCharName(gameChar.getName());
		player.setId(gameChar.getId());

	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void selectLoc() {
		int selectLocation;
		returnToMainMenu = true;
		while (returnToMainMenu) {
			System.out.println("--------------Locations-----------------");
//			System.out.println(
//					" 0- Exit from game \n 1- Safe House \n 2- Store \n 3- BlackSmith \n 4- Cave \n 5- Temple \n 6- Forest \n 7- River \n 8- Forest Area");
			System.out.println(
					" 0- Exit from game \n 1- Safe House \n 2- Store \n 3- BlackSmith \n 4- Beginner Battle Area \n 5- Forest Area \n 6- GoblinLand Area");
//			System.out.println("---Cave  :            (ID=4) Enemy= Zombie   Award= Food  ---");
//			System.out.println("---Temple:            (ID=5) Enemy= Skeleton Award= Iron  ---");
//			System.out.println("---Normal Forest:     (ID=6) Enemy= Vampire  Award= Wood  ---");
//			System.out.println("---River :            (ID=7) Enemy= Bear     Award= Water ---");
			System.out.println("---Beginner Battle Area:   (ID=10) This area has 4 dangerous battleLocs ");
			System.out.println("---Forest Area:            (ID=10) This area has 4 dangerous battleLocs ");
			System.out.println("---Goblin Land Area:       (ID=10) This area has 2 dangerous battleLocs ");

			if (PlayerScanner.hasnextIntScanner()) {
				selectLocation = PlayerScanner.intScanner();

				if (selectLocation >= 0 && selectLocation <= 9) {
					switch (selectLocation) {
					case 0:
						System.out.println("Exiting the program.");
						return;
					case 1:
						location = new SafeHouse(player);
						break;
					case 2:
						location = new ToolStore(player);
						break;
					case 3:
						location = new BlackSmith(player);
						break;
//					case 4:
//						location = new Cave(player);
//						break;
//					case 5:
//						location = new Temple(player);
//						break;
//					case 6:
//						location = new NormalForest(player);
//						break;
//					case 7:
//						location = new River(player);
//						break;
//					case 8:
//						location = new ForestArea(player);
//						break;
//					case 9:
//						location = new GoblinLandArea(player);
//						break;
					case 4:
						location = new BeginnerBattleArea(player);
						break;
					case 5:
						location = new ForestArea(player);
						break;
					case 6:
						location = new GoblinLandArea(player);
						break;
						
					}
					break;
				} else {
					System.out.println("Please enter a valid number between 0 and 9.");
				}
			} else {
				System.out.println("Please enter a valid number.");
				PlayerScanner.stringScanner();
			}
		}

	}

}
