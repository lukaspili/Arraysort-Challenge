package com.javalab.challenge.arraysort.challengers;

public class ChallengerViktorLefort implements Challenger {

	public int[] bubbleSort(int array[]) {
		boolean sorted = false;
		do {
			sorted = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					sorted = true;
				}
			}
		} while (sorted);
		return array;
	}

	public int[] selectionSort(int array[]) {
		int posMin;
		for (int posIndex = 0; posIndex < array.length - 1; posIndex++) {
			posMin = posIndex;
			for (int i = posIndex + 1; i < array.length - 1; i++) {
				if (array[i] < array[posMin])
					posMin = i;
			}
			if (posIndex != posMin) {
				int tmp = array[posIndex];
				array[posIndex] = array[posMin];
				array[posMin] = tmp;
			}
		}
		return array;
	}

	public int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			int toSort = array[i];
			int j = i - 1;
			boolean elementSorted = false;
			do {
				if (array[j] > toSort) {
					array[j + 1] = array[j];
					j = j - 1;
					if (j < 0)
						elementSorted = true;
				} else
					elementSorted = true;
			} while (!elementSorted);
			array[j + 1] = toSort;
		}
		return array;
	}
	
	@Override
	public String toString() {
		return "VIKTOR LEFORT";
	}
}
