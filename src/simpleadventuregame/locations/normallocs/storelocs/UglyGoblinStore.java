package simpleadventuregame.locations.normallocs.storelocs;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.armors.Armor;
import simpleadventuregame.items.weapons.Weapon;
import simpleadventuregame.utils.PlayerScanner;

public class UglyGoblinStore extends StoreLoc{
//	private String equipmentWeaponFormat = " Equipment :  [%-7s] [%d] [Damage:  %-1d] [Money: %2d] \n";
//	private String equipmentArmorFormat = " Equipment :  [%-7s] [%d] [DamageDodge:  %-1d] [Money: %2d] \n";

	public UglyGoblinStore(Player player) {
		super(20, player, "Ugly Goblin Store");
		
	}

	@Override
	public boolean onLocation() {
		System.out.println("-----Welcome to Ugly Goblin Store !-----");
		this.getPlayer().printDetailedInfo();
		boolean showMenu = true;
		while (showMenu) {
//			this.getPlayer().setMoney(500);
			System.out.println("1 -  ");
			System.out.println("2 - Weapons ");
			System.out.println("3 - Armors ");
			System.out.println("4 - Exit from Ugly Goblin Store ");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("You exit from Aurae's Magical Elf Store");
				showMenu = false;
				break;

			}
		}
		return true;
	}
	
	public void selectWeaponInGoblinStore() {

		this.printWeaponInStore(this.getId());

		System.out.println("Please enter '0' to exit");

		System.out.println("Please enter the id of the weapon you have selected : ");
		int selectWeaponId = PlayerScanner.intScanner();

		while (selectWeaponId < 0 && selectWeaponId > Weapon.weaponsInGoblinStore().length) {
			System.out.println(" you entered invalid number, please enter again ! ");
			selectWeaponId = PlayerScanner.intScanner();

		}
		if (selectWeaponId != 0) {
			Weapon selectedWeapon = Weapon.getWeaponInGoblinStoreById(selectWeaponId);

			if (selectedWeapon != null) {
				if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("You don't have enough money");
				} else {
//					SATIN ALMA İŞLEMİ 
					System.out.println(" You have purchased " + selectedWeapon.getName());
					int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Your current money : " + this.getPlayer().getMoney());
					this.getPlayer().getInventory().setWeapon(selectedWeapon);
					System.out.println("Your weapon is" + getPlayer().getInventory().getWeapon().getName());

				}

			}
		}

	}
	

	public void selectArmorInGoblinStore() {

		this.printArmorInStore(this.getId());

		System.out.println("Please enter '0' to exit");

		System.out.println("Please enter the id of the armor you have selected : ");
		int selectedArmorId = PlayerScanner.intScanner();

		while (selectedArmorId < 1 && selectedArmorId > Armor.armorsInStore(this.getId()).length) {
			System.out.println(" you entered invalid number, please enter again ! ");
			selectedArmorId = PlayerScanner.intScanner();

		}
		if (selectedArmorId != 0) {
			Armor selectedArmor = Armor.getArmorInStoreById(selectedArmorId,this.getId());

			if (selectedArmor != null) {
				if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("You don't have enough money");
				} else {
//					SATIN ALMA İŞLEMİ 
					System.out.println(" You have purchased " + selectedArmor.getName());
					int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Your current money : " + this.getPlayer().getMoney());
					this.getPlayer().getInventory().setArmor(selectedArmor);
					System.out.println("Your armor is" + getPlayer().getInventory().getArmor().getName());

				}

			}
		}

	}
	
	public Inventory getInventory() {

		return this.getPlayer().getInventory();
	}
	
//	public void printWeaponInGoblinStore() {
//
//		System.out.println("----- Ugly Goblin Store Weapons-----");
//
//		Weapon[] weaponlist = Weapon.weaponsInGoblinStore();
//
//		for (Weapon weapons : weaponlist) {
//
//			System.out.printf(getEquipmentWeaponFormat(), weapons.getName(), weapons.getId(), weapons.getDamage(),
//					weapons.getPrice());
//		}
//	}
	
	
//	public void printArmorInGoblinStore() {
//
//		System.out.println("----- Ugly Goblin Store Armors-----");
//
//		Armor[] armorList = Armor.armorsInGoblinStore();
//
//		for (Armor armors : armorList) {
//
//			System.out.printf(getEquipmentArmorFormat(), armors.getName(), armors.getId(), armors.getDefense(),
//					armors.getPrice());
//
//		}
//	}
//	
	

	

}
