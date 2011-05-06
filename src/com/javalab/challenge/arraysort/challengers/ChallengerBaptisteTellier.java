package com.javalab.challenge.arraysort.challengers;

public class ChallengerBaptisteTellier implements Challenger {

	public int[] bubbleSort(int[] array) {
		int n = array.length;
		boolean doMore = true;
		while (doMore) {
			n--;
			doMore = false; // assume this is our last pass over the array
			for (int i = 0; i < n; i++) {
				if (array[i] > array[i + 1]) {
					// exchange elements
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					doMore = true; // after an exchange, must look again
				}
			}
		}
		return array;
	}

	public int[] selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i; // Index of smallest remaining value.
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j; // Remember index of new minimum
				}
			}
			if (minIndex != i) {
				// ... Exchange current element with smallest remaining.
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
		return array;
	}

	public int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i;
			int B = array[i];
			while ((j > 0) && (array[j - 1] > B)) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = B;
		}
		return array;
	}

	@Override
	public String toString() {
		return "BAPTISTE TELLIER";
	}
}
