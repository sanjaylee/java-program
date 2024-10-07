package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HeightNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find the largest number in array
		System.out.println("------largest number in array----");
             int sa[]= {43,77,55,65,301,91,64,7,2};
             int max=sa[0];
             for(int i=0;i<sa.length;i++) {
            	 if(max<sa[i]) {
            		 max=sa[i];
            		 
            	 }
             }
             
             System.out.println(max);
             
             //print the second lergest element in array
             //print the second smallest element in array
             System.out.println("-----------second height element in array----------------");
             
             int temp,size;
             int lee[]= {44,86,25,82,90,388,466,2,1};
             size=lee.length;
             for(int i=0;i<size;i++) {
            	 for(int j=i+1;j<size;j++) {
            		 if(lee[i]>lee[j]) {
            			 temp=lee[i];
            			 lee[i]=lee[j];
            			 lee[j]=temp;
            		 }
            	 }
             }
             for(int s:lee) {
            	 System.out.print(s+" ");
       
             }
             System.out.println();
             System.out.println("second height number in array  " +lee[size-2]);
             System.out.println("fourth height number in array  " +lee[size-4]);
             //print the second smallest element in array
             System.out.println("-----------second smallest element in array----------------");
             int tem,sizes;
             int leee[]={44,86,25,82,90,388,466,2,1};
//             sizes=leee.length;
             for(int i=0;i<leee.length;i++) {
            	 for(int j=i+1;j<leee.length;j++) {
            		 if(leee[i]<leee[j]) {
            			 tem=leee[i];
            			 leee[i]=leee[j];
            			 leee[j]=tem;
            		 }
            	 }
             }
             for(int ss:leee) {
            	 System.out.print(ss+" ");
       
             }
             System.out.println();
             System.out.println("second smallest number in array  " +leee[leee.length-2]);
             System.out.println("fourth samallest number in array  " +leee[leee.length-4]);
             
          //Find the minimum value
          // find the maxmum value same but if chang(<)   
             
             System.out.println("-----------fint the minimum value in array----------");
             int da[]= {37,9,5,3,88,66555,43};
             int min=da[0];
           
             for(int i=0;i<da.length;i++)
             {
            	 if(min>da[i]) {
            		 min=da[i];
            	 }
             }
             
             System.out.println("minimum value in array  "+min);
    
             
             // array sort methods
             System.out.println("-------------- array sort method---------");
               int bb[]= {66,97,34,6,77};
               Arrays.sort(bb);
             for(int i=0;i<bb.length;i++) {
            	 System.out.println(+bb[i] );
           }
           
             //array reverse method
             System.out.println("------------------reverse method-------");
             
            int sdo[]= {1,2,3,4,5,6,7,8,9,10};
            
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
	}

}
