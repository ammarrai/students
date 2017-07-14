package core.methods.returnstatement;

public class Processor {

	// method declaration

	void processInput(String userInput) {

		if (userInput.equalsIgnoreCase("Tokyo")) {                        //when comparing Objects, use equals method.
			System.out.println("That's right! We are going to Tokyo!!!");
		} else {
			System.out.println("uh no...");
			return;
		}

	}
}
