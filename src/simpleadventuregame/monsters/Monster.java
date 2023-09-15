package simpleadventuregame.monsters;

import simpleadventuregame.game.AbstractEntity;
import simpleadventuregame.game.experience.MonsterLevel;
import simpleadventuregame.items.Loot.Award;

public abstract class Monster extends AbstractEntity<Integer> {

//	private int id;
	private String name;
	private Award award;
	private Award extraAward;
	private int damage;
	private int health;
	private int awardMoney;
	private int defaultHealth;
	private int awardExperience;
	private int battleExperience;
	private MonsterLevel monsterLevel;

	public Monster(int id, String name, Award award, int damage, int health, int awardMoney, int awardExperience,
			int battleExperience) {
		super();
//		this.id = id;
		this.setId(id);
		this.name = name;
		this.award = award;
		this.damage = damage;
		this.health = health;
		this.defaultHealth = health;
		this.awardMoney = awardMoney;
		this.awardExperience = awardExperience;
		this.battleExperience = battleExperience;
		this.monsterLevel = new MonsterLevel();
	}

	public Monster(int id, String name, Award award, Award extraAward, int damage, int health, int awardMoney,
			int awardExperience, int battleExperience) {
		super();
//		this.id = id;
		this.setId(id);
		this.name = name;
		this.award = award;
		this.extraAward = extraAward;
		this.damage = damage;
		this.health = health;
		this.defaultHealth = health;
		this.awardMoney = awardMoney;
		this.awardExperience = awardExperience;
		this.battleExperience = battleExperience;
		this.monsterLevel = new MonsterLevel();
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

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

	
	public int getDefaultHealth() {
		return defaultHealth;
	}

	public void setDefaultHealth(int defaultHealth) {
		this.defaultHealth = defaultHealth;
	}

	public Award getAward() {
		return award;
	}

	public void setAward(Award award) {
		this.award = award;
	}

	public Award extraAwardWihtLocation(int locationId) {

		if (this.getExtraAward().isChange(locationId)) {
			return getExtraAward();
		}
		return null;

	}

	public boolean extraAwardWihtLocation1(int locationId) {

		if (this.getExtraAward().isChange(locationId)) {
			return true;
		}
		return false;

	}

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

	public MonsterLevel getMonsterLevel() {
		return monsterLevel;
	}

	public void setMonsterLevel(MonsterLevel monsterLevel) {
		this.monsterLevel = monsterLevel;
	}

	public int getBattleExperience() {
		return battleExperience;
	}

	public void setBattleExperience(int battleExperience) {
		this.battleExperience = battleExperience;
	}

}
