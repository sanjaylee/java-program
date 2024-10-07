package another;


public class Task2 {
	
	int salary;
	String name;
	int age;
	String user;
	
	public Task2() {
			
	}
  public Task2(String s,int w) {
	this.salary=w;
	this.name=s;
}
 
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 obj=new Task2("sanjay",33);
		In sa=new In();
	System.out.println(obj.name);
	System.out.println(obj.salary);
   System.out.println(sa.a);
   
   
   int x;
   for(x=1;x<=10;x++) {
	   System.out.println("sorry");
   }
   
   
   
   int year=2088;
   if((year%4==0 && year%100!=0)||(year%400==0)){
	  System.out.println("is leap year"); 
   }else {
	   System.out.println("is not leap year");
   }
   
   
   
   
   for(int i=1;i<=5;i++) {
	   for(int j=1;j<=i*2;j++) {
		   System.out.print("*");
	   }
	   System.out.println();
   }
   
   
   
   String str="horse";
   
   
String res=str.substring(1, 4);
System.out.println(res);
   
   
   StringBuffer sb=new StringBuffer(str);
   
   sb.deleteCharAt(2);
   sb.deleteCharAt(3);
   sb.replace(0,1, "r");
   System.out.println(sb);
   
	}

}