package com.ru.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean condn = true;
		assertEquals(true,condn);
		assertTrue(condn);
		assertFalse(condn);
		assertNotNull(condn);
		assertNull(condn);
//		assertArrayEquals(expected,actusl);

	}

}
