package another;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class surandarAnna {
	
	
	public static void main(String[] args) {
	
		System.out.println("----------------------1 program---------------------------");
		int temp=0; 						//    int a=2,b=5;
     	int a=2,b=5;                        //    a=a+b;
		                                    //    b=a-b;
		temp=a;                            //     a=a-b;
		a=b;                               //    System.out.println(a);
		b=temp;                           //    System.out.println(b);
		System.out.println("a="+a);      
	    System.out.println("b="+b);
	    System.out.println("------------------------- 2 program-------------------------");
	    
	    int n=10;
	    int f=0,s=1;
	    int sum1 = 0;
	    
	    for(int i=0;i<n;i++) {
    	 System.out.print(f+",");
	    	int next=f+s;
	    	f=s;
	    	s=next;
	    	
	    	
	    	
	    }
	
	    System.out.println();
	    System.out.println("---------------------3 program----------------------------");
		
	       int sum=0;
	       int arr[]= {2,4,6,7,9};
	       
	       for(int i=0;i<arr.length;i++) {
	    	  sum= sum+arr[i];
	       }
		System.out.println("sum of array element="+sum);
	    
		System.out.println("--------------------------4 program------------------------");
		
		int sa[]= {7,2,5,1,4};
		int max=0;
		for(int i=0;i<sa.length;i++) {
			if(max<sa[i]) {
				max=sa[i];
			}
			
		}
		
		System.out.println("largest number in the array="+max);
	System.out.println("---------------------------5 program-------------------------");	
		
		int input[]= {1,2,2,3,3,3,4,5};
		
		Set<Integer> nn=new HashSet<Integer>();
	    
		for(int i=0;i<input.length;i++) {
			nn.add(input[i]);
		}
		System.out.println("remove duplicate element from an array="+nn);
		
		System.out.println("---------------------6 program----------------------------");
	    
	    String name="racecar";
	   
	    String rev ="";
	    
	    for(int i=name.length()-1;i>=0;i--) {
	    	rev=rev+name.charAt(i);
	    }
//	    System.out.println(rev);
	    if(name.equals(rev)) {
	    	System.out.println("is palindrome YES");
	    }else {
	    	System.out.println("is not palindrome NO");
	    }
	    
	    
	 System.out.println("-----------------------7 program---------------------");
	 
	 String str1="Silent";
	 String str2="Listen";
	  str1=str1.toLowerCase(); 
      str2=str2.toLowerCase();
	
	char[] ch=str1.toCharArray(); 
	 Arrays.sort(ch);
	 
	 char[] ch1=str2.toCharArray();
	 Arrays.sort(ch1);
	
	 boolean flag=Arrays.equals(ch, ch1);
	 if(flag) {
		 System.out.println("String are anagram");
	 }else {
		 System.out.println("String not Anagram");
	 }
	 
	
	}

}
