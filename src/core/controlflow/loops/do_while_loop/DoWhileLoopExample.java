package core.loops.do_while_loop;

public class DoWhileLoopExample {

	public static void main(String[] args) {

		int a = 20;

		do {           // The do portion will happen regardless of the while condition at the bottom
			System.out.println("This statement will be printed regardless of the condition being met or not.");
			System.out.println(a);
			a++;
		} while (a < 10);

	}

}
