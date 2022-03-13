package com.ru.mokito.mokitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class SomeBusinessMockAnnotationTest {
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Test
	void findTheGreatestFromAllData() {
//		DataService dataServiceMock = mock(DataService.class);
				
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3} );
		
//		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(24,businessImpl.findTheGreatestFromAllData());
	}

}

