package streamdouble8;

import java.util.ArrayList;
import java.util.Arrays;

interface methodrefer {
	void display(int a);         //interface 

}

class demo1 {
	  public static void show1(int s) {
		  System.out.println(s+"its a normal method");          // static method example
	  }
}	  
	  
public class demo {
  public void show(int s) {
	  System.out.println(s+"its a normal method");             // instence method example
  }
	
  private int a;
   demo(int b){
	   System.out.println("constuctor"+b);                   // construtor reference
   }
  
  	  
	public static void main(String[] args) {
		
		//demo d=new demo();
		
		
		//constructor type
		methodrefer m3=demo::new;
		m3.display(7000);
		
		//normal method reference
		methodrefer m=(System.out::println);
		m.display(1000);
		
		//   type 1 instance method
		//methodrefer mm=d::show;
	//	mm.display(34);
		
		//type 2 static method
		methodrefer m2=demo1::show1;
		m2.display(90);
		 
		// method reference simple example
		ArrayList<Integer> as=new ArrayList<Integer>();
		as.add(12);
		as.add(22);
		as.add(92);
		as.add(12);
		as.add(102);
		
		
		// its a normal lambda or for each method
		as.forEach(val->System.out.println(val));
		
	System.out.println("method reference -------------------------");
		as.forEach(System.out::println);
		

	
	}
}
