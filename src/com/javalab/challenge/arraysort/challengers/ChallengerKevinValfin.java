package com.javalab.challenge.arraysort.challengers;

public class ChallengerKevinValfin implements Challenger {

	public int[] bubbleSort(int[] array) {
		boolean change = true;
		int j = 0;
		int tmp;
		while (change) {
			change = false;
			j++;
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					change = true;
				}
			}
		}
		return array;
	}

	public int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

	public int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			int M = i;
			int N = array[i];
			while ((M > 0) && (array[M - 1] > N)) {
				array[M] = array[M - 1];
				M--;
			}
			array[M] = N;
		}
		return null;
	}

	@Override
	public String toString() {
		return "KEVIN VALFIN";
	}
	
}
