package com.meli.mutants.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.meli.mutants.exceptions.NoMutantFoundException;
import com.meli.mutants.service.impl.MutantService;
@SpringBootTest
class MutantServicTest {

	@Autowired
	private MutantService target;
	
	@Test
	void test() {

		String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
		String actual = target.isMutant(dna);
		assertNotNull(actual);		
	}
	
	@Test
	void testException() {

		String[] dna = {"ATGCGA","CAGTGC","TTATTT","AGACGG","GCGTCA","TCACTG"};
		assertThrows(NoMutantFoundException.class, () -> target.isMutant(dna));
		
	}

}
