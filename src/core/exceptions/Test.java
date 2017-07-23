package core.exceptions;

public class Test {

	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		
		
		try {
		int result = i / (j - 2);
		System.out.println(result);
		} catch (Exception e) {
			
		System.out.println(
		"Error: " + e.getMessage());
		System.out.println();
		e.printStackTrace();
		}
		
	}

}
