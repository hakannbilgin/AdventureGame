package simpleadventuregame.game;

import simpleadventuregame.items.armors.Armor;
import simpleadventuregame.items.armors.WoodArmor;
import simpleadventuregame.items.weapons.Fist;
import simpleadventuregame.items.weapons.Weapon;

public class Inventory {

//	private int weaponDamage;
//	private String WeaponName;

	private Weapon weapon;
	private Armor armor;

	public Inventory() {
		this.weapon = new Fist();
		this.armor= new WoodArmor();
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

}
