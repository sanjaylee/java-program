package newprogram;

import java.util.Scanner;

public class lcm_hcf {
	
	 static int lcmth(int a,int b,int c) {
  	   int max=Math.max(a,Math.max(a, b));
  	   int lcm=max;
  	   while(true) {
  		   if(lcm %a==0 && lcm%b==0 &&lcm%c==0) {
  			   return lcm;
  		   }
  		   lcm +=max;
  	   }
     }
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value");
		int a=sc.nextInt();
		
		System.out.println("enter the second value");
		int b=sc.nextInt();
		
		int lcm=(a>b)?a:b;
		while(true) {
			if(lcm % a == 0 && lcm % b ==0 ) {
				System.out.println("LCM = "+ lcm);
		        break;
			}
			++lcm;
		}
		int hcf=a*b/lcm;
		System.out.println("HCF = "+hcf);
		
		System.out.println("========================second ways ==========================");
		
		int temp=0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				temp=i;
			}
		}
		
		System.out.println("HCF of + a + b  ="+temp);   // change the lcm and hcf  for first program
		
		int hcf2=a*b/temp;
		System.out.println("LCM of + a + b  ="+hcf2);
		
		System.out.println("========================three number Lcm============================================");
		System.out.println("enter the third value");
		int c=sc.nextInt();
	
		System.out.println(lcm_hcf.lcmth(a, b, c));
		
		
		
		
		
		
		
		
		
		
		
	
		

}
}
