package math.percentage.operations;

import java.util.Scanner;

import math.percentage.EndOfCalculation;
import math.percentage.OperationSelector;

public class Five {

	public void calculateFive() {

		double x; // local variables
		double y;
		double z;

		System.out.println("You chose: 5. x increased by y% is what #?");

		// Scanner input
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x = input.nextDouble();
		System.out.println("Enter the percent value of y:");
		y = input.nextDouble();
		
		//input.close();
		
		// calculation
		
		z = x * (y / 100 + 1);

		System.out.println(x + " increased by " + y + " % is = " + z);

		// clean-up
		EndOfCalculation eoc = new EndOfCalculation();
		eoc.endOfCalculation();
		
	}
}
