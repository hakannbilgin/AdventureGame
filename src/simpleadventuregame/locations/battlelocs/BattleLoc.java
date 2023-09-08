package simpleadventuregame.locations.battlelocs;

import java.util.Random;

import simpleadventuregame.game.gameitems.Inventory;
import simpleadventuregame.game.gameitems.Player;
import simpleadventuregame.locations.Location;
import simpleadventuregame.locations.battlelocs.darkforests.ForestArea;
import simpleadventuregame.locations.normallocs.ToolStore;
import simpleadventuregame.locations.normallocs.houselocs.SafeHouse;
import simpleadventuregame.locations.normallocs.houselocs.blacksmith.BlackSmith;
import simpleadventuregame.monsters.Monster;
import simpleadventuregame.utils.PlayerScanner;

public abstract class BattleLoc extends Location {

	private String infoPlayerFormat = " Your current info : Your weapon: [%-7s] Your Armor : [%-7s] [Dodge:  %-1d] [Damage:  %-1d] [Health:  %-1d] [Money: %2d] \n";
	private String infoMonsterFormat = " Monster info : [Damage:  %-1d] [Health:  %-1d] [Award: %2d] \n";
	private Monster monster;
//	private Award award;
	private int maxMonsterCount;

	public BattleLoc(int id, Player player, String locationName, Monster monster, int maxMonsterCount) {
		super(id, player, locationName);
		this.monster = monster;
//		this.award = award;
		this.maxMonsterCount = maxMonsterCount;
	}

	@Override
	public boolean onLocation() {
		int monsterNumber = RandomMonsterCount();
		System.out.println("Now you are in " + this.getName());
		System.out
				.println("Bheave yourself there are " + monsterNumber + " " + this.getMonster().getName() + "'s here.");
		System.out.println("<F>ight or <R>un ");
		char selectCase = PlayerScanner.StringToFirstcharScanner();

		if ((selectCase == 'F' || selectCase == 'f') && combat(monsterNumber)) {
			System.out.println("You killed all monsters in " + this.getName());
			return true;
		}

		if (this.getPlayer().getHealth() <= 0 || this.getPlayer().getSatiety() == 0
				|| this.getPlayer().getThirstLevel() == 20) {
			System.out.println("You died");
			return false;

		}

		return true;

	}

	public boolean combat(int monsterNumber) {

		for (int i = 1; i <= monsterNumber; i++) {
			if (this.getInventory().getElixirChest().getTotalElixirCount() > 0) {
				this.useElixirInCombat();
			}
			this.getMonster().setHealth(this.getMonster().getDefaulHealth());
			playerStats();
			monsterStats(i);

			while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
				System.out.println("Hit or Run");
				char selectCombat = PlayerScanner.StringToFirstcharScanner();
				if (selectCombat == 'H' || selectCombat == 'h') {
					System.out.println("You hit " + getMonster().getName());
					this.getMonster().setHealth(this.monster.getHealth() - this.getPlayer().getTotalDamage());
					afterHit();
					if (this.getMonster().getHealth() > 0) {
						System.out.println(this.getMonster().getName() + " hit you");
						int monsterDamage = this.getMonster().getDamage()
								- this.getPlayer().getInventory().getArmor().getDamageDodge();
						if (monsterDamage < 0) {
							monsterDamage = 0;
						}
						this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
						afterHit();
					}
				} else {
					return false;
				}
			}

			if (this.getMonster().getHealth() < this.getPlayer().getHealth()) {

				this.afterBattle();

			} else {
				return false;
			}
		}

