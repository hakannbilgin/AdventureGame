package simpleadventuregame.items.elixir;

public class MedicalElixir extends Elixir{

	public MedicalElixir() {
		super(12, "Medical Elixir",15);
		
	}

	@Override
	public boolean isChange(int locationId) {
		return true;
	}

}
