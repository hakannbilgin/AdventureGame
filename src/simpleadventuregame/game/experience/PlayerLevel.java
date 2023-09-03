package simpleadventuregame.game.experience;

public class PlayerLevel extends Level {

	public PlayerLevel() {
		super(9, 50);

	}

	@Override
	public void gainExperience(int experiencePoints) {
		setCurrentExperience(getCurrentExperience() + experiencePoints);

		checkLevelUp();

	}

	@Override
	public void loseExperience(int experiencePoints) {

		setCurrentExperience(getCurrentExperience() - experiencePoints);

		if (getCurrentExperience() < 0) {

			setCurrentExperience(0);
		}

	}

	@Override
	public void checkLevelUp() {

		if (getCurrentExperience() >= getMaxLevelExperience()) {
			levelUp();
		}

	}

	@Override
	public void levelUp() {

		System.out.println("Level Up!");

	}

}
