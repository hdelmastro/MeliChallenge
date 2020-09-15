package com.meli.mutants.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VerticalFinderTest {

	@Autowired
	private VerticalFinder target;
	
	
	@Test
	void test() {
		target.buildAvailablePath(0, 0, 4, 6, 'A');
		target.buildAvailablePath(0, 1, 4, 6, 'T');
		target.buildAvailablePath(0, 2, 4, 6, 'C');
		
		StringBuffer[] actual = target.getAvailablePath();
		assertNotNull(actual);
		assertEquals(6, actual.length);
		assertEquals("ATC", actual[0].toString());
		assertNull(actual[1]);
		assertNull(actual[2]);
		assertNull(actual[3]);
	}
	

}
