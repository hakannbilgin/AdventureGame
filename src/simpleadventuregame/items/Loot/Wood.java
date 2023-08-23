package simpleadventuregame.items.Loot;

public class Wood extends Award {

	private int woodChange;
	public Wood() {
		super(3,"Wood");
		
	}

	@Override
	public boolean isChange(int locationId) {
		
		
		return true;
	}

	public int getWoodChange() {
		return woodChange;
	}

	public void setWoodChange(int woodChange) {
		this.woodChange = woodChange;
	}

	

}
