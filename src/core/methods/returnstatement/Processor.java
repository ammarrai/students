package core.methods.returnstatement;

public class Processor {

	// method declaration

	void processInput(String userInput) {

		if (userInput.equals("Tokyo")) {
			System.out.println("That's right! We are going to Tokyo!!!");
		} else {
			return;
		}

	}
}
