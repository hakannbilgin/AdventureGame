package simpleadventuregame.locations.battlelocs;

import java.util.Random;

import simpleadventuregame.game.Inventory;
import simpleadventuregame.game.Player;
import simpleadventuregame.items.Loot.Award;
import simpleadventuregame.locations.Location;
import simpleadventuregame.monsters.Monster;
import simpleadventuregame.utils.PlayerScanner;

public abstract class BattleLoc extends Location {

	private String infoPlayerFormat = " Your current info : Your weapon: [%-7s] Your Armor : [%-7s] [Dodge:  %-1d] [Damage:  %-1d] [Health:  %-1d] [Money: %2d] \n";
	private String infoMonsterFormat = " Monster info : [Damage:  %-1d] [Health:  %-1d] [Award: %2d] \n";
	private Monster monster;
	private Award award;
	private int maxMonsterCount;

	public BattleLoc(Player player, String locationName, Monster monster, Award award, int maxMonsterCount) {
		super(player, locationName);
		this.monster = monster;
		this.award = award;
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
				System.out.println("You killed the enemy");
				this.getPlayer().setThirstLevel(this.getPlayer().getThirstLevel() + 1);
				this.getPlayer().setSatiety(this.getPlayer().getSatiety() - 1);
				// TODO IF THIRST LEVEL GETS OVER 20 ADD SOME CONSEQUENCES
//				collectAward();
				collectAward2(this.getAward().getId(), this.getAward().getChange());

			} else {
				return false;
			}
		}

		return true;

	}

	public void afterHit() {
		System.out.println("---------------------");
		System.out.println("Your Health : " + this.getPlayer().getHealth());
		System.out.println(this.getMonster().getName() + "'s Health : " + this.getMonster().getHealth());
		System.out.println("---------------------");

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

	public void collectAward() {

		System.out.println("You earned " + this.getMonster().getAwardMoney() + " money");

		this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAwardMoney());
		System.out.println("Your current Money " + this.getPlayer().getMoney());

		if (this.getAward().getId() == 1) {
			this.getInventory().setFoodCount(this.getInventory().getFoodCount() + 1);
			System.out.println("You earned Food. Your Current Food Count is " + this.getInventory().getFoodCount());
		} else if (this.getAward().getId() == 2) {
			this.getInventory().setWaterCount(this.getInventory().getWaterCount() + 1);
			System.out.println("You earned Water. Your Current Water Count is " + this.getInventory().getWaterCount());
		} else if (this.getAward().getId() == 3) {
			this.getInventory().setWoodCount(this.getInventory().getWoodCount() + 1);
			System.out.println("You earned Wood. Your Current Wood Count is " + this.getInventory().getWoodCount());
		} else if (this.getAward().getId() == 4) {
			this.getInventory().setIronCount(this.getInventory().getIronCount() + 1);
			System.out.println("You earned Iron. Your Current Iron Count is " + this.getInventory().getIronCount());

		} else {
			if (this.getAward().isChange(monster)) {
				this.getInventory().setDarkStone(this.getInventory().getDarkStone() + 1);
				System.out.println(
						"You earned Dark Stone.Your Current Dark Stone Count is " + this.getInventory().getDarkStone());
			}
		}

	}

	public void collectAward2(int awardId, int awardChange) {
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
			if (this.getAward().isChange(monster)) {
				this.getInventory().setDarkStone(this.getInventory().getDarkStone() + 1);
				System.out.println(
						"You earned Dark Stone.Your Current Dark Stone Count is " + this.getInventory().getDarkStone());
			}
			break;
		case 6:
			if (this.getAward().isChange(monster)) {
				this.getInventory().setDiamondCount(this.getInventory().getDiamondCount() + 1);
				System.out.println(
						"You earned Diamond.Your Current Diamond Count is " + this.getInventory().getDiamondCount());
			}
			break;
		}

	}

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public Award getAward() {
		return award;
	}

	public void setAward(Award award) {
		this.award = award;
	}

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
