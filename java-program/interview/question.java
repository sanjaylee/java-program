package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class question {
	
	
	public static boolean palindrom(String str) {
		str=str.toLowerCase();
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return str.equals(sb.toString());
	}
	public static void main(String[] args) {
		 System.out.println("--------------------leap year check----------------");
		 
		 int leap=2000;
		 
		 for(int i=0;i<=10;i++) {
			 System.out.print(leap+" ");
			 leap=leap+4;
		 }
		 System.out.println();
		 System.out.println("------------------------------------------------------------------------------------------");
		 
		 int year=2005;
		 
		 if(year%4==0) {
			 System.out.println("it is a leap year");
		 }else {
			 System.out.println("it is not leap year");
		 }
		 System.out.println("----------------------------------------------------------");
		
		 String str= "sanjay";
		 int na=str.length();
		 
		 for(int i=0;i<na;i++) {
			 for(int j=i;j<na;j++) {             // for(int j=0;j<=i;j++)
				 System.out.print(str.charAt(j));
			 }
			 System.out.println();
		 }
		 
		 System.out.println("---------------print the random number-------------");
		 
		 Random sanjay=new Random();
		 
		 int number;
		 number=sanjay.nextInt(666666);
		 System.out.println(number);
		 
		 
		 System.out.println("----------factoral ------------");
		 
		 int a=5;
		 int fact=1;
		 
		 for(int i=1;i<=a;i++) {
		       fact=fact*i;
		 }
		 System.out.println(fact);
		 
		System.out.println("--------------------------array rigth rotate-----------");
		
		int aa[]= {1,2,3,4,5,6};
	    int last=0;
		int  n=3;
		for(int i=0;i<=n;i++) {
			last=aa[aa.length-1];
			
			for(int j=aa.length-1;j>0;j--) {
				aa[j]=aa[j-1];
			}
			aa[0]=last;
		}
		
		 for(int i=0;i<aa.length;i++) {
			 System.out.print(aa[i]+",");
		 }
		 System.out.println();
		 
		 System.out.println("------left rotate in array-----------");
		 
		 int[] sa= {1,2,3,4,5,6};
		 int nn=3;
		
		 for(int i=0;i<nn;i++){
			 int j,first;
			 first=sa[0];
			 for(j=0;j<sa.length-1;j++) {
				 sa[j]=sa[j+1];
				
			 }
			 sa[j]=first;		
		 }
		 
		 for(int i=0;i<sa.length;i++) {
			 System.out.print(sa[i]+",");
		 }
		 System.out.println();
		 System.out.println("----------------------------palindrome without for loop------------------------");
		 
		 System.out.println(palindrom("Amma"));
		 // two way
		 
			String st="amaw";
			StringBuilder bu=new StringBuilder(st);
			
		   bu.reverse();
		boolean bo=st.equals(bu.toString());
		System.out.println(bo);
		if(bo==true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		   
		
		 System.out.println("------------mising element in the array------------");
		 
		 int[] mis= {1,2,5,7,4,6};
		 int v=mis.length;
		  int sum=(v+1)*(v+2)/2;
		  for(int i=0;i<v;i++) {
			  sum=sum-mis[i];
		  }
		  System.out.println(sum);
		  System.out.println("--------------join two array---------------");
		 
		  int[] arr1= {1,2,5,6,7,8};
		  int[] arr2= {3,4,5,9,0};
		 
		  int fi=arr1.length;
		  int se=arr2.length;
		  int jo=fi+se;
		  int[] join=new int[jo];
		  int count=0;
		  
		  for(int i=0;i<arr1.length;i++) {
			    join[count++]=arr1[i];

		  }
		  for(int i=0;i<arr2.length;i++) {
			    join[count++]=arr2[i];
		  }
		 		 
		  for(int i=0;i<join.length;i++) {
			    System.out.print(join[i]+",");
		  }
		  System.out.println();
		  System.out.println("---------------without dublicate-----------");
		  HashSet<Integer> hh=new HashSet<Integer>();
		  
		  for(int i=0;i<join.length;i++) {
			   hh.add(join[i]);
			   
		  }
		  System.out.println(hh);
		  System.out.println("--------------join two string array----------");

		  
		  String[] ar1= {"a","e","c"};
		  String[] ar2= {"d","b","f"};
		 
	     	  
		 List list=new ArrayList(Arrays.asList(ar1));
		 list.addAll(Arrays.asList(ar2));
		 Object[] re=list.toArray();
		 System.out.println(Arrays.toString(re));
		  
		  System.out.println("--------------join two integer---------------- ");
		  
		  Integer[] in= {1,3,5,8,9};
		  Integer[] inn= {2,4,67,9,4};
	  	  
			 List lists=new ArrayList(Arrays.asList(in));
			 lists.addAll(Arrays.asList(inn));
			 Object[] ree=lists.toArray();
			 System.out.println(Arrays.toString(ree));
			 
	System.out.println("---------move all zero in end----------------------");
			  
		  int[] cc= {0,1,0,3,55,4,0,6,05,12,40};
		  
		  int plus=0;
		  int l=cc.length;
				  
		  
		  for(int i=0;i<l;i++) {
			  if(cc[i]!=0) {
			  cc[plus++]=cc[i];
			  
		  }
		  }
		  
		 while(plus<l) {
			 cc[plus++]=0;
		 }
		  
		  for(int i=0;i<cc.length;i++) {
			  System.out.print(cc[i]+",");
		  }
		  
		  
		System.out.println("-----------anthor way move zero end--------");
		  
		  Arrays.sort(cc);
		
		  for(int i=cc.length-1;i>=0;i--) {
			  System.out.print(cc[i]+" ");
		  }
		  
		  System.out.println(Arrays.toString(cc));
	
		  
		 
	}
		

}
