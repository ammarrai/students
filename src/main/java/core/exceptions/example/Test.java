package core.exceptions.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = null;
		int total = 0;

		try {
			reader = new BufferedReader(new FileReader("c:/temp/Numbers.txt"));
			String line = null;
			while ((line = reader.readLine()) != null);
			total += Integer.valueOf(line);
			System.out.println("Total: " + total);
		}

		// put more specific exceptions at the top...
		catch (NumberFormatException e) {
			System.out.println("Invalid value: "+e.getMessage());
		}
		
		catch(FileNotFoundException e) {
		System.out.println("Error interacting with file: " + e.getMessage());	
		}
		
		catch(IOException e) {
			System.out.println("Errorinteracting with file: " + e.getMessage());
		}
		
		
		finally {
			if (reader != null)
				reader.close();
		}
	}
}