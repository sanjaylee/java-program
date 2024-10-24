package oops;

class parent implements Runnable{
	public void run() {
		for(int i=0;i<500;i++){
			System.out.println("thread is starts");
//			try{Thread.sleep(5000);}catch(Exception e) {};			
		}
	}	
}
class childs implements Runnable{
	public void run() {
		for(int i=0;i<500;i++) {
		System.out.println("threads is end");
//		try {Thread.sleep(500);}catch(Exception e) {};
	}
  }
}






public class ThreadRunnable {
	public static void main(String[] args) {
		
		parent obj1=new parent();
		childs obj2=new childs();
		
		Thread th=new Thread(obj1);
		Thread th1=new Thread(obj2);
		
		th.start();
		th1.start();
		
	}

}
