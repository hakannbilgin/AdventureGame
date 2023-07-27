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
	private int waterCount= 0;
	private int foodCount=0;
	private int woodCount=0;
	


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

	public int getWaterCount() {
		return waterCount;
	}

	public void setWaterCount() {
		int newcount =waterCount++;
		
		this.waterCount=newcount;
	}

	public int getFoodCount() {
		return foodCount;
	}

	public void setFoodCount(int foodCount) {
		this.foodCount = foodCount;
	}

	public int getWoodCount() {
		return woodCount;
	}

	public void setWoodCount(int woodCount) {
		this.woodCount = woodCount;
	}

	
}
