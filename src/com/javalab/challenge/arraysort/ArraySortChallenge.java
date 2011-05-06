package com.javalab.challenge.arraysort;

import java.util.ArrayList;
import java.util.List;

import com.javalab.challenge.arraysort.challenge.Challenge;
import com.javalab.challenge.arraysort.challengers.Challenger;
import com.javalab.challenge.arraysort.challengers.ChallengerAdrienBrault;
import com.javalab.challenge.arraysort.challengers.ChallengerBaptisteTellier;
import com.javalab.challenge.arraysort.challengers.ChallengerCheikhHassanCisse;
import com.javalab.challenge.arraysort.challengers.ChallengerJava;
import com.javalab.challenge.arraysort.challengers.ChallengerKevinValfin;
import com.javalab.challenge.arraysort.challengers.ChallengerLoicLebain;
import com.javalab.challenge.arraysort.challengers.ChallengerLukasPiliszczuk;
import com.javalab.challenge.arraysort.challengers.ChallengerNathanelBenaim;
import com.javalab.challenge.arraysort.challengers.ChallengerValentinLaurin;
import com.javalab.challenge.arraysort.challengers.ChallengerViktorLefort;

public class ArraySortChallenge {

	public static void main(String[] args) {

		List<Challenger> challengers = new ArrayList<Challenger>();
		challengers.add(new ChallengerJava());
		challengers.add(new ChallengerLukasPiliszczuk());
//		challengers.add(new ChallengerFake());
		challengers.add(new ChallengerAdrienBrault());
		challengers.add(new ChallengerBaptisteTellier());
		challengers.add(new ChallengerCheikhHassanCisse());

		challengers.add(new ChallengerKevinValfin());
		challengers.add(new ChallengerNathanelBenaim());

		challengers.add(new ChallengerValentinLaurin());
		challengers.add(new ChallengerViktorLefort());
		challengers.add(new ChallengerLoicLebain());
		
//		challengers.add(new ChallengerNomanSyed());		
//		challengers.add(new ChallengerJacquesChan());

		int[] tabSizes = { 10000 };

		Challenge challenge = new Challenge(challengers, tabSizes, 60);
		challenge.start();
		challenge.showResults();
		challenge.showPositions();
	}
}
