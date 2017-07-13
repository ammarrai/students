package math.percentage.operations;

import java.util.Scanner;

import math.percentage.EndOfCalculation;

public class Two {

	public void calculateTwo() {
		double x; // local variables
		double y;
		double z;

		//scanner input
		System.out.println("You Chose: 2. x is what % of y?");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of x:");

		x = input.nextDouble();
		System.out.println("Enter the value of y");
		y = input.nextDouble();

		//input.close();
		
		//calculation
		z = (x / y) * 100;
		System.out.println(z);
		
		// clean-up
		EndOfCalculation eoc = new EndOfCalculation();
		eoc.endOfCalculation();
	}
}
