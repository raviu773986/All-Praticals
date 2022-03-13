package com.in28minutessprings.basics.springin5steps.basic;

//import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.stereotype.Component;

@Component
//@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers)   //takes array of numbers and returns array of sorted numbers
	{
		//we can put the logic for bubble sort here
		return numbers;
	}

}
