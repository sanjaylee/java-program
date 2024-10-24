package another;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------------first letter repeat--------------------");
		String op="sanjay";
		char ch=op.charAt(0);
		
		for(int i=0;i<op.length();i++) {
			
			if(ch==op.charAt(i)) {
				System.out.println(ch);
				break;
			}
		}
		
		System.out.println("------------------- moblie number validation----------------------");
		
		String moblie ="9025727757";
		
		
	Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}$");
		Matcher m=p.matcher(moblie);
		if(m.find()) {
			System.out.println(m.group()+" is valid moblie number");
		}else {
			System.out.println(moblie+"is not valid");
		}
		
	
        System.out.println("-----------------------------email validation---------------------------");     
		
		String email="sanjay000@gmail.com";
		
		Pattern pa=Pattern.compile("^[\\w\\d.-]+@[\\w.-]+\\.[A-Za-z]{2,}$");
		Matcher ma=pa.matcher(email);
		if(ma.find()) {
			System.out.println(ma.group()+" email is valid");
		}else {
			System.out.println(email+" not valid");
		}
		
		
		System.out.println("--------------------jz techonolgies email validation----------------------");
		
//	  Scanner sc=new Scanner(System.in);
//	  System.out.println("enter the array size");
//		int size=sc.nextInt();
//       String[] mail=new String[size];	
//        
//       for(int i=0;i<mail.length;i++) {
//    	   System.out.println("enter the email");
//    	   mail[i]=sc.next();
//       }
//      String str="";
//       for(int i=0;i<mail.length;i++) {
//    	   for(int j=i+1;j<mail.length;j++) {
//    		   if(mail[i].compareToIgnoreCase(mail[j])>0) {
//    			   str=mail[i];
//    			   mail[i]=mail[j];
//    			   mail[j]=str;
//    		   }
//    	   }
//       }
//      
//		for(int i=0;i<mail.length;i++) {
//			String temp=mail[i];
//			if(temp.contains("@")&&temp.contains(".com")) {
//				
//				System.out.println(temp);
//				
//			}
//		}
//		

		System.out.println("---------------------------instgaram program-----------------------");
		
		// input="abc";
		//output="abcd";
		
		
		
		String s="sanjay";
		String s2="sanjaylee";
		
		int[] fr=new int[26];
		
		for(int i=0;i<s.length();i++) {
			fr[s.charAt(i)-'a']++;
		}
      
		for(int i=0;i<s2.length();i++) {
			fr[s2.charAt(i)-'a']--;
		}
		
		for(int i=0;i<26;i++) {
			if(fr[i]!=0) {
			System.out.println(	(char)(i+97));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
