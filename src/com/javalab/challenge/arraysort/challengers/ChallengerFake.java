package com.javalab.challenge.arraysort.challengers;

public class ChallengerFake implements Challenger {

	@Override
	public int[] bubbleSort(int[] array) {
		return array;
	}

	@Override
	public int[] selectionSort(int[] array) {
		return array;
	}

	@Override
	public int[] insertionSort(int[] array) {
		return array;
	}

	@Override
	public String toString() {
		return "FAKE";
	}
}
