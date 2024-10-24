package interview;

import java.util.HashMap;
import java.util.Map;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		   
        // print the character count   in the string 
          System.out.println();
        System.out.println("--------print the character count in the string ---------");
        
         
        String lee="i love you";
        lee=lee.replace(" ", ""); //space count this line not use
        char ch[]=lee.toCharArray();
        int n=ch.length;
        System.out.println("number of character count in String ="+n);
        
        
        
        // print the  word count in string
        System.out.println("-------------print the word count in string------------ ");
        String summa="Any time is tea time";
        String gg[]=summa.split(" ");
        int  d=gg.length;
       
        System.out.println("number of word count in String ="+d);
        
        
        // print vowels in count each element in the string
        System.out.println("------------print vowels in count each element in the string-------------");
        
        
        String s="welcome to java";
        char[] chh=s.toCharArray();
        Map<Character,Integer>mp=new HashMap<Character,Integer>();
          for(int i=0;i<chh.length;i++) {
        	  char c=chh[i];
        	  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
        		  if(mp.containsKey(c)) {
        			  Integer inte=mp.get(chh[i]);
        			  mp.put(c, inte+1);
        		  }else {
        			  mp.put(c, 1);
        		  }
        	  }
        	  
          }
        
        
        System.out.println(mp);
        
        
        // print vowels not consonats  in count each element in the string
        System.out.println("------------print vowels not consonats in count  each element in the string-------------");
        
        
        String ss="welcome to java";
        char[] chhh=s.toCharArray();
        Map<Character,Integer>mpa=new HashMap<Character,Integer>();
          for(int i=0;i<chhh.length;i++) {
        	  char cc=chhh[i];
        	  if((cc>='a'&&cc<='z')||(cc>='A'&&cc<='Z')) {
        		  if(mpa.containsKey(cc)) {
        			  Integer inte=mpa.get(chhh[i]);
        			  mpa.put(cc, inte+1);
        		  }else {
        			  mpa.put(cc, 1);
        		  }
        	  }
        	  
          }
        
        System.out.println(mpa);
         
        //  print the small and caps and digite and space inthe string  
        
        System.out.println("--------- print the small and caps and digite and space inthe string ----------- ");
        
        String sanjay="Sanjaylee00011@@gmail.com";
        int sm=0,ca=0,nu=0,sp=0;
        String small="",caps="",digits="",spcl="";
          for(int i=0;i<sanjay.length();i++) {
        	  char a=sanjay.charAt(i);
        	  if(a>='a'&&a<='z') {
        		  sm++;
        		  small=small+a;
        	  }else if(a>='A'&&a<='Z') {
        		  ca++;
        		  caps=caps+a;
        	  }else if(a>='0'&&a<='9') {
        		  nu++;
        		  digits=digits+a;	  
        	 }else {
        		 sp++;
        		 spcl=spcl+a;
        	 }
        	  
          }
        
        System.out.println("small=="+sm+"=="+small);
        System.out.println("caps=="+ca+"=="+caps);
        System.out.println("digits=="+nu+"=="+digits);
        System.out.println("spcl=="+sp+"=="+spcl);
        
        // print the first letter in uppercase into each word in the string
        System.out.println("----------print the first letter in uppercase into each word in the string-------------");
           
        String str="i am sanjay ";
        System.out.println(str);
        	String[] words=str.split(" ");
        	for(String word:words) {
        		System.out.print( word.substring(0, 1).toUpperCase()+word.substring(1, word.length())+" ");
        	}
        	System.out.println();
        System.out.println("-------------reverse the string---------");
        	for(int i=str.length()-1;i>=0;i--) {
        		str.toUpperCase();
    	
    	System.out.print(str.charAt(i));
    	
    	
    }
        	
        	System.out.println();
        	// reverse the each word in string
        	System.out.println("-------------reverse the each word in string-------------");
        	
        	String let="sanjay is a  java user ";
        	
        	String[] letter=let.split(" ");
       
  
        	for(int i=0;i<letter.length;i++) {
        		String word=letter[i];
        		String revword="";     
        		for(int j=word.length()-1;j>=0;j--) {
        		revword=revword+word.charAt(j);
        		}
//       		reverse=reverse+revword+" ";
        		System.out.print(revword+" ");
        	}
        	
        	
        	
        	
        	
    
        	
        	
        	String word="sanjay sanjay";
               word=word.replace(" ", "");
        	int plus=0;
        	
        	char a[]=word.toCharArray();
        	HashMap<Character,Integer>map=new HashMap<Character,Integer>();
              for(int i=0;i<a.length;i++) {
            	  plus=0;
            	 
            	  for(int j=0;j<a.length;j++) {
            		  if(a[i]==a[j]) {
            			  
            		  plus++;
            	  }
            	  }
            		map.put(a[i],plus);
              }
              System.out.println();
        System.out.println(map);
        	
        	
        	
        	
        	 int st[]= {1,2,4};
        			 
        	
        		System.out.println(st.length);
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
	}

	

}
