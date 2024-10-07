package backend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

     //Task 6: reverse the number in arrayList

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> hhList=new ArrayList<Integer>();
       hhList.add(2);
       hhList.add(6);
       hhList.add(3);
       hhList.add(5);
       hhList.add(0);
       System.out.println(hhList);
       System.out.println("resver the arrayList");
       System.out.println(hhList.get(4));
       System.out.println(hhList.get(3));
       System.out.println(hhList.get(2));
       System.out.println(hhList.get(1));
       System.out.println(hhList.get(0));
       //another away
       ArrayList<Integer> numList=new ArrayList<Integer>();
       numList.add(10);
       numList.add(20);
       numList.add(30);
       numList.add(40);
       numList.add(50);
       System.out.println(numList);
       for(int i=0; i<numList.size();i++) {
    	   System.out.println(numList.get(i));
       }
       Collections.reverse(numList);
       
       System.out.println(numList);
    
	}

}
