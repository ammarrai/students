package core.methods.returnstatement;

import java.util.Scanner;

public class InputTaker {

	String userInput;

	// method declaration
	void takeInput() {

		// scanner input
		Scanner scannerObject = new Scanner(System.in);
		userInput = scannerObject.next();
		scannerObject.close();

		// call processorInput method and pass userInput
		Processor processor = new Processor();
		processor.processInput(userInput);

		System.out.println("Finished with Processor class and returned back to InputTaker class...");
		
	}


}
