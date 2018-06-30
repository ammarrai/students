package math.area.square;

import java.util.Scanner;

final class Main {

	static int number;

	public static void main(String[] args) {

				
		System.out.println("Enter the length of one side of the square: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();

		
		Square instance = new Square();
		instance.run(number);
		

	}
}