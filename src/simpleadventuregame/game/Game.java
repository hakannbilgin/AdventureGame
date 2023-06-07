package simpleadventuregame.game;

import simpleadventuregame.gamecharacters.Archer;
import simpleadventuregame.gamecharacters.GameChar;
import simpleadventuregame.gamecharacters.Knight;
import simpleadventuregame.gamecharacters.Samurai;
import simpleadventuregame.locations.Location;
import simpleadventuregame.locations.normallocs.SafeHouse;
import simpleadventuregame.locations.normallocs.ToolStore;
import simpleadventuregame.utils.PlayerScanner;

public class Game {
	private String charListFormat = " Character : [%d] [%-7s] [Damage:  %-1d] [Health:  %-1d] [Money: %2d] \n";
	private String locationFormat = "Location : [%d] - %s ";
	private Player player;
	private Location location;

	public void start() {

		System.out.println("Welcome to adventure game!");
		System.out.println("Please enter your name !");
		String playerName = PlayerScanner.stringScanner();
		player = new Player(playerName);
		System.out.println("Hi! " + player.getName() + " Welcome to the dangeruous island");
		System.out.println(" Please select an character for your path in this island !");
		selectChar();

		while (true) {
			selectLoc();
			if (!location.onLocation()) {
				System.out.println("You died");
				break;
			}
		}

	}

	public void selectChar() {
		GameChar[] charList = { new Samurai(), new Knight(), new Archer() };

		System.out.println("----------------------------------------------------");

		for (GameChar gameChar : charList) {

			System.out.printf(charListFormat, gameChar.getId(), gameChar.getName(), gameChar.getDamage(),
					gameChar.getHealth(), gameChar.getMoney());
		}
		System.out.println("---------------------------------------------------- \n Select : ");
		int selectChar = PlayerScanner.intScanner();

		switch (selectChar) {
		case 1:
			initPlayer(new Samurai());
			break;
		case 2:
			initPlayer(new Knight());
		case 3:
			initPlayer(new Archer());
			break;
		}

		System.out.println("Warrior " + player.getName() + " You chose " + player.getCharName()
				+ " character for your path and your power list");
		System.out.printf(charListFormat, player.getId(), player.getCharName(), player.getDamage(), player.getHealth(),
				player.getMoney());
	}

	public void initPlayer(GameChar gameChar) {
		player.setDamage(gameChar.getDamage());
		player.setHealth(gameChar.getHealth());
		player.setMoney(gameChar.getMoney());
		player.setCharName(gameChar.getName());
		player.setId(gameChar.getId());

	}

	public void selectLoc() {

		System.out.println("--------------Locations-----------------");
		System.out.println(" 1- Safe House \n 2- Store");
		System.out.println("Please select your location!");
		int selectLocation = PlayerScanner.intScanner();

		switch (selectLocation) {
		case 1:
			location = new SafeHouse(player);
			break;
		case 2:
			location = new ToolStore(player);
			break;
		default:

			location = new SafeHouse(player);
		}

//		location.onLocation();

	}

}
