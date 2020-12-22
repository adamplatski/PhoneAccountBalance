/*
 * Lab Test 2
 * Name: Adam Plater-Zyberk
 * Date: August 5th 2020
 * Student Number: 040 922 567
 * Course: CST8110
 * Semester: S20
 */

public class FinalLabTest {

	public static void main(String[] args) {

		//printing welcome message to user
		System.out.print("WORLD PHONE COMPANY\n");

		//creating object reference using no-argument constructor
		Phone p1 = new Phone();

		//creating object reference using parameterized constructor
		Phone p2 = new Phone(7274723, "Alice", 25.00);

		//creating object reference using no-argument constructor
		Phone p3 = new Phone();

		//invoke inputPhoneDetails method to p3 reference
		p3.inputPhoneDetails();

		//print a table header for the outputs 
		System.out.printf("\n%-14s %-10s %-15s %-12s", "PHONE NUMBER", "OWNER", "MINUTES USED", "TOTAL COST");

		//invoking print info method for all 3 object references
		p3.printInfo();
		p2.printInfo();
		p1.printInfo();
	}

}

