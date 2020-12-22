/*
 * Lab Test 2
 * Name: Adam Plater-Zyberk
 * Date: August 5th 2020
 * Student Number: 040 922 567
 * Course: CST8110
 * Semester: S20
 */

import java.util.Scanner;

public class Phone {

	//declaring instance variables
	private String owner;
	private int phoneNumber;
	private double minutesUsed;

	Scanner scan = new Scanner(System.in);

	//no-argument constructor with initialized variables
	public Phone() {

		owner = "unknown";
		phoneNumber = -1;
		minutesUsed = 0.0;

	}

	//parameterized constructor with initialized variables
	public Phone(int phoneNumber, String owner, double minutesUsed) {

		this.owner = owner;
		this.phoneNumber = phoneNumber;
		this.minutesUsed = minutesUsed;
	}

	//prompts user for inputs, initializes respective class fields and verifies minutesUsed is greater than 0
	public void inputPhoneDetails() {
		System.out.print("\nENTER PHONE OWNER: ");
		owner=scan.nextLine();

		System.out.print("ENTER PHONE NUMBER: ");
		phoneNumber=scan.nextInt();

		System.out.print("ENTER MINUTES USED: ");
		minutesUsed=scan.nextDouble();

		while(minutesUsed <= 0) {

			System.out.print("MINUTES USED MUST BE GREATER THAN 0");

			System.out.print("\nENTER MINUTES USED: ");
			minutesUsed=scan.nextDouble();


		}

	}

	//calculates total bill based on usage rates by number of minutes used
	public double calculateTotal() {

		double total = 0.0;


		if(minutesUsed < 10) {
			total = minutesUsed*1.25;
		}
		else if(minutesUsed > 10 && minutesUsed < 30) {
			total = minutesUsed*0.75;
		}
		else if(minutesUsed > 30) {
			total = minutesUsed*0.50;
		}
		return total;

	}

	//displays all user details and invokes the calculateTotal method
	public void printInfo() {

		System.out.printf("\n%-15d", this.phoneNumber);
		System.out.printf("%-11s", this.owner);
		System.out.printf("%-16.2f", this.minutesUsed);
		System.out.printf("%-10.2f", calculateTotal());

	}

}//end of class
