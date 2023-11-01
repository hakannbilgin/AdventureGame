package simpleadventuregame.game.experience;

public class PlayerLevel extends Level {

	public PlayerLevel() {
		super(9, 50);

	}

	@Override
	public void gainExperience(int experiencePoints) {
		this.setCurrentExperience(this.getCurrentExperience() + experiencePoints);

	}

	@Override
	public void loseExperience(int experiencePoints) {

		this.setCurrentExperience(this.getCurrentExperience() - experiencePoints);

		if (this.getCurrentExperience() < 0) {

			setCurrentExperience(0);
		}

	}

	@Override
	public boolean checkLevelUp() {

		if (getCurrentExperience() >= getMaxLevelExperience()) {

			if (!(this.getCurrentLevel() >= this.getMaxLevel())) {
				levelUp();
				return true;

			}else {
				System.out.println("You are at the Highest Level");
			}
		}
		return false;

	}

	@Override
	public void levelUp() {

		this.setCurrentLevel(getCurrentLevel() + 1);
		this.setCurrentExperience(getCurrentExperience() - 50);
		this.setMaxLevelExperience(getMaxLevelExperience() + 25);
		System.out.println("Level Up! Now Your Level is :--  " + this.getCurrentLevel() + " -- ");

	}

	
}
