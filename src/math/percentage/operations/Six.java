package math.percentage.operations;

import java.util.Scanner;

public class Six {
	
public void calculateSix() {
		
		double x; // local variables
		double y;
		double z;

		System.out.println("You chose: 5. x increased by y% is what #?");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of x:");
		x = input.nextInt();
		System.out.println("Enter the percent value of y:");
		y = input.nextInt();

		input.close();
		
		// calculation
		z=x*(1-(y/100));
		
		
		System.out.println(x+" decreased by"+ y+"% equals "+z);
	}
	
}
