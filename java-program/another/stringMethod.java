package another;

import java.util.concurrent.ConcurrentSkipListSet;

public class stringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("-----------string captal or small");
		String str="sanjay lee";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		  
		System.out.println("-------------start and end space remove-------------");
		String s="   love you   ";
		System.out.println(s.trim());
		
		System.out.println("-----------------string start char and and character true or false-----------");
		String t="java program";
		System.out.println(t.startsWith("ja"));
		System.out.println(t.endsWith("am"));
		
		System.out.println("---------------string intxe number pring the character------------");
		String p="sanjay";
		System.out.println(p.charAt(0));
		System.out.println(p.charAt(4));
		
		System.out.println("----------------string one word or one char replace---------------");
		String a="java developer sanja";
		System.out.println(a.replace("sanja", "sanjay"));
		
		System.out.println("-------------print first remove and two intex between print----------");
	    String su="sanjay lee";
		System.out.println(su.substring(3));
		System.out.println(su.substring(2, 4));
		
		
		System.out.println("-----------join the two string------------");
	   String c="sanjay";
	   String ca="lee";
	   System.out.println(c.concat(ca));
	   
	   System.out.println("----------print the intex numbet  give the character --------------");
	    String i="hello world";
	 	System.out.println(i.indexOf("o"));
	   
		System.out.println("------------two string equals check-------------");
	    String b="sanjay";
		System.out.println(b.equals(b));
	   
		System.out.println("--------------give the character check -----------------------");
	    String co="sanjaygopal@gmail.com";
		System.out.println(co.contains("@"));
	    
		 
		
		
		
	}

}
