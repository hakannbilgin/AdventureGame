package simpleadventuregame.items.Loot;

public abstract class Award {

	private String name;

//	abstract String getAward(BattleLoc battleLoc);

//	String getAward(River river) {
//		// TODO Auto-generated method stub
//		return null;

//	}

	public Award(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
