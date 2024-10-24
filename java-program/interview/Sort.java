package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		// sort in the int
		System.out.println("----------------------sort in the array int ascending order--------------");
		 Integer n[]= {2,8,4,9,6,2,1};// int
		   Arrays.sort(n);
		   
		   for(int i=0;i<n.length;i++) {
			   System.out.print(n[i]+",");
		   }
		   
		   System.out.println();
		   System.out.println("---------------------sort in the array int without sort() method ------------------");
		   
		   int m[]= {8,9,1,55,88,22,0};
		   int temp=0;
		    
		   for(int i=0;i<m.length;i++) {
			   for(int j=i+1;j<m.length;j++) {
				   
				   if(m[i]>m[j]) {
					   temp=m[i];
					   m[i]=m[j];
				       m[j]=temp;		
				      
				  
			   }
			   }
		   }
		 
		     for(int i=0;i<m.length;i++) {
				   System.out.print(m[i]+",");
		   
		   }
		   
		   // sorting the array in decending order sort method
		   System.out.println();
		   System.out.println("---------------sorting the array in decending order method--------");
		   
		   
		       //int convert int to Integer in java
		     // int k[]= {4,7,2,0)
		   //Integer e=new Integer(m)
;		   
		   Integer[] b= {7,0,4,8,3,5,5,3};
		   Arrays.sort(b,Collections.reverseOrder());
		   
		  for(int values:b) {
			  System.out.print(values+",");
		  }
		   
		   
		   // sorting the Integer without sort() method 
		  
		  System.out.println();
		  System.out.println("-----------------sorting the Integer without sort() method---------------");
		  
		  int c[]= {8,33,55,11,4,6,0}; 
		  int temps=0;
		  for(int i=0;i<c.length;i++) {
			  for( int j=i+1;j<c.length;j++) {
				  if(c[i]<c[j]) {
					  temps=c[i];
					  c[i]=c[j];
					  c[j]=temps;
				  }
			  }
		  }
		  for(int i=0;i<c.length;i++) {
			  System.out.print(c[i]+",");
		  }
		
		  
		  // sort the arrayList
		  System.err.println();
		  System.out.println("-------------sort the arrayList---------------" );
		  
		  ArrayList<Integer> x=new  ArrayList<Integer>();		   
		   x.add(10);
		   x.add(20);
		   x.add(90);
		   x.add(30);
		   x.add(220);
		   x.add(60);
		   x.add(0);
		   
		     Collections.sort(x);
		     
		     System.out.println(x);
		     
		   // print the sort arrayList in decending order
	
		     System.out.println("------------sort the decending order-------------");
		   
		     
		     ArrayList<Integer> z=new ArrayList<Integer>();
		     z.add(40);		     
		     z.add(70);
		     z.add(10);		     
		     z.add(480);
		     
		     Collections.sort(z,Collections.reverseOrder());
		     System.out.println(z);
		   
		   
		   //print the sort the String
		     System.out.println("--------------sort the String(ascending order or decending order(>)---------------");
		     String l ="sanjaylee";
             char temp1; 
		     char[] k=l.toCharArray();
		     for(int i=0;i<k.length;i++) {
		    	 for(int j=i+1;j<k.length;j++) {
		    		 if(k[i]>k[j]) {
		    			 temp1=k[i];
		    			 k[i]=k[j];
		    			 k[j]=temp1;
		    		 }
		    	 }
		     }
		     System.out.println(k);
		     
		     // print the String Sort ascending order
		     System.out.println("-------------------sort the String ascending order and decending order -------------");
		     String j[]= {"sanjay","lee","apple","zero"};
		     Arrays.sort(j);    // decending order in     (    Arrays.sort(j,Collections.reverseOrder());   )
		     
		     for(String order:j) {
		    	 System.out.print(order+" ");
		     }
		     
		     // print the ArrayList sort 
		     System.out.println();
		     System.out.println("-----------print the ArrayList ascending order and decending ---------------------");
		       
		     
		     ArrayList<String> h=new ArrayList<String>();
		     h.add("sanjay");
		     h.add("zero");
		     h.add("lee");
		     h.add("bal");
	
		     Collections.sort(h); // decending order   (        Collections.sort(h,Collecctions.reverseOrder());        )
		     
		     System.out.println(h);
		     
		     // print string array ascending order
		     System.out.println("------------------print string array ascending  and decending order----------------");
		     
		     
		     String f[]= {"apple","zero","bal","sanjay"};
		      String str;
		    for(int i=0;i<f.length;i++) {
		    	for(int k1=i+1;k1<f.length;k1++) {
		    		
		    		if(f[i].compareTo (f[k1])<0) {  // ( < ) change the symbal decending order
		    			   str=f[i];
		    			   f[i]=f[k1];
		    			   f[k1]=str;
		    			   
		    		}
		    	}
		    }
		     
		    for(String element:f) {
		    	System.out.print(element+", ");
		    }
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		    
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
	}

}
