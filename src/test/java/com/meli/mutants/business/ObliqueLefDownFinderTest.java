package com.meli.mutants.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObliqueLefDownFinderTest {

	@Autowired
	private ObliqueLefDownFinder target;
	
	
	@Test
	void test() {
		target.buildAvailablePath(5, 1, 4, 6, 'A');
		target.buildAvailablePath(4, 2, 4, 6, 'T');
		target.buildAvailablePath(3, 3, 4, 6, 'C');
		
		StringBuffer[] actual = target.getAvailablePath();
		assertNotNull(actual);
		assertEquals(2, actual.length);
		assertEquals("ATC", actual[0].toString());
		assertNull(actual[1]);

	}

}


