package com.meli.mutants;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.meli.mutants.service.impl.MutantService;

@SpringBootTest
class MutantServiceOldTest {


	@Autowired
	private MutantService target;
	
	/*@Test
	void testIsMutant() {
		
		String[] adn = {"ATGCGA",
						"CAGTGC", 
						"TTATGT", 
						"AGAAGG",
						"CCCCTA", 
						"TCACTG" };
		Boolean value = target.isMutant(adn , 4);
		assertEquals(true, value);
		//fail("Not yet implemented");
	}*/
	
	@Test
	void testIsMutantA() {
		
		String[] adn = {"AAAAGT",
						"AATAAC", 
						"ATCGCT", 
						"AGTAAC",
						"CCTCTC", 
						"TCATTG" };
		String value = target.isMutant(adn );
		assertNotNull(value);
		//assertEquals(true, value);
		//fail("Not yet implemented");
	}
	
	/*@Test
	void testIsMutantB() {
		
		String[] adn = {"ATGCGA","AAGTGC", "ATATGT", "AAAAGG","CCCCTA", "TCACTG" };
		Boolean value = target.isMutant(adn , 4);
		assertEquals(true, value);
		//fail("Not yet implemented");
	}
	*/
/*	@Test
	void testIsMutantC() {
		
		String[] adn = {"ATGCGA","AAGTGC", "ATATGT", "AGAAGG","CCCCTA", "TCACTG" };
		Boolean value = target.isMutant(adn , 4);
		
		//fail("Not yet implemented");
	}*/

}
