
public class RoboDog extends Dog implements RoboPetInterface {
	public int oilLevel;
	public RoboDog(String petName, String description, int health, int happiness, int boredom, int oilLevel) {
		super(petName, description, health, happiness, boredom);
		this.oilLevel = oilLevel;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void oilPets() {
		// TODO Auto-generated method stub
		
	}

	
}
