package another;

public class Pat {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String sa="bubble";
		int count =0;
		char as='b';
		 for(int i=0;i<sa.length();i++) {
			 if(sa.charAt(i)==as) {
				 count++;
			 }
		 }
			 System.out.println("b="+count);

			 
			 
			 
			 int[] ev= {22,33,11,44};
			 
			 int sum=0;
			 
			 for(int i=0;i<ev.length;i++) {
				// System.out.println(ev[i]);
				 if(ev[i]%2==0) {
					 sum+=ev[i];
					// System.out.println(ev[i]);
				 }
			 }
		
			System.out.println(sum);
			System.out.println();
			 
			 
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) { 
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			
			System.out.println();
			
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("  ");
				}
				for(int j=i;j<=5;j++){
					System.out.print("* ");
				} 	
				System.out.println();
			}
			
			System.out.println();
			for(int i=1;i<=5;i++) {
				for(int j=i;j<=5;j++) {
					System.out.print("* ");
				}
				System.err.println();
			}
			
			System.out.println(); 
			
			for(int i=1;i<=5;i++) {
				for(int j=i;j<=5;j++) {
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("c ");
				}
				System.out.println();
				
			}
			
			System.out.println("-----------------------------");
 
			for(int i=0;i<10;i++) {
				System.out.println("sanjay");
			}
			
			System.out.println("---------------------------------------");
			
			int x=90;
			int y=70;
			
			
			x=x^y;
			y=x^y;
			x=x^y;
			System.out.println(x);
			System.out.println(y);
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}



