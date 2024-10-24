package oops;

import java.util.Arrays;
import java.util.Scanner;

class Myexception extends Exception {
	Myexception( String str){
		super(str);
	}
}

class User{
	
	public void excep( int[] arr) throws Myexception {
		
		if(arr.length==0) {
			throw new Myexception("User Default Exception trying");
		}else {
		   int max=arr[0];
		   
		   for(int i=0;i<arr.length;i++) {
			   if(max<arr[i]) {
				   max=arr[i];
			   }
		   }
		   System.out.println(max);
		}
		
		
	}
	
}
public class userException {
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
         User us=new User();
         int[] arr= {};
         try {
			us.excep(arr);
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		
		
	;
		
	}

}
