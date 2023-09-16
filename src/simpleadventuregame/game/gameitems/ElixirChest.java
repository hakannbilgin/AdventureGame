package simpleadventuregame.game.gameitems;

public class ElixirChest {

	private int healthElixirCount = 5;
	private int medicalElixirCount = 5;
	private int totalElixirCount = 0;
	private int blockElixirCount = 0;

	public int getHealthElixirCount() {
		return healthElixirCount;
	}

	public void setHealthElixirCount(int healthElixirCount) {
		this.healthElixirCount = healthElixirCount;
	}

	public int getMedicalElixirCount() {
		return medicalElixirCount;
	}

	public void setMedicalElixirCount(int medicalElixirCount) {
		this.medicalElixirCount = medicalElixirCount;
	}

	public int getTotalElixirCount() {
		totalElixirCount = getHealthElixirCount() + getMedicalElixirCount();
		return totalElixirCount;
	}

	public void setTotalElixirCount(int totalElixirCount) {
		this.totalElixirCount = totalElixirCount;
	}

	public int getBlockElixirCount() {
		return blockElixirCount;
	}

	public void setBlockElixirCount(int blockElixirCount) {
		this.blockElixirCount = blockElixirCount;
	}
	
	
	
	
	
}
