package com.meli.mutants.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObliqueRightUpFinderTest {

	@Autowired
	private ObliqueRightUpFinder target;
	
	
	@Test
	void test() {
		target.buildAvailablePath(0, 0, 4, 6, 'A');
		target.buildAvailablePath(1, 1, 4, 6, 'T');
		target.buildAvailablePath(2, 2, 4, 6, 'C');
		target.buildAvailablePath(3, 3, 4, 6, 'G');
		target.buildAvailablePath(4, 4, 4, 6, 'C');
		target.buildAvailablePath(5, 5, 4, 6, 'G');
		
		StringBuffer[] actual = target.getAvailablePath();
		assertNotNull(actual);
		assertEquals(3, actual.length);
		assertEquals("ATCGCG", actual[0].toString());
		assertNull(actual[1]);

	}

}
