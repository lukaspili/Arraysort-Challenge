package com.javalab.challenge.arraysort.challengers;

public class ChallengerCheikhHassanCisse implements Challenger {

	public int[] bubbleSort(int[] array) {
		int temp;

		for (int i = 1; i < 10; i++) {
			if (array[i - 1] > array[i]) {
				temp = array[i];
				array[i] = array[i - 1];
				array[i - 1] = temp;
				i = 0;
			}
		}
		return array;
	}

	public int[] selectionSort(int[] array) {

		for (int j = 0; j < 10; j++) {
			int min_num = 100;
			int a = 0, temp = 0;

			for (int i = j; i < 10; i++) {
				if (array[i] < min_num) {
					min_num = array[i];
					a = i;
				}
			}
			temp = array[j];
			array[j] = min_num;
			array[a] = temp;
		}
		return array;
	}

	public int[] insertionSort(int[] array) {
		int temp;
		for (int j = 1; j < 10; j++)
			for (int k = 0; k < j; k++)
				if (array[j] < array[k]) {
					temp = array[k];
					array[k] = array[j];
					for (int i = 0; i < j - 1 - k; i++)
						array[j - i] = array[j - i - 1];

					array[k + 1] = temp;
				}
		return array;
	}
	
	@Override
	public String toString() {
		return "CHEIKH HASSAN CISSE";
	}
}
