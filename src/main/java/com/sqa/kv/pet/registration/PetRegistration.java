package com.sqa.kv.pet.registration;

import java.util.Scanner;

import com.sqa.kv.util.helper.RequestInput;

/**
 * Create an application which takes registered a local pet into the pet data
 * system. The application should ask how many pets they would like to register.
 * 
 * For each pet they should be asked what type (dog, cat, fish, bird, reptile,
 * or horse). If the type is not a valid registrable pet it should let the user
 * know. If it is, it should echo the price to register the pet for 1 year and
 * confirm price with user. (Use a switch statement). If the user decides to
 * follow through with the registration process, they should than enter the pets
 * Name (String), Address(String), Age(int), Whether they have a Rabies shot
 * (boolean), Yearly Pet Fees (double), and Gender (char). The number of pets
 * that will be entered into the array should be determined at the start of the
 * application. Upon exiting the registered pet details should be echoed to the
 * user.
 */
public class PetRegistration
{
	// declare class static variables
	private static int numPets;
	private static double regPrice;
	private static String[] names;
	private static String[] addresses;
	private static int[] pets;
	private static String[] types;
	private static double[] petFees;
	private static int[] ages;
	private static char[] genders;
	private static boolean[] hasRabies;
	private static Scanner scanner = new Scanner(System.in);

	private static void displayPets()
	{
		// at least one animal is entered
		if (types != null)
		{
			// iterate types array for displaying of Pets
			// for (String animal : types)
			// {
			// System.out.println("Animal: " + animal);
			// }

			for (int i = 0; i < types.length; i++)
			{
				System.out.println();
				System.out.println("The " + types[i].toLowerCase() + "'s name: " + names[i]);
				System.out.println("The " + types[i].toLowerCase() + "'s address: " + addresses[i]);
				System.out.println("The " + types[i].toLowerCase() + "'s age: " + ages[i]);
				System.out.println("The " + types[i].toLowerCase() + "'s gender: " + genders[i]);
				System.out.println("The " + types[i].toLowerCase() + "'s name: " + petFees[i]);
				System.out.println("The " + types[i].toLowerCase() + " had Rabie's shot: " + hasRabies[i]);
			}
		}

		// print the message that animal was not registered
		else
		{
			System.out.println("You have not registered any animals.");
		}

	}

	private static void exitPetRegApp()
	{
		scanner.close();
		System.out.println("Thank you for using Register Pets Application!");
	}

	public static void main(String[] args)
	{
		// register entered pets based on user supplied number
		registerPets(RequestInput.getInt("How many pets would you like to register?: "));
		// display registered pets to user
		displayPets();
		// exit the system
		exitPetRegApp();
	}

	private static void registerAnimal(String animalType, double regPrice)
	{
		// Local variables
		boolean willRegister;
		// Tell the user the price to register the animal
		System.out.println("To register a " + animalType + " is $" + regPrice + " a year.");
		// Set the willRegister local variable to what the helper method will
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the " + animalType);
		// If the user has requested to register the pet
		if (willRegister == true)
		{
			// Add the type of animal being registered to the types array
			types = RequestInput.addStringElement(types, animalType);
		}
		// else they did not want to register their pet
		else
		{
			// Give them a message noting they won't be registering it
			System.out.println("Sorry to hear you do not want to register your " + animalType);
		}
		// return the set variable for if the user will register the animal
		// (will not be needed)
	}

	private static void registerPets(int numPets)
	{
		// Register number of pets chosen
		for (int i = 0; i < numPets; i++)
		{
			// Register Pet
			validatePetRegistration();
		}
		requestAnimalDetails();
	}

	/*
	 * Get the animal details for names, addresses, ages, petFees, hasRabies,
	 * and genders in a contextual order
	 */
	private static void requestAnimalDetails()
	{
		// Request details for all animals inside the types array
		for (int i = 0; i < types.length; i++)
		{
			// initialize the length for names, addresses, ages, genders and
			// petFees arrays
			names = new String[types.length];
			addresses = new String[types.length];
			ages = new int[types.length];
			genders = new char[types.length];
			petFees = new double[types.length];
			hasRabies = new boolean[types.length];

			// Let the user know what they entering into the system
			System.out.println("\nit seems you are regestering " + types[i]
					+ ", could you please proveide the following details?");
			// Capture the name of the animal inside of the name array
			names[i] = RequestInput.getString("Please provide the " + types[i].toLowerCase() + "'s name: ");
			// Capture the name of the animal inside of the name array
			addresses[i] = RequestInput.getString("Please provide the " + types[i].toLowerCase() + "'s address: ");
			// Capture the name of the animal inside of the name array
			ages[i] = RequestInput.getInt("Please provide the " + types[i].toLowerCase() + "'s age: ");
			// Capture the name of the animal inside of the name array
			genders[i] = RequestInput.getChar("Please provide the " + types[i].toLowerCase() + "'gender: ", 'M', 'm',
					'F', 'f');
			// Capture the name of the animal inside of the name array
			petFees[i] = RequestInput.getDouble("Please provide the " + types[i].toLowerCase() + "'s pet fees: ");
			// Capture the name of the animal inside of the name array
			hasRabies[i] = RequestInput.getBoolean("Does the " + types[i].toLowerCase() + " had Rabies vacine?: ");
		}
	}

	private static void validatePetRegistration()
	{
		// boolean value as exit loop criteria
		boolean hasInvalidType = true;

		// Setup variable to create continuous loop based on invalid pet
		// type
		while (hasInvalidType)
		{
			String type = RequestInput.getString("What type of pet do you have?: ");
			switch (type.toLowerCase())
			{
			case "dog":
				registerAnimal(type, 120);
				hasInvalidType = false;
				break;
			case "cat":
				registerAnimal(type, 300);
				hasInvalidType = false;
				break;
			case "fish":
				registerAnimal(type, 500);
				hasInvalidType = false;
				break;
			case "horse":
				registerAnimal(type, 1000);
				hasInvalidType = false;
				break;
			case "bird":
				registerAnimal(type, 235);
				hasInvalidType = false;
				break;
			case "reptile":
				registerAnimal(type, 1560);
				hasInvalidType = false;
				break;
			default:
				System.out.println("Invalid Animal. Try again.");
				break;
			}
		}
	}
}