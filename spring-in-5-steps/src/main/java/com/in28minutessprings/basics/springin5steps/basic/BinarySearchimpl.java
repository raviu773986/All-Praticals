package com.in28minutessprings.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")  or as its hard coding so use it like below
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)  its default but we can do so also
public class BinarySearchimpl {
	
	@Autowired
//	@Qualifier("bubble")   // another way for managing dependency 
	
	private SortAlgorithm 	sortAlgorithm;    // creating instance of sortAlgorithm interface
	
	
	//constructor
//	public BinarySearchimpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

	//setter
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int[] numbers,int numberToSearch)
	{	
//		BubbleSortAlgorithm  bubbleSortAlgorithm = new BubbleSortAlgorithm();
		//we can now implement the sorting logic here and return the result back
		//int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers); //our program now using sortAlgorithm interface instead of bubblesort only
		System.out.println(sortAlgorithm);
		
		return 3;
	}
	
	

}
