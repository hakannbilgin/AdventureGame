package simpleadventuregame.game.experience;

public class ToolLevel extends Level{

	public ToolLevel() {
		super(5, 20);
		// TODO Auto-generated constructor stub
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

			}
		}
		return false;
	}

	@Override
	public void levelUp() {
		this.setCurrentLevel(getCurrentLevel() + 1);
		this.setCurrentExperience(getCurrentExperience() - 50);
		System.out.println("Your Tool Leveled Up! Now Your Level is :--  " + this.getCurrentLevel() + " -- ");
		
	}

}
