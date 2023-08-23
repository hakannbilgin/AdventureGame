package simpleadventuregame.game;

import simpleadventuregame.gamecharacters.Archer;
import simpleadventuregame.gamecharacters.GameChar;
import simpleadventuregame.gamecharacters.Knight;
import simpleadventuregame.gamecharacters.Samurai;
import simpleadventuregame.locations.Location;
import simpleadventuregame.locations.battlelocs.Cave;
import simpleadventuregame.locations.battlelocs.NormalForest;
import simpleadventuregame.locations.battlelocs.River;
import simpleadventuregame.locations.battlelocs.Temple;
import simpleadventuregame.locations.battlelocs.darkforests.DeadForest;
import simpleadventuregame.locations.battlelocs.darkforests.EnchantedForest;
import simpleadventuregame.locations.normallocs.ToolStore;
import simpleadventuregame.locations.normallocs.houselocs.SafeHouse;
import simpleadventuregame.locations.normallocs.houselocs.blacksmith.BlackSmith;
import simpleadventuregame.utils.PlayerScanner;

public class Game {
	private String charListFormat = " Character : [%d] [%-7s] [Damage:  %-1d] [Health:  %-1d] [Money: %2d] \n";
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

			selectLoc2();

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
			GameChar[] charList = { new Samurai(), new Knight(), new Archer() };

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
				default:
					System.out.println("Please enter correct number (between 1- 3)");

				}

			} else {
				System.out.println("Please enter correct number (between 1- 3)");

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

	public void selectLoc2() {
		int selectLocation;
		returnToMainMenu = true;
		while (returnToMainMenu) {
			System.out.println("--------------Locations-----------------");
			System.out.println(
					" 0- Exit from game \n 1- Safe House \n 2- Store \n 3- BlackSmith \n 4- Cave \n 5- Temple \n 6- Forest \n 7- River \n 8- Enchanted Forest");
			System.out.println("9- Dead Forest");
			System.out.println("---Cave  :           (ID=4) Enemy= Zombie   Award= Food  ---");
			System.out.println("---Temple:           (ID=5) Enemy= Skeleton Award= Iron  ---");
			System.out.println("---Normal Forest:    (ID=6) Enemy= Vampire  Award= Wood  ---");
			System.out.println("---River :           (ID=7) Enemy= Bear     Award= Water ---");
			System.out.println("---Enchanted Forest: (ID=8) Enemy= Elf      Award= Dark Stone (%40chance) ---");
			System.out.println("---Dead Forest       (ID=9) Enemy= Spirit   Award= Diamond & Food (%50chance)");

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
					case 4:
						location = new Cave(player);
						break;
					case 5:
						location = new Temple(player);
						break;
					case 6:
						location = new NormalForest(player);
						break;
					case 7:
						location = new River(player);
						break;
					case 8:
						location = new EnchantedForest(player);
						break;
					case 9:
						if (this.getPlayer().getInventory().getDarkStone() >= 1) {
							location = new DeadForest(player);
						} else {
							System.out.println("You can't enter the Dark Forest because you don't have Dark Stone");
							continue;
						}
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
	
//	public void selectLoc3() {
//		int selectLocation;
//		returnToMainMenu = true;
//		while (returnToMainMenu) {
//			System.out.println("--------------Locations-----------------");
//			System.out.println(
//					" 0- Exit from game \n 1- Safe House \n 2- Store \n 3- BlackSmith \n 4- Cave \n 5- Temple \n 6- Forest \n 7- River \n 8- Enchanted Forest");
//			System.out.println("9- Dead Forest");
//			System.out.println("---Cave  :           (ID=4) Enemy= Zombie   Award= Food  ---");
//			System.out.println("---Temple:           (ID=5) Enemy= Skeleton Award= Iron  ---");
//			System.out.println("---Normal Forest:    (ID=6) Enemy= Vampire  Award= Wood  ---");
//			System.out.println("---River :           (ID=7) Enemy= Bear     Award= Water ---");
//			System.out.println("---Enchanted Forest: (ID=8) Enemy= Elf      Award= Dark Stone (%40change) ---");
//			System.out.println("---Dead Forest       (ID=9) Enemy= Spirit   Award= Diamond");
//
//			if (PlayerScanner.hasnextIntScanner()) {
//				selectLocation = PlayerScanner.intScanner();
//
//				if (selectLocation >= 0 && selectLocation <= 9) {
//					switch (selectLocation) {
//					case 0:
//						System.out.println("Exiting the program.");
//						return;
//					case 1:
//						location = new SafeHouse(player);
//						break;
//					case 2:
//						location = new ToolStore(player);
//						break;
//					case 3:
//						location = new BlackSmith(player);
//						break;
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
//						location = new EnchantedForest(player);
//						break;
//					case 9:
////						if (this.getPlayer().getInventory().getDarkStone() >= 1) {
////							location = new DeadForest(player);
////						} else {
////							System.out.println("You can't enter the Dark Forest because you don't have Dark Stone");
////							continue;
////						}
////						break;
//						if (selectLocation == 9) {
//							selectForestLoc();
//						}else {
//							continue;
//						}
//						
//					}
//					break;
//				} else {
//					System.out.println("Please enter a valid number between 0 and 9.");
//				}
//			} else {
//				System.out.println("Please enter a valid number.");
//				PlayerScanner.stringScanner(); 
//			}
//		}
//
//	}
	
//	public void selectForestLoc() {
//		int selectforestLoc;
//		boolean menu = true;
//		while (menu) {
//			System.out.println("--------------Dangerous Forest Locations-----------------");
//			System.out.println(" 1- Enchanted Forest \n 2- Dead Forest \n 3- Exit from Forest Area");
//
//			System.out.println("---Enchanted Forest:  Enemy= Elf      Award= Dark Stone (%40change) ---");
//			System.out.println("---Dead Forest        Enemy= Spirit   Award= Diamond");
//		
//			if (PlayerScanner.hasnextIntScanner()) {
//				selectforestLoc = PlayerScanner.intScanner();
//
//				if (selectforestLoc >= 1 && selectforestLoc <= 3) {
//					switch (selectforestLoc) {
//					case 1:
//						
//						location = new EnchantedForest(player);
//						break;
//					case 2:
//						if (this.getPlayer().getInventory().getDarkStone() >= 1) {
//							location = new DeadForest(player);
//						} else {
//							System.out.println("You can't enter the Dark Forest because you don't have Dark Stone");
//							continue;
//						}
//						break;
//						
//					case 3:
//						if (selectforestLoc != 3) {
//							
//						}else {
//							menu = false;
//							System.out.println("You exit from Forest Area");
//							continue;
//						}
//						break;
//					}
//					break;
//				} else {
//					System.out.println("Please enter a valid number between 0 and 3.");
//				}
//			} else {
//				System.out.println("Please enter a valid number.");
//				PlayerScanner.stringScanner();
//			}
//		}
//
//	}

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

}
