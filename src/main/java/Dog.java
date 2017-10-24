
public abstract class Dog extends VirtualPet {

	public Dog(String petName, String description, int health, int happiness, int boredom) {
		super(petName, description, health, happiness, boredom);
	}
	public Dog (String petName, String description) {
		super(petName, description);
		health = 100;
		happiness = 100;
		boredom = 0;
	}

	public void walkDog() {
		int play = 30;
		happiness += play;
	}
}