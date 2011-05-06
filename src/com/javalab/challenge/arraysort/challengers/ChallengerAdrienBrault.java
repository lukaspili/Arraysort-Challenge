package com.javalab.challenge.arraysort.challengers;

public class ChallengerAdrienBrault implements Challenger {

	public int[] bubbleSort(int[] array) {

		boolean loopHasChangedArray;

		do {
			loopHasChangedArray = false;

			for (int i = 0; i < (array.length - 1); i++) {
				if (array[i] > array[i + 1]) {
					arraySwapIndexes(array, i, i + 1);

					loopHasChangedArray = true;
				}
			}
		} while (loopHasChangedArray);

		return array;
	}

	public int[] selectionSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int minValueIndex = i;

			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minValueIndex]) {
					minValueIndex = j;
				}
			}

			arraySwapIndexes(array, i, minValueIndex);
		}

		return array;
	}

	public int[] insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] < array[j]) {
					for (int k = i; k > j; k--) {
						arraySwapIndexes(array, k, k - 1);
					}

					break;
				}
			}
		}

		return array;
	}

	public void arraySwapIndexes(int[] array, int index1, int index2) {
		int buffer = array[index1];
		array[index1] = array[index2];
		array[index2] = buffer;
	}
	
	@Override
	public String toString() {
		return "ADRIEN BRAULT";
	}
}
