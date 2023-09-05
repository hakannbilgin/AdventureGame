package simpleadventuregame.game.experience;

public class PlayerLevel extends Level {

	public PlayerLevel() {
		super(9, 50);

	}

	@Override
	public void gainExperience(int experiencePoints) {
		this.setCurrentExperience(this.getCurrentExperience() + experiencePoints);

		checkLevelUp();

	}

	@Override
	public void loseExperience(int experiencePoints) {

		this.setCurrentExperience(this.getCurrentExperience() - experiencePoints);

		if (this.getCurrentExperience() < 0) {

			setCurrentExperience(0);
		}

	}

	@Override
	public void checkLevelUp() {

		if (getCurrentExperience() >= getMaxLevelExperience()) {

			if (!(this.getCurrentLevel() >= this.getMaxLevel())) {
				levelUp();
			}
		}

	}

	@Override
	public void levelUp() {

		this.setCurrentLevel(getCurrentLevel() + 1);
		this.setCurrentExperience(getCurrentExperience()-50);
		System.out.println("Level Up! Now Your Level is :--  " + this.getCurrentLevel()+ " -- ");

	}

}
