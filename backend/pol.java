package backend;

//polymorghism
class bike{
	public void bikemodel() {
	System.out.println("bike model");
    }
}
class ktm extends bike{
	public void bikemodel() {
		System.out.println("ktm sound");
	}
}

class fz extends bike{
	public void bikemodel() {
	System.out.println("fz sound");
	}
}
class hero extends bike{
	public void bikemodel() {
	System.out.println("hero sound");
	}
}
class xl extends bike{
	public void bikemodel() {
		System.out.println("xl sound");
	}
}
public class pol {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 bike k=new ktm();
         bike f=new fz();
         bike h=new hero();
         bike x=new xl();
         f.bikemodel();
         k.bikemodel();
         h.bikemodel();
         x.bikemodel();
         
         
         
  
	}
}
