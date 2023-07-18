package simpleadventuregame.locations.normallocs;

import simpleadventuregame.game.Player;
import simpleadventuregame.gamecharacters.GameChar;
import simpleadventuregame.items.weapons.Pistol;
import simpleadventuregame.items.weapons.Rifle;
import simpleadventuregame.items.weapons.Sword;
import simpleadventuregame.items.weapons.Weapon;
import simpleadventuregame.utils.PlayerScanner;

public class ToolStore extends NormalLoc {

	private Weapon weapon = null;

	private String equipmentFormat = " Character :  [%-7s] [%d] [Damage:  %-1d] [Money: %2d] \n";

	public ToolStore(Player player) {
		super(player, "Store");

	}

	@Override
	public boolean onLocation() {
		System.out.println("-----Welcome to the store !-----");
		System.out.println("1 - Weapons");
		System.out.println("2 - Armors");
		System.out.println("3 - Exit");
		System.out.print("Seçim : ");
		int selectCase = PlayerScanner.intScanner();

		while (selectCase < 1 && selectCase > 3) {
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
			;
			return true;
		}

		return true;
	}

	public void printWeapons() {

		System.out.println("-----Weapons-----");

		Weapon[] weaponlist = weapon.weapons();

		for (Weapon weapons : weaponlist) {

			System.out.printf(equipmentFormat, weapons.getName(), weapons.getId(), weapons.getDamage(),
					weapons.getPrice());
		}

	}

	public void selectWeaponInToolStore() {

		System.out.println("-----Weapons-----");

		Weapon[] weaponlist = Weapon.weapons();

		for (Weapon weapons : weaponlist) {

			System.out.printf(equipmentFormat, weapons.getName(), weapons.getId(), weapons.getDamage(),
					weapons.getPrice());
		}

		System.out.println("Please enter the id of the weapon you have selected : ");
		int selectWeaponId = PlayerScanner.intScanner();

		while (selectWeaponId < 1 && selectWeaponId > weaponlist.length) {
			System.out.println(" you entered invalid number, please enter again ! ");
			selectWeaponId = PlayerScanner.intScanner();

		}

		Weapon selectedWeapon = Weapon.getWeaponById(selectWeaponId);

		if (selectedWeapon != null) {
			if (selectedWeapon.getPrice() > getPlayer().getMoney()) {
				System.out.println("You don't have enough money");
			} else {
				System.out.println(" You have purchased " + selectedWeapon.getName());
			}

			
		}

	}

	public void selectArmorInToolStore() {

		System.out.println("-----Weapons-----");

		Weapon[] weaponlist = Weapon.weapons();

		for (Weapon weapons : weaponlist) {

			System.out.printf(equipmentFormat, weapons.getName(), weapons.getId(), weapons.getDamage(),
					weapons.getPrice());
		}
		
	}

}
