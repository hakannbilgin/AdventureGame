package simpleadventuregame.items.weapons;

import simpleadventuregame.items.Item;
import simpleadventuregame.items.weapons.goblinlandStoreweapons.UglyOrcSword;
import simpleadventuregame.items.weapons.magicalelfstoreweapons.HiddenSword;
import simpleadventuregame.items.weapons.toolstoreweapons.DarkSword;
import simpleadventuregame.items.weapons.toolstoreweapons.IronPala;
import simpleadventuregame.items.weapons.toolstoreweapons.LongSword;
import simpleadventuregame.items.weapons.toolstoreweapons.ShortSword;

public abstract class Weapon extends Item{
//	private String name;
//	private int id;
	private int damage;
	private int price;

	public Weapon(String name, int id, int damage, int price, boolean upgradeable) {
//		this.setName(name);
//		this.setId(id);
		super(name, id,upgradeable);
		this.damage = damage;
		this.price = price;
	}

	public static Weapon[] weaponsInGeneralStore() {

		Weapon[] wList = { new ShortSword(), new LongSword(), new IronPala(), new DarkSword()};
		return wList;

	}

	public static Weapon getWeaponInGeneralStoreById(int id) {

		for (Weapon w : Weapon.weaponsInGeneralStore()) {
			if (w.getId() == id) {
				return w;
			}
		}

		return null;

	}
	
	public static Weapon[] weaponsInMagicalElfStore() {

		Weapon[] wList = { new HiddenSword()};
		return wList;

	}

	public static Weapon getWeaponInMagicalStoreById(int id) {

		for (Weapon w : Weapon.weaponsInGeneralStore()) {
			if (w.getId() == id) {
				return w;
			}
		}

		return null;

	}
	
	
	public static Weapon[] weaponsInGoblinStore() {

		Weapon[] wList = { new UglyOrcSword()};
		return wList;

	}

	public static Weapon getWeaponInGoblinStoreById(int id) {

		for (Weapon w : Weapon.weaponsInGoblinStore()) {
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
