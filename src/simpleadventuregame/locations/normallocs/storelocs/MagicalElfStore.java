package simpleadventuregame.locations.normallocs.storelocs;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.items.armors.Armor;
import simpleadventuregame.items.elixir.Elixir;
import simpleadventuregame.items.elixir.HealthElixir;
import simpleadventuregame.items.elixir.MedicalElixir;
import simpleadventuregame.items.weapons.Weapon;
import simpleadventuregame.locations.normallocs.NormalLoc;
import simpleadventuregame.utils.PlayerScanner;

public class MagicalElfStore extends NormalLoc {
//	private HealthElixir healthElixir;
//	private MedicalElixir medicalElixir;
	
	private String equipmentWeaponFormat = " Equipment :  [%-7s] [%d] [Damage:  %-1d] [Money: %2d] \n";
	private String equipmentArmorFormat = " Equipment :  [%-7s] [%d] [DamageDodge:  %-1d] [Money: %2d] \n";

	public MagicalElfStore(Player player) {
		super(13, player, "Aurae's Magical Elf Store");

	}
	

	@Override
	public boolean onLocation() {

		System.out.println("-----Welcome to Aurae's Magical Elf Store !-----");
		this.getPlayer().printDetailedInfo();
		boolean showMenu = true;
		while (showMenu) {
			this.getPlayer().setMoney(500);
			System.out.println("1 - Elixirs");
			System.out.println("2 - Weapons");
			System.out.println("3 - Exit from Aurae's Magical Elf Store ");
			System.out.print("Select : ");
			int selectCase = PlayerScanner.intScanner();

			while (selectCase < 0 && selectCase > 3) {
				System.out.println(" you entered invalid number, please enter again ! ");
				selectCase = PlayerScanner.intScanner();
			}
			switch (selectCase) {
			case 1:
				selectElixirInElfStore1();
				break;
			case 2:

				break;
			case 3:
				System.out.println("You exit from Aurae's Magical Elf Store");
				showMenu = false;
				break;

			}
		}
		return true;
	}



	public void selectElixirInElfStore1() {

		System.out.println(
				"1 - (ID=11) (Price: 10 ) Health Elixir(5Health) gives 5 extra health to your base health while you are in battle(one time).");
		System.out.println("12 - (ID=2) (Price: 15 ) Medical Elixir :  full your health when your health is low.");
		System.out.println("13- (ID=3) (Price: 15 ) Block Elixir :  It blocks monster attack in battle(one time)");
		System.out.println("Please enter '0' to exit");

		System.out.println("Please enter the id of the elixir you have selected : ");
		int selectElixirId = PlayerScanner.intScanner();

		while (selectElixirId < 0 && selectElixirId > Elixir.elixirs().length) {
			System.out.println(" you entered invalid number, please enter again ! ");
			selectElixirId = PlayerScanner.intScanner();

		}
		if (selectElixirId != 0) {
			Elixir selectedElixir = Elixir.getElixirById(selectElixirId);

			if (selectedElixir != null) {
				if (selectedElixir.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("You don't have enough money");
				} else {
//					SATIN ALMA İŞLEMİ 
//					System.out.println(" You have purchased " + selectedElixir.getName());
					int balance = this.getPlayer().getMoney() - selectedElixir.getPrice();
					this.getPlayer().setMoney(balance);
//					this.purchaseElixirInElfStore(selectElixirId);
					this.getPlayer().getInventory().addBattleLocAwardItem(selectedElixir);
					System.out.println("You Purchased " + selectedElixir.getName() + ". Your current " + selectedElixir.getName() + " Count is: "
							+ this.getInventory().getawardItemsInInventoryById(selectedElixir.getId()));
					System.out.println("Your current money : " + this.getPlayer().getMoney());

				}

			}
		}

	}


