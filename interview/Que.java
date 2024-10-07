package interview;

import java.util.Collection;

//  check odd or even numbers
public class Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s=10;
		if(s%2==0) {
			System.out.println(s+"is a even number");
		}else {
			System.out.println(s+"is a odd number");
		}
		
	System.out.println("-----------------------");	
	//1 t0 10 odd number print	
		
	   for(int i=1;i<=10;i++) {
		   if(i%2!=0) {
			   System.out.println(i+"is a odd number");
		   }
	   } 
		System.out.println("-----------------------");	
	 //1 t0 100 even number print	
			
		   for(int j=1;j<=100;j++) {
			   if(j%2==0) {
				   System.out.println(j+"is a odd number");
			   }	   
		   }
	System.out.println("-----------------------");	
	// count the even number from 1 to 300
	    int count=0;
	    for(int i=1;i<=300;i++) {
	    	if(i%2==0) {
	    		count++;
	    	}
	    }
	   System.out.println(count);
	   
		System.out.println("-----------------------");	
	//print even sum from 1 to 90	
		int sum=0;
		for(int i=1;i<=90;i++) {
			if(i%2==0) {
				sum+=i;
			}	
		}
		System.out.println(sum);
		
		System.out.println("-----------jjj------------");	
	//print odd sum from 1 to 80
		int sum1=0;
		for(int i=1;i<=80;i++) {
			if(i%2!=0) {
				sum1+=i;
 			}
		}
		System.out.println(sum1);
		
	System.out.println("-----------------------");	
	
   // string printing reversely
	
	String word="sanjay";
	
	for(int i=word.length()-1;i>=0;i--) {
		System.out.print(word.charAt(i));
	}
		
	System.out.println("");	
	System.out.println("----------------------");
	// string printing reversely string
		 String word1="sanjay";
		String word2="";
		
		for(int i=word1.length()-1;i>=0;i--){
			word2=word2+word1.charAt(i);
			
		}
		System.out.println(word2);
	System.out.println("----------------------");				 
	
	// string is a palindrome check
     
	  String sa="abbaamma";
	  String as="";
	  for(int i=sa.length()-1;i>=0;i--) {
		  as=as+sa.charAt(i);
	  }
	  
	  System.out.println(sa);
	  if(sa.equals(as)) {
		  System.out.println(as+("is a polindrome"));
	  }else {
		  System.out.println(as+("is a not polindrome"));
	  }
	  
	
System.out.println("----------------factorial------------------");

  int no=6;
  int fact=no;
  while(no>1) {
	  no--;
	  fact=fact*no;
  }
  
  System.out.println(fact);
  
  int a=153;
  int b=a; 
  int arm=0;
  
  while(a>0) {
	  int rem=a%10;
	  arm=arm+(rem*rem*rem);
	  a=a/10;
  }
  if(b==arm) {
	  System.out.println("armstrong number");
  }else {
	  System.out.println("is not armatrong number");
	
  }
  
 
  
  
  
  
  
  
  
}
		
}
	


