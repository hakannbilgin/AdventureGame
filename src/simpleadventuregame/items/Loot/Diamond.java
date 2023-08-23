package simpleadventuregame.items.Loot;

public class Diamond extends Award {

	public Diamond() {
		super(6, "Diomand");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(int locationId) {

		if (locationId == 9) {
			this.setChance(80);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else {
			return false;
		}
	}

}
