package simpleadventuregame.game;

import java.util.Iterator;

import simpleadventuregame.gamecharacters.Archer;
import simpleadventuregame.gamecharacters.GameChar;
import simpleadventuregame.gamecharacters.Knight;
import simpleadventuregame.gamecharacters.Samurai;
import simpleadventuregame.locations.Location;
import simpleadventuregame.locations.battlelocs.Cave;
import simpleadventuregame.locations.battlelocs.Forest;
import simpleadventuregame.locations.battlelocs.River;
import simpleadventuregame.locations.battlelocs.Temple;
import simpleadventuregame.locations.normallocs.ToolStore;
import simpleadventuregame.locations.normallocs.houselocs.SafeHouse;
import simpleadventuregame.locations.normallocs.houselocs.blacksmith.BlackSmith;
import simpleadventuregame.utils.PlayerScanner;

public class Game {
	private String charListFormat = " Character : [%d] [%-7s] [Damage:  %-1d] [Health:  %-1d] [Money: %2d] \n";
	private Player player;
	private Location location;

	public void start() {

		System.out.println("Welcome to adventure game!");
		System.out.println("Please enter your name !");
		String playerName = PlayerScanner.stringScanner();
		player = new Player(playerName);
		System.out.println("Hi! " + player.getName() + " Welcome to the dangeruous island");
		System.out.println(" Please select an character for your path in this island !");
		selectChar2();

		while (true) {
			player.printInfo();
//			selectLoc();
			selectLoc2();

			if (location == null) {
				System.out.println("The game is over, see you again :) ");
				break;
			}
			if (!location.onLocation()) {
				System.out.println("You died");
				break;
			}
		}

	}

//	public void selectChar() {
//		GameChar[] charList = { new Samurai(), new Knight(), new Archer() };
//
//		System.out.println("----------------------------------------------------");
//
//		for (GameChar gameChar : charList) {
//
//			System.out.printf(charListFormat, gameChar.getId(), gameChar.getName(), gameChar.getDamage(),
//					gameChar.getHealth(), gameChar.getMoney());
//		}
//		System.out.println("---------------------------------------------------- \n Select : ");
//		int selectChar = PlayerScanner.intScanner();

//		while (selectChar>0 && selectChar >4) {
//			switch (selectChar) {
//			case 1:
//				initPlayer(new Samurai());
//				break;
//			case 2:
//				initPlayer(new Knight());
//				break;
//			case 3:
//				initPlayer(new Archer());
//				break;
//			}
//		}
//		switch (selectChar) {
//		case 1:
//			initPlayer(new Samurai());
//			break;
//		case 2:
//			initPlayer(new Knight());
//			break;
//		case 3:
//			initPlayer(new Archer());
//			break;
//		}
//
//		System.out.println("Warrior " + player.getName() + " You chose " + player.getCharName()
//				+ " character for your path and your power list");
//		System.out.printf(charListFormat, player.getId(), player.getCharName(), player.getDamage(), player.getHealth(),
//				player.getMoney());
//	}

	public void selectChar2() {

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
//				PlayerScanner.scannerClose();
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

//	public void selectLoc() {
//
//		System.out.println("--------------Locations-----------------");
//		System.out.println(
//				" 0- Exit from game \n 1- Safe House \n 2- Store \n 3- BlackSmith \n 4- Cave \n 5- Temple \n 6- Forest \n 7- River ");
//		System.out.println("---Cave  : Enemy= Zombie   Award= Food  ---");
//		System.out.println("---Temple: Enemy= Skeleton Award= Iron  ---");
//		System.out.println("---Forest: Enemy= Vampire  Award= Wood  ---");
//		System.out.println("---River : Enemy= Bear     Award= Water ---");
//
//		System.out.println("Please select your location!");
//
//		int selectLocation = PlayerScanner.intScanner();
//
//		switch (selectLocation) {
//		case 0:
//			location = null;
//			break;
//		case 1:
//			location = new SafeHouse(player);
//			break;
//		case 2:
//			location = new ToolStore(player);
//			break;
//		case 3:
//			location = new BlackSmith(player);
//			break;
//		case 4:
//			location = new Cave(player);
//			break;
//		case 5:
//			location = new Temple(player);
//			break;
//		case 6:
//			location = new Forest(player);
//			break;
//		case 7:
//			location = new River(player);
//			break;
//
//		default:
//
//			System.out.println("Please enter a valid number");
//		}
//
////		location.onLocation();
//
//	}

	public void selectLoc2() {
		int selectLocation;
		while (true) {
			System.out.println("--------------Locations-----------------");
			System.out.println(
					" 0- Exit from game \n 1- Safe House \n 2- Store \n 3- BlackSmith \n 4- Cave \n 5- Temple \n 6- Forest \n 7- River ");
			System.out.println("---Cave  : Enemy= Zombie   Award= Food  ---");
			System.out.println("---Temple: Enemy= Skeleton Award= Iron  ---");
			System.out.println("---Forest: Enemy= Vampire  Award= Wood  ---");
			System.out.println("---River : Enemy= Bear     Award= Water ---");

			if (PlayerScanner.hasnextIntScanner()) {
				selectLocation = PlayerScanner.intScanner();

				if (selectLocation >= 0 && selectLocation <= 7) {
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
						location = new Forest(player);
						break;
					case 7:
						location = new River(player);
						break;
					}
					break;
				} else {
					System.out.println("Please enter a valid number between 0 and 7.");
				}
			} else {
				System.out.println("Please enter a valid number.");
				PlayerScanner.stringScanner(); // Geçersiz girişi temizle
			}
		}
//		PlayerScanner.scannerClose();
	}

}
