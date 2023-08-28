package simpleadventuregame.game;

public class AbstractEntity<Id> implements GenericEntity<Id> {

	
	private  Id id;
	
	@Override
	public Id getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Id id) {
		this.id = id;
		
	}

}
