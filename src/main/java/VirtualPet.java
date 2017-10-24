
public abstract class VirtualPet {

	// Instance Variables
	protected String petName;
	protected String description;
	protected int health;
	protected int happiness;
	protected int boredom;

	// Constructor
	public VirtualPet(String petName, String description, int health, int happiness, int boredom) {
		super();
		this.petName = petName;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
		this.boredom = boredom;

	}

	// Overloading Constructor
	public VirtualPet(String petName, String description) {
		this.petName = petName;
		this.description = description;
	}

	// Tick Method
	public void tick() {
		int time = 1;
		health -= time;
		happiness -= time;
		boredom += time;

	}

	// Getters
	public String getName() {
		return petName;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getBoredom() {
		return boredom;
	}
	//

	// Method of Behavior
	public void playPet() {
		int play = 50;
		happiness += play;
	}
}