	public void selectWeaponInMagicalElfStore() {

		printWeaponInMagicalElfStore();

		System.out.println("Please enter '0' to exit");

		System.out.println("Please enter the id of the weapon you have selected : ");
		int selectWeaponId = PlayerScanner.intScanner();

		while (selectWeaponId < 0 && selectWeaponId > Weapon.weaponsInMagicalElfStore().length) {
			System.out.println(" you entered invalid number, please enter again ! ");
			selectWeaponId = PlayerScanner.intScanner();

		}
		if (selectWeaponId != 0) {
			Weapon selectedWeapon = Weapon.getWeaponInMagicalStoreById(selectWeaponId);

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
	
	public void printWeaponInMagicalElfStore() {

		System.out.println("----- Magical Elf Store Weapons-----");

		Weapon[] weaponlist = Weapon.weaponsInMagicalElfStore();

		for (Weapon weapons : weaponlist) {

			System.out.printf(equipmentWeaponFormat, weapons.getName(), weapons.getId(), weapons.getDamage(),
					weapons.getPrice());
		}
	}
	public Inventory getInventory() {

		return this.getPlayer().getInventory();
	}
	
//	public void selectElixirInElfStore() {
//
//		boolean elixirtMenu = true;
//		while (elixirtMenu) {
//
//			System.out.println(
//					"1 - Health Elixir(5Health) gives 5 extra health to your base health while you are in battle(one time).");
//			System.out.println("2 - Meical Elixir :  full your health when your health is low.");
//			System.out.println("3 ");
//			System.out.println("4 - Exit");
//			System.out.print("Select : ");
//			int selectCase = PlayerScanner.intScanner();
//
//			while (selectCase < 0 && selectCase > 3) {
//				System.out.println(" you entered invalid number, please enter again ! ");
//				selectCase = PlayerScanner.intScanner();
//			}
//			switch (selectCase) {
//			case 1:
//				if (this.getPlayer().getMoney() >= this.healthElixir.getPrice()) {
//					this.getInventory().getElixirChest()
//							.setHealthElixirCount(this.getInventory().getElixirChest().getHealthElixirCount() + 1);
//					this.getPlayer().setMoney(this.getPlayer().getMoney() - this.healthElixir.getPrice());
//					System.out.println("You purchased Health Elixir and your Elixir count is: "
//							+ this.getInventory().getElixirChest().getHealthElixirCount());
//				} else {
//					System.out.println("You don't have enough money");
//					break;
//				}
//				break;
//			case 2:
//				if (this.getPlayer().getMoney() >= this.medicalElixir.getPrice()) {
//					this.getInventory().getElixirChest()
//							.setMedicalElixirCount(this.getInventory().getElixirChest().getMedicalElixirCount() + 1);
//					this.getPlayer().setMoney(this.getPlayer().getMoney() - this.medicalElixir.getPrice());
//					System.out.println("You purchased Medical Elixir and your medical Elixir count is: "
//							+ this.getInventory().getElixirChest().getMedicalElixirCount());
//				} else {
//					System.out.println("You don't have enough money");
//					break;
//				}
//				break;
//			case 3:
//
//				break;
//			case 4:
//				System.out.println("You leave from Elixir Menu");
//				elixirtMenu = false;
//				break;
//
//			}
//		}
//
//	}
//	public void purchaseElixirInElfStore(int elixirId) {
//
//		switch (elixirId) {
//		case 1:
//			this.getInventory().getElixirChest()
//					.setHealthElixirCount(this.getInventory().getElixirChest().getHealthElixirCount() + 1);
//			System.out.println("Your Elixir count is: " + this.getInventory().getElixirChest().getHealthElixirCount());
//			break;
//		case 2:
//			this.getInventory().getElixirChest()
//					.setMedicalElixirCount(this.getInventory().getElixirChest().getMedicalElixirCount() + 1);
//			System.out.println(
//					"Your medical Elixir count is: " + this.getInventory().getElixirChest().getMedicalElixirCount());
//			break;
//
//		default:
//			break;
//		}
//	}

}
