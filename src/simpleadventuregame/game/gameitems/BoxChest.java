package simpleadventuregame.game.gameitems;

public class BoxChest {

	private int ElfKingBoxCount = 0;
	
	private int totalBoxCount = 0;


	public int getTotalBoxCount() {
		
		totalBoxCount = getElfKingBoxCount();
		return totalBoxCount;
	}
	

	public int getElfKingBoxCount() {
		return ElfKingBoxCount;
	}

	public void setElfKingBoxCount(int elfKingBoxCount) {
		ElfKingBoxCount = elfKingBoxCount;
	}

	
	
}
