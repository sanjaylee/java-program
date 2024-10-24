package backend;

import java.util.ArrayList;

import java.util.Collections;

public class Task4 {
//Task4  find the nearest biggest number in arrayList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num=new ArrayList<Integer> ();
		num.add(2);
		num.add(6);
		num.add(8);
		num.add(1);
		num.add(3);
		num.add(10);
		System.out.println(num);
		 Collections.sort(num);
		 System.out.println("nearest biggest number");
		 System.out.println(num);
	}

}
