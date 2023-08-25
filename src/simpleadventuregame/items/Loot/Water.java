package simpleadventuregame.items.Loot;

public class Water extends Award {

	public Water() {
		super(2,"Water");
		
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 8){
			this.setChance(70);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();	
		}else {
			return false;
		}
	}

	

	

	

}
