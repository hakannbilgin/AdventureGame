package simpleadventuregame.items.tools;

import simpleadventuregame.items.Item;

public abstract class Tool extends Item {

	private int useCount = 0;
	private int defaultUseCount;
	private boolean repairable;
	//TODO:ADD TOOL LEVEL

	public Tool(String name, int id, int useCount ,int defaultUseCount,  boolean repairable) {
		super(name,id);
//		this.setName(name);
//		this.setId(id);
		this.useCount = useCount;
		this.defaultUseCount= defaultUseCount;
		this.repairable = repairable;
	}

//	TODO: ADD MORE MOTHOD TO USE TOOLS	
	public abstract boolean use();
	
//	public abstract void repair();
	
	public void repair() {
		if (repairable) {
			this.setUseCount(this.getDefaultUseCount());
			System.out.println("Your tool repaired.");
		}else {
			System.out.println("Your tool is not repairable");
		}
		
		
	}
	
	

	public int getUseCount() {
		return useCount;
	}

	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}

	public boolean isRepairable() {
		return repairable;
	}

	public void setRepairable(boolean repairable) {
		this.repairable = repairable;
	}

	public int getDefaultUseCount() {
		return defaultUseCount;
	}

	public void setDefaultUseCount(int defaultUseCount) {
		this.defaultUseCount = defaultUseCount;
	}
	
}
