package interview;

public class newpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==========================star pattern first row,last row=========================");
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||i==5) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println("------------------------star pattern first col ,last col---------------------------");
	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1||j==5) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	System.out.println("----------------------outer box star pattern--------------------");
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(i==1||i==5||j==1||j==5) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
		
	System.out.println("----------------- plus symbal star pattern------------------");		
	  int n=5;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(j==n/2+1||i==n/2+1) {           // or   (j==3||i==3) 
				System.out.print("# ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
		
System.out.println("------------------------multi symbal-------------------------------");

       for(int i=1;i<=5;i++) {
    	   for(int j=1;j<=5;j++) {
    		   if(i==j||i+j==n+1) {
    			   System.out.print("* ");
    		   }else {
    			   System.out.print("  ");
    		   }
    	   }
    	   
    	   System.out.println();
       }
		
	System.out.println("--------------------  1 pattern-------------------");	
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++) {
			if(j==1||i==5||j==i) {
			System.out.print("# ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
System.out.println("------------------------- 2 pattern------------------------- ");	
 
for(int i=1;i<=5;i++) {
	for(int j=i;j<=5;j++) {
		if(i==1||j==i||j==5) {
		System.out.print("@ ");
    	}else {
			System.out.print("  ");
		}
	}
	System.out.println();
}
	System.out.println("------------------------ 3 pattern-------------------");
	
	
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=5;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<i;j++) {
			if(j==1|i==5) {
			System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}

		for(int j=1;j<=i;j++) {
			if(i==n||i==j) {
			System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
