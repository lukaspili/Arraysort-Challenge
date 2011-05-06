package com.javalab.challenge.arraysort.challengers;


/**
 * Méthodes de tri par Lukasz Piliszczuk pour le concours
 * 
 * @author lukasz.piliszczuk AT zenika.com
 * 
 */
public class ChallengerLukasPiliszczuk implements Challenger {

	/**
	 * Tri par la méthode bubble. Ne jamais trier toute la chaine à chaque
	 * passage mais uniquement les parties nécessaires à trier
	 * 
	 * beginIndex represente la position dans la tableau ou doit débuter le tri
	 * et endIndex la position ou le tri s'arrête. Ainsi on ne parcout la chaine
	 * en totalité qu'une seule fois
	 * 
	 * @param array le tableau à trier
	 * @return le tableau trié
	 */
	public int[] bubbleSort(int array[]) {

		// au début le tri commence sur la 1er position de la chaine
		int beginIndex = 0;

		// et se termine à la dernière
		int endIndex = array.length - 1;

		// tant que la chaine n'a pas été totalement triée
		// donc cad tant la position de début n'est pas égale à la position de
		// fin
		while (beginIndex < endIndex) {

			// récupérer les valeurs courantes de début et fin
			int currentBeginIndex = beginIndex;
			int currentEndIndex = endIndex;

			// reset la position de début à la dernière position de la chaine +
			// 1 car on veut pouvoir traiter le dernier élément également
			beginIndex = array.length;

			// tant que la valeur courante du début est différente de la valeur
			// courante de fin
			for (int i = currentBeginIndex; i < currentEndIndex; i++) {

				// si la valeur courante du tableau est supérieure à la valeur
				// suivante alors il faut inverser les 2 valeurs
				if (array[i] > array[i + 1]) {

					// inverser les 2 valeurs
					int current = array[i];
					array[i] = array[i + 1];
					array[i + 1] = current;

					// si la position i dans laquelle nous sommes dans la chaine
					// est inférieur à la position de début
					if (i < beginIndex) {

						// alors on place la position de début à la position
						// juste avant la notre parce que notre position vient
						// d'être triée
						beginIndex = i - 1;

						// si notre position était la 1er de la chaine alors la
						// position de début sera la début de la chaine
						if (beginIndex < 0) {
							beginIndex = 0;
						}

					}

					// sinon si la position actuelle qui vient d'être triée est
					// supérieure à la position de fin
					else if (i > endIndex) {

						// alors on déplace la position de fin à la position
						// suivante après la notre
						endIndex = i + 1;
					}
				}
			}
		}

		return array;
	}

	public int[] selectionSort(int array[]) {

		// parcourir tout le tableau à trier
		for (int i = 0; i < array.length - 1; i++) {

			// va contenir l'index de la plus petite valeur
			// par défaut c'est l'index de la position courante
			int lowestValueIndex = i;

			// parcourir le reste du tableau à trier à partir de la position
			// juste après la position courante
			for (int j = i + 1; j < array.length; j++) {

				// si l'index qui contient la plus petite valeur du tableau est
				// supérieur à la valeur courante de la nouvelle boucle
				if (array[lowestValueIndex] > array[j]) {

					// alors la plus petite valeur sera cette nouvelle valeur
					lowestValueIndex = j;
				}
			}

			// si la position de la plus petite valeur n'est pas égal à la
			// position courante dans le tableau
			if (lowestValueIndex != i) {

				// alors échanger les valeurs
				int current = array[i];
				array[i] = array[lowestValueIndex];
				array[lowestValueIndex] = current;
			}
		}

		return array;
	}

	public int[] insertionSort(int array[]) {

		// parcourir le tableau à trier
		for (int i = 1; i < array.length; i++) {

			// stocker la valeur courante du tableau
			int current = array[i];

			// position à partir de la position courante
			int fromCurrent = i;

			// parcourir le reste du tableau à partir de la position courante
			// jusqu'au début du tableau tant que la valeur à gauche de la
			// valeur courante est inférieur
			while (fromCurrent > 0 && array[fromCurrent - 1] >= current) {

				// remplacer donc la valeur courante par la valeur à gauche de
				// la valeur courante
				array[fromCurrent] = array[fromCurrent - 1];

				// et déplacer la position à gauche
				fromCurrent--;
			}

			// une fois sorti de la boucle on sait que fromCurrent contient la
			// position triée de la valeur courante
			array[fromCurrent] = current;
		}

		return array;
	}
	
	@Override
	public String toString() {
		return "LUKASZ PILISZCZUK";
	}
}
