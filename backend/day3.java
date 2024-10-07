package backend;

public class day3 {
	private int mark;
	String sub;
	float per;
	// another constructor
	public day3() {
	
	}
    //constructor
	public day3(int m,String s,float p) {
		this.mark=m;
		this.sub=s;
		this.per=p;
		
	}
	//encapsulaction
	  public int getmark() {
		  return mark ;
	  }
	
	public void setmark(int m) {
		this.mark=m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         day3 ss=new day3(60,"tamil",80);
         System.out.println(ss.mark);
         System.out.println(ss.sub);
         System.out.println(ss.per);
        
        
         
	}

}
