package com.javalab.challenge.arraysort.challengers;

public class ChallengerLoicLebain implements Challenger {

	public int[] bubbleSort(int[] array) {
		int taille = array.length;
		boolean aucun_echange;
		do {
			aucun_echange = true;
			for (int i = 0; i < (taille - 1); i++) {
				if (array[i] > array[i + 1]) {
					int tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					aucun_echange = false;
				}
			}
		} while (!aucun_echange);
		return array;
	}

	public int[] selectionSort(int[] array) {
		int taille = array.length;

		for (int i = 0; i < taille; i++) {
			int min = i;
			for (int j = i + 1; j < taille; j++) {
				if (array[j] < array[min])
					min = j;
			}
			if (min != i) {
				int tmp = array[i];
				array[i] = array[min];
				array[min] = tmp;
			}
		}
		return array;
	}

	public int[] insertionSort(int[] array) {
		int taille = array.length;
		for (int i = 1; i < taille; i++) {
			int x = array[i];
			int j = i;
			while (j >= 1 && array[j - 1] > x) {
				int tmp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = tmp;
				j--;
			}
			array[j] = x;

		}
		return array;
	}

	@Override
	public String toString() {
		return "LOIC LEBAIN";
	}
}
