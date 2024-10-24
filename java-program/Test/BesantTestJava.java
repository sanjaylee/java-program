package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


class sanjay extends Thread{
	
	 public void run() {
			int number=10;
		
		for(int i=1;i<=10;i++) {

			System.out.println("10 *"+i+"= "+number*i);
			try{Thread.sleep(500);}catch(Exception e){};
				
			}
		}
	
	
public class BesantTestJava {

	
	public static void main(String[] args) {
		
		
		
		
		HashMap<String,String> map=new HashMap<>();
		Scanner ma= new Scanner(System.in);
		System.out.println("enter the statin cap");
		String sta=ma.nextLine();
		map.put("TN", "CHN");
		map.put("KL", "TVM");
		map.put("KA", "BLR");
		
		if(map.containsKey(sta)) {
			String st=map.get(sta);
			System.out.println(st);
		}else {
			System.out.println("not valid");
		
		
		
		}
	   
		System.out.println("----------------program 1-------------------");
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username ");
		String user=sc.nextLine();

		System.out.println("Enter the passsword");
		String pass=sc.nextLine();
				System.out.println("enter the courrect username");
		String u=sc.nextLine();
		System.out.println("enter the courrect password");
		String p=sc.nextLine();
		
		
		if(user.equals(u)&&pass.equals(p)){
			System.out.println("Login successfully");
		}else {
			System.out.println("Login failed");
		}
		
		
		System.out.println("----------------program 2----------------------");
		
		
		Scanner s=new Scanner (System.in);
		System.out.println("enther the string");
		String word=s.nextLine();
		int ch=0;
		int space=0;
		  for(int i=0;i<word.length();i++) {
        	  char aa=word.charAt(i);
        	  if(aa>='a'&&aa<='z') {
        		  ch++;
        		  
			}else {
				space++;
			}
		}
		
		
		System.out.println(ch);
		System.out.println(space);
		
		System.out.println("------------------program 3-----------------------------");
		
		ArrayList list=new ArrayList();
		
		list.add("sanjay");
		list.add("lee");
		list.add("raja");
		list.add("vishnu");
		list.add("arun");
		list.add("bala");
		list.add("jon");
		list.add("kamal");
		list.add("pugal");
		list.add("ram");
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		System.out.println("-------------------------------program 4-------------");
		
		
		Scanner c=new Scanner(System.in);
		System.out.println("enter the caps");
		String w=c.nextLine();
		switch(w){
		 case "TN":
		   System.out.println("CHN");
		   break;
		 case "KL":
			   System.out.println("TVM");
			   break;
		 case "KA":
			   System.out.println("BLR");
			   break;
		 default:
			   System.out.println("Not Valid");
			   break;
		}
		
		
		System.out.println("----------------------------program 5--------------------");
		
	       sanjay a=new sanjay();
	       
	         a.start();	
		
		
		
		
		
		
		

	}

}
}


