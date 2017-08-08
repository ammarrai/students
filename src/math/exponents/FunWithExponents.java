package math.exponents;

import java.math.BigDecimal;

public class FunWithExponents {

	public static void main(String[] args) {
		double a;
		double b;

		a = Math.pow(9, 9) / Math.pow(10, 9);
		System.out.println("a is: " + a);

		b = Math.pow(9, 10) / Math.pow(10, 10);
		System.out.println("b is: " + b);

		if (compareTo(a, b) == 1.0) {
			System.out.println("a is larger than b.");			
		}
		else {
			System.out.println("b is larger than a.");
		}
		

	}

	public static double compareTo(Number n1, Number n2) {
		BigDecimal b1 = new BigDecimal(n1.doubleValue());
		BigDecimal b2 = new BigDecimal(n2.doubleValue());
		return b1.compareTo(b2);
	}

}
