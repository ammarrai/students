package math.percentage.operations;

import java.util.Scanner;

import math.percentage.EndOfCalculation;

public class Three {
	
	public void calculateThree() {
		double x; // local variables
		double y;
		double z;

		System.out.println("3. x is y% of what #?");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of x:");

		x = input.nextDouble();
		System.out.println("Enter the percent value of y");
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
