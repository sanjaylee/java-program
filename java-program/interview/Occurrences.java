package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;


public class Occurrences {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// one char check in occurrence 
        String sa="sanjay";
        int count=0;
        char as='s';
        for(int i=0;i<sa.length();i++) {
     	   if(sa.charAt(i)==as) {
     		   count++;
        }
        }
        System.out.println("Occurrences of "+as );
        System.out.println(count);
        
		
        
        //string each character occurrence
        System.out.println("----------string each character occurrence----------");
        
        String sanjay="i love you";
        sanjay=sanjay.replace(" ", "");
        int plus=0;
        char arr[]=sanjay.toCharArray();
        
       HashMap<Character,Integer> map=new HashMap<Character,Integer>();
          for(int i=0;i<arr.length;i++) {
         	  plus=0;
         	 for(int j=0;j<arr.length;j++) {
         		 if(arr[i]==arr[j]) {
         			 plus++;
         		 
         	 }
         	 }
         	 map.put(arr[i],plus);
         	
          }
         
          System.out.println("string each character "+map);
        
          // interviwe quesation
          System.out.println("-------------intput a2s3s4----------");
          String kk="a9n1s3d4";
          
          for(int i=0;i<kk.length();i++) {
          	if(Character.isAlphabetic(kk.charAt(i))) {
          		System.out.print(kk.charAt(i));
          	}
          else {
          	int x=Character.getNumericValue(kk.charAt(i));
          	     for(int j=1;j<x;j++) {
          	    	 System.out.print(kk.charAt(i-1));
          	     }
          }
          } 
          	
        
   
        
        
        //print the vowel count
        System.out.println("------------print the vowel count the String-----------------");
        
        String str="I llove you";
        str=str.toLowerCase();
         int vowel=0;
      
        for(int i=0;i<str.length();i++) {
        	if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')) {
                vowel++;
                System.out.println(str.charAt(i));
        	}else {
        		
        	}
        	
        }
        System.out.println("totle no of vowels in string="+vowel);
        
        //print the  letter vowel count
        System.out.println("------------print the vowel count simple way the String-----------------");
        
        String dd="i love you";
       String zz="aeiou"; 
       int hh=0;
        char kkk[]=dd.toCharArray();
        char lll[]=zz.toCharArray();
        
        for(int  i=0;i<kkk.length;i++) {
            for(int j=0;j<lll.length;j++) {
            	if(kkk[i]==lll[j]) {
            		hh++;
            		System.out.println(kkk[i]);
            	}
            }
           
        }
        System.out.println("count ="+hh);
        
        
      
        // vowel character remove in string
        System.out.println("--------------vowel character remove in the string----------");
        
        String  ooo="maximum number in the arraay";
        String looo=ooo.replaceAll("[aeiouAEIOU]", "");
        System.out.println(looo);
        
     
        
        //  int convert Integer
        System.out.println("------int convert Integer-----------");
       int oo=124345678;
       Integer pp=new Integer(oo);
       System.out.println(pp);
       
       // Integer convert to  String 
       System.out.println("-----------Integer convert to String---------");
      String p=Integer.toString(pp);
   
       System.out.println(p);
       
       
 // print the vowel not consonants word in string 
       System.out.println("------------print the vowel not consonants in string ----------");
       String qq="i am always single";
       int vow=0;
       int cvow=0;
        String qqq=qq.toLowerCase();
            
        for(int i=0;i<qqq.length();i++) {
        	if(qqq.charAt(i)=='a'||qqq.charAt(i)=='e'||qqq.charAt(i)=='i'||qqq.charAt(i)=='o'||qqq.charAt(i)=='u') {
        	  
        		vow++;
        	}else if (qqq.charAt(i)>'a'&& qqq.charAt(i)<'z') {
        		cvow++;
        		
        	}
        }
      System.out.println(" vowel count in strint ="+vow);
      System.out.println("consonants in the string  ="+cvow);

    
    
    
    
      
      
       
       
	}

}
