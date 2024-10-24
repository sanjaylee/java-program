package streamdouble8;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;

public class collectionstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(10);
		obj.add(30);
		obj.add(20);
		obj.add(50);
		obj.add(479);
		

		HashMap<String,Integer> ma=new HashMap<String,Integer>();
		ma.put("sanjay", 21);
		ma.put("apple", 32);
		ma.put("leee", 3);
		ma.put("zoho", 01);
		ma.put("oops", 213);
		
		
		List<String> obj1=new ArrayList<String>();
		obj1.add("sanjay");
		obj1.add("apple");
		obj1.add("lee");
		obj1.add("sanjay");
		obj1.add("add");
	System.out.println("----------------count of list----------------------");
		long a=obj.stream()
		.count();
		System.out.println(a);	
		
		System.out.println("----------------remove dublicate of list----------------------");
		
		obj.stream()
		.distinct()
	    .forEach(System.out::println);
		
		System.out.println("----------------sort ascending order of list----------------------");
		
		obj.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("----------------sort of descending order of list----------------------");
		
		obj.stream()
		.sorted((aa,b)->b-aa)
		.forEach(System.out::println);
		
        System.out.println("---------------- string sort of descending order of list----------------------");
		
		obj1.stream()
		.sorted((aa,b)->b.compareTo(aa))
		.forEach(System.out::println);
		
       System.out.println("----------------sort of descending order of list----------------------");
		
		 obj1.stream()
		 .sorted((aa,b)->-123)             // - add panna insertion order ku apposite la print ----.sorted((aa,b)->+123) insertion roder
		 .forEach((sa)->System.out.println(sa));
		 
		 System.out.println("----------------limit  of list----------------------");
		 
		 obj1.stream()
		 .limit(3)
		 .forEach(System.out::println);
		 
		 
		 System.out.println("----------------skip of list----------------------");
		 
		 obj1.stream()
		 .skip(3)
		 .forEach(System.out::println);

		 
		 System.out.println("-----------------------min number of list--------------------");
		 
		 Optional<Integer> sa=obj.stream()
		 .min((aa,b)->aa-b);
		 System.out.println(sa.get());
		 
		 System.out.println("-----------------------max number of list--------------------");
		 
		 Optional<Integer> saa=obj.stream()
		 .max((aa,b)->aa-b);
		 System.out.println(saa.get());
		 
		 
		 System.out.println("----------------limit  of list----------------------");
		 
		 obj1.stream()
		 .limit(3)
		 .forEach(System.out::println);
		 
	

		System.out.println("----------------------sum of list--------------------");
		Optional<Integer> su=obj.stream()
		.reduce((no,no1)->no+no1);
		System.out.println(su.get());
		
		System.out.println("-------------------------convert arraylist to array------");
		
		Object[] ob=obj.stream()
				.toArray();
		 for(Object o:ob) {
			 System.out.println(o);
		 }
		
		 System.out.println("---------------------parallelstream --------------------");
		
		obj.parallelStream()
		.forEach(System.out::println);
		

		 
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		 System.out.println("-----------------------filter example------------------------");
	//filter andd map
	
	obj.stream()
	.filter(em->em%2==0)											// condition based progeam 
	.forEach(System.out::println);        
		 
	System.out.println("------------------------------map example----------------------------");	 
		 
	obj.stream()
	.map(em->em+10)
	.forEach(System.out::println);
		 
	System.out.println("-----########################## HahMap using stream api#############################");
		// its sorted by or value 
	ma.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByValue())    		// .comparingByKey()
	.forEach(System.out::println);
		
	}

}
