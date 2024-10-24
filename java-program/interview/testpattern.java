package interview;

import java.util.Scanner;

public class testpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a=new Scanner(System.in);
		System.out.println("enter the pattern size");
		int sa=a.nextInt();
		
		
		for(int i=1;i<=sa;i++) {
		
			for(int j=i;j<=sa;j++) {
				   System.out.print(" ");
				}
			for(int j=1;j<i;j++) {
				   System.out.print(j);
				}
			for(int j=i;j>=1;j--) {
				   System.out.print(j);
				}
			
			System.out.println();
		}

		

		
		System.out.println("-----------number even or odd check without using modulo operator-------------");
		
	int num=8;
	if((num&1)==0)
	{
		System.out.println(num+"is even number");
	}else {
		System.out.println(num+"is odd number");
	}
		
	System.out.println("-------------abcde++------------------");	
        Scanner s=new Scanner(System.in);

		System.out.println("enter the character row size");
		int aa=s.nextInt();
		char ch='A';
		
		for(int i=1;i<=aa;i++){
			for(int j=i;j<=aa;j++) {
				System.out.print(ch+" ");
				ch++;
			}
		
			System.out.println();
		}
		
   		System.out.println("---------------a bb ccc dddd ---------------------");
		  
   		char c='A';
		for(int i=1;i<=sa;i++) {
			for(int j=i;j<=sa;j++) {
				System.out.print(c+" ");
			}
			c++;
			System.out.println();
		}
		
		System.out.println("----------------");
     		
	
    char ss='A';
    for(int i=1;i<=5;i++) {
    ss='A';
    	for(int j=i;j<=5;j++) {
    		System.out.print(ss+" ");
    	ss++;
    	}
    	System.out.println();
    }


	System.out.println("---------------------------------");	
		
	Scanner n=new Scanner (System.in);
	System.out.println("enter");
    int m=n.nextInt();
    
    char o='A';
    
    for(int i=1;i<=m;i++) {
    	o='A';
    	for(int j=i;j>=1;j--) {
    		System.out.print(o);
    		o++;
    	}
//    	for(int j=1;j<=i;j++) {
//    		System.out.print(o);
//    		o++;
//    	}
    	
    	System.out.println();
    }
    
    
    
    
    
    
    
    
    
    
    
    
		
		
		
		
		
		
		
	}

}
