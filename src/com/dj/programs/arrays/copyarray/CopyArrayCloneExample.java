package com.dj.programs.arrays.copyarray;

import java.util.Arrays;

public class CopyArrayCloneExample {

	public static void main(String[] args) {
		// creating an array

		int[] originalArray = { 1, 2, 3, 4, 5 };

		// cloning array using clone() method
		int[] copiedArray = originalArray.clone();
		

		// printing the arrays
		System.out.println("Original Array : " + Arrays.toString(originalArray));

		System.out.println("Copied Array : " + Arrays.toString(copiedArray));

		// changing the values in the original array

		originalArray[0] = 100;
		originalArray[4] = 500;

		// printing both arrays after modification

		System.out.println("\nPrinting values after original array modifications");
		System.out.println("Modified Original Array : " + Arrays.toString(originalArray));

		System.out.println("Copied Array : " + Arrays.toString(copiedArray));

	}

}
