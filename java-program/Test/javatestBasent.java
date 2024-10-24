package Test;

import java.time.LocalDate;



import java.time.LocalDateTime;
class sanj{
	public void don() {
		
	for(int i=1;i>=100;i++) {
		System.out.println("sankjay");
	}
}
}
public class javatestBasent {

	    public static boolean sa(int[] nums) {
	        int max = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (i > max) {
	                return false; 
	            }
	            max = Math.max(max, i + nums[i]);
	        }
	        
	        return true; 
	        
	    }
	    
	  public static boolean velid(String ng) {
	
		  
	        for(int i=0;i<ng.length();i++) {
//	        	char c=ng.charAt(i);
	        	
	        	if(ng.contains("@") && ng.contains(".com")){
	        		return true;
	        	}
	        }
			return false;
	  }

 public static void main(String[] args) {
	        int[] nums = {3, 2, 1, 1, 4};
	        System.out.println(sa(nums)); 
	        
	 System.out.println("-----------------------------------------------------------");
	 
	 sanj sa=new sanj();
	 sa.don();
	       
	   
	        
	        String ng="sanjay@@gmail.com";
	        System.out.println(velid(ng));
	       
	 
	    	for(int i=1;i>=100;i++) {
	    		System.out.println("sankjay");
	    	}   
	        
	    }
	}



