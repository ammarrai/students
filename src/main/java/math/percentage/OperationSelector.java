package math.percentage;

import java.util.Scanner;

import math.percentage.operations.Five;
import math.percentage.operations.Four;
import math.percentage.operations.One;
import math.percentage.operations.Six;
import math.percentage.operations.Three;
import math.percentage.operations.Two;

public class OperationSelector {

	byte selection;

	public void selectOperation() {

		System.out.println("***********************************************");
		System.out.println("(1) What is x% of y?");
		System.out.println();
		System.out.println("(2) x is what % of y?");
		System.out.println();
		System.out.println("(3) x is y% of what #?");
		System.out.println();
		System.out.println("(4) What is the difference in % between x and y?");
		System.out.println();
		System.out.println("(5) x increased by y% is what #?");
		System.out.println();
		System.out.println("(6) x decreased by y% is what #?");
		System.out.println();
		System.out.println("PICK AN OPERATION:");

		Scanner scannerobj = new Scanner(System.in);
		selection = scannerobj.nextByte();

		switch (selection) {

		case 1: {
			One instance = new One();
			instance.calculateOne();
		}

			break;

		case 2: {
			Two instance = new Two();
			instance.calculateTwo();

		}
			break;

		case 3: {

			Three instance = new Three();
			instance.calculateThree();

		}
			break;

		case 4: {

			Four instance = new Four();
			instance.calculateFour();

		}
			break;

		case 5: {

			Five instance = new Five();
			instance.calculateFive();

		}
			break;

		case 6: {

			Six instance = new Six();
			instance.calculateSix();

		}
			break;

		default: {

			selectOperation();
			{

			}

		}
		}
	}
}