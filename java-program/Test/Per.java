package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Per{
	
	
	public static void main(String[] args) {
		
		
		String str="sanjay";
		char[] ch=str.toCharArray();
		char temp = 0;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
				 temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				
			}
		}
		}
		
	  for(int i=0;i<ch.length;i++) {
		  System.out.print(ch[i]);
	  }
		
		
	  System.out.println();
		int number =10;
		for(int i=1;i<=2;i++) {
			System.out.println(number+" *"+i+" ="+number*i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
		
	
	String pa="sanjay";
	
	
	for(int i=0;i<pa.length();i++) {
		for(int j=i;j<5;j++) {
			System.out.print(pa.charAt(i));
			
		}
		System.out.println();
	}
	
   int num =123456;
    

	
      String[] ss={"sanjay","sanjay","lee","arthi","sanjayarthi"};
      String aa="sanjaylee";
      char[] ca=aa.toCharArray();
      
      int[] arr= {1,2,1,29,8,7,5,4,3,3};
	Map <String,Integer> obj=new HashMap<String,Integer>();
	for(String i:ss) {
//		if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u') {
		obj.put(i,obj.getOrDefault(i, 0)+1);
//	}
	}
	System.out.println(obj);
	
	
	
		
	
	
	
	
	
	
	
	
	}

}
