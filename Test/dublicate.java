package Test;

import java.util.Arrays;

class dd{
	 public static void dubl(int[] n) {

			
			int f=0;
			for(int i=0;i<n.length;i++) {
	           f=0;
	           for(int j=i+1;j<n.length;j++) {
	        	   if(n[i]==n[j]) {
	        		   f=1;
	        	   }
	           }
	           if(f==1)
	        	   continue;
	           System.out.println(n[i]);
			}
			 
			
 
	 }
 }

public class dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int[] n= {1,2,3,4,2,2,2,5,6,7,3,3,5};
//         dd.dubl(n);
		
		
         System.err.println("--------------dublicate count by elementes----------");
         
         String[] n={"sanjay","lee","sanjay","lee","lee","ab"};
         int i,j,fre;
          Arrays.sort(n);
         for(i=0;i<n.length;i++) {
        	 fre=1;
        	 for(j=i+1;j<n.length;j++) {
        		 if(n[i]==n[j]) {
        			 fre++;
        		 }else {
        			 break;
        		 }
        	 }
        	 i=j-1;
        	 if(fre>1) {
        		 System.out.println(n[i]+" count "+fre);
        	 }
         }
   
        System.out.println("----------------------string count-=--------------------------"); 
         
        String input="sanjays";
        int[] count=new int[256];
        
        char[] chara=input.toCharArray();
        
        for(char c:chara) {
        	count[c]++;
        }
        for(int k=0;k<count.length;k++) {
        	if(count[k]>1) {
        		System.out.println((char)k+" "+count[k]);
        	}
        }
         
         
         
         
         
         
         
         
		

	}



}
