package com.javalab.challenge.arraysort.challengers;

public class ChallengerValentinLaurin implements Challenger {

	public int[] bubbleSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int iMin = i;
			for (int j = i + 1; j < array.length; j++)
				iMin = (array[iMin] > array[j] ? j : iMin);

			int temp = array[i];
			array[i] = array[iMin];
			array[iMin] = temp;
		}
		return array;
	}

	public int[] insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			for (int j = i - 1; j >= 0 && value < array[j]; j--) {
				array[j + 1] = array[j];
				array[j] = value;
			}
		}
		return array;
	}

	@Override
	public String toString() {
		return "VALENTIN LAURIN";
	}
}
