package com.in28minutessprings.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutessprings.basics.springin5steps.basic.BinarySearchimpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		
		
		//what are the beans?
		//what are the dependiceies for bean
		//where to search for beans
		
		
//		BinarySearchimpl binarySearch = new BinarySearchimpl(new QuickSortAlgorithm());
//		int result = binarySearch.binarySearch(new int[] {124,4,6},3);
		//com.in28minutessprings.basics.springin5steps.BubbleSortAlgorithm@53e25b76
		//com.in28minutessprings.basics.springin5steps.QuickSortAlgorithm@73a8dfcc

//		System.out.println(result);
		//Application context
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		BinarySearchimpl binarySearch = applicationContext.getBean(BinarySearchimpl.class);
		BinarySearchimpl binarySearch1 = applicationContext.getBean(BinarySearchimpl.class); //req bean for second time
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[] {124,4,6},3);
		System.out.println(result);
		//com.in28minutessprings.basics.springin5steps.BubbleSortAlgorithm@2f6bbeb0
	   //3
		
	}

}

