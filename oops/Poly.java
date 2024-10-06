package oops;
class food{
	public void breakfast() {
		System.out.println("break fast");
	}
}
class poori extends food{
	public void breakfast() {
		System.out.println("breakfast poori");
	}	
}
class pongal extends food{
	public void breakfast() {
		System.out.println("breakfast pongal");
	}	
}
class dosa extends food{
	public void breakfast() {
		System.out.println("breakfast dosa");
	}	
}

public class Poly {
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Poly pol= new Poly();
	

	 //polymorphism--------------------------------------
	 food pi=new poori();
	 food po=new pongal();
	 food dsa=new dosa(); 
	 pi.breakfast();
	po.breakfast();
	dsa.breakfast();
	
	
	
	
	//encapsulation---------------------------------------
			Enc en=new Enc();
		 en.setAccNo(12344555);
		 System.out.println(en.getAccNo());
		 
		 en.setAccName("sanjay");
		 System.out.println(en.getAccName());
		 
	}

}
