package core.controlflow;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String month = input.nextLine();

		switch (month) {

		case "january":
			System.out.println("People are returning from Winter break...");
			break;

		case "february":
			System.out.println("Black History month!");
			break;

		case "march":
			System.out.println("Spring is around the corner!");
			break;
			
		case "april":
			System.out.println("We might get more rain this month...");
			break;
			
		default:
			System.out.println("Invalid input...");

		}

	}

}
