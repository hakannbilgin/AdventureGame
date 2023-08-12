package simpleadventuregame.locations.normallocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.gamecharacters.GameChar;
import simpleadventuregame.items.armors.Armor;
import simpleadventuregame.items.weapons.Pistol;
import simpleadventuregame.items.weapons.Rifle;
import simpleadventuregame.items.weapons.Sword;
import simpleadventuregame.items.weapons.Weapon;
import simpleadventuregame.utils.PlayerScanner;

public class ToolStore extends NormalLoc {

	private Weapon weapon = null;

	private String equipmentFormat = " Equipment :  [%-7s] [%d] [DamageDodge:  %-1d] [Money: %2d] \n";

	public ToolStore(Player player) {
		super(player, "Store");

	}

	@Override
	public boolean onLocation() {
		System.out.println("-----Welcome to the store !-----");
		boolean showMenu = true;
		while (showMenu) {

			System.out.println("1 - Weapons");
			System.out.println("2 - Armors");
			System.out.println("3 - Exit");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				selectWeaponInToolStore();

				break;
			case 2:
				selectArmorInToolStore();
				break;
			case 3:
				System.out.println("You exit from Store");
				showMenu = false;
				break;

			}
		}
		return true;
	}

	public void selectWeaponInToolStore() {

		System.out.println("-----Weapons-----");

		Weapon[] weaponlist = Weapon.weapons();

		for (Weapon weapons : weaponlist) {

			System.out.printf(equipmentFormat, weapons.getName(), weapons.getId(), weapons.getDamage(),
					weapons.getPrice());
		}
		System.out.println("Please enter '0' to exit");

		System.out.println("Please enter the id of the weapon you have selected : ");
		int selectWeaponId = PlayerScanner.intScanner();

		while (selectWeaponId < 0 && selectWeaponId > weaponlist.length) {
			System.out.println(" you entered invalid number, please enter again ! ");
			selectWeaponId = PlayerScanner.intScanner();

		}
		if (selectWeaponId != 0) {
			Weapon selectedWeapon = Weapon.getWeaponById(selectWeaponId);

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

	public void selectArmorInToolStore() {

		System.out.println("-----Armor-----");

		Armor[] armorList = Armor.armors();

		for (Armor armors : armorList) {

			System.out.printf(equipmentFormat, armors.getName(), armors.getId(), armors.getDamageDodge(),
					armors.getPrice());

		}
		System.out.println("Please enter '0' to exit");

		System.out.println("Please enter the id of the armor you have selected : ");
		int selectedArmorId = PlayerScanner.intScanner();

		while (selectedArmorId < 1 && selectedArmorId > armorList.length) {
			System.out.println(" you entered invalid number, please enter again ! ");
			selectedArmorId = PlayerScanner.intScanner();

		}
		if (selectedArmorId != 0) {
			Armor selectedArmor = Armor.getArmorById(selectedArmorId);

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
					System.out.println("Your armor is" + getPlayer().getInventory().getWeapon().getName());

				}

			}
		}

	}

}
