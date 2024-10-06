package oops;

public class TryCatch {
	
	
	public static void main(String[] args) {
	
		int a=50,b=0;
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException eas){
			System.out.println("error message");
		}
		catch(Exception e){
			System.out.println(" message");
		}
		finally {
			System.out.println("it is a finally statments");
		}
		
		
		
		
		
		
	}

}
