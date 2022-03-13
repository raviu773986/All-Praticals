package com.ru.mokito.mokitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	void findTheGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
				
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3} );
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24,result);
	}

}

