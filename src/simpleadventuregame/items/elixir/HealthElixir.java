package simpleadventuregame.items.elixir;

public class HealthElixir extends Elixir {

	public HealthElixir() {
		super(11, "Healh Elixir (+5 health)",10);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(int locationId) {
		
		return true;
	}

}
