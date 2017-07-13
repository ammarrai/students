package math.percentage.operations;

import java.util.Scanner;

public class Four {

	public void calculateFour() {
		double x; // local variables
		double y;
		double z;

		System.out.println("You chose: 4. What is the difference in percentage between x and y?");

		Scanner input = new Scanner(System.in);

		
		System.out.println("Enter the value of x:");
		x = input.nextInt();
		System.out.println("Enter the value of y");
		y = input.nextInt();

		input.close();
		
		//calculation
		z = Math.abs(x - y) / 2;
		System.out.println(z);
	}

}
