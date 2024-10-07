package interview;

import java.util.Scanner;

public class TestEmail {
	
	public static void main(String[] args) {
	
		System.out.println("------program to print reverse of the string----");
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=sa.nextLine();
		str=str.toLowerCase();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("--------given a number prime or not check-------------");
	
		
		Scanner as=new Scanner (System.in);
		System.out.println("Enter the number");
		
		int num=as.nextInt();
				int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num +"= YES ");
		}else {
			System.out.println(num +"=NO");
		}
		
		System.out.println("----------print reverse of number ----------------");
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n=s.nextInt();
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
		
		
		
		System.out.println("----- find the maximum and minimum--------");
		
		
	
		
		int arr[]= {54,546,548,60};
		
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("maximum = "+max);
		System.out.println("minimum = "+min);
		
		
		
		
		
	}

}
