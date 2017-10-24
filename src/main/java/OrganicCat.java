
public class OrganicCat extends VirtualPet implements OrganicPetInterface{

	
	protected int hunger;
//	protected int cleanliness; not necessary for cats since you it relies entirely on litter box. 
	public OrganicCat(String petName, String description, int health, int happiness, int hunger, int boredom) {
		super(petName, description, health, happiness, boredom);
		this.hunger = hunger;
		this.boredom = boredom;
//		this.cleanliness = cleanliness;
	}
	// OVERLOADED CONSTRUCTOR
	public OrganicCat (String petName, String description) {
		super(petName, description);
		health = 100;
		happiness = 100;
		boredom = 0;
		hunger = 0;
		
		
	}
	

	public int getHunger() {
		return hunger;
	}
	
	public void dirtyLitterBox() {
		health -= 2;
	}
	
	/*
	 * public void healthyLitterBox() { health +=2; }
	 */

	@Override
	public void tick() {
		super.tick(); 
		if (hunger > 10) {
			health -= 1;
		}
		if (happiness < 10) {
			health -=2;
		}
		if (boredom > 5) {
			happiness -= 1;
		}
	}

	
	@Override
	public void feedPet() {
		hunger = 0;
		health +=2;
	}
	
}
