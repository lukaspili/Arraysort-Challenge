package com.javalab.challenge.arraysort.challengers;

public class ChallengerNomanSyed implements Challenger {

	public int[] bubbleSort(int[] array) {
		int tmp;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {

				tmp = array[i + 1];
				array[i + 1] = array[i];
				array[i] = tmp;
			}
		}
		return array;
	}

	public int[] selectionSort(int[] array) {
		int i, j, min, other, tmp; // c'est mieux de les dÈclarer avant, pas
									// comme tout ‡ l'heure -__-

		for (i = 0; i < array.length - 1; i++) // on parcourt le tableau
		{
			min = array[i];
			other = i;
			for (j = 0; j <= i; j++) // on recherche le min
			{
				if (min > array[j]) {
					min = array[j];
					other = j;
				}
			}
			tmp = array[i]; // on effectue les changements
			array[i] = min;
			array[other] = tmp;
		}
		return array;
	}

	public int[] insertionSort(int[] array) {
		int i, j, x;
		for (i = 0; i < array.length - 1; i++) {
			x = array[i];
			j = i;
			while (j > 0) {
				if (array[j - 1] > x) {
					array[j] = array[j - 1];
					j = j - 1;
				}
			}
			array[j] = x;
		}
		return array;
	}

	@Override
	public String toString() {
		return "NOMAN SYED";
	}
}
