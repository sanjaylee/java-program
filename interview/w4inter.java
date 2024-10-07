package interview;

import java.util.Scanner;

public class w4inter {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t=new Scanner(System.in);
		System.out.println("enter the decimal number");
		int tt=t.nextInt();
		
		String bin=Integer.toBinaryString(tt);
		System.out.println(bin);
		
		String oct=Integer.toOctalString(tt);
		System.out.println(oct);
		
		String hex=Integer.toHexString(tt);
		System.out.println(hex);
		System.out.println("-------------------------------------");
		
		int l[]= {23,7,45,9,23,88,2,86};
		 
		int temp = 0;
		for(int i=0;i<l.length;i++) {
			for(int j=0;j<l.length;j++) {
				if(l[i]<l[j]) {
					temp=l[i];
					l[i]=l[j];
					l[j]=temp;
				}
			}
		}
		System.out.println(l[l.length-1]);
		System.out.println(l[0]);
		for(int i=0;i<l.length;i++) {
			System.out.print(l[i]+", ");
		}
		System.out.println();
		

		
	System.out.println("-----------------matrix rotate clock wise----------------");
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row size");
	int m=sc.nextInt();
	System.out.println("enter the col size");
	int n=sc.nextInt();
	
	int a[][]=new int[m][n];
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.print("enter the package["+i+"]["+j+"]");
			a[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("matrix is.......");
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
		
		
		
		
		
System.out.println("----------------------patten -----------");
		Scanner sa=new Scanner(System.in);
		System.out.println("enter the patten size");
		
		int as=sa.nextInt();
		for(int i=as;i>=1;i--) {
			for(int j=i;j>=1;j--) {
	      		System.out.print(j+" ");	
			}
			System.out.println();
		}
		
		
		
		System.out.println("-------------finbonacci series--------------------------");
		
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter the fibonacci seriess number");
	int n1=s.nextInt();
	
		int first=0,second=1;
		System.out.println(n1);
		
		for(int i=0;i<n1;i++) {
			System.out.print(first+", ");
			
			int next=first+second;
			first=second;
			second=next;
		}
		
		
		
		System.out.println();
		System.out.println("-------------------pangram--------");
		
		Scanner q=new Scanner(System.in);
		System.out.println("enter the sentance");
		String ss=q.nextLine();
		
		ss=ss.replaceAll(" ", "").toLowerCase();
		
		String aa="";
		
		for(char i='a';i<='z';i++) {
			if(ss.indexOf(i)!=-1){
				aa=aa+i;
			}
		}
		
		if(aa.length()==26) {
			System.out.println("pangram");
		}else {
			System.out.println("is not pangram");
		}
		
		
		Scanner dd=new Scanner(System.in);
		System.out.println("enter the date [YYYY-MM-DD");
		String d=dd.nextLine();
		String[] c=d.split("-");
		
		switch(c[1]) {
		case "1":
		   System.out.println("jan");
		   break;
		case "2":
			   System.out.println("feb");
			   break;
		case "3":
			   System.out.println("march");
			   break;
		case "4":
			   System.out.println("aprile");
			   break;
		case "5":
			   System.out.println("may");
			   break;
	   default:
		   System.out.println("in valid date");
		}
		
		
		
			Scanner mm=new Scanner (System.in);
			System.out.println("enter the array size");

      int size=mm.nextInt();
      int[] array=new int[size];
		
      for(int i=0;i<array.length;i++) {
    	  System.out.println("enter the element");
    	  array[i]=mm.nextInt();
      }
      
      
      System.out.println("in the array");
      for(int i=0;i<array.length;i++) {
    	 
    	  System.out.print(array[i]+", ");
      }
      
      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
