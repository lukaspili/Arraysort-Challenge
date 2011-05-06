package com.javalab.challenge.arraysort.challenge;

import com.javalab.challenge.arraysort.challengers.Challenger;

public class UnitResult {

	private Integer sortSize;
	private Double bubbleTime;
	private Double insertionTime;
	private Double selectionTime;

	public UnitResult(Challenger challenger, Integer sortSize) {
		this.sortSize = sortSize;
	}

	public Double getTotal() {
		return bubbleTime + insertionTime + selectionTime;
	}

	public Integer getSortSize() {
		return sortSize;
	}

	public void setSortSize(Integer sortSize) {
		this.sortSize = sortSize;
	}

	public Double getBubbleTime() {
		return bubbleTime;
	}

	public void setBubbleTime(Double bubbleTime) {
		this.bubbleTime = bubbleTime;
	}

	public Double getInsertionTime() {
		return insertionTime;
	}

	public void setInsertionTime(Double insertionTime) {
		this.insertionTime = insertionTime;
	}

	public Double getSelectionTime() {
		return selectionTime;
	}

	public void setSelectionTime(Double selectionTime) {
		this.selectionTime = selectionTime;
	}
}
