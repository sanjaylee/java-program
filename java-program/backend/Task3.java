package backend;

import java.util.ArrayList;

public class Task3 {

	// check the arrayList contains odd or not

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num=new ArrayList<Integer> ();
		num.add(2);
		num.add(3);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(10);
		System.out.println(num);
	  for(int i:num) {
	   System.out.println(i);
	   
		if(i % 2==0) {
			System.out.println("not odd nuber= "+(i));
		}else {
			System.out.println("odd number= "+(i));
    	}
			
	}

}
}
