package core.scanner;

import java.util.Scanner;

public class SystemIn {

	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);    //Create a Scanner object
		System.out.println("Enter a number:");
		int aNumber = scannerObject.nextInt();             //Call nextInt method of the scanner object and save to a variable
		scannerObject.close();
		
		System.out.println("You entered "+ aNumber);      //print that variable
		
		

	}

}
