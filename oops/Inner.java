package oops;
class first{
	String sa="asdfgh";
	
	class second{
		float lo=32;
	}
}

public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		first fi=new first();
		first.second nd=fi.new second();
		System.out.println(fi.sa);
		System.out.println(nd.lo);
	}

}
