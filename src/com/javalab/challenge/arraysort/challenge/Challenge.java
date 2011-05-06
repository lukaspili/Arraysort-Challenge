package com.javalab.challenge.arraysort.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.javalab.challenge.arraysort.challengers.Challenger;

public class Challenge {

	private List<Challenger> challengers;
	private List<int[]> randomTabs;
	private int[] tabSizes;
	private int testNumbers;
	private List<ChallengerResult> results;

	public Challenge(List<Challenger> challengers, int[] tabSizes) {
		this.challengers = challengers;
		this.tabSizes = tabSizes;

		testNumbers = 50;
		results = new ArrayList<ChallengerResult>();
	}

	public Challenge(List<Challenger> challengers, int[] tabSizes,
			int testNumbers) {
		this(challengers, tabSizes);
		this.testNumbers = testNumbers;
	}

	public void start() {
		init();
		runSorts();
	}

	public void showResults() {

		System.out.println("\n\nRESULTATS DU CHALLENGE :\n");

		for (ChallengerResult result : results) {

			System.out.println("CHALLENGER : " + result.getChallenger());
			System.out.println("TOTAL : " + result.getTotal());
			System.out.println();

			for (UnitResult unitResult : result.getResults()) {

				System.out.println("TABLEAU DE TAILLE : "
						+ unitResult.getSortSize());
				System.out.println("\tBUBBLE : " + unitResult.getBubbleTime());
				System.out.println("\tSELECTION : "
						+ unitResult.getSelectionTime());
				System.out.println("\tINSERTION : "
						+ unitResult.getInsertionTime());
				System.out.println();

				System.out.println("\tTOTAL : " + unitResult.getTotal());
				System.out.println();

			}

			System.out.println("\n");
		}
	}

	public void showPositions() {

		Collections.sort(results);

		System.out.println("\n\nCLASSEMENT :\n");

		int position = 1;
		for (ChallengerResult result : results) {
			System.out.println(position++ + " : " + result.getChallenger());
		}
	}

	/**
	 * Run the sorts
	 */
	protected void runSorts() {

		System.out.println("\nDEMARRAGE DES TEST");

		for (Challenger challenger : challengers) {

			System.out.println("CHALLENGER : " + challenger);

			ChallengerResult challengerResult = new ChallengerResult(challenger);

			for (int[] randomTab : randomTabs) {
				UnitResult result = runSortForChallenger(randomTab, challenger);
				challengerResult.addResult(result);
			}

			results.add(challengerResult);
		}
	}

	protected UnitResult runSortForChallenger(int[] randomTab,
			Challenger challenger) {

		List<int[]> bubbleSorts = new ArrayList<int[]>();
		List<int[]> insertionSorts = new ArrayList<int[]>();
		List<int[]> selectionSorts = new ArrayList<int[]>();

		for (int i = 0; i < testNumbers; i++) {
			bubbleSorts.add(randomTab.clone());
			insertionSorts.add(randomTab.clone());
			selectionSorts.add(randomTab.clone());
		}

		long startTime;
		double resultTime;
		UnitResult result = new UnitResult(challenger, randomTab.length);

		// bubble sort
		startTime = System.currentTimeMillis();
		for (int[] arrayToSort : bubbleSorts) {
			challenger.bubbleSort(arrayToSort);
		}
		resultTime = (System.currentTimeMillis() - startTime) * 1000.0
				/ Double.valueOf(testNumbers);
		result.setBubbleTime(resultTime);

		// selection sort
		startTime = System.currentTimeMillis();
		for (int[] arrayToSort : selectionSorts) {
			challenger.selectionSort(arrayToSort);
		}
		resultTime = (System.currentTimeMillis() - startTime) * 1000.0
				/ Double.valueOf(testNumbers);
		result.setSelectionTime(resultTime);

		// insertion sort
		startTime = System.currentTimeMillis();
		for (int[] arrayToSort : insertionSorts) {
			challenger.insertionSort(arrayToSort);
		}
		resultTime = (System.currentTimeMillis() - startTime) * 1000.0
				/ Double.valueOf(testNumbers);
		result.setInsertionTime(resultTime);

		return result;
	}

