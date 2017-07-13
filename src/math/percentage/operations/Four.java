package math.percentage.operations;

import java.util.Scanner;

import math.percentage.EndOfCalculation;

public class Four {

	public void calculateFour() {
		double x; // local variables
		double y;
		double z;

		System.out.println("You chose: 4. What is the difference in percentage between x and y?");

		Scanner input = new Scanner(System.in);

		
		System.out.println("Enter the value of x:");
		x = input.nextDouble();
		System.out.println("Enter the value of y");
		y = input.nextDouble();

		//input.close();
		
		//calculation
		z = Math.abs(x - y) / 2;
		System.out.println("The difference between x and y is "+ z +" percent");

		// clean-up
		EndOfCalculation eoc = new EndOfCalculation();
		eoc.endOfCalculation();
	}

}
