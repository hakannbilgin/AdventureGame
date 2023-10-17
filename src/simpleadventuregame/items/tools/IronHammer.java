package simpleadventuregame.items.tools;

public class IronHammer extends Tool{

	public IronHammer( ) {
		super("Iron Hammer", 2, 5, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use() {
		if (this.getUseCount() != 0) {
			this.setUseCount(this.getUseCount() - 1);
			if (this.getUseCount() != 0) {
				System.out.println("You used " + this.getName() + " and " + this.getUseCount() + " use left.");

			} else {
				System.out.println("Your tool is broken. You can't use it anymore.  Craft new one");
				
			}
		}
		
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		
	}

}
