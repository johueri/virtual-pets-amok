import java.util.Collection;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private int litterBoxLevel;


	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> petStats() {
		return pets.values();
	}

	public void add(VirtualPet pet) {
		pets.put(pet.getName(), pet); //
	}

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}

	public VirtualPet adoptPet(String name) {
		return pets.remove(name);
	}

	public void emptyLitterBox() {
		litterBoxLevel = 0;
	}
	
	public int getLitterBoxLevel() {
		return litterBoxLevel;
	}

	// Pet Tick Method
	public void petsTickMethod() {
		for (VirtualPet currentPet : pets.values()) {
			currentPet.tick();
		}
	}

	public void feedAll() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof OrganicPetInterface) {
				((OrganicPetInterface) currentPet).feedPet();
			}
		}

	}

	public void litterBoxTick() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof OrganicCat) {
				litterBoxLevel += 20;
			}
		}
	}

	public void oilAllRobots() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof OrganicPetInterface) {
				((RoboPetInterface) currentPet).oilPets();
			}
		}
	}

	public void cleanAllCages() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof OrganicDog) {
				((OrganicDog) currentPet).cleanDogCage();
			}
		}

	}

	public void walkAllDogs() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof OrganicDog) {
				((OrganicDog) currentPet).walkDog();
			}
		}
	}

	public void litterBoxHealthTick() {
		if (litterBoxLevel > 20) {
			for (VirtualPet currentPet : pets.values()) {
				if (currentPet instanceof OrganicCat) {
					((OrganicCat) currentPet).dirtyLitterBox();

				}
			}
		}
	}
	
	public void displayStats() {
		System.out.println("");
		System.out.println("This is the status of our current pets");
		System.out.println("\nORGANIC DOGS:");
		System.out.println("-------------------------------------------------------------------------");
		System.out
				.println("|Name\t" + "|Health\t" + "|Happy\t" + "|Bored\t" + "|Hunger\t" + "|Cage Dirtiness " + "|\t");
		for (VirtualPet organicDog : pets.values()) {
			if (organicDog instanceof OrganicDog) {
				System.out.println("|" + ((OrganicDog) organicDog).getName() + "\t|"
						+ ((OrganicDog) organicDog).getHealth() + "\t|" + ((OrganicDog) organicDog).getHappiness()
						+ "\t|" + ((OrganicDog) organicDog).getBoredom() + "\t|" + ((OrganicDog) organicDog).getHunger()
						+ "\t|" + ((OrganicDog) organicDog).getCageDirtiness() + "\t\t|");
			}
		}
		System.out.println("\nORGANIC CATS:");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|Name\t" + "|Health\t" + "|Happy\t" + "|Bored\t" + "|Hunger\t" + "|Litterbox" + "|\t");
		for (VirtualPet orgoCat : pets.values()) {
			if (orgoCat instanceof OrganicCat) {
				System.out.println("|" + ((OrganicCat) orgoCat).getName() + "\t|" + ((OrganicCat) orgoCat).getHealth()
						+ "\t|" + ((OrganicCat) orgoCat).getHappiness() + "\t|" + ((OrganicCat) orgoCat).getBoredom()
						+ "\t|" + ((OrganicCat) orgoCat).getHunger() + "\t|" + litterBoxLevel + "\t  |");
			}
		}
		System.out.println("\nROBTIC DOGS:");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|Name\t" + "|Health\t" + "|Happy\t" + "|Bored\t" + 
		"|Oil Level" + "|\t");
		for (VirtualPet roboDogs : pets.values()) {
			if (roboDogs instanceof RoboDog) {
				System.out.println("|" + ((RoboDog) roboDogs).getName() + "\t|" + ((RoboDog) roboDogs).getHealth()
						+ "\t|" + ((RoboDog) roboDogs).getHappiness() + "\t|" + ((RoboDog) roboDogs).getBoredom()
						+ "\t|" + ((RoboDog) roboDogs).getOilLevel() + "\t  |");

			}
		}
		System.out.println("\nROBTIC CATS:");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|Name\t" + "|Health\t" + "|Happy\t" + "|Bored\t" + "|Oil Level" + "|\t");
		for (VirtualPet roboCats : pets.values()) {
			if (roboCats instanceof RoboCat) {
				System.out.println("|" + ((RoboCat) roboCats).getName() + "\t|" + ((RoboCat) roboCats).getHealth()
						+ "\t|" + ((RoboCat) roboCats).getHappiness() + "\t|" + ((RoboCat) roboCats).getBoredom()
						+ "\t|" + ((RoboCat) roboCats).getOilLevel() + "\t  |");
			}
		}
	}
}