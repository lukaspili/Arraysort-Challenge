package com.javalab.challenge.arraysort.challenge;

import java.util.ArrayList;
import java.util.List;

import com.javalab.challenge.arraysort.challengers.Challenger;

public class ChallengerResult implements Comparable<ChallengerResult> {

	private Challenger challenger;
	private List<UnitResult> results;
	private Double total;

	public ChallengerResult(Challenger challenger) {
		this.challenger = challenger;
		this.results = new ArrayList<UnitResult>();

		total = 0.0;
	}

	public void addResult(UnitResult result) {
		results.add(result);
		total += result.getTotal();
	}

	public Challenger getChallenger() {
		return challenger;
	}

	public void setChallenger(Challenger challenger) {
		this.challenger = challenger;
	}

	public List<UnitResult> getResults() {
		return results;
	}

	public void setResults(List<UnitResult> results) {
		this.results = results;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public int compareTo(ChallengerResult o) {
		return total.compareTo(o.getTotal());
	}

}
