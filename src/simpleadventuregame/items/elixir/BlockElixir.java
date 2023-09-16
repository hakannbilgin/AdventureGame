package simpleadventuregame.items.elixir;

public class BlockElixir extends Elixir{

	public BlockElixir() {
		super(13, "Block Elixir", 15);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(int locationId) {
		if (locationId == 14) {
			this.setChance(20);
			int lootChange = (int) (Math.random() * 100);

			return lootChange <= this.getChance();
		} else {
			return false;
		}
	}

}
