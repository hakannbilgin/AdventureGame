package simpleadventuregame.game.experience;

public class MonsterLevel extends Level {

	public MonsterLevel() {
		super(5, 50);

	}

	@Override
	public void gainExperience(int experiencePoints) {
		this.setCurrentExperience(this.getCurrentExperience() + experiencePoints);

	}

	@Override
	public void loseExperience(int experiencePoints) {

	}

	@Override
	public boolean checkLevelUp() {
		if (getCurrentExperience() >= getMaxLevelExperience()) {

			if (!(this.getCurrentLevel() >= this.getMaxLevel())) {
				levelUp();
				return true;

			}
		}
		return false;

	}

	@Override
	public void levelUp() {
		this.setCurrentLevel(getCurrentLevel() + 1);
		this.setCurrentExperience(getCurrentExperience() - 50);
		System.out.println("You killed this monster for many times and It evolved");

	}

}
