package com.ru.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Before
	public void before()
	{
		System.out.println("before");
	}
	
	@After
	public void after()
	{
		System.out.println("after");
	}
	
	@Test
	public void sum_with3numbers() {
//		int result = myMath.sum(new int[] {1,2,3});  
//		assertEquals(6,result);
//		System.out.println(result);       //6
		System.out.println("test1"); 
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
				
	}

	@Test
	public void sum_with1numbers() {
		System.out.println("test2"); 
		assertEquals(3,myMath.sum(new int[] {3}));
				
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("after class");
	}
}
