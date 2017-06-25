package core.streams;
import java.util.Scanner;

public class InputStream {
Scanner scanner = new Scanner(System.in);
	
	InputStream input = scanner;
			int intVal;
	
	while ((intVal = input.read()) >=0) {
	 byte byteVal = (byte)intVal;
	 
	 //do something with byteVal
}
