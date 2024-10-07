package backend;

import java.util.Scanner;

public class Sca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner(System.in);
	       // Integer val=user.nextInt()
System.out.println("enter the array size");
	        int size=user.nextInt();
	        int[] sa=new int[size];
	        
	        
	        for(int i=0;i<size;i++) {
	        	System.out.println("enter the value of array");
	        	int saval=user.nextInt();
	        	sa[i]=saval;
	        		
	        }
	    System.out.println("for");
		for(int i=0;i<sa[i];i++) {
			System.out.println(sa[i]);
	        	 
	      }
	        

	}

}
