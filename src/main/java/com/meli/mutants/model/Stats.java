package com.meli.mutants.model;

import java.io.Serializable;

public class Stats implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long countMutantDna;
	private Long countHumanDna;
	private Double ratio;
	
	public Long getCountMutantDna() {
		return countMutantDna;
	}
	public void setCountMutantDna(Long countMutantDna) {
		this.countMutantDna = countMutantDna;
	}
	public Long getCountHumanDna() {
		return countHumanDna;
	}
	public void setCountHumanDna(Long countHumanDna) {
		this.countHumanDna = countHumanDna;
	}
	public Double getRatio() {
		return ratio;
	}
	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
	
	
}
