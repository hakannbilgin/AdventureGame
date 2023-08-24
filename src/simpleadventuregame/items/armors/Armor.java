package simpleadventuregame.items.armors;

public abstract class Armor {

	private String name;
	private int id;
	private int damageDodge;
	private int price;
	
	
	public Armor(String name, int id, int damageDodge, int price) {
		super();
		this.name = name;
		this.id = id;
		this.damageDodge = damageDodge;
		this.price = price;
	}
	
	
	public static Armor[] armors() {

		Armor[] aList = { new LightArmor(), new NormalArmor(), new ShinyArmor() , new MagicalArmor() };
		return aList;

	}
	
	public static Armor getArmorById(int id) {

		for (Armor a : Armor.armors()) {
			if (a.getId() == id) {
				return a;
			}
		}

		return null;

	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDamageDodge() {
		return damageDodge;
	}
	public void setDamageDodge(int damageDodge) {
		this.damageDodge = damageDodge;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
