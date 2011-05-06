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
			int iValue = array[i];
			for (int j=0; j<i; j++) {
				if (iValue < array[j]) {
					arrayShift(array, j, i);
					
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
	
	static void arrayShift(int[]array, int index1, int index2) {
		int buffer = array[index2];
		for (int k=index2; k>index1; k--) {
			array[k] = array[k-1];
		}
		array[index1] = buffer;
	}
	
	@Override
	public String toString() {
		return "ADRIEN BRAULT";
	}
}
