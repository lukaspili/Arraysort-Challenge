package com.javalab.challenge.arraysort.challengers;

import java.util.Arrays;

public class ChallengerJava implements Challenger {

	@Override
	public int[] bubbleSort(int[] array) {
		Arrays.sort(array);
		return array;
	}

	@Override
	public int[] selectionSort(int[] array) {
		Arrays.sort(array);
		return array;
	}

	@Override
	public int[] insertionSort(int[] array) {
		Arrays.sort(array);
		return array;
	}
	
	@Override
	public String toString() {
		return "JAVA CHALLENGER";
	}

}
