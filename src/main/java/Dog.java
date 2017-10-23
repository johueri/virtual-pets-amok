
public abstract class Dog extends VirtualPet {

	public Dog(String petName, String description, int health, int happiness, int boredom) {
		super(petName, description, health, happiness,  boredom);

	}

	public void walkDog() {
		int play = 50;
		happiness += play;
	}
}