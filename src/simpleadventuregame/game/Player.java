package simpleadventuregame.game;

public class Player {

	private String charListFormat = " Character :  [%-7s] [Damage:  %-1d] [Health:  %-1d] [Money: %2d] \n";
	private int id;
	private int damage;
	private int health;
	private int money;
	private String name;
	private String charName;
	private Inventory inventory;

	public Player(String name) {
		this.name = name;
		this.inventory= new Inventory();

	}

	public Player() {

	}
	
	public void printInfo() {
		
		System.out.printf(charListFormat,getInventory().getWeapon().getName(),getDamage(), getHealth(),
				getMoney());
		
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

	
}
