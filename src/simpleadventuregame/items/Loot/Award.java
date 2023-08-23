package simpleadventuregame.items.Loot;

/*
 * 
 * TODO : need to use this class for extra awards
 * 
 */
public abstract class Award {

	private int id;
	private String name;
	private int chance;

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

	public int getChance() {
		return chance;
	}

	public void setChance(int chance) {
		this.chance = chance;
	}
	
	

	public abstract boolean isChange(int locationId);
	
}
