package another;

import java.io.BufferedReader;
import java.util.Arrays;



public class testsathish {
	
	
	
	public static void main(String[] args) {	

		System.out.println("---------- remove element  value in array------------- ");
     int[] arr= {0,1,2,3,4,5};
     int remove=4;
     
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]==remove) {
    		
    		for(int j=i;j<arr.length-1;j++) {
    			arr[j]=arr[j+1];
    		} 
    		break;
    	}
    }
    
    
    for(int j=0;j<arr.length-1;j++) {
		System.out.println(arr[j]);
	}
    
 System.out.println(" ----------------remove element value in arra------------------- ");
    
    int[] array= {0,1,2,3,4,5,6,7};
    int[]arraynew=new int[array.length-1];
    
    int rem=5;
     for(int i=0,k=0;i<array.length;i++) {
    	 if(array[i]!=rem) {
    		 arraynew[k]=array[i];
    		k++;
    	 }
     }
    
   
    System.out.println(Arrays.toString(arraynew));
   
    
    
      System.out.println("  ------------------remove element index in array --------------------");
    int [] copy= {1,2,3,4,5,6,4,7};
    
    int de=5;
    for(int i=de;i<copy.length-1;i++) {
    	copy[i]=copy[i+1];
    }
    System.out.print(Arrays.toString(copy));
    System.out.println();
    for(int j=0;j<copy.length-1;j++) {
		System.out.print(copy[j]+",");
	}
    
    System.out.println("---------------------------------------------------------------------");
      String sanjay="sanjay is very very bad boy";
      int can=3;
       
      int count=0;
      String word="";
	   
      for(char s:sanjay.toCharArray()) {
    	  if(s==' ') {
    		  count++;
    	  }
    	  if(count==can) {
    		  break;
    	  }
    		  word=word+s;  
      }
      
      System.out.println(word);
      
      
      
      System.out.println("------------------------------------------------------");
      
    
      
      
      
      
      
      
      
      
	}

}
