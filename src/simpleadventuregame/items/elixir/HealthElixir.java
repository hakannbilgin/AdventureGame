package simpleadventuregame.items.elixir;

public class HealthElixir extends Elixir {

	public HealthElixir() {
		super(1, "Healh Elixir (+5 health)");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isChange(int locationId) {
		
		return true;
	}

}
