package interview;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // reveser the sssnumber       
		int num=11132003;
		
		int rev = 0;
		
		while(num!=0){
			rev=rev*10 + num%10;
			num=num/10;
			
		}
		System.out.println(rev); 
		
		System.out.println("------------------------");
// reverse the number paliyndrome
		
		int orgnum=num;
		
		if(orgnum==rev) {
			
			System.out.println(rev+("is a paliyndrome"));
		}else {
			System.out.println(rev+("is not paliyndrome"));
		}
		System.out.println("------------------------");
	// count the number of digit
		
		int s=123456;
		 int count=0;
		 while(s>0) {
			 s=s/10;
			 count++; 
			
		 }
		 System.out.println("number of digit  "+count);
		 System.out.println("------------------------");
	//swap two num with 3 rd variable
		 
		 int a=12;
		 int b=23;
		 System.out.println(a);
		 System.out.println(b);
		 int temp=a;
		  a=b;
		  b=temp;
		 
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("------------------------");	

   System.out.println("--------------array reverse number-------------");
   int h[]= {1,2,3,4,5,6,7,8,9};
	int d;
	 for(int i=h.length-1;i>=0;i--) {
		 System.out.print(h[i]+", ");
		 
	 }
		 
		 System.out.println();
		 System.out.println("------------find the positive or nagative number-------------");	
		 
	 Scanner n =new Scanner(System.in);
	 System.out.println("enter the number");
	 int m=n.nextInt();
	 if(m>0) {
		 System.out.println(m+"  is the positive number");
	 }else {
		 System.out.println(m+"  is the nagative number");
	 }
	 
	 

	 
	 
  Scanner k= new Scanner(System.in);
   System.out.println("enter the number is square");
   int a1=k.nextInt();
   
   for(int i=0;i<a1;i++) {
	   if(i*i==a1) {
		   System.out.println(a1+"is the square");
	   }
   }
	 
	Scanner w=new Scanner(System.in);
	System.out.println("enter the number ");
	int number=w.nextInt();
	
	if(isperfect(number)) {
		System.out.println(number+" is a perfect square.");
	}else {
		System.out.println(number+" is not a perfect square.");
	}
	 
	}	 
	 public static boolean isperfect(int number) {
		 for(int i=1;i*i<=number;i++) {
			 if(i*i==number) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}


	