		return true;

	}

	public void useElixirInCombat() {

		this.getPlayer().printElixirChestInfo();
		System.out.println("Do you want to use any elixir? /n ---(1) Health Elixir (2)Medical Elixir (3) -No-");
		int selectLocation;
		boolean elixirMenu = true;
		while (elixirMenu) {

			if (PlayerScanner.hasnextIntScanner()) {
				selectLocation = PlayerScanner.intScanner();

				if (selectLocation >= 0 && selectLocation <= 3) {
					switch (selectLocation) {
					case 0:
						System.out.println("Exiting the program.");
						return;
					case 1:
						if (this.getInventory().getElixirChest().getHealthElixirCount() > 0) {
							this.getPlayer().setHealth(this.getPlayer().getDefaultHealth() + 5);
							System.out.println(
									"You used Health Elixir. Now your health increased + 5 point for just one fight ");
							this.getInventory().getElixirChest().setHealthElixirCount(
									this.getInventory().getElixirChest().getHealthElixirCount() - 1);
						} else {
							System.out.println("You don't have any Health Elixir");
						}

						break;
					case 2:
						if (this.getInventory().getElixirChest().getMedicalElixirCount() > 0) {
							this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
							System.out.println("You used Medical Elixir. You have been healed ");
							this.getInventory().getElixirChest().setMedicalElixirCount(
									this.getInventory().getElixirChest().getMedicalElixirCount() - 1);
						} else {
							System.out.println("You don't have any Medical Elixir");
						}

						break;
					case 3:
						System.out.println("You didn't use any elixir");
						return;
					}
				} else {
					System.out.println("Please enter a valid number between 0 and 3.");
				}
			} else {
				System.out.println("Please enter a valid number.");
				PlayerScanner.stringScanner();
			}
		}

	}

	public void afterHit() {
		System.out.println("---------------------");
		System.out.println("Your Health : " + this.getPlayer().getHealth());
		System.out.println(this.getMonster().getName() + "'s Health : " + this.getMonster().getHealth());
		System.out.println("---------------------");

	}

	public void afterBattle() {
		System.out.println("You killed the enemy");
		this.getPlayer().getPlayerLevel().gainExperience(this.getMonster().getAwardExperience());
		if (this.getPlayer().getPlayerLevel().checkLevelUp()) {
			this.levelUpAward();
		}
		System.out.println("Your current exp is: " + this.getPlayer().getPlayerLevel().getCurrentExperience() + "/50");
		this.getPlayer().setThirstLevel(this.getPlayer().getThirstLevel() + 1);
		this.getPlayer().setSatiety(this.getPlayer().getSatiety() - 1);
		// TODO IF THIRST LEVEL GETS OVER 20 ADD SOME CONSEQUENCES

		collectAward2(this.getMonster().getAward().getId());
	}

	public void playerStats() {

		System.out.println("Player Informations \n ------------------------");
		System.out.printf(infoPlayerFormat, this.getInventory().getWeapon().getName(),
				this.getInventory().getArmor().getName(), this.getInventory().getArmor().getDamageDodge(),
				this.getPlayer().getTotalDamage(), this.getPlayer().getHealth(), this.getPlayer().getMoney());

	}

	public void monsterStats(int i) {

		System.out.println(i + ". " + this.getMonster().getName() + " Informations \n ------------------------");
		System.out.printf(infoMonsterFormat, this.getMonster().getDamage(), this.getMonster().getHealth(),
				this.getMonster().getAwardMoney());

	}

	public int RandomMonsterCount() {
		Random random = new Random();
		return random.nextInt(this.getMaxMonsterCount()) + 1;

	}

	public void collectAward2(int awardId) {
		System.out.println("You earned " + this.getMonster().getAwardMoney() + " money");

		this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAwardMoney());
		System.out.println("Your current Money " + this.getPlayer().getMoney());

		switch (awardId) {
		case 1:
			this.getInventory().setFoodCount(this.getInventory().getFoodCount() + 1);
			System.out.println("You earned Food. Your Current Food Count is " + this.getInventory().getFoodCount());
			break;
		case 2:
			this.getInventory().setWaterCount(this.getInventory().getWaterCount() + 1);
			System.out.println("You earned Water. Your Current Water Count is " + this.getInventory().getWaterCount());
			break;
		case 3:
			this.getInventory().setWoodCount(this.getInventory().getWoodCount() + 1);
			System.out.println("You earned Wood. Your Current Wood Count is " + this.getInventory().getWoodCount());
			break;
		case 4:
			this.getInventory().setIronCount(this.getInventory().getIronCount() + 1);
			System.out.println("You earned Iron. Your Current Iron Count is " + this.getInventory().getIronCount());
			break;
		case 5:
			if (this.getMonster().getAward().isChange(this.getId())) {
				this.getInventory().setDarkStone(this.getInventory().getDarkStone() + 1);
				System.out.println(
						"You earned Dark Stone.Your Current Dark Stone Count is " + this.getInventory().getDarkStone());
			}
			break;
		case 6:
			if (this.getMonster().getAward().isChange(this.getId())) {
				this.getInventory().setDiamondCount(this.getInventory().getDiamondCount() + 1);
				System.out.println(
						"You earned Diamond.Your Current Diamond Count is " + this.getInventory().getDiamondCount());
			}
			break;
		case 7:
			if (this.getMonster().getAward().isChange(this.getId())) {
				// TODO: GİFTBOX KAZANMA SİSTEMİ YAZ. BUNU SAFE HOUSE İÇİNDE AÇABİLSİN.
				System.out.println("You earned Gift Box.Your Current GiftBox - Elf King Box Count is "
						+ this.getInventory().getBoxChest().getElfKingBoxCount());
			}
			break;
		}

		this.collectExtraAward(getId());
	}

	public void collectExtraAward(int locationId) {

		switch (locationId) {
		case 8:
			if (this.getMonster().extraAwardWihtLocation(getId()) != null) {
				this.getInventory().setWaterCount(this.getInventory().getWaterCount() + 1);
				System.out.println("You earned extra award --- wATER");
				System.out.println("Your current Water count is: " + this.getInventory().getWaterCount());
			}
			break;
		case 9:

			if (this.getMonster().extraAwardWihtLocation(getId()) != null) {
				this.getInventory().setFoodCount(this.getInventory().getFoodCount() + 1);
				System.out.println("You earned extra award --- Food");
				System.out.println("Your current food count is: " + this.getInventory().getFoodCount());
			}
			break;

		default:
			break;
		}

	}

	public void levelUpAward() {
		System.out.println("Your health is increased from " + this.getPlayer().getDefaultHealth() + " to "
				+ (this.getPlayer().getDefaultHealth() + 2));
		this.getPlayer().setDefaultHealth(this.getPlayer().getDefaultHealth() + 2);
		this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());

	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

//	public Award getAward() {
//		return award;
//	}
//
//	public void setAward(Award award) {
//		this.award = award;
//	}

	public int getMaxMonsterCount() {
		return maxMonsterCount;
	}

	public void setMaxMonsterCount(int maxMonsterCount) {
		this.maxMonsterCount = maxMonsterCount;
	}

	public Inventory getInventory() {

		return this.getPlayer().getInventory();
	}
}
