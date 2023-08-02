package simpleadventuregame.items.Loot;
/*
 * 
 * TODO : need to use this class for extra awards
 * 
 */
public abstract class Award {

	private int id;
	private String name;

//	abstract String getAward(BattleLoc battleLoc);

//	String getAward(River river) {
//		// TODO Auto-generated method stub
//		return null;

//	}

	

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

}
