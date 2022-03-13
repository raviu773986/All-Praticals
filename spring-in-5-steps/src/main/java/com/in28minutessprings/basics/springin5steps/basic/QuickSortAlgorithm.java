package com.in28minutessprings.basics.springin5steps.basic;

//import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary   // or
//@Qualifier("quick") 
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers)
	{
		return numbers;
	}

}

