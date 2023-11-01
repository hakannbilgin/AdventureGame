package simpleadventuregame.locations.normallocs.storelocs;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.armors.Armor;
import simpleadventuregame.items.weapons.Weapon;
import simpleadventuregame.locations.Location;

public abstract class StoreLoc extends Location {

	private String equipmentWeaponFormat = " Equipment :  [%-7s] [%d] [Damage:  %-1d] [Money: %2d] \n";
	private String equipmentArmorFormat = " Equipment :  [%-7s] [%d] [DamageDodge:  %-1d] [Money: %2d] \n";
	private Weapon[] weaponList;
	private Armor[] armorList;

	public StoreLoc(int id, Player player, String locationName) {
		super(id, player, locationName);

	}

	public String getEquipmentWeaponFormat() {
		return equipmentWeaponFormat;
	}

	public void setEquipmentWeaponFormat(String equipmentWeaponFormat) {
		this.equipmentWeaponFormat = equipmentWeaponFormat;
	}

	public String getEquipmentArmorFormat() {
		return equipmentArmorFormat;
	}

	public void setEquipmentArmorFormat(String equipmentArmorFormat) {
		this.equipmentArmorFormat = equipmentArmorFormat;
	}

	public void printWeaponInStore(int storeId) {
		System.out.println("----" + this.getName() + " Weapons----");

		switch (storeId) {
		case 2:
			weaponList = Weapon.weaponsInGeneralStore();
			break;
		case 13:
			weaponList = Weapon.weaponsInMagicalElfStore();
			break;

		case 20:
			weaponList = Weapon.weaponsInGoblinStore();
			break;
		}

		for (Weapon weapons : weaponList) {

			System.out.printf(getEquipmentWeaponFormat(), weapons.getName(), weapons.getId(), weapons.getDamage(),
					weapons.getPrice());
		}

	}

//	public void printArmorInStore(int storeId) {
//		System.out.println("----" + this.getName() + " Weapons----");
//
//		switch (storeId) {
//		case 2:
//			armorList = Armor.armorsInGeneralStore();
//			break;
//		case 13:
//			armorList = Armor.armorsInMagicalElfStore();
//			break;
//
//		case 20:
//			armorList = Armor.armorsInGoblinStore();
//			break;
//		}
//
//		for (Armor armors : armorList) {
//
//			System.out.printf(getEquipmentArmorFormat(), armors.getName(), armors.getId(), armors.getDefense(),
//					armors.getPrice());
//
//		}
//
//	}
	
	
	public void printArmorInStore(int storeId) {
		System.out.println("----" + this.getName() + " Weapons----");

		armorList=Armor.armorsInStore(storeId);

		for (Armor armors : armorList) {

			System.out.printf(getEquipmentArmorFormat(), armors.getName(), armors.getId(), armors.getDefense(),
					armors.getPrice());

		}

	}

	public Inventory getInventory() {

		return this.getPlayer().getInventory();
	}
}
