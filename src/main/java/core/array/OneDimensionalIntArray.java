package core.array;

import java.util.Arrays;

public class OneDimensionalIntArray {

	public static void main(String[] args) {
		int[] numbers = { 50, 60, 33, 11, 35, 636, 55, 335, 6346, 1, 3 }; // initialize array element
		
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);        //Here we sort the numbers in the numbers array in ascending order
		
		System.out.println(Arrays.toString(numbers)); //sorted array is printed.
		
		System.out.println(numbers[numbers.length -1]);  // print the value of the last element in the array.
		
		System.out.println(numbers[0]);  // print the value of the first element in the array.
		
		for (int a : numbers) {
			System.out.println(a);
		}
		
	}
}
