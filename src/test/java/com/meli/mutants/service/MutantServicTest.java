package com.meli.mutants.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.meli.mutants.exceptions.NoMutantFoundException;
@SpringBootTest
class MutantServicTest {

	@Autowired
	private MutantService target;
	
	@Test
	void test() {

		String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
		Boolean actual = target.isMutant(dna);
		assertNotNull(actual);
		assertTrue(actual);		
	}
	
	@Test
	void testException() {

		String[] dna = {"ATGCGA","CAGTGC","TTATTT","AGACGG","GCGTCA","TCACTG"};
		assertThrows(NoMutantFoundException.class, () -> target.isMutant(dna));
		
	}

}
