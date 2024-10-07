package interview;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class test {
     
	public int myfun(int num) {
	num=num+num;
		return num;
	}
	
	
	public static void main(String[] args) {
		test obj=new test();
	System.out.println(obj.myfun(13));
	
	
	String s="sanjay sanjay lee";
	
    	String[] p=s.split(" ");
	Set<String> n=new LinkedHashSet<String>();
	
	for(int  i=0;i<p.length;i++) {
		n.add(p[i]);
	}
//	for(String nm:n) {
//		System.out.println(nm);
//	}
	System.out.println(n);
	
	
	
	
	
	
	
	
	
	
	
	
}
}