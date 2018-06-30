package core.array;

public class SumUpValuesInAnArray {

	public static void main(String[] args) {

		short[] values = { 50, 70, 60, 20 };
		short total = 0;

		for (int i = 0; i < values.length; i++) {
			total += values[i];

		}

		System.out.println(total);
	}

}
