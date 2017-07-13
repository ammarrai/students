package math.percentage.operations;

import java.util.Scanner;

import math.percentage.EndOfCalculation;

public class Six {
	
public void calculateSix() {
		
		double x; // local variables
		double y;
		double z;

		System.out.println("You chose: 6. x decreased by y% is what #?");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of x:");
		x = input.nextDouble();
		System.out.println("Enter the percent value of y:");
		y = input.nextDouble();

		//input.close();
		
		// calculation
		z=x*(1-(y/100));
		System.out.println(x+" decreased by"+ y+"% equals "+z);
		
		// clean-up
		EndOfCalculation eoc = new EndOfCalculation();
		eoc.endOfCalculation();
	}
	
}