	/**
	 * Before start challenge
	 */
	protected void init() {
		initRandomTabs();
		validateChallengers();
	}

	protected void initRandomTabs() {

		randomTabs = new ArrayList<int[]>();

		for (int size : tabSizes) {
			randomTabs.add(createRandomTab(size));
		}
	}

	protected int[] createRandomTab(int size) {

		// create new integer tab
		int randomTab[] = new int[size];

		// create the generator object
		Random randomGenerator = new Random();

		for (int i = 0; i < randomTab.length; i++) {
			randomTab[i] = randomGenerator.nextInt(1000000);
		}

		return randomTab;
	}

	protected void validateChallengers() {

		List<int[]> validSortedTabs = deepCopyList(randomTabs);

		for (int[] tabToSort : validSortedTabs) {
			Arrays.sort(tabToSort);
		}

		List<Challenger> validChallengers = new ArrayList<Challenger>();

		for (Challenger challenger : challengers) {

			System.out.println("VALIDATE CHALLENGER : " + challenger);

			System.out.println("\tBEGIN BUUBLE TEST");
			List<int[]> fromBubble = getArraysFromChallengerByBubble(challenger);
			System.out.println("\tEND BUUBLE TEST");

			System.out.println("\tBEGIN SELECTION TEST");
			List<int[]> fromSelection = getArraysFromChallengerBySelection(challenger);
			System.out.println("\tEND SELECTION TEST");

			System.out.println("\tBEGIN INSERTION TEST");
			List<int[]> fromInsertion = getArraysFromChallengerByInsertion(challenger);
			System.out.println("\tEND INSERTION TEST");

			Boolean bubbleCorrect = compareLists(validSortedTabs, fromBubble);
			Boolean selectionCorrect = compareLists(validSortedTabs,
					fromSelection);
			Boolean insertionCorrect = compareLists(validSortedTabs,
					fromInsertion);

			// not valid sort
			if (!(bubbleCorrect && selectionCorrect && insertionCorrect)) {
				System.out.println("INVALID CHALLENGER : " + challenger);
			}

			else {
				System.out.println("VALID CHALLENGER : " + challenger);
				validChallengers.add(challenger);
			}
		}

		challengers = validChallengers;
	}

	protected List<int[]> getArraysFromChallengerByBubble(Challenger challenger) {

		List<int[]> sortedTabs = deepCopyList(randomTabs);

		for (int[] tabToSort : sortedTabs) {
			challenger.bubbleSort(tabToSort);
		}

		return sortedTabs;
	}

	protected List<int[]> getArraysFromChallengerBySelection(
			Challenger challenger) {

		List<int[]> sortedTabs = deepCopyList(randomTabs);

		for (int[] tabToSort : sortedTabs) {
			challenger.selectionSort(tabToSort);
		}

		return sortedTabs;
	}

	protected List<int[]> getArraysFromChallengerByInsertion(
			Challenger challenger) {

		List<int[]> sortedTabs = deepCopyList(randomTabs);

		for (int[] tabToSort : sortedTabs) {
			challenger.insertionSort(tabToSort);
		}

		return sortedTabs;
	}

	protected List<int[]> deepCopyList(List<int[]> list) {

		List<int[]> copy = new ArrayList<int[]>(list.size());

		for (int[] array : list) {
			copy.add(array.clone());
		}

		return copy;
	}

	protected Boolean compareLists(List<int[]> list1, List<int[]> list2) {

		Boolean result = true;

		for (int i = 0; i < list1.size(); i++) {

			int[] array1 = list1.get(i);
			int[] array2 = list2.get(i);

			result = Arrays.equals(array1, array2);
		}

		return result;
	}
}
