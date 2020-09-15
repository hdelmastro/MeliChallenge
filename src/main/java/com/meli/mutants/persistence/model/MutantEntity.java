package com.meli.mutants.persistence.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "Mutants")
public class MutantEntity {
	
	@Id
	private String Id;
	
	private String[] dna;

	public MutantEntity(String[] dna) {
		super();
		this.dna = dna;
	}

	public String getId() {
		return Id;
	}

	public String[] getDna() {
		return dna;
	}
	
	

}
