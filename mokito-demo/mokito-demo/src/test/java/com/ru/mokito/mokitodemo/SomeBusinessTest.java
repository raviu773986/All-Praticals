package com.ru.mokito.mokitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void findTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24,result);
	}

}

class DataServiceStub implements DataService
{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[]{24,6,15};
	}
	
}