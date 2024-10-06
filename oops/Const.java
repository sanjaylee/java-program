package oops;


public class Const {
	int a=33;
	int bc=44;
	String user="sanjay";
public  Const() {
		
	}
public Const(int z,int x,String c ) {
	this.a=z;
	this.bc=x;
	this.user=c;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Const obj=new Const();
      
      
      Mod mo=new Mod();
     System.out.println(mo.password);
     
     
     
      System.out.println(obj.a);
      System.out.println(obj.bc);
      System.out.println(obj.user);
	}

}
