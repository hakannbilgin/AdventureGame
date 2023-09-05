package simpleadventuregame.game.experience;

public abstract class Level {

	private int currentLevel = 1;
	private int maxLevel;
	private int currentExperience = 0;
	private int maxLevelExperience;

	public Level(int maxLevel, int maxLevelExperience) {
		this.maxLevel = maxLevel;
		this.maxLevelExperience = maxLevelExperience;
	}

	public abstract void gainExperience(int experiencePoints);

	public abstract void loseExperience(int experiencePoints);

	public abstract boolean checkLevelUp();

	public abstract void levelUp();
	
	

//	public void gainExperience(int experiencePoints) {
//		currentExperience += experiencePoints;
//		checkLevelUp();
//	}
//
//	public void loseExperience(int experiencePoints) {
//		currentExperience -= experiencePoints;
//		if (currentExperience < 0) {
//			currentExperience = 0;
//		}
//	}

//	private void checkLevelUp() { 
//		if (currentExperience >= maxLevelExperience) {
//			levelUp();
//		}
//	}
//
//	private void levelUp() {
//		
//		maxLevelExperience += 50; 
//
//		System.out.println("Level Up!");
//	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public int getCurrentExperience() {
		return currentExperience;
	}

	public void setCurrentExperience(int currentExperience) {
		this.currentExperience = currentExperience;
	}

	public int getMaxLevelExperience() {
		return maxLevelExperience;
	}

	public void setMaxLevelExperience(int maxLevelExperience) {
		this.maxLevelExperience = maxLevelExperience;
	}

}
