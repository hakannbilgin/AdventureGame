package simpleadventuregame.monsters;

import simpleadventuregame.items.Loot.Award;

public abstract class Monster {

	private int id;
	private String name;
	private Award award;
	private Award extraAward;
	private int damage;
	private int health;
	private int awardMoney;
	private int defaultHealth;
	private int awardExperience;

	public Monster(int id, String name, Award award, int damage, int health, int awardMoney,int awardExperience) {
		super();
		this.id = id;
		this.name = name;
		this.award = award;
		this.damage = damage;
		this.health = health;
		this.defaultHealth = health;
		this.awardMoney = awardMoney;
		this.awardExperience = awardExperience;
	}
	public Monster(int id, String name, Award award, Award extraAward, int damage, int health, int awardMoney, int awardExperience) {
		super();
		this.id = id;
		this.name = name;
		this.award = award;
		this.extraAward= extraAward;
		this.damage = damage;
		this.health = health;
		this.defaultHealth = health;
		this.awardMoney = awardMoney;
		this.awardExperience = awardExperience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health < 0) {
			health = 0;
		}
		this.health = health;
	}

	public int getAwardMoney() {
		return awardMoney;
	}

	public void setAwardMoney(int awardMoney) {
		this.awardMoney = awardMoney;
	}

	public int getDefaulHealth() {
		return defaultHealth;
	}

	public void setDefaulHealth(int defaulHealth) {
		this.defaultHealth = defaulHealth;
	}

	public Award getAward() {
		return award;
	}

	public void setAward(Award award) {
		this.award = award;
	}

	public Award extraAwardWihtLocation(int locationId) {
		System.out.println("monster" + locationId);
		if (this.getExtraAward().isChange(locationId)) {
			return getExtraAward();
		}
		return null;
		
	}
//	public abstract Award extraAwardWihtLocation(int locationId);

	public Award getExtraAward() {
		return extraAward;
	}

	public void setExtraAward(Award extraAward) {
		this.extraAward = extraAward;
	}
	public int getAwardExperience() {
		return awardExperience;
	}
	public void setAwardExperience(int awardExperience) {
		this.awardExperience = awardExperience;
	}
	

	
	
}
