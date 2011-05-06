package com.javalab.challenge.arraysort.challengers;

public class ChallengerNathanelBenaim implements Challenger {

	public int[] bubbleSort(int array[]) {

		int right_border = array.length - 1;

		do {
			int last_exchange = 0;

			for (int i = 0; i < right_border; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

					last_exchange = i;
				}
			}

			right_border = last_exchange;
		} while (right_border > 0);

		return array;
	}

	public int[] selectionSort(int array[]) {
		int i, j, minIndex, tmp;
		int n = array.length;
		for (i = 0; i < n - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < n; j++)
				if (array[j] < array[minIndex])
					minIndex = j;
			if (minIndex != i) {
				tmp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = tmp;
			}
		}
		return array;
	}

	public int[] insertionSort(int array[]) {
		int i, j, newValue;
		for (i = 1; i < array.length; i++) {
			newValue = array[i];
			j = i;
			while (j > 0 && array[j - 1] > newValue) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = newValue;
		}
		return array;
	}
	
	@Override
	public String toString() {
		return "NATHANEL BENAIM";
	}
}
