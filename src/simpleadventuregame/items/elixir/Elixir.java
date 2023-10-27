package simpleadventuregame.items.elixir;

import simpleadventuregame.items.Loot.Award;

public abstract class Elixir extends Award {

	private int price;
	
	public Elixir(int id, String name, int price ,boolean upgradeable) {
		super(id, name,upgradeable);
		this.price = price;
		
	}

	public static Elixir[] elixirs() {

		Elixir[] eList = { new HealthElixir(), new MedicalElixir(), new BlockElixir()};
		return eList;

	}

	public static Elixir getElixirById(int id) {

		for (Elixir e : Elixir.elixirs()) {
			if (e.getId() == id) {
				return e;
			}
		}

		return null;

	}

	
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

}
