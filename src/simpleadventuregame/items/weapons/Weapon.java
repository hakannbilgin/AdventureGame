package simpleadventuregame.items.weapons;

import simpleadventuregame.items.Item;

public abstract class Weapon extends Item{
//	private String name;
//	private int id;
	private int damage;
	private int price;

	public Weapon(String name, int id, int damage, int price) {
		this.setName(name);
		this.setId(id);
		this.damage = damage;
		this.price = price;
	}

	public static Weapon[] weapons() {

		Weapon[] wList = { new ShortSword(), new LongSword(), new IronPala(), new DarkSword()};
		return wList;

	}

	public static Weapon getWeaponById(int id) {

		for (Weapon w : Weapon.weapons()) {
			if (w.getId() == id) {
				return w;
			}
		}

		return null;

	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

}
