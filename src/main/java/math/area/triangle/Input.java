package math.area.triangle;

import java.util.Scanner;

public class Input {

	double baseinput;
	double heightinput;

	public void takeInput() {

		Scanner scannerinput = new Scanner(System.in);

		System.out.println("What is the value of the base?");
		baseinput = scannerinput.nextInt();

		System.out.println("What is the height?");
		heightinput = scannerinput.nextInt();

		Triangle triangleobject = new Triangle();
		triangleobject.findTriangleArea(baseinput, heightinput);
		
	}

}
