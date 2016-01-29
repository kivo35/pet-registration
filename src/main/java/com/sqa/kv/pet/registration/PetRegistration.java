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
	private static String[] names;
	private static String[] addresses;
	private static int[] pets;
	private static String[] types;
	private static double petFees;
	private static int[] ages;
	private static char[] genders;
	private boolean hasRabies = true;
	private static Scanner scanner = new Scanner(System.in);

	private static void displayPets()
	{
		// TODO Display Pets
	}

	private static void exitPetRegApp()
	{
		scanner.close();
		System.out.println("Thank you for using pets register application!");
	}

	public static void main(String[] args)
	{
		// set the number of pets
		numPets = RequestInput.getInt("How many pets would you like to register?: ");
		// register number of pets chosen
		registerPets();
		// display registered pets to user
		displayPets();
		// exit the system
		exitPetRegApp();
	}

	/*
	 * method which iterates through loops setting pet values
	 */
	private static boolean registerBird()
	{
		// Local variable
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To ensure a dog it is $120 a year.");
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the dog?");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/*
	 * method which iterates through loops setting pet values
	 */
	private static boolean registerCat()
	{
		// Local variable
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To ensure a dog it is $120 a year.");
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the dog?");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/*
	 * method which iterates through loops setting pet values
	 */
	private static boolean registerDog()
	{
		// Local variable
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To ensure a dog it is $120 a year.");
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the dog?");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/*
	 * method which iterates through loops setting pet values
	 */
	private static boolean registerFish()
	{
		// Local variable
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To ensure a dog it is $120 a year.");
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the dog?");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	/*
	 * method which iterates through loops setting pet values
	 */
	private static boolean registerHorse()
	{
		// Local variable
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To ensure a dog it is $120 a year.");
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the dog?");
		// return the set variable for if the user will register the animal
		return willRegister;
	}

	private static void registerPets()
	{
		boolean willRegister;
		// Setup variable to create continuous loop based on invalid pet type
		while (true)
		{
			String type = RequestInput.getString("What type of pet do you have?: ");
			switch (type)
			{
			case "dog":
				willRegister = registerDog();
				System.out.println("Add a dog.");
				break;
			case "cat":
				willRegister = registerCat();
				System.out.println("Add a cat.");
				break;
			case "fish":
				willRegister = registerFish();
				System.out.println("Add a fish.");
				break;
			case "horse":
				willRegister = registerHorse();
				System.out.println("Add a horse.");
				break;
			case "bird":
				willRegister = registerBird();
				System.out.println("Add a bird.");
				break;
			case "reptile":
				willRegister = registerReptile();
				System.out.println("Add a reptile.");
				break;
			default:
				System.out.println("Invalid Animal. Try again.");
				break;
			}

			if (type == "dog" || type == "cat" || type == "fish" || type == "horse" || type == "bird"
					|| type == "reptile")
			{

				break;
			}
		}

	}

	/*
	 * method which iterates through loops setting pet values
	 */
	private static boolean registerReptile()
	{
		// Local variable
		boolean willRegister;
		// Tell the user the price to register the dog
		System.out.println("To ensure a dog it is $120 a year.");
		// return for supplied question
		willRegister = RequestInput.getBoolean("Would you like to register the dog?");
		// return the set variable for if the user will register the animal
		return willRegister;
	}
}
