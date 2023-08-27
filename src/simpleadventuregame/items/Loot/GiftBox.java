package simpleadventuregame.items.Loot;

public abstract class GiftBox extends Award{

	public GiftBox(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	
	public abstract Award openBox();
	
	public abstract void awardsInBox();
	
	
	
}
