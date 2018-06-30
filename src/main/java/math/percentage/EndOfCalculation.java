package math.percentage;

import java.util.Scanner;

public class EndOfCalculation {

	public void endOfCalculation() {
		
		byte finalWish;

		System.out.println();
		System.out.println("enter 1 to start over, 2 to exit");

		Scanner input = new Scanner(System.in);
		finalWish =  input.nextByte();
		

		switch (finalWish) {
		case 1: {
			OperationSelector selector = new OperationSelector();
			selector.selectOperation();
		}
		case 2: {
			System.out.println("Bye!");
			System.exit(0); // exit success
		}

		}

	}
}
