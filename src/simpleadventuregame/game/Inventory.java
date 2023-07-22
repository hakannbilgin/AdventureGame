package simpleadventuregame.game;

import simpleadventuregame.items.weapons.Fist;
import simpleadventuregame.items.weapons.Weapon;

public class Inventory {

//	private int weaponDamage;
//	private String WeaponName;

	private Weapon weapon;

	public Inventory() {
		this.weapon = new Fist();
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
