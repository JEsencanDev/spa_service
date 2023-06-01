// Joey Esencan, Chapter 3 exercises, 5/11/2023

import java.util.Scanner;

public class CreateSpaServices
{
	public static void main(String[] args)
	{
		// Variables and Constants
		String service;
		double price;
		Scanner keyboard = new Scanner(System.in);
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();

		// Input phase

		System.out.println("Please enter the name of service ");
		service = keyboard.nextLine();

		System.out.println("Please enter the price of the service ");
		price = keyboard.nextDouble();

		// Implement our custom SpaService class methods
		firstService.setServiceDescription(service);
		firstService.setPrice(price);

		// keyboard buffer for the scanner Obj
		keyboard.nextLine();

		System.out.println("Please enter the name of a second service >> ");
		service = keyboard.nextLine();

		System.out.println("Please enter the price of a second service ");
		price = keyboard.nextDouble();

		secondService.setServiceDescription(service);
		secondService.setPrice(price);

		// Output phase

		System.out.println("First service details: ");
		System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

		System.out.println("Second service details: ");
		System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

	} //End of main method

} //End of class