package simpleadventuregame.game;

import simpleadventuregame.gamecharacters.Archer;
import simpleadventuregame.gamecharacters.GameChar;
import simpleadventuregame.gamecharacters.Knight;
import simpleadventuregame.gamecharacters.Samurai;
import simpleadventuregame.utils.PlayerScanner;

public class Player {
//	private String charListFormat = " Character : [%d] [%-7s] [Damage:  %-1d] [Health:  %-1d] [Money: %2d] \n";
	private int id;
	private int damage;
	private int health;
	private int money;
	private String name;
	private String charName;

	public Player(String name) {
		this.name = name;

	}

	public Player() {

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
//
//		switch (selectChar) {
//		case 1:
//			initPlayer(new Samurai());
//			break;
//		case 2:
//			initPlayer(new Knight());
//		case 3:
//			initPlayer(new Archer());
//			break;
//		}
//
//		System.out.println("You chose " + getCharName() + " character for your path and your power list");
//		System.out.printf(charListFormat, getId(), getCharName(), getDamage(), getHealth(), getMoney());
//	}
//
//	public void initPlayer(GameChar gameChar) {
//		this.setDamage(gameChar.getDamage());
//		this.setHealth(gameChar.getHealth());
//		this.setMoney(gameChar.getMoney());
//		this.setCharName(gameChar.getName());
//		this.setId(gameChar.getId());
//
//	}
//
//	
//	public void selectLoc() {
//		
//		
//		
//	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
