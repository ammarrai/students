package math.percentage.operations;

import java.util.Scanner;

public class One {

	public void calculateOne() {
		double x; // local variables
		double y;
		double z;

		System.out.println("You Chose: 1. What is x% of y?");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the % value:");

		x = input.nextInt();
		System.out.println("Enter the value of y");
		y = input.nextInt();

		input.close();
		
		// calculation
		x = x / 100;
		z = x * y;

		System.out.println(z);

	}

}
