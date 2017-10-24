
public class OrganicDog extends Dog implements OrganicPetInterface {

	protected int hunger;
	protected int cageDirtiness;
	

	public OrganicDog(String petName, String description, int health, int happiness, int boredom, int hunger,
			int cageDirtiness) {
		super(petName, description, health, happiness, boredom);
		this.hunger = hunger;
		this.cageDirtiness = cageDirtiness;
	}
	public OrganicDog (String petName, String description) {
		super(petName, description);
		health = 100;
		happiness = 100;
		boredom = 0;
		hunger = 0;
		cageDirtiness = 0;
	}

	public int getHunger() {
		return hunger;
	}

	public int getCageDirtiness() {
		return cageDirtiness;
	}

	public void cleanDogCage() {
		cageDirtiness = 0;
	}

	@Override
	public void feedPet() {
		hunger = 0;
		health += 2;
		happiness +=2;

	}

	@Override
	public void tick() {
		super.tick();
		if (hunger > 10) {
			health -= 1;
		}
		if (cageDirtiness > 15) {
			health -= 1;
		}
		if (happiness < 10) {
			health -= 2;
		}
		if (boredom > 5) {
			happiness -= 1;
		}
		cageDirtiness += 2;
		hunger += 1;
	}

}
