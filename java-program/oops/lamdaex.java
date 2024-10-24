
package oops;


@FunctionalInterface
interface ab{
	void task(int a,String s);
    //	void task();
  default  void task2() {
	  System.out.println("hi");
  }
  static void task3() {
	  System.out.println("hii ythw wwbddasd");
  }
}

public class lamdaex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ab a=()->{
//			System.out.println("hii this a lambda expression");
//		};
		
		
		
		ab a=(aa,s)->{
			System.out.println(aa+s);
		};
		
		a.task(22, "sanjay");
		
		
	}

}
