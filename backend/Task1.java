package backend;

import java.util.Scanner;

public class Task1 {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
     System.out.println("Enter the array size");
	    int size=sca.nextInt();
	    int []sa=new int[size];
	    
	    for(int i=0;i<size;i++) {
	    	System.out.println("Enter the array value");
	    	int saval=sca.nextInt();
	    	sa[i]=saval;
	    	
	}
		System.out.println("Array store values");
        for(int i=0;i<sa.length;i++) {
      	System.out.println(sa[i]);
        }
		if(sa[i]>5) {
	     System.out.println("great then "+(sa[i]));
		}else {
			System.out.println("less then "+(sa[i]));
		
		}
        
        
      
}

}