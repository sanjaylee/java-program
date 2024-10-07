package streamdouble8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class arraystream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println("------------------	array print by stream api---------------------------");
		
		int arr[]= {9,2,3,4,9,5,5};
		int arr1[]= {9,2,3,4,9,5,5};
		Arrays.stream(arr)
		.forEach(System.out::println);

		System.out.println("--------------------------	 sorted array using stream---------------------------");
		Arrays.stream(arr)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("--------------------------	 sorted descending order array using stream---------------------------");
		 Arrays.stream(arr1)
		 .boxed()
		.sorted((a,b)->b-a)
	
		.forEach(System.out::println);
		 
		 String[] arr2= {"sanjay","appale","lee"};
			System.out.println("--------------------------	String  sorted decending order array using stream---------------------------");
			 Arrays.stream(arr2)
			
			.sorted((a,b)->b.compareTo(a))
		
			.forEach(System.out::println);
		

		
	  System.out.println("--------------------minimum element of array--------------------------");
	  
	  OptionalInt a=Arrays.stream(arr)
	  .min();
	  System.out.println(a.getAsInt());
	  
	  System.out.println("--------------------maxmum elelment of array-----------------------");
	  
	  OptionalInt b=Arrays.stream(arr)
			  .max();
	  System.out.println(b.getAsInt());
	  
	  System.out.println("-----------------------average of array------------------");
	  
	  OptionalDouble c=Arrays.stream(arr)
			  .average();
	  System.out.println(c.getAsDouble());
	  
	  System.out.println("-----------------------sum of array------------------");
	  
	  
	  int d=Arrays.stream(arr)
			  .sum();
	  System.out.println(d);
	  
	  System.out.println("-----------------------unique of array------------------");

	  Arrays.stream(arr)
	  .distinct()
	  .forEach(System.out::println);


	  System.out.println("-----------------------lenght of array------------------");
	 long e= Arrays.stream(arr)
	  .count();
	  System.out.println(e);
	  
	  
	  System.out.println("-------------------------------------------------------string---------------------------------");
	  Arrays.stream(arr2)
	  .sorted()
	  .forEach(System.out::println);
	  System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		 System.out.println("-----------------------filter example------------------------");
	//filter andd map
	
	Arrays.stream(arr)
	.filter(em->em%2==0)											// condition based progeam 
	.forEach(System.out::println);        
		 
	System.out.println("------------------------------map example----------------------------");	 
		 
	Arrays.stream(arr)
	.map(em->em+10)
	.forEach(System.out::println);
		 
		 
	  
	}

}
