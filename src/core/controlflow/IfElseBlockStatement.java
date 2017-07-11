package core.controlflow;

public class IfElseBlockStatement {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int c;

		
/* IF */		
		if (a < b) {        // This is a block statement - better to use these :)
			c = a + b;                                
			System.out.println("a is less than b");
			System.out.println(c);
		} 

/* ELSE */
		else {
			System.out.println("a is not less than b - cannot continue!");
		}

		int x = 1000;
		int y = 500;
		int z;
						
		//  However! if no block is used after an if statement, only the next statement is honored
		
		if (x < y)    // false
			System.out.println("x is more than y is true");    // 
		System.out.println("This is printed regardless...");   // This is printed regardless...
		
		
		
		
	}

}
