package simpleadventuregame.items.Loot;

public class GiftBox extends Award{

	public GiftBox() {
		super(7, "Gift Box");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(int locationId) {
		
		if (locationId == 11) {
			this.setChance(60);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else {
			return false;
		}
	}

}
