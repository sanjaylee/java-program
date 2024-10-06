package oops;

abstract class sanjay{
	
	public void lee() {
		System.out.println("it is mormal  class");
	}
	abstract void ss();
}


class child11 extends sanjay{

	@Override
	void ss() {
		System.out.println("it is abstract method");
	}
	
}

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child11 ch=new child11();
		ch.lee();
		ch.ss();
		
		
		
	}

}
