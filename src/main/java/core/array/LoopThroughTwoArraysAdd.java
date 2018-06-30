package core.array;

import java.util.Arrays;

public class LoopThroughTwoArraysAdd {

	public static void main(String[] args) {

		int[] a = { 1, 3, 5, 7, 9, 11, 13,};    // 7 items.
		int[] b = { 2, 4, 6, 8, 10, 12, 14 }; 
		int[] c = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}

		System.out.println(Arrays.toString(c));           // toString method of  java.util.Arrays class used.
		
	}

}
