package scanner;

import java.util.Scanner;

public class SystemIn {

	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter a number:");
		int aNumber = scannerObject.nextInt();
		scannerObject.close();
		
		System.out.println("You entered "+ aNumber);
		
		

	}

}
