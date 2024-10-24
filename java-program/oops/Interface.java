package oops;


interface A{
	int age =44;
	public void show();
	
	public void display();
	 default void sanj() {
		 
	 }
}

class  Aimp implements A{
	
	public void show() {
		System.out.println("in show");
	}
	
	public void display() {
		System.out.println("in display");
	}
}


// multiple inheritance  access to interface example

interface parent1{
	void screen();
}

interface parent2{
	void color();
}

class myClass{
	public void summa() {
		System.out.println("this a summa class");
	}
}


class child extends myClass implements parent1,parent2 {     				//extends no impartan this option is also use
	
	public void screen() {
		System.out.println("thi is a screen");
	}
	
	public void color() {
		System.out.println("this is a color");
	}
	
	public void summa() {
		System.out.println("this a summa class");								// this is not impartan
	}
}



public class Interface {
	
	public static void main(String[] args) {
		
		Aimp obj =new Aimp ();
		obj.display();
		obj.show();
		System.out.println(obj.age);
	System.out.println("-----------------------------------------");	
		child c=new child();
		c.color();
		c.screen();
     	c.summa();
		
	}






	
}
