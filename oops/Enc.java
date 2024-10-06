package oops;

public class Enc {
	 private int AccNo=29;
	 private String AccName;
	 
	 
	 public int getAccNo() {
		 return AccNo;
	 }
	 public String getAccName() {
		 return AccName;
	 }
	 
	 public void setAccNo(int p) {
		 this.AccNo=p; 
	 }
    public void setAccName(String d) {
    	this.AccName=d;
    }
    
    
    
    
    private int number;
    private String sex;
    
    
    
    
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Enc obj=new Enc();
              obj.setSex("male");
              obj.setNumber(90);
              System.out.println(obj.getSex());
              System.out.println(obj.getNumber());
             
	}

}
