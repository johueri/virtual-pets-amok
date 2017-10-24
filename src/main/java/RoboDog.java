
public class RoboDog extends Dog implements RoboPetInterface {
	public int oilLevel;

	public RoboDog(String petName, String description, int health, int happiness, int boredom, int oilLevel) {
		super(petName, description, health, happiness, boredom);
		this.oilLevel = oilLevel;
	}
	public RoboDog (String petName, String description) {
		super(petName, description);
		health = 100;
		happiness = 100;
		boredom = 0;
		oilLevel = 99;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void oilPets() {
		oilLevel = 100;

	}

	@Override
	public void tick() {
		super.tick();

		if (happiness < 10) {
			health -= 2;
		}
		if (boredom > 5) {
			happiness -= 1;
		}
		if (oilLevel < 50) {
			health -= 5;
		}
		oilLevel -= 5;

	}
}
