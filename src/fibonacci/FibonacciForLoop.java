package fibonacci;

public class FibonacciForLoop {

	static int x = 0;
	static int y = 1;
	static int z = 1;
	static int UpTill = 5;    //specify how far do you want your array to be?

	public static void main(String[] args) {

		System.out.print(x+" ");

		for (int i = 0; i < UpTill; i++) {
			
			System.out.print(z+" ");
			z=x+y;
			x = y;
			y = z;
			

		}

	}

}
