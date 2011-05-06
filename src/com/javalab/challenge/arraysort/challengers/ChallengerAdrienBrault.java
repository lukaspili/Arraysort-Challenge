package com.javalab.challenge.arraysort.challengers;

public class ChallengerAdrienBrault implements Challenger {

	public int[] bubbleSort(int[] array) {

		boolean loopHasChangedArray;
		
		for (int i=array.length-1; i>0; i--) {
			loopHasChangedArray = false;
			
			for (int j=0; j<i; j++) {
				if (array[j] > array[j+1]) {
					arraySwapIndexes(array, j, j+1);
					loopHasChangedArray = true;
				}
			}
			
			if (!loopHasChangedArray) {
				break;
			}
		}

		return array;
	}

	public int[] selectionSort(int[] array) {

		for (int i=0; i<array.length; i++) {
			int minValueIndex = i;
			int minValue = array[i];
			
			for (int j=i; j<array.length; j++) {
				if (array[j] < minValue) {
					minValueIndex = j;
					minValue = array[j];
				}
			}
			
			arraySwapIndexes(array, i, minValueIndex);
		}

		return array;
	}

	public int[] insertionSort(int[] array) {

		for (int i=1; i<array.length; i++) {
			for (int j=0; j<i; j++) {
				if (array[i] < array[j]) {
					int buffer = array[i];
					for (int k=i; k>j; k--) {
						array[k] = array[k-1];
					}
					array[j] = buffer;
					
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
