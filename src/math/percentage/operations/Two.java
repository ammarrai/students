package math.percentage.operations;

import java.util.Scanner;

public class Two {

	public void calculateTwo() {
		double x; // local variables
		double y;
		double z;

		System.out.println("You Chose: 2. x is what % of y?");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of x:");

		x = input.nextInt();
		System.out.println("Enter the value of y");
		y = input.nextInt();

		input.close();
		
		//calculation
		z = (x / y) * 100;

		System.out.println(z);
	}
}
