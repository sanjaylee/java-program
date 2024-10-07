package backend;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.Scanner;

import oops.Mod;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mod mo=new Mod();//modifiers
		System.out.println(mo.user);
		
		
		
		
		LocalDate q=LocalDate.now();
         System.out.println(q);
         LocalDateTime q1=LocalDateTime.now();
         System.out.println(q1);
	
     System.out.println("enter the name,age,salary");
	Scanner hm=new Scanner(System.in);
	String name=hm.nextLine();
	int age=hm.nextInt();
	double salary=hm.nextDouble();
	
	System.out.println("name"+name);
	System.out.println("age"+age);
	System.out.println("salary"+salary);
	
	
	
	}

}
