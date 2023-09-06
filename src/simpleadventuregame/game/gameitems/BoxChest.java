package simpleadventuregame.game.gameitems;

public class BoxChest {

	private int trollBoxCount = 0;

	public int getElfKingBoxCount() {
		return trollBoxCount;
	}

	public void setTrollBoxCount(int trollBoxCount) {
		this.trollBoxCount = trollBoxCount;
	}

	public int getTotalBoxCount() {
		return getElfKingBoxCount();
	}

}
