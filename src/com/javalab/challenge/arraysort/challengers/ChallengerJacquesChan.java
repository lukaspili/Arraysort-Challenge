package com.javalab.challenge.arraysort.challengers;

public class ChallengerJacquesChan implements Challenger {

	// ------------------------------------- //
	// StaticStatic : bubbleSort //
	// ------------------------------------ //
	public int[] bubbleSort(int[] array) {

		// On calcule la taille du tableau
		int n = array.length;

		// On rÈalise un boucle tant que n < 1
		do {
			int newn = 0;
			for (int i = 0; i < n - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					newn = i++;
				}
			}
			n = newn;
		} while (n > 1);

		return array;
	}

	// ------------------------------------- //
	// Static Int : SelectionSort //
	// ------------------------------------ //
	public int[] selectionSort(int[] array) {
		int i, j;
		int min, temp, al;

		al = array.length - 1;

		for (i = 0; i < al; i++) {
			min = i;
			for (j = i + 1; j < al; j++) {
				if (array[j] < array[min])
					min = j;
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}

		return array;
	}

	// ------------------------------------- //
	// StaticStatic : InsertionSort //
	// ------------------------------------ //
	public int[] insertionSort(int[] array) {

		int i, jm, index, al;

		al = array.length;

		// On parcour le tableau (array)
		for (i = 1; i < al; i++) {
			index = array[i];
			jm = array[i - 1];

			while ((i > 0) && (jm > index)) {
				array[i] = array[i - 1];
				i--;
			}
			array[i] = index;
		}
		return array;
	}

	@Override
	public String toString() {
		return "JACQUES CHAN";
	}
}
