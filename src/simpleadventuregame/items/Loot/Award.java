package simpleadventuregame.items.Loot;

/*
 * 
 * TODO : need to use this class for extra awards
 * 
 */
public abstract class Award {

	private int id;
	private String name;
	private int change = 40;

	public String getName() {
		return name;
	}

	public Award(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	public boolean isChange() {

		int lootChange = (int) (Math.random() * 100);

		return lootChange <= this.change;
	}
}
