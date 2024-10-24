package oops;



class student {
	public String k="burce lee";
	public int num=55;
	 
	public void school() {
		System.out.println("student mark list");
	}                                               //single inheritance
}
class teacher extends student {
	public String Name="teacher";
	 public void staff() {
		 System.out.println("this is a staff");
	 }
}
 
//mult-level inheritance

class grandfather {
	public void gfather() {
		System.out.println("i your grand father");
	}
}
class perant extends grandfather{
	public void perant() {
		System.out.println(" i am a perant");  // multiple inheritance
	}
}

class child1 extends perant{
	public void child() {
		System.out.println("i am child");
	}
}

//hierarchical inheritance

class students{
	public void student() {
		System.out.println("i am students");
	}
}

class arts extends students{
	public void artsStudents() {
		System.out.println("i am a arts students"); //  //hierarchical inheritance
	}
}
 class eng extends students{
	 public void engStudents() {
		 System.out.println("i am a eng students");
	 }
 }


public class Inh {
	

	public static void main(String[] args) {
	
		
		// single inheritance
       teacher gk= new teacher();
           gk.school();
        
       // multiple inheritance
           child1 ch=new child1();
           ch.child();
           ch.gfather();
           ch.perant();
           
        ////hierarchical inheritance
           
          arts ar=new arts();
          eng en=new eng();
          
          ar.student();
          ar.artsStudents();
          en.engStudents();
          en.student();
           
          
	}

}
