import java.util.Collection;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private int litterBoxLevel;

	public int getLitterBoxLevel() {
		return litterBoxLevel;
	}

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
				litterBoxLevel += 2;
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
				((OrganicDog)currentPet).cleanDogCage();
			}
		}
		
	}
	public void walkAllDogs() {
		for (VirtualPet currentPet : pets.values()) {
			if (currentPet instanceof OrganicDog) {
				((OrganicDog)currentPet).walkDog();
			}
		}
	}
	
	public void litterBoxHealthTick() {
		while (litterBoxLevel > 20) {
			for (VirtualPet currentPet : pets.values()) {
				if (currentPet instanceof OrganicCat) {
				((OrganicCat)currentPet).dirtyLitterBox();
			
			
			
				
			}
			}
		}
	}
}