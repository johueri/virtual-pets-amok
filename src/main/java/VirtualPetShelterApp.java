import java.util.Scanner;

public class VirtualPetShelterApp {
	static int choice;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		VirtualPetShelter myShelter = new VirtualPetShelter();

		OrganicDog pet1 = new OrganicDog("Cliff", "He's a big red dog.", 100, 100, 0, 0, 0);
		OrganicCat pet2 = new OrganicCat("Jenga", "She's a frisky cat", 100, 100, 0, 0);
		RoboDog pet3 = new RoboDog("CHiP", "He wants to be a real dog", 100, 100, 0, 99);
		RoboCat pet4 = new RoboCat("Fee9", "Is sentient.", 100, 100, 0, 99);

		myShelter.add(pet1);
		myShelter.add(pet2);
		myShelter.add(pet3);
		myShelter.add(pet4);

		System.out.println("Welcome to the Franklin County Animal Shelter!");
		myShelter.displayStats();

		do {
			System.out.println("\nWhat would you like to do?");
			System.out.println("Press 1 to feed all organic pets.");
			System.out.println("Press 2 to walk all dogs.");
			System.out.println("Press 3 to clean all organic dog cages.");
			System.out.println("Press 4 to empty the litter box.");
			System.out.println("Press 5 to oil all robotic pets.");
			System.out.println("Press 6 to play with a pet");
			System.out.println("Press 7 to adopt a pet");
			System.out.println("Press 8 to admit a pet");
			System.out.println("Press 9 to exit");
			choice = input.nextInt();
			myShelter.litterBoxHealthTick();
			myShelter.litterBoxTick();
			myShelter.petsTickMethod();

			if (choice == 1) {
				System.out.println("You feed all the pets.");
				System.out.println(" ");
				myShelter.feedAll();
				myShelter.displayStats();

			}

			else if (choice == 2) {
				System.out.println("You take all the dogs out for a walk.");
				myShelter.displayStats();

			} else if (choice == 3) {
				System.out.println("Thank you for cleaning all the dog cages. You smell terrible.");
				myShelter.cleanAllCages();
				myShelter.displayStats();

			} else if (choice == 4) {
				System.out.println("Thank you for cleaning that massive litter box. You smell like ammonia.");
				myShelter.emptyLitterBox();
				myShelter.displayStats();

			} else if (choice == 5) {
				System.out.println(
						"Thank you oiling the robots. Your help is much appreciated. Appreciation is an emotion these pets recently acquired.");
				myShelter.oilAllRobots();
				myShelter.displayStats();

			} else if (choice == 6) {
				System.out.println("Type the name of the pet you would like to play with?");
				String playWithOne = input.nextLine();

				myShelter.getPet(playWithOne).playPet();
				System.out.println("You play with " + playWithOne + "!");
				myShelter.displayStats();
				
			} else if (choice == 7) {
				System.out.println("Here are the pets available for adotpion");
				for (VirtualPet current : myShelter.petStats()) {
					System.out.println(current.getName() + " " + current.getDescription());
				}
				input.nextLine();

				System.out.println("Please type the name of the pet you'd like to adopt.");
				String adoptedPetName = input.nextLine();

				myShelter.adoptPet(adoptedPetName);
				System.out.println("You have adopted " + adoptedPetName + ".");
				System.out.println("No givesies backsies please.");

			} else if (choice == 8) {
				System.out.println("So you'd like to admit a new pet?");

				input.nextLine();

				System.out.println("Please give him, her, or it a 4-letter name");
				String userCreatedName = input.nextLine();
				System.out.println("\nOk, great! What kind of pet of you admitting?");
				System.out.println("\nPlease press 1 if you are submitting an organic dog.");
				System.out.println("Please press 2 if you are submitting an organic cat.");
				System.out.println("Please press 3 if you are submitting a robotic dog.");
				System.out.println("Please press 4 is you are submitting a robotic cat.");
				String userAdmittedSpecies = input.nextLine();
				System.out.println("Thanks. Now describe the pet you are submitting.");
				
				if (userAdmittedSpecies.equals("1")) {
					String userCreatedDescr = input.nextLine();
					myShelter.add(new OrganicDog(userCreatedName, userCreatedDescr));
					System.out.println(" ");
					System.out.println("All done. We'll do our best to give " + userCreatedName + " a good home.");
				}
				if (userAdmittedSpecies.equals("2")) {
					String userCreatedDescr = input.nextLine();
					myShelter.add(new OrganicCat(userCreatedName, userCreatedDescr));
					System.out.println(" ");
					System.out.println("All done. We'll do our best to give " + userCreatedName + " a good home.");
				}
				if (userAdmittedSpecies.equals("3")) {
					String userCreatedDescr = input.nextLine();
					myShelter.add(new RoboDog(userCreatedName, userCreatedDescr));
					System.out.println(" ");
					System.out.println("All done. We'll do our best to give " + userCreatedName + " a good home.");
				}
				if (userAdmittedSpecies.equals("4")) {
					String userCreatedDescr = input.nextLine();
					myShelter.add(new RoboCat(userCreatedName, userCreatedDescr));
					System.out.println(" ");
					System.out.println("All done. We'll do our best to give " + userCreatedName + " a good home.");
				}
			} else if (choice == 6) {
				System.out.println("Thank you for dropping by. See you later!");
				break;
				
			}
			
			System.out.println("\nWhat else would you like to do?");

		} while (choice != -1);
	}
}
