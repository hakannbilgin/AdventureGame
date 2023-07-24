package simpleadventuregame.locations.battlelocs;

import java.util.Random;

import simpleadventuregame.game.Player;
import simpleadventuregame.locations.Location;
import simpleadventuregame.monsters.Monster;
import simpleadventuregame.utils.PlayerScanner;

public abstract class BattleLoc extends Location {

	private Monster monster;
	private String award;
	private int maxMonsterCount;

	public BattleLoc(Player player, String locationName, Monster monster, String award, int maxMonsterCount) {
		super(player, locationName);
		this.monster = monster;
		this.award= award;
		this.setMaxMonsterCount(maxMonsterCount);
	}

	@Override
	public boolean onLocation() {
		int monsterNumber=RandomMonsterCount();
		System.out.println("Now you are in "+ this.getName());
		System.out.println("Bheave yourself there are "+ monsterNumber +" "+  this.getMonster().getName()+"'s here.");
		System.out.println("<F>ight or <R>un ");
		char selectCase = PlayerScanner.StirngToFirstcharScanner();
		if (selectCase=='F') {
			System.out.println("Savaş işlemleri");
		}
		
		return true;
	}

	
	public int RandomMonsterCount() {
		Random random = new Random();
		return random.nextInt(this.getMaxMonsterCount())+1;
		
	}
	
	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public int getMaxMonsterCount() {
		return maxMonsterCount;
	}

	public void setMaxMonsterCount(int maxMonsterCount) {
		this.maxMonsterCount = maxMonsterCount;
	}

	
}
