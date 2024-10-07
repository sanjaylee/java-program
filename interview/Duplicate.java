	package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
    
	
	/// array convert to array List
	String oo[]= {"sanjayy","sanjay"};
	
	List<String> dd=Arrays.asList(oo);
	
	
	public static void main(String[] args) {
	
		Duplicate io=new Duplicate();
		System.out.println(io.oo.length);
		// print the duplicate in the array
		System.out.println("----------------print the duplicate in the array-----------");
		
		int arr[]= {1,2,1,3,4,56,7,2,4,8,};
		int t=0;
		System.out.println("duplicate");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				     t++;	
					System.out.println(arr[j]);
					
				}
			}
		}
		System.out.println(t);
		// remove the duplicate in the array 
		System.out.println("-----------remove the duplicate in the array --------------");
		int arrr[] = {1,1,1,1,2,2,3,56,78,90,0,43,3};
	     int n = arrr.length;
	     Set<Integer> hash_Set = new LinkedHashSet<Integer>();
	       for (int i=0; i<n; i++) {
	           hash_Set.add(arrr[i]);
	       }
	      System.out.println(hash_Set);
	
	System.out.println("---------remove the duplicate in the array another way in for loop----------");
	// remove the duplicate in the array another way for loop
	
	
		Integer ss[]= {1,2,3,4,2,2,3,5,7,8,5};//int allways use
		Integer dub=-1;//int allways use
		
		for(int i=0;i<ss.length;i++) {
			if(ss[i]!=-1) {
				for(int j=i+1;j<ss.length;j++) {
				  if(ss[i]==ss[j]) {
					  ss[j]=dub;
					
				  }
				}
				
				  System.out.print(ss[i]+" ");
			}
		}
		
	// remove the duplicate in the String
		System.out.println();
		System.out.println("---------------print find the duplicate in the String------------");
		int tt=0;
    
		String op="sanjayb n ii";
		op=op.replace(" ", "");
		
		char[] po=op.toCharArray();
		
		
        for(int i=0;i<op.length();i++) {
        	for(int j=i+1;j<op.length();j++) {
        		if(po[i]==po[j]) {
        			System.out.print(po[i]+" ");
        		      tt++;
        			
        			//break;
        		}
        	}
        }
        System.out.println(tt);
		// remove the duplicate character in the String
        System.out.println();
	System.out.println("-------------remove the duplicate charcter in the String---------------");
		
		String jj="tea is very the is nice";
	     String jk=jj.replaceAll(" ", "");
		
		String result="";
		System.out.println(jk);
		
		for(int i=0;i<jk.length();i++) {
			String ch=""+jk.charAt(i);
			if(result.contains(ch)) {
				continue;
			} 
			result+=ch;
		}
		System.out.println(result);
		// remove the duplicate word  in the arrayList
		System.out.println("------------------remove the duplicate word in the  arrayList");
				List<String>srr1=new ArrayList<String>();
		          srr1.add("java");
		          srr1.add("python");
		          srr1.add("c++");
		          srr1.add("java");
		          srr1.add(".net");
		          srr1.add(".net");
		        Set<String>sdd=new LinkedHashSet<String>(srr1);        
		System.out.println(sdd);
		
		
		  // another away for loop
		for(int i=0;i<srr1.size();i++) {
			for(int j=i+1;j<srr1.size();j++) {
				if(srr1.get(i)==srr1.get(j)) {
					srr1.remove(j);
				}
				
			}
		}
		System.out.println(srr1);
	
		
		// remove the duplicate in the arrayList
		System.out.println("------------------remove the duplicate in the  arrayList");
				List<Integer>sr1=new ArrayList<Integer>();
		          sr1.add(10);
		          sr1.add(40);
		          sr1.add(40);
		          sr1.add(30);
		          sr1.add(10);
		          sr1.add(30);
		         
		        Set<Integer>sd=new LinkedHashSet<Integer>(sr1);        
		System.out.println(sd);
		
		
		// for loop another way
		    for(int i=0;i<sr1.size();i++) {
		    	for(int j=i+1;j<sr1.size();j++) {
		    		if(sr1.get(i)==sr1.get(j)) {
		     			
		    			sr1.remove(j);
		    			
		    		}
		    	}
		    }
		
		 
		    System.out.println(sr1);
		
		// remove the duplicate words in the String
		    System.out.println("----------remove the duplicate words in the String-------------");
		    String bb="very very bad boy in the world is a a lee";
		   String [] nn=bb.split(" "); 
		    
		   Set<String> ff=new LinkedHashSet<String>();
		    for(int i=0;i<nn.length;i++) {
		    	ff.add(nn[i]);
		  
		    }for(String bn:ff) {
		    	System.out.print(bn+" ");
		    }
	
		
		
		int hh[]= {44,55,66};
		
	//	List<Integer> oo=Arrays.
	//	Set<Integer> hj=new LinkedHashSet<Integer>();
		   
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
