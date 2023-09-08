package simpleadventuregame.game.gameitems;

import simpleadventuregame.game.experience.PlayerLevel;
import simpleadventuregame.items.weapons.Weapon;

public class Player {

	private String charListFormat = " Your current info : Your weapon: [%-7s] Your Armor : [%-7s] [Damage:  %-1d] [Health:  %-1d] [Money: %2d] [Satiety Level:  %-1d] [Thirst Level:  %-1d] \n";
	private String playerInventoryFormat = "Inventory info : [Water Count:  %-1d] [Food Count:  %-1d] [Wood Count:  %-1d] [Iron Count:  %-1d] [Dark Stone:  %-1d] [Diamond Count:  %-1d] [Emerand Count:  %-1d] \n";
	private String playerElixirChestFormat = "Elixir Chest Info : [Health Elixir Count:  %-1d] [Medical Elixir Count Count:  %-1d] \n";
	private String playerBoxChestFormat = "Box Chest Info : [Elf King Box Count:  %-1d] \n";

	private int satiety = 20;
	private int thirstLevel = 0;
	private int id;
	private int damage;
	private int health;
	private int defaultHealth;
	private int money;
	private String name;
	private String charName;
	private Inventory inventory;
	private PlayerLevel playerLevel;

	public Player(String name) {
		this.name = name;
		this.inventory = new Inventory();
		this.playerLevel = new PlayerLevel();

	}

	public Player() {

	}

	public void printInfo() {

		System.out.printf(charListFormat, this.getInventory().getWeapon().getName(),
				this.getInventory().getArmor().getName(), getTotalDamage(), getHealth(), getMoney(), getSatiety(),
				getThirstLevel());
	}

	public void printDetailedInfo() {
		System.out.println("------------------------------------- \n");
		System.out.printf(charListFormat, this.getInventory().getWeapon().getName(),
				this.getInventory().getArmor().getName(), getTotalDamage(), getHealth(), getMoney(), getSatiety(),
				getThirstLevel());
		printInventoryInfo();
		System.out.println("------------------------------------- \n");

	}

	public void printInventoryInfo() {

		System.out.printf(playerInventoryFormat, this.getInventory().getWaterCount(),
				this.getInventory().getFoodCount(), this.getInventory().getWoodCount(),
				this.getInventory().getIronCount(), this.getInventory().getDarkStone(),
				this.getInventory().getDiamondCount(), this.getInventory().getEmeraldCount());

		this.printElixirChestInfo();
		this.printBoxChestInfo();

	}

	public void printBoxChestInfo() {

		System.out.printf(playerBoxChestFormat, this.getInventory().getBoxChest().getElfKingBoxCount());
	}

	public void printElixirChestInfo() {

		System.out.printf(playerElixirChestFormat, this.getInventory().getElixirChest().getHealthElixirCount(),
				this.getInventory().getElixirChest().getMedicalElixirCount());
	}

	public int getTotalDamage() {

		return damage + this.getInventory().getWeapon().getDamage();
	}

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
		if (health < 0) {
			health = 0;

		}
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

	public Inventory getInventory() {
		return inventory;
	}

//	public void setInventory(Inventory inventory) {
//		this.inventory = inventory;
//	}

	public Weapon getWeapon() {

		return this.getInventory().getWeapon();

	}

	public int getDefaultHealth() {
		return defaultHealth;
	}

	public void setDefaultHealth(int defaultHealth) {
		this.defaultHealth = defaultHealth;
	}

	public int getSatiety() {
		return satiety;
	}

	public void setSatiety(int satiety) {
		if (satiety > 20) {
			this.satiety = 20;
		} else {
			this.satiety = satiety;
		}
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public void setThirstLevel(int thirstLevel) {
		if (thirstLevel <= 0) {
			this.thirstLevel = 0;
		}
		this.thirstLevel = thirstLevel;
	}

	public PlayerLevel getPlayerLevel() {
		return playerLevel;
	}

//	public void setPlayerLevel(PlayerLevel playerLevel) {
//		this.playerLevel = playerLevel;
//	}

	public void healthByLevel() {

	}

}
