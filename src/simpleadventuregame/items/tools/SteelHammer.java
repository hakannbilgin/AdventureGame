package simpleadventuregame.items.tools;

public class SteelHammer extends Tool {

	public SteelHammer() {
		super("Steel Hammer", 3, 5, false);

	}

	@Override
	public void use() {
		if (this.getUseCount() != 0) {
			this.setUseCount(this.getUseCount() - 1);
			if (this.getUseCount() != 0) {
				System.out.println("You used " + this.getName() + " and " + this.getUseCount() + " use left.");

			} else {
				System.out.println("Your tool is broken. You can't use it anymore.  Craft new one or repair it");
				
			}
		}

	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		
	}

}
