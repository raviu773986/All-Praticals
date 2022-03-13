package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper;
	@Before
	public void before()
	{
		 helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Positions() {
//		StringHelper helper = new StringHelper();
//		String actual =helper.truncateAInFirst2Positions("AACD");
//		String expected = "CD";
//		//AACD =>CD , ACD=>CD,CDEF=>CDEF , CDAA=>CDAA
//		assertEquals(expected,actual); 
		// or we can convert actual and expected into inline by refactoeing it
		
		//AACD =>CD , ACD=>CD,CDEF=>CDEF , CDAA=>CDAA
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));

	}
	
	
	@Test
	public void testtruncateAInFirst2Positions2_AinfirstPosition() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
		
	}
	

	//ABC=>false, ABAB=>true, AB=>TRUE, A=>false
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicNegativeScenario()
	{
//		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABCD")); 
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));	
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_BasicPositiveScenario()
	{
//		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABCD")); 
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));	
	}
	
	
	
	
	
}
