package interview;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		// pattern( * )
		System.out.println("-----------patterrn (*)----------");		
		int n=5;//(not insizing )
		
		for(int i=1;i<=n;i++) {		//(i<=5)its also curret
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// pattern number 
		System.out.println("-----------patterrn number----------");	
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=5;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		

		
	//pattern anthor mathod
		System.out.println("-----------patterrn line----------");	
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	//pattern subtraction
		System.out.println("-----------patterrn subtraction----------");
		
		int rows=5;
		
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=rows;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//pattern methods
		System.out.println("-----------patterrn----------");
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
		}
			System.out.println();
			
		}
		//pattern methods
		System.out.println("-----------patterrn----------");
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("c ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
		}
			System.out.println();
			
		}
		//pattern methods
		System.out.println("-----------patterrn----------");
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
		}
			System.out.println();
			
		}
		
	//print array(ex)
		System.out.println("-----------print array--------");		
		int arr[]= {1,2,4,6,8,0};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	// pattern test
		System.out.println("-----------pattern test--------");	
		
		int d=5;
		
		for(int i=1; i<=d;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=d;j++) {
				System.out.print(" *");
			}
			for(int j=i;j<d;j++) {
				System.out.print(" *");
			}
			
			System.out.println();
			
		}
		for(int z=1;z<=5;z++) {
			for(int y=z;y<=5;y++) {
				System.out.print("  ");
		    }
			for(int j=1;j<=z;j++) {
				System.out.print(" *");
			}
			for(int i=1;i<z;i++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	//pattern buterfuly
		System.out.println("-----------patterrn buterfuly----------");
		
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=i;j<5;j++) {
				System.out.print("  ");
			} 
			for(int j=i;j<5;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	   for(int i=1;i<=5;i++) {
		   for(int j=i;j<=5;j++) {
			   System.out.print("* ");
		   } 
		   for(int j=1;j<i;j++) {
			   System.out.print("  ");
		   }
		   for(int j=1;j<i;j++) {
			   System.out.print("  ");
		   }
		   for(int j=i;j<=5;j++) {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	   

		 // pattern number 
		System.out.println("-----------patterrn number----------");		
			for(int i=1;i<=5;i++) {
				for(int j=i;j<=5;j++) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
			 // pattern number 
			System.out.println("-----------pattern number----------");	
			
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		 // pattern number 
		System.out.println("-----------pattern number count----------");
		int count = 1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		//print pattern even number
		System.out.println("-------pattern number even------");
		for(int i=1,p=0;i<=5;i++,p+=2) {
			for(int j=1;j<=i;j++){
				System.out.print(p+" ");		
			}
			System.out.println();
		}
		//print one row one value anthor row anthor value
		System.out.println("---------odd even  print -----------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print("2 ");
				}else 
					System.out.print("1 ");	
			}
			System.out.println();
		}
	// print pattern 
		System.out.println("-----print number same--------");
		for(int i=1;i<=5;i++) {
			int p=1;
		for(int j=1;j<=i;j++) {
			System.out.print(p++ +" ");
		}
		System.out.println();
		}
	
		//user set the size scanner
		
		System.out.println("------------scanner pattern --------------");
		Scanner sa= new Scanner(System.in);
		System.out.println("Enter the pattern size");
		int as=sa.nextInt();
		for(int i=1;i<=as;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	
System.out.println("--------------------------------------------");
	
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(" *");
	}
	for(int j=i;j<=5;j++) {
		System.out.print(" *");
	}
	System.out.println();
}
	
	
String word="sanjay lee is a nick name";

String words[]=word.split(" ");
	
System.out.println(words);
for(String ee:words) {
	
	
	System.out.print(ee+" ");
}
System.out.println();

for(int i=1,p=0;i<=5;i++,p+=2) {
	
	for(int j=i;j<=5;j++) {
		System.out.print(p+" ");
	    
	}
	
	System.out.println();
}






for(int i=1;i<=5;i++) {		//(i<=5)its also curret
	
	for(int j=1;j<=i*2;j++) {
		System.out.print("m ");
	}
	
	System.out.println();
}





}

	
}