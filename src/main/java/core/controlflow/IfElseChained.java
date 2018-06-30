package core.controlflow;

public class IfElseChained {

	public static void main (String[]args){
		int x = 0;
		
		
		if (x == 1)
			System.out.println("x is 1");
		else if (x==2)                                               // true statement
			System.out.println("x is 2");
		else if (x==3)                                               // true statement
			System.out.println("x is 3");
		else {                                                       // false statement
			System.out.println("x is none of these...");
		}
	}

}
