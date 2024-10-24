package Test;


public class Constructor {
	
	 int age;
	 int mark;
	 String name;
	 String subject;
	 double sum;

public Constructor() {};     // default constructor


public Constructor( int a,String n) {
	this.age=a;
	this.name=n;
}
 public Constructor(int age, int mark, String name, String subject, double sum) {
		
		this.age = age;       //parameter constructor
		this.mark = mark;
		this.name = name;
		this.subject = subject;
		this.sum = sum;
	}
 
 
 public Constructor( Constructor org) {
	 this.age=org.age;         //copy constructor
	 this.name=org.name;
 }
 
 
 void Constructor( int n,String sa) {  // method Constructor 
	 
	 System.out.println(n+sa);
 }
 
 
public static void main(String[] args) {
	     
	 Constructor con1= new Constructor(); 			// default constructor

	 Constructor con2= new Constructor(55,"lee");
	 Constructor con3= new Constructor(con2);     // copy parameter constructor
    Constructor con= new Constructor(10,500,"sanjay","tamil",20);//parameter constructor
  
        System.out.println(con.age); 		//parameter constructor
        System.out.println(con.mark);		//parameter constructor
        System.out.println(con.name);       //parameter constructor
        System.out.println(con.subject);	//parameter constructor
 
        
       System.out.println(con2.age+":"+con2.name);
       
       System.out.println(con3.age+":"+con3.name);  //parameter constructor
       
        
        Constructor conme=new Constructor(); // method Constructor
        
        conme.Constructor(46, "arthi");// method calling constructor
    
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
       
 } 
}
