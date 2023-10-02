package simpleadventuregame.game.gameitems;

public class BoxChest {

	private int elfKingBoxCount = 0;
	private int goblinKingBoxCount = 0;

	private int totalBoxCount = 0;

	public int getTotalBoxCount() {

		totalBoxCount = getElfKingBoxCount() + getGoblinKingBoxCount();
		return totalBoxCount;
	}

	public int getElfKingBoxCount() {
		return elfKingBoxCount;
	}

	public void setElfKingBoxCount(int elfKingBoxCount) {
		this.elfKingBoxCount = elfKingBoxCount;
	}

	public int getGoblinKingBoxCount() {
		return goblinKingBoxCount;
	}

	public void setGoblinKingBoxCount(int goblinKingBoxCount) {
		this.goblinKingBoxCount = goblinKingBoxCount;
	}

	

}
