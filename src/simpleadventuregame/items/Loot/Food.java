package simpleadventuregame.items.Loot;

public class Food extends Award{

	public Food() {
		super(1,"Food");
		
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 9){
			this.setChance(70);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();	
		}else {
			return false;
		}
		
	}

}
