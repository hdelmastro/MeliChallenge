package com.meli.mutants.model;

import java.io.Serializable;

public class Stats implements Serializable {

	private Integer countMutantDna;
	private Integer countHumanDna;
	private Double ratio;
	
	public Integer getCountMutantDna() {
		return countMutantDna;
	}
	public void setCountMutantDna(Integer countMutantDna) {
		this.countMutantDna = countMutantDna;
	}
	public Integer getCountHumanDna() {
		return countHumanDna;
	}
	public void setCountHumanDna(Integer countHumanDna) {
		this.countHumanDna = countHumanDna;
	}
	public Double getRatio() {
		return ratio;
	}
	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
	
	
}
