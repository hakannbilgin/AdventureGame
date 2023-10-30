package simpleadventuregame.items.armors;

import simpleadventuregame.items.Item;
import simpleadventuregame.items.armors.goblinstorearmors.SteelHeartArmor;
import simpleadventuregame.items.armors.magicalelfstorearmors.BlueSpiritArmor;
import simpleadventuregame.items.armors.toolstorearmors.LightArmor;
import simpleadventuregame.items.armors.toolstorearmors.MagicalArmor;
import simpleadventuregame.items.armors.toolstorearmors.NormalArmor;
import simpleadventuregame.items.armors.toolstorearmors.ShinyArmor;

public abstract class Armor extends Item {

//	private String name;
//	private int id;
	private int defense;
	private int price;
	

	public Armor(String name, int id, int defense, int price, boolean upgradeable) {
		super(name, id, upgradeable);
//		this.setName(name);
//		this.setId(id);
		this.defense = defense;
		this.price = price;
		
	}
	
	
	public static Armor[] armorsInStore(int storeId){
		
		
		if (storeId==2) {
			Armor[] armorsInStore ={ new LightArmor(), new NormalArmor(), new ShinyArmor(), new MagicalArmor() };
			return armorsInStore; 
		}else if (storeId==13) {
			Armor[] armorsInStore ={ new BlueSpiritArmor() };
			return armorsInStore; 
			
		}else if (storeId==20) {
			Armor[] armorsInStore = { new SteelHeartArmor() };
			return armorsInStore; 
			
		}else {
			return null;
		}	
		
	}
	
	public static Armor getArmorInStoreById(int armorId,int storeId) {

		for (Armor a : Armor.armorsInStore(storeId)) {
			if (a.getId() == armorId) {
				return a;
			}
		}

		return null;

	}

	
	

//	public static Armor[] armorsInGeneralStore() {
//
//		Armor[] aList = { new LightArmor(), new NormalArmor(), new ShinyArmor(), new MagicalArmor() };
//		return aList;
//
//	}
//
//	public static Armor getArmorInGeneralStoreById(int id) {
//
//		for (Armor a : Armor.armorsInGeneralStore()) {
//			if (a.getId() == id) {
//				return a;
//			}
//		}
//
//		return null;
//
//	}
//
//	public static Armor[] armorsInMagicalElfStore() {
//
//		Armor[] aList = { new BlueSpiritArmor() };
//		return aList;
//
//	}
//
//	public static Armor getArmorInMagcalElfStoreById(int id) {
//
//		for (Armor a : Armor.armorsInMagicalElfStore()) {
//			if (a.getId() == id) {
//				return a;
//			}
//		}
//
//		return null;
//
//	}
//
//	public static Armor[] armorsInGoblinStore() {
//
//		Armor[] aList = { new SteelHeartArmor() };
//		return aList;
//
//	}
//
//	public static Armor getArmorInGoblinStoreById(int id) {
//
//		for (Armor a : Armor.armorsInGoblinStore()) {
//			if (a.getId() == id) {
//				return a;
//			}
//		}
//
//		return null;
//
//	}

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

	public int getPrice() {
		return price;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
