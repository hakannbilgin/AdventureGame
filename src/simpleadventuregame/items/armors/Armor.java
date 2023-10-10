package simpleadventuregame.items.armors;

import simpleadventuregame.items.Item;
import simpleadventuregame.items.armors.magicalelfstorearmors.BlueSpiritArmor;
import simpleadventuregame.items.armors.toolstorearmors.LightArmor;
import simpleadventuregame.items.armors.toolstorearmors.MagicalArmor;
import simpleadventuregame.items.armors.toolstorearmors.NormalArmor;
import simpleadventuregame.items.armors.toolstorearmors.ShinyArmor;

public abstract class Armor extends Item{

//	private String name;
//	private int id;
	private int damageDodge;
	private int price;
	
	
	public Armor(String name, int id, int damageDodge, int price) {
		super();
		this.setName(name);
		this.setId(id);
		this.damageDodge = damageDodge;
		this.price = price;
	}
	
	
	public static Armor[] armorsInToolStore() {

		Armor[] aList = { new LightArmor(), new NormalArmor(), new ShinyArmor() , new MagicalArmor() };
		return aList;

	}
	
	public static Armor getArmorInToolStoreById(int id) {

		for (Armor a : Armor.armorsInToolStore()) {
			if (a.getId() == id) {
				return a;
			}
		}

		return null;

	}
	
	
	
	public static Armor[] armorsInMagicalElfStore() {

		Armor[] aList = { new BlueSpiritArmor() };
		return aList;

	}
	
	public static Armor getArmorInMagcalElfStoreById(int id) {

		for (Armor a : Armor.armorsInMagicalElfStore()) {
			if (a.getId() == id) {
				return a;
			}
		}

		return null;

	}
	
	public static Armor[] armorsInGoblinStore() {

		Armor[] aList = {  };
		return aList;

	}
	
	public static Armor getArmorInGoblinStoreById(int id) {

		for (Armor a : Armor.armorsInGoblinStore()) {
			if (a.getId() == id) {
				return a;
			}
		}

		return null;

	}
	
	
	
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public int getDamageDodge() {
		return damageDodge;
	}
	public void setDamageDodge(int damageDodge) {
		this.damageDodge = damageDodge;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
